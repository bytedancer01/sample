package org.apache.http.impl.client;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthState;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpParamsNames;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/InternalHttpClient.class */
class InternalHttpClient extends CloseableHttpClient implements Configurable {
    private final Lookup<AuthSchemeProvider> authSchemeRegistry;
    private final List<Closeable> closeables;
    private final HttpClientConnectionManager connManager;
    private final Lookup<CookieSpecProvider> cookieSpecRegistry;
    private final CookieStore cookieStore;
    private final CredentialsProvider credentialsProvider;
    private final RequestConfig defaultConfig;
    private final ClientExecChain execChain;
    private final Log log = LogFactory.getLog(getClass());
    private final HttpRoutePlanner routePlanner;

    public InternalHttpClient(ClientExecChain clientExecChain, HttpClientConnectionManager httpClientConnectionManager, HttpRoutePlanner httpRoutePlanner, Lookup<CookieSpecProvider> lookup, Lookup<AuthSchemeProvider> lookup2, CookieStore cookieStore, CredentialsProvider credentialsProvider, RequestConfig requestConfig, List<Closeable> list) {
        Args.notNull(clientExecChain, "HTTP client exec chain");
        Args.notNull(httpClientConnectionManager, "HTTP connection manager");
        Args.notNull(httpRoutePlanner, "HTTP route planner");
        this.execChain = clientExecChain;
        this.connManager = httpClientConnectionManager;
        this.routePlanner = httpRoutePlanner;
        this.cookieSpecRegistry = lookup;
        this.authSchemeRegistry = lookup2;
        this.cookieStore = cookieStore;
        this.credentialsProvider = credentialsProvider;
        this.defaultConfig = requestConfig;
        this.closeables = list;
    }

    private HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpHost httpHost2 = httpHost;
        if (httpHost == null) {
            httpHost2 = (HttpHost) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        return this.routePlanner.determineRoute(httpHost2, httpRequest, httpContext);
    }

    private void setupContext(HttpClientContext httpClientContext) {
        if (httpClientContext.getAttribute("http.auth.target-scope") == null) {
            httpClientContext.setAttribute("http.auth.target-scope", new AuthState());
        }
        if (httpClientContext.getAttribute("http.auth.proxy-scope") == null) {
            httpClientContext.setAttribute("http.auth.proxy-scope", new AuthState());
        }
        if (httpClientContext.getAttribute("http.authscheme-registry") == null) {
            httpClientContext.setAttribute("http.authscheme-registry", this.authSchemeRegistry);
        }
        if (httpClientContext.getAttribute("http.cookiespec-registry") == null) {
            httpClientContext.setAttribute("http.cookiespec-registry", this.cookieSpecRegistry);
        }
        if (httpClientContext.getAttribute("http.cookie-store") == null) {
            httpClientContext.setAttribute("http.cookie-store", this.cookieStore);
        }
        if (httpClientContext.getAttribute("http.auth.credentials-provider") == null) {
            httpClientContext.setAttribute("http.auth.credentials-provider", this.credentialsProvider);
        }
        if (httpClientContext.getAttribute("http.request-config") == null) {
            httpClientContext.setAttribute("http.request-config", this.defaultConfig);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        List<Closeable> list = this.closeables;
        if (list != null) {
            Iterator<Closeable> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().close();
                } catch (IOException e10) {
                    this.log.error(e10.getMessage(), e10);
                }
            }
        }
    }

    @Override // org.apache.http.impl.client.CloseableHttpClient
    public CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        RequestConfig requestConfig;
        Args.notNull(httpRequest, "HTTP request");
        HttpExecutionAware httpExecutionAware = httpRequest instanceof HttpExecutionAware ? (HttpExecutionAware) httpRequest : null;
        try {
            HttpRequestWrapper wrap = HttpRequestWrapper.wrap(httpRequest, httpHost);
            if (httpContext == null) {
                httpContext = new BasicHttpContext();
            }
            HttpClientContext adapt = HttpClientContext.adapt(httpContext);
            RequestConfig requestConfig2 = null;
            if (httpRequest instanceof Configurable) {
                requestConfig2 = ((Configurable) httpRequest).getConfig();
            }
            RequestConfig requestConfig3 = requestConfig2;
            if (requestConfig2 == null) {
                HttpParams params = httpRequest.getParams();
                if (params instanceof HttpParamsNames) {
                    requestConfig3 = requestConfig2;
                    if (!((HttpParamsNames) params).getNames().isEmpty()) {
                        requestConfig = this.defaultConfig;
                    }
                } else {
                    requestConfig = this.defaultConfig;
                }
                requestConfig3 = HttpClientParamConfig.getRequestConfig(params, requestConfig);
            }
            if (requestConfig3 != null) {
                adapt.setRequestConfig(requestConfig3);
            }
            setupContext(adapt);
            return this.execChain.execute(determineRoute(httpHost, wrap, adapt), wrap, adapt, httpExecutionAware);
        } catch (HttpException e10) {
            throw new ClientProtocolException(e10);
        }
    }

    @Override // org.apache.http.client.methods.Configurable
    public RequestConfig getConfig() {
        return this.defaultConfig;
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return new ClientConnectionManager(this) { // from class: org.apache.http.impl.client.InternalHttpClient.1
            public final InternalHttpClient this$0;

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
        throw new UnsupportedOperationException();
    }
}
