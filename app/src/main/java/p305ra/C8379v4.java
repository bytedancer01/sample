package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/v4.class
 */
/* renamed from: ra.v4 */
/* loaded from: combined.jar:classes2.jar:ra/v4.class */
public final class C8379v4 {

    /* renamed from: a */
    public static final Class<?> f39339a;

    /* renamed from: b */
    public static final boolean f39340b;

    static {
        Class<?> cls;
        Class<?> cls2;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable th2) {
            cls = null;
        }
        f39339a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable th3) {
            cls2 = null;
        }
        f39340b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m35962a() {
        return (f39339a == null || f39340b) ? false : true;
    }

    /* renamed from: b */
    public static Class<?> m35963b() {
        return f39339a;
    }
}
