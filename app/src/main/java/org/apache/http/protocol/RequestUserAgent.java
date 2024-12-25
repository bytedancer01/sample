package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/RequestUserAgent.class */
public class RequestUserAgent implements HttpRequestInterceptor {
    private final String userAgent;

    public RequestUserAgent() {
        this(null);
    }

    public RequestUserAgent(String str) {
        this.userAgent = str;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        if (httpRequest.containsHeader("User-Agent")) {
            return;
        }
        String str = null;
        HttpParams params = httpRequest.getParams();
        if (params != null) {
            str = (String) params.getParameter(CoreProtocolPNames.USER_AGENT);
        }
        String str2 = str;
        if (str == null) {
            str2 = this.userAgent;
        }
        if (str2 != null) {
            httpRequest.addHeader("User-Agent", str2);
        }
    }
}
