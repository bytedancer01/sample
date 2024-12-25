package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/b7.class
 */
/* renamed from: ua.b7 */
/* loaded from: combined.jar:classes2.jar:ua/b7.class */
public final class RunnableC8860b7 implements Runnable {

    /* renamed from: b */
    public final C8912g f40935b;

    /* renamed from: c */
    public final int f40936c;

    /* renamed from: d */
    public final long f40937d;

    /* renamed from: e */
    public final boolean f40938e;

    /* renamed from: f */
    public final C8908f7 f40939f;

    public RunnableC8860b7(C8908f7 c8908f7, C8912g c8912g, int i10, long j10, boolean z10) {
        this.f40939f = c8908f7;
        this.f40935b = c8912g;
        this.f40936c = i10;
        this.f40937d = j10;
        this.f40938e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40939f.m37932W(this.f40935b);
        C8908f7.m37911J(this.f40939f, this.f40935b, this.f40936c, this.f40937d, false, this.f40938e);
    }
}
