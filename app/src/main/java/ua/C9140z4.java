package ua;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/z4.class
 */
/* renamed from: ua.z4 */
/* loaded from: combined.jar:classes2.jar:ua/z4.class */
public final class C9140z4 extends AbstractC9119x5 {

    /* renamed from: l */
    public static final AtomicLong f41819l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public C9129y4 f41820c;

    /* renamed from: d */
    public C9129y4 f41821d;

    /* renamed from: e */
    public final PriorityBlockingQueue<C9118x4<?>> f41822e;

    /* renamed from: f */
    public final BlockingQueue<C9118x4<?>> f41823f;

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f41824g;

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f41825h;

    /* renamed from: i */
    public final Object f41826i;

    /* renamed from: j */
    public final Semaphore f41827j;

    /* renamed from: k */
    public volatile boolean f41828k;

    public C9140z4(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41826i = new Object();
        this.f41827j = new Semaphore(2);
        this.f41822e = new PriorityBlockingQueue<>();
        this.f41823f = new LinkedBlockingQueue();
        this.f41824g = new C9107w4(this, "Thread death: Uncaught exception on worker thread");
        this.f41825h = new C9107w4(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: B */
    public static /* synthetic */ C9129y4 m38425B(C9140z4 c9140z4, C9129y4 c9129y4) {
        c9140z4.f41821d = null;
        return null;
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m38428w(C9140z4 c9140z4) {
        boolean z10 = c9140z4.f41828k;
        return false;
    }

    /* renamed from: z */
    public static /* synthetic */ C9129y4 m38431z(C9140z4 c9140z4, C9129y4 c9129y4) {
        c9140z4.f41820c = null;
        return null;
    }

    /* renamed from: D */
    public final void m38432D(C9118x4<?> c9118x4) {
        synchronized (this.f41826i) {
            this.f41822e.add(c9118x4);
            C9129y4 c9129y4 = this.f41820c;
            if (c9129y4 == null) {
                C9129y4 c9129y42 = new C9129y4(this, "Measurement Worker", this.f41822e);
                this.f41820c = c9129y42;
                c9129y42.setUncaughtExceptionHandler(this.f41824g);
                this.f41820c.start();
            } else {
                c9129y4.m38419a();
            }
        }
    }

    @Override // ua.C9108w5
    /* renamed from: g */
    public final void mo38330g() {
        if (Thread.currentThread() != this.f41821d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // ua.C9108w5
    /* renamed from: h */
    public final void mo37811h() {
        if (Thread.currentThread() != this.f41820c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: i */
    public final boolean mo37851i() {
        return false;
    }

    /* renamed from: o */
    public final boolean m38433o() {
        return Thread.currentThread() == this.f41820c;
    }

    /* renamed from: p */
    public final <V> Future<V> m38434p(Callable<V> callable) {
        m38335l();
        C9935o.m41850j(callable);
        C9118x4<?> c9118x4 = new C9118x4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f41820c) {
            if (!this.f41822e.isEmpty()) {
                this.f41723a.mo37780c().m38411r().m38326a("Callable skipped the worker queue.");
            }
            c9118x4.run();
        } else {
            m38432D(c9118x4);
        }
        return c9118x4;
    }

    /* renamed from: q */
    public final <V> Future<V> m38435q(Callable<V> callable) {
        m38335l();
        C9935o.m41850j(callable);
        C9118x4<?> c9118x4 = new C9118x4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f41820c) {
            c9118x4.run();
        } else {
            m38432D(c9118x4);
        }
        return c9118x4;
    }

    /* renamed from: r */
    public final void m38436r(Runnable runnable) {
        m38335l();
        C9935o.m41850j(runnable);
        m38432D(new C9118x4<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: s */
    public final <T> T m38437s(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f41723a.mo37782e().m38436r(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException e10) {
                this.f41723a.mo37780c().m38411r().m38326a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            this.f41723a.mo37780c().m38411r().m38326a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t10;
    }

    /* renamed from: t */
    public final void m38438t(Runnable runnable) {
        m38335l();
        C9935o.m41850j(runnable);
        m38432D(new C9118x4<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: u */
    public final void m38439u(Runnable runnable) {
        m38335l();
        C9935o.m41850j(runnable);
        C9118x4<?> c9118x4 = new C9118x4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f41826i) {
            this.f41823f.add(c9118x4);
            C9129y4 c9129y4 = this.f41821d;
            if (c9129y4 == null) {
                C9129y4 c9129y42 = new C9129y4(this, "Measurement Network", this.f41823f);
                this.f41821d = c9129y42;
                c9129y42.setUncaughtExceptionHandler(this.f41825h);
                this.f41821d.start();
            } else {
                c9129y4.m38419a();
            }
        }
    }
}
