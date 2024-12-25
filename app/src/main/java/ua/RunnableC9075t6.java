package ua;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/t6.class
 */
/* renamed from: ua.t6 */
/* loaded from: combined.jar:classes2.jar:ua/t6.class */
public final class RunnableC9075t6 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41640b;

    /* renamed from: c */
    public final String f41641c;

    /* renamed from: d */
    public final String f41642d;

    /* renamed from: e */
    public final boolean f41643e;

    /* renamed from: f */
    public final C8908f7 f41644f;

    public RunnableC9075t6(C8908f7 c8908f7, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f41644f = c8908f7;
        this.f41640b = atomicReference;
        this.f41641c = str2;
        this.f41642d = str3;
        this.f41643e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41644f.f41723a.m37776R().m38299P(this.f41640b, null, this.f41641c, this.f41642d, this.f41643e);
    }
}
