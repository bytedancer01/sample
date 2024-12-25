package ee;

import ae.C0157b;
import p444zd.AbstractC10201i;
import p444zd.C10194b;
import p444zd.C10199g;
import td.C8695j;
import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ee/a.class
 */
/* renamed from: ee.a */
/* loaded from: combined.jar:classes2.jar:ee/a.class */
public final class C4717a {

    /* renamed from: a */
    public final C10194b f27757a;

    /* renamed from: b */
    public final C0157b f27758b;

    public C4717a(C10194b c10194b) {
        this.f27757a = c10194b;
        this.f27758b = new C0157b(c10194b);
    }

    /* renamed from: f */
    public static C8701p m23731f(C8701p c8701p, float f10, float f11) {
        float m37222c = c8701p.m37222c();
        float m37223d = c8701p.m37223d();
        return new C8701p(m37222c < f10 ? m37222c - 1.0f : m37222c + 1.0f, m37223d < f11 ? m37223d - 1.0f : m37223d + 1.0f);
    }

    /* renamed from: g */
    public static C10194b m23732g(C10194b c10194b, C8701p c8701p, C8701p c8701p2, C8701p c8701p3, C8701p c8701p4, int i10, int i11) {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return AbstractC10201i.m42708b().mo42701c(c10194b, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, c8701p.m37222c(), c8701p.m37223d(), c8701p4.m37222c(), c8701p4.m37223d(), c8701p3.m37222c(), c8701p3.m37223d(), c8701p2.m37222c(), c8701p2.m37223d());
    }

    /* renamed from: h */
    public static C8701p m23733h(C8701p c8701p, C8701p c8701p2, int i10) {
        float f10 = i10 + 1;
        return new C8701p(c8701p.m37222c() + ((c8701p2.m37222c() - c8701p.m37222c()) / f10), c8701p.m37223d() + ((c8701p2.m37223d() - c8701p.m37223d()) / f10));
    }

    /* renamed from: a */
    public final C8701p m23734a(C8701p[] c8701pArr) {
        C8701p c8701p = c8701pArr[0];
        C8701p c8701p2 = c8701pArr[1];
        C8701p c8701p3 = c8701pArr[2];
        C8701p c8701p4 = c8701pArr[3];
        int m23740j = m23740j(c8701p, c8701p4);
        C8701p m23733h = m23733h(c8701p, c8701p2, (m23740j(c8701p2, c8701p4) + 1) << 2);
        C8701p m23733h2 = m23733h(c8701p3, c8701p2, (m23740j + 1) << 2);
        int m23740j2 = m23740j(m23733h, c8701p4);
        int m23740j3 = m23740j(m23733h2, c8701p4);
        float m37222c = c8701p4.m37222c();
        float m37222c2 = c8701p3.m37222c();
        float m37222c3 = c8701p2.m37222c();
        float f10 = m23740j2 + 1;
        C8701p c8701p5 = new C8701p(m37222c + ((m37222c2 - m37222c3) / f10), c8701p4.m37223d() + ((c8701p3.m37223d() - c8701p2.m37223d()) / f10));
        float m37222c4 = c8701p4.m37222c();
        float m37222c5 = c8701p.m37222c();
        float m37222c6 = c8701p2.m37222c();
        float f11 = m23740j3 + 1;
        C8701p c8701p6 = new C8701p(m37222c4 + ((m37222c5 - m37222c6) / f11), c8701p4.m37223d() + ((c8701p.m37223d() - c8701p2.m37223d()) / f11));
        if (!m23738e(c8701p5)) {
            if (m23738e(c8701p6)) {
                return c8701p6;
            }
            return null;
        }
        if (m23738e(c8701p6) && m23740j(m23733h, c8701p5) + m23740j(m23733h2, c8701p5) <= m23740j(m23733h, c8701p6) + m23740j(m23733h2, c8701p6)) {
            return c8701p6;
        }
        return c8701p5;
    }

