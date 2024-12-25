package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpRequestHandler.class */
public interface HttpRequestHandler {
    void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext);
}
