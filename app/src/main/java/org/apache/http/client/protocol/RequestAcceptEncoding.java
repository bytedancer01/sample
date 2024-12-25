package org.apache.http.client.protocol;

import java.util.List;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/RequestAcceptEncoding.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/RequestAcceptEncoding.class */
public class RequestAcceptEncoding implements HttpRequestInterceptor {
    private final String acceptEncoding;

    public RequestAcceptEncoding() {
        this(null);
    }

    public RequestAcceptEncoding(List<String> list) {
        String str;
        if (list == null || list.isEmpty()) {
            str = "gzip,deflate";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (i10 > 0) {
                    sb2.append(",");
                }
                sb2.append(list.get(i10));
            }
            str = sb2.toString();
        }
        this.acceptEncoding = str;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        RequestConfig requestConfig = HttpClientContext.adapt(httpContext).getRequestConfig();
        if (httpRequest.containsHeader(HttpHeaders.ACCEPT_ENCODING) || !requestConfig.isContentCompressionEnabled()) {
            return;
        }
        httpRequest.addHeader(HttpHeaders.ACCEPT_ENCODING, this.acceptEncoding);
    }
}
