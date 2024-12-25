package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/c2.class
 */
/* renamed from: ma.c2 */
/* loaded from: combined.jar:classes2.jar:ma/c2.class */
public final class C6050c2 {
    /* renamed from: a */
    public static int m29478a(int i10, int i11, String str) {
        String m29561b;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            m29561b = C6092e2.m29561b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            m29561b = C6092e2.m29561b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(m29561b);
    }

    /* renamed from: b */
    public static int m29479b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m29482e(i10, i11, "index"));
        }
        return i10;
    }

    /* renamed from: c */
    public static Object m29480c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static void m29481d(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? m29482e(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m29482e(i11, i12, "end index") : C6092e2.m29561b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* renamed from: e */
    public static String m29482e(int i10, int i11, String str) {
        if (i10 < 0) {
            return C6092e2.m29561b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C6092e2.m29561b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
