package org.apache.http.impl.client;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionManagerFactory;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.BasicClientConnectionManager;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.impl.cookie.IgnoreSpecFactory;
import org.apache.http.impl.cookie.NetscapeDraftSpecFactory;
import org.apache.http.impl.cookie.RFC2109SpecFactory;
import org.apache.http.impl.cookie.RFC2965SpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.DefaultedHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/AbstractHttpClient.class */
public abstract class AbstractHttpClient extends CloseableHttpClient {
    private BackoffManager backoffManager;
    private ClientConnectionManager connManager;
    private ConnectionBackoffStrategy connectionBackoffStrategy;
    private CookieStore cookieStore;
    private CredentialsProvider credsProvider;
    private HttpParams defaultParams;
    private ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log = LogFactory.getLog(getClass());
    private BasicHttpProcessor mutableProcessor;
    private ImmutableHttpProcessor protocolProcessor;
    private AuthenticationStrategy proxyAuthStrategy;
    private RedirectStrategy redirectStrategy;
    private HttpRequestExecutor requestExec;
    private HttpRequestRetryHandler retryHandler;
    private ConnectionReuseStrategy reuseStrategy;
    private HttpRoutePlanner routePlanner;
    private AuthSchemeRegistry supportedAuthSchemes;
    private CookieSpecRegistry supportedCookieSpecs;
    private AuthenticationStrategy targetAuthStrategy;
    private UserTokenHandler userTokenHandler;

