package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpRequestWrapper.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpRequestWrapper.class */
public class HttpRequestWrapper extends AbstractHttpMessage implements HttpUriRequest {
    private final String method;
    private final HttpRequest original;
    private RequestLine requestLine;
    private final HttpHost target;
    private URI uri;
    private ProtocolVersion version;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/client/methods/HttpRequestWrapper$HttpEntityEnclosingRequestWrapper.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpRequestWrapper$HttpEntityEnclosingRequestWrapper.class */
    public static class HttpEntityEnclosingRequestWrapper extends HttpRequestWrapper implements HttpEntityEnclosingRequest {
        private HttpEntity entity;

        public HttpEntityEnclosingRequestWrapper(HttpEntityEnclosingRequest httpEntityEnclosingRequest, HttpHost httpHost) {
            super(httpEntityEnclosingRequest, httpHost);
            this.entity = httpEntityEnclosingRequest.getEntity();
        }

        @Override // org.apache.http.HttpEntityEnclosingRequest
        public boolean expectContinue() {
            Header firstHeader = getFirstHeader("Expect");
            return firstHeader != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(firstHeader.getValue());
        }

        @Override // org.apache.http.HttpEntityEnclosingRequest
        public HttpEntity getEntity() {
            return this.entity;
        }

        @Override // org.apache.http.HttpEntityEnclosingRequest
        public void setEntity(HttpEntity httpEntity) {
            this.entity = httpEntity;
        }
    }

    private HttpRequestWrapper(HttpRequest httpRequest, HttpHost httpHost) {
        HttpRequest httpRequest2 = (HttpRequest) Args.notNull(httpRequest, "HTTP request");
        this.original = httpRequest2;
        this.target = httpHost;
        this.version = httpRequest2.getRequestLine().getProtocolVersion();
        this.method = httpRequest2.getRequestLine().getMethod();
        this.uri = httpRequest instanceof HttpUriRequest ? ((HttpUriRequest) httpRequest).getURI() : null;
        setHeaders(httpRequest.getAllHeaders());
    }

    public static HttpRequestWrapper wrap(HttpRequest httpRequest) {
        return wrap(httpRequest, null);
    }

    public static HttpRequestWrapper wrap(HttpRequest httpRequest, HttpHost httpHost) {
        Args.notNull(httpRequest, "HTTP request");
        return httpRequest instanceof HttpEntityEnclosingRequest ? new HttpEntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest, httpHost) : new HttpRequestWrapper(httpRequest, httpHost);
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public void abort() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.method;
    }

    public HttpRequest getOriginal() {
        return this.original;
    }

    @Override // org.apache.http.message.AbstractHttpMessage, org.apache.http.HttpMessage
    @Deprecated
    public HttpParams getParams() {
        if (this.params == null) {
            this.params = this.original.getParams().copy();
        }
        return this.params;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion protocolVersion = this.version;
        if (protocolVersion == null) {
            protocolVersion = this.original.getProtocolVersion();
        }
        return protocolVersion;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r8.isEmpty() != false) goto L12;
     */
    @Override // org.apache.http.HttpRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.RequestLine getRequestLine() {
        /*
            r7 = this;
            r0 = r7
            org.apache.http.RequestLine r0 = r0.requestLine
            if (r0 != 0) goto L4b
            r0 = r7
            java.net.URI r0 = r0.uri
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L18
            r0 = r8
            java.lang.String r0 = r0.toASCIIString()
            r8 = r0
            goto L27
        L18:
            r0 = r7
            org.apache.http.HttpRequest r0 = r0.original
            org.apache.http.RequestLine r0 = r0.getRequestLine()
            java.lang.String r0 = r0.getUri()
            r8 = r0
        L27:
            r0 = r8
            if (r0 == 0) goto L34
            r0 = r8
            r9 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L37
        L34:
            java.lang.String r0 = "/"
            r9 = r0
        L37:
            r0 = r7
            org.apache.http.message.BasicRequestLine r1 = new org.apache.http.message.BasicRequestLine
            r2 = r1
            r3 = r7
            java.lang.String r3 = r3.method
            r4 = r9
            r5 = r7
            org.apache.http.ProtocolVersion r5 = r5.getProtocolVersion()
            r2.<init>(r3, r4, r5)
            r0.requestLine = r1
        L4b:
            r0 = r7
            org.apache.http.RequestLine r0 = r0.requestLine
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.methods.HttpRequestWrapper.getRequestLine():org.apache.http.RequestLine");
    }

    public HttpHost getTarget() {
        return this.target;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.uri;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public boolean isAborted() {
        return false;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
        this.requestLine = null;
    }

    public void setURI(URI uri) {
        this.uri = uri;
        this.requestLine = null;
    }

    public String toString() {
        return getRequestLine() + " " + this.headergroup;
    }
}
