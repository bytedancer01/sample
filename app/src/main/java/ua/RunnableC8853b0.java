package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/b0.class
 */
/* renamed from: ua.b0 */
/* loaded from: combined.jar:classes2.jar:ua/b0.class */
public final class RunnableC8853b0 implements Runnable {

    /* renamed from: b */
    public final String f40923b;

    /* renamed from: c */
    public final long f40924c;

    /* renamed from: d */
    public final C8879d2 f40925d;

    public RunnableC8853b0(C8879d2 c8879d2, String str, long j10) {
        this.f40925d = c8879d2;
        this.f40923b = str;
        this.f40924c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8879d2.m37800m(this.f40925d, this.f40923b, this.f40924c);
    }
}
