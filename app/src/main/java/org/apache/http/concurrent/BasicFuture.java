package org.apache.http.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/concurrent/BasicFuture.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/concurrent/BasicFuture.class */
public class BasicFuture<T> implements Future<T>, Cancellable {
    private final FutureCallback<T> callback;
    private volatile boolean cancelled;
    private volatile boolean completed;

    /* renamed from: ex */
    private volatile Exception f36151ex;
    private volatile T result;

    public BasicFuture(FutureCallback<T> futureCallback) {
        this.callback = futureCallback;
    }

    private T getResult() {
        if (this.f36151ex != null) {
            throw new ExecutionException(this.f36151ex);
        }
        if (this.cancelled) {
            throw new CancellationException();
        }
        return this.result;
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        return cancel(true);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.cancelled = true;
            notifyAll();
            FutureCallback<T> futureCallback = this.callback;
            if (futureCallback == null) {
                return true;
            }
            futureCallback.cancelled();
            return true;
        }
    }

    public boolean completed(T t10) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.result = t10;
            notifyAll();
            FutureCallback<T> futureCallback = this.callback;
            if (futureCallback == null) {
                return true;
            }
            futureCallback.completed(t10);
            return true;
        }
    }

    public boolean failed(Exception exc) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.f36151ex = exc;
            notifyAll();
            FutureCallback<T> futureCallback = this.callback;
            if (futureCallback == null) {
                return true;
            }
            futureCallback.failed(exc);
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() {
        T result;
        synchronized (this) {
            while (!this.completed) {
                wait();
            }
            result = getResult();
        }
        return result;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) {
        synchronized (this) {
            Args.notNull(timeUnit, "Time unit");
            long millis = timeUnit.toMillis(j10);
            long currentTimeMillis = millis <= 0 ? 0L : System.currentTimeMillis();
            if (this.completed) {
                return getResult();
            }
            if (millis <= 0) {
                throw new TimeoutException();
            }
            long j11 = millis;
            do {
                wait(j11);
                if (this.completed) {
                    return getResult();
                }
                j11 = millis - (System.currentTimeMillis() - currentTimeMillis);
            } while (j11 > 0);
            throw new TimeoutException();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.completed;
    }
}
