package ec;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/k.class
 */
/* renamed from: ec.k */
/* loaded from: combined.jar:classes2.jar:ec/k.class */
public final class C4708k {
    /* renamed from: a */
    public static String m23659a(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return C4711n.m23688a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C4711n.m23688a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    /* renamed from: b */
    public static String m23660b(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return C4711n.m23688a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C4711n.m23688a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    /* renamed from: c */
    public static String m23661c(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? m23660b(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m23660b(i11, i12, "end index") : C4711n.m23688a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    /* renamed from: d */
    public static void m23662d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m23663e(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m23664f(boolean z10, @NullableDecl String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(C4711n.m23688a(str, Long.valueOf(j10)));
        }
    }

    /* renamed from: g */
    public static void m23665g(boolean z10, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(C4711n.m23688a(str, obj));
        }
    }

    /* renamed from: h */
    public static int m23666h(int i10, int i11) {
        return m23667i(i10, i11, "index");
    }

    /* renamed from: i */
    public static int m23667i(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(m23659a(i10, i11, str));
        }
        return i10;
    }

    @NonNullDecl
    /* renamed from: j */
    public static <T> T m23668j(@NonNullDecl T t10) {
        t10.getClass();
        return t10;
    }

    @NonNullDecl
    /* renamed from: k */
    public static <T> T m23669k(@NonNullDecl T t10, @NullableDecl Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m23670l(int i10, int i11) {
        return m23671m(i10, i11, "index");
    }

    /* renamed from: m */
    public static int m23671m(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m23660b(i10, i11, str));
        }
        return i10;
    }

    /* renamed from: n */
    public static void m23672n(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(m23661c(i10, i11, i12));
        }
    }

    /* renamed from: o */
    public static void m23673o(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m23674p(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: q */
    public static void m23675q(boolean z10, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(C4711n.m23688a(str, obj));
        }
    }
}
