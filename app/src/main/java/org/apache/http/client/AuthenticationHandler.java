package org.apache.http.client;

import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/AuthenticationHandler.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/AuthenticationHandler.class */
public interface AuthenticationHandler {
    Map<String, Header> getChallenges(HttpResponse httpResponse, HttpContext httpContext);

    boolean isAuthenticationRequested(HttpResponse httpResponse, HttpContext httpContext);

    AuthScheme selectScheme(Map<String, Header> map, HttpResponse httpResponse, HttpContext httpContext);
}
