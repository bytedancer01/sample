package cg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/o.class
 */
/* renamed from: cg.o */
/* loaded from: combined.jar:classes2.jar:cg/o.class */
public final class C1102o {
    /* renamed from: a */
    public static <T> T m6665a(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: b */
    public static <T> T m6666b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static void m6667c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public static void m6668d(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
