package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpConnectionMetrics.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpConnectionMetrics.class */
public interface HttpConnectionMetrics {
    Object getMetric(String str);

    long getReceivedBytesCount();

    long getRequestCount();

    long getResponseCount();

    long getSentBytesCount();

    void reset();
}
