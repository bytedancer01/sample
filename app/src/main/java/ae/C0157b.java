package ae;

import p444zd.C10194b;
import td.C8695j;
import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ae/b.class
 */
/* renamed from: ae.b */
/* loaded from: combined.jar:classes2.jar:ae/b.class */
public final class C0157b {

    /* renamed from: a */
    public final C10194b f1256a;

    /* renamed from: b */
    public final int f1257b;

    /* renamed from: c */
    public final int f1258c;

    /* renamed from: d */
    public final int f1259d;

    /* renamed from: e */
    public final int f1260e;

    /* renamed from: f */
    public final int f1261f;

    /* renamed from: g */
    public final int f1262g;

    public C0157b(C10194b c10194b) {
        this(c10194b, 10, c10194b.m42678k() / 2, c10194b.m42675h() / 2);
    }

    public C0157b(C10194b c10194b, int i10, int i11, int i12) {
        this.f1256a = c10194b;
        int m42675h = c10194b.m42675h();
        this.f1257b = m42675h;
        int m42678k = c10194b.m42678k();
        this.f1258c = m42678k;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f1259d = i14;
        int i15 = i11 + i13;
        this.f1260e = i15;
        int i16 = i12 - i13;
        this.f1262g = i16;
        int i17 = i12 + i13;
        this.f1261f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= m42675h || i15 >= m42678k) {
            throw C8695j.m37209a();
        }
    }

    /* renamed from: a */
    public final C8701p[] m679a(C8701p c8701p, C8701p c8701p2, C8701p c8701p3, C8701p c8701p4) {
        float m37222c = c8701p.m37222c();
        float m37223d = c8701p.m37223d();
        float m37222c2 = c8701p2.m37222c();
        float m37223d2 = c8701p2.m37223d();
        float m37222c3 = c8701p3.m37222c();
        float m37223d3 = c8701p3.m37223d();
        float m37222c4 = c8701p4.m37222c();
        float m37223d4 = c8701p4.m37223d();
        return m37222c < ((float) this.f1258c) / 2.0f ? new C8701p[]{new C8701p(m37222c4 - 1.0f, m37223d4 + 1.0f), new C8701p(m37222c2 + 1.0f, m37223d2 + 1.0f), new C8701p(m37222c3 - 1.0f, m37223d3 - 1.0f), new C8701p(m37222c + 1.0f, m37223d - 1.0f)} : new C8701p[]{new C8701p(m37222c4 + 1.0f, m37223d4 + 1.0f), new C8701p(m37222c2 + 1.0f, m37223d2 - 1.0f), new C8701p(m37222c3 - 1.0f, m37223d3 + 1.0f), new C8701p(m37222c - 1.0f, m37223d - 1.0f)};
    }

    /* renamed from: b */
    public final boolean m680b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f1256a.m42672d(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        for (int i13 = i10; i13 <= i11; i13++) {
            if (this.f1256a.m42672d(i12, i13)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C8701p[] m681c() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14 = this.f1259d;
        int i15 = this.f1260e;
        int i16 = this.f1262g;
        int i17 = this.f1261f;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            i10 = i14;
            i11 = i15;
            i12 = i16;
            i13 = i17;
            z10 = false;
            if (!z11) {
                break;
            }
            boolean z16 = true;
            boolean z17 = false;
            i11 = i15;
            while (true) {
                if ((z16 || !z12) && i11 < this.f1258c) {
                    boolean m680b = m680b(i16, i17, i11, false);
                    if (m680b) {
                        i11++;
                        z12 = true;
                        z17 = true;
                        z16 = m680b;
                    } else {
                        z16 = m680b;
                        if (!z12) {
                            i11++;
                            z16 = m680b;
                        }
                    }
                }
            }
            if (i11 >= this.f1258c) {
                break;
            }
            boolean z18 = true;
            int i18 = i17;
            while (true) {
                if ((z18 || !z13) && i18 < this.f1257b) {
                    boolean m680b2 = m680b(i14, i11, i18, true);
                    if (m680b2) {
                        i18++;
                        z13 = true;
                        z17 = true;
                        z18 = m680b2;
                    } else {
                        z18 = m680b2;
                        if (!z13) {
                            i18++;
                            z18 = m680b2;
                        }
                    }
                }
            }
            if (i18 >= this.f1257b) {
                i17 = i18;
                break;
            }
            boolean z19 = true;
            boolean z20 = z17;
            int i19 = i14;
            while (true) {
                if ((z19 || !z14) && i19 >= 0) {
                    boolean m680b3 = m680b(i16, i18, i19, false);
                    if (m680b3) {
                        i19--;
                        z14 = true;
                        z20 = true;
                        z19 = m680b3;
                    } else {
                        z19 = m680b3;
                        if (!z14) {
                            i19--;
                            z19 = m680b3;
                        }
                    }
                }
            }
            if (i19 < 0) {
                i14 = i19;
                i17 = i18;
                break;
            }
            boolean z21 = true;
            boolean z22 = z15;
            boolean z23 = z20;
            int i20 = i16;
            while (true) {
                if ((z21 || !z22) && i20 >= 0) {
                    boolean m680b4 = m680b(i19, i11, i20, true);
                    if (m680b4) {
                        i20--;
                        z23 = true;
                        z22 = true;
                        z21 = m680b4;
                    } else {
                        z21 = m680b4;
                        if (!z22) {
                            i20--;
                            z21 = m680b4;
                        }
                    }
                }
            }
            i14 = i19;
            i15 = i11;
            i16 = i20;
            i17 = i18;
            z11 = z23;
            z15 = z22;
            if (i20 < 0) {
                i14 = i19;
                i16 = i20;
                i17 = i18;
                break;
            }
        }
        z10 = true;
        i10 = i14;
        i12 = i16;
        i13 = i17;
        if (z10) {
            throw C8695j.m37209a();
        }
        int i21 = i11 - i10;
        C8701p c8701p = null;
        C8701p c8701p2 = null;
        for (int i22 = 1; c8701p2 == null && i22 < i21; i22++) {
            c8701p2 = m682d(i10, i13 - i22, i10 + i22, i13);
        }
        if (c8701p2 == null) {
            throw C8695j.m37209a();
        }
        C8701p c8701p3 = null;
        for (int i23 = 1; c8701p3 == null && i23 < i21; i23++) {
            c8701p3 = m682d(i10, i12 + i23, i10 + i23, i12);
        }
        if (c8701p3 == null) {
            throw C8695j.m37209a();
        }
        C8701p c8701p4 = null;
        for (int i24 = 1; c8701p4 == null && i24 < i21; i24++) {
            c8701p4 = m682d(i11, i12 + i24, i11 - i24, i12);
        }
        if (c8701p4 == null) {
            throw C8695j.m37209a();
        }
        for (int i25 = 1; c8701p == null && i25 < i21; i25++) {
            c8701p = m682d(i11, i13 - i25, i11 - i25, i13);
        }
        if (c8701p != null) {
            return m679a(c8701p, c8701p2, c8701p4, c8701p3);
        }
        throw C8695j.m37209a();
    }

    /* renamed from: d */
    public final C8701p m682d(float f10, float f11, float f12, float f13) {
        int m677c = C0156a.m677c(C0156a.m675a(f10, f11, f12, f13));
        float f14 = m677c;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < m677c; i10++) {
            float f17 = i10;
            int m677c2 = C0156a.m677c((f17 * f15) + f10);
            int m677c3 = C0156a.m677c((f17 * f16) + f11);
            if (this.f1256a.m42672d(m677c2, m677c3)) {
                return new C8701p(m677c2, m677c3);
            }
        }
        return null;
    }
}
