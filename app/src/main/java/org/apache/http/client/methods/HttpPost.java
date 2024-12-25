package org.apache.http.client.methods;

import java.net.URI;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpPost.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpPost.class */
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    public HttpPost() {
    }

    public HttpPost(String str) {
        setURI(URI.create(str));
    }

    public HttpPost(URI uri) {
        setURI(uri);
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return "POST";
    }
}
