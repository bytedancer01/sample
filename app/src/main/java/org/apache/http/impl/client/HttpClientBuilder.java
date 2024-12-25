package org.apache.http.impl.client;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.Closeable;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.InputStreamFactory;
import org.apache.http.client.protocol.RequestAcceptEncoding;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestAuthCache;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.client.protocol.RequestExpectContinue;
import org.apache.http.client.protocol.ResponseContentEncoding;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.DefaultRoutePlanner;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.impl.execchain.BackoffStrategyExec;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.impl.execchain.MainClientExec;
import org.apache.http.impl.execchain.ProtocolExec;
import org.apache.http.impl.execchain.RedirectExec;
import org.apache.http.impl.execchain.RetryExec;
import org.apache.http.impl.execchain.ServiceUnavailableRetryExec;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpProcessorBuilder;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.TextUtils;
import org.apache.http.util.VersionInfo;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/HttpClientBuilder.class */
public class HttpClientBuilder {
    private boolean authCachingDisabled;
    private Lookup<AuthSchemeProvider> authSchemeRegistry;
    private boolean automaticRetriesDisabled;
    private BackoffManager backoffManager;
    private List<Closeable> closeables;
    private HttpClientConnectionManager connManager;
    private boolean connManagerShared;
    private ConnectionBackoffStrategy connectionBackoffStrategy;
    private boolean connectionStateDisabled;
    private boolean contentCompressionDisabled;
    private Map<String, InputStreamFactory> contentDecoderMap;
    private boolean cookieManagementDisabled;
    private Lookup<CookieSpecProvider> cookieSpecRegistry;
    private CookieStore cookieStore;
    private CredentialsProvider credentialsProvider;
    private ConnectionConfig defaultConnectionConfig;
    private Collection<? extends Header> defaultHeaders;
    private RequestConfig defaultRequestConfig;
    private SocketConfig defaultSocketConfig;
    private DnsResolver dnsResolver;
    private boolean evictExpiredConnections;
    private boolean evictIdleConnections;
    private HostnameVerifier hostnameVerifier;
    private HttpProcessor httpprocessor;
    private ConnectionKeepAliveStrategy keepAliveStrategy;
    private long maxIdleTime;
    private TimeUnit maxIdleTimeUnit;
    private HttpHost proxy;
    private AuthenticationStrategy proxyAuthStrategy;
    private PublicSuffixMatcher publicSuffixMatcher;
    private boolean redirectHandlingDisabled;
    private RedirectStrategy redirectStrategy;
    private HttpRequestExecutor requestExec;
    private LinkedList<HttpRequestInterceptor> requestFirst;
    private LinkedList<HttpRequestInterceptor> requestLast;
    private LinkedList<HttpResponseInterceptor> responseFirst;
    private LinkedList<HttpResponseInterceptor> responseLast;
    private HttpRequestRetryHandler retryHandler;
    private ConnectionReuseStrategy reuseStrategy;
    private HttpRoutePlanner routePlanner;
    private SchemePortResolver schemePortResolver;
    private ServiceUnavailableRetryStrategy serviceUnavailStrategy;
    private SSLContext sslContext;
    private LayeredConnectionSocketFactory sslSocketFactory;
    private boolean systemProperties;
    private AuthenticationStrategy targetAuthStrategy;
    private String userAgent;
    private UserTokenHandler userTokenHandler;
    private int maxConnTotal = 0;
    private int maxConnPerRoute = 0;
    private long connTimeToLive = -1;
    private TimeUnit connTimeToLiveTimeUnit = TimeUnit.MILLISECONDS;

    public static HttpClientBuilder create() {
        return new HttpClientBuilder();
    }

