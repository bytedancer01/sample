package org.apache.http;

import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpRequestInterceptor.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpRequestInterceptor.class */
public interface HttpRequestInterceptor {
    void process(HttpRequest httpRequest, HttpContext httpContext);
}
