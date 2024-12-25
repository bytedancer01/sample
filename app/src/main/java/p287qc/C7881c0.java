package p287qc;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/c0.class
 */
/* renamed from: qc.c0 */
/* loaded from: combined.jar:classes2.jar:qc/c0.class */
public final class C7881c0 {
    /* renamed from: a */
    public static void m34162a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m34163b(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: c */
    public static <T> T m34164c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m34165d(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
