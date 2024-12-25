package org.apache.http.impl.client;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ConnectionBackoffStrategy;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/DefaultBackoffStrategy.class */
public class DefaultBackoffStrategy implements ConnectionBackoffStrategy {
    @Override // org.apache.http.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(Throwable th2) {
        return (th2 instanceof SocketTimeoutException) || (th2 instanceof ConnectException);
    }

    @Override // org.apache.http.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(HttpResponse httpResponse) {
        return httpResponse.getStatusLine().getStatusCode() == 503;
    }
}
