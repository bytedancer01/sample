package org.apache.http.protocol;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/RequestExpectContinue.class */
public class RequestExpectContinue implements HttpRequestInterceptor {
    private final boolean activeByDefault;

    @Deprecated
    public RequestExpectContinue() {
        this(false);
    }

    public RequestExpectContinue(boolean z10) {
        this.activeByDefault = z10;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        if (httpRequest.containsHeader("Expect") || !(httpRequest instanceof HttpEntityEnclosingRequest)) {
            return;
        }
        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
        HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
        if (entity == null || entity.getContentLength() == 0 || protocolVersion.lessEquals(HttpVersion.HTTP_1_0) || !httpRequest.getParams().getBooleanParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, this.activeByDefault)) {
            return;
        }
        httpRequest.addHeader("Expect", HTTP.EXPECT_CONTINUE);
    }
}
