package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/n6.class
 */
/* renamed from: ua.n6 */
/* loaded from: combined.jar:classes2.jar:ua/n6.class */
public final class RunnableC9003n6 implements Runnable {

    /* renamed from: b */
    public final String f41440b;

    /* renamed from: c */
    public final String f41441c;

    /* renamed from: d */
    public final Object f41442d;

    /* renamed from: e */
    public final long f41443e;

    /* renamed from: f */
    public final C8908f7 f41444f;

    public RunnableC9003n6(C8908f7 c8908f7, String str, String str2, Object obj, long j10) {
        this.f41444f = c8908f7;
        this.f41440b = str;
        this.f41441c = str2;
        this.f41442d = obj;
        this.f41443e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41444f.m37941p(this.f41440b, this.f41441c, this.f41442d, this.f41443e);
    }
}
