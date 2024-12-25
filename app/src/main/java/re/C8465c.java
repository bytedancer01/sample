package re;

import ae.C0156a;
import java.util.Map;
import p289qe.C7919j;
import p444zd.AbstractC10201i;
import p444zd.C10194b;
import p444zd.C10199g;
import p444zd.C10203k;
import td.C8695j;
import td.C8701p;
import td.EnumC8690e;
import td.InterfaceC8702q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:re/c.class
 */
/* renamed from: re.c */
/* loaded from: combined.jar:classes2.jar:re/c.class */
public class C8465c {

    /* renamed from: a */
    public final C10194b f39565a;

    /* renamed from: b */
    public InterfaceC8702q f39566b;

    public C8465c(C10194b c10194b) {
        this.f39565a = c10194b;
    }

    /* renamed from: c */
    public static int m36360c(C8701p c8701p, C8701p c8701p2, C8701p c8701p3, float f10) {
        int m677c = ((C0156a.m677c(C8701p.m37220b(c8701p, c8701p2) / f10) + C0156a.m677c(C8701p.m37220b(c8701p, c8701p3) / f10)) / 2) + 7;
        int i10 = m677c & 3;
        if (i10 == 0) {
            m677c++;
        } else if (i10 == 2) {
            m677c--;
        } else if (i10 == 3) {
            throw C8695j.m37209a();
        }
        return m677c;
    }

    /* renamed from: d */
    public static C10203k m36361d(C8701p c8701p, C8701p c8701p2, C8701p c8701p3, C8701p c8701p4, int i10) {
        float m37222c;
        float m37223d;
        float f10;
        float f11 = i10 - 3.5f;
        if (c8701p4 != null) {
            m37222c = c8701p4.m37222c();
            m37223d = c8701p4.m37223d();
            f10 = f11 - 3.0f;
        } else {
            float m37222c2 = c8701p2.m37222c();
            float m37222c3 = c8701p.m37222c();
            m37222c = (m37222c2 - m37222c3) + c8701p3.m37222c();
            m37223d = (c8701p2.m37223d() - c8701p.m37223d()) + c8701p3.m37223d();
            f10 = f11;
        }
        return C10203k.m42713b(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, c8701p.m37222c(), c8701p.m37223d(), c8701p2.m37222c(), c8701p2.m37223d(), m37222c, m37223d, c8701p3.m37222c(), c8701p3.m37223d());
    }

    /* renamed from: h */
    public static C10194b m36362h(C10194b c10194b, C10203k c10203k, int i10) {
        return AbstractC10201i.m42708b().mo42702d(c10194b, i10, i10, c10203k);
    }

    /* renamed from: a */
    public final float m36363a(C8701p c8701p, C8701p c8701p2, C8701p c8701p3) {
        return (m36364b(c8701p, c8701p2) + m36364b(c8701p, c8701p3)) / 2.0f;
    }

    /* renamed from: b */
    public final float m36364b(C8701p c8701p, C8701p c8701p2) {
        float m36369j = m36369j((int) c8701p.m37222c(), (int) c8701p.m37223d(), (int) c8701p2.m37222c(), (int) c8701p2.m37223d());
        float m36369j2 = m36369j((int) c8701p2.m37222c(), (int) c8701p2.m37223d(), (int) c8701p.m37222c(), (int) c8701p.m37223d());
        return Float.isNaN(m36369j) ? m36369j2 / 7.0f : Float.isNaN(m36369j2) ? m36369j / 7.0f : (m36369j + m36369j2) / 14.0f;
    }

    /* renamed from: e */
    public final C10199g m36365e(Map<EnumC8690e, ?> map) {
        this.f39566b = map == null ? null : (InterfaceC8702q) map.get(EnumC8690e.NEED_RESULT_POINT_CALLBACK);
        return m36367g(new C8468f(this.f39565a, this.f39566b).m36384g(map));
    }

    /* renamed from: f */
    public final C8463a m36366f(float f10, int i10, int i11, float f11) {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f39565a.m42678k() - 1, i10 + i12) - max;
        float f12 = min;
        float f13 = 3.0f * f10;
        if (f12 < f13) {
            throw C8695j.m37209a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(this.f39565a.m42675h() - 1, i11 + i12) - max2;
        if (min2 >= f13) {
            return new C8464b(this.f39565a, max, max2, min, min2, f10, this.f39566b).m36357c();
        }
        throw C8695j.m37209a();
    }

