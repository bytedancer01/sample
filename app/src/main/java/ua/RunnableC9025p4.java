package ua;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ca.C1052b;
import p305ra.C8415xa;
import p305ra.InterfaceC8303q3;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/p4.class
 */
/* renamed from: ua.p4 */
/* loaded from: combined.jar:classes2.jar:ua/p4.class */
public final class RunnableC9025p4 implements Runnable {

    /* renamed from: b */
    public final InterfaceC8303q3 f41535b;

    /* renamed from: c */
    public final ServiceConnection f41536c;

    /* renamed from: d */
    public final ServiceConnectionC9037q4 f41537d;

    public RunnableC9025p4(ServiceConnectionC9037q4 serviceConnectionC9037q4, InterfaceC8303q3 interfaceC8303q3, ServiceConnection serviceConnection) {
        this.f41537d = serviceConnectionC9037q4;
        this.f41535b = interfaceC8303q3;
        this.f41536c = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        C9106w3 m38408o;
        String str2;
        Bundle mo35651S0;
        ServiceConnectionC9037q4 serviceConnectionC9037q4 = this.f41537d;
        C9049r4 c9049r4 = serviceConnectionC9037q4.f41571c;
        str = serviceConnectionC9037q4.f41570b;
        InterfaceC8303q3 interfaceC8303q3 = this.f41535b;
        ServiceConnection serviceConnection = this.f41536c;
        c9049r4.f41593a.mo37782e().mo37811h();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            mo35651S0 = interfaceC8303q3.mo35651S0(bundle2);
            bundle = mo35651S0;
        } catch (Exception e10) {
            c9049r4.f41593a.mo37780c().m38408o().m38327b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (mo35651S0 == null) {
            c9049r4.f41593a.mo37780c().m38408o().m38326a("Install Referrer Service returned a null response");
            bundle = null;
        }
        c9049r4.f41593a.mo37782e().mo37811h();
        if (bundle != null) {
            long j10 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                m38408o = c9049r4.f41593a.mo37780c().m38411r();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    m38408o = c9049r4.f41593a.mo37780c().m38408o();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    c9049r4.f41593a.mo37780c().m38416w().m38327b("InstallReferrer API result", string);
                    Bundle m37853j0 = c9049r4.f41593a.m37765G().m37853j0(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (m37853j0 == null) {
                        m38408o = c9049r4.f41593a.mo37780c().m38408o();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = m37853j0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                m38408o = c9049r4.f41593a.mo37780c().m38408o();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                m37853j0.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == c9049r4.f41593a.m37759A().f41488k.m38109a()) {
                            m38408o = c9049r4.f41593a.mo37780c().m38416w();
                            str2 = "Install Referrer campaign has already been logged";
                        } else {
                            C8415xa.m36083a();
                            if (!c9049r4.f41593a.m37797z().m37900w(null, C8988m3.f41390t0) || c9049r4.f41593a.m37787k()) {
                                c9049r4.f41593a.m37759A().f41488k.m38110b(j10);
                                c9049r4.f41593a.mo37780c().m38416w().m38327b("Logging Install Referrer campaign from sdk with ", "referrer API");
                                m37853j0.putString("_cis", "referrer API");
                                c9049r4.f41593a.m37764F().m37933X("auto", "_cmp", m37853j0);
                            }
                        }
                    }
                }
            }
            m38408o.m38326a(str2);
        }
        C1052b.m6223b().m6228c(c9049r4.f41593a.mo37779b(), serviceConnection);
    }
}
