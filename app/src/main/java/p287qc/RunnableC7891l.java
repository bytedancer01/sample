package p287qc;

import bd.InterfaceC0891b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/l.class
 */
/* renamed from: qc.l */
/* loaded from: combined.jar:classes2.jar:qc/l.class */
public final /* synthetic */ class RunnableC7891l implements Runnable {

    /* renamed from: b */
    public final C7903x f37996b;

    /* renamed from: c */
    public final InterfaceC0891b f37997c;

    public RunnableC7891l(C7903x c7903x, InterfaceC0891b interfaceC0891b) {
        this.f37996b = c7903x;
        this.f37997c = interfaceC0891b;
    }

    /* renamed from: a */
    public static Runnable m34201a(C7903x c7903x, InterfaceC0891b interfaceC0891b) {
        return new RunnableC7891l(c7903x, interfaceC0891b);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37996b.m34250a(this.f37997c);
    }
}
