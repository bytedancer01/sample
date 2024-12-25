package org.apache.http.impl.client;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.execchain.MinimalClientExec;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/MinimalHttpClient.class */
class MinimalHttpClient extends CloseableHttpClient {
    private final HttpClientConnectionManager connManager;
    private final HttpParams params = new BasicHttpParams();
    private final MinimalClientExec requestExecutor;

    public MinimalHttpClient(HttpClientConnectionManager httpClientConnectionManager) {
        this.connManager = (HttpClientConnectionManager) Args.notNull(httpClientConnectionManager, "HTTP connection manager");
        this.requestExecutor = new MinimalClientExec(new HttpRequestExecutor(), httpClientConnectionManager, DefaultConnectionReuseStrategy.INSTANCE, DefaultConnectionKeepAliveStrategy.INSTANCE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.connManager.shutdown();
    }

    @Override // org.apache.http.impl.client.CloseableHttpClient
    public CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpRequest, "HTTP request");
        HttpExecutionAware httpExecutionAware = httpRequest instanceof HttpExecutionAware ? (HttpExecutionAware) httpRequest : null;
        try {
            HttpRequestWrapper wrap = HttpRequestWrapper.wrap(httpRequest);
            if (httpContext == null) {
                httpContext = new BasicHttpContext();
            }
            HttpClientContext adapt = HttpClientContext.adapt(httpContext);
            HttpRoute httpRoute = new HttpRoute(httpHost);
            RequestConfig requestConfig = null;
            if (httpRequest instanceof Configurable) {
                requestConfig = ((Configurable) httpRequest).getConfig();
            }
            if (requestConfig != null) {
                adapt.setRequestConfig(requestConfig);
            }
            return this.requestExecutor.execute(httpRoute, wrap, adapt, httpExecutionAware);
        } catch (HttpException e10) {
            throw new ClientProtocolException(e10);
        }
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return new ClientConnectionManager(this) { // from class: org.apache.http.impl.client.MinimalHttpClient.1
            public final MinimalHttpClient this$0;

            {
                this.this$0 = this;
            }

            @Override // org.apache.http.conn.ClientConnectionManager
            public void closeExpiredConnections() {
                this.this$0.connManager.closeExpiredConnections();
            }

            @Override // org.apache.http.conn.ClientConnectionManager
            public void closeIdleConnections(long j10, TimeUnit timeUnit) {
                this.this$0.connManager.closeIdleConnections(j10, timeUnit);
            }

            @Override // org.apache.http.conn.ClientConnectionManager
            public SchemeRegistry getSchemeRegistry() {
                throw new UnsupportedOperationException();
            }

            @Override // org.apache.http.conn.ClientConnectionManager
            public void releaseConnection(ManagedClientConnection managedClientConnection, long j10, TimeUnit timeUnit) {
                throw new UnsupportedOperationException();
            }

            @Override // org.apache.http.conn.ClientConnectionManager
            public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // org.apache.http.conn.ClientConnectionManager
            public void shutdown() {
                this.this$0.connManager.shutdown();
            }
        };
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.params;
    }
}
