package p383w9;

import java.util.concurrent.locks.Lock;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/o0.class
 */
/* renamed from: w9.o0 */
/* loaded from: combined.jar:classes2.jar:w9/o0.class */
public abstract class AbstractRunnableC9503o0 implements Runnable {

    /* renamed from: b */
    public final C9508p0 f43362b;

    /* renamed from: a */
    public abstract void mo39920a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        C9544y0 c9544y0;
        Lock lock2;
        lock = this.f43362b.f43371b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    mo39920a();
                }
            } catch (RuntimeException e10) {
                c9544y0 = this.f43362b.f43370a;
                c9544y0.m40087m(e10);
            }
        } finally {
            lock2 = this.f43362b.f43371b;
            lock2.unlock();
        }
    }
}
