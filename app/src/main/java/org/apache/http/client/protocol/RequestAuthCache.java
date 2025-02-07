package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/RequestAuthCache.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/RequestAuthCache.class */
public class RequestAuthCache implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    private void doPreemptiveAuth(HttpHost httpHost, AuthScheme authScheme, AuthState authState, CredentialsProvider credentialsProvider) {
        String schemeName = authScheme.getSchemeName();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Re-using cached '" + schemeName + "' auth scheme for " + httpHost);
        }
        Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost, AuthScope.ANY_REALM, schemeName));
        if (credentials != null) {
            authState.update(authScheme, credentials);
        } else {
            this.log.debug("No credentials for preemptive authentication");
        }
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        AuthScheme authScheme;
        AuthScheme authScheme2;
        Log log;
        Object obj;
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        AuthCache authCache = adapt.getAuthCache();
        if (authCache == null) {
            log = this.log;
            obj = "Auth cache not set in the context";
        } else {
            CredentialsProvider credentialsProvider = adapt.getCredentialsProvider();
            if (credentialsProvider == null) {
                log = this.log;
                obj = "Credentials provider not set in the context";
            } else {
                RouteInfo httpRoute = adapt.getHttpRoute();
                if (httpRoute == null) {
                    log = this.log;
                    obj = "Route info not set in the context";
                } else {
                    HttpHost targetHost = adapt.getTargetHost();
                    if (targetHost != null) {
                        HttpHost httpHost = targetHost;
                        if (targetHost.getPort() < 0) {
                            httpHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
                        }
                        AuthState targetAuthState = adapt.getTargetAuthState();
                        if (targetAuthState != null && targetAuthState.getState() == AuthProtocolState.UNCHALLENGED && (authScheme2 = authCache.get(httpHost)) != null) {
                            doPreemptiveAuth(httpHost, authScheme2, targetAuthState, credentialsProvider);
                        }
                        HttpHost proxyHost = httpRoute.getProxyHost();
                        AuthState proxyAuthState = adapt.getProxyAuthState();
                        if (proxyHost == null || proxyAuthState == null || proxyAuthState.getState() != AuthProtocolState.UNCHALLENGED || (authScheme = authCache.get(proxyHost)) == null) {
                            return;
                        }
                        doPreemptiveAuth(proxyHost, authScheme, proxyAuthState, credentialsProvider);
                        return;
                    }
                    log = this.log;
                    obj = "Target host not set in the context";
                }
            }
        }
        log.debug(obj);
    }
}
