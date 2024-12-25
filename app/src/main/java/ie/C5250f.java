package ie;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ie/f.class
 */
/* renamed from: ie.f */
/* loaded from: combined.jar:classes2.jar:ie/f.class */
public final class C5250f {
    /* renamed from: a */
    public static int m26188a(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = i10 - i11;
        int i16 = i15;
        int i17 = i11;
        if (i15 > i11) {
            i17 = i15;
            i16 = i11;
        }
        int i18 = 1;
        int i19 = 1;
        int i20 = i10;
        while (true) {
            i12 = i19;
            i13 = i18;
            if (i20 <= i17) {
                break;
            }
            int i21 = i18 * i20;
            i18 = i21;
            i19 = i12;
            if (i12 <= i16) {
                i18 = i21 / i12;
                i19 = i12 + 1;
            }
            i20--;
        }
        for (i14 = i12; i14 <= i16; i14++) {
            i13 /= i14;
        }
        return i13;
    }

    /* renamed from: b */
    public static int m26189b(int[] iArr, int i10, boolean z10) {
        int i11;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int length = iArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = i12;
        while (true) {
            int i18 = length - 1;
            if (i14 >= i18) {
                return i15;
            }
            int i19 = 1 << i14;
            int i20 = i16 | i19;
            int i21 = 1;
            while (i21 < iArr[i14]) {
                int i22 = i17 - i21;
                int i23 = length - i14;
                int i24 = i23 - 2;
                int m26188a = m26188a(i22 - 1, i24);
                int i25 = m26188a;
                if (z10) {
                    i25 = m26188a;
                    if (i20 == 0) {
                        int i26 = i23 - 1;
                        i25 = m26188a;
                        if (i22 - i26 >= i26) {
                            i25 = m26188a - m26188a(i22 - i23, i24);
                        }
                    }
                }
                if (i23 - 1 > 1) {
                    int i27 = 0;
                    for (int i28 = i22 - i24; i28 > i10; i28--) {
                        i27 += m26188a((i22 - i28) - 1, i23 - 3);
                    }
                    i11 = i25 - (i27 * (i18 - i14));
                } else {
                    i11 = i25;
                    if (i22 > i10) {
                        i11 = i25 - 1;
                    }
                }
                i15 += i11;
                i21++;
                i20 &= i19 ^ (-1);
            }
            i17 -= i21;
            i14++;
            i16 = i20;
        }
    }
}
