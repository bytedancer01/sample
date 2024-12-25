package ma;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/te.class
 */
/* renamed from: ma.te */
/* loaded from: combined.jar:classes2.jar:ma/te.class */
public abstract class AbstractRunnableC6419te extends AtomicReference implements Runnable {

    /* renamed from: b */
    public static final Runnable f34069b = new RunnableC6398se(null);

    /* renamed from: c */
    public static final Runnable f34070c = new RunnableC6398se(null);

    /* renamed from: a */
    public abstract Object mo29395a();

    /* renamed from: b */
    public abstract String mo29396b();

    /* renamed from: c */
    public abstract void mo29397c(Throwable th2);

    /* renamed from: d */
    public abstract void mo29398d(Object obj);

    /* renamed from: e */
    public final void m30043e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC6356qe runnableC6356qe = new RunnableC6356qe(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC6356qe)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f34069b)) == f34070c) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(f34069b)) == f34070c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    /* renamed from: f */
    public abstract boolean mo29399f();

    /* renamed from: g */
    public final void m30044g(Thread thread) {
        boolean z10;
        Runnable runnable = (Runnable) get();
        RunnableC6356qe runnableC6356qe = null;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!(runnable instanceof RunnableC6356qe)) {
                if (runnable != f34070c) {
                    break;
                }
            } else {
                runnableC6356qe = (RunnableC6356qe) runnable;
            }
            int i12 = i11 + 1;
            if (i12 > 1000) {
                Runnable runnable2 = f34070c;
                if (runnable != runnable2) {
                    z10 = z11;
                    if (!compareAndSet(runnable, runnable2)) {
                    }
                }
                boolean z12 = Thread.interrupted() || z11;
                LockSupport.park(runnableC6356qe);
                z10 = z12;
            } else {
                Thread.yield();
                z10 = z11;
            }
            runnable = (Runnable) get();
            z11 = z10;
            i10 = i12;
        }
        if (z11) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z10 = !mo29399f();
            if (z10) {
                try {
                    obj = mo29395a();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, f34069b)) {
                            m30044g(currentThread);
                        }
                        mo29397c(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(currentThread, f34069b)) {
                            m30044g(currentThread);
                        }
                        mo29398d(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(currentThread, f34069b)) {
                m30044g(currentThread);
            }
            if (z10) {
                mo29398d(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f34069b) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC6356qe) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo29396b();
    }
}
