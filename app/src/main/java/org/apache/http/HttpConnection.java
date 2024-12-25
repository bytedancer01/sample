package org.apache.http;

import java.io.Closeable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpConnection.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpConnection.class */
public interface HttpConnection extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    HttpConnectionMetrics getMetrics();

    int getSocketTimeout();

    boolean isOpen();

    boolean isStale();

    void setSocketTimeout(int i10);

    void shutdown();
}
