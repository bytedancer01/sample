package org.apache.http.client;

import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/ServiceUnavailableRetryStrategy.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/ServiceUnavailableRetryStrategy.class */
public interface ServiceUnavailableRetryStrategy {
    long getRetryInterval();

    boolean retryRequest(HttpResponse httpResponse, int i10, HttpContext httpContext);
}
