package p237o2;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C0756a;
import java.lang.reflect.Method;
import java.util.List;
import p071e2.AbstractC4582k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/h.class
 */
/* renamed from: o2.h */
/* loaded from: combined.jar:classes1.jar:o2/h.class */
public class C6875h {

    /* renamed from: a */
    public static final String f35634a = AbstractC4582k.m23128f("ProcessUtils");

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* renamed from: a */
    public static String m31714a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, C6875h.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            AbstractC4582k.m23126c().mo23129a(f35634a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty()) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m31715b(Context context, C0756a c0756a) {
        return TextUtils.equals(m31714a(context), !TextUtils.isEmpty(c0756a.m4851c()) ? c0756a.m4851c() : context.getApplicationInfo().processName);
    }
}
