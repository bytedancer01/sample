package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/q5.class
 */
/* renamed from: ra.q5 */
/* loaded from: combined.jar:classes2.jar:ra/q5.class */
public final class C8305q5 extends AbstractC8350t5 {

    /* renamed from: d */
    public final byte[] f39243d;

    /* renamed from: e */
    public final int f39244e;

    /* renamed from: f */
    public int f39245f;

    public C8305q5(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f39243d = bArr;
        this.f39245f = 0;
        this.f39244e = i11;
    }

    /* renamed from: G */
    public final void m35713G(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f39243d, this.f39245f, i11);
            this.f39245f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C8320r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39245f), Integer.valueOf(this.f39244e), Integer.valueOf(i11)), e10);
        }
    }

    /* renamed from: H */
    public final void m35714H(String str) {
        int i10 = this.f39245f;
        try {
            int m35814C = AbstractC8350t5.m35814C(str.length() * 3);
            int m35814C2 = AbstractC8350t5.m35814C(str.length());
            if (m35814C2 != m35814C) {
                mo35726t(C8189i9.m35457c(str));
                byte[] bArr = this.f39243d;
                int i11 = this.f39245f;
                this.f39245f = C8189i9.m35458d(str, bArr, i11, this.f39244e - i11);
                return;
            }
            int i12 = i10 + m35814C2;
            this.f39245f = i12;
            int m35458d = C8189i9.m35458d(str, this.f39243d, i12, this.f39244e - i12);
            this.f39245f = i10;
            mo35726t((m35458d - i10) - m35814C2);
            this.f39245f = m35458d;
        } catch (IndexOutOfBoundsException e10) {
            throw new C8320r5(e10);
        } catch (C8159g9 e11) {
            this.f39245f = i10;
            m35826f(str, e11);
        }
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: i */
    public final void mo35715i(int i10, int i11) {
        mo35726t((i10 << 3) | i11);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: j */
    public final void mo35716j(int i10, int i11) {
        mo35726t(i10 << 3);
        mo35725s(i11);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: k */
    public final void mo35717k(int i10, int i11) {
        mo35726t(i10 << 3);
        mo35726t(i11);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: l */
    public final void mo35718l(int i10, int i11) {
        mo35726t((i10 << 3) | 5);
        mo35727u(i11);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: m */
    public final void mo35719m(int i10, long j10) {
        mo35726t(i10 << 3);
        mo35728v(j10);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: n */
    public final void mo35720n(int i10, long j10) {
        mo35726t((i10 << 3) | 1);
        mo35729w(j10);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: o */
    public final void mo35721o(int i10, boolean z10) {
        mo35726t(i10 << 3);
        mo35724r(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: p */
    public final void mo35722p(int i10, String str) {
        mo35726t((i10 << 3) | 2);
        m35714H(str);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: q */
    public final void mo35723q(int i10, AbstractC8230l5 abstractC8230l5) {
        mo35726t((i10 << 3) | 2);
        mo35726t(abstractC8230l5.mo35264d());
        abstractC8230l5.mo35511f(this);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: r */
    public final void mo35724r(byte b10) {
        try {
            byte[] bArr = this.f39243d;
            int i10 = this.f39245f;
            this.f39245f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C8320r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39245f), Integer.valueOf(this.f39244e), 1), e10);
        }
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: s */
    public final void mo35725s(int i10) {
        if (i10 >= 0) {
            mo35726t(i10);
        } else {
            mo35728v(i10);
        }
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: t */
    public final void mo35726t(int i10) {
        boolean z10;
        int i11 = i10;
        z10 = AbstractC8350t5.f39281c;
        if (z10) {
            i11 = i10;
            if (!C8379v4.m35962a()) {
                int i12 = this.f39244e;
                int i13 = this.f39245f;
                i11 = i10;
                if (i12 - i13 >= 5) {
                    if ((i10 & (-128)) == 0) {
                        byte[] bArr = this.f39243d;
                        this.f39245f = i13 + 1;
                        C8099c9.m35105B(bArr, i13, (byte) i10);
                        return;
                    }
                    byte[] bArr2 = this.f39243d;
                    this.f39245f = i13 + 1;
                    C8099c9.m35105B(bArr2, i13, (byte) (i10 | 128));
                    int i14 = i10 >>> 7;
                    if ((i14 & (-128)) == 0) {
                        byte[] bArr3 = this.f39243d;
                        int i15 = this.f39245f;
                        this.f39245f = i15 + 1;
                        C8099c9.m35105B(bArr3, i15, (byte) i14);
                        return;
                    }
                    byte[] bArr4 = this.f39243d;
                    int i16 = this.f39245f;
                    this.f39245f = i16 + 1;
                    C8099c9.m35105B(bArr4, i16, (byte) (i14 | 128));
                    int i17 = i14 >>> 7;
                    if ((i17 & (-128)) == 0) {
                        byte[] bArr5 = this.f39243d;
                        int i18 = this.f39245f;
                        this.f39245f = i18 + 1;
                        C8099c9.m35105B(bArr5, i18, (byte) i17);
                        return;
                    }
                    byte[] bArr6 = this.f39243d;
                    int i19 = this.f39245f;
                    this.f39245f = i19 + 1;
                    C8099c9.m35105B(bArr6, i19, (byte) (i17 | 128));
                    int i20 = i17 >>> 7;
                    if ((i20 & (-128)) == 0) {
                        byte[] bArr7 = this.f39243d;
                        int i21 = this.f39245f;
                        this.f39245f = i21 + 1;
                        C8099c9.m35105B(bArr7, i21, (byte) i20);
                        return;
                    }
                    byte[] bArr8 = this.f39243d;
                    int i22 = this.f39245f;
                    this.f39245f = i22 + 1;
                    C8099c9.m35105B(bArr8, i22, (byte) (i20 | 128));
                    byte[] bArr9 = this.f39243d;
                    int i23 = this.f39245f;
                    this.f39245f = i23 + 1;
                    C8099c9.m35105B(bArr9, i23, (byte) (i20 >>> 7));
                    return;
                }
            }
        }
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr10 = this.f39243d;
                int i24 = this.f39245f;
                this.f39245f = i24 + 1;
                bArr10[i24] = (byte) ((i11 & 127) | 128);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C8320r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39245f), Integer.valueOf(this.f39244e), 1), e10);
            }
        }
        byte[] bArr11 = this.f39243d;
        int i25 = this.f39245f;
        this.f39245f = i25 + 1;
        bArr11[i25] = (byte) i11;
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: u */
    public final void mo35727u(int i10) {
        try {
            byte[] bArr = this.f39243d;
            int i11 = this.f39245f;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f39245f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C8320r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39245f), Integer.valueOf(this.f39244e), 1), e10);
        }
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: v */
    public final void mo35728v(long j10) {
        boolean z10;
        long j11 = j10;
        z10 = AbstractC8350t5.f39281c;
        if (z10) {
            j11 = j10;
            if (this.f39244e - this.f39245f >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f39243d;
                    int i10 = this.f39245f;
                    this.f39245f = i10 + 1;
                    C8099c9.m35105B(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f39243d;
                int i11 = this.f39245f;
                this.f39245f = i11 + 1;
                C8099c9.m35105B(bArr2, i11, (byte) j10);
                return;
            }
        }
        while ((j11 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f39243d;
                int i12 = this.f39245f;
                this.f39245f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j11) & 127) | 128);
                j11 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C8320r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39245f), Integer.valueOf(this.f39244e), 1), e10);
            }
        }
        byte[] bArr4 = this.f39243d;
        int i13 = this.f39245f;
        this.f39245f = i13 + 1;
        bArr4[i13] = (byte) j11;
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: w */
    public final void mo35729w(long j10) {
        try {
            byte[] bArr = this.f39243d;
            int i10 = this.f39245f;
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
            this.f39245f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C8320r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f39245f), Integer.valueOf(this.f39244e), 1), e10);
        }
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: x */
    public final void mo35730x(byte[] bArr, int i10, int i11) {
        m35713G(bArr, 0, i11);
    }

    @Override // p305ra.AbstractC8350t5
    /* renamed from: y */
    public final int mo35731y() {
        return this.f39244e - this.f39245f;
    }
}
