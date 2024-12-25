package ua;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import p305ra.InterfaceC8358td;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/v7.class
 */
/* renamed from: ua.v7 */
/* loaded from: combined.jar:classes2.jar:ua/v7.class */
public final class RunnableC9099v7 implements Runnable {

    /* renamed from: b */
    public final String f41703b;

    /* renamed from: c */
    public final String f41704c;

    /* renamed from: d */
    public final C8959ja f41705d;

    /* renamed from: e */
    public final boolean f41706e;

    /* renamed from: f */
    public final InterfaceC8358td f41707f;

    /* renamed from: g */
    public final C9089u8 f41708g;

    public RunnableC9099v7(C9089u8 c9089u8, String str, String str2, C8959ja c8959ja, boolean z10, InterfaceC8358td interfaceC8358td) {
        this.f41708g = c9089u8;
        this.f41703b = str;
        this.f41704c = str2;
        this.f41705d = c8959ja;
        this.f41706e = z10;
        this.f41707f = interfaceC8358td;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        InterfaceC9024p3 interfaceC9024p3;
        Bundle bundle2 = new Bundle();
        try {
            try {
                interfaceC9024p3 = this.f41708g.f41679d;
                if (interfaceC9024p3 == null) {
                    this.f41708g.f41723a.mo37780c().m38408o().m38328c("Failed to get user properties; not connected to service", this.f41703b, this.f41704c);
                    this.f41708g.f41723a.m37765G().m37844W(this.f41707f, bundle2);
                    return;
                }
                C9935o.m41850j(this.f41705d);
                List<C8851aa> mo38142D = interfaceC9024p3.mo38142D(this.f41703b, this.f41704c, this.f41706e, this.f41705d);
                bundle = new Bundle();
                if (mo38142D != null) {
                    for (C8851aa c8851aa : mo38142D) {
                        String str = c8851aa.f40909h;
                        if (str != null) {
                            bundle.putString(c8851aa.f40906e, str);
                        } else {
                            Long l10 = c8851aa.f40908g;
                            if (l10 != null) {
                                bundle.putLong(c8851aa.f40906e, l10.longValue());
                            } else {
                                Double d10 = c8851aa.f40911j;
                                if (d10 != null) {
                                    bundle.putDouble(c8851aa.f40906e, d10.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f41708g.m38287D();
                    this.f41708g.f41723a.m37765G().m37844W(this.f41707f, bundle);
                } catch (RemoteException e10) {
                    e = e10;
                    this.f41708g.f41723a.mo37780c().m38408o().m38328c("Failed to get user properties; remote exception", this.f41703b, e);
                    this.f41708g.f41723a.m37765G().m37844W(this.f41707f, bundle);
                }
            } catch (RemoteException e11) {
                e = e11;
                bundle = bundle2;
            } catch (Throwable th2) {
                th = th2;
                this.f41708g.f41723a.m37765G().m37844W(this.f41707f, bundle2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            this.f41708g.f41723a.m37765G().m37844W(this.f41707f, bundle2);
            throw th;
        }
    }
}
