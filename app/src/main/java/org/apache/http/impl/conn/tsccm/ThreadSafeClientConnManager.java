package org.apache.http.impl.conn.tsccm;

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
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager.class */
public class ThreadSafeClientConnManager implements ClientConnectionManager {
    public final ClientConnectionOperator connOperator;
    public final ConnPerRouteBean connPerRoute;
    public final AbstractConnPool connectionPool;
    private final Log log;
    public final ConnPoolByRoute pool;
    public final SchemeRegistry schemeRegistry;

    public ThreadSafeClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS);
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry, long j10, TimeUnit timeUnit) {
        this(schemeRegistry, j10, timeUnit, new ConnPerRouteBean());
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry, long j10, TimeUnit timeUnit, ConnPerRouteBean connPerRouteBean) {
        Args.notNull(schemeRegistry, "Scheme registry");
        this.log = LogFactory.getLog(getClass());
        this.schemeRegistry = schemeRegistry;
        this.connPerRoute = connPerRouteBean;
        this.connOperator = createConnectionOperator(schemeRegistry);
        ConnPoolByRoute createConnectionPool = createConnectionPool(j10, timeUnit);
        this.pool = createConnectionPool;
        this.connectionPool = createConnectionPool;
    }

    @Deprecated
    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        Args.notNull(schemeRegistry, "Scheme registry");
        this.log = LogFactory.getLog(getClass());
        this.schemeRegistry = schemeRegistry;
        this.connPerRoute = new ConnPerRouteBean();
        this.connOperator = createConnectionOperator(schemeRegistry);
        ConnPoolByRoute connPoolByRoute = (ConnPoolByRoute) createConnectionPool(httpParams);
        this.pool = connPoolByRoute;
        this.connectionPool = connPoolByRoute;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        this.pool.closeExpiredConnections();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j10 + " " + timeUnit);
        }
        this.pool.closeIdleConnections(j10, timeUnit);
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    @Deprecated
    public AbstractConnPool createConnectionPool(HttpParams httpParams) {
        return new ConnPoolByRoute(this.connOperator, httpParams);
    }

    public ConnPoolByRoute createConnectionPool(long j10, TimeUnit timeUnit) {
        return new ConnPoolByRoute(this.connOperator, this.connPerRoute, 20, j10, timeUnit);
    }

    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public int getConnectionsInPool() {
        return this.pool.getConnectionsInPool();
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        return this.pool.getConnectionsInPool(httpRoute);
    }

    public int getDefaultMaxPerRoute() {
        return this.connPerRoute.getDefaultMaxPerRoute();
    }

    public int getMaxForRoute(HttpRoute httpRoute) {
        return this.connPerRoute.getMaxForRoute(httpRoute);
    }

    public int getMaxTotal() {
        return this.pool.getMaxTotalConnections();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j10, TimeUnit timeUnit) {
        Log log;
        Object obj;
        boolean isMarkedReusable;
        ConnPoolByRoute connPoolByRoute;
        Log log2;
        Object obj2;
        Log log3;
        Object obj3;
        Args.check(managedClientConnection instanceof BasicPooledConnAdapter, "Connection class mismatch, connection not obtained from this manager");
        BasicPooledConnAdapter basicPooledConnAdapter = (BasicPooledConnAdapter) managedClientConnection;
        if (basicPooledConnAdapter.getPoolEntry() != null) {
            Asserts.check(basicPooledConnAdapter.getManager() == this, "Connection not obtained from this manager");
        }
        synchronized (basicPooledConnAdapter) {
            BasicPoolEntry basicPoolEntry = (BasicPoolEntry) basicPooledConnAdapter.getPoolEntry();
            if (basicPoolEntry == null) {
                return;
            }
            try {
                try {
                    if (basicPooledConnAdapter.isOpen() && !basicPooledConnAdapter.isMarkedReusable()) {
                        basicPooledConnAdapter.shutdown();
                    }
                    isMarkedReusable = basicPooledConnAdapter.isMarkedReusable();
                    if (this.log.isDebugEnabled()) {
                        if (isMarkedReusable) {
                            log3 = this.log;
                            obj3 = "Released connection is reusable.";
                        } else {
                            log3 = this.log;
                            obj3 = "Released connection is not reusable.";
                        }
                        log3.debug(obj3);
                    }
                    basicPooledConnAdapter.detach();
                    connPoolByRoute = this.pool;
                } catch (Throwable th2) {
                    boolean isMarkedReusable2 = basicPooledConnAdapter.isMarkedReusable();
                    if (this.log.isDebugEnabled()) {
                        if (isMarkedReusable2) {
                            log = this.log;
                            obj = "Released connection is reusable.";
                        } else {
                            log = this.log;
                            obj = "Released connection is not reusable.";
                        }
                        log.debug(obj);
                    }
                    basicPooledConnAdapter.detach();
                    this.pool.freeEntry(basicPoolEntry, isMarkedReusable2, j10, timeUnit);
                    throw th2;
                }
            } catch (IOException e10) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Exception shutting down released connection.", e10);
                }
                isMarkedReusable = basicPooledConnAdapter.isMarkedReusable();
                if (this.log.isDebugEnabled()) {
                    if (isMarkedReusable) {
                        log2 = this.log;
                        obj2 = "Released connection is reusable.";
                    } else {
                        log2 = this.log;
                        obj2 = "Released connection is not reusable.";
                    }
                    log2.debug(obj2);
                }
                basicPooledConnAdapter.detach();
                connPoolByRoute = this.pool;
            }
            connPoolByRoute.freeEntry(basicPoolEntry, isMarkedReusable, j10, timeUnit);
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new ClientConnectionRequest(this, this.pool.requestPoolEntry(httpRoute, obj), httpRoute) { // from class: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.1
            public final ThreadSafeClientConnManager this$0;
            public final PoolEntryRequest val$poolRequest;
            public final HttpRoute val$route;

            {
                this.this$0 = this;
                this.val$poolRequest = r5;
                this.val$route = httpRoute;
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                this.val$poolRequest.abortRequest();
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j10, TimeUnit timeUnit) {
                Args.notNull(this.val$route, "Route");
                if (this.this$0.log.isDebugEnabled()) {
                    this.this$0.log.debug("Get connection: " + this.val$route + ", timeout = " + j10);
                }
                return new BasicPooledConnAdapter(this.this$0, this.val$poolRequest.getPoolEntry(j10, timeUnit));
            }
        };
    }

    public void setDefaultMaxPerRoute(int i10) {
        this.connPerRoute.setDefaultMaxPerRoute(i10);
    }

    public void setMaxForRoute(HttpRoute httpRoute, int i10) {
        this.connPerRoute.setMaxForRoute(httpRoute, i10);
    }

    public void setMaxTotal(int i10) {
        this.pool.setMaxTotalConnections(i10);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.log.debug("Shutting down");
        this.pool.shutdown();
    }
}
