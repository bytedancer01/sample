package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/e5.class
 */
/* renamed from: ua.e5 */
/* loaded from: combined.jar:classes2.jar:ua/e5.class */
public final class RunnableC8894e5 implements Runnable {

    /* renamed from: b */
    public final C8852b f41034b;

    /* renamed from: c */
    public final C8959ja f41035c;

    /* renamed from: d */
    public final BinderC9097v5 f41036d;

    public RunnableC8894e5(BinderC9097v5 binderC9097v5, C8852b c8852b, C8959ja c8959ja) {
        this.f41036d = binderC9097v5;
        this.f41034b = c8852b;
        this.f41035c = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        C9123x9 c9123x93;
        c9123x9 = this.f41036d.f41698b;
        c9123x9.m38389p();
        if (this.f41034b.f40914f.m37750P() == null) {
            c9123x93 = this.f41036d.f41698b;
            c9123x93.m38345B(this.f41034b, this.f41035c);
        } else {
            c9123x92 = this.f41036d.f41698b;
            c9123x92.m38399z(this.f41034b, this.f41035c);
        }
    }
}
