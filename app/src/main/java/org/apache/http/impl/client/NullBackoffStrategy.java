package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.client.ConnectionBackoffStrategy;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/NullBackoffStrategy.class */
public class NullBackoffStrategy implements ConnectionBackoffStrategy {
    @Override // org.apache.http.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(Throwable th2) {
        return false;
    }

    @Override // org.apache.http.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(HttpResponse httpResponse) {
        return false;
    }
}
