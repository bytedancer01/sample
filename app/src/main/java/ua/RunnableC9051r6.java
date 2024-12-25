package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r6.class
 */
/* renamed from: ua.r6 */
/* loaded from: combined.jar:classes2.jar:ua/r6.class */
public final class RunnableC9051r6 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41597b;

    /* renamed from: c */
    public final C8908f7 f41598c;

    public RunnableC9051r6(C8908f7 c8908f7, AtomicReference atomicReference) {
        this.f41598c = c8908f7;
        this.f41597b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41597b) {
            try {
                this.f41597b.set(Boolean.valueOf(this.f41598c.f41723a.m37797z().m37900w(this.f41598c.f41723a.m37781d().m38191p(), C8988m3.f41332L)));
            } finally {
                this.f41597b.notify();
            }
        }
    }
}
