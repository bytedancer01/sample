package ua;

import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/w7.class
 */
/* renamed from: ua.w7 */
/* loaded from: combined.jar:classes2.jar:ua/w7.class */
public final class RunnableC9110w7 implements Runnable {

    /* renamed from: b */
    public final C8959ja f41726b;

    /* renamed from: c */
    public final boolean f41727c;

    /* renamed from: d */
    public final C8851aa f41728d;

    /* renamed from: e */
    public final C9089u8 f41729e;

    public RunnableC9110w7(C9089u8 c9089u8, C8959ja c8959ja, boolean z10, C8851aa c8851aa) {
        this.f41729e = c9089u8;
        this.f41726b = c8959ja;
        this.f41727c = z10;
        this.f41728d = c8851aa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f41729e.f41679d;
        if (interfaceC9024p3 == null) {
            this.f41729e.f41723a.mo37780c().m38408o().m38326a("Discarding data. Failed to set user property");
            return;
        }
        C9935o.m41850j(this.f41726b);
        this.f41729e.m38294K(interfaceC9024p3, this.f41727c ? null : this.f41728d, this.f41726b);
        this.f41729e.m38287D();
    }
}
