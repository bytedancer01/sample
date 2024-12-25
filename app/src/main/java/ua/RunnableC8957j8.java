package ua;

import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/j8.class
 */
/* renamed from: ua.j8 */
/* loaded from: combined.jar:classes2.jar:ua/j8.class */
public final class RunnableC8957j8 implements Runnable {

    /* renamed from: b */
    public final C8959ja f41222b;

    /* renamed from: c */
    public final boolean f41223c;

    /* renamed from: d */
    public final C9068t f41224d;

    /* renamed from: e */
    public final String f41225e;

    /* renamed from: f */
    public final C9089u8 f41226f;

    public RunnableC8957j8(C9089u8 c9089u8, boolean z10, C8959ja c8959ja, boolean z11, C9068t c9068t, String str) {
        this.f41226f = c9089u8;
        this.f41222b = c8959ja;
        this.f41223c = z11;
        this.f41224d = c9068t;
        this.f41225e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f41226f.f41679d;
        if (interfaceC9024p3 == null) {
            this.f41226f.f41723a.mo37780c().m38408o().m38326a("Discarding data. Failed to send event to service");
            return;
        }
        C9935o.m41850j(this.f41222b);
        this.f41226f.m38294K(interfaceC9024p3, this.f41223c ? null : this.f41224d, this.f41222b);
        this.f41226f.m38287D();
    }
}
