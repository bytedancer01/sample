package me;

import ae.C0156a;
import p202le.C5844a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/i.class
 */
/* renamed from: me.i */
/* loaded from: combined.jar:classes2.jar:me/i.class */
public final class C6581i {

    /* renamed from: a */
    public static final float[][] f34431a = new float[C5844a.f32457b.length][8];

    static {
        int i10;
        int i11 = 0;
        while (true) {
            int[] iArr = C5844a.f32457b;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            int i13 = i12 & 1;
            int i14 = 0;
            while (i14 < 8) {
                float f10 = 0.0f;
                while (true) {
                    i10 = i12 & 1;
                    if (i10 == i13) {
                        f10 += 1.0f;
                        i12 >>= 1;
                    }
                }
                f34431a[i11][(8 - i14) - 1] = f10 / 17.0f;
                i14++;
                i13 = i10;
            }
            i11++;
        }
    }

    /* renamed from: a */
    public static int m30404a(int[] iArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            for (int i11 = 0; i11 < iArr[i10]; i11++) {
                int i12 = 1;
                if (i10 % 2 != 0) {
                    i12 = 0;
                }
                j10 = (j10 << 1) | i12;
            }
        }
        return (int) j10;
    }

    /* renamed from: b */
    public static int m30405b(int[] iArr) {
        float f10;
        int m678d = C0156a.m678d(iArr);
        float[] fArr = new float[8];
        if (m678d > 1) {
            for (int i10 = 0; i10 < 8; i10++) {
                fArr[i10] = iArr[i10] / m678d;
            }
        }
        float f11 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            float[][] fArr2 = f34431a;
            if (i12 >= fArr2.length) {
                return i11;
            }
            float f12 = 0.0f;
            float[] fArr3 = fArr2[i12];
            int i13 = 0;
            while (true) {
                f10 = f12;
                if (i13 >= 8) {
                    break;
                }
                float f13 = fArr3[i13] - fArr[i13];
                f12 += f13 * f13;
                f10 = f12;
                if (f12 >= f11) {
                    break;
                }
                i13++;
            }
            float f14 = f11;
            if (f10 < f11) {
                i11 = C5844a.f32457b[i12];
                f14 = f10;
            }
            i12++;
            f11 = f14;
        }
    }

    /* renamed from: c */
    public static int m30406c(int[] iArr) {
        int m30404a = m30404a(iArr);
        if (C5844a.m28429a(m30404a) == -1) {
            return -1;
        }
        return m30404a;
    }

    /* renamed from: d */
    public static int m30407d(int[] iArr) {
        int m30406c = m30406c(m30408e(iArr));
        return m30406c != -1 ? m30406c : m30405b(iArr);
    }

    /* renamed from: e */
    public static int[] m30408e(int[] iArr) {
        float m678d = C0156a.m678d(iArr);
        int[] iArr2 = new int[8];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i10 >= 17) {
                return iArr2;
            }
            float f10 = m678d / 34.0f;
            float f11 = (i10 * m678d) / 17.0f;
            int i14 = iArr[i13];
            int i15 = i11;
            int i16 = i13;
            if (i11 + i14 <= f10 + f11) {
                i15 = i11 + i14;
                i16 = i13 + 1;
            }
            iArr2[i16] = iArr2[i16] + 1;
            i10++;
            i11 = i15;
            i12 = i16;
        }
    }
}
