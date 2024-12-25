package p059d9;

import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/e0.class
 */
/* renamed from: d9.e0 */
/* loaded from: combined.jar:classes2.jar:d9/e0.class */
public final class C4359e0 {

    /* renamed from: a */
    public byte[] f26561a;

    /* renamed from: b */
    public int f26562b;

    /* renamed from: c */
    public int f26563c;

    /* renamed from: d */
    public int f26564d;

    public C4359e0() {
        this.f26561a = C4401z0.f26684f;
    }

    public C4359e0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C4359e0(byte[] bArr, int i10) {
        this.f26561a = bArr;
        this.f26564d = i10;
    }

    /* renamed from: a */
    public final void m21943a() {
        int i10;
        int i11 = this.f26562b;
        C4349a.m21884g(i11 >= 0 && (i11 < (i10 = this.f26564d) || (i11 == i10 && this.f26563c == 0)));
    }

    /* renamed from: b */
    public int m21944b() {
        return ((this.f26564d - this.f26562b) * 8) - this.f26563c;
    }

    /* renamed from: c */
    public void m21945c() {
        if (this.f26563c == 0) {
            return;
        }
        this.f26563c = 0;
        this.f26562b++;
        m21943a();
    }

    /* renamed from: d */
    public int m21946d() {
        C4349a.m21884g(this.f26563c == 0);
        return this.f26562b;
    }

    /* renamed from: e */
    public int m21947e() {
        return (this.f26562b * 8) + this.f26563c;
    }

    /* renamed from: f */
    public void m21948f(int i10, int i11) {
        int i12 = i10;
        if (i11 < 32) {
            i12 = i10 & ((1 << i11) - 1);
        }
        int min = Math.min(8 - this.f26563c, i11);
        int i13 = this.f26563c;
        int i14 = (8 - i13) - min;
        byte[] bArr = this.f26561a;
        int i15 = this.f26562b;
        byte b10 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr[i15]);
        bArr[i15] = b10;
        int i16 = i11 - min;
        bArr[i15] = (byte) (b10 | ((i12 >>> i16) << i14));
        int i17 = i15 + 1;
        while (i16 > 8) {
            this.f26561a[i17] = (byte) (i12 >>> (i16 - 8));
            i16 -= 8;
            i17++;
        }
        int i18 = 8 - i16;
        byte[] bArr2 = this.f26561a;
        byte b11 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b11;
        bArr2[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b11);
        m21960r(i11);
        m21943a();
    }

    /* renamed from: g */
    public boolean m21949g() {
        boolean z10 = (this.f26561a[this.f26562b] & (128 >> this.f26563c)) != 0;
        m21959q();
        return z10;
    }

    /* renamed from: h */
    public int m21950h(int i10) {
        int i11;
        int i12;
        if (i10 == 0) {
            return 0;
        }
        this.f26563c += i10;
        int i13 = 0;
        while (true) {
            i11 = i13;
            i12 = this.f26563c;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f26563c = i14;
            byte[] bArr = this.f26561a;
            int i15 = this.f26562b;
            this.f26562b = i15 + 1;
            i13 = i11 | ((bArr[i15] & 255) << i14);
        }
        byte[] bArr2 = this.f26561a;
        int i16 = this.f26562b;
        byte b10 = bArr2[i16];
        if (i12 == 8) {
            this.f26563c = 0;
            this.f26562b = i16 + 1;
        }
        m21943a();
        return ((-1) >>> (32 - i10)) & (i11 | ((b10 & 255) >> (8 - i12)));
    }

    /* renamed from: i */
    public void m21951i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f26561a;
            int i13 = this.f26562b;
            int i14 = i13 + 1;
            this.f26562b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f26563c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f26563c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f26561a;
            int i18 = this.f26562b;
            this.f26562b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f26563c = i17 - 8;
        }
        int i19 = this.f26563c + i16;
        this.f26563c = i19;
        byte[] bArr4 = this.f26561a;
        int i20 = this.f26562b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f26563c = 0;
            this.f26562b = i20 + 1;
        }
        m21943a();
    }

    /* renamed from: j */
    public long m21952j(int i10) {
        return i10 <= 32 ? C4401z0.m22379e1(m21950h(i10)) : C4401z0.m22376d1(m21950h(i10 - 32), m21950h(32));
    }

    /* renamed from: k */
    public void m21953k(byte[] bArr, int i10, int i11) {
        C4349a.m21884g(this.f26563c == 0);
        System.arraycopy(this.f26561a, this.f26562b, bArr, i10, i11);
        this.f26562b += i11;
        m21943a();
    }

    /* renamed from: l */
    public String m21954l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        m21953k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void m21955m(C4361f0 c4361f0) {
        m21957o(c4361f0.m21988d(), c4361f0.m21990f());
        m21958p(c4361f0.m21989e() * 8);
    }

    /* renamed from: n */
    public void m21956n(byte[] bArr) {
        m21957o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void m21957o(byte[] bArr, int i10) {
        this.f26561a = bArr;
        this.f26562b = 0;
        this.f26563c = 0;
        this.f26564d = i10;
    }

    /* renamed from: p */
    public void m21958p(int i10) {
        int i11 = i10 / 8;
        this.f26562b = i11;
        this.f26563c = i10 - (i11 * 8);
        m21943a();
    }

    /* renamed from: q */
    public void m21959q() {
        int i10 = this.f26563c + 1;
        this.f26563c = i10;
        if (i10 == 8) {
            this.f26563c = 0;
            this.f26562b++;
        }
        m21943a();
    }

    /* renamed from: r */
    public void m21960r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f26562b + i11;
        this.f26562b = i12;
        int i13 = this.f26563c + (i10 - (i11 * 8));
        this.f26563c = i13;
        if (i13 > 7) {
            this.f26562b = i12 + 1;
            this.f26563c = i13 - 8;
        }
        m21943a();
    }

    /* renamed from: s */
    public void m21961s(int i10) {
        C4349a.m21884g(this.f26563c == 0);
        this.f26562b += i10;
        m21943a();
    }
}