    private static String[] split(String str) {
        if (TextUtils.isBlank(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public void addCloseable(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        if (this.closeables == null) {
            this.closeables = new ArrayList();
        }
        this.closeables.add(closeable);
    }

    public final HttpClientBuilder addInterceptorFirst(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.requestFirst == null) {
            this.requestFirst = new LinkedList<>();
        }
        this.requestFirst.addFirst(httpRequestInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorFirst(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.responseFirst == null) {
            this.responseFirst = new LinkedList<>();
        }
        this.responseFirst.addFirst(httpResponseInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorLast(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return this;
        }
        if (this.requestLast == null) {
            this.requestLast = new LinkedList<>();
        }
        this.requestLast.addLast(httpRequestInterceptor);
        return this;
    }

    public final HttpClientBuilder addInterceptorLast(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return this;
        }
        if (this.responseLast == null) {
            this.responseLast = new LinkedList<>();
        }
        this.responseLast.addLast(httpResponseInterceptor);
        return this;
    }

    public CloseableHttpClient build() {
        PublicSuffixMatcher publicSuffixMatcher = this.publicSuffixMatcher;
        PublicSuffixMatcher publicSuffixMatcher2 = publicSuffixMatcher;
        if (publicSuffixMatcher == null) {
            publicSuffixMatcher2 = PublicSuffixMatcherLoader.getDefault();
        }
        HttpRequestExecutor httpRequestExecutor = this.requestExec;
        HttpRequestExecutor httpRequestExecutor2 = httpRequestExecutor;
        if (httpRequestExecutor == null) {
            httpRequestExecutor2 = new HttpRequestExecutor();
        }
        HttpClientConnectionManager httpClientConnectionManager = this.connManager;
        HttpClientConnectionManager httpClientConnectionManager2 = httpClientConnectionManager;
        if (httpClientConnectionManager == null) {
            LayeredConnectionSocketFactory layeredConnectionSocketFactory = this.sslSocketFactory;
            LayeredConnectionSocketFactory layeredConnectionSocketFactory2 = layeredConnectionSocketFactory;
            if (layeredConnectionSocketFactory == null) {
                String[] split = this.systemProperties ? split(System.getProperty("https.protocols")) : null;
                String[] split2 = this.systemProperties ? split(System.getProperty("https.cipherSuites")) : null;
                HostnameVerifier hostnameVerifier = this.hostnameVerifier;
                HostnameVerifier hostnameVerifier2 = hostnameVerifier;
                if (hostnameVerifier == null) {
                    hostnameVerifier2 = new DefaultHostnameVerifier(publicSuffixMatcher2);
                }
                layeredConnectionSocketFactory2 = this.sslContext != null ? new SSLConnectionSocketFactory(this.sslContext, split, split2, hostnameVerifier2) : this.systemProperties ? new SSLConnectionSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault(), split, split2, hostnameVerifier2) : new SSLConnectionSocketFactory(SSLContexts.createDefault(), hostnameVerifier2);
            }
            Registry build = RegistryBuilder.create().register(HttpHost.DEFAULT_SCHEME_NAME, PlainConnectionSocketFactory.getSocketFactory()).register(ClientConstants.DOMAIN_SCHEME, layeredConnectionSocketFactory2).build();
            DnsResolver dnsResolver = this.dnsResolver;
            long j10 = this.connTimeToLive;
            TimeUnit timeUnit = this.connTimeToLiveTimeUnit;
            if (timeUnit == null) {
                timeUnit = TimeUnit.MILLISECONDS;
            }
            PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(build, null, null, dnsResolver, j10, timeUnit);
            SocketConfig socketConfig = this.defaultSocketConfig;
            if (socketConfig != null) {
                poolingHttpClientConnectionManager.setDefaultSocketConfig(socketConfig);
            }
            ConnectionConfig connectionConfig = this.defaultConnectionConfig;
            if (connectionConfig != null) {
                poolingHttpClientConnectionManager.setDefaultConnectionConfig(connectionConfig);
            }
            if (this.systemProperties && "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) {
                int parseInt = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
                poolingHttpClientConnectionManager.setDefaultMaxPerRoute(parseInt);
                poolingHttpClientConnectionManager.setMaxTotal(parseInt * 2);
            }
            int i10 = this.maxConnTotal;
            if (i10 > 0) {
                poolingHttpClientConnectionManager.setMaxTotal(i10);
            }
            int i11 = this.maxConnPerRoute;
            httpClientConnectionManager2 = poolingHttpClientConnectionManager;
            if (i11 > 0) {
                poolingHttpClientConnectionManager.setDefaultMaxPerRoute(i11);
                httpClientConnectionManager2 = poolingHttpClientConnectionManager;
            }
        }
        ConnectionReuseStrategy connectionReuseStrategy = this.reuseStrategy;
        ConnectionReuseStrategy connectionReuseStrategy2 = connectionReuseStrategy;
        if (connectionReuseStrategy == null) {
            connectionReuseStrategy2 = (!this.systemProperties || "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) ? DefaultClientConnectionReuseStrategy.INSTANCE : NoConnectionReuseStrategy.INSTANCE;
        }
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy = this.keepAliveStrategy;
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy2 = connectionKeepAliveStrategy;
        if (connectionKeepAliveStrategy == null) {
            connectionKeepAliveStrategy2 = DefaultConnectionKeepAliveStrategy.INSTANCE;
        }
        AuthenticationStrategy authenticationStrategy = this.targetAuthStrategy;
        AuthenticationStrategy authenticationStrategy2 = authenticationStrategy;
        if (authenticationStrategy == null) {
            authenticationStrategy2 = TargetAuthenticationStrategy.INSTANCE;
        }
        AuthenticationStrategy authenticationStrategy3 = this.proxyAuthStrategy;
        AuthenticationStrategy authenticationStrategy4 = authenticationStrategy3;
        if (authenticationStrategy3 == null) {
            authenticationStrategy4 = ProxyAuthenticationStrategy.INSTANCE;
        }
        UserTokenHandler userTokenHandler = this.userTokenHandler;
        UserTokenHandler userTokenHandler2 = userTokenHandler;
        if (userTokenHandler == null) {
            userTokenHandler2 = !this.connectionStateDisabled ? DefaultUserTokenHandler.INSTANCE : NoopUserTokenHandler.INSTANCE;
        }
        String str = this.userAgent;
        String str2 = str;
        if (str == null) {
            if (this.systemProperties) {
                str = System.getProperty("http.agent");
            }
            str2 = str;
            if (str == null) {
                str2 = VersionInfo.getUserAgent("Apache-HttpClient", "org.apache.http.client", getClass());
            }
        }
        ClientExecChain decorateMainExec = decorateMainExec(createMainExec(httpRequestExecutor2, httpClientConnectionManager2, connectionReuseStrategy2, connectionKeepAliveStrategy2, new ImmutableHttpProcessor(new RequestTargetHost(), new RequestUserAgent(str2)), authenticationStrategy2, authenticationStrategy4, userTokenHandler2));
        HttpProcessor httpProcessor = this.httpprocessor;
        HttpProcessor httpProcessor2 = httpProcessor;
        if (httpProcessor == null) {
            HttpProcessorBuilder create = HttpProcessorBuilder.create();
            LinkedList<HttpRequestInterceptor> linkedList = this.requestFirst;
            if (linkedList != null) {
                Iterator<HttpRequestInterceptor> it = linkedList.iterator();
                while (it.hasNext()) {
                    create.addFirst(it.next());
                }
            }
            LinkedList<HttpResponseInterceptor> linkedList2 = this.responseFirst;
            if (linkedList2 != null) {
                Iterator<HttpResponseInterceptor> it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    create.addFirst(it2.next());
                }
            }
            create.addAll(new RequestDefaultHeaders(this.defaultHeaders), new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(str2), new RequestExpectContinue());
            if (!this.cookieManagementDisabled) {
                create.add(new RequestAddCookies());
            }
            if (!this.contentCompressionDisabled) {
                if (this.contentDecoderMap != null) {
                    ArrayList arrayList = new ArrayList(this.contentDecoderMap.keySet());
                    Collections.sort(arrayList);
                    create.add(new RequestAcceptEncoding(arrayList));
                } else {
                    create.add(new RequestAcceptEncoding());
                }
            }
            if (!this.authCachingDisabled) {
                create.add(new RequestAuthCache());
            }
            if (!this.cookieManagementDisabled) {
                create.add(new ResponseProcessCookies());
            }
            if (!this.contentCompressionDisabled) {
                if (this.contentDecoderMap != null) {
                    RegistryBuilder create2 = RegistryBuilder.create();
                    for (Map.Entry<String, InputStreamFactory> entry : this.contentDecoderMap.entrySet()) {
                        create2.register(entry.getKey(), entry.getValue());
                    }
                    create.add(new ResponseContentEncoding(create2.build()));
                } else {
                    create.add(new ResponseContentEncoding());
                }
            }
            LinkedList<HttpRequestInterceptor> linkedList3 = this.requestLast;
            if (linkedList3 != null) {
                Iterator<HttpRequestInterceptor> it3 = linkedList3.iterator();
                while (it3.hasNext()) {
                    create.addLast(it3.next());
                }
            }
            LinkedList<HttpResponseInterceptor> linkedList4 = this.responseLast;
            if (linkedList4 != null) {
                Iterator<HttpResponseInterceptor> it4 = linkedList4.iterator();
                while (it4.hasNext()) {
                    create.addLast(it4.next());
                }
            }
            httpProcessor2 = create.build();
        }
        ClientExecChain decorateProtocolExec = decorateProtocolExec(new ProtocolExec(decorateMainExec, httpProcessor2));
        ClientExecChain clientExecChain = decorateProtocolExec;
        if (!this.automaticRetriesDisabled) {
            HttpRequestRetryHandler httpRequestRetryHandler = this.retryHandler;
            HttpRequestRetryHandler httpRequestRetryHandler2 = httpRequestRetryHandler;
            if (httpRequestRetryHandler == null) {
                httpRequestRetryHandler2 = DefaultHttpRequestRetryHandler.INSTANCE;
            }
            clientExecChain = new RetryExec(decorateProtocolExec, httpRequestRetryHandler2);
        }
        HttpRoutePlanner httpRoutePlanner = this.routePlanner;
        if (httpRoutePlanner == null) {
            SchemePortResolver schemePortResolver = this.schemePortResolver;
            SchemePortResolver schemePortResolver2 = schemePortResolver;
            if (schemePortResolver == null) {
                schemePortResolver2 = DefaultSchemePortResolver.INSTANCE;
            }
            HttpHost httpHost = this.proxy;
            httpRoutePlanner = httpHost != null ? new DefaultProxyRoutePlanner(httpHost, schemePortResolver2) : this.systemProperties ? new SystemDefaultRoutePlanner(schemePortResolver2, ProxySelector.getDefault()) : new DefaultRoutePlanner(schemePortResolver2);
        }
        ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy = this.serviceUnavailStrategy;
        ClientExecChain clientExecChain2 = clientExecChain;
        if (serviceUnavailableRetryStrategy != null) {
            clientExecChain2 = new ServiceUnavailableRetryExec(clientExecChain, serviceUnavailableRetryStrategy);
        }
        ClientExecChain clientExecChain3 = clientExecChain2;
        if (!this.redirectHandlingDisabled) {
            RedirectStrategy redirectStrategy = this.redirectStrategy;
            RedirectStrategy redirectStrategy2 = redirectStrategy;
            if (redirectStrategy == null) {
                redirectStrategy2 = DefaultRedirectStrategy.INSTANCE;
            }
            clientExecChain3 = new RedirectExec(clientExecChain2, httpRoutePlanner, redirectStrategy2);
        }
        BackoffManager backoffManager = this.backoffManager;
        ClientExecChain clientExecChain4 = clientExecChain3;
        if (backoffManager != null) {
            ConnectionBackoffStrategy connectionBackoffStrategy = this.connectionBackoffStrategy;
            clientExecChain4 = clientExecChain3;
            if (connectionBackoffStrategy != null) {
                clientExecChain4 = new BackoffStrategyExec(clientExecChain3, connectionBackoffStrategy, backoffManager);
            }
        }
        Lookup<AuthSchemeProvider> lookup = this.authSchemeRegistry;
        Lookup<AuthSchemeProvider> lookup2 = lookup;
        if (lookup == null) {
            lookup2 = RegistryBuilder.create().register("Basic", new BasicSchemeFactory()).register("Digest", new DigestSchemeFactory()).register("NTLM", new NTLMSchemeFactory()).register("Negotiate", new SPNegoSchemeFactory()).register("Kerberos", new KerberosSchemeFactory()).build();
        }
        Lookup<CookieSpecProvider> lookup3 = this.cookieSpecRegistry;
        Lookup<CookieSpecProvider> lookup4 = lookup3;
        if (lookup3 == null) {
            lookup4 = CookieSpecRegistries.createDefault(publicSuffixMatcher2);
        }
        CookieStore cookieStore = this.cookieStore;
        CookieStore cookieStore2 = cookieStore;
        if (cookieStore == null) {
            cookieStore2 = new BasicCookieStore();
        }
        CredentialsProvider credentialsProvider = this.credentialsProvider;
        CredentialsProvider credentialsProvider2 = credentialsProvider;
        if (credentialsProvider == null) {
            credentialsProvider2 = this.systemProperties ? new SystemDefaultCredentialsProvider() : new BasicCredentialsProvider();
        }
        ArrayList arrayList2 = this.closeables != null ? new ArrayList(this.closeables) : null;
        if (!this.connManagerShared) {
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(1);
            }
            if (this.evictExpiredConnections || this.evictIdleConnections) {
                long j11 = this.maxIdleTime;
                long j12 = j11 > 0 ? j11 : 10L;
                TimeUnit timeUnit2 = this.maxIdleTimeUnit;
                IdleConnectionEvictor idleConnectionEvictor = new IdleConnectionEvictor(httpClientConnectionManager2, j12, timeUnit2 != null ? timeUnit2 : TimeUnit.SECONDS, j11, timeUnit2);
                arrayList2.add(new Closeable(this, idleConnectionEvictor) { // from class: org.apache.http.impl.client.HttpClientBuilder.1
                    public final HttpClientBuilder this$0;
                    public final IdleConnectionEvictor val$connectionEvictor;

                    {
                        this.this$0 = this;
                        this.val$connectionEvictor = idleConnectionEvictor;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        this.val$connectionEvictor.shutdown();
                        try {
                            this.val$connectionEvictor.awaitTermination(1L, TimeUnit.SECONDS);
                        } catch (InterruptedException e10) {
                            Thread.currentThread().interrupt();
                        }
                    }
                });
                idleConnectionEvictor.start();
            }
            arrayList2.add(new Closeable(this, httpClientConnectionManager2) { // from class: org.apache.http.impl.client.HttpClientBuilder.2
                public final HttpClientBuilder this$0;
                public final HttpClientConnectionManager val$cm;

                {
                    this.this$0 = this;
                    this.val$cm = httpClientConnectionManager2;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.val$cm.shutdown();
                }
            });
        }
        RequestConfig requestConfig = this.defaultRequestConfig;
        if (requestConfig == null) {
            requestConfig = RequestConfig.DEFAULT;
        }
        return new InternalHttpClient(clientExecChain4, httpClientConnectionManager2, httpRoutePlanner, lookup4, lookup2, cookieStore2, credentialsProvider2, requestConfig, arrayList2);
    }

    public ClientExecChain createMainExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        return new MainClientExec(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpProcessor, authenticationStrategy, authenticationStrategy2, userTokenHandler);
    }

