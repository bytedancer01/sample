package org.apache.http.pool;

import java.util.concurrent.Future;
import org.apache.http.concurrent.FutureCallback;

/* loaded from: combined.jar:classes3.jar:org/apache/http/pool/ConnPool.class */
public interface ConnPool<T, E> {
    Future<E> lease(T t10, Object obj, FutureCallback<E> futureCallback);

    void release(E e10, boolean z10);
}
