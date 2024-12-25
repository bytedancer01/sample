package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/y6.class
 */
/* renamed from: ua.y6 */
/* loaded from: combined.jar:classes2.jar:ua/y6.class */
public final class RunnableC9131y6 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41803b;

    /* renamed from: c */
    public final C8908f7 f41804c;

    public RunnableC9131y6(C8908f7 c8908f7, AtomicReference atomicReference) {
        this.f41804c = c8908f7;
        this.f41803b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41803b) {
            try {
                this.f41803b.set(Double.valueOf(this.f41804c.f41723a.m37797z().m37899v(this.f41804c.f41723a.m37781d().m38191p(), C8988m3.f41340P)));
            } finally {
                this.f41803b.notify();
            }
        }
    }
}
