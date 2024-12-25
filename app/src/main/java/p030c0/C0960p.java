package p030c0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/p.class
 */
/* renamed from: c0.p */
/* loaded from: combined.jar:classes1.jar:c0/p.class */
public final class C0960p {
    /* renamed from: a */
    public static Intent m5728a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String m5730c = m5730c(activity);
        if (m5730c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m5730c);
        try {
            return m5731d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m5730c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m5729b(Context context, ComponentName componentName) {
        String m5731d = m5731d(context, componentName);
        if (m5731d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m5731d);
        return m5731d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m5730c(Activity activity) {
        try {
            return m5731d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: d */
    public static String m5731d(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 640;
        if (i10 >= 29) {
            i11 = 269222528;
        } else if (i10 >= 24) {
            i11 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i11);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        String str2 = string;
        if (string.charAt(0) == '.') {
            str2 = context.getPackageName() + string;
        }
        return str2;
    }

    /* renamed from: e */
    public static void m5732e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* renamed from: f */
    public static boolean m5733f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
