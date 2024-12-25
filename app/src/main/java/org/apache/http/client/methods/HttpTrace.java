package org.apache.http.client.methods;

import java.net.URI;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpTrace.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpTrace.class */
public class HttpTrace extends HttpRequestBase {
    public static final String METHOD_NAME = "TRACE";

    public HttpTrace() {
    }

    public HttpTrace(String str) {
        setURI(URI.create(str));
    }

    public HttpTrace(URI uri) {
        setURI(uri);
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return METHOD_NAME;
    }
}
