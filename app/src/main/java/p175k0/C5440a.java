package p175k0;

import android.os.Build;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/a.class
 */
/* renamed from: k0.a */
/* loaded from: combined.jar:classes1.jar:k0/a.class */
public class C5440a {
    /* renamed from: a */
    public static boolean m27187a(String str, String str2) {
        boolean z10 = false;
        if ("REL".equals(str2)) {
            return false;
        }
        if (str2.compareTo(str) >= 0) {
            z10 = true;
        }
        return z10;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m27188b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m27189c() {
        return Build.VERSION.SDK_INT >= 31 || m27187a("S", Build.VERSION.CODENAME);
    }
}
