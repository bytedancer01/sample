package org.apache.http.client.methods;

import java.net.URI;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpGet.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpGet.class */
public class HttpGet extends HttpRequestBase {
    public static final String METHOD_NAME = "GET";

    public HttpGet() {
    }

    public HttpGet(String str) {
        setURI(URI.create(str));
    }

    public HttpGet(URI uri) {
        setURI(uri);
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return METHOD_NAME;
    }
}
