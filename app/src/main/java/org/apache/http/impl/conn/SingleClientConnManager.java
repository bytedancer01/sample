package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/SingleClientConnManager.class */
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    public final boolean alwaysShutDown;
    public final ClientConnectionOperator connOperator;
    public volatile long connectionExpiresTime;
    public volatile boolean isShutDown;
    public volatile long lastReleaseTime;
    private final Log log;
    public volatile ConnAdapter managedConn;
    public final SchemeRegistry schemeRegistry;
    public volatile PoolEntry uniquePoolEntry;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/SingleClientConnManager$ConnAdapter.class */
    public class ConnAdapter extends AbstractPooledConnAdapter {
        public final SingleClientConnManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnAdapter(SingleClientConnManager singleClientConnManager, PoolEntry poolEntry, HttpRoute httpRoute) {
            super(singleClientConnManager, poolEntry);
            this.this$0 = singleClientConnManager;
            markReusable();
            poolEntry.route = httpRoute;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/SingleClientConnManager$PoolEntry.class */
    public class PoolEntry extends AbstractPoolEntry {
        public final SingleClientConnManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PoolEntry(SingleClientConnManager singleClientConnManager) {
            super(singleClientConnManager.connOperator, null);
            this.this$0 = singleClientConnManager;
        }

        public void close() {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        public void shutdown() {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    public SingleClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public SingleClientConnManager(SchemeRegistry schemeRegistry) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
        this.uniquePoolEntry = new PoolEntry(this);
        this.managedConn = null;
        this.lastReleaseTime = -1L;
        this.alwaysShutDown = false;
        this.isShutDown = false;
    }

    @Deprecated
    public SingleClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        this(schemeRegistry);
    }

    public final void assertStillUp() {
        Asserts.check(!this.isShutDown, "Manager is shut down");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        if (System.currentTimeMillis() >= this.connectionExpiresTime) {
            closeIdleConnections(0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        assertStillUp();
        Args.notNull(timeUnit, "Time unit");
        synchronized (this) {
            if (this.managedConn == null && this.uniquePoolEntry.connection.isOpen()) {
                if (this.lastReleaseTime <= System.currentTimeMillis() - timeUnit.toMillis(j10)) {
                    try {
                        this.uniquePoolEntry.close();
                    } catch (IOException e10) {
                        this.log.debug("Problem closing idle connection.", e10);
                    }
                }
            }
        }
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public ManagedClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        boolean z10;
        ConnAdapter connAdapter;
        Args.notNull(httpRoute, "Route");
        assertStillUp();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Get connection for route " + httpRoute);
        }
        synchronized (this) {
            boolean z11 = false;
            Asserts.check(this.managedConn == null, MISUSE_MESSAGE);
            closeExpiredConnections();
            if (this.uniquePoolEntry.connection.isOpen()) {
                RouteTracker routeTracker = this.uniquePoolEntry.tracker;
                z11 = routeTracker == null || !routeTracker.toRoute().equals(httpRoute);
                z10 = false;
            } else {
                z10 = true;
            }
            if (z11) {
                try {
                    this.uniquePoolEntry.shutdown();
                    z10 = true;
                } catch (IOException e10) {
                    this.log.debug("Problem shutting down connection.", e10);
                    z10 = true;
                }
            }
            if (z10) {
                this.uniquePoolEntry = new PoolEntry(this);
            }
            this.managedConn = new ConnAdapter(this, this.uniquePoolEntry, httpRoute);
            connAdapter = this.managedConn;
        }
        return connAdapter;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j10, TimeUnit timeUnit) {
        Args.check(managedClientConnection instanceof ConnAdapter, "Connection class mismatch, connection not obtained from this manager");
        assertStillUp();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection " + managedClientConnection);
        }
        ConnAdapter connAdapter = (ConnAdapter) managedClientConnection;
        synchronized (connAdapter) {
            if (connAdapter.poolEntry == null) {
                return;
            }
            try {
                Asserts.check(connAdapter.getManager() == this, "Connection not obtained from this manager");
                try {
                    if (connAdapter.isOpen() && (this.alwaysShutDown || !connAdapter.isMarkedReusable())) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Released connection open but not reusable.");
                        }
                        connAdapter.shutdown();
                    }
                    connAdapter.detach();
                    synchronized (this) {
                        this.managedConn = null;
                        this.lastReleaseTime = System.currentTimeMillis();
                        if (j10 > 0) {
                            this.connectionExpiresTime = timeUnit.toMillis(j10) + this.lastReleaseTime;
                        } else {
                            this.connectionExpiresTime = Long.MAX_VALUE;
                        }
                    }
                } catch (IOException e10) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Exception shutting down released connection.", e10);
                    }
                    connAdapter.detach();
                    synchronized (this) {
                        this.managedConn = null;
                        this.lastReleaseTime = System.currentTimeMillis();
                        if (j10 > 0) {
                            this.connectionExpiresTime = timeUnit.toMillis(j10) + this.lastReleaseTime;
                        } else {
                            this.connectionExpiresTime = Long.MAX_VALUE;
                        }
                    }
                }
            } catch (Throwable th2) {
                connAdapter.detach();
                synchronized (this) {
                    this.managedConn = null;
                    this.lastReleaseTime = System.currentTimeMillis();
                    if (j10 > 0) {
                        this.connectionExpiresTime = timeUnit.toMillis(j10) + this.lastReleaseTime;
                    } else {
                        this.connectionExpiresTime = Long.MAX_VALUE;
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new ClientConnectionRequest(this, httpRoute, obj) { // from class: org.apache.http.impl.conn.SingleClientConnManager.1
            public final SingleClientConnManager this$0;
            public final HttpRoute val$route;
            public final Object val$state;

            {
                this.this$0 = this;
                this.val$route = httpRoute;
                this.val$state = obj;
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j10, TimeUnit timeUnit) {
                return this.this$0.getConnection(this.val$route, this.val$state);
            }
        };
    }

    public void revokeConnection() {
        ConnAdapter connAdapter = this.managedConn;
        if (connAdapter == null) {
            return;
        }
        connAdapter.detach();
        synchronized (this) {
            try {
                this.uniquePoolEntry.shutdown();
            } catch (IOException e10) {
                this.log.debug("Problem while shutting down connection.", e10);
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.isShutDown = true;
        synchronized (this) {
            try {
                try {
                    if (this.uniquePoolEntry != null) {
                        this.uniquePoolEntry.shutdown();
                    }
                    this.uniquePoolEntry = null;
                } catch (Throwable th2) {
                    this.uniquePoolEntry = null;
                    this.managedConn = null;
                    throw th2;
                }
            } catch (IOException e10) {
                this.log.debug("Problem while shutting down manager.", e10);
                this.uniquePoolEntry = null;
            }
            this.managedConn = null;
        }
    }
}
