package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/BasicClientConnectionManager.class */
public class BasicClientConnectionManager implements ClientConnectionManager {
    private static final AtomicLong COUNTER = new AtomicLong();
    public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    private ManagedClientConnectionImpl conn;
    private final ClientConnectionOperator connOperator;
    private final Log log;
    private HttpPoolEntry poolEntry;
    private final SchemeRegistry schemeRegistry;
    private volatile boolean shutdown;

    public BasicClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public BasicClientConnectionManager(SchemeRegistry schemeRegistry) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
    }

    private void assertNotShutdown() {
        Asserts.check(!this.shutdown, "Connection manager has been shut down");
    }

    private void shutdownConnection(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.shutdown();
        } catch (IOException e10) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("I/O exception shutting down connection", e10);
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        synchronized (this) {
            assertNotShutdown();
            long currentTimeMillis = System.currentTimeMillis();
            HttpPoolEntry httpPoolEntry = this.poolEntry;
            if (httpPoolEntry != null && httpPoolEntry.isExpired(currentTimeMillis)) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        synchronized (this) {
            assertNotShutdown();
            long millis = timeUnit.toMillis(j10);
            long j11 = millis;
            if (millis < 0) {
                j11 = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HttpPoolEntry httpPoolEntry = this.poolEntry;
            if (httpPoolEntry != null && httpPoolEntry.getUpdated() <= currentTimeMillis - j11) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
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
        ManagedClientConnectionImpl managedClientConnectionImpl;
        Args.notNull(httpRoute, "Route");
        synchronized (this) {
            assertNotShutdown();
            if (this.log.isDebugEnabled()) {
                this.log.debug("Get connection for route " + httpRoute);
            }
            Asserts.check(this.conn == null, MISUSE_MESSAGE);
            HttpPoolEntry httpPoolEntry = this.poolEntry;
            if (httpPoolEntry != null && !httpPoolEntry.getPlannedRoute().equals(httpRoute)) {
                this.poolEntry.close();
                this.poolEntry = null;
            }
            if (this.poolEntry == null) {
                this.poolEntry = new HttpPoolEntry(this.log, Long.toString(COUNTER.getAndIncrement()), httpRoute, this.connOperator.createConnection(), 0L, TimeUnit.MILLISECONDS);
            }
            if (this.poolEntry.isExpired(System.currentTimeMillis())) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
            managedClientConnectionImpl = new ManagedClientConnectionImpl(this, this.connOperator, this.poolEntry);
            this.conn = managedClientConnectionImpl;
        }
        return managedClientConnectionImpl;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j10, TimeUnit timeUnit) {
        String str;
        Args.check(managedClientConnection instanceof ManagedClientConnectionImpl, "Connection class mismatch, connection not obtained from this manager");
        ManagedClientConnectionImpl managedClientConnectionImpl = (ManagedClientConnectionImpl) managedClientConnection;
        synchronized (managedClientConnectionImpl) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("Releasing connection " + managedClientConnection);
            }
            if (managedClientConnectionImpl.getPoolEntry() == null) {
                return;
            }
            Asserts.check(managedClientConnectionImpl.getManager() == this, "Connection not obtained from this manager");
            synchronized (this) {
                if (this.shutdown) {
                    shutdownConnection(managedClientConnectionImpl);
                    return;
                }
                try {
                    if (managedClientConnectionImpl.isOpen() && !managedClientConnectionImpl.isMarkedReusable()) {
                        shutdownConnection(managedClientConnectionImpl);
                    }
                    if (managedClientConnectionImpl.isMarkedReusable()) {
                        this.poolEntry.updateExpiry(j10, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                        if (this.log.isDebugEnabled()) {
                            if (j10 > 0) {
                                str = "for " + j10 + " " + timeUnit;
                            } else {
                                str = "indefinitely";
                            }
                            this.log.debug("Connection can be kept alive " + str);
                        }
                    }
                } finally {
                    managedClientConnectionImpl.detach();
                    this.conn = null;
                    if (this.poolEntry.isClosed()) {
                        this.poolEntry = null;
                    }
                }
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new ClientConnectionRequest(this, httpRoute, obj) { // from class: org.apache.http.impl.conn.BasicClientConnectionManager.1
            public final BasicClientConnectionManager this$0;
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

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        synchronized (this) {
            this.shutdown = true;
            try {
                HttpPoolEntry httpPoolEntry = this.poolEntry;
                if (httpPoolEntry != null) {
                    httpPoolEntry.close();
                }
            } finally {
                this.poolEntry = null;
                this.conn = null;
            }
        }
    }
}
