package p069e0;

import java.lang.reflect.Array;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e0/e.class
 */
/* renamed from: e0.e */
/* loaded from: combined.jar:classes1.jar:e0/e.class */
public final class C4566e {
    /* renamed from: a */
    public static int[] m23046a(int[] iArr, int i10, int i11) {
        int[] iArr2 = iArr;
        if (i10 + 1 > iArr.length) {
            iArr2 = new int[m23048c(i10)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
        }
        iArr2[i10] = i11;
        return iArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object[]] */
    /* renamed from: b */
    public static <T> T[] m23047b(T[] tArr, int i10, T t10) {
        T[] tArr2 = tArr;
        if (i10 + 1 > tArr.length) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m23048c(i10));
            System.arraycopy(tArr, 0, tArr2, 0, i10);
        }
        tArr2[i10] = t10;
        return tArr2;
    }

    /* renamed from: c */
    public static int m23048c(int i10) {
        return i10 <= 4 ? 8 : i10 * 2;
    }
}
