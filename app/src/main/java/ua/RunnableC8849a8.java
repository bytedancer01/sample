package ua;

import android.os.RemoteException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/a8.class
 */
/* renamed from: ua.a8 */
/* loaded from: combined.jar:classes2.jar:ua/a8.class */
public final class RunnableC8849a8 implements Runnable {

    /* renamed from: b */
    public final C8959ja f40902b;

    /* renamed from: c */
    public final C9089u8 f40903c;

    public RunnableC8849a8(C9089u8 c9089u8, C8959ja c8959ja) {
        this.f40903c = c9089u8;
        this.f40902b = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f40903c.f41679d;
        if (interfaceC9024p3 == null) {
            this.f40903c.f41723a.mo37780c().m38408o().m38326a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C9935o.m41850j(this.f40902b);
            interfaceC9024p3.mo38143P0(this.f40902b);
            this.f40903c.f41723a.m37767I().m38222u();
            this.f40903c.m38294K(interfaceC9024p3, null, this.f40902b);
            this.f40903c.m38287D();
        } catch (RemoteException e10) {
            this.f40903c.f41723a.mo37780c().m38408o().m38327b("Failed to send app launch to the service", e10);
        }
    }
}
