package td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/k.class
 */
/* renamed from: td.k */
/* loaded from: combined.jar:classes2.jar:td/k.class */
public final class C8696k extends AbstractC8693h {

    /* renamed from: c */
    public final byte[] f40471c;

    /* renamed from: d */
    public final int f40472d;

    /* renamed from: e */
    public final int f40473e;

    /* renamed from: f */
    public final int f40474f;

    /* renamed from: g */
    public final int f40475g;

    public C8696k(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f40471c = bArr;
        this.f40472d = i10;
        this.f40473e = i11;
        this.f40474f = i12;
        this.f40475g = i13;
        if (z10) {
            m37210h(i14, i15);
        }
    }

    @Override // td.AbstractC8693h
    /* renamed from: b */
    public byte[] mo37199b() {
        int m37205d = m37205d();
        int m37204a = m37204a();
        int i10 = this.f40472d;
        if (m37205d == i10 && m37204a == this.f40473e) {
            return this.f40471c;
        }
        int i11 = m37205d * m37204a;
        byte[] bArr = new byte[i11];
        int i12 = (this.f40475g * i10) + this.f40474f;
        int i13 = i12;
        if (m37205d == i10) {
            System.arraycopy(this.f40471c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i14 = 0; i14 < m37204a; i14++) {
            System.arraycopy(this.f40471c, i13, bArr, i14 * m37205d, m37205d);
            i13 += this.f40472d;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r8.length < r0) goto L10;
     */
    @Override // td.AbstractC8693h
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] mo37200c(int r7, byte[] r8) {
        /*
            r6 = this;
            r0 = r7
            if (r0 < 0) goto L4d
            r0 = r7
            r1 = r6
            int r1 = r1.m37204a()
            if (r0 >= r1) goto L4d
            r0 = r6
            int r0 = r0.m37205d()
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L1e
            r0 = r8
            r13 = r0
            r0 = r8
            int r0 = r0.length
            r1 = r9
            if (r0 >= r1) goto L23
        L1e:
            r0 = r9
            byte[] r0 = new byte[r0]
            r13 = r0
        L23:
            r0 = r6
            int r0 = r0.f40475g
            r12 = r0
            r0 = r6
            int r0 = r0.f40472d
            r11 = r0
            r0 = r6
            int r0 = r0.f40474f
            r10 = r0
            r0 = r6
            byte[] r0 = r0.f40471c
            r1 = r7
            r2 = r12
            int r1 = r1 + r2
            r2 = r11
            int r1 = r1 * r2
            r2 = r10
            int r1 = r1 + r2
            r2 = r13
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r13
            return r0
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Requested row is outside the image: "
            r3 = r7
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: td.C8696k.mo37200c(int, byte[]):byte[]");
    }

    /* renamed from: h */
    public final void m37210h(int i10, int i11) {
        byte[] bArr = this.f40471c;
        int i12 = (this.f40475g * this.f40472d) + this.f40474f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i10 / 2;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14 + i12) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f40472d;
        }
    }
}