    public ClientExecChain decorateMainExec(ClientExecChain clientExecChain) {
        return clientExecChain;
    }

    public ClientExecChain decorateProtocolExec(ClientExecChain clientExecChain) {
        return clientExecChain;
    }

    public final HttpClientBuilder disableAuthCaching() {
        this.authCachingDisabled = true;
        return this;
    }

    public final HttpClientBuilder disableAutomaticRetries() {
        this.automaticRetriesDisabled = true;
        return this;
    }

    public final HttpClientBuilder disableConnectionState() {
        this.connectionStateDisabled = true;
        return this;
    }

    public final HttpClientBuilder disableContentCompression() {
        this.contentCompressionDisabled = true;
        return this;
    }

    public final HttpClientBuilder disableCookieManagement() {
        this.cookieManagementDisabled = true;
        return this;
    }

    public final HttpClientBuilder disableRedirectHandling() {
        this.redirectHandlingDisabled = true;
        return this;
    }

    public final HttpClientBuilder evictExpiredConnections() {
        this.evictExpiredConnections = true;
        return this;
    }

    public final HttpClientBuilder evictIdleConnections(long j10, TimeUnit timeUnit) {
        this.evictIdleConnections = true;
        this.maxIdleTime = j10;
        this.maxIdleTimeUnit = timeUnit;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder evictIdleConnections(Long l10, TimeUnit timeUnit) {
        return evictIdleConnections(l10.longValue(), timeUnit);
    }

    public final HttpClientBuilder setBackoffManager(BackoffManager backoffManager) {
        this.backoffManager = backoffManager;
        return this;
    }

    public final HttpClientBuilder setConnectionBackoffStrategy(ConnectionBackoffStrategy connectionBackoffStrategy) {
        this.connectionBackoffStrategy = connectionBackoffStrategy;
        return this;
    }

    public final HttpClientBuilder setConnectionManager(HttpClientConnectionManager httpClientConnectionManager) {
        this.connManager = httpClientConnectionManager;
        return this;
    }

    public final HttpClientBuilder setConnectionManagerShared(boolean z10) {
        this.connManagerShared = z10;
        return this;
    }

    public final HttpClientBuilder setConnectionReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        this.reuseStrategy = connectionReuseStrategy;
        return this;
    }

