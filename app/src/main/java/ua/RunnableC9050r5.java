package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r5.class
 */
/* renamed from: ua.r5 */
/* loaded from: combined.jar:classes2.jar:ua/r5.class */
public final class RunnableC9050r5 implements Runnable {

    /* renamed from: b */
    public final C8851aa f41594b;

    /* renamed from: c */
    public final C8959ja f41595c;

    /* renamed from: d */
    public final BinderC9097v5 f41596d;

    public RunnableC9050r5(BinderC9097v5 binderC9097v5, C8851aa c8851aa, C8959ja c8959ja) {
        this.f41596d = binderC9097v5;
        this.f41594b = c8851aa;
        this.f41595c = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        C9123x9 c9123x93;
        c9123x9 = this.f41596d.f41698b;
        c9123x9.m38389p();
        if (this.f41594b.m37750P() == null) {
            c9123x93 = this.f41596d.f41698b;
            c9123x93.m38393t(this.f41594b, this.f41595c);
        } else {
            c9123x92 = this.f41596d.f41698b;
            c9123x92.m38392s(this.f41594b, this.f41595c);
        }
    }
}
