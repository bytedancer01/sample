package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/PoolingClientConnectionManager.class */
public class PoolingClientConnectionManager implements ClientConnectionManager, ConnPoolControl<HttpRoute> {
    private final DnsResolver dnsResolver;
    private final Log log;
    private final ClientConnectionOperator operator;
    private final HttpConnPool pool;
    private final SchemeRegistry schemeRegistry;

    public PoolingClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS);
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j10, TimeUnit timeUnit) {
        this(schemeRegistry, j10, timeUnit, new SystemDefaultDnsResolver());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j10, TimeUnit timeUnit, DnsResolver dnsResolver) {
        Log log = LogFactory.getLog(getClass());
        this.log = log;
        Args.notNull(schemeRegistry, "Scheme registry");
        Args.notNull(dnsResolver, "DNS resolver");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = dnsResolver;
        ClientConnectionOperator createConnectionOperator = createConnectionOperator(schemeRegistry);
        this.operator = createConnectionOperator;
        this.pool = new HttpConnPool(log, createConnectionOperator, 2, 20, j10, timeUnit);
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, DnsResolver dnsResolver) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS, dnsResolver);
    }

    private String format(HttpRoute httpRoute, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[route: ");
        sb2.append(httpRoute);
        sb2.append("]");
        if (obj != null) {
            sb2.append("[state: ");
            sb2.append(obj);
            sb2.append("]");
        }
        return sb2.toString();
    }

    private String format(HttpPoolEntry httpPoolEntry) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[id: ");
        sb2.append(httpPoolEntry.getId());
        sb2.append("]");
        sb2.append("[route: ");
        sb2.append(httpPoolEntry.getRoute());
        sb2.append("]");
        Object state = httpPoolEntry.getState();
        if (state != null) {
            sb2.append("[state: ");
            sb2.append(state);
            sb2.append("]");
        }
        return sb2.toString();
    }

    private String formatStats(HttpRoute httpRoute) {
        StringBuilder sb2 = new StringBuilder();
        PoolStats totalStats = this.pool.getTotalStats();
        PoolStats stats = this.pool.getStats(httpRoute);
        sb2.append("[total kept alive: ");
        sb2.append(totalStats.getAvailable());
        sb2.append("; ");
        sb2.append("route allocated: ");
        sb2.append(stats.getLeased() + stats.getAvailable());
        sb2.append(" of ");
        sb2.append(stats.getMax());
        sb2.append("; ");
        sb2.append("total allocated: ");
        sb2.append(totalStats.getLeased() + totalStats.getAvailable());
        sb2.append(" of ");
        sb2.append(totalStats.getMax());
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        this.pool.closeExpired();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j10 + " " + timeUnit);
        }
        this.pool.closeIdle(j10, timeUnit);
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry, this.dnsResolver);
    }

    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        return this.pool.getDefaultMaxPerRoute();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.pool.getMaxPerRoute(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        return this.pool.getMaxTotal();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(HttpRoute httpRoute) {
        return this.pool.getStats(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        return this.pool.getTotalStats();
    }

    public ManagedClientConnection leaseConnection(Future<HttpPoolEntry> future, long j10, TimeUnit timeUnit) {
        try {
            HttpPoolEntry httpPoolEntry = future.get(j10, timeUnit);
            if (httpPoolEntry == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            Asserts.check(httpPoolEntry.getConnection() != null, "Pool entry with no connection");
            if (this.log.isDebugEnabled()) {
                this.log.debug("Connection leased: " + format(httpPoolEntry) + formatStats(httpPoolEntry.getRoute()));
            }
            return new ManagedClientConnectionImpl(this, this.operator, httpPoolEntry);
        } catch (ExecutionException e10) {
            e = e10;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            this.log.error("Unexpected exception leasing connection from pool", e);
            throw new InterruptedException();
        } catch (TimeoutException e11) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j10, TimeUnit timeUnit) {
        String str;
        Args.check(managedClientConnection instanceof ManagedClientConnectionImpl, "Connection class mismatch, connection not obtained from this manager");
        ManagedClientConnectionImpl managedClientConnectionImpl = (ManagedClientConnectionImpl) managedClientConnection;
        Asserts.check(managedClientConnectionImpl.getManager() == this, "Connection not obtained from this manager");
        synchronized (managedClientConnectionImpl) {
            HttpPoolEntry detach = managedClientConnectionImpl.detach();
            if (detach == null) {
                return;
            }
            try {
                if (managedClientConnectionImpl.isOpen() && !managedClientConnectionImpl.isMarkedReusable()) {
                    try {
                        managedClientConnectionImpl.shutdown();
                    } catch (IOException e10) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("I/O exception shutting down released connection", e10);
                        }
                    }
                }
                if (managedClientConnectionImpl.isMarkedReusable()) {
                    detach.updateExpiry(j10, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                    if (this.log.isDebugEnabled()) {
                        if (j10 > 0) {
                            str = "for " + j10 + " " + timeUnit;
                        } else {
                            str = "indefinitely";
                        }
                        this.log.debug("Connection " + format(detach) + " can be kept alive " + str);
                    }
                }
                this.pool.release((HttpConnPool) detach, managedClientConnectionImpl.isMarkedReusable());
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Connection released: " + format(detach) + formatStats(detach.getRoute()));
                }
            } catch (Throwable th2) {
                this.pool.release((HttpConnPool) detach, managedClientConnectionImpl.isMarkedReusable());
                throw th2;
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        if (this.log.isDebugEnabled()) {
            this.log.debug("Connection request: " + format(httpRoute, obj) + formatStats(httpRoute));
        }
        return new ClientConnectionRequest(this, this.pool.lease(httpRoute, obj)) { // from class: org.apache.http.impl.conn.PoolingClientConnectionManager.1
            public final PoolingClientConnectionManager this$0;
            public final Future val$future;

            {
                this.this$0 = this;
                this.val$future = r5;
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                this.val$future.cancel(true);
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j10, TimeUnit timeUnit) {
                return this.this$0.leaseConnection(this.val$future, j10, timeUnit);
            }
        };
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i10) {
        this.pool.setDefaultMaxPerRoute(i10);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(HttpRoute httpRoute, int i10) {
        this.pool.setMaxPerRoute(httpRoute, i10);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i10) {
        this.pool.setMaxTotal(i10);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.log.debug("Connection manager is shutting down");
        try {
            this.pool.shutdown();
        } catch (IOException e10) {
            this.log.debug("I/O exception shutting down connection manager", e10);
        }
        this.log.debug("Connection manager shut down");
    }
}