    public final HttpClientBuilder setConnectionTimeToLive(long j10, TimeUnit timeUnit) {
        this.connTimeToLive = j10;
        this.connTimeToLiveTimeUnit = timeUnit;
        return this;
    }

    public final HttpClientBuilder setContentDecoderRegistry(Map<String, InputStreamFactory> map) {
        this.contentDecoderMap = map;
        return this;
    }

    public final HttpClientBuilder setDefaultAuthSchemeRegistry(Lookup<AuthSchemeProvider> lookup) {
        this.authSchemeRegistry = lookup;
        return this;
    }

    public final HttpClientBuilder setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
        this.defaultConnectionConfig = connectionConfig;
        return this;
    }

    public final HttpClientBuilder setDefaultCookieSpecRegistry(Lookup<CookieSpecProvider> lookup) {
        this.cookieSpecRegistry = lookup;
        return this;
    }

    public final HttpClientBuilder setDefaultCookieStore(CookieStore cookieStore) {
        this.cookieStore = cookieStore;
        return this;
    }

    public final HttpClientBuilder setDefaultCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
        return this;
    }

    public final HttpClientBuilder setDefaultHeaders(Collection<? extends Header> collection) {
        this.defaultHeaders = collection;
        return this;
    }

    public final HttpClientBuilder setDefaultRequestConfig(RequestConfig requestConfig) {
        this.defaultRequestConfig = requestConfig;
        return this;
    }

    public final HttpClientBuilder setDefaultSocketConfig(SocketConfig socketConfig) {
        this.defaultSocketConfig = socketConfig;
        return this;
    }

    public final HttpClientBuilder setDnsResolver(DnsResolver dnsResolver) {
        this.dnsResolver = dnsResolver;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        this.hostnameVerifier = x509HostnameVerifier;
        return this;
    }

    public final HttpClientBuilder setHttpProcessor(HttpProcessor httpProcessor) {
        this.httpprocessor = httpProcessor;
        return this;
    }

    public final HttpClientBuilder setKeepAliveStrategy(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        return this;
    }

    public final HttpClientBuilder setMaxConnPerRoute(int i10) {
        this.maxConnPerRoute = i10;
        return this;
    }

    public final HttpClientBuilder setMaxConnTotal(int i10) {
        this.maxConnTotal = i10;
        return this;
    }

    public final HttpClientBuilder setProxy(HttpHost httpHost) {
        this.proxy = httpHost;
        return this;
    }

    public final HttpClientBuilder setProxyAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.proxyAuthStrategy = authenticationStrategy;
        return this;
    }

    public final HttpClientBuilder setPublicSuffixMatcher(PublicSuffixMatcher publicSuffixMatcher) {
        this.publicSuffixMatcher = publicSuffixMatcher;
        return this;
    }

    public final HttpClientBuilder setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
        return this;
    }

    public final HttpClientBuilder setRequestExecutor(HttpRequestExecutor httpRequestExecutor) {
        this.requestExec = httpRequestExecutor;
        return this;
    }

    public final HttpClientBuilder setRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.retryHandler = httpRequestRetryHandler;
        return this;
    }

    public final HttpClientBuilder setRoutePlanner(HttpRoutePlanner httpRoutePlanner) {
        this.routePlanner = httpRoutePlanner;
        return this;
    }

    public final HttpClientBuilder setSSLContext(SSLContext sSLContext) {
        this.sslContext = sSLContext;
        return this;
    }

    public final HttpClientBuilder setSSLHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
        return this;
    }

    public final HttpClientBuilder setSSLSocketFactory(LayeredConnectionSocketFactory layeredConnectionSocketFactory) {
        this.sslSocketFactory = layeredConnectionSocketFactory;
        return this;
    }

    public final HttpClientBuilder setSchemePortResolver(SchemePortResolver schemePortResolver) {
        this.schemePortResolver = schemePortResolver;
        return this;
    }

    public final HttpClientBuilder setServiceUnavailableRetryStrategy(ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        this.serviceUnavailStrategy = serviceUnavailableRetryStrategy;
        return this;
    }

    @Deprecated
    public final HttpClientBuilder setSslcontext(SSLContext sSLContext) {
        return setSSLContext(sSLContext);
    }

    public final HttpClientBuilder setTargetAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.targetAuthStrategy = authenticationStrategy;
        return this;
    }

    public final HttpClientBuilder setUserAgent(String str) {
        this.userAgent = str;
        return this;
    }

    public final HttpClientBuilder setUserTokenHandler(UserTokenHandler userTokenHandler) {
        this.userTokenHandler = userTokenHandler;
        return this;
    }

    public final HttpClientBuilder useSystemProperties() {
        this.systemProperties = true;
        return this;
    }
}
