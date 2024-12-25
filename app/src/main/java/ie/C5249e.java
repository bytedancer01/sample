package ie;

import ae.C0156a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p132he.AbstractC5069k;
import p444zd.C10193a;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;
import td.InterfaceC8702q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ie/e.class
 */
/* renamed from: ie.e */
/* loaded from: combined.jar:classes2.jar:ie/e.class */
public final class C5249e extends AbstractC5245a {

    /* renamed from: i */
    public static final int[] f29993i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    public static final int[] f29994j = {4, 20, 48, 81};

    /* renamed from: k */
    public static final int[] f29995k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    public static final int[] f29996l = {0, 336, 1036, 1516};

    /* renamed from: m */
    public static final int[] f29997m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    public static final int[] f29998n = {2, 4, 6, 8};

    /* renamed from: o */
    public static final int[][] f29999o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    public final List<C5248d> f30000g = new ArrayList();

    /* renamed from: h */
    public final List<C5248d> f30001h = new ArrayList();

    /* renamed from: r */
    public static void m26180r(Collection<C5248d> collection, C5248d c5248d) {
        boolean z10;
        if (c5248d == null) {
            return;
        }
        Iterator<C5248d> it = collection.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            C5248d next = it.next();
            if (next.m26173b() == c5248d.m26173b()) {
                next.m26179e();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        collection.add(c5248d);
    }

    /* renamed from: t */
    public static boolean m26181t(C5248d c5248d, C5248d c5248d2) {
        int m26172a = c5248d.m26172a();
        int m26172a2 = c5248d2.m26172a();
        int m26176c = (c5248d.m26178d().m26176c() * 9) + c5248d2.m26178d().m26176c();
        int i10 = m26176c;
        if (m26176c > 72) {
            i10 = m26176c - 1;
        }
        int i11 = i10;
        if (i10 > 8) {
            i11 = i10 - 1;
        }
        return (m26172a + (m26172a2 * 16)) % 79 == i11;
    }

    /* renamed from: u */
    public static C8699n m26182u(C5248d c5248d, C5248d c5248d2) {
        String valueOf = String.valueOf((c5248d.m26173b() * 4537077) + c5248d2.m26173b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int charAt = sb2.charAt(i11) - '0';
            int i12 = charAt;
            if ((i11 & 1) == 0) {
                i12 = charAt * 3;
            }
            i10 += i12;
        }
        int i13 = 10 - (i10 % 10);
        int i14 = i13;
        if (i13 == 10) {
            i14 = 0;
        }
        sb2.append(i14);
        C8701p[] m26174a = c5248d.m26178d().m26174a();
        C8701p[] m26174a2 = c5248d2.m26178d().m26174a();
        return new C8699n(sb2.toString(), null, new C8701p[]{m26174a[0], m26174a[1], m26174a2[0], m26174a2[1]}, EnumC8686a.RSS_14);
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        m26180r(this.f30000g, m26185w(c10193a, false, i10, map));
        c10193a.m42666k();
        m26180r(this.f30001h, m26185w(c10193a, true, i10, map));
        c10193a.m42666k();
        for (C5248d c5248d : this.f30000g) {
            if (c5248d.m26177c() > 1) {
                for (C5248d c5248d2 : this.f30001h) {
                    if (c5248d2.m26177c() > 1 && m26181t(c5248d, c5248d2)) {
                        return m26182u(c5248d, c5248d2);
                    }
                }
            }
        }
        throw C8695j.m37209a();
    }

    @Override // p132he.AbstractC5069k, td.InterfaceC8697l
    public void reset() {
        this.f30000g.clear();
        this.f30001h.clear();
    }

    /* renamed from: s */
    public final void m26183s(boolean z10, int i10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int m678d = C0156a.m678d(m26170m());
        int m678d2 = C0156a.m678d(m26168k());
        if (z10) {
            if (m678d > 12) {
                z21 = false;
                z22 = true;
            } else {
                z21 = m678d < 4;
                z22 = false;
            }
            if (m678d2 > 12) {
                z16 = z21;
                z14 = z22;
                z17 = false;
                z19 = true;
                z18 = z16;
            } else {
                z13 = z21;
                z14 = z22;
                if (m678d2 < 4) {
                    z15 = z21;
                    z14 = z22;
                    z17 = true;
                    z18 = z15;
                    z19 = false;
                }
                z17 = false;
                z18 = z13;
                z19 = false;
            }
        } else {
            if (m678d > 11) {
                z11 = false;
                z12 = true;
            } else {
                z11 = m678d < 5;
                z12 = false;
            }
            if (m678d2 > 10) {
                z14 = z12;
                z16 = z11;
                z17 = false;
                z19 = true;
                z18 = z16;
            } else {
                z13 = z11;
                z14 = z12;
                if (m678d2 < 4) {
                    z14 = z12;
                    z15 = z11;
                    z17 = true;
                    z18 = z15;
                    z19 = false;
                }
                z17 = false;
                z18 = z13;
                z19 = false;
            }
        }
        int i11 = (m678d + m678d2) - i10;
        boolean z23 = (m678d & 1) == z10;
        boolean z24 = false;
        if ((m678d2 & 1) == 1) {
            z24 = true;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw C8695j.m37209a();
                }
                if (z23) {
                    if (z24) {
                        throw C8695j.m37209a();
                    }
                    z20 = z18;
                    z14 = true;
                } else {
                    if (!z24) {
                        throw C8695j.m37209a();
                    }
                    z20 = z18;
                    z19 = true;
                }
            } else if (z23) {
                if (!z24) {
                    throw C8695j.m37209a();
                }
                if (m678d < m678d2) {
                    z20 = true;
                    z19 = true;
                } else {
                    z17 = true;
                    z20 = z18;
                    z14 = true;
                }
            } else {
                if (z24) {
                    throw C8695j.m37209a();
                }
                z20 = z18;
            }
        } else if (z23) {
            if (z24) {
                throw C8695j.m37209a();
            }
            z20 = true;
        } else {
            if (!z24) {
                throw C8695j.m37209a();
            }
            z20 = z18;
            z17 = true;
        }
        if (z20) {
            if (z14) {
                throw C8695j.m37209a();
            }
            AbstractC5245a.m26163o(m26170m(), m26171n());
        }
        if (z14) {
            AbstractC5245a.m26162h(m26170m(), m26171n());
        }
        if (z17) {
            if (z19) {
                throw C8695j.m37209a();
            }
            AbstractC5245a.m26163o(m26168k(), m26171n());
        }
        if (z19) {
            AbstractC5245a.m26162h(m26168k(), m26169l());
        }
    }

    /* renamed from: v */
    public final C5246b m26184v(C10193a c10193a, C5247c c5247c, boolean z10) {
        int i10;
        int[] m26166i = m26166i();
        Arrays.fill(m26166i, 0);
        int[] m26175b = c5247c.m26175b();
        if (z10) {
            AbstractC5069k.m25330g(c10193a, m26175b[0], m26166i);
        } else {
            AbstractC5069k.m25329f(c10193a, m26175b[1], m26166i);
            int i11 = 0;
            for (int length = m26166i.length - 1; i11 < length; length--) {
                int i12 = m26166i[i11];
                m26166i[i11] = m26166i[length];
                m26166i[length] = i12;
                i11++;
            }
        }
        int i13 = z10 ? 16 : 15;
        float m678d = C0156a.m678d(m26166i) / i13;
        int[] m26170m = m26170m();
        int[] m26168k = m26168k();
        float[] m26171n = m26171n();
        float[] m26169l = m26169l();
        for (int i14 = 0; i14 < m26166i.length; i14++) {
            float f10 = m26166i[i14] / m678d;
            int i15 = (int) (0.5f + f10);
            if (i15 <= 0) {
                i10 = 1;
            } else {
                i10 = i15;
                if (i15 > 8) {
                    i10 = 8;
                }
            }
            int i16 = i14 / 2;
            if ((i14 & 1) == 0) {
                m26170m[i16] = i10;
                m26171n[i16] = f10 - i10;
            } else {
                m26168k[i16] = i10;
                m26169l[i16] = f10 - i10;
            }
        }
        m26183s(z10, i13);
        int i17 = 0;
        int i18 = 0;
        for (int length2 = m26170m.length - 1; length2 >= 0; length2--) {
            int i19 = m26170m[length2];
            i17 = (i17 * 9) + i19;
            i18 += i19;
        }
        int i20 = 0;
        int i21 = 0;
        for (int length3 = m26168k.length - 1; length3 >= 0; length3--) {
            int i22 = m26168k[length3];
            i20 = (i20 * 9) + i22;
            i21 += i22;
        }
        int i23 = i17 + (i20 * 3);
        if (!z10) {
            if ((i21 & 1) != 0 || i21 > 10 || i21 < 4) {
                throw C8695j.m37209a();
            }
            int i24 = (10 - i21) / 2;
            int i25 = f29998n[i24];
            return new C5246b((C5250f.m26189b(m26168k, 9 - i25, false) * f29994j[i24]) + C5250f.m26189b(m26170m, i25, true) + f29996l[i24], i23);
        }
        if ((i18 & 1) != 0 || i18 > 12 || i18 < 4) {
            throw C8695j.m37209a();
        }
        int i26 = (12 - i18) / 2;
        int i27 = f29997m[i26];
        return new C5246b((C5250f.m26189b(m26170m, i27, false) * f29993i[i26]) + C5250f.m26189b(m26168k, 9 - i27, true) + f29995k[i26], i23);
    }

    /* renamed from: w */
    public final C5248d m26185w(C10193a c10193a, boolean z10, int i10, Map<EnumC8690e, ?> map) {
        try {
            C5247c m26187y = m26187y(c10193a, i10, z10, m26186x(c10193a, z10));
            InterfaceC8702q interfaceC8702q = map == null ? null : (InterfaceC8702q) map.get(EnumC8690e.NEED_RESULT_POINT_CALLBACK);
            if (interfaceC8702q != null) {
                int[] m26175b = m26187y.m26175b();
                float f10 = ((m26175b[0] + m26175b[1]) - 1) / 2.0f;
                float f11 = f10;
                if (z10) {
                    f11 = (c10193a.m42664h() - 1) - f10;
                }
                interfaceC8702q.mo37224a(new C8701p(f11, i10));
            }
            C5246b m26184v = m26184v(c10193a, m26187y, true);
            C5246b m26184v2 = m26184v(c10193a, m26187y, false);
            return new C5248d((m26184v.m26173b() * 1597) + m26184v2.m26173b(), m26184v.m26172a() + (m26184v2.m26172a() * 4), m26187y);
        } catch (C8695j e10) {
            return null;
        }
    }

    /* renamed from: x */
    public final int[] m26186x(C10193a c10193a, boolean z10) {
        boolean z11;
        int i10;
        int[] m26167j = m26167j();
        m26167j[0] = 0;
        m26167j[1] = 0;
        m26167j[2] = 0;
        m26167j[3] = 0;
        int m42664h = c10193a.m42664h();
        int i11 = 0;
        boolean z12 = false;
        while (true) {
            z11 = z12;
            if (i11 >= m42664h) {
                break;
            }
            boolean z13 = !c10193a.m42660c(i11);
            z11 = z13;
            if (z10 == z13) {
                break;
            }
            i11++;
            z12 = z13;
        }
        int i12 = i11;
        int i13 = 0;
        boolean z14 = z11;
        int i14 = i11;
        while (i14 < m42664h) {
            if (c10193a.m42660c(i14) != z14) {
                m26167j[i13] = m26167j[i13] + 1;
                i10 = i13;
            } else {
                if (i13 != 3) {
                    i10 = i13 + 1;
                } else {
                    if (AbstractC5245a.m26164p(m26167j)) {
                        return new int[]{i12, i14};
                    }
                    i12 += m26167j[0] + m26167j[1];
                    m26167j[0] = m26167j[2];
                    m26167j[1] = m26167j[3];
                    m26167j[2] = 0;
                    m26167j[3] = 0;
                    i10 = i13 - 1;
                }
                m26167j[i10] = 1;
                z14 = !z14;
            }
            i14++;
            i13 = i10;
        }
        throw C8695j.m37209a();
    }

    /* renamed from: y */
    public final C5247c m26187y(C10193a c10193a, int i10, boolean z10, int[] iArr) {
        int i11;
        boolean m42660c = c10193a.m42660c(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && m42660c != c10193a.m42660c(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0];
        int[] m26167j = m26167j();
        System.arraycopy(m26167j, 0, m26167j, 1, m26167j.length - 1);
        m26167j[0] = i14 - i13;
        int m26165q = AbstractC5245a.m26165q(m26167j, f29999o);
        int i15 = iArr[1];
        if (z10) {
            int m42664h = c10193a.m42664h();
            i15 = (c10193a.m42664h() - 1) - i15;
            i11 = (m42664h - 1) - i13;
        } else {
            i11 = i13;
        }
        return new C5247c(m26165q, new int[]{i13, iArr[1]}, i11, i15, i10);
    }
}
