package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/DefaultServiceUnavailableRetryStrategy.class */
public class DefaultServiceUnavailableRetryStrategy implements ServiceUnavailableRetryStrategy {
    private final int maxRetries;
    private final long retryInterval;

    public DefaultServiceUnavailableRetryStrategy() {
        this(1, 1000);
    }

    public DefaultServiceUnavailableRetryStrategy(int i10, int i11) {
        Args.positive(i10, "Max retries");
        Args.positive(i11, "Retry interval");
        this.maxRetries = i10;
        this.retryInterval = i11;
    }

    @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
    public long getRetryInterval() {
        return this.retryInterval;
    }

    @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
    public boolean retryRequest(HttpResponse httpResponse, int i10, HttpContext httpContext) {
        return i10 <= this.maxRetries && httpResponse.getStatusLine().getStatusCode() == 503;
    }
}
