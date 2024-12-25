package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/c7.class
 */
/* renamed from: ua.c7 */
/* loaded from: combined.jar:classes2.jar:ua/c7.class */
public final class RunnableC8872c7 implements Runnable {

    /* renamed from: b */
    public final C8912g f40992b;

    /* renamed from: c */
    public final int f40993c;

    /* renamed from: d */
    public final long f40994d;

    /* renamed from: e */
    public final boolean f40995e;

    /* renamed from: f */
    public final C8908f7 f40996f;

    public RunnableC8872c7(C8908f7 c8908f7, C8912g c8912g, int i10, long j10, boolean z10) {
        this.f40996f = c8908f7;
        this.f40992b = c8912g;
        this.f40993c = i10;
        this.f40994d = j10;
        this.f40995e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40996f.m37932W(this.f40992b);
        C8908f7.m37911J(this.f40996f, this.f40992b, this.f40993c, this.f40994d, false, this.f40995e);
    }
}
