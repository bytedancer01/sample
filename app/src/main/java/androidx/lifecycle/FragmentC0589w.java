package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/w.class
 */
/* renamed from: androidx.lifecycle.w */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/w.class */
public class FragmentC0589w extends Fragment {

    /* renamed from: b */
    public a f3792b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/w$a.class
     */
    /* renamed from: androidx.lifecycle.w$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/w$a.class */
    public interface a {
        /* renamed from: a */
        void mo3190a();

        void onResume();

        void onStart();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/w$b.class
     */
    /* renamed from: androidx.lifecycle.w$b */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/w$b.class */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC0589w.m3191a(activity, AbstractC0572g.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0589w.m3191a(activity, AbstractC0572g.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0589w.m3191a(activity, AbstractC0572g.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0589w.m3191a(activity, AbstractC0572g.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0589w.m3191a(activity, AbstractC0572g.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0589w.m3191a(activity, AbstractC0572g.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m3191a(Activity activity, AbstractC0572g.b bVar) {
        if (activity instanceof InterfaceC0581o) {
            ((InterfaceC0581o) activity).getLifecycle().m3166h(bVar);
        } else if (activity instanceof InterfaceC0579m) {
            AbstractC0572g lifecycle = ((InterfaceC0579m) activity).getLifecycle();
            if (lifecycle instanceof C0580n) {
                ((C0580n) lifecycle).m3166h(bVar);
            }
        }
    }

    /* renamed from: f */
    public static FragmentC0589w m3192f(Activity activity) {
        return (FragmentC0589w) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m3193g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0589w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void m3194b(AbstractC0572g.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m3191a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    public final void m3195c(a aVar) {
        if (aVar != null) {
            aVar.mo3190a();
        }
    }

    /* renamed from: d */
    public final void m3196d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: e */
    public final void m3197e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: h */
    public void m3198h(a aVar) {
        this.f3792b = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3195c(this.f3792b);
        m3194b(AbstractC0572g.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m3194b(AbstractC0572g.b.ON_DESTROY);
        this.f3792b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m3194b(AbstractC0572g.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m3196d(this.f3792b);
        m3194b(AbstractC0572g.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m3197e(this.f3792b);
        m3194b(AbstractC0572g.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m3194b(AbstractC0572g.b.ON_STOP);
    }
}
