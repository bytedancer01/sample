package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/o6.class
 */
/* renamed from: ua.o6 */
/* loaded from: combined.jar:classes2.jar:ua/o6.class */
public final class RunnableC9015o6 implements Runnable {

    /* renamed from: b */
    public final long f41507b;

    /* renamed from: c */
    public final C8908f7 f41508c;

    public RunnableC9015o6(C8908f7 c8908f7, long j10) {
        this.f41508c = c8908f7;
        this.f41507b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41508c.m37945t(this.f41507b, true);
        this.f41508c.f41723a.m37776R().m38303T(new AtomicReference<>());
    }
}
