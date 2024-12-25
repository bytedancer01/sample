package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthState;
import org.apache.http.conn.HttpRoutedConnection;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/RequestProxyAuthentication.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/RequestProxyAuthentication.class */
public class RequestProxyAuthentication extends RequestAuthenticationBase {
    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Log log;
        Object obj;
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (httpRequest.containsHeader("Proxy-Authorization")) {
            return;
        }
        HttpRoutedConnection httpRoutedConnection = (HttpRoutedConnection) httpContext.getAttribute("http.connection");
        if (httpRoutedConnection == null) {
            log = this.log;
            obj = "HTTP connection not set in the context";
        } else {
            if (httpRoutedConnection.getRoute().isTunnelled()) {
                return;
            }
            AuthState authState = (AuthState) httpContext.getAttribute("http.auth.proxy-scope");
            if (authState != null) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Proxy auth state: " + authState.getState());
                }
                process(authState, httpRequest, httpContext);
                return;
            }
            log = this.log;
            obj = "Proxy auth state not set in the context";
        }
        log.debug(obj);
    }
}
