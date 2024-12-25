package p175k0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/k.class
 */
@Deprecated
/* renamed from: k0.k */
/* loaded from: combined.jar:classes1.jar:k0/k.class */
public final class C5450k {

    /* renamed from: a */
    public static long f31198a;

    /* renamed from: b */
    public static Method f31199b;

    /* renamed from: c */
    public static Method f31200c;

    /* renamed from: d */
    public static Method f31201d;

    /* renamed from: e */
    public static Method f31202e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f31198a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f31199b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f31200c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f31201d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f31202e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    /* renamed from: a */
    public static void m27205a(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: b */
    public static void m27206b() {
        Trace.endSection();
    }
}
