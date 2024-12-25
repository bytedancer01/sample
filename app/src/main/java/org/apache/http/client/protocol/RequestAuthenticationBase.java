package org.apache.http.client.protocol;

import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/RequestAuthenticationBase.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/RequestAuthenticationBase.class */
abstract class RequestAuthenticationBase implements HttpRequestInterceptor {
    public final Log log = LogFactory.getLog(getClass());

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/client/protocol/RequestAuthenticationBase$1.class
     */
    /* renamed from: org.apache.http.client.protocol.RequestAuthenticationBase$1 */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/RequestAuthenticationBase$1.class */
    public static /* synthetic */ class C70331 {
        public static final int[] $SwitchMap$org$apache$http$auth$AuthProtocolState;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
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
                org.apache.http.client.protocol.RequestAuthenticationBase.C70331.$SwitchMap$org$apache$http$auth$AuthProtocolState = r0
                r0 = r4
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.FAILURE     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = org.apache.http.client.protocol.RequestAuthenticationBase.C70331.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = org.apache.http.client.protocol.RequestAuthenticationBase.C70331.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.protocol.RequestAuthenticationBase.C70331.m45279clinit():void");
        }
    }

    private Header authenticate(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        Asserts.notNull(authScheme, "Auth scheme");
        return authScheme instanceof ContextAwareAuthScheme ? ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext) : authScheme.authenticate(credentials, httpRequest);
    }

    private void ensureAuthScheme(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    public void process(AuthState authState, HttpRequest httpRequest, HttpContext httpContext) {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i10 = C70331.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                ensureAuthScheme(authScheme);
                if (authScheme.isConnectionBased()) {
                    return;
                }
            } else if (i10 == 3) {
                Queue<AuthOption> authOptions = authState.getAuthOptions();
                if (authOptions != null) {
                    while (!authOptions.isEmpty()) {
                        AuthOption remove = authOptions.remove();
                        AuthScheme authScheme2 = remove.getAuthScheme();
                        Credentials credentials2 = remove.getCredentials();
                        authState.update(authScheme2, credentials2);
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Generating response to an authentication challenge using " + authScheme2.getSchemeName() + " scheme");
                        }
                        try {
                            httpRequest.addHeader(authenticate(authScheme2, credentials2, httpRequest, httpContext));
                            return;
                        } catch (AuthenticationException e10) {
                            if (this.log.isWarnEnabled()) {
                                this.log.warn(authScheme2 + " authentication error: " + e10.getMessage());
                            }
                        }
                    }
                    return;
                }
                ensureAuthScheme(authScheme);
            }
            if (authScheme != null) {
                try {
                    httpRequest.addHeader(authenticate(authScheme, credentials, httpRequest, httpContext));
                } catch (AuthenticationException e11) {
                    if (this.log.isErrorEnabled()) {
                        this.log.error(authScheme + " authentication error: " + e11.getMessage());
                    }
                }
            }
        }
    }
}
