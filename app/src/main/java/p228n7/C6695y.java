package p228n7;

import p057d7.C4334q;
import p057d7.InterfaceC4324g;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/y.class
 */
/* renamed from: n7.y */
/* loaded from: combined.jar:classes2.jar:n7/y.class */
public final class C6695y {

    /* renamed from: c */
    public boolean f35046c;

    /* renamed from: d */
    public boolean f35047d;

    /* renamed from: e */
    public boolean f35048e;

    /* renamed from: a */
    public final C4389t0 f35044a = new C4389t0(0);

    /* renamed from: f */
    public long f35049f = -9223372036854775807L;

    /* renamed from: g */
    public long f35050g = -9223372036854775807L;

    /* renamed from: h */
    public long f35051h = -9223372036854775807L;

    /* renamed from: b */
    public final C4361f0 f35045b = new C4361f0();

    /* renamed from: a */
    public static boolean m30842a(byte[] bArr) {
        boolean z10 = false;
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1) {
            return false;
        }
        if ((bArr[8] & 3) == 3) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: l */
    public static long m30843l(C4361f0 c4361f0) {
        int m21989e = c4361f0.m21989e();
        if (c4361f0.m21985a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c4361f0.m21994j(bArr, 0, 9);
        c4361f0.m21983P(m21989e);
        if (m30842a(bArr)) {
            return m30844m(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public static long m30844m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = b10;
        long j11 = b10;
        long j12 = bArr[1];
        byte b11 = bArr[2];
        return (((j10 & 56) >> 3) << 30) | ((j11 & 3) << 28) | ((j12 & 255) << 20) | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: b */
    public final int m30845b(InterfaceC4324g interfaceC4324g) {
        this.f35045b.m21980M(C4401z0.f26684f);
        this.f35046c = true;
        interfaceC4324g.mo21801f();
        return 0;
    }

    /* renamed from: c */
    public long m30846c() {
        return this.f35051h;
    }

    /* renamed from: d */
    public C4389t0 m30847d() {
        return this.f35044a;
    }

    /* renamed from: e */
    public boolean m30848e() {
        return this.f35046c;
    }

    /* renamed from: f */
    public final int m30849f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    /* renamed from: g */
    public int m30850g(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        if (!this.f35048e) {
            return m30853j(interfaceC4324g, c4334q);
        }
        if (this.f35050g == -9223372036854775807L) {
            return m30845b(interfaceC4324g);
        }
        if (!this.f35047d) {
            return m30851h(interfaceC4324g, c4334q);
        }
        long j10 = this.f35049f;
        if (j10 == -9223372036854775807L) {
            return m30845b(interfaceC4324g);
        }
        this.f35051h = this.f35044a.m22241b(this.f35050g) - this.f35044a.m22241b(j10);
        return m30845b(interfaceC4324g);
    }

    /* renamed from: h */
    public final int m30851h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        int min = (int) Math.min(20000L, interfaceC4324g.getLength());
        long j10 = 0;
        if (interfaceC4324g.getPosition() != j10) {
            c4334q.f26491a = j10;
            return 1;
        }
        this.f35045b.m21979L(min);
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21811q(this.f35045b.m21988d(), 0, min);
        this.f35049f = m30852i(this.f35045b);
        this.f35047d = true;
        return 0;
    }

    /* renamed from: i */
    public final long m30852i(C4361f0 c4361f0) {
        int m21990f = c4361f0.m21990f();
        for (int m21989e = c4361f0.m21989e(); m21989e < m21990f - 3; m21989e++) {
            if (m30849f(c4361f0.m21988d(), m21989e) == 442) {
                c4361f0.m21983P(m21989e + 4);
                long m30843l = m30843l(c4361f0);
                if (m30843l != -9223372036854775807L) {
                    return m30843l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    public final int m30853j(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        long length = interfaceC4324g.getLength();
        int min = (int) Math.min(20000L, length);
        long j10 = length - min;
        if (interfaceC4324g.getPosition() != j10) {
            c4334q.f26491a = j10;
            return 1;
        }
        this.f35045b.m21979L(min);
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21811q(this.f35045b.m21988d(), 0, min);
        this.f35050g = m30854k(this.f35045b);
        this.f35048e = true;
        return 0;
    }

    /* renamed from: k */
    public final long m30854k(C4361f0 c4361f0) {
        int m21989e = c4361f0.m21989e();
        for (int m21990f = c4361f0.m21990f() - 4; m21990f >= m21989e; m21990f--) {
            if (m30849f(c4361f0.m21988d(), m21990f) == 442) {
                c4361f0.m21983P(m21990f + 4);
                long m30843l = m30843l(c4361f0);
                if (m30843l != -9223372036854775807L) {
                    return m30843l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
