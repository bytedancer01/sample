package ua;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p305ra.C8175ha;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/y7.class
 */
/* renamed from: ua.y7 */
/* loaded from: combined.jar:classes2.jar:ua/y7.class */
public final class RunnableC9132y7 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41805b;

    /* renamed from: c */
    public final C8959ja f41806c;

    /* renamed from: d */
    public final C9089u8 f41807d;

    public RunnableC9132y7(C9089u8 c9089u8, AtomicReference atomicReference, C8959ja c8959ja) {
        this.f41807d = c9089u8;
        this.f41805b = atomicReference;
        this.f41806c = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC9024p3 interfaceC9024p3;
        synchronized (this.f41805b) {
            try {
                try {
                    C8175ha.m35418a();
                } catch (RemoteException e10) {
                    this.f41807d.f41723a.mo37780c().m38408o().m38327b("Failed to get app instance id", e10);
                    atomicReference = this.f41805b;
                }
                if (this.f41807d.f41723a.m37797z().m37900w(null, C8988m3.f41323G0) && !this.f41807d.f41723a.m37759A().m38171t().m37967h()) {
                    this.f41807d.f41723a.mo37780c().m38413t().m38326a("Analytics storage consent denied; will not get app instance id");
                    this.f41807d.f41723a.m37764F().m37943r(null);
                    this.f41807d.f41723a.m37759A().f41489l.m38156b(null);
                    this.f41805b.set(null);
                    return;
                }
                interfaceC9024p3 = this.f41807d.f41679d;
                if (interfaceC9024p3 == null) {
                    this.f41807d.f41723a.mo37780c().m38408o().m38326a("Failed to get app instance id");
                    return;
                }
                C9935o.m41850j(this.f41806c);
                this.f41805b.set(interfaceC9024p3.mo38149f0(this.f41806c));
                String str = (String) this.f41805b.get();
                if (str != null) {
                    this.f41807d.f41723a.m37764F().m37943r(str);
                    this.f41807d.f41723a.m37759A().f41489l.m38156b(str);
                }
                this.f41807d.m38287D();
                atomicReference = this.f41805b;
                atomicReference.notify();
            } finally {
                this.f41805b.notify();
            }
        }
    }
}