    /* renamed from: b */
    public C10199g m23735b() {
        C8701p[] m23737d = m23737d(m23736c(this.f27758b.m681c()));
        C8701p m23734a = m23734a(m23737d);
        m23737d[3] = m23734a;
        if (m23734a == null) {
            throw C8695j.m37209a();
        }
        C8701p[] m23739i = m23739i(m23737d);
        C8701p c8701p = m23739i[0];
        C8701p c8701p2 = m23739i[1];
        C8701p c8701p3 = m23739i[2];
        C8701p c8701p4 = m23739i[3];
        int m23740j = m23740j(c8701p, c8701p4) + 1;
        int m23740j2 = m23740j(c8701p3, c8701p4) + 1;
        int i10 = m23740j;
        if ((m23740j & 1) == 1) {
            i10 = m23740j + 1;
        }
        int i11 = m23740j2;
        if ((m23740j2 & 1) == 1) {
            i11 = m23740j2 + 1;
        }
        if (i10 * 4 < i11 * 7 && i11 * 4 < i10 * 7) {
            i10 = Math.max(i10, i11);
            i11 = i10;
        }
        return new C10199g(m23732g(this.f27757a, c8701p, c8701p2, c8701p3, c8701p4, i10, i11), new C8701p[]{c8701p, c8701p2, c8701p3, c8701p4});
    }

    /* renamed from: c */
    public final C8701p[] m23736c(C8701p[] c8701pArr) {
        C8701p c8701p = c8701pArr[0];
        C8701p c8701p2 = c8701pArr[1];
        C8701p c8701p3 = c8701pArr[3];
        C8701p c8701p4 = c8701pArr[2];
        int m23740j = m23740j(c8701p, c8701p2);
        int m23740j2 = m23740j(c8701p2, c8701p3);
        int m23740j3 = m23740j(c8701p3, c8701p4);
        int m23740j4 = m23740j(c8701p4, c8701p);
        C8701p[] c8701pArr2 = {c8701p4, c8701p, c8701p2, c8701p3};
        int i10 = m23740j;
        if (m23740j > m23740j2) {
            c8701pArr2[0] = c8701p;
            c8701pArr2[1] = c8701p2;
            c8701pArr2[2] = c8701p3;
            c8701pArr2[3] = c8701p4;
            i10 = m23740j2;
        }
        if (i10 > m23740j3) {
            c8701pArr2[0] = c8701p2;
            c8701pArr2[1] = c8701p3;
            c8701pArr2[2] = c8701p4;
            c8701pArr2[3] = c8701p;
            i10 = m23740j3;
        }
        if (i10 > m23740j4) {
            c8701pArr2[0] = c8701p3;
            c8701pArr2[1] = c8701p4;
            c8701pArr2[2] = c8701p;
            c8701pArr2[3] = c8701p2;
        }
        return c8701pArr2;
    }

    /* renamed from: d */
    public final C8701p[] m23737d(C8701p[] c8701pArr) {
        C8701p c8701p = c8701pArr[0];
        C8701p c8701p2 = c8701pArr[1];
        C8701p c8701p3 = c8701pArr[2];
        C8701p c8701p4 = c8701pArr[3];
        int m23740j = (m23740j(c8701p, c8701p4) + 1) << 2;
        if (m23740j(m23733h(c8701p2, c8701p3, m23740j), c8701p) < m23740j(m23733h(c8701p3, c8701p2, m23740j), c8701p4)) {
            c8701pArr[0] = c8701p;
            c8701pArr[1] = c8701p2;
            c8701pArr[2] = c8701p3;
            c8701pArr[3] = c8701p4;
        } else {
            c8701pArr[0] = c8701p2;
            c8701pArr[1] = c8701p3;
            c8701pArr[2] = c8701p4;
            c8701pArr[3] = c8701p;
        }
        return c8701pArr;
    }

    /* renamed from: e */
    public final boolean m23738e(C8701p c8701p) {
        return c8701p.m37222c() >= 0.0f && c8701p.m37222c() < ((float) this.f27757a.m42678k()) && c8701p.m37223d() > 0.0f && c8701p.m37223d() < ((float) this.f27757a.m42675h());
    }

