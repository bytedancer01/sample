package org.apache.http.client.methods;

import java.net.URI;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpPut.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpPut.class */
public class HttpPut extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "PUT";

    public HttpPut() {
    }

    public HttpPut(String str) {
        setURI(URI.create(str));
    }

    public HttpPut(URI uri) {
        setURI(uri);
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return METHOD_NAME;
    }
}
