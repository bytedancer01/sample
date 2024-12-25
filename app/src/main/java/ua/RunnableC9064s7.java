package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/s7.class
 */
/* renamed from: ua.s7 */
/* loaded from: combined.jar:classes2.jar:ua/s7.class */
public final class RunnableC9064s7 implements Runnable {

    /* renamed from: b */
    public final C9004n7 f41617b;

    /* renamed from: c */
    public final long f41618c;

    /* renamed from: d */
    public final C9088u7 f41619d;

    public RunnableC9064s7(C9088u7 c9088u7, C9004n7 c9004n7, long j10) {
        this.f41619d = c9088u7;
        this.f41617b = c9004n7;
        this.f41618c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41619d.m38271q(this.f41617b, false, this.f41618c);
        C9088u7 c9088u7 = this.f41619d;
        c9088u7.f41668e = null;
        c9088u7.f41723a.m37776R().m38306W(null);
    }
}
