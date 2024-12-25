package org.apache.http;

import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpResponseInterceptor.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpResponseInterceptor.class */
public interface HttpResponseInterceptor {
    void process(HttpResponse httpResponse, HttpContext httpContext);
}
