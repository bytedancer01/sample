package ua;

import android.os.RemoteException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/b8.class
 */
/* renamed from: ua.b8 */
/* loaded from: combined.jar:classes2.jar:ua/b8.class */
public final class RunnableC8861b8 implements Runnable {

    /* renamed from: b */
    public final C9004n7 f40940b;

    /* renamed from: c */
    public final C9089u8 f40941c;

    public RunnableC8861b8(C9089u8 c9089u8, C9004n7 c9004n7) {
        this.f40941c = c9089u8;
        this.f40940b = c9004n7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        long j10;
        String str;
        String str2;
        String packageName;
        interfaceC9024p3 = this.f40941c.f41679d;
        if (interfaceC9024p3 == null) {
            this.f40941c.f41723a.mo37780c().m38408o().m38326a("Failed to send current screen to service");
            return;
        }
        try {
            C9004n7 c9004n7 = this.f40940b;
            if (c9004n7 == null) {
                j10 = 0;
                str = null;
                str2 = null;
                packageName = this.f40941c.f41723a.mo37779b().getPackageName();
            } else {
                j10 = c9004n7.f41447c;
                str = c9004n7.f41445a;
                str2 = c9004n7.f41446b;
                packageName = this.f40941c.f41723a.mo37779b().getPackageName();
            }
            interfaceC9024p3.mo38144Q0(j10, str, str2, packageName);
            this.f40941c.m38287D();
        } catch (RemoteException e10) {
            this.f40941c.f41723a.mo37780c().m38408o().m38327b("Failed to send current screen to the service", e10);
        }
    }
}
