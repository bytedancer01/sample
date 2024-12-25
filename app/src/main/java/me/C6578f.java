package me;

import java.util.Formatter;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/f.class
 */
/* renamed from: me.f */
/* loaded from: combined.jar:classes2.jar:me/f.class */
public final class C6578f {

    /* renamed from: a */
    public final C6573a f34424a;

    /* renamed from: b */
    public final C6579g[] f34425b;

    /* renamed from: c */
    public C6575c f34426c;

    /* renamed from: d */
    public final int f34427d;

    public C6578f(C6573a c6573a, C6575c c6575c) {
        this.f34424a = c6573a;
        int m30340a = c6573a.m30340a();
        this.f34427d = m30340a;
        this.f34426c = c6575c;
        this.f34425b = new C6579g[m30340a + 2];
    }

    /* renamed from: b */
    public static boolean m30374b(C6576d c6576d, C6576d c6576d2) {
        if (c6576d2 == null || !c6576d2.m30363g() || c6576d2.m30357a() != c6576d.m30357a()) {
            return false;
        }
        c6576d.m30365i(c6576d2.m30359c());
        return true;
    }

    /* renamed from: c */
    public static int m30375c(int i10, int i11, C6576d c6576d) {
        if (c6576d == null) {
            return i11;
        }
        int i12 = i11;
        if (!c6576d.m30363g()) {
            if (c6576d.m30364h(i10)) {
                c6576d.m30365i(i10);
                i12 = 0;
            } else {
                i12 = i11 + 1;
            }
        }
        return i12;
    }

    /* renamed from: a */
    public final void m30376a(C6579g c6579g) {
        if (c6579g != null) {
            ((C6580h) c6579g).m30397g(this.f34424a);
        }
    }

    /* renamed from: d */
    public final int m30377d() {
        int m30379f = m30379f();
        if (m30379f == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f34427d + 1; i10++) {
            C6576d[] m30394d = this.f34425b[i10].m30394d();
            for (int i11 = 0; i11 < m30394d.length; i11++) {
                C6576d c6576d = m30394d[i11];
                if (c6576d != null && !c6576d.m30363g()) {
                    m30378e(i10, i11, m30394d);
                }
            }
        }
        return m30379f;
    }

    /* renamed from: e */
    public final void m30378e(int i10, int i11, C6576d[] c6576dArr) {
        C6576d c6576d = c6576dArr[i11];
        C6576d[] m30394d = this.f34425b[i10 - 1].m30394d();
        C6579g c6579g = this.f34425b[i10 + 1];
        C6576d[] m30394d2 = c6579g != null ? c6579g.m30394d() : m30394d;
        C6576d[] c6576dArr2 = new C6576d[14];
        c6576dArr2[2] = m30394d[i11];
        c6576dArr2[3] = m30394d2[i11];
        if (i11 > 0) {
            int i12 = i11 - 1;
            c6576dArr2[0] = c6576dArr[i12];
            c6576dArr2[4] = m30394d[i12];
            c6576dArr2[5] = m30394d2[i12];
        }
        if (i11 > 1) {
            int i13 = i11 - 2;
            c6576dArr2[8] = c6576dArr[i13];
            c6576dArr2[10] = m30394d[i13];
            c6576dArr2[11] = m30394d2[i13];
        }
        if (i11 < c6576dArr.length - 1) {
            int i14 = i11 + 1;
            c6576dArr2[1] = c6576dArr[i14];
            c6576dArr2[6] = m30394d[i14];
            c6576dArr2[7] = m30394d2[i14];
        }
        int i15 = 0;
        if (i11 < c6576dArr.length - 2) {
            int i16 = i11 + 2;
            c6576dArr2[9] = c6576dArr[i16];
            c6576dArr2[12] = m30394d[i16];
            c6576dArr2[13] = m30394d2[i16];
            i15 = 0;
        }
        while (i15 < 14 && !m30374b(c6576d, c6576dArr2[i15])) {
            i15++;
        }
    }

    /* renamed from: f */
    public final int m30379f() {
        m30380g();
        return m30381h() + m30382i();
    }

