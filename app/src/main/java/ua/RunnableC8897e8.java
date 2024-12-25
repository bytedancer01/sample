package ua;

import android.os.RemoteException;
import p305ra.InterfaceC8358td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/e8.class
 */
/* renamed from: ua.e8 */
/* loaded from: combined.jar:classes2.jar:ua/e8.class */
public final class RunnableC8897e8 implements Runnable {

    /* renamed from: b */
    public final C9068t f41038b;

    /* renamed from: c */
    public final String f41039c;

    /* renamed from: d */
    public final InterfaceC8358td f41040d;

    /* renamed from: e */
    public final C9089u8 f41041e;

    public RunnableC8897e8(C9089u8 c9089u8, C9068t c9068t, String str, InterfaceC8358td interfaceC8358td) {
        this.f41041e = c9089u8;
        this.f41038b = c9068t;
        this.f41039c = str;
        this.f41040d = interfaceC8358td;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        byte[] bArr = null;
        byte[] bArr2 = null;
        try {
            try {
                interfaceC9024p3 = this.f41041e.f41679d;
                if (interfaceC9024p3 == null) {
                    bArr = null;
                    this.f41041e.f41723a.mo37780c().m38408o().m38326a("Discarding data. Failed to send event to service to bundle");
                    bArr2 = null;
                } else {
                    byte[] mo38151i1 = interfaceC9024p3.mo38151i1(this.f41038b, this.f41039c);
                    bArr = mo38151i1;
                    this.f41041e.m38287D();
                    bArr2 = mo38151i1;
                }
            } catch (RemoteException e10) {
                bArr = bArr2;
                this.f41041e.f41723a.mo37780c().m38408o().m38327b("Failed to send event to the service to bundle", e10);
            }
            this.f41041e.f41723a.m37765G().m37842U(this.f41040d, bArr2);
        } catch (Throwable th2) {
            this.f41041e.f41723a.m37765G().m37842U(this.f41040d, bArr);
            throw th2;
        }
    }
}
