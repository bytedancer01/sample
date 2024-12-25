package org.apache.http.pool;

/* loaded from: combined.jar:classes3.jar:org/apache/http/pool/PoolEntryCallback.class */
public interface PoolEntryCallback<T, C> {
    void process(PoolEntry<T, C> poolEntry);
}
