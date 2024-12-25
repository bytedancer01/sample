package org.apache.http.client.methods;

import java.net.URI;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpHead.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpHead.class */
public class HttpHead extends HttpRequestBase {
    public static final String METHOD_NAME = "HEAD";

    public HttpHead() {
    }

    public HttpHead(String str) {
        setURI(URI.create(str));
    }

    public HttpHead(URI uri) {
        setURI(uri);
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return METHOD_NAME;
    }
}
