package org.apache.http.impl.conn;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionOperator;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.pool.ConnFactory;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolEntryCallback;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/PoolingHttpClientConnectionManager.class */
public class PoolingHttpClientConnectionManager implements HttpClientConnectionManager, ConnPoolControl<HttpRoute>, Closeable {
    private final ConfigData configData;
    private final HttpClientConnectionOperator connectionOperator;
    private final AtomicBoolean isShutDown;
    private final Log log;
    private final CPool pool;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/PoolingHttpClientConnectionManager$ConfigData.class */
    public static class ConfigData {
        private volatile ConnectionConfig defaultConnectionConfig;
        private volatile SocketConfig defaultSocketConfig;
        private final Map<HttpHost, SocketConfig> socketConfigMap = new ConcurrentHashMap();
        private final Map<HttpHost, ConnectionConfig> connectionConfigMap = new ConcurrentHashMap();

        public ConnectionConfig getConnectionConfig(HttpHost httpHost) {
            return this.connectionConfigMap.get(httpHost);
        }

        public ConnectionConfig getDefaultConnectionConfig() {
            return this.defaultConnectionConfig;
        }

        public SocketConfig getDefaultSocketConfig() {
            return this.defaultSocketConfig;
        }

        public SocketConfig getSocketConfig(HttpHost httpHost) {
            return this.socketConfigMap.get(httpHost);
        }

        public void setConnectionConfig(HttpHost httpHost, ConnectionConfig connectionConfig) {
            this.connectionConfigMap.put(httpHost, connectionConfig);
        }

        public void setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
            this.defaultConnectionConfig = connectionConfig;
        }

        public void setDefaultSocketConfig(SocketConfig socketConfig) {
            this.defaultSocketConfig = socketConfig;
        }

