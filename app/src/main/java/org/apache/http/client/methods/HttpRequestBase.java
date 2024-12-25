package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.params.HttpProtocolParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/methods/HttpRequestBase.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/methods/HttpRequestBase.class */
public abstract class HttpRequestBase extends AbstractExecutionAwareRequest implements HttpUriRequest, Configurable {
    private RequestConfig config;
    private URI uri;
    private ProtocolVersion version;

    @Override // org.apache.http.client.methods.Configurable
    public RequestConfig getConfig() {
        return this.config;
    }

    public abstract String getMethod();

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion protocolVersion = this.version;
        if (protocolVersion == null) {
            protocolVersion = HttpProtocolParams.getVersion(getParams());
        }
        return protocolVersion;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
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
            java.lang.String r0 = r0.getMethod()
            r10 = r0
            r0 = r6
            org.apache.http.ProtocolVersion r0 = r0.getProtocolVersion()
            r9 = r0
            r0 = r6
            java.net.URI r0 = r0.getURI()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1c
            r0 = r7
            java.lang.String r0 = r0.toASCIIString()
            r7 = r0
            goto L1e
        L1c:
            r0 = 0
            r7 = r0
        L1e:
            r0 = r7
            if (r0 == 0) goto L2b
            r0 = r7
            r8 = r0
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
        L2b:
            java.lang.String r0 = "/"
            r8 = r0
        L2e:
            org.apache.http.message.BasicRequestLine r0 = new org.apache.http.message.BasicRequestLine
            r1 = r0
            r2 = r10
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.methods.HttpRequestBase.getRequestLine():org.apache.http.RequestLine");
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.uri;
    }

    public void releaseConnection() {
        reset();
    }

    public void setConfig(RequestConfig requestConfig) {
        this.config = requestConfig;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }

    public void started() {
    }

    public String toString() {
        return getMethod() + " " + getURI() + " " + getProtocolVersion();
    }
}
