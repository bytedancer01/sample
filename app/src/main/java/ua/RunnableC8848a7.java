package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/a7.class
 */
/* renamed from: ua.a7 */
/* loaded from: combined.jar:classes2.jar:ua/a7.class */
public final class RunnableC8848a7 implements Runnable {

    /* renamed from: b */
    public final C8912g f40896b;

    /* renamed from: c */
    public final long f40897c;

    /* renamed from: d */
    public final int f40898d;

    /* renamed from: e */
    public final long f40899e;

    /* renamed from: f */
    public final boolean f40900f;

    /* renamed from: g */
    public final C8908f7 f40901g;

    public RunnableC8848a7(C8908f7 c8908f7, C8912g c8912g, long j10, int i10, long j11, boolean z10) {
        this.f40901g = c8908f7;
        this.f40896b = c8912g;
        this.f40897c = j10;
        this.f40898d = i10;
        this.f40899e = j11;
        this.f40900f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40901g.m37932W(this.f40896b);
        this.f40901g.m37945t(this.f40897c, false);
        C8908f7.m37911J(this.f40901g, this.f40896b, this.f40898d, this.f40899e, true, this.f40900f);
    }
}
