package p387wd;

import ae.C0156a;
import ae.C0157b;
import be.C0892a;
import be.C0894c;
import be.C0895d;
import p353ud.C9154a;
import p444zd.AbstractC10201i;
import p444zd.C10194b;
import td.C8695j;
import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wd/a.class
 */
/* renamed from: wd.a */
/* loaded from: combined.jar:classes2.jar:wd/a.class */
public final class C9569a {

    /* renamed from: g */
    public static final int[] f43570g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final C10194b f43571a;

    /* renamed from: b */
    public boolean f43572b;

    /* renamed from: c */
    public int f43573c;

    /* renamed from: d */
    public int f43574d;

    /* renamed from: e */
    public int f43575e;

    /* renamed from: f */
    public int f43576f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wd/a$a.class
     */
    /* renamed from: wd.a$a */
    /* loaded from: combined.jar:classes2.jar:wd/a$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f43577a;

        /* renamed from: b */
        public final int f43578b;

        public a(int i10, int i11) {
            this.f43577a = i10;
            this.f43578b = i11;
        }

        /* renamed from: a */
        public int m40148a() {
            return this.f43577a;
        }

        /* renamed from: b */
        public int m40149b() {
            return this.f43578b;
        }

        /* renamed from: c */
        public C8701p m40150c() {
            return new C8701p(this.f43577a, this.f43578b);
        }

