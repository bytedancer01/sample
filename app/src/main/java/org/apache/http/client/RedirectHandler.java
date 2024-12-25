package org.apache.http.client;

import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/RedirectHandler.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/RedirectHandler.class */
public interface RedirectHandler {
    URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext);

    boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext);
}
