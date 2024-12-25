package p030c0;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/j.class
 */
/* renamed from: c0.j */
/* loaded from: combined.jar:classes1.jar:c0/j.class */
public final class C0948j {
    /* renamed from: a */
    public static int m5668a(Context context, String str, String str2) {
        Object systemService;
        int noteProxyOpNoThrow;
        if (Build.VERSION.SDK_INT < 23) {
            return 1;
        }
        systemService = context.getSystemService((Class<Object>) AppOpsManager.class);
        noteProxyOpNoThrow = ((AppOpsManager) systemService).noteProxyOpNoThrow(str, str2);
        return noteProxyOpNoThrow;
    }

    /* renamed from: b */
    public static String m5669b(String str) {
        String permissionToOp;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        permissionToOp = AppOpsManager.permissionToOp(str);
        return permissionToOp;
    }
}
