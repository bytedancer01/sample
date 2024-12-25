package p030c0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/g.class
 */
/* renamed from: c0.g */
/* loaded from: combined.jar:classes1.jar:c0/g.class */
public final class C0942g {

    /* renamed from: a */
    public static final Class<?> f6554a;

    /* renamed from: b */
    public static final Field f6555b;

    /* renamed from: c */
    public static final Field f6556c;

    /* renamed from: d */
    public static final Method f6557d;

    /* renamed from: e */
    public static final Method f6558e;

    /* renamed from: f */
    public static final Method f6559f;

    /* renamed from: g */
    public static final Handler f6560g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/g$a.class
     */
    /* renamed from: c0.g$a */
    /* loaded from: combined.jar:classes1.jar:c0/g$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final d f6561b;

        /* renamed from: c */
        public final Object f6562c;

        public a(d dVar, Object obj) {
            this.f6561b = dVar;
            this.f6562c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6561b.f6567b = this.f6562c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/g$b.class
     */
    /* renamed from: c0.g$b */
    /* loaded from: combined.jar:classes1.jar:c0/g$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final Application f6563b;

        /* renamed from: c */
        public final d f6564c;

        public b(Application application, d dVar) {
            this.f6563b = application;
            this.f6564c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6563b.unregisterActivityLifecycleCallbacks(this.f6564c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/g$c.class
     */
    /* renamed from: c0.g$c */
    /* loaded from: combined.jar:classes1.jar:c0/g$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final Object f6565b;

        /* renamed from: c */
        public final Object f6566c;

        public c(Object obj, Object obj2) {
            this.f6565b = obj;
            this.f6566c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0942g.f6557d;
                if (method != null) {
                    method.invoke(this.f6565b, this.f6566c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0942g.f6558e.invoke(this.f6565b, this.f6566c, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c0/g$d.class
     */
    /* renamed from: c0.g$d */
    /* loaded from: combined.jar:classes1.jar:c0/g$d.class */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        public Object f6567b;

        /* renamed from: c */
        public Activity f6568c;

        /* renamed from: d */
        public final int f6569d;

        /* renamed from: e */
        public boolean f6570e = false;

        /* renamed from: f */
        public boolean f6571f = false;

        /* renamed from: g */
        public boolean f6572g = false;

        public d(Activity activity) {
            this.f6568c = activity;
            this.f6569d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f6568c == activity) {
                this.f6568c = null;
                this.f6571f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f6571f || this.f6572g || this.f6570e || !C0942g.m5661h(this.f6567b, this.f6569d, activity)) {
                return;
            }
            this.f6572g = true;
            this.f6567b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f6568c == activity) {
                this.f6570e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m5654a = m5654a();
        f6554a = m5654a;
        f6555b = m5655b();
        f6556c = m5659f();
        f6557d = m5657d(m5654a);
        f6558e = m5656c(m5654a);
        f6559f = m5658e(m5654a);
    }

    /* renamed from: a */
    public static Class<?> m5654a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m5655b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m5656c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m5657d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m5658e(Class<?> cls) {
        if (!m5660g() || cls == null) {
            return null;
        }
        try {
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Boolean.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: f */
    public static Field m5659f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th2) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m5660g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    /* renamed from: h */
    public static boolean m5661h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f6556c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f6560g.postAtFrontOfQueue(new c(f6555b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m5662i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m5660g() && f6559f == null) {
            return false;
        }
        if (f6558e == null && f6557d == null) {
            return false;
        }
        try {
            Object obj2 = f6556c.get(activity);
            if (obj2 == null || (obj = f6555b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f6560g;
            handler.post(new a(dVar, obj2));
            try {
                if (m5660g()) {
                    Method method = f6559f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th2) {
                f6560g.post(new b(application, dVar));
                throw th2;
            }
        } catch (Throwable th3) {
            return false;
        }
    }
}
