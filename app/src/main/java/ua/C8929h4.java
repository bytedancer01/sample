package ua;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/h4.class
 */
/* renamed from: ua.h4 */
/* loaded from: combined.jar:classes2.jar:ua/h4.class */
public final class C8929h4 extends BroadcastReceiver {

    /* renamed from: d */
    public static final String f41149d = C8929h4.class.getName();

    /* renamed from: a */
    public final C9123x9 f41150a;

    /* renamed from: b */
    public boolean f41151b;

    /* renamed from: c */
    public boolean f41152c;

    public C8929h4(C9123x9 c9123x9) {
        C9935o.m41850j(c9123x9);
        this.f41150a = c9123x9;
    }

    /* renamed from: a */
    public final void m38035a() {
        this.f41150a.m38376i0();
        this.f41150a.mo37782e().mo37811h();
        if (this.f41151b) {
            return;
        }
        this.f41150a.mo37779b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f41152c = this.f41150a.m38362Y().m37813m();
        this.f41150a.mo37780c().m38416w().m38327b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f41152c));
        this.f41151b = true;
    }

    /* renamed from: b */
    public final void m38036b() {
        this.f41150a.m38376i0();
        this.f41150a.mo37782e().mo37811h();
        this.f41150a.mo37782e().mo37811h();
        if (this.f41151b) {
            this.f41150a.mo37780c().m38416w().m38326a("Unregistering connectivity change receiver");
            this.f41151b = false;
            this.f41152c = false;
            try {
                this.f41150a.mo37779b().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f41150a.mo37780c().m38408o().m38327b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f41150a.m38376i0();
        String action = intent.getAction();
        this.f41150a.mo37780c().m38416w().m38327b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f41150a.mo37780c().m38411r().m38327b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m37813m = this.f41150a.m38362Y().m37813m();
        if (this.f41152c != m37813m) {
            this.f41152c = m37813m;
            this.f41150a.mo37782e().m38436r(new RunnableC8917g4(this, m37813m));
        }
    }
}
