package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/w6.class
 */
/* renamed from: ua.w6 */
/* loaded from: combined.jar:classes2.jar:ua/w6.class */
public final class RunnableC9109w6 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41724b;

    /* renamed from: c */
    public final C8908f7 f41725c;

    public RunnableC9109w6(C8908f7 c8908f7, AtomicReference atomicReference) {
        this.f41725c = c8908f7;
        this.f41724b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41724b) {
            try {
                this.f41724b.set(Long.valueOf(this.f41725c.f41723a.m37797z().m37896s(this.f41725c.f41723a.m37781d().m38191p(), C8988m3.f41336N)));
            } finally {
                this.f41724b.notify();
            }
        }
    }
}
