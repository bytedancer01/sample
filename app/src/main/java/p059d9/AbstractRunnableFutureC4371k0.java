package p059d9;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/k0.class
 */
/* renamed from: d9.k0 */
/* loaded from: combined.jar:classes2.jar:d9/k0.class */
public abstract class AbstractRunnableFutureC4371k0<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b */
    public final C4360f f26593b = new C4360f();

    /* renamed from: c */
    public final C4360f f26594c = new C4360f();

    /* renamed from: d */
    public final Object f26595d = new Object();

    /* renamed from: e */
    public Exception f26596e;

    /* renamed from: f */
    public R f26597f;

    /* renamed from: g */
    public Thread f26598g;

    /* renamed from: h */
    public boolean f26599h;

    /* renamed from: b */
    public final void m22054b() {
        this.f26594c.m21964c();
    }

    /* renamed from: c */
    public final void m22055c() {
        this.f26593b.m21964c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f26595d) {
            if (!this.f26599h && !this.f26594c.m21966e()) {
                this.f26599h = true;
                mo22056d();
                Thread thread = this.f26598g;
                if (thread == null) {
                    this.f26593b.m21967f();
                    this.f26594c.m21967f();
                } else if (z10) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    public void mo22056d() {
    }

    /* renamed from: e */
    public abstract R mo22057e();

    /* renamed from: f */
    public final R m22058f() {
        if (this.f26599h) {
            throw new CancellationException();
        }
        if (this.f26596e == null) {
            return this.f26597f;
        }
        throw new ExecutionException(this.f26596e);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        this.f26594c.m21962a();
        return m22058f();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        if (this.f26594c.m21963b(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            return m22058f();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26599h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26594c.m21966e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f26595d) {
            if (this.f26599h) {
                return;
            }
            this.f26598g = Thread.currentThread();
            this.f26593b.m21967f();
            try {
                try {
                    this.f26597f = mo22057e();
                    synchronized (this.f26595d) {
                        this.f26594c.m21967f();
                        this.f26598g = null;
                        Thread.interrupted();
                    }
                } catch (Exception e10) {
                    this.f26596e = e10;
                    synchronized (this.f26595d) {
                        this.f26594c.m21967f();
                        this.f26598g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.f26595d) {
                    this.f26594c.m21967f();
                    this.f26598g = null;
                    Thread.interrupted();
                    throw th2;
                }
            }
        }
    }
}
