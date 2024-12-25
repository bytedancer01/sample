package org.apache.http.protocol;

import org.apache.http.HttpRequest;

/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpRequestHandlerMapper.class */
public interface HttpRequestHandlerMapper {
    HttpRequestHandler lookup(HttpRequest httpRequest);
}
