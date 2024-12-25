package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/x6.class
 */
/* renamed from: ua.x6 */
/* loaded from: combined.jar:classes2.jar:ua/x6.class */
public final class RunnableC9120x6 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41749b;

    /* renamed from: c */
    public final C8908f7 f41750c;

    public RunnableC9120x6(C8908f7 c8908f7, AtomicReference atomicReference) {
        this.f41750c = c8908f7;
        this.f41749b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41749b) {
            try {
                this.f41749b.set(Integer.valueOf(this.f41750c.f41723a.m37797z().m37897t(this.f41750c.f41723a.m37781d().m38191p(), C8988m3.f41338O)));
            } finally {
                this.f41749b.notify();
            }
        }
    }
}
