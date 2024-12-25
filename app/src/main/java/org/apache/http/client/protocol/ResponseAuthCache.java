package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/ResponseAuthCache.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/ResponseAuthCache.class */
public class ResponseAuthCache implements HttpResponseInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/client/protocol/ResponseAuthCache$1.class
     */
    /* renamed from: org.apache.http.client.protocol.ResponseAuthCache$1 */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/ResponseAuthCache$1.class */
    public static /* synthetic */ class C70341 {
        public static final int[] $SwitchMap$org$apache$http$auth$AuthProtocolState;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.apache.http.auth.AuthProtocolState[] r0 = org.apache.http.auth.AuthProtocolState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.http.client.protocol.ResponseAuthCache.C70341.$SwitchMap$org$apache$http$auth$AuthProtocolState = r0
                r0 = r4
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.apache.http.client.protocol.ResponseAuthCache.C70341.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.FAILURE     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.protocol.ResponseAuthCache.C70341.m45280clinit():void");
        }
    }

    private void cache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.put(httpHost, authScheme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r0.equalsIgnoreCase("Digest") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isCachable(org.apache.http.auth.AuthState r4) {
        /*
            r3 = this;
            r0 = r4
            org.apache.http.auth.AuthScheme r0 = r0.getAuthScheme()
            r4 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L38
            r0 = r4
            boolean r0 = r0.isComplete()
            if (r0 != 0) goto L1b
            r0 = r6
            r5 = r0
            goto L38
        L1b:
            r0 = r4
            java.lang.String r0 = r0.getSchemeName()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "Basic"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L36
            r0 = r6
            r5 = r0
            r0 = r4
            java.lang.String r1 = "Digest"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L38
        L36:
            r0 = 1
            r5 = r0
        L38:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.protocol.ResponseAuthCache.isCachable(org.apache.http.auth.AuthState):boolean");
    }

    private void uncache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Removing from cache '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.remove(httpHost);
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        AuthCache authCache = (AuthCache) httpContext.getAttribute("http.auth.auth-cache");
        HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        AuthCache authCache2 = authCache;
        if (httpHost != null) {
            authCache2 = authCache;
            if (authState != null) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Target auth state: " + authState.getState());
                }
                authCache2 = authCache;
                if (isCachable(authState)) {
                    SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute(ClientContext.SCHEME_REGISTRY);
                    HttpHost httpHost2 = httpHost;
                    if (httpHost.getPort() < 0) {
                        httpHost2 = new HttpHost(httpHost.getHostName(), schemeRegistry.getScheme(httpHost).resolvePort(httpHost.getPort()), httpHost.getSchemeName());
                    }
                    authCache2 = authCache;
                    if (authCache == null) {
                        authCache2 = new BasicAuthCache();
                        httpContext.setAttribute("http.auth.auth-cache", authCache2);
                    }
                    int i10 = C70341.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
                    if (i10 == 1) {
                        cache(authCache2, httpHost2, authState.getAuthScheme());
                    } else if (i10 == 2) {
                        uncache(authCache2, httpHost2, authState.getAuthScheme());
                    }
                }
            }
        }
        HttpHost httpHost3 = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_PROXY_HOST);
        AuthState authState2 = (AuthState) httpContext.getAttribute("http.auth.proxy-scope");
        if (httpHost3 == null || authState2 == null) {
            return;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Proxy auth state: " + authState2.getState());
        }
        if (isCachable(authState2)) {
            AuthCache authCache3 = authCache2;
            if (authCache2 == null) {
                authCache3 = new BasicAuthCache();
                httpContext.setAttribute("http.auth.auth-cache", authCache3);
            }
            int i11 = C70341.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState2.getState().ordinal()];
            if (i11 == 1) {
                cache(authCache3, httpHost3, authState2.getAuthScheme());
            } else {
                if (i11 != 2) {
                    return;
                }
                uncache(authCache3, httpHost3, authState2.getAuthScheme());
            }
        }
    }
}
