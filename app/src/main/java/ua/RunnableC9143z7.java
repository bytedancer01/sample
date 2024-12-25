package ua;

import android.os.RemoteException;
import p305ra.C8175ha;
import p305ra.InterfaceC8358td;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/z7.class
 */
/* renamed from: ua.z7 */
/* loaded from: combined.jar:classes2.jar:ua/z7.class */
public final class RunnableC9143z7 implements Runnable {

    /* renamed from: b */
    public final C8959ja f41831b;

    /* renamed from: c */
    public final InterfaceC8358td f41832c;

    /* renamed from: d */
    public final C9089u8 f41833d;

    public RunnableC9143z7(C9089u8 c9089u8, C8959ja c8959ja, InterfaceC8358td interfaceC8358td) {
        this.f41833d = c9089u8;
        this.f41831b = c8959ja;
        this.f41832c = interfaceC8358td;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        String str = null;
        try {
            try {
                C8175ha.m35418a();
                if (!this.f41833d.f41723a.m37797z().m37900w(null, C8988m3.f41323G0) || this.f41833d.f41723a.m37759A().m38171t().m37967h()) {
                    interfaceC9024p3 = this.f41833d.f41679d;
                    if (interfaceC9024p3 == null) {
                        this.f41833d.f41723a.mo37780c().m38408o().m38326a("Failed to get app instance id");
                        str = null;
                    } else {
                        C9935o.m41850j(this.f41831b);
                        String mo38149f0 = interfaceC9024p3.mo38149f0(this.f41831b);
                        if (mo38149f0 != null) {
                            this.f41833d.f41723a.m37764F().m37943r(mo38149f0);
                            this.f41833d.f41723a.m37759A().f41489l.m38156b(mo38149f0);
                        }
                        this.f41833d.m38287D();
                        str = mo38149f0;
                    }
                } else {
                    this.f41833d.f41723a.mo37780c().m38413t().m38326a("Analytics storage consent denied; will not get app instance id");
                    this.f41833d.f41723a.m37764F().m37943r(null);
                    this.f41833d.f41723a.m37759A().f41489l.m38156b(null);
                    str = null;
                }
            } catch (RemoteException e10) {
                this.f41833d.f41723a.mo37780c().m38408o().m38327b("Failed to get app instance id", e10);
            }
            this.f41833d.f41723a.m37765G().m37839R(this.f41832c, str);
        } catch (Throwable th2) {
            this.f41833d.f41723a.m37765G().m37839R(this.f41832c, null);
            throw th2;
        }
    }
}
