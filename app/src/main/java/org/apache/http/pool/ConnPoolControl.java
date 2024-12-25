package org.apache.http.pool;

/* loaded from: combined.jar:classes3.jar:org/apache/http/pool/ConnPoolControl.class */
public interface ConnPoolControl<T> {
    int getDefaultMaxPerRoute();

    int getMaxPerRoute(T t10);

    int getMaxTotal();

    PoolStats getStats(T t10);

    PoolStats getTotalStats();

    void setDefaultMaxPerRoute(int i10);

    void setMaxPerRoute(T t10, int i10);

    void setMaxTotal(int i10);
}
