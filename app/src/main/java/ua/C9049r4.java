package ua;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import ca.C1052b;
import java.util.List;
import p097fa.C4793d;
import p097fa.C4794e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r4.class
 */
/* renamed from: ua.r4 */
/* loaded from: combined.jar:classes2.jar:ua/r4.class */
public final class C9049r4 {

    /* renamed from: a */
    public final C8870c5 f41593a;

    public C9049r4(C8870c5 c8870c5) {
        this.f41593a = c8870c5;
    }

    /* renamed from: a */
    public final void m38213a(String str) {
        if (str == null || str.isEmpty()) {
            this.f41593a.mo37780c().m38412s().m38326a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f41593a.mo37782e().mo37811h();
        if (!m38214b()) {
            this.f41593a.mo37780c().m38414u().m38326a("Install Referrer Reporter is not available");
            return;
        }
        ServiceConnectionC9037q4 serviceConnectionC9037q4 = new ServiceConnectionC9037q4(this, str);
        this.f41593a.mo37782e().mo37811h();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f41593a.mo37779b().getPackageManager();
        if (packageManager == null) {
            this.f41593a.mo37780c().m38412s().m38326a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f41593a.mo37780c().m38414u().m38326a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !m38214b()) {
                this.f41593a.mo37780c().m38411r().m38326a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f41593a.mo37780c().m38416w().m38327b("Install Referrer Service is", true != C1052b.m6223b().m6227a(this.f41593a.mo37779b(), new Intent(intent), serviceConnectionC9037q4, 1) ? "not available" : "available");
            } catch (Exception e10) {
                this.f41593a.mo37780c().m38408o().m38327b("Exception occurred while binding to Install Referrer Service", e10.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final boolean m38214b() {
        boolean z10 = false;
        try {
            C4793d m24250a = C4794e.m24250a(this.f41593a.mo37779b());
            if (m24250a == null) {
                this.f41593a.mo37780c().m38416w().m38326a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (m24250a.m24247e("com.android.vending", 128).versionCode >= 80837300) {
                z10 = true;
            }
            return z10;
        } catch (Exception e10) {
            this.f41593a.mo37780c().m38416w().m38327b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
