package p059d9;

import ec.C4701d;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/f0.class
 */
/* renamed from: d9.f0 */
/* loaded from: combined.jar:classes2.jar:d9/f0.class */
public final class C4361f0 {

    /* renamed from: a */
    public byte[] f26567a;

    /* renamed from: b */
    public int f26568b;

    /* renamed from: c */
    public int f26569c;

    public C4361f0() {
        this.f26567a = C4401z0.f26684f;
    }

    public C4361f0(int i10) {
        this.f26567a = new byte[i10];
        this.f26569c = i10;
    }

    public C4361f0(byte[] bArr) {
        this.f26567a = bArr;
        this.f26569c = bArr.length;
    }

    public C4361f0(byte[] bArr, int i10) {
        this.f26567a = bArr;
        this.f26569c = i10;
    }

    /* renamed from: A */
    public String m21968A(int i10) {
        return m21969B(i10, C4701d.f27717c);
    }

    /* renamed from: B */
    public String m21969B(int i10, Charset charset) {
        String str = new String(this.f26567a, this.f26568b, i10, charset);
        this.f26568b += i10;
        return str;
    }

    /* renamed from: C */
    public int m21970C() {
        return (m21971D() << 21) | (m21971D() << 14) | (m21971D() << 7) | m21971D();
    }

