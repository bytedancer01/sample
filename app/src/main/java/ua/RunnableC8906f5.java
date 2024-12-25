package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/f5.class
 */
/* renamed from: ua.f5 */
/* loaded from: combined.jar:classes2.jar:ua/f5.class */
public final class RunnableC8906f5 implements Runnable {

    /* renamed from: b */
    public final C8852b f41059b;

    /* renamed from: c */
    public final BinderC9097v5 f41060c;

    public RunnableC8906f5(BinderC9097v5 binderC9097v5, C8852b c8852b) {
        this.f41060c = binderC9097v5;
        this.f41059b = c8852b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        C9123x9 c9123x93;
        c9123x9 = this.f41060c.f41698b;
        c9123x9.m38389p();
        if (this.f41059b.f40914f.m37750P() == null) {
            c9123x93 = this.f41060c.f41698b;
            c9123x93.m38344A(this.f41059b);
        } else {
            c9123x92 = this.f41060c.f41698b;
            c9123x92.m38398y(this.f41059b);
        }
    }
}
