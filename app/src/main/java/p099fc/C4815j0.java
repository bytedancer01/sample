package p099fc;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/j0.class
 */
/* renamed from: fc.j0 */
/* loaded from: combined.jar:classes2.jar:fc/j0.class */
public final class C4815j0 {
    /* renamed from: a */
    public static Object m24401a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* renamed from: b */
    public static Object[] m24402b(Object... objArr) {
        return m24403c(objArr, objArr.length);
    }

    /* renamed from: c */
    public static Object[] m24403c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m24401a(objArr[i11], i11);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m24404d(T[] tArr, int i10) {
        return (T[]) C4819l0.m24448b(tArr, i10);
    }
}
