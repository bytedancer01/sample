package p050d0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import java.io.File;
import java.util.concurrent.Executor;
import p069e0.C4568g;
import p175k0.C5443d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d0/b.class
 */
/* renamed from: d0.b */
/* loaded from: combined.jar:classes1.jar:d0/b.class */
public class C4290b {

    /* renamed from: a */
    public static final Object f26415a = new Object();

    /* renamed from: b */
    public static final Object f26416b = new Object();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d0/b$a.class
     */
    /* renamed from: d0.b$a */
    /* loaded from: combined.jar:classes1.jar:d0/b$a.class */
    public static class a {
        /* renamed from: a */
        public static void m21734a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m21735b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d0/b$b.class
     */
    /* renamed from: d0.b$b */
    /* loaded from: combined.jar:classes1.jar:d0/b$b.class */
    public static class b {
        /* renamed from: a */
        public static File[] m21736a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m21737b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m21738c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d0/b$c.class
     */
    /* renamed from: d0.b$c */
    /* loaded from: combined.jar:classes1.jar:d0/b$c.class */
    public static class c {
        /* renamed from: a */
        public static File m21739a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m21740b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        /* renamed from: c */
        public static File m21741c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d0/b$d.class
     */
    /* renamed from: d0.b$d */
    /* loaded from: combined.jar:classes1.jar:d0/b$d.class */
    public static class d {
        /* renamed from: a */
        public static int m21742a(Context context, int i10) {
            int color;
            color = context.getColor(i10);
            return color;
        }

        /* renamed from: b */
        public static ColorStateList m21743b(Context context, int i10) {
            ColorStateList colorStateList;
            colorStateList = context.getColorStateList(i10);
            return colorStateList;
        }

        /* renamed from: c */
        public static <T> T m21744c(Context context, Class<T> cls) {
            Object systemService;
            systemService = context.getSystemService(cls);
            return (T) systemService;
        }

        /* renamed from: d */
        public static String m21745d(Context context, Class<?> cls) {
            String systemServiceName;
            systemServiceName = context.getSystemServiceName(cls);
            return systemServiceName;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d0/b$e.class
     */
    /* renamed from: d0.b$e */
    /* loaded from: combined.jar:classes1.jar:d0/b$e.class */
    public static class e {
        /* renamed from: a */
        public static Context m21746a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext;
        }

        /* renamed from: b */
        public static File m21747b(Context context) {
            File dataDir;
            dataDir = context.getDataDir();
            return dataDir;
        }

        /* renamed from: c */
        public static boolean m21748c(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d0/b$f.class
     */
    /* renamed from: d0.b$f */
    /* loaded from: combined.jar:classes1.jar:d0/b$f.class */
    public static class f {
        /* renamed from: a */
        public static ComponentName m21749a(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d0/b$g.class
     */
    /* renamed from: d0.b$g */
    /* loaded from: combined.jar:classes1.jar:d0/b$g.class */
    public static class g {
        /* renamed from: a */
        public static Executor m21750a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    /* renamed from: a */
    public static int m21722a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static Context m21723b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.m21746a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m21724c(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? d.m21742a(context, i10) : context.getResources().getColor(i10);
    }

    /* renamed from: d */
    public static ColorStateList m21725d(Context context, int i10) {
        return C4568g.m23052c(context.getResources(), i10, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m21726e(Context context, int i10) {
        return c.m21740b(context, i10);
    }

    /* renamed from: f */
    public static File[] m21727f(Context context) {
        return b.m21736a(context);
    }

    /* renamed from: g */
    public static File[] m21728g(Context context, String str) {
        return b.m21737b(context, str);
    }

    /* renamed from: h */
    public static Executor m21729h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.m21750a(context) : C5443d.m27196a(new Handler(context.getMainLooper()));
    }

    /* renamed from: i */
    public static File m21730i(Context context) {
        return c.m21741c(context);
    }

    /* renamed from: j */
    public static boolean m21731j(Context context, Intent[] intentArr, Bundle bundle) {
        a.m21734a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: k */
    public static void m21732k(Context context, Intent intent, Bundle bundle) {
        a.m21735b(context, intent, bundle);
    }

    /* renamed from: l */
    public static void m21733l(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.m21749a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
