package p060da;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p097fa.C4794e;
import p350u9.C8824l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/p.class
 */
/* renamed from: da.p */
/* loaded from: combined.jar:classes2.jar:da/p.class */
public final class C4417p {
    /* renamed from: a */
    public static boolean m22464a(Context context, int i10) {
        if (!m22465b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C8824l.m37720a(context).m37723b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException e10) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m22465b(Context context, int i10, String str) {
        return C4794e.m24250a(context).m24249g(i10, str);
    }
}
