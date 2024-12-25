package p175k0;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/m.class
 */
/* renamed from: k0.m */
/* loaded from: combined.jar:classes1.jar:k0/m.class */
public class C5452m {
    /* renamed from: a */
    public static boolean m27208a(Context context) {
        Object systemService;
        boolean isUserUnlocked;
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        systemService = context.getSystemService((Class<Object>) UserManager.class);
        isUserUnlocked = ((UserManager) systemService).isUserUnlocked();
        return isUserUnlocked;
    }
}
