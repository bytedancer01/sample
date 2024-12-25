package p228n7;

import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/j0.class
 */
/* renamed from: n7.j0 */
/* loaded from: combined.jar:classes2.jar:n7/j0.class */
public final class C6679j0 {
    /* renamed from: a */
    public static int m30763a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    /* renamed from: b */
    public static boolean m30764b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                int i16 = i13 + 1;
                i13 = i16;
                if (i16 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static long m30765c(C4361f0 c4361f0, int i10, int i11) {
        c4361f0.m21983P(i10);
        if (c4361f0.m21985a() < 5) {
            return -9223372036854775807L;
        }
        int m21998n = c4361f0.m21998n();
        if ((8388608 & m21998n) != 0 || ((2096896 & m21998n) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (!((m21998n & 32) != 0) || c4361f0.m21971D() < 7 || c4361f0.m21985a() < 7) {
            return -9223372036854775807L;
        }
        if (!((c4361f0.m21971D() & 16) == 16)) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c4361f0.m21994j(bArr, 0, 6);
        return m30766d(bArr);
    }

    /* renamed from: d */
    public static long m30766d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
