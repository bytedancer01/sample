package p059d9;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/a.class
 */
/* renamed from: d9.a */
/* loaded from: combined.jar:classes2.jar:d9/a.class */
public final class C4349a {
    @Pure
    /* renamed from: a */
    public static void m21878a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: b */
    public static void m21879b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    /* renamed from: c */
    public static int m21880c(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: d */
    public static String m21881d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: e */
    public static <T> T m21882e(T t10) {
        t10.getClass();
        return t10;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: f */
    public static <T> T m21883f(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    /* renamed from: g */
    public static void m21884g(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* renamed from: h */
    public static void m21885h(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: i */
    public static <T> T m21886i(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: j */
    public static <T> T m21887j(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
