package org.apache.http.impl.conn;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
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
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/BasicHttpClientConnectionManager.class */
public class BasicHttpClientConnectionManager implements HttpClientConnectionManager, Closeable {
    private ManagedHttpClientConnection conn;
    private ConnectionConfig connConfig;
    private final HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory;
    private final HttpClientConnectionOperator connectionOperator;
    private long expiry;
    private final AtomicBoolean isShutdown;
    private boolean leased;
    private final Log log;
    private HttpRoute route;
    private SocketConfig socketConfig;
    private Object state;
    private long updated;

    public BasicHttpClientConnectionManager() {
        this(getDefaultRegistry(), null, null, null);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup) {
        this(lookup, null, null, null);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(lookup, httpConnectionFactory, null, null);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        this(new DefaultHttpClientConnectionOperator(lookup, schemePortResolver, dnsResolver), httpConnectionFactory);
    }

    public BasicHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this.log = LogFactory.getLog(getClass());
        this.connectionOperator = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "Connection operator");
        this.connFactory = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        this.expiry = Long.MAX_VALUE;
        this.socketConfig = SocketConfig.DEFAULT;
        this.connConfig = ConnectionConfig.DEFAULT;
        this.isShutdown = new AtomicBoolean(false);
    }

    private void checkExpiry() {
        if (this.conn == null || System.currentTimeMillis() < this.expiry) {
            return;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Connection expired @ " + new Date(this.expiry));
        }
        closeConnection();
    }

    private void closeConnection() {
        synchronized (this) {
            if (this.conn != null) {
                this.log.debug("Closing connection");
                try {
                    this.conn.close();
                } catch (IOException e10) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("I/O exception closing connection", e10);
                    }
                }
                this.conn = null;
            }
        }
    }

    private static Registry<ConnectionSocketFactory> getDefaultRegistry() {
        return RegistryBuilder.create().register(HttpHost.DEFAULT_SCHEME_NAME, PlainConnectionSocketFactory.getSocketFactory()).register(ClientConstants.DOMAIN_SCHEME, SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isShutdown.compareAndSet(false, true)) {
            closeConnection();
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeExpiredConnections() {
        synchronized (this) {
            if (this.isShutdown.get()) {
                return;
            }
            if (!this.leased) {
                checkExpiry();
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        synchronized (this) {
            Args.notNull(timeUnit, "Time unit");
            if (this.isShutdown.get()) {
                return;
            }
            if (!this.leased) {
                long millis = timeUnit.toMillis(j10);
                long j11 = millis;
                if (millis < 0) {
                    j11 = 0;
                }
                if (this.updated <= System.currentTimeMillis() - j11) {
                    closeConnection();
                }
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i10, HttpContext httpContext) {
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        this.connectionOperator.connect(this.conn, httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost(), httpRoute.getLocalSocketAddress(), i10, this.socketConfig, httpContext);
    }

    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public HttpClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        ManagedHttpClientConnection managedHttpClientConnection;
        synchronized (this) {
            Asserts.check(!this.isShutdown.get(), "Connection manager has been shut down");
            if (this.log.isDebugEnabled()) {
                this.log.debug("Get connection for route " + httpRoute);
            }
            boolean z10 = false;
            if (!this.leased) {
                z10 = true;
            }
            Asserts.check(z10, "Connection is still allocated");
            if (!LangUtils.equals(this.route, httpRoute) || !LangUtils.equals(this.state, obj)) {
                closeConnection();
            }
            this.route = httpRoute;
            this.state = obj;
            checkExpiry();
            if (this.conn == null) {
                this.conn = this.connFactory.create(httpRoute, this.connConfig);
            }
            this.conn.setSocketTimeout(this.socketConfig.getSoTimeout());
            this.leased = true;
            managedHttpClientConnection = this.conn;
        }
        return managedHttpClientConnection;
    }

    public ConnectionConfig getConnectionConfig() {
        ConnectionConfig connectionConfig;
        synchronized (this) {
            connectionConfig = this.connConfig;
        }
        return connectionConfig;
    }

    public HttpRoute getRoute() {
        return this.route;
    }

    public SocketConfig getSocketConfig() {
        SocketConfig socketConfig;
        synchronized (this) {
            socketConfig = this.socketConfig;
        }
        return socketConfig;
    }

    public Object getState() {
        return this.state;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j10, TimeUnit timeUnit) {
        String str;
        synchronized (this) {
            Args.notNull(httpClientConnection, "Connection");
            Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
            if (this.log.isDebugEnabled()) {
                this.log.debug("Releasing connection " + httpClientConnection);
            }
            if (this.isShutdown.get()) {
                return;
            }
            try {
                this.updated = System.currentTimeMillis();
                if (this.conn.isOpen()) {
                    this.state = obj;
                    this.conn.setSocketTimeout(0);
                    if (this.log.isDebugEnabled()) {
                        if (j10 > 0) {
                            str = "for " + j10 + " " + timeUnit;
                        } else {
                            str = "indefinitely";
                        }
                        this.log.debug("Connection can be kept alive " + str);
                    }
                    if (j10 > 0) {
                        this.expiry = this.updated + timeUnit.toMillis(j10);
                    }
                } else {
                    this.route = null;
                    this.conn = null;
                }
                this.expiry = Long.MAX_VALUE;
            } finally {
                this.leased = false;
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public final ConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "Route");
        return new ConnectionRequest(this, httpRoute, obj) { // from class: org.apache.http.impl.conn.BasicHttpClientConnectionManager.1
            public final BasicHttpClientConnectionManager this$0;
            public final HttpRoute val$route;
            public final Object val$state;

            {
                this.this$0 = this;
                this.val$route = httpRoute;
                this.val$state = obj;
            }

            @Override // org.apache.http.concurrent.Cancellable
            public boolean cancel() {
                return false;
            }

            @Override // org.apache.http.conn.ConnectionRequest
            public HttpClientConnection get(long j10, TimeUnit timeUnit) {
                return this.this$0.getConnection(this.val$route, this.val$state);
            }
        };
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
    }

    public void setConnectionConfig(ConnectionConfig connectionConfig) {
        synchronized (this) {
            if (connectionConfig == null) {
                connectionConfig = ConnectionConfig.DEFAULT;
            }
            this.connConfig = connectionConfig;
        }
    }

    public void setSocketConfig(SocketConfig socketConfig) {
        synchronized (this) {
            if (socketConfig == null) {
                socketConfig = SocketConfig.DEFAULT;
            }
            this.socketConfig = socketConfig;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void shutdown() {
        close();
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        this.connectionOperator.upgrade(this.conn, httpRoute.getTargetHost(), httpContext);
    }
}
