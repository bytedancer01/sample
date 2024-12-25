package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpServerConnection.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpServerConnection.class */
public interface HttpServerConnection extends HttpConnection {
    void flush();

    void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

    HttpRequest receiveRequestHeader();

    void sendResponseEntity(HttpResponse httpResponse);

    void sendResponseHeader(HttpResponse httpResponse);
}