    /* renamed from: g */
    public final void m30380g() {
        C6579g[] c6579gArr = this.f34425b;
        C6579g c6579g = c6579gArr[0];
        if (c6579g == null || c6579gArr[this.f34427d + 1] == null) {
            return;
        }
        C6576d[] m30394d = c6579g.m30394d();
        C6576d[] m30394d2 = this.f34425b[this.f34427d + 1].m30394d();
        for (int i10 = 0; i10 < m30394d.length; i10++) {
            C6576d c6576d = m30394d[i10];
            if (c6576d != null && m30394d2[i10] != null && c6576d.m30359c() == m30394d2[i10].m30359c()) {
                for (int i11 = 1; i11 <= this.f34427d; i11++) {
                    C6576d c6576d2 = this.f34425b[i11].m30394d()[i10];
                    if (c6576d2 != null) {
                        c6576d2.m30365i(m30394d[i10].m30359c());
                        if (!c6576d2.m30363g()) {
                            this.f34425b[i11].m30394d()[i10] = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int m30381h() {
        C6579g c6579g = this.f34425b[0];
        if (c6579g == null) {
            return 0;
        }
        C6576d[] m30394d = c6579g.m30394d();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= m30394d.length) {
                return i12;
            }
            C6576d c6576d = m30394d[i10];
            int i13 = i12;
            if (c6576d != null) {
                int m30359c = c6576d.m30359c();
                int i14 = 1;
                int i15 = 0;
                while (true) {
                    int i16 = i15;
                    i13 = i12;
                    if (i14 < this.f34427d + 1) {
                        i13 = i12;
                        if (i16 < 2) {
                            C6576d c6576d2 = this.f34425b[i14].m30394d()[i10];
                            int i17 = i12;
                            int i18 = i16;
                            if (c6576d2 != null) {
                                int m30375c = m30375c(m30359c, i16, c6576d2);
                                i17 = i12;
                                i18 = m30375c;
                                if (!c6576d2.m30363g()) {
                                    i17 = i12 + 1;
                                    i18 = m30375c;
                                }
                            }
                            i14++;
                            i12 = i17;
                            i15 = i18;
                        }
                    }
                }
            }
            i10++;
            i11 = i13;
        }
    }

    /* renamed from: i */
    public final int m30382i() {
        C6579g[] c6579gArr = this.f34425b;
        int i10 = this.f34427d;
        if (c6579gArr[i10 + 1] == null) {
            return 0;
        }
        C6576d[] m30394d = c6579gArr[i10 + 1].m30394d();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= m30394d.length) {
                return i13;
            }
            C6576d c6576d = m30394d[i11];
            int i14 = i13;
            if (c6576d != null) {
                int m30359c = c6576d.m30359c();
                int i15 = this.f34427d + 1;
                int i16 = 0;
                while (true) {
                    int i17 = i16;
                    i14 = i13;
                    if (i15 > 0) {
                        i14 = i13;
                        if (i17 < 2) {
                            C6576d c6576d2 = this.f34425b[i15].m30394d()[i11];
                            int i18 = i13;
                            int i19 = i17;
                            if (c6576d2 != null) {
                                int m30375c = m30375c(m30359c, i17, c6576d2);
                                i18 = i13;
                                i19 = m30375c;
                                if (!c6576d2.m30363g()) {
                                    i18 = i13 + 1;
                                    i19 = m30375c;
                                }
                            }
                            i15--;
                            i13 = i18;
                            i16 = i19;
                        }
                    }
                }
            }
            i11++;
            i12 = i14;
        }
    }

    /* renamed from: j */
    public int m30383j() {
        return this.f34427d;
    }

    /* renamed from: k */
    public int m30384k() {
        return this.f34424a.m30341b();
    }

    /* renamed from: l */
    public int m30385l() {
        return this.f34424a.m30342c();
    }

    /* renamed from: m */
    public C6575c m30386m() {
        return this.f34426c;
    }

    /* renamed from: n */
    public C6579g m30387n(int i10) {
        return this.f34425b[i10];
    }

    /* renamed from: o */
    public C6579g[] m30388o() {
        m30376a(this.f34425b[0]);
        m30376a(this.f34425b[this.f34427d + 1]);
        int i10 = 928;
        while (true) {
            int i11 = i10;
            int m30377d = m30377d();
            if (m30377d <= 0 || m30377d >= i11) {
                break;
            }
            i10 = m30377d;
        }
        return this.f34425b;
    }

    /* renamed from: p */
    public void m30389p(C6575c c6575c) {
        this.f34426c = c6575c;
    }

    /* renamed from: q */
    public void m30390q(int i10, C6579g c6579g) {
        this.f34425b[i10] = c6579g;
    }

    public String toString() {
        C6579g[] c6579gArr = this.f34425b;
        C6579g c6579g = c6579gArr[0];
        C6579g c6579g2 = c6579g;
        if (c6579g == null) {
            c6579g2 = c6579gArr[this.f34427d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < c6579g2.m30394d().length; i10++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i10));
                for (int i11 = 0; i11 < this.f34427d + 2; i11++) {
                    C6579g c6579g3 = this.f34425b[i11];
                    if (c6579g3 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C6576d c6576d = c6579g3.m30394d()[i10];
                        if (c6576d == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c6576d.m30359c()), Integer.valueOf(c6576d.m30361e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
