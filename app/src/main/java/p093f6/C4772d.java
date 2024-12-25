package p093f6;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f6/d.class
 */
/* renamed from: f6.d */
/* loaded from: combined.jar:classes1.jar:f6/d.class */
public final class C4772d {
    /* renamed from: a */
    public static <T> void m24163a(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m24164b(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: c */
    public static <T> T m24165c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
