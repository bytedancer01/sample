package org.apache.http.client;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/HttpResponseException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/HttpResponseException.class */
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    public HttpResponseException(int i10, String str) {
        super(str);
        this.statusCode = i10;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