    /* renamed from: i */
    public final C8701p[] m23739i(C8701p[] c8701pArr) {
        C8701p c8701p = c8701pArr[0];
        C8701p c8701p2 = c8701pArr[1];
        C8701p c8701p3 = c8701pArr[2];
        C8701p c8701p4 = c8701pArr[3];
        int m23740j = m23740j(c8701p, c8701p4);
        C8701p m23733h = m23733h(c8701p, c8701p2, (m23740j(c8701p3, c8701p4) + 1) << 2);
        C8701p m23733h2 = m23733h(c8701p3, c8701p2, (m23740j + 1) << 2);
        int m23740j2 = m23740j(m23733h, c8701p4) + 1;
        int m23740j3 = m23740j(m23733h2, c8701p4) + 1;
        int i10 = m23740j2;
        if ((m23740j2 & 1) == 1) {
            i10 = m23740j2 + 1;
        }
        int i11 = m23740j3;
        if ((m23740j3 & 1) == 1) {
            i11 = m23740j3 + 1;
        }
        float m37222c = (((c8701p.m37222c() + c8701p2.m37222c()) + c8701p3.m37222c()) + c8701p4.m37222c()) / 4.0f;
        float m37223d = (((c8701p.m37223d() + c8701p2.m37223d()) + c8701p3.m37223d()) + c8701p4.m37223d()) / 4.0f;
        C8701p m23731f = m23731f(c8701p, m37222c, m37223d);
        C8701p m23731f2 = m23731f(c8701p2, m37222c, m37223d);
        C8701p m23731f3 = m23731f(c8701p3, m37222c, m37223d);
        C8701p m23731f4 = m23731f(c8701p4, m37222c, m37223d);
        int i12 = i11 << 2;
        C8701p m23733h3 = m23733h(m23731f, m23731f2, i12);
        int i13 = i10 << 2;
        return new C8701p[]{m23733h(m23733h3, m23731f4, i13), m23733h(m23733h(m23731f2, m23731f, i12), m23731f3, i13), m23733h(m23733h(m23731f3, m23731f4, i12), m23731f2, i13), m23733h(m23733h(m23731f4, m23731f3, i12), m23731f, i13)};
    }

    /* renamed from: j */
    public final int m23740j(C8701p c8701p, C8701p c8701p2) {
        int i10;
        int m37222c = (int) c8701p.m37222c();
        int m37223d = (int) c8701p.m37223d();
        int m37222c2 = (int) c8701p2.m37222c();
        int m37223d2 = (int) c8701p2.m37223d();
        int i11 = 1;
        boolean z10 = Math.abs(m37223d2 - m37223d) > Math.abs(m37222c2 - m37222c);
        int i12 = m37222c;
        int i13 = m37223d;
        int i14 = m37222c2;
        int i15 = m37223d2;
        if (z10) {
            i13 = m37222c;
            i12 = m37223d;
            i15 = m37222c2;
            i14 = m37223d2;
        }
        int abs = Math.abs(i14 - i12);
        int abs2 = Math.abs(i15 - i13);
        int i16 = (-abs) / 2;
        int i17 = i13 < i15 ? 1 : -1;
        if (i12 >= i14) {
            i11 = -1;
        }
        boolean m42672d = this.f27757a.m42672d(z10 ? i13 : i12, z10 ? i12 : i13);
        int i18 = 0;
        while (true) {
            i10 = i18;
            if (i12 == i14) {
                break;
            }
            boolean m42672d2 = this.f27757a.m42672d(z10 ? i13 : i12, z10 ? i12 : i13);
            int i19 = i18;
            boolean z11 = m42672d;
            if (m42672d2 != m42672d) {
                i19 = i18 + 1;
                z11 = m42672d2;
            }
            int i20 = i16 + abs2;
            int i21 = i13;
            i16 = i20;
            if (i20 > 0) {
                i10 = i19;
                if (i13 == i15) {
                    break;
                }
                i21 = i13 + i17;
                i16 = i20 - abs;
            }
            i12 += i11;
            i13 = i21;
            i18 = i19;
            m42672d = z11;
        }
        return i10;
    }
}
