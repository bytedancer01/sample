package p221n0;

import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n0/h.class
 */
/* renamed from: n0.h */
/* loaded from: combined.jar:classes1.jar:n0/h.class */
public final class C6616h {
    /* renamed from: a */
    public static void m30523a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m30524b(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* renamed from: c */
    public static int m30525c(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static int m30526d(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    /* renamed from: e */
    public static <T> T m30527e(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: f */
    public static <T> T m30528f(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
