package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u5.class
 */
/* renamed from: ua.u5 */
/* loaded from: combined.jar:classes2.jar:ua/u5.class */
public final class RunnableC9086u5 implements Runnable {

    /* renamed from: b */
    public final String f41660b;

    /* renamed from: c */
    public final String f41661c;

    /* renamed from: d */
    public final String f41662d;

    /* renamed from: e */
    public final long f41663e;

    /* renamed from: f */
    public final BinderC9097v5 f41664f;

    public RunnableC9086u5(BinderC9097v5 binderC9097v5, String str, String str2, String str3, long j10) {
        this.f41664f = binderC9097v5;
        this.f41660b = str;
        this.f41661c = str2;
        this.f41662d = str3;
        this.f41663e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9123x9 c9123x9;
        C9123x9 c9123x92;
        String str = this.f41660b;
        if (str == null) {
            c9123x92 = this.f41664f.f41698b;
            c9123x92.m38396w().m37775Q().m38278y(this.f41661c, null);
        } else {
            C9004n7 c9004n7 = new C9004n7(this.f41662d, str, this.f41663e);
            c9123x9 = this.f41664f.f41698b;
            c9123x9.m38396w().m37775Q().m38278y(this.f41661c, c9004n7);
        }
    }
}
