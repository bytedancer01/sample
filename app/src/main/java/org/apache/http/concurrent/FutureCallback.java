package org.apache.http.concurrent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/concurrent/FutureCallback.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/concurrent/FutureCallback.class */
public interface FutureCallback<T> {
    void cancelled();

    void completed(T t10);

    void failed(Exception exc);
}
