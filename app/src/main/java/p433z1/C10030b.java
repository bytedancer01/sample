package p433z1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z1/b.class
 */
/* renamed from: z1.b */
/* loaded from: combined.jar:classes1.jar:z1/b.class */
public final class C10030b {

    /* renamed from: a */
    public static long f46001a;

    /* renamed from: b */
    public static Method f46002b;

    /* renamed from: a */
    public static void m42182a(String str) {
        C10031c.m42187a(str);
    }

    /* renamed from: b */
    public static void m42183b() {
        C10031c.m42188b();
    }

    /* renamed from: c */
    public static void m42184c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m42185d() {
        boolean isEnabled;
        try {
            if (f46002b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError e10) {
        }
        return m42186e();
    }

    /* renamed from: e */
    public static boolean m42186e() {
        try {
            if (f46002b == null) {
                f46001a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f46002b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f46002b.invoke(null, Long.valueOf(f46001a))).booleanValue();
        } catch (Exception e10) {
            m42184c("isTagEnabled", e10);
            return false;
        }
    }
}
