package ua;

import android.os.RemoteException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/i8.class
 */
/* renamed from: ua.i8 */
/* loaded from: combined.jar:classes2.jar:ua/i8.class */
public final class RunnableC8945i8 implements Runnable {

    /* renamed from: b */
    public final C8959ja f41188b;

    /* renamed from: c */
    public final C9089u8 f41189c;

    public RunnableC8945i8(C9089u8 c9089u8, C8959ja c8959ja) {
        this.f41189c = c9089u8;
        this.f41188b = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f41189c.f41679d;
        if (interfaceC9024p3 == null) {
            this.f41189c.f41723a.mo37780c().m38408o().m38326a("Failed to send consent settings to service");
            return;
        }
        try {
            C9935o.m41850j(this.f41188b);
            interfaceC9024p3.mo38147Y0(this.f41188b);
            this.f41189c.m38287D();
        } catch (RemoteException e10) {
            this.f41189c.f41723a.mo37780c().m38408o().m38327b("Failed to send consent settings to the service", e10);
        }
    }
}
