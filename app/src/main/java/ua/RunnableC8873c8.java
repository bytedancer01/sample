package ua;

import android.os.Bundle;
import android.os.RemoteException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/c8.class
 */
/* renamed from: ua.c8 */
/* loaded from: combined.jar:classes2.jar:ua/c8.class */
public final class RunnableC8873c8 implements Runnable {

    /* renamed from: b */
    public final C8959ja f40997b;

    /* renamed from: c */
    public final Bundle f40998c;

    /* renamed from: d */
    public final C9089u8 f40999d;

    public RunnableC8873c8(C9089u8 c9089u8, C8959ja c8959ja, Bundle bundle) {
        this.f40999d = c9089u8;
        this.f40997b = c8959ja;
        this.f40998c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9024p3 interfaceC9024p3;
        interfaceC9024p3 = this.f40999d.f41679d;
        if (interfaceC9024p3 == null) {
            this.f40999d.f41723a.mo37780c().m38408o().m38326a("Failed to send default event parameters to service");
            return;
        }
        try {
            C9935o.m41850j(this.f40997b);
            interfaceC9024p3.mo38150g1(this.f40998c, this.f40997b);
        } catch (RemoteException e10) {
            this.f40999d.f41723a.mo37780c().m38408o().m38327b("Failed to send default event parameters to service", e10);
        }
    }
}
