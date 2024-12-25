package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/a.class
 */
/* renamed from: ua.a */
/* loaded from: combined.jar:classes2.jar:ua/a.class */
public final class RunnableC8840a implements Runnable {

    /* renamed from: b */
    public final String f40884b;

    /* renamed from: c */
    public final long f40885c;

    /* renamed from: d */
    public final C8879d2 f40886d;

    public RunnableC8840a(C8879d2 c8879d2, String str, long j10) {
        this.f40886d = c8879d2;
        this.f40884b = str;
        this.f40885c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8879d2.m37799l(this.f40886d, this.f40884b, this.f40885c);
    }
}
