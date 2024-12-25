package org.apache.http.impl.auth;

import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/HttpAuthenticator.class */
public class HttpAuthenticator {
    private final Log log;

    /* renamed from: org.apache.http.impl.auth.HttpAuthenticator$1 */
    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/HttpAuthenticator$1.class */
    public static /* synthetic */ class C70401 {
        public static final int[] $SwitchMap$org$apache$http$auth$AuthProtocolState;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
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
                org.apache.http.impl.auth.HttpAuthenticator.C70401.$SwitchMap$org$apache$http$auth$AuthProtocolState = r0
                r0 = r4
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = org.apache.http.impl.auth.HttpAuthenticator.C70401.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.HANDSHAKE     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = org.apache.http.impl.auth.HttpAuthenticator.C70401.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = org.apache.http.impl.auth.HttpAuthenticator.C70401.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.FAILURE     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = org.apache.http.impl.auth.HttpAuthenticator.C70401.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.UNCHALLENGED     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.HttpAuthenticator.C70401.m45323clinit():void");
        }
    }

    public HttpAuthenticator() {
        this(null);
    }

    public HttpAuthenticator(Log log) {
        this.log = log == null ? LogFactory.getLog(getClass()) : log;
    }

    private Header doAuth(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authScheme instanceof ContextAwareAuthScheme ? ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext) : authScheme.authenticate(credentials, httpRequest);
    }

    private void ensureAuthScheme(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    public void generateAuthResponse(HttpRequest httpRequest, AuthState authState, HttpContext httpContext) {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i10 = C70401.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
        if (i10 == 1) {
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
                        httpRequest.addHeader(doAuth(authScheme2, credentials2, httpRequest, httpContext));
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
        } else if (i10 == 3) {
            ensureAuthScheme(authScheme);
            if (authScheme.isConnectionBased()) {
                return;
            }
        } else if (i10 == 4) {
            return;
        }
        if (authScheme != null) {
            try {
                httpRequest.addHeader(doAuth(authScheme, credentials, httpRequest, httpContext));
            } catch (AuthenticationException e11) {
                if (this.log.isErrorEnabled()) {
                    this.log.error(authScheme + " authentication error: " + e11.getMessage());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r0 != 5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleAuthChallenge(org.apache.http.HttpHost r7, org.apache.http.HttpResponse r8, org.apache.http.client.AuthenticationStrategy r9, org.apache.http.auth.AuthState r10, org.apache.http.protocol.HttpContext r11) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.HttpAuthenticator.handleAuthChallenge(org.apache.http.HttpHost, org.apache.http.HttpResponse, org.apache.http.client.AuthenticationStrategy, org.apache.http.auth.AuthState, org.apache.http.protocol.HttpContext):boolean");
    }

    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        if (authenticationStrategy.isAuthenticationRequested(httpHost, httpResponse, httpContext)) {
            this.log.debug("Authentication required");
            if (authState.getState() != AuthProtocolState.SUCCESS) {
                return true;
            }
            authenticationStrategy.authFailed(httpHost, authState.getAuthScheme(), httpContext);
            return true;
        }
        int i10 = C70401.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.log.debug("Authentication succeeded");
            authState.setState(AuthProtocolState.SUCCESS);
            authenticationStrategy.authSucceeded(httpHost, authState.getAuthScheme(), httpContext);
            return false;
        }
        if (i10 == 3) {
            return false;
        }
        authState.setState(AuthProtocolState.UNCHALLENGED);
        return false;
    }
}
