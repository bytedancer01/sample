package p383w9;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p060da.C4414m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/c.class
 */
/* renamed from: w9.c */
/* loaded from: combined.jar:classes2.jar:w9/c.class */
public final class ComponentCallbacks2C9442c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f */
    public static final ComponentCallbacks2C9442c f43216f = new ComponentCallbacks2C9442c();

    /* renamed from: b */
    public final AtomicBoolean f43217b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f43218c = new AtomicBoolean();

    /* renamed from: d */
    public final ArrayList<a> f43219d = new ArrayList<>();

    /* renamed from: e */
    public boolean f43220e = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w9/c$a.class
     */
    /* renamed from: w9.c$a */
    /* loaded from: combined.jar:classes2.jar:w9/c$a.class */
    public interface a {
        /* renamed from: a */
        void mo30249a(boolean z10);
    }

    /* renamed from: b */
    public static ComponentCallbacks2C9442c m39809b() {
        return f43216f;
    }

    /* renamed from: c */
    public static void m39810c(Application application) {
        ComponentCallbacks2C9442c componentCallbacks2C9442c = f43216f;
        synchronized (componentCallbacks2C9442c) {
            if (!componentCallbacks2C9442c.f43220e) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C9442c);
                application.registerComponentCallbacks(componentCallbacks2C9442c);
                componentCallbacks2C9442c.f43220e = true;
            }
        }
    }

    /* renamed from: a */
    public void m39811a(a aVar) {
        synchronized (f43216f) {
            this.f43219d.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m39812d() {
        return this.f43217b.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean m39813e(boolean z10) {
        if (!this.f43218c.get()) {
            if (!C4414m.m22451b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f43218c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f43217b.set(true);
            }
        }
        return m39812d();
    }

    /* renamed from: f */
    public final void m39814f(boolean z10) {
        synchronized (f43216f) {
            Iterator<a> it = this.f43219d.iterator();
            while (it.hasNext()) {
                it.next().mo30249a(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f43217b.compareAndSet(true, false);
        this.f43218c.set(true);
        if (compareAndSet) {
            m39814f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f43217b.compareAndSet(true, false);
        this.f43218c.set(true);
        if (compareAndSet) {
            m39814f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f43217b.compareAndSet(false, true)) {
            this.f43218c.set(true);
            m39814f(true);
        }
    }
}
