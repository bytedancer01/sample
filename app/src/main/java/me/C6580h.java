package me;

import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/h.class
 */
/* renamed from: me.h */
/* loaded from: combined.jar:classes2.jar:me/h.class */
public final class C6580h extends C6579g {

    /* renamed from: c */
    public final boolean f34430c;

    public C6580h(C6575c c6575c, boolean z10) {
        super(c6575c);
        this.f34430c = z10;
    }

    /* renamed from: g */
    public void m30397g(C6573a c6573a) {
        boolean z10;
        C6576d[] m30394d = m30394d();
        m30403m();
        m30402l(m30394d, c6573a);
        C6575c m30391a = m30391a();
        C8701p m30355h = this.f34430c ? m30391a.m30355h() : m30391a.m30356i();
        C8701p m30349b = this.f34430c ? m30391a.m30349b() : m30391a.m30350c();
        int m30395e = m30395e((int) m30355h.m37223d());
        int m30395e2 = m30395e((int) m30349b.m37223d());
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            int i13 = i12;
            if (m30395e >= m30395e2) {
                return;
            }
            C6576d c6576d = m30394d[m30395e];
            int i14 = i10;
            int i15 = i11;
            int i16 = i13;
            if (c6576d != null) {
                int m30359c = c6576d.m30359c() - i10;
                if (m30359c == 0) {
                    i15 = i11 + 1;
                    i14 = i10;
                    i16 = i13;
                } else {
                    if (m30359c == 1) {
                        i16 = Math.max(i13, i11);
                    } else if (m30359c < 0 || c6576d.m30359c() >= c6573a.m30342c() || m30359c > m30395e) {
                        m30394d[m30395e] = null;
                        i16 = i13;
                        i15 = i11;
                        i14 = i10;
                    } else {
                        int i17 = m30359c;
                        if (i13 > 2) {
                            i17 = m30359c * (i13 - 2);
                        }
                        boolean z11 = i17 >= m30395e;
                        int i18 = 1;
                        while (true) {
                            z10 = z11;
                            if (i18 > i17 || z10) {
                                break;
                            }
                            z11 = m30394d[m30395e - i18] != null;
                            i18++;
                        }
                        i16 = i13;
                        if (z10) {
                            m30394d[m30395e] = null;
                            i14 = i10;
                            i15 = i11;
                            i16 = i13;
                        }
                    }
                    i14 = c6576d.m30359c();
                    i15 = 1;
                }
            }
            m30395e++;
            i10 = i14;
            i11 = i15;
            i12 = i16;
        }
    }

    /* renamed from: h */
    public final void m30398h(C6573a c6573a) {
        C6575c m30391a = m30391a();
        C8701p m30355h = this.f34430c ? m30391a.m30355h() : m30391a.m30356i();
        C8701p m30349b = this.f34430c ? m30391a.m30349b() : m30391a.m30350c();
        int m30395e = m30395e((int) m30355h.m37223d());
        int m30395e2 = m30395e((int) m30349b.m37223d());
        C6576d[] m30394d = m30394d();
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            int i13 = i12;
            if (m30395e >= m30395e2) {
                return;
            }
            C6576d c6576d = m30394d[m30395e];
            int i14 = i10;
            int i15 = i11;
            int i16 = i13;
            if (c6576d != null) {
                c6576d.m30366j();
                int m30359c = c6576d.m30359c() - i10;
                if (m30359c == 0) {
                    i15 = i11 + 1;
                    i14 = i10;
                    i16 = i13;
                } else {
                    if (m30359c == 1) {
                        i16 = Math.max(i13, i11);
                    } else {
                        i16 = i13;
                        if (c6576d.m30359c() >= c6573a.m30342c()) {
                            m30394d[m30395e] = null;
                            i16 = i13;
                            i15 = i11;
                            i14 = i10;
                        }
                    }
                    i14 = c6576d.m30359c();
                    i15 = 1;
                }
            }
            m30395e++;
            i10 = i14;
            i11 = i15;
            i12 = i16;
        }
    }

    /* renamed from: i */
    public C6573a m30399i() {
        C6576d[] m30394d = m30394d();
        C6574b c6574b = new C6574b();
        C6574b c6574b2 = new C6574b();
        C6574b c6574b3 = new C6574b();
        C6574b c6574b4 = new C6574b();
        for (C6576d c6576d : m30394d) {
            if (c6576d != null) {
                c6576d.m30366j();
                int m30361e = c6576d.m30361e() % 30;
                int m30359c = c6576d.m30359c();
                int i10 = m30359c;
                if (!this.f34430c) {
                    i10 = m30359c + 2;
                }
                int i11 = i10 % 3;
                if (i11 == 0) {
                    c6574b2.m30346b((m30361e * 3) + 1);
                } else if (i11 == 1) {
                    c6574b4.m30346b(m30361e / 3);
                    c6574b3.m30346b(m30361e % 3);
                } else if (i11 == 2) {
                    c6574b.m30346b(m30361e + 1);
                }
            }
        }
        if (c6574b.m30345a().length == 0 || c6574b2.m30345a().length == 0 || c6574b3.m30345a().length == 0 || c6574b4.m30345a().length == 0 || c6574b.m30345a()[0] <= 0 || c6574b2.m30345a()[0] + c6574b3.m30345a()[0] < 3 || c6574b2.m30345a()[0] + c6574b3.m30345a()[0] > 90) {
            return null;
        }
        C6573a c6573a = new C6573a(c6574b.m30345a()[0], c6574b2.m30345a()[0], c6574b3.m30345a()[0], c6574b4.m30345a()[0]);
        m30402l(m30394d, c6573a);
        return c6573a;
    }

    /* renamed from: j */
    public int[] m30400j() {
        int m30359c;
        C6573a m30399i = m30399i();
        if (m30399i == null) {
            return null;
        }
        m30398h(m30399i);
        int m30342c = m30399i.m30342c();
        int[] iArr = new int[m30342c];
        for (C6576d c6576d : m30394d()) {
            if (c6576d != null && (m30359c = c6576d.m30359c()) < m30342c) {
                iArr[m30359c] = iArr[m30359c] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean m30401k() {
        return this.f34430c;
    }

    /* renamed from: l */
    public final void m30402l(C6576d[] c6576dArr, C6573a c6573a) {
        for (int i10 = 0; i10 < c6576dArr.length; i10++) {
            C6576d c6576d = c6576dArr[i10];
            if (c6576d != null) {
                int m30361e = c6576d.m30361e() % 30;
                int m30359c = c6576d.m30359c();
                if (m30359c > c6573a.m30342c()) {
                    c6576dArr[i10] = null;
                } else {
                    int i11 = m30359c;
                    if (!this.f34430c) {
                        i11 = m30359c + 2;
                    }
                    int i12 = i11 % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2 && m30361e + 1 != c6573a.m30340a()) {
                                c6576dArr[i10] = null;
                            }
                        } else if (m30361e / 3 != c6573a.m30341b() || m30361e % 3 != c6573a.m30343d()) {
                            c6576dArr[i10] = null;
                        }
                    } else if ((m30361e * 3) + 1 != c6573a.m30344e()) {
                        c6576dArr[i10] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void m30403m() {
        for (C6576d c6576d : m30394d()) {
            if (c6576d != null) {
                c6576d.m30366j();
            }
        }
    }

    @Override // me.C6579g
    public String toString() {
        return "IsLeft: " + this.f34430c + '\n' + super.toString();
    }
}
