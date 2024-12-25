package p059d9;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/a0.class
 */
/* renamed from: d9.a0 */
/* loaded from: combined.jar:classes2.jar:d9/a0.class */
public final class C4350a0 {

    /* renamed from: a */
    public static final byte[] f26520a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f26521b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f26522c = new Object();

    /* renamed from: d */
    public static int[] f26523d = new int[10];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/a0$a.class
     */
    /* renamed from: d9.a0$a */
    /* loaded from: combined.jar:classes2.jar:d9/a0$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f26524a;

        /* renamed from: b */
        public final int f26525b;

        /* renamed from: c */
        public final boolean f26526c;

        public a(int i10, int i11, boolean z10) {
            this.f26524a = i10;
            this.f26525b = i11;
            this.f26526c = z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/a0$b.class
     */
    /* renamed from: d9.a0$b */
    /* loaded from: combined.jar:classes2.jar:d9/a0$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f26527a;

        /* renamed from: b */
        public final int f26528b;

        /* renamed from: c */
        public final int f26529c;

        /* renamed from: d */
        public final int f26530d;

        /* renamed from: e */
        public final int f26531e;

        /* renamed from: f */
        public final int f26532f;

        /* renamed from: g */
        public final float f26533g;

        /* renamed from: h */
        public final boolean f26534h;

        /* renamed from: i */
        public final boolean f26535i;

        /* renamed from: j */
        public final int f26536j;

        /* renamed from: k */
        public final int f26537k;

        /* renamed from: l */
        public final int f26538l;

        /* renamed from: m */
        public final boolean f26539m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f26527a = i10;
            this.f26528b = i11;
            this.f26529c = i12;
            this.f26530d = i13;
            this.f26531e = i14;
            this.f26532f = i15;
            this.f26533g = f10;
            this.f26534h = z10;
            this.f26535i = z11;
            this.f26536j = i16;
            this.f26537k = i17;
            this.f26538l = i18;
            this.f26539m = z12;
        }
    }

    /* renamed from: a */
    public static void m21888a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m21889b(ByteBuffer byteBuffer) {
        int i10;
        int position = byteBuffer.position();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 1;
            if (i13 >= position) {
                byteBuffer.clear();
                return;
            }
            int i14 = byteBuffer.get(i11) & 255;
            if (i12 == 3) {
                i10 = i12;
                if (i14 == 1) {
                    i10 = i12;
                    if ((byteBuffer.get(i13) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i11 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                }
            } else {
                i10 = i12;
                if (i14 == 0) {
                    i10 = i12 + 1;
                }
            }
            i12 = i10;
            if (i14 != 0) {
                i12 = 0;
            }
            i11 = i13;
        }
    }

    /* renamed from: c */
    public static int m21890c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        C4349a.m21884g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m21888a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m21888a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m21888a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    m21888a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1)) : bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 - 2] == 0 && bArr[i13] == 0;
        boolean z10 = false;
        if (bArr[i13] == 0) {
            z10 = true;
        }
        zArr[2] = z10;
        return i11;
    }

    /* renamed from: d */
    public static int m21891d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: e */
    public static int m21892e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m21893f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((r4 & 31) != 6) goto L6;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m21894g(java.lang.String r3, byte r4) {
        /*
            java.lang.String r0 = "video/avc"
            r1 = r3
            boolean r0 = r0.equals(r1)
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L18
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 31
            r0 = r0 & r1
            r1 = 6
            if (r0 == r1) goto L33
        L18:
            java.lang.String r0 = "video/hevc"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            r0 = r4
            r1 = 126(0x7e, float:1.77E-43)
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >> r1
            r1 = 39
            if (r0 != r1) goto L31
            r0 = r6
            r5 = r0
            goto L33
        L31:
            r0 = 0
            r5 = r0
        L33:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p059d9.C4350a0.m21894g(java.lang.String, byte):boolean");
    }

    /* renamed from: h */
    public static a m21895h(byte[] bArr, int i10, int i11) {
        C4363g0 c4363g0 = new C4363g0(bArr, i10, i11);
        c4363g0.m22022l(8);
        int m22018h = c4363g0.m22018h();
        int m22018h2 = c4363g0.m22018h();
        c4363g0.m22021k();
        return new a(m22018h, m22018h2, c4363g0.m22014d());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0257  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p059d9.C4350a0.b m21896i(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p059d9.C4350a0.m21896i(byte[], int, int):d9.a0$b");
    }

    /* renamed from: j */
    public static void m21897j(C4363g0 c4363g0, int i10) {
        int i11 = 8;
        int i12 = 8;
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i11;
            if (i11 != 0) {
                i14 = ((c4363g0.m22017g() + i12) + 256) % 256;
            }
            if (i14 != 0) {
                i12 = i14;
            }
            i13++;
            i11 = i14;
        }
    }

    /* renamed from: k */
    public static int m21898k(byte[] bArr, int i10) {
        int i11;
        synchronized (f26522c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                int m21891d = m21891d(bArr, i12, i10);
                i12 = m21891d;
                if (m21891d < i10) {
                    int[] iArr = f26523d;
                    if (iArr.length <= i13) {
                        f26523d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f26523d[i13] = m21891d;
                    i12 = m21891d + 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f26523d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
