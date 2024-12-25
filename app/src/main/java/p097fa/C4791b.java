package p097fa;

import android.content.Context;
import p060da.C4414m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fa/b.class
 */
/* renamed from: fa.b */
/* loaded from: combined.jar:classes2.jar:fa/b.class */
public class C4791b {

    /* renamed from: a */
    public static Context f28233a;

    /* renamed from: b */
    public static Boolean f28234b;

    /* renamed from: a */
    public static boolean m24241a(Context context) {
        Boolean bool;
        boolean isInstantApp;
        Boolean bool2;
        synchronized (C4791b.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                Context context2 = f28233a;
                if (context2 != null && (bool2 = f28234b) != null && context2 == applicationContext) {
                    return bool2.booleanValue();
                }
                f28234b = null;
                if (!C4414m.m22458i()) {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f28234b = Boolean.TRUE;
                    } catch (ClassNotFoundException e10) {
                        bool = Boolean.FALSE;
                    }
                    f28233a = applicationContext;
                    return f28234b.booleanValue();
                }
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                bool = Boolean.valueOf(isInstantApp);
                f28234b = bool;
                f28233a = applicationContext;
                return f28234b.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
