package p377w3;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w3/c.class
 */
/* renamed from: w3.c */
/* loaded from: combined.jar:classes1.jar:w3/c.class */
public class C9406c {

    /* renamed from: a */
    public int f43147a;

    /* renamed from: b */
    public byte[] f43148b;

    /* renamed from: c */
    public int f43149c;

    /* renamed from: d */
    public int f43150d;

    /* renamed from: f */
    public int[] f43152f = new int[256];

    /* renamed from: g */
    public int[] f43153g = new int[256];

    /* renamed from: h */
    public int[] f43154h = new int[256];

    /* renamed from: i */
    public int[] f43155i = new int[32];

    /* renamed from: e */
    public int[][] f43151e = new int[256];

    /* JADX WARN: Type inference failed for: r1v12, types: [int[], int[][]] */
    public C9406c(byte[] bArr, int i10, int i11) {
        this.f43148b = bArr;
        this.f43149c = i10;
        this.f43150d = i11;
        for (int i12 = 0; i12 < 256; i12++) {
            this.f43151e[i12] = new int[]{r0, r0, r0, 0};
            int i13 = (i12 << 12) / 256;
            this.f43154h[i12] = 256;
            this.f43153g[i12] = 0;
        }
    }

    /* renamed from: a */
    public void m39756a(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11 - i10;
        int i16 = i15;
        if (i15 < -1) {
            i16 = -1;
        }
        int i17 = i11 + i10;
        int i18 = i17;
        if (i17 > 256) {
            i18 = 256;
        }
        int i19 = i11 + 1;
        int i20 = i11 - 1;
        int i21 = 1;
        while (true) {
            int i22 = i21;
            if (i19 >= i18 && i20 <= i16) {
                return;
            }
            int i23 = i22 + 1;
            int i24 = this.f43155i[i22];
            int i25 = i19;
            if (i19 < i18) {
                int[] iArr = this.f43151e[i19];
                int i26 = iArr[0];
                try {
                    iArr[0] = i26 - (((i26 - i12) * i24) / 262144);
                    int i27 = iArr[1];
                    iArr[1] = i27 - (((i27 - i13) * i24) / 262144);
                    int i28 = iArr[2];
                    iArr[2] = i28 - (((i28 - i14) * i24) / 262144);
                } catch (Exception e10) {
                }
                i25 = i19 + 1;
            }
            if (i20 > i16) {
                int[] iArr2 = this.f43151e[i20];
                int i29 = iArr2[0];
                try {
                    iArr2[0] = i29 - (((i29 - i12) * i24) / 262144);
                    int i30 = iArr2[1];
                    iArr2[1] = i30 - (((i30 - i13) * i24) / 262144);
                    int i31 = iArr2[2];
                    iArr2[2] = i31 - ((i24 * (i31 - i14)) / 262144);
                } catch (Exception e11) {
                }
                i20--;
                i19 = i25;
                i21 = i23;
            } else {
                i19 = i25;
                i21 = i23;
            }
        }
    }

    /* renamed from: b */
    public void m39757b(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f43151e[i11];
        int i15 = iArr[0];
        iArr[0] = i15 - (((i15 - i12) * i10) / 1024);
        int i16 = iArr[1];
        iArr[1] = i16 - (((i16 - i13) * i10) / 1024);
        int i17 = iArr[2];
        iArr[2] = i17 - ((i10 * (i17 - i14)) / 1024);
    }

