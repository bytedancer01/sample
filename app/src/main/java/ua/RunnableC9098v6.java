package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/v6.class
 */
/* renamed from: ua.v6 */
/* loaded from: combined.jar:classes2.jar:ua/v6.class */
public final class RunnableC9098v6 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41701b;

    /* renamed from: c */
    public final C8908f7 f41702c;

    public RunnableC9098v6(C8908f7 c8908f7, AtomicReference atomicReference) {
        this.f41702c = c8908f7;
        this.f41701b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41701b) {
            try {
                this.f41701b.set(this.f41702c.f41723a.m37797z().m37895r(this.f41702c.f41723a.m37781d().m38191p(), C8988m3.f41334M));
            } finally {
                this.f41701b.notify();
            }
        }
    }
}
