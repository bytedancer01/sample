package ua;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/e7.class
 */
@TargetApi(14)
/* renamed from: ua.e7 */
/* loaded from: combined.jar:classes2.jar:ua/e7.class */
public final class C8896e7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final C8908f7 f41037b;

    public /* synthetic */ C8896e7(C8908f7 c8908f7, RunnableC9051r6 runnableC9051r6) {
        this.f41037b = c8908f7;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.f41037b.f41723a.mo37780c().m38416w().m38326a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.f41037b.f41723a.m37765G();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z10 = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z10 = false;
                    }
                    this.f41037b.f41723a.mo37782e().m38436r(new RunnableC8884d7(this, z10, data, str, queryParameter));
                }
            } catch (Exception e10) {
                this.f41037b.f41723a.mo37780c().m38408o().m38327b("Throwable caught in onActivityCreated", e10);
            }
        } finally {
            this.f41037b.f41723a.m37775Q().m38279z(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f41037b.f41723a.m37775Q().m38268D(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f41037b.f41723a.m37775Q().m38266B(activity);
        C8970k9 m37761C = this.f41037b.f41723a.m37761C();
        m37761C.f41723a.mo37782e().m38436r(new RunnableC8874c9(m37761C, m37761C.f41723a.mo37778a().mo22433b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C8970k9 m37761C = this.f41037b.f41723a.m37761C();
        m37761C.f41723a.mo37782e().m38436r(new RunnableC8862b9(m37761C, m37761C.f41723a.mo37778a().mo22433b()));
        this.f41037b.f41723a.m37775Q().m38265A(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f41037b.f41723a.m37775Q().m38267C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
