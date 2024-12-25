package org.apache.http.impl.execchain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/execchain/MainClientExec.class */
public class MainClientExec implements ClientExecChain {
    private final HttpAuthenticator authenticator;
    private final HttpClientConnectionManager connManager;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    private final AuthenticationStrategy proxyAuthStrategy;
    private final HttpProcessor proxyHttpProcessor;
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;
    private final HttpRouteDirector routeDirector;
    private final AuthenticationStrategy targetAuthStrategy;
    private final UserTokenHandler userTokenHandler;

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, new ImmutableHttpProcessor(new RequestTargetHost()), authenticationStrategy, authenticationStrategy2, userTokenHandler);
    }

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpProcessor, "Proxy HTTP processor");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler, "User token handler");
        this.authenticator = new HttpAuthenticator();
        this.routeDirector = new BasicRouteDirector();
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.proxyHttpProcessor = httpProcessor;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler;
    }

    private boolean createTunnelToProxy(HttpRoute httpRoute, int i10, HttpClientContext httpClientContext) {
        throw new HttpException("Proxy chains are not supported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        if (r7.reuseStrategy.keepAlive(r11, r12) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0111, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f9, code lost:
    
        r7.log.debug("Connection kept alive");
        org.apache.http.util.EntityUtils.consume(r11.getEntity());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean createTunnelToTarget(org.apache.http.auth.AuthState r8, org.apache.http.HttpClientConnection r9, org.apache.http.conn.routing.HttpRoute r10, org.apache.http.HttpRequest r11, org.apache.http.client.protocol.HttpClientContext r12) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.createTunnelToTarget(org.apache.http.auth.AuthState, org.apache.http.HttpClientConnection, org.apache.http.conn.routing.HttpRoute, org.apache.http.HttpRequest, org.apache.http.client.protocol.HttpClientContext):boolean");
    }

    private boolean needAuthentication(AuthState authState, AuthState authState2, HttpRoute httpRoute, HttpResponse httpResponse, HttpClientContext httpClientContext) {
        if (!httpClientContext.getRequestConfig().isAuthenticationEnabled()) {
            return false;
        }
        HttpHost targetHost = httpClientContext.getTargetHost();
        HttpHost httpHost = targetHost;
        if (targetHost == null) {
            httpHost = httpRoute.getTargetHost();
        }
        HttpHost httpHost2 = httpHost;
        if (httpHost.getPort() < 0) {
            httpHost2 = new HttpHost(httpHost.getHostName(), httpRoute.getTargetHost().getPort(), httpHost.getSchemeName());
        }
        boolean isAuthenticationRequested = this.authenticator.isAuthenticationRequested(httpHost2, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpHost httpHost3 = proxyHost;
        if (proxyHost == null) {
            httpHost3 = httpRoute.getTargetHost();
        }
        boolean isAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(httpHost3, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
        if (isAuthenticationRequested) {
            return this.authenticator.handleAuthChallenge(httpHost2, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
        }
        if (isAuthenticationRequested2) {
            return this.authenticator.handleAuthChallenge(httpHost3, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
        }
        return false;
    }

    public void establishRoute(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) {
        int nextStep;
        int connectTimeout = httpClientContext.getRequestConfig().getConnectTimeout();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            nextStep = this.routeDirector.nextStep(httpRoute, route);
            int i10 = 0;
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.connManager.routeComplete(httpClientConnection, httpRoute, httpClientContext);
                    break;
                case 1:
                    HttpClientConnectionManager httpClientConnectionManager = this.connManager;
                    if (connectTimeout > 0) {
                        i10 = connectTimeout;
                    }
                    httpClientConnectionManager.connect(httpClientConnection, httpRoute, i10, httpClientContext);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    break;
                case 2:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), false);
                    break;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(authState, httpClientConnection, httpRoute, httpRequest, httpClientContext);
                    this.log.debug("Tunnel to target created.");
                    routeTracker.tunnelTarget(createTunnelToTarget);
                    break;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean createTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpClientContext);
                    this.log.debug("Tunnel to proxy created.");
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), createTunnelToProxy);
                    break;
                case 5:
                    this.connManager.upgrade(httpClientConnection, httpRoute, httpClientContext);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    break;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06f4  */
    /* JADX WARN: Type inference failed for: r0v321, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v0, types: [org.apache.http.client.methods.HttpExecutionAware] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, org.apache.http.HttpRequest, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.message.AbstractHttpMessage] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r8, org.apache.http.client.methods.HttpRequestWrapper r9, org.apache.http.client.protocol.HttpClientContext r10, org.apache.http.client.methods.HttpExecutionAware r11) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }
}
