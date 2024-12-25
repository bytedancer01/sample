package ua;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import p305ra.InterfaceC8358td;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/m8.class
 */
/* renamed from: ua.m8 */
/* loaded from: combined.jar:classes2.jar:ua/m8.class */
public final class RunnableC8993m8 implements Runnable {

    /* renamed from: b */
    public final String f41419b;

    /* renamed from: c */
    public final String f41420c;

    /* renamed from: d */
    public final C8959ja f41421d;

    /* renamed from: e */
    public final InterfaceC8358td f41422e;

    /* renamed from: f */
    public final C9089u8 f41423f;

    public RunnableC8993m8(C9089u8 c9089u8, String str, String str2, C8959ja c8959ja, InterfaceC8358td interfaceC8358td) {
        this.f41423f = c9089u8;
        this.f41419b = str;
        this.f41420c = str2;
        this.f41421d = c8959ja;
        this.f41422e = interfaceC8358td;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        ArrayList<Bundle> arrayList2 = arrayList;
        ArrayList<Bundle> arrayList3 = arrayList;
        try {
            try {
                interfaceC9024p3 = this.f41423f.f41679d;
                if (interfaceC9024p3 == null) {
                    arrayList2 = arrayList;
                    this.f41423f.f41723a.mo37780c().m38408o().m38328c("Failed to get conditional properties; not connected to service", this.f41419b, this.f41420c);
                    arrayList3 = arrayList;
                } else {
                    C9935o.m41850j(this.f41421d);
                    ArrayList<Bundle> m37822Y = C8899ea.m37822Y(interfaceC9024p3.mo38146X0(this.f41419b, this.f41420c, this.f41421d));
                    arrayList2 = m37822Y;
                    this.f41423f.m38287D();
                    arrayList3 = m37822Y;
                }
            } catch (RemoteException e10) {
                arrayList2 = arrayList3;
                this.f41423f.f41723a.mo37780c().m38408o().m38329d("Failed to get conditional properties; remote exception", this.f41419b, this.f41420c, e10);
            }
            this.f41423f.f41723a.m37765G().m37845X(this.f41422e, arrayList3);
        } catch (Throwable th2) {
            this.f41423f.f41723a.m37765G().m37845X(this.f41422e, arrayList2);
            throw th2;
        }
    }
}