        public void setSocketConfig(HttpHost httpHost, SocketConfig socketConfig) {
            this.socketConfigMap.put(httpHost, socketConfig);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/PoolingHttpClientConnectionManager$InternalConnectionFactory.class */
    public static class InternalConnectionFactory implements ConnFactory<HttpRoute, ManagedHttpClientConnection> {
        private final ConfigData configData;
        private final HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory;

        public InternalConnectionFactory(ConfigData configData, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
            this.configData = configData == null ? new ConfigData() : configData;
            this.connFactory = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        }

        @Override // org.apache.http.pool.ConnFactory
        public ManagedHttpClientConnection create(HttpRoute httpRoute) {
            ConnectionConfig connectionConfig = httpRoute.getProxyHost() != null ? this.configData.getConnectionConfig(httpRoute.getProxyHost()) : null;
            ConnectionConfig connectionConfig2 = connectionConfig;
            if (connectionConfig == null) {
                connectionConfig2 = this.configData.getConnectionConfig(httpRoute.getTargetHost());
            }
            ConnectionConfig connectionConfig3 = connectionConfig2;
            if (connectionConfig2 == null) {
                connectionConfig3 = this.configData.getDefaultConnectionConfig();
            }
            ConnectionConfig connectionConfig4 = connectionConfig3;
            if (connectionConfig3 == null) {
                connectionConfig4 = ConnectionConfig.DEFAULT;
            }
            return this.connFactory.create(httpRoute, connectionConfig4);
        }
    }

    public PoolingHttpClientConnectionManager() {
        this(getDefaultRegistry());
    }

    public PoolingHttpClientConnectionManager(long j10, TimeUnit timeUnit) {
        this(getDefaultRegistry(), null, null, null, j10, timeUnit);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry) {
        this(registry, null, null);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, DnsResolver dnsResolver) {
        this(registry, null, dnsResolver);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(registry, httpConnectionFactory, null);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, DnsResolver dnsResolver) {
        this(registry, httpConnectionFactory, null, dnsResolver, -1L, TimeUnit.MILLISECONDS);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver, long j10, TimeUnit timeUnit) {
        this(new DefaultHttpClientConnectionOperator(registry, schemePortResolver, dnsResolver), httpConnectionFactory, j10, timeUnit);
    }

    public PoolingHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, long j10, TimeUnit timeUnit) {
        this.log = LogFactory.getLog(getClass());
        ConfigData configData = new ConfigData();
        this.configData = configData;
        CPool cPool = new CPool(new InternalConnectionFactory(configData, httpConnectionFactory), 2, 20, j10, timeUnit);
        this.pool = cPool;
        cPool.setValidateAfterInactivity(2000);
        this.connectionOperator = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "HttpClientConnectionOperator");
        this.isShutDown = new AtomicBoolean(false);
    }

    public PoolingHttpClientConnectionManager(HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(getDefaultRegistry(), httpConnectionFactory, null);
    }

    public PoolingHttpClientConnectionManager(CPool cPool, Lookup<ConnectionSocketFactory> lookup, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        this.log = LogFactory.getLog(getClass());
        this.configData = new ConfigData();
        this.pool = cPool;
        this.connectionOperator = new DefaultHttpClientConnectionOperator(lookup, schemePortResolver, dnsResolver);
        this.isShutDown = new AtomicBoolean(false);
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

    private String format(CPoolEntry cPoolEntry) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[id: ");
        sb2.append(cPoolEntry.getId());
        sb2.append("]");
        sb2.append("[route: ");
        sb2.append(cPoolEntry.getRoute());
        sb2.append("]");
        Object state = cPoolEntry.getState();
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

    private static Registry<ConnectionSocketFactory> getDefaultRegistry() {
        return RegistryBuilder.create().register(HttpHost.DEFAULT_SCHEME_NAME, PlainConnectionSocketFactory.getSocketFactory()).register(ClientConstants.DOMAIN_SCHEME, SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SocketConfig resolveSocketConfig(HttpHost httpHost) {
        SocketConfig socketConfig = this.configData.getSocketConfig(httpHost);
        SocketConfig socketConfig2 = socketConfig;
        if (socketConfig == null) {
            socketConfig2 = this.configData.getDefaultSocketConfig();
        }
        SocketConfig socketConfig3 = socketConfig2;
        if (socketConfig2 == null) {
            socketConfig3 = SocketConfig.DEFAULT;
        }
        return socketConfig3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown();
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        this.pool.closeExpired();
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j10 + " " + timeUnit);
        }
        this.pool.closeIdle(j10, timeUnit);
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i10, HttpContext httpContext) {
        ManagedHttpClientConnection connection;
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            connection = CPoolProxy.getPoolEntry(httpClientConnection).getConnection();
        }
        HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
        this.connectionOperator.connect(connection, proxyHost, httpRoute.getLocalSocketAddress(), i10, resolveSocketConfig(proxyHost), httpContext);
    }

    public void enumAvailable(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        this.pool.enumAvailable(poolEntryCallback);
    }

    public void enumLeased(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        this.pool.enumLeased(poolEntryCallback);
    }

    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public ConnectionConfig getConnectionConfig(HttpHost httpHost) {
        return this.configData.getConnectionConfig(httpHost);
    }

    public ConnectionConfig getDefaultConnectionConfig() {
        return this.configData.getDefaultConnectionConfig();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        return this.pool.getDefaultMaxPerRoute();
    }

    public SocketConfig getDefaultSocketConfig() {
        return this.configData.getDefaultSocketConfig();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.pool.getMaxPerRoute(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        return this.pool.getMaxTotal();
    }

    public Set<HttpRoute> getRoutes() {
        return this.pool.getRoutes();
    }

    public SocketConfig getSocketConfig(HttpHost httpHost) {
        return this.configData.getSocketConfig(httpHost);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(HttpRoute httpRoute) {
        return this.pool.getStats(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        return this.pool.getTotalStats();
    }

    public int getValidateAfterInactivity() {
        return this.pool.getValidateAfterInactivity();
    }

    public HttpClientConnection leaseConnection(Future<CPoolEntry> future, long j10, TimeUnit timeUnit) {
        try {
            CPoolEntry cPoolEntry = future.get(j10, timeUnit);
            if (cPoolEntry == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            Asserts.check(cPoolEntry.getConnection() != null, "Pool entry with no connection");
            if (this.log.isDebugEnabled()) {
                this.log.debug("Connection leased: " + format(cPoolEntry) + formatStats(cPoolEntry.getRoute()));
            }
            return CPoolProxy.newProxy(cPoolEntry);
        } catch (TimeoutException e10) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j10, TimeUnit timeUnit) {
        String str;
        Args.notNull(httpClientConnection, "Managed connection");
        synchronized (httpClientConnection) {
            CPoolEntry detach = CPoolProxy.detach(httpClientConnection);
            if (detach == null) {
                return;
            }
            ManagedHttpClientConnection connection = detach.getConnection();
            boolean z10 = true;
            try {
                if (connection.isOpen()) {
                    if (timeUnit == null) {
                        timeUnit = TimeUnit.MILLISECONDS;
                    }
                    detach.setState(obj);
                    detach.updateExpiry(j10, timeUnit);
                    if (this.log.isDebugEnabled()) {
                        if (j10 > 0) {
                            str = "for " + (timeUnit.toMillis(j10) / 1000.0d) + " seconds";
                        } else {
                            str = "indefinitely";
                        }
                        this.log.debug("Connection " + format(detach) + " can be kept alive " + str);
                    }
                    connection.setSocketTimeout(0);
                }
                CPool cPool = this.pool;
                if (!connection.isOpen() || !detach.isRouteComplete()) {
                    z10 = false;
                }
                cPool.release((CPool) detach, z10);
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Connection released: " + format(detach) + formatStats(detach.getRoute()));
                }
            } catch (Throwable th2) {
                this.pool.release((CPool) detach, connection.isOpen() && detach.isRouteComplete());
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Connection released: " + format(detach) + formatStats(detach.getRoute()));
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public ConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        if (this.log.isDebugEnabled()) {
            this.log.debug("Connection request: " + format(httpRoute, obj) + formatStats(httpRoute));
        }
        return new ConnectionRequest(this, this.pool.lease(httpRoute, obj, null), httpRoute) { // from class: org.apache.http.impl.conn.PoolingHttpClientConnectionManager.1
            public final PoolingHttpClientConnectionManager this$0;
            public final Future val$future;
            public final HttpRoute val$route;

            {
                this.this$0 = this;
                this.val$future = r5;
                this.val$route = httpRoute;
            }

            @Override // org.apache.http.concurrent.Cancellable
            public boolean cancel() {
                return this.val$future.cancel(true);
            }

            @Override // org.apache.http.conn.ConnectionRequest
            public HttpClientConnection get(long j10, TimeUnit timeUnit) {
                HttpClientConnection leaseConnection = this.this$0.leaseConnection(this.val$future, j10, timeUnit);
                if (leaseConnection.isOpen()) {
                    leaseConnection.setSocketTimeout(this.this$0.resolveSocketConfig(this.val$route.getProxyHost() != null ? this.val$route.getProxyHost() : this.val$route.getTargetHost()).getSoTimeout());
                }
                return leaseConnection;
            }
        };
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            CPoolProxy.getPoolEntry(httpClientConnection).markRouteComplete();
        }
    }

    public void setConnectionConfig(HttpHost httpHost, ConnectionConfig connectionConfig) {
        this.configData.setConnectionConfig(httpHost, connectionConfig);
    }

    public void setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
        this.configData.setDefaultConnectionConfig(connectionConfig);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i10) {
        this.pool.setDefaultMaxPerRoute(i10);
    }

    public void setDefaultSocketConfig(SocketConfig socketConfig) {
        this.configData.setDefaultSocketConfig(socketConfig);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(HttpRoute httpRoute, int i10) {
        this.pool.setMaxPerRoute(httpRoute, i10);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i10) {
        this.pool.setMaxTotal(i10);
    }

    public void setSocketConfig(HttpHost httpHost, SocketConfig socketConfig) {
        this.configData.setSocketConfig(httpHost, socketConfig);
    }

    public void setValidateAfterInactivity(int i10) {
        this.pool.setValidateAfterInactivity(i10);
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void shutdown() {
        if (this.isShutDown.compareAndSet(false, true)) {
            this.log.debug("Connection manager is shutting down");
            try {
                this.pool.shutdown();
            } catch (IOException e10) {
                this.log.debug("I/O exception shutting down connection manager", e10);
            }
            this.log.debug("Connection manager shut down");
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        ManagedHttpClientConnection connection;
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            connection = CPoolProxy.getPoolEntry(httpClientConnection).getConnection();
        }
        this.connectionOperator.upgrade(connection, httpRoute.getTargetHost(), httpContext);
    }
}
