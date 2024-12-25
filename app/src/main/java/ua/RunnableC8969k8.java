package ua;

import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/k8.class
 */
/* renamed from: ua.k8 */
/* loaded from: combined.jar:classes2.jar:ua/k8.class */
public final class RunnableC8969k8 implements Runnable {

    /* renamed from: b */
    public final C8959ja f41264b;

    /* renamed from: c */
    public final boolean f41265c;

    /* renamed from: d */
    public final C8852b f41266d;

    /* renamed from: e */
    public final C8852b f41267e;

    /* renamed from: f */
    public final C9089u8 f41268f;

    public RunnableC8969k8(C9089u8 c9089u8, boolean z10, C8959ja c8959ja, boolean z11, C8852b c8852b, C8852b c8852b2) {
        this.f41268f = c9089u8;
        this.f41264b = c8959ja;
        this.f41265c = z11;
        this.f41266d = c8852b;
        this.f41267e = c8852b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f41268f.f41679d;
        if (interfaceC9024p3 == null) {
            this.f41268f.f41723a.mo37780c().m38408o().m38326a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C9935o.m41850j(this.f41264b);
        this.f41268f.m38294K(interfaceC9024p3, this.f41265c ? null : this.f41266d, this.f41264b);
        this.f41268f.m38287D();
    }
}