    public AbstractHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.defaultParams = httpParams;
        this.connManager = clientConnectionManager;
    }

    private HttpProcessor getProtocolProcessor() {
        ImmutableHttpProcessor immutableHttpProcessor;
        synchronized (this) {
            if (this.protocolProcessor == null) {
                BasicHttpProcessor httpProcessor = getHttpProcessor();
                int requestInterceptorCount = httpProcessor.getRequestInterceptorCount();
                HttpRequestInterceptor[] httpRequestInterceptorArr = new HttpRequestInterceptor[requestInterceptorCount];
                for (int i10 = 0; i10 < requestInterceptorCount; i10++) {
                    httpRequestInterceptorArr[i10] = httpProcessor.getRequestInterceptor(i10);
                }
                int responseInterceptorCount = httpProcessor.getResponseInterceptorCount();
                HttpResponseInterceptor[] httpResponseInterceptorArr = new HttpResponseInterceptor[responseInterceptorCount];
                for (int i11 = 0; i11 < responseInterceptorCount; i11++) {
                    httpResponseInterceptorArr[i11] = httpProcessor.getResponseInterceptor(i11);
                }
                this.protocolProcessor = new ImmutableHttpProcessor(httpRequestInterceptorArr, httpResponseInterceptorArr);
            }
            immutableHttpProcessor = this.protocolProcessor;
        }
        return immutableHttpProcessor;
    }

    public void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        synchronized (this) {
            getHttpProcessor().addInterceptor(httpRequestInterceptor);
            this.protocolProcessor = null;
        }
    }

    public void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i10) {
        synchronized (this) {
            getHttpProcessor().addInterceptor(httpRequestInterceptor, i10);
            this.protocolProcessor = null;
        }
    }

    public void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        synchronized (this) {
            getHttpProcessor().addInterceptor(httpResponseInterceptor);
            this.protocolProcessor = null;
        }
    }

    public void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i10) {
        synchronized (this) {
            getHttpProcessor().addInterceptor(httpResponseInterceptor, i10);
            this.protocolProcessor = null;
        }
    }

    public void clearRequestInterceptors() {
        synchronized (this) {
            getHttpProcessor().clearRequestInterceptors();
            this.protocolProcessor = null;
        }
    }

    public void clearResponseInterceptors() {
        synchronized (this) {
            getHttpProcessor().clearResponseInterceptors();
            this.protocolProcessor = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getConnectionManager().shutdown();
    }

    public AuthSchemeRegistry createAuthSchemeRegistry() {
        AuthSchemeRegistry authSchemeRegistry = new AuthSchemeRegistry();
        authSchemeRegistry.register("Basic", new BasicSchemeFactory());
        authSchemeRegistry.register("Digest", new DigestSchemeFactory());
        authSchemeRegistry.register("NTLM", new NTLMSchemeFactory());
        authSchemeRegistry.register("Negotiate", new SPNegoSchemeFactory());
        authSchemeRegistry.register("Kerberos", new KerberosSchemeFactory());
        return authSchemeRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.apache.http.conn.ClientConnectionManager] */
    public ClientConnectionManager createClientConnectionManager() {
        ClientConnectionManagerFactory clientConnectionManagerFactory;
        SchemeRegistry createDefault = SchemeRegistryFactory.createDefault();
        HttpParams params = getParams();
        String str = (String) params.getParameter(ClientPNames.CONNECTION_MANAGER_FACTORY_CLASS_NAME);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (str != null) {
            try {
                clientConnectionManagerFactory = (ClientConnectionManagerFactory) (contextClassLoader != null ? Class.forName(str, true, contextClassLoader) : Class.forName(str)).newInstance();
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Invalid class name: " + str);
            } catch (IllegalAccessException e11) {
                throw new IllegalAccessError(e11.getMessage());
            } catch (InstantiationException e12) {
                throw new InstantiationError(e12.getMessage());
            }
        } else {
            clientConnectionManagerFactory = null;
        }
        return clientConnectionManagerFactory != null ? clientConnectionManagerFactory.newInstance(params, createDefault) : new BasicClientConnectionManager(createDefault);
    }

    @Deprecated
    public RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new DefaultRequestDirector(httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectHandler, authenticationHandler, authenticationHandler2, userTokenHandler, httpParams);
    }

    @Deprecated
    public RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new DefaultRequestDirector(this.log, httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectStrategy, authenticationHandler, authenticationHandler2, userTokenHandler, httpParams);
    }

    public RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new DefaultRequestDirector(this.log, httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectStrategy, authenticationStrategy, authenticationStrategy2, userTokenHandler, httpParams);
    }

    public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new DefaultConnectionKeepAliveStrategy();
    }

    public ConnectionReuseStrategy createConnectionReuseStrategy() {
        return new DefaultConnectionReuseStrategy();
    }

    public CookieSpecRegistry createCookieSpecRegistry() {
        CookieSpecRegistry cookieSpecRegistry = new CookieSpecRegistry();
        cookieSpecRegistry.register(CookieSpecs.DEFAULT, new BestMatchSpecFactory());
        cookieSpecRegistry.register("best-match", new BestMatchSpecFactory());
        cookieSpecRegistry.register("compatibility", new BrowserCompatSpecFactory());
        cookieSpecRegistry.register("netscape", new NetscapeDraftSpecFactory());
        cookieSpecRegistry.register(CookiePolicy.RFC_2109, new RFC2109SpecFactory());
        cookieSpecRegistry.register(CookiePolicy.RFC_2965, new RFC2965SpecFactory());
        cookieSpecRegistry.register("ignoreCookies", new IgnoreSpecFactory());
        return cookieSpecRegistry;
    }

    public CookieStore createCookieStore() {
        return new BasicCookieStore();
    }

    public CredentialsProvider createCredentialsProvider() {
        return new BasicCredentialsProvider();
    }

    public HttpContext createHttpContext() {
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute(ClientContext.SCHEME_REGISTRY, getConnectionManager().getSchemeRegistry());
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.cookie-store", getCookieStore());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    public abstract HttpParams createHttpParams();

    public abstract BasicHttpProcessor createHttpProcessor();

    public HttpRequestRetryHandler createHttpRequestRetryHandler() {
        return new DefaultHttpRequestRetryHandler();
    }

    public HttpRoutePlanner createHttpRoutePlanner() {
        return new DefaultHttpRoutePlanner(getConnectionManager().getSchemeRegistry());
    }

    @Deprecated
    public AuthenticationHandler createProxyAuthenticationHandler() {
        return new DefaultProxyAuthenticationHandler();
    }

    public AuthenticationStrategy createProxyAuthenticationStrategy() {
        return new ProxyAuthenticationStrategy();
    }

    @Deprecated
    public RedirectHandler createRedirectHandler() {
        return new DefaultRedirectHandler();
    }

    public HttpRequestExecutor createRequestExecutor() {
        return new HttpRequestExecutor();
    }

    @Deprecated
    public AuthenticationHandler createTargetAuthenticationHandler() {
        return new DefaultTargetAuthenticationHandler();
    }

    public AuthenticationStrategy createTargetAuthenticationStrategy() {
        return new TargetAuthenticationStrategy();
    }

    public UserTokenHandler createUserTokenHandler() {
        return new DefaultUserTokenHandler();
    }

    public HttpParams determineParams(HttpRequest httpRequest) {
        return new ClientParamsStack(null, getParams(), httpRequest.getParams(), null);
    }

    @Override // org.apache.http.impl.client.CloseableHttpClient
    public final CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpContext defaultedHttpContext;
        RequestDirector createClientRequestDirector;
        HttpRoutePlanner routePlanner;
        ConnectionBackoffStrategy connectionBackoffStrategy;
        BackoffManager backoffManager;
        Args.notNull(httpRequest, "HTTP request");
        synchronized (this) {
            HttpContext createHttpContext = createHttpContext();
            defaultedHttpContext = httpContext == null ? createHttpContext : new DefaultedHttpContext(httpContext, createHttpContext);
            HttpParams determineParams = determineParams(httpRequest);
            defaultedHttpContext.setAttribute("http.request-config", HttpClientParamConfig.getRequestConfig(determineParams));
            createClientRequestDirector = createClientRequestDirector(getRequestExecutor(), getConnectionManager(), getConnectionReuseStrategy(), getConnectionKeepAliveStrategy(), getRoutePlanner(), getProtocolProcessor(), getHttpRequestRetryHandler(), getRedirectStrategy(), getTargetAuthenticationStrategy(), getProxyAuthenticationStrategy(), getUserTokenHandler(), determineParams);
            routePlanner = getRoutePlanner();
            connectionBackoffStrategy = getConnectionBackoffStrategy();
            backoffManager = getBackoffManager();
        }
        try {
            if (connectionBackoffStrategy == null || backoffManager == null) {
                return CloseableHttpResponseProxy.newProxy(createClientRequestDirector.execute(httpHost, httpRequest, defaultedHttpContext));
            }
            HttpRoute determineRoute = routePlanner.determineRoute(httpHost != null ? httpHost : (HttpHost) determineParams(httpRequest).getParameter(ClientPNames.DEFAULT_HOST), httpRequest, defaultedHttpContext);
            try {
                CloseableHttpResponse newProxy = CloseableHttpResponseProxy.newProxy(createClientRequestDirector.execute(httpHost, httpRequest, defaultedHttpContext));
                if (connectionBackoffStrategy.shouldBackoff(newProxy)) {
                    backoffManager.backOff(determineRoute);
                } else {
                    backoffManager.probe(determineRoute);
                }
                return newProxy;
            } catch (RuntimeException e10) {
                if (connectionBackoffStrategy.shouldBackoff(e10)) {
                    backoffManager.backOff(determineRoute);
                }
                throw e10;
            } catch (Exception e11) {
                if (connectionBackoffStrategy.shouldBackoff(e11)) {
                    backoffManager.backOff(determineRoute);
                }
                if (e11 instanceof HttpException) {
                    throw ((HttpException) e11);
                }
                if (e11 instanceof IOException) {
                    throw ((IOException) e11);
                }
                throw new UndeclaredThrowableException(e11);
            }
        } catch (HttpException e12) {
            throw new ClientProtocolException(e12);
        }
    }

    public final AuthSchemeRegistry getAuthSchemes() {
        AuthSchemeRegistry authSchemeRegistry;
        synchronized (this) {
            if (this.supportedAuthSchemes == null) {
                this.supportedAuthSchemes = createAuthSchemeRegistry();
            }
            authSchemeRegistry = this.supportedAuthSchemes;
        }
        return authSchemeRegistry;
    }

    public final BackoffManager getBackoffManager() {
        BackoffManager backoffManager;
        synchronized (this) {
            backoffManager = this.backoffManager;
        }
        return backoffManager;
    }

    public final ConnectionBackoffStrategy getConnectionBackoffStrategy() {
        ConnectionBackoffStrategy connectionBackoffStrategy;
        synchronized (this) {
            connectionBackoffStrategy = this.connectionBackoffStrategy;
        }
        return connectionBackoffStrategy;
    }

    public final ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy() {
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy;
        synchronized (this) {
            if (this.keepAliveStrategy == null) {
                this.keepAliveStrategy = createConnectionKeepAliveStrategy();
            }
            connectionKeepAliveStrategy = this.keepAliveStrategy;
        }
        return connectionKeepAliveStrategy;
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        ClientConnectionManager clientConnectionManager;
        synchronized (this) {
            if (this.connManager == null) {
                this.connManager = createClientConnectionManager();
            }
            clientConnectionManager = this.connManager;
        }
        return clientConnectionManager;
    }

    public final ConnectionReuseStrategy getConnectionReuseStrategy() {
        ConnectionReuseStrategy connectionReuseStrategy;
        synchronized (this) {
            if (this.reuseStrategy == null) {
                this.reuseStrategy = createConnectionReuseStrategy();
            }
            connectionReuseStrategy = this.reuseStrategy;
        }
        return connectionReuseStrategy;
    }

    public final CookieSpecRegistry getCookieSpecs() {
        CookieSpecRegistry cookieSpecRegistry;
        synchronized (this) {
            if (this.supportedCookieSpecs == null) {
                this.supportedCookieSpecs = createCookieSpecRegistry();
            }
            cookieSpecRegistry = this.supportedCookieSpecs;
        }
        return cookieSpecRegistry;
    }

    public final CookieStore getCookieStore() {
        CookieStore cookieStore;
        synchronized (this) {
            if (this.cookieStore == null) {
                this.cookieStore = createCookieStore();
            }
            cookieStore = this.cookieStore;
        }
        return cookieStore;
    }

    public final CredentialsProvider getCredentialsProvider() {
        CredentialsProvider credentialsProvider;
        synchronized (this) {
            if (this.credsProvider == null) {
                this.credsProvider = createCredentialsProvider();
            }
            credentialsProvider = this.credsProvider;
        }
        return credentialsProvider;
    }

    public final BasicHttpProcessor getHttpProcessor() {
        BasicHttpProcessor basicHttpProcessor;
        synchronized (this) {
            if (this.mutableProcessor == null) {
                this.mutableProcessor = createHttpProcessor();
            }
            basicHttpProcessor = this.mutableProcessor;
        }
        return basicHttpProcessor;
    }

    public final HttpRequestRetryHandler getHttpRequestRetryHandler() {
        HttpRequestRetryHandler httpRequestRetryHandler;
        synchronized (this) {
            if (this.retryHandler == null) {
                this.retryHandler = createHttpRequestRetryHandler();
            }
            httpRequestRetryHandler = this.retryHandler;
        }
        return httpRequestRetryHandler;
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        HttpParams httpParams;
        synchronized (this) {
            if (this.defaultParams == null) {
                this.defaultParams = createHttpParams();
            }
            httpParams = this.defaultParams;
        }
        return httpParams;
    }

    @Deprecated
    public final AuthenticationHandler getProxyAuthenticationHandler() {
        AuthenticationHandler createProxyAuthenticationHandler;
        synchronized (this) {
            createProxyAuthenticationHandler = createProxyAuthenticationHandler();
        }
        return createProxyAuthenticationHandler;
    }

    public final AuthenticationStrategy getProxyAuthenticationStrategy() {
        AuthenticationStrategy authenticationStrategy;
        synchronized (this) {
            if (this.proxyAuthStrategy == null) {
                this.proxyAuthStrategy = createProxyAuthenticationStrategy();
            }
            authenticationStrategy = this.proxyAuthStrategy;
        }
        return authenticationStrategy;
    }

    @Deprecated
    public final RedirectHandler getRedirectHandler() {
        RedirectHandler createRedirectHandler;
        synchronized (this) {
            createRedirectHandler = createRedirectHandler();
        }
        return createRedirectHandler;
    }

    public final RedirectStrategy getRedirectStrategy() {
        RedirectStrategy redirectStrategy;
        synchronized (this) {
            if (this.redirectStrategy == null) {
                this.redirectStrategy = new DefaultRedirectStrategy();
            }
            redirectStrategy = this.redirectStrategy;
        }
        return redirectStrategy;
    }

    public final HttpRequestExecutor getRequestExecutor() {
        HttpRequestExecutor httpRequestExecutor;
        synchronized (this) {
            if (this.requestExec == null) {
                this.requestExec = createRequestExecutor();
            }
            httpRequestExecutor = this.requestExec;
        }
        return httpRequestExecutor;
    }

    public HttpRequestInterceptor getRequestInterceptor(int i10) {
        HttpRequestInterceptor requestInterceptor;
        synchronized (this) {
            requestInterceptor = getHttpProcessor().getRequestInterceptor(i10);
        }
        return requestInterceptor;
    }

    public int getRequestInterceptorCount() {
        int requestInterceptorCount;
        synchronized (this) {
            requestInterceptorCount = getHttpProcessor().getRequestInterceptorCount();
        }
        return requestInterceptorCount;
    }

    public HttpResponseInterceptor getResponseInterceptor(int i10) {
        HttpResponseInterceptor responseInterceptor;
        synchronized (this) {
            responseInterceptor = getHttpProcessor().getResponseInterceptor(i10);
        }
        return responseInterceptor;
    }

    public int getResponseInterceptorCount() {
        int responseInterceptorCount;
        synchronized (this) {
            responseInterceptorCount = getHttpProcessor().getResponseInterceptorCount();
        }
        return responseInterceptorCount;
    }

    public final HttpRoutePlanner getRoutePlanner() {
        HttpRoutePlanner httpRoutePlanner;
        synchronized (this) {
            if (this.routePlanner == null) {
                this.routePlanner = createHttpRoutePlanner();
            }
            httpRoutePlanner = this.routePlanner;
        }
        return httpRoutePlanner;
    }

    @Deprecated
    public final AuthenticationHandler getTargetAuthenticationHandler() {
        AuthenticationHandler createTargetAuthenticationHandler;
        synchronized (this) {
            createTargetAuthenticationHandler = createTargetAuthenticationHandler();
        }
        return createTargetAuthenticationHandler;
    }

    public final AuthenticationStrategy getTargetAuthenticationStrategy() {
        AuthenticationStrategy authenticationStrategy;
        synchronized (this) {
            if (this.targetAuthStrategy == null) {
                this.targetAuthStrategy = createTargetAuthenticationStrategy();
            }
            authenticationStrategy = this.targetAuthStrategy;
        }
        return authenticationStrategy;
    }

    public final UserTokenHandler getUserTokenHandler() {
        UserTokenHandler userTokenHandler;
        synchronized (this) {
            if (this.userTokenHandler == null) {
                this.userTokenHandler = createUserTokenHandler();
            }
            userTokenHandler = this.userTokenHandler;
        }
        return userTokenHandler;
    }

    public void removeRequestInterceptorByClass(Class<? extends HttpRequestInterceptor> cls) {
        synchronized (this) {
            getHttpProcessor().removeRequestInterceptorByClass(cls);
            this.protocolProcessor = null;
        }
    }

    public void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> cls) {
        synchronized (this) {
            getHttpProcessor().removeResponseInterceptorByClass(cls);
            this.protocolProcessor = null;
        }
    }

    public void setAuthSchemes(AuthSchemeRegistry authSchemeRegistry) {
        synchronized (this) {
            this.supportedAuthSchemes = authSchemeRegistry;
        }
    }

    public void setBackoffManager(BackoffManager backoffManager) {
        synchronized (this) {
            this.backoffManager = backoffManager;
        }
    }

    public void setConnectionBackoffStrategy(ConnectionBackoffStrategy connectionBackoffStrategy) {
        synchronized (this) {
            this.connectionBackoffStrategy = connectionBackoffStrategy;
        }
    }

    public void setCookieSpecs(CookieSpecRegistry cookieSpecRegistry) {
        synchronized (this) {
            this.supportedCookieSpecs = cookieSpecRegistry;
        }
    }

    public void setCookieStore(CookieStore cookieStore) {
        synchronized (this) {
            this.cookieStore = cookieStore;
        }
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        synchronized (this) {
            this.credsProvider = credentialsProvider;
        }
    }

    public void setHttpRequestRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        synchronized (this) {
            this.retryHandler = httpRequestRetryHandler;
        }
    }

    public void setKeepAliveStrategy(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        synchronized (this) {
            this.keepAliveStrategy = connectionKeepAliveStrategy;
        }
    }

    public void setParams(HttpParams httpParams) {
        synchronized (this) {
            this.defaultParams = httpParams;
        }
    }

    @Deprecated
    public void setProxyAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        synchronized (this) {
            this.proxyAuthStrategy = new AuthenticationStrategyAdaptor(authenticationHandler);
        }
    }

    public void setProxyAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        synchronized (this) {
            this.proxyAuthStrategy = authenticationStrategy;
        }
    }

    @Deprecated
    public void setRedirectHandler(RedirectHandler redirectHandler) {
        synchronized (this) {
            this.redirectStrategy = new DefaultRedirectStrategyAdaptor(redirectHandler);
        }
    }

    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        synchronized (this) {
            this.redirectStrategy = redirectStrategy;
        }
    }

    public void setReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        synchronized (this) {
            this.reuseStrategy = connectionReuseStrategy;
        }
    }

    public void setRoutePlanner(HttpRoutePlanner httpRoutePlanner) {
        synchronized (this) {
            this.routePlanner = httpRoutePlanner;
        }
    }

    @Deprecated
    public void setTargetAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        synchronized (this) {
            this.targetAuthStrategy = new AuthenticationStrategyAdaptor(authenticationHandler);
        }
    }

    public void setTargetAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        synchronized (this) {
            this.targetAuthStrategy = authenticationStrategy;
        }
    }

    public void setUserTokenHandler(UserTokenHandler userTokenHandler) {
        synchronized (this) {
            this.userTokenHandler = userTokenHandler;
        }
    }
}
