package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/xf.class
 */
/* renamed from: ma.xf */
/* loaded from: combined.jar:classes2.jar:ma/xf.class */
public final class C6501xf extends AbstractC6022ag {

    /* renamed from: d */
    public final byte[] f34155d;

    /* renamed from: e */
    public final int f34156e;

    /* renamed from: f */
    public int f34157f;

    public C6501xf(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f34155d = bArr;
        this.f34157f = 0;
        this.f34156e = i11;
    }

    /* renamed from: B */
    public final void m30120B(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f34155d, this.f34157f, i11);
            this.f34157f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C6521yf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34157f), Integer.valueOf(this.f34156e), Integer.valueOf(i11)), e10);
        }
    }

    /* renamed from: C */
    public final void m30121C(String str) {
        int i10 = this.f34157f;
        try {
            int m29406y = AbstractC6022ag.m29406y(str.length() * 3);
            int m29406y2 = AbstractC6022ag.m29406y(str.length());
            if (m29406y2 != m29406y) {
                mo29424r(C6277mj.m29857c(str));
                byte[] bArr = this.f34155d;
                int i11 = this.f34157f;
                this.f34157f = C6277mj.m29856b(str, bArr, i11, this.f34156e - i11);
                return;
            }
            int i12 = i10 + m29406y2;
            this.f34157f = i12;
            int m29856b = C6277mj.m29856b(str, this.f34155d, i12, this.f34156e - i12);
            this.f34157f = i10;
            mo29424r((m29856b - i10) - m29406y2);
            this.f34157f = m29856b;
        } catch (IndexOutOfBoundsException e10) {
            throw new C6521yf(e10);
        } catch (C6256lj e11) {
            this.f34157f = i10;
            m29409b(str, e11);
        }
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: d */
    public final int mo29410d() {
        return this.f34156e - this.f34157f;
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: e */
    public final void mo29411e(byte b10) {
        try {
            byte[] bArr = this.f34155d;
            int i10 = this.f34157f;
            this.f34157f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C6521yf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34157f), Integer.valueOf(this.f34156e), 1), e10);
        }
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: f */
    public final void mo29412f(int i10, boolean z10) {
        mo29424r(i10 << 3);
        mo29411e(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: g */
    public final void mo29413g(int i10, AbstractC6399sf abstractC6399sf) {
        mo29424r((i10 << 3) | 2);
        mo29424r(abstractC6399sf.mo29850d());
        abstractC6399sf.mo29966h(this);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: h */
    public final void mo29414h(int i10, int i11) {
        mo29424r((i10 << 3) | 5);
        mo29415i(i11);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: i */
    public final void mo29415i(int i10) {
        try {
            byte[] bArr = this.f34155d;
            int i11 = this.f34157f;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f34157f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C6521yf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34157f), Integer.valueOf(this.f34156e), 1), e10);
        }
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: j */
    public final void mo29416j(int i10, long j10) {
        mo29424r((i10 << 3) | 1);
        mo29417k(j10);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: k */
    public final void mo29417k(long j10) {
        try {
            byte[] bArr = this.f34155d;
            int i10 = this.f34157f;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f34157f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C6521yf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34157f), Integer.valueOf(this.f34156e), 1), e10);
        }
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: l */
    public final void mo29418l(int i10, int i11) {
        mo29424r(i10 << 3);
        mo29419m(i11);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: m */
    public final void mo29419m(int i10) {
        if (i10 >= 0) {
            mo29424r(i10);
        } else {
            mo29426t(i10);
        }
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: n */
    public final void mo29420n(byte[] bArr, int i10, int i11) {
        m30120B(bArr, 0, i11);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: o */
    public final void mo29421o(int i10, String str) {
        mo29424r((i10 << 3) | 2);
        m30121C(str);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: p */
    public final void mo29422p(int i10, int i11) {
        mo29424r((i10 << 3) | i11);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: q */
    public final void mo29423q(int i10, int i11) {
        mo29424r(i10 << 3);
        mo29424r(i11);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: r */
    public final void mo29424r(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f34155d;
                int i11 = this.f34157f;
                this.f34157f = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C6521yf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34157f), Integer.valueOf(this.f34156e), 1), e10);
            }
        }
        byte[] bArr2 = this.f34155d;
        int i12 = this.f34157f;
        this.f34157f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: s */
    public final void mo29425s(int i10, long j10) {
        mo29424r(i10 << 3);
        mo29426t(j10);
    }

    @Override // ma.AbstractC6022ag
    /* renamed from: t */
    public final void mo29426t(long j10) {
        boolean z10;
        long j11 = j10;
        z10 = AbstractC6022ag.f33662c;
        if (z10) {
            j11 = j10;
            if (this.f34156e - this.f34157f >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f34155d;
                    int i10 = this.f34157f;
                    this.f34157f = i10 + 1;
                    C6193ij.m29757s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f34155d;
                int i11 = this.f34157f;
                this.f34157f = i11 + 1;
                C6193ij.m29757s(bArr2, i11, (byte) j10);
                return;
            }
        }
        while ((j11 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f34155d;
                int i12 = this.f34157f;
                this.f34157f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j11) & 127) | 128);
                j11 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C6521yf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f34157f), Integer.valueOf(this.f34156e), 1), e10);
            }
        }
        byte[] bArr4 = this.f34155d;
        int i13 = this.f34157f;
        this.f34157f = i13 + 1;
        bArr4[i13] = (byte) j11;
    }
}
