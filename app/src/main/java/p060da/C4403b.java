package p060da;

import java.lang.reflect.Array;
import java.util.Arrays;
import p422y9.C9932n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/b.class
 */
/* renamed from: da.b */
/* loaded from: combined.jar:classes2.jar:da/b.class */
public final class C4403b {
    /* renamed from: a */
    public static <T> T[] m22427a(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int i10 = 0;
        for (T[] tArr2 : tArr) {
            i10 += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i10);
        int length = tArr[0].length;
        for (int i11 = 1; i11 < tArr.length; i11++) {
            T[] tArr4 = tArr[i11];
            int length2 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length, length2);
            length += length2;
        }
        return tArr3;
    }

    /* renamed from: b */
    public static boolean m22428b(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static <T> boolean m22429c(T[] tArr, T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (i10 < length) {
            if (C9932n.m41832b(tArr[i10], t10)) {
                return i10 >= 0;
            }
            i10++;
        }
        return false;
    }
}
