package org.apache.http.client;

import org.apache.http.HttpResponse;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/ConnectionBackoffStrategy.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/ConnectionBackoffStrategy.class */
public interface ConnectionBackoffStrategy {
    boolean shouldBackoff(Throwable th2);

    boolean shouldBackoff(HttpResponse httpResponse);
}
