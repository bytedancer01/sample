package ua;

import android.os.Bundle;
import p305ra.C8234l9;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/p6.class
 */
/* renamed from: ua.p6 */
/* loaded from: combined.jar:classes2.jar:ua/p6.class */
public final class RunnableC9027p6 implements Runnable {

    /* renamed from: b */
    public final Bundle f41541b;

    /* renamed from: c */
    public final C8908f7 f41542c;

    public RunnableC9027p6(C8908f7 c8908f7, Bundle bundle) {
        this.f41542c = c8908f7;
        this.f41541b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8908f7 c8908f7 = this.f41542c;
        Bundle bundle = this.f41541b;
        c8908f7.mo37811h();
        c8908f7.m37905j();
        C9935o.m41850j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C9935o.m41846f(string);
        C9935o.m41846f(string2);
        C9935o.m41850j(bundle.get("value"));
        if (!c8908f7.f41723a.m37787k()) {
            c8908f7.f41723a.mo37780c().m38416w().m38326a("Conditional property not set since app measurement is disabled");
            return;
        }
        C8851aa c8851aa = new C8851aa(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C8899ea m37765G = c8908f7.f41723a.m37765G();
            String string3 = bundle.getString("app_id");
            String string4 = bundle.getString("triggered_event_name");
            Bundle bundle2 = bundle.getBundle("triggered_event_params");
            C8234l9.m35593a();
            C8900f m37797z = c8908f7.f41723a.m37797z();
            C8976l3<Boolean> c8976l3 = C8988m3.f41331K0;
            C9068t m37832J = m37765G.m37832J(string3, string4, bundle2, string2, 0L, true, false, m37797z.m37900w(null, c8976l3));
            C8899ea m37765G2 = c8908f7.f41723a.m37765G();
            String string5 = bundle.getString("app_id");
            String string6 = bundle.getString("timed_out_event_name");
            Bundle bundle3 = bundle.getBundle("timed_out_event_params");
            C8234l9.m35593a();
            C9068t m37832J2 = m37765G2.m37832J(string5, string6, bundle3, string2, 0L, true, false, c8908f7.f41723a.m37797z().m37900w(null, c8976l3));
            C8899ea m37765G3 = c8908f7.f41723a.m37765G();
            String string7 = bundle.getString("app_id");
            String string8 = bundle.getString("expired_event_name");
            Bundle bundle4 = bundle.getBundle("expired_event_params");
            C8234l9.m35593a();
            c8908f7.f41723a.m37776R().m38296M(new C8852b(bundle.getString("app_id"), string2, c8851aa, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), m37832J2, bundle.getLong("trigger_timeout"), m37832J, bundle.getLong("time_to_live"), m37765G3.m37832J(string7, string8, bundle4, string2, 0L, true, false, c8908f7.f41723a.m37797z().m37900w(null, c8976l3))));
        } catch (IllegalArgumentException e10) {
        }
    }
}
