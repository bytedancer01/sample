package p377w3;

import java.io.OutputStream;
import org.apache.commons.net.bsd.RCommandClient;
import org.jsoup.parser.CharacterReader;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w3/b.class
 */
/* renamed from: w3.b */
/* loaded from: combined.jar:classes1.jar:w3/b.class */
public class C9405b {

    /* renamed from: a */
    public int f43124a;

    /* renamed from: b */
    public int f43125b;

    /* renamed from: c */
    public byte[] f43126c;

    /* renamed from: d */
    public int f43127d;

    /* renamed from: e */
    public int f43128e;

    /* renamed from: f */
    public int f43129f;

    /* renamed from: g */
    public int f43130g;

    /* renamed from: i */
    public int f43132i;

    /* renamed from: p */
    public int f43139p;

    /* renamed from: q */
    public int f43140q;

    /* renamed from: r */
    public int f43141r;

    /* renamed from: v */
    public int f43145v;

    /* renamed from: h */
    public int f43131h = 12;

    /* renamed from: j */
    public int f43133j = 4096;

    /* renamed from: k */
    public int[] f43134k = new int[5003];

    /* renamed from: l */
    public int[] f43135l = new int[5003];

    /* renamed from: m */
    public int f43136m = 5003;

    /* renamed from: n */
    public int f43137n = 0;

    /* renamed from: o */
    public boolean f43138o = false;

    /* renamed from: s */
    public int f43142s = 0;

    /* renamed from: t */
    public int f43143t = 0;

    /* renamed from: u */
    public int[] f43144u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, RCommandClient.MAX_CLIENT_PORT, 2047, 4095, 8191, 16383, 32767, CharacterReader.EOF};

    /* renamed from: w */
    public byte[] f43146w = new byte[256];

    public C9405b(int i10, int i11, byte[] bArr, int i12) {
        this.f43124a = i10;
        this.f43125b = i11;
        this.f43126c = bArr;
        this.f43127d = Math.max(2, i12);
    }

    /* renamed from: a */
    public final int m39747a(int i10) {
        return (1 << i10) - 1;
    }

    /* renamed from: b */
    public void m39748b(byte b10, OutputStream outputStream) {
        byte[] bArr = this.f43146w;
        int i10 = this.f43145v;
        int i11 = i10 + 1;
        this.f43145v = i11;
        bArr[i10] = b10;
        if (i11 >= 254) {
            m39753g(outputStream);
        }
    }

    /* renamed from: c */
    public void m39749c(OutputStream outputStream) {
        m39750d(this.f43136m);
        int i10 = this.f43140q;
        this.f43137n = i10 + 2;
        this.f43138o = true;
        m39755i(i10, outputStream);
    }

    /* renamed from: d */
    public void m39750d(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f43134k[i11] = -1;
        }
    }

    /* renamed from: e */
    public void m39751e(int i10, OutputStream outputStream) {
        int i11;
        int i12;
        this.f43139p = i10;
        int i13 = 0;
        this.f43138o = false;
        this.f43130g = i10;
        this.f43132i = m39747a(i10);
        int i14 = 1 << (i10 - 1);
        this.f43140q = i14;
        this.f43141r = i14 + 1;
        this.f43137n = i14 + 2;
        this.f43145v = 0;
        int m39754h = m39754h();
        int i15 = this.f43136m;
        while (true) {
            int i16 = i15;
            if (i16 >= 65536) {
                break;
            }
            i13++;
            i15 = i16 * 2;
        }
        int i17 = this.f43136m;
        m39750d(i17);
        m39755i(this.f43140q, outputStream);
        int i18 = m39754h;
        while (true) {
            int i19 = i18;
            int m39754h2 = m39754h();
            if (m39754h2 == -1) {
                m39755i(i19, outputStream);
                m39755i(this.f43141r, outputStream);
                return;
            }
            int i20 = (m39754h2 << this.f43131h) + i19;
            int i21 = (m39754h2 << (8 - i13)) ^ i19;
            int i22 = this.f43134k[i21];
            if (i22 == i20) {
                i18 = this.f43135l[i21];
            } else {
                int i23 = i21;
                if (i22 >= 0) {
                    int i24 = i17 - i21;
                    int i25 = i21;
                    if (i21 == 0) {
                        i24 = 1;
                        i25 = i21;
                    }
                    do {
                        int i26 = i25 - i24;
                        i11 = i26;
                        if (i26 < 0) {
                            i11 = i26 + i17;
                        }
                        i12 = this.f43134k[i11];
                        if (i12 == i20) {
                            i18 = this.f43135l[i11];
                            break;
                        }
                        i25 = i11;
                    } while (i12 >= 0);
                    i23 = i11;
                }
                m39755i(i19, outputStream);
                int i27 = this.f43137n;
                if (i27 < this.f43133j) {
                    int[] iArr = this.f43135l;
                    this.f43137n = i27 + 1;
                    iArr[i23] = i27;
                    this.f43134k[i23] = i20;
                } else {
                    m39749c(outputStream);
                }
                i18 = m39754h2;
            }
        }
    }

    /* renamed from: f */
    public void m39752f(OutputStream outputStream) {
        outputStream.write(this.f43127d);
        this.f43128e = this.f43124a * this.f43125b;
        this.f43129f = 0;
        m39751e(this.f43127d + 1, outputStream);
        outputStream.write(0);
    }

    /* renamed from: g */
    public void m39753g(OutputStream outputStream) {
        int i10 = this.f43145v;
        if (i10 > 0) {
            outputStream.write(i10);
            outputStream.write(this.f43146w, 0, this.f43145v);
            this.f43145v = 0;
        }
    }

    /* renamed from: h */
    public final int m39754h() {
        int i10 = this.f43128e;
        if (i10 == 0) {
            return -1;
        }
        this.f43128e = i10 - 1;
        byte[] bArr = this.f43126c;
        int i11 = this.f43129f;
        this.f43129f = i11 + 1;
        return bArr[i11] & 255;
    }

    /* renamed from: i */
    public void m39755i(int i10, OutputStream outputStream) {
        int i11 = this.f43142s;
        int[] iArr = this.f43144u;
        int i12 = this.f43143t;
        int i13 = i11 & iArr[i12];
        this.f43142s = i13;
        if (i12 > 0) {
            this.f43142s = i13 | (i10 << i12);
        } else {
            this.f43142s = i10;
        }
        this.f43143t = i12 + this.f43130g;
        while (this.f43143t >= 8) {
            m39748b((byte) (this.f43142s & 255), outputStream);
            this.f43142s >>= 8;
            this.f43143t -= 8;
        }
        if (this.f43137n > this.f43132i || this.f43138o) {
            if (this.f43138o) {
                int i14 = this.f43139p;
                this.f43130g = i14;
                this.f43132i = m39747a(i14);
                this.f43138o = false;
            } else {
                int i15 = this.f43130g + 1;
                this.f43130g = i15;
                this.f43132i = i15 == this.f43131h ? this.f43133j : m39747a(i15);
            }
        }
        if (i10 == this.f43141r) {
            while (this.f43143t > 0) {
                m39748b((byte) (this.f43142s & 255), outputStream);
                this.f43142s >>= 8;
                this.f43143t -= 8;
            }
            m39753g(outputStream);
        }
    }
}
