package ua;

import android.os.RemoteException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/x7.class
 */
/* renamed from: ua.x7 */
/* loaded from: combined.jar:classes2.jar:ua/x7.class */
public final class RunnableC9121x7 implements Runnable {

    /* renamed from: b */
    public final C8959ja f41751b;

    /* renamed from: c */
    public final C9089u8 f41752c;

    public RunnableC9121x7(C9089u8 c9089u8, C8959ja c8959ja) {
        this.f41752c = c9089u8;
        this.f41751b = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f41752c.f41679d;
        if (interfaceC9024p3 == null) {
            this.f41752c.f41723a.mo37780c().m38408o().m38326a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C9935o.m41850j(this.f41751b);
            interfaceC9024p3.mo38148d1(this.f41751b);
        } catch (RemoteException e10) {
            this.f41752c.f41723a.mo37780c().m38408o().m38327b("Failed to reset data on the service: remote exception", e10);
        }
        this.f41752c.m38287D();
    }
}
