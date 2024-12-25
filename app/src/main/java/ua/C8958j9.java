package ua;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import p305ra.C8310qa;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/j9.class
 */
/* renamed from: ua.j9 */
/* loaded from: combined.jar:classes2.jar:ua/j9.class */
public final class C8958j9 {

    /* renamed from: a */
    public final C8970k9 f41227a;

    public C8958j9(C8970k9 c8970k9) {
        this.f41227a = c8970k9;
    }

    /* renamed from: a */
    public final void m38094a() {
        this.f41227a.mo37811h();
        if (this.f41227a.f41723a.m37759A().m38174w(this.f41227a.f41723a.mo37778a().mo22432a())) {
            this.f41227a.f41723a.m37759A().f41494q.m38091b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f41227a.f41723a.mo37780c().m38416w().m38326a("Detected application was in foreground");
                m38096c(this.f41227a.f41723a.mo37778a().mo22432a(), false);
            }
        }
    }

    /* renamed from: b */
    public final void m38095b(long j10, boolean z10) {
        this.f41227a.mo37811h();
        this.f41227a.m38106s();
        if (this.f41227a.f41723a.m37759A().m38174w(j10)) {
            this.f41227a.f41723a.m37759A().f41494q.m38091b(true);
        }
        this.f41227a.f41723a.m37759A().f41497t.m38110b(j10);
        if (this.f41227a.f41723a.m37759A().f41494q.m38090a()) {
            m38096c(j10, z10);
        }
    }

    /* renamed from: c */
    public final void m38096c(long j10, boolean z10) {
        this.f41227a.mo37811h();
        if (this.f41227a.f41723a.m37787k()) {
            this.f41227a.f41723a.m37759A().f41497t.m38110b(j10);
            this.f41227a.f41723a.mo37780c().m38416w().m38327b("Session started, time", Long.valueOf(this.f41227a.f41723a.mo37778a().mo22433b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f41227a.f41723a.m37764F().m37941p("auto", "_sid", valueOf, j10);
            this.f41227a.f41723a.m37759A().f41494q.m38091b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f41227a.f41723a.m37797z().m37900w(null, C8988m3.f41372k0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f41227a.f41723a.m37764F().m37934Y("auto", "_s", j10, bundle);
            C8310qa.m35742a();
            if (this.f41227a.f41723a.m37797z().m37900w(null, C8988m3.f41382p0)) {
                String m38155a = this.f41227a.f41723a.m37759A().f41502y.m38155a();
                if (TextUtils.isEmpty(m38155a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m38155a);
                this.f41227a.f41723a.m37764F().m37934Y("auto", "_ssr", j10, bundle2);
            }
        }
    }
}
