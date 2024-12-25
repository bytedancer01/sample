package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/w2.class
 */
/* renamed from: ma.w2 */
/* loaded from: combined.jar:classes2.jar:ma/w2.class */
public final class C6468w2 {
    /* renamed from: a */
    public static Object m30084a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* renamed from: b */
    public static Object[] m30085b(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m30084a(objArr[i11], i11);
        }
        return objArr;
    }
}
