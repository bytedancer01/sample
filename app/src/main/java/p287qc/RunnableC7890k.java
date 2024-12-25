package p287qc;

import bd.InterfaceC0891b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/k.class
 */
/* renamed from: qc.k */
/* loaded from: combined.jar:classes2.jar:qc/k.class */
public final /* synthetic */ class RunnableC7890k implements Runnable {

    /* renamed from: b */
    public final C7879b0 f37994b;

    /* renamed from: c */
    public final InterfaceC0891b f37995c;

    public RunnableC7890k(C7879b0 c7879b0, InterfaceC0891b interfaceC0891b) {
        this.f37994b = c7879b0;
        this.f37995c = interfaceC0891b;
    }

    /* renamed from: a */
    public static Runnable m34200a(C7879b0 c7879b0, InterfaceC0891b interfaceC0891b) {
        return new RunnableC7890k(c7879b0, interfaceC0891b);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37994b.m34160d(this.f37995c);
    }
}
