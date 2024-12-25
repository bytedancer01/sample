package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/l6.class
 */
/* renamed from: ua.l6 */
/* loaded from: combined.jar:classes2.jar:ua/l6.class */
public final class RunnableC8979l6 implements Runnable {

    /* renamed from: b */
    public final long f41293b;

    /* renamed from: c */
    public final C8908f7 f41294c;

    public RunnableC8979l6(C8908f7 c8908f7, long j10) {
        this.f41294c = c8908f7;
        this.f41293b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41294c.f41723a.m37759A().f41493p.m38110b(this.f41293b);
        this.f41294c.f41723a.mo37780c().m38415v().m38327b("Session timeout duration set", Long.valueOf(this.f41293b));
    }
}
