package p060da;

import android.content.Context;
import android.util.Log;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/g.class
 */
/* renamed from: da.g */
/* loaded from: combined.jar:classes2.jar:da/g.class */
public final class C4408g {

    /* renamed from: a */
    public static final String[] f26694a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m22438a(Context context, Throwable th2) {
        try {
            C9935o.m41850j(context);
            C9935o.m41850j(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