        public String toString() {
            return "<" + this.f43577a + ' ' + this.f43578b + '>';
        }
    }

    public C9569a(C10194b c10194b) {
        this.f43571a = c10194b;
    }

    /* renamed from: b */
    public static float m40130b(C8701p c8701p, C8701p c8701p2) {
        return C0156a.m675a(c8701p.m37222c(), c8701p.m37223d(), c8701p2.m37222c(), c8701p2.m37223d());
    }

    /* renamed from: c */
    public static float m40131c(a aVar, a aVar2) {
        return C0156a.m676b(aVar.m40148a(), aVar.m40149b(), aVar2.m40148a(), aVar2.m40149b());
    }

    /* renamed from: d */
    public static C8701p[] m40132d(C8701p[] c8701pArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float m37222c = c8701pArr[0].m37222c();
        float m37222c2 = c8701pArr[2].m37222c();
        float m37223d = c8701pArr[0].m37223d();
        float m37223d2 = c8701pArr[2].m37223d();
        float m37222c3 = (c8701pArr[0].m37222c() + c8701pArr[2].m37222c()) / 2.0f;
        float m37223d3 = (c8701pArr[0].m37223d() + c8701pArr[2].m37223d()) / 2.0f;
        float f11 = (m37222c - m37222c2) * f10;
        float f12 = (m37223d - m37223d2) * f10;
        C8701p c8701p = new C8701p(m37222c3 + f11, m37223d3 + f12);
        C8701p c8701p2 = new C8701p(m37222c3 - f11, m37223d3 - f12);
        float m37222c4 = c8701pArr[1].m37222c();
        float m37222c5 = c8701pArr[3].m37222c();
        float m37223d4 = c8701pArr[1].m37223d();
        float m37223d5 = c8701pArr[3].m37223d();
        float m37222c6 = (c8701pArr[1].m37222c() + c8701pArr[3].m37222c()) / 2.0f;
        float m37223d6 = (c8701pArr[1].m37223d() + c8701pArr[3].m37223d()) / 2.0f;
        float f13 = (m37222c4 - m37222c5) * f10;
        float f14 = f10 * (m37223d4 - m37223d5);
        return new C8701p[]{c8701p, new C8701p(m37222c6 + f13, m37223d6 + f14), c8701p2, new C8701p(m37222c6 - f13, m37223d6 - f14)};
    }

    /* renamed from: h */
    public static int m40133h(long j10, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int[] iArr = new int[i10];
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            iArr[i12] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new C0894c(C0892a.f6013k).m5548a(iArr, i10 - i11);
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                i13 = (i13 << 4) + iArr[i14];
            }
            return i13;
        } catch (C0895d e10) {
            throw C8695j.m37209a();
        }
    }

    /* renamed from: m */
    public static int m40134m(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (Integer.bitCount(f43570g[i13] ^ (((i11 & 1) << 11) + (i11 >> 1))) <= 2) {
                return i13;
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: a */
    public C9154a m40135a(boolean z10) {
        C8701p[] m40137f = m40137f(m40141k());
        if (z10) {
            C8701p c8701p = m40137f[0];
            m40137f[0] = m40137f[2];
            m40137f[2] = c8701p;
        }
        m40136e(m40137f);
        C10194b c10194b = this.f43571a;
        int i10 = this.f43576f;
        return new C9154a(m40146q(c10194b, m40137f[i10 % 4], m40137f[(i10 + 1) % 4], m40137f[(i10 + 2) % 4], m40137f[(i10 + 3) % 4]), m40142l(m40137f), this.f43572b, this.f43574d, this.f43573c);
    }

    /* renamed from: e */
    public final void m40136e(C8701p[] c8701pArr) {
        int i10;
        long j10;
        int i11;
        if (!m40144o(c8701pArr[0]) || !m40144o(c8701pArr[1]) || !m40144o(c8701pArr[2]) || !m40144o(c8701pArr[3])) {
            throw C8695j.m37209a();
        }
        int i12 = this.f43575e * 2;
        int[] iArr = {m40147r(c8701pArr[0], c8701pArr[1], i12), m40147r(c8701pArr[1], c8701pArr[2], i12), m40147r(c8701pArr[2], c8701pArr[3], i12), m40147r(c8701pArr[3], c8701pArr[0], i12)};
        this.f43576f = m40134m(iArr, i12);
        long j11 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = iArr[(this.f43576f + i13) % 4];
            if (this.f43572b) {
                j10 = j11 << 7;
                i11 = (i14 >> 1) & 127;
            } else {
                j10 = j11 << 10;
                i11 = ((i14 >> 2) & 992) + ((i14 >> 1) & 31);
            }
            j11 = j10 + i11;
        }
        int m40133h = m40133h(j11, this.f43572b);
        if (this.f43572b) {
            this.f43573c = (m40133h >> 6) + 1;
            i10 = m40133h & 63;
        } else {
            this.f43573c = (m40133h >> 11) + 1;
            i10 = m40133h & 2047;
        }
        this.f43574d = i10 + 1;
    }

    /* renamed from: f */
    public final C8701p[] m40137f(a aVar) {
        this.f43575e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        boolean z10 = true;
        while (this.f43575e < 9) {
            a m40140j = m40140j(aVar, z10, 1, -1);
            a m40140j2 = m40140j(aVar2, z10, 1, 1);
            a m40140j3 = m40140j(aVar3, z10, -1, 1);
            a m40140j4 = m40140j(aVar4, z10, -1, -1);
            if (this.f43575e > 2) {
                double m40131c = (m40131c(m40140j4, m40140j) * this.f43575e) / (m40131c(aVar4, aVar) * (this.f43575e + 2));
                if (m40131c < 0.75d || m40131c > 1.25d || !m40145p(m40140j, m40140j2, m40140j3, m40140j4)) {
                    break;
                }
            }
            z10 = !z10;
            this.f43575e++;
            aVar4 = m40140j4;
            aVar = m40140j;
            aVar2 = m40140j2;
            aVar3 = m40140j3;
        }
        int i10 = this.f43575e;
        if (i10 != 5 && i10 != 7) {
            throw C8695j.m37209a();
        }
        this.f43572b = i10 == 5;
        C8701p c8701p = new C8701p(aVar.m40148a() + 0.5f, aVar.m40149b() - 0.5f);
        C8701p c8701p2 = new C8701p(aVar2.m40148a() + 0.5f, aVar2.m40149b() + 0.5f);
        C8701p c8701p3 = new C8701p(aVar3.m40148a() - 0.5f, aVar3.m40149b() + 0.5f);
        C8701p c8701p4 = new C8701p(aVar4.m40148a() - 0.5f, aVar4.m40149b() - 0.5f);
        int i11 = this.f43575e;
        return m40132d(new C8701p[]{c8701p, c8701p2, c8701p3, c8701p4}, (i11 * 2) - 3, i11 * 2);
    }

    /* renamed from: g */
    public final int m40138g(a aVar, a aVar2) {
        int i10;
        float m40131c = m40131c(aVar, aVar2);
        float m40148a = (aVar2.m40148a() - aVar.m40148a()) / m40131c;
        float m40149b = (aVar2.m40149b() - aVar.m40149b()) / m40131c;
        float m40148a2 = aVar.m40148a();
        float m40149b2 = aVar.m40149b();
        boolean m42672d = this.f43571a.m42672d(aVar.m40148a(), aVar.m40149b());
        int ceil = (int) Math.ceil(m40131c);
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = i12;
            if (i11 >= ceil) {
                break;
            }
            m40148a2 += m40148a;
            m40149b2 += m40149b;
            int i13 = i10;
            if (this.f43571a.m42672d(C0156a.m677c(m40148a2), C0156a.m677c(m40149b2)) != m42672d) {
                i13 = i10 + 1;
            }
            i11++;
            i12 = i13;
        }
        float f10 = i10 / m40131c;
        if (f10 > 0.1f && f10 < 0.9f) {
            return 0;
        }
        if (f10 <= 0.1f) {
            z10 = true;
        }
        return z10 == m42672d ? 1 : -1;
    }

    /* renamed from: i */
    public final int m40139i() {
        if (this.f43572b) {
            return (this.f43573c * 4) + 11;
        }
        int i10 = this.f43573c;
        return i10 <= 4 ? (i10 * 4) + 15 : (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    public final a m40140j(a aVar, boolean z10, int i10, int i11) {
        int i12;
        int m40148a = aVar.m40148a() + i10;
        int m40149b = aVar.m40149b();
        while (true) {
            m40149b += i11;
            if (!m40143n(m40148a, m40149b) || this.f43571a.m42672d(m40148a, m40149b) != z10) {
                break;
            }
            m40148a += i10;
        }
        int i13 = m40148a - i10;
        int i14 = m40149b - i11;
        while (m40143n(i13, i14) && this.f43571a.m42672d(i13, i14) == z10) {
            i13 += i10;
        }
        int i15 = i13 - i10;
        int i16 = i14;
        while (true) {
            i12 = i16;
            if (!m40143n(i15, i12) || this.f43571a.m42672d(i15, i12) != z10) {
                break;
            }
            i16 = i12 + i11;
        }
        return new a(i15, i12 - i11);
    }

    /* renamed from: k */
    public final a m40141k() {
        C8701p m40150c;
        C8701p m40150c2;
        C8701p m40150c3;
        C8701p m40150c4;
        C8701p m40150c5;
        C8701p m40150c6;
        C8701p m40150c7;
        C8701p m40150c8;
        try {
            C8701p[] m681c = new C0157b(this.f43571a).m681c();
            m40150c = m681c[0];
            m40150c2 = m681c[1];
            m40150c3 = m681c[2];
            m40150c4 = m681c[3];
        } catch (C8695j e10) {
            int m42678k = this.f43571a.m42678k() / 2;
            int m42675h = this.f43571a.m42675h() / 2;
            int i10 = m42678k + 7;
            int i11 = m42675h - 7;
            m40150c = m40140j(new a(i10, i11), false, 1, -1).m40150c();
            int i12 = m42675h + 7;
            m40150c2 = m40140j(new a(i10, i12), false, 1, 1).m40150c();
            int i13 = m42678k - 7;
            m40150c3 = m40140j(new a(i13, i12), false, -1, 1).m40150c();
            m40150c4 = m40140j(new a(i13, i11), false, -1, -1).m40150c();
        }
        int m677c = C0156a.m677c((((m40150c.m37222c() + m40150c4.m37222c()) + m40150c2.m37222c()) + m40150c3.m37222c()) / 4.0f);
        int m677c2 = C0156a.m677c((((m40150c.m37223d() + m40150c4.m37223d()) + m40150c2.m37223d()) + m40150c3.m37223d()) / 4.0f);
        try {
            C8701p[] m681c2 = new C0157b(this.f43571a, 15, m677c, m677c2).m681c();
            m40150c5 = m681c2[0];
            m40150c6 = m681c2[1];
            m40150c7 = m681c2[2];
            m40150c8 = m681c2[3];
        } catch (C8695j e11) {
            int i14 = m677c + 7;
            int i15 = m677c2 - 7;
            m40150c5 = m40140j(new a(i14, i15), false, 1, -1).m40150c();
            int i16 = m677c2 + 7;
            m40150c6 = m40140j(new a(i14, i16), false, 1, 1).m40150c();
            int i17 = m677c - 7;
            m40150c7 = m40140j(new a(i17, i16), false, -1, 1).m40150c();
            m40150c8 = m40140j(new a(i17, i15), false, -1, -1).m40150c();
        }
        return new a(C0156a.m677c((((m40150c5.m37222c() + m40150c8.m37222c()) + m40150c6.m37222c()) + m40150c7.m37222c()) / 4.0f), C0156a.m677c((((m40150c5.m37223d() + m40150c8.m37223d()) + m40150c6.m37223d()) + m40150c7.m37223d()) / 4.0f));
    }

    /* renamed from: l */
    public final C8701p[] m40142l(C8701p[] c8701pArr) {
        return m40132d(c8701pArr, this.f43575e * 2, m40139i());
    }

    /* renamed from: n */
    public final boolean m40143n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f43571a.m42678k() && i11 > 0 && i11 < this.f43571a.m42675h();
    }

    /* renamed from: o */
    public final boolean m40144o(C8701p c8701p) {
        return m40143n(C0156a.m677c(c8701p.m37222c()), C0156a.m677c(c8701p.m37223d()));
    }

    /* renamed from: p */
    public final boolean m40145p(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.m40148a() - 3, aVar.m40149b() + 3);
        a aVar6 = new a(aVar2.m40148a() - 3, aVar2.m40149b() - 3);
        a aVar7 = new a(aVar3.m40148a() + 3, aVar3.m40149b() - 3);
        a aVar8 = new a(aVar4.m40148a() + 3, aVar4.m40149b() + 3);
        int m40138g = m40138g(aVar8, aVar5);
        return m40138g != 0 && m40138g(aVar5, aVar6) == m40138g && m40138g(aVar6, aVar7) == m40138g && m40138g(aVar7, aVar8) == m40138g;
    }

    /* renamed from: q */
    public final C10194b m40146q(C10194b c10194b, C8701p c8701p, C8701p c8701p2, C8701p c8701p3, C8701p c8701p4) {
        AbstractC10201i m42708b = AbstractC10201i.m42708b();
        int m40139i = m40139i();
        float f10 = m40139i / 2.0f;
        int i10 = this.f43575e;
        float f11 = f10 - i10;
        float f12 = f10 + i10;
        return m42708b.mo42701c(c10194b, m40139i, m40139i, f11, f11, f12, f11, f12, f12, f11, f12, c8701p.m37222c(), c8701p.m37223d(), c8701p2.m37222c(), c8701p2.m37223d(), c8701p3.m37222c(), c8701p3.m37223d(), c8701p4.m37222c(), c8701p4.m37223d());
    }

    /* renamed from: r */
    public final int m40147r(C8701p c8701p, C8701p c8701p2, int i10) {
        float m40130b = m40130b(c8701p, c8701p2);
        float f10 = m40130b / i10;
        float m37222c = c8701p.m37222c();
        float m37223d = c8701p.m37223d();
        float m37222c2 = ((c8701p2.m37222c() - c8701p.m37222c()) * f10) / m40130b;
        float m37223d2 = (f10 * (c8701p2.m37223d() - c8701p.m37223d())) / m40130b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= i10) {
                return i13;
            }
            float f11 = i11;
            int i14 = i13;
            if (this.f43571a.m42672d(C0156a.m677c((f11 * m37222c2) + m37222c), C0156a.m677c((f11 * m37223d2) + m37223d))) {
                i14 = i13 | (1 << ((i10 - i11) - 1));
            }
            i11++;
            i12 = i14;
        }
    }
}
