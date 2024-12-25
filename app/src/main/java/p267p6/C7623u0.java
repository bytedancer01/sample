package p267p6;

import android.os.Build;
import java.util.HashSet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/u0.class
 */
/* renamed from: p6.u0 */
/* loaded from: combined.jar:classes2.jar:p6/u0.class */
public final class C7623u0 {

    /* renamed from: a */
    @Deprecated
    public static final String f37061a = "ExoPlayerLib/2.15.0 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.0";

    /* renamed from: b */
    public static final HashSet<String> f37062b = new HashSet<>();

    /* renamed from: c */
    public static String f37063c = "goog.exo.core";

    /* renamed from: a */
    public static void m33152a(String str) {
        synchronized (C7623u0.class) {
            try {
                if (f37062b.add(str)) {
                    f37063c += ", " + str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static String m33153b() {
        String str;
        synchronized (C7623u0.class) {
            try {
                str = f37063c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
