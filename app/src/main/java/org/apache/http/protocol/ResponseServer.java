package org.apache.http.protocol;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/ResponseServer.class */
public class ResponseServer implements HttpResponseInterceptor {
    private final String originServer;

    public ResponseServer() {
        this(null);
    }

    public ResponseServer(String str) {
        this.originServer = str;
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        String str;
        Args.notNull(httpResponse, "HTTP response");
        if (httpResponse.containsHeader("Server") || (str = this.originServer) == null) {
            return;
        }
        httpResponse.addHeader("Server", str);
    }
}
