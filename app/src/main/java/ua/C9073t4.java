package ua;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/t4.class
 */
/* renamed from: ua.t4 */
/* loaded from: combined.jar:classes2.jar:ua/t4.class */
public final class C9073t4 {

    /* renamed from: a */
    public final InterfaceC9061s4 f41637a;

    public C9073t4(InterfaceC9061s4 interfaceC9061s4) {
        C9935o.m41850j(interfaceC9061s4);
        this.f41637a = interfaceC9061s4;
    }

    /* renamed from: a */
    public static boolean m38236a(Context context) {
        ActivityInfo receiverInfo;
        C9935o.m41850j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null) {
                return false;
            }
            return receiverInfo.enabled;
        } catch (PackageManager.NameNotFoundException e10) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m38237b(Context context, Intent intent) {
        C8870c5 m37753h = C8870c5.m37753h(context, null, null);
        C9128y3 mo37780c = m37753h.mo37780c();
        if (intent == null) {
            mo37780c.m38411r().m38326a("Receiver called with null intent");
            return;
        }
        m37753h.mo37783f();
        String action = intent.getAction();
        mo37780c.m38416w().m38327b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                mo37780c.m38411r().m38326a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo37780c.m38416w().m38326a("Starting wakeful intent.");
            this.f41637a.mo13191a(context, className);
        }
    }
}