    /* renamed from: c */
    public byte[] m39758c() {
        byte[] bArr = new byte[768];
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[this.f43151e[i10][3]] = i10;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < 256) {
            int i13 = iArr[i11];
            int i14 = i12 + 1;
            int[] iArr2 = this.f43151e[i13];
            bArr[i12] = (byte) iArr2[0];
            int i15 = i14 + 1;
            bArr[i14] = (byte) iArr2[1];
            bArr[i15] = (byte) iArr2[2];
            i11++;
            i12 = i15 + 1;
        }
        return bArr;
    }

    /* renamed from: d */
    public int m39759d(int i10, int i11, int i12) {
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        while (i17 < 256) {
            int[] iArr = this.f43151e[i17];
            int i18 = iArr[0] - i10;
            int i19 = i18;
            if (i18 < 0) {
                i19 = -i18;
            }
            int i20 = iArr[1] - i11;
            int i21 = i20;
            if (i20 < 0) {
                i21 = -i20;
            }
            int i22 = iArr[2] - i12;
            int i23 = i22;
            if (i22 < 0) {
                i23 = -i22;
            }
            int i24 = i19 + i21 + i23;
            int i25 = i13;
            if (i24 < i13) {
                i15 = i17;
                i25 = i24;
            }
            int[] iArr2 = this.f43153g;
            int i26 = i24 - (iArr2[i17] >> 12);
            int i27 = i14;
            if (i26 < i14) {
                i16 = i17;
                i27 = i26;
            }
            int[] iArr3 = this.f43154h;
            int i28 = iArr3[i17];
            int i29 = i28 >> 10;
            iArr3[i17] = i28 - i29;
            iArr2[i17] = iArr2[i17] + (i29 << 10);
            i17++;
            i13 = i25;
            i14 = i27;
        }
        int[] iArr4 = this.f43154h;
        iArr4[i15] = iArr4[i15] + 64;
        int[] iArr5 = this.f43153g;
        iArr5[i15] = iArr5[i15] - 65536;
        return i16;
    }

    /* renamed from: e */
    public void m39760e() {
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = i13;
            if (i11 >= 256) {
                break;
            }
            int[] iArr = this.f43151e[i11];
            int i14 = iArr[1];
            int i15 = i11 + 1;
            int i16 = i11;
            int i17 = i15;
            while (i17 < 256) {
                int i18 = this.f43151e[i17][1];
                int i19 = i14;
                if (i18 < i14) {
                    i16 = i17;
                    i19 = i18;
                }
                i17++;
                i14 = i19;
            }
            int[] iArr2 = this.f43151e[i16];
            if (i11 != i16) {
                int i20 = iArr2[0];
                iArr2[0] = iArr[0];
                iArr[0] = i20;
                int i21 = iArr2[1];
                iArr2[1] = iArr[1];
                iArr[1] = i21;
                int i22 = iArr2[2];
                iArr2[2] = iArr[2];
                iArr[2] = i22;
                int i23 = iArr2[3];
                iArr2[3] = iArr[3];
                iArr[3] = i23;
            }
            int i24 = i12;
            int i25 = i10;
            if (i14 != i12) {
                this.f43152f[i12] = (i10 + i11) >> 1;
                while (true) {
                    i12++;
                    if (i12 >= i14) {
                        break;
                    } else {
                        this.f43152f[i12] = i11;
                    }
                }
                i25 = i11;
                i24 = i14;
            }
            i11 = i15;
            i12 = i24;
            i13 = i25;
        }
        this.f43152f[i12] = (i10 + 255) >> 1;
        for (int i26 = i12 + 1; i26 < 256; i26++) {
            this.f43152f[i26] = 255;
        }
    }

    /* renamed from: f */
    public void m39761f() {
        int i10 = this.f43149c;
        if (i10 < 1509) {
            this.f43150d = 1;
        }
        int i11 = this.f43150d;
        this.f43147a = ((i11 - 1) / 3) + 30;
        byte[] bArr = this.f43148b;
        int i12 = i10 / (i11 * 3);
        int i13 = i12 / 100;
        for (int i14 = 0; i14 < 32; i14++) {
            this.f43155i[i14] = 1024 * (((1024 - (i14 * i14)) * 256) / 1024);
        }
        int i15 = this.f43149c;
        int i16 = i15 < 1509 ? 3 : i15 % 499 != 0 ? 1497 : i15 % 491 != 0 ? 1473 : i15 % 487 != 0 ? 1461 : 1509;
        int i17 = 0;
        int i18 = 2048;
        int i19 = 32;
        int i20 = 1024;
        int i21 = 0;
        while (i17 < i12) {
            int i22 = (bArr[i21 + 0] & 255) << 4;
            int i23 = (bArr[i21 + 1] & 255) << 4;
            int i24 = (bArr[i21 + 2] & 255) << 4;
            int m39759d = m39759d(i22, i23, i24);
            m39757b(i20, m39759d, i22, i23, i24);
            if (i19 != 0) {
                m39756a(i19, m39759d, i22, i23, i24);
            }
            int i25 = i21 + i16;
            int i26 = i25;
            if (i25 >= i10) {
                i26 = i25 - this.f43149c;
            }
            int i27 = i26;
            int i28 = i17 + 1;
            int i29 = i13;
            if (i13 == 0) {
                i29 = 1;
            }
            i17 = i28;
            i13 = i29;
            i21 = i27;
            if (i28 % i29 == 0) {
                int i30 = i20 - (i20 / this.f43147a);
                int i31 = i18 - (i18 / 30);
                int i32 = i31 >> 6;
                if (i32 <= 1) {
                    i32 = 0;
                }
                int i33 = 0;
                while (true) {
                    i17 = i28;
                    i13 = i29;
                    i18 = i31;
                    i19 = i32;
                    i20 = i30;
                    i21 = i27;
                    if (i33 < i32) {
                        int i34 = i32 * i32;
                        this.f43155i[i33] = (((i34 - (i33 * i33)) * 256) / i34) * i30;
                        i33++;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public int m39762g(int i10, int i11, int i12) {
        int i13 = this.f43152f[i11];
        int i14 = i13 - 1;
        int i15 = 1000;
        int i16 = -1;
        while (true) {
            if (i13 >= 256 && i14 < 0) {
                return i16;
            }
            int i17 = i13;
            int i18 = i15;
            int i19 = i16;
            if (i13 < 256) {
                int[] iArr = this.f43151e[i13];
                int i20 = iArr[1] - i11;
                if (i20 >= i15) {
                    i17 = 256;
                    i18 = i15;
                    i19 = i16;
                } else {
                    int i21 = i13 + 1;
                    int i22 = i20;
                    if (i20 < 0) {
                        i22 = -i20;
                    }
                    int i23 = iArr[0] - i10;
                    int i24 = i23;
                    if (i23 < 0) {
                        i24 = -i23;
                    }
                    int i25 = i22 + i24;
                    i17 = i21;
                    i18 = i15;
                    i19 = i16;
                    if (i25 < i15) {
                        int i26 = iArr[2] - i12;
                        int i27 = i26;
                        if (i26 < 0) {
                            i27 = -i26;
                        }
                        int i28 = i25 + i27;
                        i17 = i21;
                        i18 = i15;
                        i19 = i16;
                        if (i28 < i15) {
                            i19 = iArr[3];
                            i18 = i28;
                            i17 = i21;
                        }
                    }
                }
            }
            i13 = i17;
            i15 = i18;
            i16 = i19;
            if (i14 >= 0) {
                int[] iArr2 = this.f43151e[i14];
                int i29 = i11 - iArr2[1];
                if (i29 >= i18) {
                    i14 = -1;
                    i13 = i17;
                    i15 = i18;
                    i16 = i19;
                } else {
                    int i30 = i14 - 1;
                    int i31 = i29;
                    if (i29 < 0) {
                        i31 = -i29;
                    }
                    int i32 = iArr2[0] - i10;
                    int i33 = i32;
                    if (i32 < 0) {
                        i33 = -i32;
                    }
                    int i34 = i31 + i33;
                    i13 = i17;
                    i14 = i30;
                    i15 = i18;
                    i16 = i19;
                    if (i34 < i18) {
                        int i35 = iArr2[2] - i12;
                        int i36 = i35;
                        if (i35 < 0) {
                            i36 = -i35;
                        }
                        int i37 = i36 + i34;
                        i13 = i17;
                        i14 = i30;
                        i15 = i18;
                        i16 = i19;
                        if (i37 < i18) {
                            i16 = iArr2[3];
                            i15 = i37;
                            i13 = i17;
                            i14 = i30;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public byte[] m39763h() {
        m39761f();
        m39764i();
        m39760e();
        return m39758c();
    }

    /* renamed from: i */
    public void m39764i() {
        for (int i10 = 0; i10 < 256; i10++) {
            int[] iArr = this.f43151e[i10];
            iArr[0] = iArr[0] >> 4;
            iArr[1] = iArr[1] >> 4;
            iArr[2] = iArr[2] >> 4;
            iArr[3] = i10;
        }
    }
}
