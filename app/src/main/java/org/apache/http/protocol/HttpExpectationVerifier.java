package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpExpectationVerifier.class */
public interface HttpExpectationVerifier {
    void verify(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext);
}
