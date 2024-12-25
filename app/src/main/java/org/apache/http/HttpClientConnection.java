package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpClientConnection.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpClientConnection.class */
public interface HttpClientConnection extends HttpConnection {
    void flush();

    boolean isResponseAvailable(int i10);

    void receiveResponseEntity(HttpResponse httpResponse);

    HttpResponse receiveResponseHeader();

    void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

    void sendRequestHeader(HttpRequest httpRequest);
}
