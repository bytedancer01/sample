package p294r;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/e.class
 */
/* renamed from: r.e */
/* loaded from: combined.jar:classes1.jar:r/e.class */
public class C7932e {

    /* renamed from: a */
    public static final int[] f38160a = new int[0];

    /* renamed from: b */
    public static final long[] f38161b = new long[0];

    /* renamed from: c */
    public static final Object[] f38162c = new Object[0];

    /* renamed from: a */
    public static int m34389a(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return i13 ^ (-1);
    }

    /* renamed from: b */
    public static int m34390b(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return i12 ^ (-1);
    }

    /* renamed from: c */
    public static boolean m34391c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m34392d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    /* renamed from: e */
    public static int m34393e(int i10) {
        return m34392d(i10 * 4) / 4;
    }

    /* renamed from: f */
    public static int m34394f(int i10) {
        return m34392d(i10 * 8) / 8;
    }
}
