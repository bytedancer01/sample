package p059d9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/g0.class
 */
/* renamed from: d9.g0 */
/* loaded from: combined.jar:classes2.jar:d9/g0.class */
public final class C4363g0 {

    /* renamed from: a */
    public byte[] f26570a;

    /* renamed from: b */
    public int f26571b;

    /* renamed from: c */
    public int f26572c;

    /* renamed from: d */
    public int f26573d;

    public C4363g0(byte[] bArr, int i10, int i11) {
        m22019i(bArr, i10, i11);
    }

    /* renamed from: a */
    public final void m22011a() {
        int i10;
        int i11 = this.f26572c;
        C4349a.m21884g(i11 >= 0 && (i11 < (i10 = this.f26571b) || (i11 == i10 && this.f26573d == 0)));
    }

    /* renamed from: b */
    public boolean m22012b(int i10) {
        int i11 = this.f26572c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f26573d + i10) - (i12 * 8);
        int i15 = i13;
        int i16 = i14;
        if (i14 > 7) {
            i15 = i13 + 1;
            i16 = i14 - 8;
        }
        int i17 = i15;
        int i18 = i11;
        while (true) {
            int i19 = i18 + 1;
            if (i19 > i17 || i17 >= this.f26571b) {
                break;
            }
            i18 = i19;
            if (m22020j(i19)) {
                i17++;
                i18 = i19 + 2;
            }
        }
        int i20 = this.f26571b;
        boolean z10 = true;
        if (i17 >= i20) {
            z10 = i17 == i20 && i16 == 0;
        }
        return z10;
    }

    /* renamed from: c */
    public boolean m22013c() {
        int i10 = this.f26572c;
        int i11 = this.f26573d;
        int i12 = 0;
        while (this.f26572c < this.f26571b && !m22014d()) {
            i12++;
        }
        boolean z10 = this.f26572c == this.f26571b;
        this.f26572c = i10;
        this.f26573d = i11;
        boolean z11 = false;
        if (!z10) {
            z11 = false;
            if (m22012b((i12 * 2) + 1)) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: d */
    public boolean m22014d() {
        boolean z10 = (this.f26570a[this.f26572c] & (128 >> this.f26573d)) != 0;
        m22021k();
        return z10;
    }

    /* renamed from: e */
    public int m22015e(int i10) {
        int i11;
        int i12;
        this.f26573d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f26573d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f26573d = i14;
            byte[] bArr = this.f26570a;
            int i15 = this.f26572c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!m22020j(i15 + 1)) {
                i12 = 1;
            }
            this.f26572c = i15 + i12;
        }
        byte[] bArr2 = this.f26570a;
        int i16 = this.f26572c;
        byte b10 = bArr2[i16];
        if (i11 == 8) {
            this.f26573d = 0;
            if (!m22020j(i16 + 1)) {
                i12 = 1;
            }
            this.f26572c = i16 + i12;
        }
        m22011a();
        return ((-1) >>> (32 - i10)) & (i13 | ((b10 & 255) >> (8 - i11)));
    }

    /* renamed from: f */
    public final int m22016f() {
        int i10 = 0;
        int i11 = 0;
        while (!m22014d()) {
            i11++;
        }
        if (i11 > 0) {
            i10 = m22015e(i11);
        }
        return ((1 << i11) - 1) + i10;
    }

    /* renamed from: g */
    public int m22017g() {
        int m22016f = m22016f();
        return (m22016f % 2 == 0 ? -1 : 1) * ((m22016f + 1) / 2);
    }

    /* renamed from: h */
    public int m22018h() {
        return m22016f();
    }

    /* renamed from: i */
    public void m22019i(byte[] bArr, int i10, int i11) {
        this.f26570a = bArr;
        this.f26572c = i10;
        this.f26571b = i11;
        this.f26573d = 0;
        m22011a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0[r5 - 1] == 0) goto L14;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m22020j(int r5) {
        /*
            r4 = this;
            r0 = 1
            r6 = r0
            r0 = 2
            r1 = r5
            if (r0 > r1) goto L2e
            r0 = r5
            r1 = r4
            int r1 = r1.f26571b
            if (r0 >= r1) goto L2e
            r0 = r4
            byte[] r0 = r0.f26570a
            r7 = r0
            r0 = r7
            r1 = r5
            r0 = r0[r1]
            r1 = 3
            if (r0 != r1) goto L2e
            r0 = r7
            r1 = r5
            r2 = 2
            int r1 = r1 - r2
            r0 = r0[r1]
            if (r0 != 0) goto L2e
            r0 = r7
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            r6 = r0
        L30:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p059d9.C4363g0.m22020j(int):boolean");
    }

    /* renamed from: k */
    public void m22021k() {
        int i10 = 1;
        int i11 = this.f26573d + 1;
        this.f26573d = i11;
        if (i11 == 8) {
            this.f26573d = 0;
            int i12 = this.f26572c;
            if (m22020j(i12 + 1)) {
                i10 = 2;
            }
            this.f26572c = i12 + i10;
        }
        m22011a();
    }

    /* renamed from: l */
    public void m22022l(int i10) {
        int i11 = this.f26572c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f26572c = i13;
        int i14 = this.f26573d + (i10 - (i12 * 8));
        this.f26573d = i14;
        int i15 = i11;
        if (i14 > 7) {
            this.f26572c = i13 + 1;
            this.f26573d = i14 - 8;
            i15 = i11;
        }
        while (true) {
            int i16 = i15 + 1;
            if (i16 > this.f26572c) {
                m22011a();
                return;
            }
            i15 = i16;
            if (m22020j(i16)) {
                this.f26572c++;
                i15 = i16 + 2;
            }
        }
    }
}
