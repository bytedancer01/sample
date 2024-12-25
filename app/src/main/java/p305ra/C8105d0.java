package p305ra;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d0.class
 */
/* renamed from: ra.d0 */
/* loaded from: combined.jar:classes2.jar:ra/d0.class */
public final class C8105d0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final C8120e0 f38985b;

    public C8105d0(C8120e0 c8120e0) {
        this.f38985b = c8120e0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f38985b.m35244p(new C8389w(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f38985b.m35244p(new C8090c0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f38985b.m35244p(new C8434z(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f38985b.m35244p(new C8419y(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC8385va binderC8385va = new BinderC8385va();
        this.f38985b.m35244p(new C8075b0(this, activity, binderC8385va));
        Bundle m35972U0 = binderC8385va.m35972U0(50L);
        if (m35972U0 != null) {
            bundle.putAll(m35972U0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f38985b.m35244p(new C8404x(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f38985b.m35244p(new C8060a0(this, activity));
    }
}
