package p124h6;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h6/a.class
 */
/* renamed from: h6.a */
/* loaded from: combined.jar:classes1.jar:h6/a.class */
public final class C5036a {
    /* renamed from: a */
    public static void m25235a(String str, String str2, Object obj) {
        Log.d(m25238d(str), String.format(str2, obj));
    }

    /* renamed from: b */
    public static void m25236b(String str, String str2, Object... objArr) {
        Log.d(m25238d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m25237c(String str, String str2, Throwable th2) {
        Log.e(m25238d(str), str2, th2);
    }

    /* renamed from: d */
    public static String m25238d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m25239e(String str, String str2) {
        Log.i(m25238d(str), str2);
    }

    /* renamed from: f */
    public static void m25240f(String str, String str2, Object obj) {
        Log.w(m25238d(str), String.format(str2, obj));
    }
}
