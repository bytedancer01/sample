package p444zd;

import td.AbstractC8687b;
import td.AbstractC8693h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/j.class
 */
/* renamed from: zd.j */
/* loaded from: combined.jar:classes2.jar:zd/j.class */
public final class C10202j extends C10200h {

    /* renamed from: e */
    public C10194b f46691e;

    public C10202j(AbstractC8693h abstractC8693h) {
        super(abstractC8693h);
    }

    /* renamed from: i */
    public static int[][] m42709i(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i13 - 8;
        int i16 = i12 - 8;
        int[][] iArr = new int[i11][i10];
        for (int i17 = 0; i17 < i11; i17++) {
            int i18 = i17 << 3;
            int i19 = i18;
            if (i18 > i15) {
                i19 = i15;
            }
            for (int i20 = 0; i20 < i10; i20++) {
                int i21 = i20 << 3;
                int i22 = i21;
                if (i21 > i16) {
                    i22 = i16;
                }
                int i23 = (i19 * i12) + i22;
                int i24 = 255;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (true) {
                    i14 = i27;
                    if (i25 >= 8) {
                        break;
                    }
                    int i28 = i14;
                    int i29 = i26;
                    int i30 = 0;
                    while (i30 < 8) {
                        int i31 = bArr[i23 + i30] & 255;
                        int i32 = i29 + i31;
                        int i33 = i24;
                        if (i31 < i24) {
                            i33 = i31;
                        }
                        int i34 = i28;
                        if (i31 > i28) {
                            i34 = i31;
                        }
                        i30++;
                        i28 = i34;
                        i24 = i33;
                        i29 = i32;
                    }
                    int i35 = i23;
                    int i36 = i25;
                    i26 = i29;
                    if (i28 - i24 > 24) {
                        int i37 = i25;
                        int i38 = i23;
                        while (true) {
                            int i39 = i37 + 1;
                            int i40 = i38 + i12;
                            i35 = i40;
                            i36 = i39;
                            i26 = i29;
                            if (i39 < 8) {
                                int i41 = 0;
                                int i42 = i29;
                                while (true) {
                                    i38 = i40;
                                    i37 = i39;
                                    i29 = i42;
                                    if (i41 < 8) {
                                        i42 += bArr[i40 + i41] & 255;
                                        i41++;
                                    }
                                }
                            }
                        }
                    }
                    i25 = i36 + 1;
                    i23 = i35 + i12;
                    i27 = i28;
                }
                int i43 = i26 >> 6;
                if (i14 - i24 <= 24) {
                    int i44 = i24 / 2;
                    i43 = i44;
                    if (i17 > 0) {
                        i43 = i44;
                        if (i20 > 0) {
                            int[] iArr2 = iArr[i17 - 1];
                            int i45 = iArr2[i20];
                            int[] iArr3 = iArr[i17];
                            int i46 = i20 - 1;
                            int i47 = ((i45 + (iArr3[i46] * 2)) + iArr2[i46]) / 4;
                            i43 = i44;
                            if (i24 < i47) {
                                i43 = i47;
                            }
                        }
                    }
                }
                iArr[i17][i20] = i43;
            }
        }
        return iArr;
    }

    /* renamed from: j */
    public static void m42710j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, C10194b c10194b) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            if (i17 > i14) {
                i17 = i14;
            }
            int m42711k = m42711k(i16, i11 - 3);
            for (int i18 = 0; i18 < i10; i18++) {
                int i19 = i18 << 3;
                if (i19 > i15) {
                    i19 = i15;
                }
                int m42711k2 = m42711k(i18, i10 - 3);
                int i20 = 0;
                for (int i21 = -2; i21 <= 2; i21++) {
                    int[] iArr2 = iArr[m42711k + i21];
                    i20 += iArr2[m42711k2 - 2] + iArr2[m42711k2 - 1] + iArr2[m42711k2] + iArr2[m42711k2 + 1] + iArr2[2 + m42711k2];
                }
                m42712l(bArr, i19, i17, i20 / 25, i12, c10194b);
            }
        }
    }

    /* renamed from: k */
    public static int m42711k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    /* renamed from: l */
    public static void m42712l(byte[] bArr, int i10, int i11, int i12, int i13, C10194b c10194b) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    c10194b.m42680m(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // td.AbstractC8687b
    /* renamed from: a */
    public AbstractC8687b mo37184a(AbstractC8693h abstractC8693h) {
        return new C10202j(abstractC8693h);
    }

    @Override // p444zd.C10200h, td.AbstractC8687b
    /* renamed from: b */
    public C10194b mo37185b() {
        C10194b mo37185b;
        C10194b c10194b = this.f46691e;
        if (c10194b != null) {
            return c10194b;
        }
        AbstractC8693h m37188e = m37188e();
        int m37205d = m37188e.m37205d();
        int m37204a = m37188e.m37204a();
        if (m37205d < 40 || m37204a < 40) {
            mo37185b = super.mo37185b();
        } else {
            byte[] mo37199b = m37188e.mo37199b();
            int i10 = m37205d >> 3;
            int i11 = i10;
            if ((m37205d & 7) != 0) {
                i11 = i10 + 1;
            }
            int i12 = m37204a >> 3;
            int i13 = i12;
            if ((m37204a & 7) != 0) {
                i13 = i12 + 1;
            }
            int[][] m42709i = m42709i(mo37199b, i11, i13, m37205d, m37204a);
            mo37185b = new C10194b(m37205d, m37204a);
            m42710j(mo37199b, i11, i13, m37205d, m37204a, m42709i, mo37185b);
        }
        this.f46691e = mo37185b;
        return this.f46691e;
    }
}
