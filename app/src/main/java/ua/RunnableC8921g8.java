package ua;

import android.os.RemoteException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/g8.class
 */
/* renamed from: ua.g8 */
/* loaded from: combined.jar:classes2.jar:ua/g8.class */
public final class RunnableC8921g8 implements Runnable {

    /* renamed from: b */
    public final C8959ja f41135b;

    /* renamed from: c */
    public final C9089u8 f41136c;

    public RunnableC8921g8(C9089u8 c9089u8, C8959ja c8959ja) {
        this.f41136c = c9089u8;
        this.f41135b = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f41136c.f41679d;
        if (interfaceC9024p3 == null) {
            this.f41136c.f41723a.mo37780c().m38408o().m38326a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C9935o.m41850j(this.f41135b);
            interfaceC9024p3.mo38140B0(this.f41135b);
            this.f41136c.m38287D();
        } catch (RemoteException e10) {
            this.f41136c.f41723a.mo37780c().m38408o().m38327b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
