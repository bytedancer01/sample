package ua;

import android.os.Bundle;
import p305ra.C8234l9;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/q6.class
 */
/* renamed from: ua.q6 */
/* loaded from: combined.jar:classes2.jar:ua/q6.class */
public final class RunnableC9039q6 implements Runnable {

    /* renamed from: b */
    public final Bundle f41575b;

    /* renamed from: c */
    public final C8908f7 f41576c;

    public RunnableC9039q6(C8908f7 c8908f7, Bundle bundle) {
        this.f41576c = c8908f7;
        this.f41575b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8908f7 c8908f7 = this.f41576c;
        Bundle bundle = this.f41575b;
        c8908f7.mo37811h();
        c8908f7.m37905j();
        C9935o.m41850j(bundle);
        C9935o.m41846f(bundle.getString("name"));
        if (!c8908f7.f41723a.m37787k()) {
            c8908f7.f41723a.mo37780c().m38416w().m38326a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C8851aa c8851aa = new C8851aa(bundle.getString("name"), 0L, null, null);
        try {
            C8899ea m37765G = c8908f7.f41723a.m37765G();
            String string = bundle.getString("app_id");
            String string2 = bundle.getString("expired_event_name");
            Bundle bundle2 = bundle.getBundle("expired_event_params");
            String string3 = bundle.getString("origin");
            long j10 = bundle.getLong("creation_timestamp");
            C8234l9.m35593a();
            c8908f7.f41723a.m37776R().m38296M(new C8852b(bundle.getString("app_id"), bundle.getString("origin"), c8851aa, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), m37765G.m37832J(string, string2, bundle2, string3, j10, true, false, c8908f7.f41723a.m37797z().m37900w(null, C8988m3.f41331K0))));
        } catch (IllegalArgumentException e10) {
        }
    }
}
