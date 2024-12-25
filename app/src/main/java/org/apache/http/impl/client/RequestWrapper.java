package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/RequestWrapper.class */
public class RequestWrapper extends AbstractHttpMessage implements HttpUriRequest {
    private int execCount;
    private String method;
    private final HttpRequest original;
    private URI uri;
    private ProtocolVersion version;

    public RequestWrapper(HttpRequest httpRequest) {
        ProtocolVersion protocolVersion;
        Args.notNull(httpRequest, "HTTP request");
        this.original = httpRequest;
        setParams(httpRequest.getParams());
        setHeaders(httpRequest.getAllHeaders());
        if (httpRequest instanceof HttpUriRequest) {
            HttpUriRequest httpUriRequest = (HttpUriRequest) httpRequest;
            this.uri = httpUriRequest.getURI();
            this.method = httpUriRequest.getMethod();
            protocolVersion = null;
        } else {
            RequestLine requestLine = httpRequest.getRequestLine();
            try {
                this.uri = new URI(requestLine.getUri());
                this.method = requestLine.getMethod();
                protocolVersion = httpRequest.getProtocolVersion();
            } catch (URISyntaxException e10) {
                throw new ProtocolException("Invalid request URI: " + requestLine.getUri(), e10);
            }
        }
        this.version = protocolVersion;
        this.execCount = 0;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public void abort() {
        throw new UnsupportedOperationException();
    }

    public int getExecCount() {
        return this.execCount;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.method;
    }

    public HttpRequest getOriginal() {
        return this.original;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        if (this.version == null) {
            this.version = HttpProtocolParams.getVersion(getParams());
        }
        return this.version;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r7.isEmpty() != false) goto L10;
     */
    @Override // org.apache.http.HttpRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.RequestLine getRequestLine() {
        /*
            r6 = this;
            r0 = r6
            org.apache.http.ProtocolVersion r0 = r0.getProtocolVersion()
            r9 = r0
            r0 = r6
            java.net.URI r0 = r0.uri
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L16
            r0 = r7
            java.lang.String r0 = r0.toASCIIString()
            r7 = r0
            goto L18
        L16:
            r0 = 0
            r7 = r0
        L18:
            r0 = r7
            if (r0 == 0) goto L25
            r0 = r7
            r8 = r0
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
        L25:
            java.lang.String r0 = "/"
            r8 = r0
        L28:
            org.apache.http.message.BasicRequestLine r0 = new org.apache.http.message.BasicRequestLine
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.getMethod()
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.RequestWrapper.getRequestLine():org.apache.http.RequestLine");
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.uri;
    }

    public void incrementExecCount() {
        this.execCount++;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public boolean isAborted() {
        return false;
    }

    public boolean isRepeatable() {
        return true;
    }

    public void resetHeaders() {
        this.headergroup.clear();
        setHeaders(this.original.getAllHeaders());
    }

    public void setMethod(String str) {
        Args.notNull(str, "Method name");
        this.method = str;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }
}
