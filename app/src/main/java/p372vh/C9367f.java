package p372vh;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.Arrays;
import p172jh.C5385d;
import p172jh.C5397p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vh/f.class
 */
/* renamed from: vh.f */
/* loaded from: combined.jar:classes2.jar:vh/f.class */
public class C9367f {
    /* renamed from: a */
    public static boolean m39522a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m39523b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m39530i(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: c */
    public static void m39524c(Object obj) {
        if (obj == null) {
            m39533l();
        }
    }

    /* renamed from: d */
    public static void m39525d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m39530i(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: e */
    public static void m39526e(Object obj, String str) {
        if (obj == null) {
            m39536o(str);
        }
    }

    /* renamed from: f */
    public static void m39527f(Object obj, String str) {
        if (obj == null) {
            m39535n(str);
        }
    }

    /* renamed from: g */
    public static int m39528g(int i10, int i11) {
        return i10 < i11 ? -1 : i10 == i11 ? 0 : 1;
    }

    /* renamed from: h */
    public static String m39529h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + InstructionFileId.DOT + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: i */
    public static <T extends Throwable> T m39530i(T t10) {
        return (T) m39531j(t10, C9367f.class.getName());
    }

    /* renamed from: j */
    public static <T extends Throwable> T m39531j(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    /* renamed from: k */
    public static String m39532k(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: l */
    public static void m39533l() {
        throw ((NullPointerException) m39530i(new NullPointerException()));
    }

    /* renamed from: m */
    public static void m39534m() {
        throw ((C5385d) m39530i(new C5385d()));
    }

    /* renamed from: n */
    public static void m39535n(String str) {
        throw ((IllegalArgumentException) m39530i(new IllegalArgumentException(m39529h(str))));
    }

    /* renamed from: o */
    public static void m39536o(String str) {
        throw ((NullPointerException) m39530i(new NullPointerException(m39529h(str))));
    }

    /* renamed from: p */
    public static void m39537p(String str) {
        throw ((C5397p) m39530i(new C5397p(str)));
    }

    /* renamed from: q */
    public static void m39538q(String str) {
        m39537p("lateinit property " + str + " has not been initialized");
    }
}
