package org.apache.http;

import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpResponseFactory.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpResponseFactory.class */
public interface HttpResponseFactory {
    HttpResponse newHttpResponse(ProtocolVersion protocolVersion, int i10, HttpContext httpContext);

    HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext);
}
