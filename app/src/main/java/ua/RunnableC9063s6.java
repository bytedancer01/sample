package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/s6.class
 */
/* renamed from: ua.s6 */
/* loaded from: combined.jar:classes2.jar:ua/s6.class */
public final class RunnableC9063s6 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41613b;

    /* renamed from: c */
    public final String f41614c;

    /* renamed from: d */
    public final String f41615d;

    /* renamed from: e */
    public final C8908f7 f41616e;

    public RunnableC9063s6(C8908f7 c8908f7, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f41616e = c8908f7;
        this.f41613b = atomicReference;
        this.f41614c = str2;
        this.f41615d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41616e.f41723a.m37776R().m38297N(this.f41613b, null, this.f41614c, this.f41615d);
    }
}
