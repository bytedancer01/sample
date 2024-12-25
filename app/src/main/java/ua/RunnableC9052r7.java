package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r7.class
 */
/* renamed from: ua.r7 */
/* loaded from: combined.jar:classes2.jar:ua/r7.class */
public final class RunnableC9052r7 implements Runnable {

    /* renamed from: b */
    public final long f41599b;

    /* renamed from: c */
    public final C9088u7 f41600c;

    public RunnableC9052r7(C9088u7 c9088u7, long j10) {
        this.f41600c = c9088u7;
        this.f41599b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41600c.f41723a.m37784g().m37804k(this.f41599b);
        this.f41600c.f41668e = null;
    }
}
