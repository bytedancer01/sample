package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/UriHttpRequestHandlerMapper.class */
public class UriHttpRequestHandlerMapper implements HttpRequestHandlerMapper {
    private final UriPatternMatcher<HttpRequestHandler> matcher;

    public UriHttpRequestHandlerMapper() {
        this(new UriPatternMatcher());
    }

    public UriHttpRequestHandlerMapper(UriPatternMatcher<HttpRequestHandler> uriPatternMatcher) {
        this.matcher = (UriPatternMatcher) Args.notNull(uriPatternMatcher, "Pattern matcher");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r6 != (-1)) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getRequestPath(org.apache.http.HttpRequest r5) {
        /*
            r4 = this;
            r0 = r5
            org.apache.http.RequestLine r0 = r0.getRequestLine()
            java.lang.String r0 = r0.getUri()
            r7 = r0
            r0 = r7
            r1 = 63
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L22
        L18:
            r0 = r7
            r1 = 0
            r2 = r6
            java.lang.String r0 = r0.substring(r1, r2)
            r5 = r0
            goto L33
        L22:
            r0 = r7
            r1 = 35
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r7
            r5 = r0
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L33
            goto L18
        L33:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.UriHttpRequestHandlerMapper.getRequestPath(org.apache.http.HttpRequest):java.lang.String");
    }

    @Override // org.apache.http.protocol.HttpRequestHandlerMapper
    public HttpRequestHandler lookup(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        return this.matcher.lookup(getRequestPath(httpRequest));
    }

    public void register(String str, HttpRequestHandler httpRequestHandler) {
        Args.notNull(str, "Pattern");
        Args.notNull(httpRequestHandler, "Handler");
        this.matcher.register(str, httpRequestHandler);
    }

    public void unregister(String str) {
        this.matcher.unregister(str);
    }
}
