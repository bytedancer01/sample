package org.apache.http.client.protocol;

import java.util.Collection;
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/RequestDefaultHeaders.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/RequestDefaultHeaders.class */
public class RequestDefaultHeaders implements HttpRequestInterceptor {
    private final Collection<? extends Header> defaultHeaders;

    public RequestDefaultHeaders() {
        this(null);
    }

    public RequestDefaultHeaders(Collection<? extends Header> collection) {
        this.defaultHeaders = collection;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            return;
        }
        Collection<? extends Header> collection = (Collection) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HEADERS);
        Collection<? extends Header> collection2 = collection;
        if (collection == null) {
            collection2 = this.defaultHeaders;
        }
        if (collection2 != null) {
            Iterator<? extends Header> it = collection2.iterator();
            while (it.hasNext()) {
                httpRequest.addHeader((Header) it.next());
            }
        }
    }
}
