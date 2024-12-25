package p059d9;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/v.class
 */
/* renamed from: d9.v */
/* loaded from: combined.jar:classes2.jar:d9/v.class */
public final class C4392v {

    /* renamed from: a */
    public static int f26667a = 0;

    /* renamed from: b */
    public static boolean f26668b = true;

    @Pure
    /* renamed from: a */
    public static String m22267a(String str, Throwable th2) {
        String m22272f = m22272f(th2);
        String str2 = str;
        if (!TextUtils.isEmpty(m22272f)) {
            str2 = str + "\n  " + m22272f.replace("\n", "\n  ") + '\n';
        }
        return str2;
    }

    @Pure
    /* renamed from: b */
    public static void m22268b(String str, String str2) {
        if (f26667a == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    /* renamed from: c */
    public static void m22269c(String str, String str2, Throwable th2) {
        m22268b(str, m22267a(str2, th2));
    }

    @Pure
    /* renamed from: d */
    public static void m22270d(String str, String str2) {
        if (f26667a <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    /* renamed from: e */
    public static void m22271e(String str, String str2, Throwable th2) {
        m22270d(str, m22267a(str2, th2));
    }

    @Pure
    /* renamed from: f */
    public static String m22272f(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return m22274h(th2) ? "UnknownHostException (no network)" : !f26668b ? th2.getMessage() : Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    @Pure
    /* renamed from: g */
    public static void m22273g(String str, String str2) {
        if (f26667a <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    /* renamed from: h */
    public static boolean m22274h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    @Pure
    /* renamed from: i */
    public static void m22275i(String str, String str2) {
        if (f26667a <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    /* renamed from: j */
    public static void m22276j(String str, String str2, Throwable th2) {
        m22275i(str, m22267a(str2, th2));
    }
}
