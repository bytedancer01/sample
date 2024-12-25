package org.apache.http.client;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/RedirectStrategy.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/RedirectStrategy.class */
public interface RedirectStrategy {
    HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext);

    boolean isRedirected(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext);
}
