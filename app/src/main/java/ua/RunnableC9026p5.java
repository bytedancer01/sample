package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/p5.class
 */
/* renamed from: ua.p5 */
/* loaded from: combined.jar:classes2.jar:ua/p5.class */
public final class RunnableC9026p5 implements Runnable {

    /* renamed from: b */
    public final C9068t f41538b;

    /* renamed from: c */
    public final String f41539c;

    /* renamed from: d */
    public final BinderC9097v5 f41540d;

    public RunnableC9026p5(BinderC9097v5 binderC9097v5, C9068t c9068t, String str) {
        this.f41540d = binderC9097v5;
        this.f41538b = c9068t;
        this.f41539c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        c9123x9 = this.f41540d.f41698b;
        c9123x9.m38389p();
        c9123x92 = this.f41540d.f41698b;
        c9123x92.m38388o0(this.f41538b, this.f41539c);
    }
}