    /* renamed from: D */
    public int m21971D() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        this.f26568b = i10 + 1;
        return bArr[i10] & 255;
    }

    /* renamed from: E */
    public int m21972E() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        byte b11 = bArr[i11];
        this.f26568b = i11 + 1 + 2;
        return (b11 & 255) | ((b10 & 255) << 8);
    }

    /* renamed from: F */
    public long m21973F() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        this.f26568b = i13 + 1;
        return ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8) | (bArr[i13] & 255);
    }

    /* renamed from: G */
    public int m21974G() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        this.f26568b = i12 + 1;
        return (bArr[i12] & 255) | ((b10 & 255) << 16) | ((b11 & 255) << 8);
    }

    /* renamed from: H */
    public int m21975H() {
        int m21998n = m21998n();
        if (m21998n >= 0) {
            return m21998n;
        }
        throw new IllegalStateException("Top bit not zero: " + m21998n);
    }

    /* renamed from: I */
    public long m21976I() {
        long m22007w = m22007w();
        if (m22007w >= 0) {
            return m22007w;
        }
        throw new IllegalStateException("Top bit not zero: " + m22007w);
    }

    /* renamed from: J */
    public int m21977J() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        this.f26568b = i11 + 1;
        return (bArr[i11] & 255) | ((b10 & 255) << 8);
    }

    /* renamed from: K */
    public long m21978K() {
        int i10;
        int i11;
        long j10 = this.f26567a[this.f26568b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r0 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f26567a[this.f26568b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r0 & 63);
        }
        this.f26568b += i11;
        return j10;
    }

    /* renamed from: L */
    public void m21979L(int i10) {
        m21981N(m21986b() < i10 ? new byte[i10] : this.f26567a, i10);
    }

    /* renamed from: M */
    public void m21980M(byte[] bArr) {
        m21981N(bArr, bArr.length);
    }

    /* renamed from: N */
    public void m21981N(byte[] bArr, int i10) {
        this.f26567a = bArr;
        this.f26569c = i10;
        this.f26568b = 0;
    }

    /* renamed from: O */
    public void m21982O(int i10) {
        C4349a.m21878a(i10 >= 0 && i10 <= this.f26567a.length);
        this.f26569c = i10;
    }

    /* renamed from: P */
    public void m21983P(int i10) {
        C4349a.m21878a(i10 >= 0 && i10 <= this.f26569c);
        this.f26568b = i10;
    }

    /* renamed from: Q */
    public void m21984Q(int i10) {
        m21983P(this.f26568b + i10);
    }

    /* renamed from: a */
    public int m21985a() {
        return this.f26569c - this.f26568b;
    }

    /* renamed from: b */
    public int m21986b() {
        return this.f26567a.length;
    }

    /* renamed from: c */
    public void m21987c(int i10) {
        if (i10 > m21986b()) {
            this.f26567a = Arrays.copyOf(this.f26567a, i10);
        }
    }

    /* renamed from: d */
    public byte[] m21988d() {
        return this.f26567a;
    }

    /* renamed from: e */
    public int m21989e() {
        return this.f26568b;
    }

    /* renamed from: f */
    public int m21990f() {
        return this.f26569c;
    }

    /* renamed from: g */
    public char m21991g() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    /* renamed from: h */
    public int m21992h() {
        return this.f26567a[this.f26568b] & 255;
    }

    /* renamed from: i */
    public void m21993i(C4359e0 c4359e0, int i10) {
        m21994j(c4359e0.f26561a, 0, i10);
        c4359e0.m21958p(0);
    }

    /* renamed from: j */
    public void m21994j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f26567a, this.f26568b, bArr, i10, i11);
        this.f26568b += i11;
    }

    /* renamed from: k */
    public String m21995k(char c10) {
        if (m21985a() == 0) {
            return null;
        }
        int i10 = this.f26568b;
        while (i10 < this.f26569c && this.f26567a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f26567a;
        int i11 = this.f26568b;
        String m22325G = C4401z0.m22325G(bArr, i11, i10 - i11);
        this.f26568b = i10;
        if (i10 < this.f26569c) {
            this.f26568b = i10 + 1;
        }
        return m22325G;
    }

    /* renamed from: l */
    public double m21996l() {
        return Double.longBitsToDouble(m22007w());
    }

    /* renamed from: m */
    public float m21997m() {
        return Float.intBitsToFloat(m21998n());
    }

    /* renamed from: n */
    public int m21998n() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        this.f26568b = i13 + 1;
        return (bArr[i13] & 255) | ((b10 & 255) << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8);
    }

    /* renamed from: o */
    public int m21999o() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        this.f26568b = i12 + 1;
        return (bArr[i12] & 255) | (((b10 & 255) << 24) >> 8) | ((b11 & 255) << 8);
    }

    /* renamed from: p */
    public String m22000p() {
        if (m21985a() == 0) {
            return null;
        }
        int i10 = this.f26568b;
        while (i10 < this.f26569c && !C4401z0.m22412t0(this.f26567a[i10])) {
            i10++;
        }
        int i11 = this.f26568b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f26567a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f26568b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f26567a;
        int i12 = this.f26568b;
        String m22325G = C4401z0.m22325G(bArr2, i12, i10 - i12);
        this.f26568b = i10;
        int i13 = this.f26569c;
        if (i10 == i13) {
            return m22325G;
        }
        byte[] bArr3 = this.f26567a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f26568b = i14;
            if (i14 == i13) {
                return m22325G;
            }
        }
        int i15 = this.f26568b;
        if (bArr3[i15] == 10) {
            this.f26568b = i15 + 1;
        }
        return m22325G;
    }

    /* renamed from: q */
    public int m22001q() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        this.f26568b = i13 + 1;
        return ((bArr[i13] & 255) << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
    }

    /* renamed from: r */
    public long m22002r() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        long j16 = bArr[i16];
        this.f26568b = i17 + 1;
        return (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((j16 & 255) << 48) | ((bArr[i17] & 255) << 56);
    }

    /* renamed from: s */
    public short m22003s() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        this.f26568b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (b10 & 255));
    }

    /* renamed from: t */
    public long m22004t() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        this.f26568b = i13 + 1;
        return (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    /* renamed from: u */
    public int m22005u() {
        int m22001q = m22001q();
        if (m22001q >= 0) {
            return m22001q;
        }
        throw new IllegalStateException("Top bit not zero: " + m22001q);
    }

    /* renamed from: v */
    public int m22006v() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        this.f26568b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (b10 & 255);
    }

    /* renamed from: w */
    public long m22007w() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        long j16 = bArr[i16];
        this.f26568b = i17 + 1;
        return ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | ((j16 & 255) << 8) | (bArr[i17] & 255);
    }

    /* renamed from: x */
    public String m22008x() {
        return m21995k((char) 0);
    }

    /* renamed from: y */
    public String m22009y(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f26568b;
        int i12 = (i11 + i10) - 1;
        String m22325G = C4401z0.m22325G(this.f26567a, i11, (i12 >= this.f26569c || this.f26567a[i12] != 0) ? i10 : i10 - 1);
        this.f26568b += i10;
        return m22325G;
    }

    /* renamed from: z */
    public short m22010z() {
        byte[] bArr = this.f26567a;
        int i10 = this.f26568b;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        this.f26568b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((b10 & 255) << 8));
    }
}
