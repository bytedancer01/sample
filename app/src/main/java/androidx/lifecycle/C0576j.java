package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/j.class
 */
/* renamed from: androidx.lifecycle.j */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/j.class */
public class C0576j {

    /* renamed from: a */
    public static AtomicBoolean f3765a = new AtomicBoolean(false);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/j$a.class
     */
    /* renamed from: androidx.lifecycle.j$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/j$a.class */
    public static class a extends C0566d {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC0589w.m3193g(activity);
        }

        @Override // androidx.lifecycle.C0566d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m3160a(Context context) {
        if (f3765a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}