    /* renamed from: g */
    public final C10199g m36367g(C8469g c8469g) {
        C8466d m36392b = c8469g.m36392b();
        C8466d m36393c = c8469g.m36393c();
        C8466d m36391a = c8469g.m36391a();
        float m36363a = m36363a(m36392b, m36393c, m36391a);
        if (m36363a < 1.0f) {
            throw C8695j.m37209a();
        }
        int m36360c = m36360c(m36392b, m36393c, m36391a, m36363a);
        C7919j m34289g = C7919j.m34289g(m36360c);
        int m34293e = m34289g.m34293e();
        C8463a c8463a = null;
        if (m34289g.m34292d().length > 0) {
            float m37222c = m36393c.m37222c();
            float m37222c2 = m36392b.m37222c();
            float m37222c3 = m36391a.m37222c();
            float m37223d = m36393c.m37223d();
            float m37223d2 = m36392b.m37223d();
            float m37223d3 = m36391a.m37223d();
            float f10 = 1.0f - (3.0f / (m34293e - 7));
            int m37222c4 = (int) (m36392b.m37222c() + ((((m37222c - m37222c2) + m37222c3) - m36392b.m37222c()) * f10));
            int m37223d4 = (int) (m36392b.m37223d() + (f10 * (((m37223d - m37223d2) + m37223d3) - m36392b.m37223d())));
            int i10 = 4;
            while (true) {
                int i11 = i10;
                c8463a = null;
                if (i11 > 16) {
                    break;
                }
                try {
                    c8463a = m36366f(m36363a, m37222c4, m37223d4, i11);
                    break;
                } catch (C8695j e10) {
                    i10 = i11 << 1;
                }
            }
        }
        return new C10199g(m36362h(this.f39565a, m36361d(m36392b, m36393c, m36391a, c8463a, m36360c), m36360c), c8463a == null ? new C8701p[]{m36391a, m36392b, m36393c} : new C8701p[]{m36391a, m36392b, m36393c, c8463a});
    }

    /* renamed from: i */
    public final float m36368i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i12;
            i17 = i11;
            i16 = i10;
            i14 = i13;
        } else {
            i14 = i12;
            i15 = i13;
            i16 = i11;
            i17 = i10;
        }
        int abs = Math.abs(i14 - i17);
        int abs2 = Math.abs(i15 - i16);
        int i18 = (-abs) / 2;
        int i19 = -1;
        int i20 = i17 < i14 ? 1 : -1;
        if (i16 < i15) {
            i19 = 1;
        }
        int i21 = i14 + i20;
        int i22 = i17;
        int i23 = i16;
        int i24 = 0;
        boolean z11 = z10;
        while (i22 != i21) {
            int i25 = i24;
            if ((i24 == 1) == this.f39565a.m42672d(z11 ? i23 : i22, z11 ? i22 : i23)) {
                if (i24 == 2) {
                    return C0156a.m676b(i22, i23, i17, i16);
                }
                i25 = i24 + 1;
            }
            int i26 = i18 + abs2;
            int i27 = i26;
            int i28 = i23;
            if (i26 > 0) {
                i24 = i25;
                if (i23 == i15) {
                    break;
                }
                i28 = i23 + i19;
                i27 = i26 - abs;
            }
            i22 += i20;
            i18 = i27;
            i23 = i28;
            i24 = i25;
        }
        if (i24 == 2) {
            return C0156a.m676b(i21, i15, i17, i16);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    public final float m36369j(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float m36368i = m36368i(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else if (i14 >= this.f39565a.m42678k()) {
            f10 = ((this.f39565a.m42678k() - 1) - i10) / (i14 - i10);
            i14 = this.f39565a.m42678k() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = i11;
        int i15 = (int) (f12 - ((i13 - i11) * f10));
        if (i15 < 0) {
            f11 = f12 / (i11 - i15);
            i15 = 0;
        } else if (i15 >= this.f39565a.m42675h()) {
            f11 = ((this.f39565a.m42675h() - 1) - i11) / (i15 - i11);
            i15 = this.f39565a.m42675h() - 1;
        } else {
            f11 = 1.0f;
        }
        return (m36368i + m36368i(i10, i11, (int) (i10 + ((i14 - i10) * f11)), i15)) - 1.0f;
    }
}
