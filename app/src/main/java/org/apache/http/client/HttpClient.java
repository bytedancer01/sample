package org.apache.http.client;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/HttpClient.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/HttpClient.class */
public interface HttpClient {
    <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler);

    <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext);

    <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler);

    <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext);

    HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest);

    HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext);

    HttpResponse execute(HttpUriRequest httpUriRequest);

    HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext);

    @Deprecated
    ClientConnectionManager getConnectionManager();

    @Deprecated
    HttpParams getParams();
}
