package re;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p444zd.C10194b;
import td.C8701p;
import td.EnumC8690e;
import td.InterfaceC8702q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:re/f.class
 */
/* renamed from: re.f */
/* loaded from: combined.jar:classes2.jar:re/f.class */
public class C8468f {

    /* renamed from: f */
    public static final b f39569f = new b();

    /* renamed from: a */
    public final C10194b f39570a;

    /* renamed from: c */
    public boolean f39572c;

    /* renamed from: e */
    public final InterfaceC8702q f39574e;

    /* renamed from: b */
    public final List<C8466d> f39571b = new ArrayList();

    /* renamed from: d */
    public final int[] f39573d = new int[5];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:re/f$b.class
     */
    /* renamed from: re.f$b */
    /* loaded from: combined.jar:classes2.jar:re/f$b.class */
    public static final class b implements Serializable, Comparator<C8466d> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C8466d c8466d, C8466d c8466d2) {
            return Float.compare(c8466d.m36373i(), c8466d2.m36373i());
        }
    }

    public C8468f(C10194b c10194b, InterfaceC8702q interfaceC8702q) {
        this.f39570a = c10194b;
        this.f39574e = interfaceC8702q;
    }

    /* renamed from: a */
    public static float m36375a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: e */
    public static void m36376e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    /* renamed from: f */
    public static void m36377f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    /* renamed from: i */
    public static boolean m36378i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    /* renamed from: j */
    public static boolean m36379j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    /* renamed from: o */
    public static double m36380o(C8466d c8466d, C8466d c8466d2) {
        double m37222c = c8466d.m37222c() - c8466d2.m37222c();
        double m37223d = c8466d.m37223d() - c8466d2.m37223d();
        return (m37222c * m37222c) + (m37223d * m37223d);
    }

    /* renamed from: b */
    public final boolean m36381b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] m36386k = m36386k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f39570a.m42672d(i11 - i15, i10 - i15)) {
            m36386k[2] = m36386k[2] + 1;
            i15++;
        }
        if (m36386k[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f39570a.m42672d(i11 - i15, i10 - i15)) {
            m36386k[1] = m36386k[1] + 1;
            i15++;
        }
        if (m36386k[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f39570a.m42672d(i11 - i15, i10 - i15)) {
            m36386k[0] = m36386k[0] + 1;
            i15++;
        }
        if (m36386k[0] == 0) {
            return false;
        }
        int m42675h = this.f39570a.m42675h();
        int m42678k = this.f39570a.m42678k();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            i12 = i16;
            if (i17 >= m42675h) {
                break;
            }
            int i18 = i11 + i16;
            i12 = i16;
            if (i18 >= m42678k) {
                break;
            }
            i12 = i16;
            if (!this.f39570a.m42672d(i18, i17)) {
                break;
            }
            m36386k[2] = m36386k[2] + 1;
            i16++;
        }
        while (true) {
            int i19 = i10 + i12;
            if (i19 >= m42675h || (i14 = i11 + i12) >= m42678k || this.f39570a.m42672d(i14, i19)) {
                break;
            }
            m36386k[3] = m36386k[3] + 1;
            i12++;
        }
        if (m36386k[3] == 0) {
            return false;
        }
        while (true) {
            int i20 = i10 + i12;
            if (i20 >= m42675h || (i13 = i11 + i12) >= m42678k || !this.f39570a.m42672d(i13, i20)) {
                break;
            }
            m36386k[4] = m36386k[4] + 1;
            i12++;
        }
        if (m36386k[4] == 0) {
            return false;
        }
        return m36379j(m36386k);
    }

    /* renamed from: c */
    public final float m36382c(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        C10194b c10194b = this.f39570a;
        int m42678k = c10194b.m42678k();
        int[] m36386k = m36386k();
        int i18 = i10;
        while (i18 >= 0 && c10194b.m42672d(i18, i11)) {
            m36386k[2] = m36386k[2] + 1;
            i18--;
        }
        int i19 = i18;
        if (i18 < 0) {
            return Float.NaN;
        }
        while (i19 >= 0 && !c10194b.m42672d(i19, i11) && (i17 = m36386k[1]) <= i12) {
            m36386k[1] = i17 + 1;
            i19--;
        }
        if (i19 < 0 || m36386k[1] > i12) {
            return Float.NaN;
        }
        while (i19 >= 0 && c10194b.m42672d(i19, i11) && (i16 = m36386k[0]) <= i12) {
            m36386k[0] = i16 + 1;
            i19--;
        }
        if (m36386k[0] > i12) {
            return Float.NaN;
        }
        int i20 = i10 + 1;
        while (i20 < m42678k && c10194b.m42672d(i20, i11)) {
            m36386k[2] = m36386k[2] + 1;
            i20++;
        }
        int i21 = i20;
        if (i20 == m42678k) {
            return Float.NaN;
        }
        while (i21 < m42678k && !c10194b.m42672d(i21, i11) && (i15 = m36386k[3]) < i12) {
            m36386k[3] = i15 + 1;
            i21++;
        }
        if (i21 == m42678k || m36386k[3] >= i12) {
            return Float.NaN;
        }
        while (i21 < m42678k && c10194b.m42672d(i21, i11) && (i14 = m36386k[4]) < i12) {
            m36386k[4] = i14 + 1;
            i21++;
        }
        int i22 = m36386k[4];
        if (i22 < i12 && Math.abs(((((m36386k[0] + m36386k[1]) + m36386k[2]) + m36386k[3]) + i22) - i13) * 5 < i13 && m36378i(m36386k)) {
            return m36375a(m36386k, i21);
        }
        return Float.NaN;
    }

    /* renamed from: d */
    public final float m36383d(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        C10194b c10194b = this.f39570a;
        int m42675h = c10194b.m42675h();
        int[] m36386k = m36386k();
        int i18 = i10;
        while (i18 >= 0 && c10194b.m42672d(i11, i18)) {
            m36386k[2] = m36386k[2] + 1;
            i18--;
        }
        int i19 = i18;
        if (i18 < 0) {
            return Float.NaN;
        }
        while (i19 >= 0 && !c10194b.m42672d(i11, i19) && (i17 = m36386k[1]) <= i12) {
            m36386k[1] = i17 + 1;
            i19--;
        }
        if (i19 < 0 || m36386k[1] > i12) {
            return Float.NaN;
        }
        while (i19 >= 0 && c10194b.m42672d(i11, i19) && (i16 = m36386k[0]) <= i12) {
            m36386k[0] = i16 + 1;
            i19--;
        }
        if (m36386k[0] > i12) {
            return Float.NaN;
        }
        int i20 = i10 + 1;
        while (i20 < m42675h && c10194b.m42672d(i11, i20)) {
            m36386k[2] = m36386k[2] + 1;
            i20++;
        }
        int i21 = i20;
        if (i20 == m42675h) {
            return Float.NaN;
        }
        while (i21 < m42675h && !c10194b.m42672d(i11, i21) && (i15 = m36386k[3]) < i12) {
            m36386k[3] = i15 + 1;
            i21++;
        }
        if (i21 == m42675h || m36386k[3] >= i12) {
            return Float.NaN;
        }
        while (i21 < m42675h && c10194b.m42672d(i11, i21) && (i14 = m36386k[4]) < i12) {
            m36386k[4] = i14 + 1;
            i21++;
        }
        int i22 = m36386k[4];
        if (i22 < i12 && Math.abs(((((m36386k[0] + m36386k[1]) + m36386k[2]) + m36386k[3]) + i22) - i13) * 5 < i13 * 2 && m36378i(m36386k)) {
            return m36375a(m36386k, i21);
        }
        return Float.NaN;
    }

    /* renamed from: g */
    public final C8469g m36384g(Map<EnumC8690e, ?> map) {
        int i10;
        int i11;
        boolean z10;
        boolean z11 = map != null && map.containsKey(EnumC8690e.TRY_HARDER);
        int m42675h = this.f39570a.m42675h();
        int m42678k = this.f39570a.m42678k();
        int i12 = (m42675h * 3) / 388;
        if (i12 < 3 || z11) {
            i12 = 3;
        }
        int[] iArr = new int[5];
        int i13 = i12 - 1;
        boolean z12 = false;
        while (true) {
            boolean z13 = z12;
            if (i13 >= m42675h || z13) {
                break;
            }
            m36376e(iArr);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = i15;
                if (i14 >= m42678k) {
                    break;
                }
                if (this.f39570a.m42672d(i14, i13)) {
                    i10 = i16;
                    if ((i16 & 1) == 1) {
                        i10 = i16 + 1;
                    }
                    iArr[i10] = iArr[i10] + 1;
                } else if ((i16 & 1) != 0) {
                    iArr[i16] = iArr[i16] + 1;
                    i10 = i16;
                } else if (i16 != 4) {
                    i10 = i16 + 1;
                    iArr[i10] = iArr[i10] + 1;
                } else if (m36378i(iArr) && m36387l(iArr, i13, i14)) {
                    if (this.f39572c) {
                        z10 = m36388m();
                        i11 = i13;
                    } else {
                        int m36385h = m36385h();
                        int i17 = iArr[2];
                        i11 = i13;
                        z10 = z13;
                        if (m36385h > i17) {
                            i11 = i13 + ((m36385h - i17) - 2);
                            i14 = m42678k - 1;
                            z10 = z13;
                        }
                    }
                    m36376e(iArr);
                    i12 = 2;
                    i13 = i11;
                    z13 = z10;
                    i10 = 0;
                } else {
                    m36377f(iArr);
                    i10 = 3;
                }
                i14++;
                i15 = i10;
            }
            int i18 = i12;
            boolean z14 = z13;
            if (m36378i(iArr)) {
                i18 = i12;
                z14 = z13;
                if (m36387l(iArr, i13, m42678k)) {
                    int i19 = iArr[0];
                    i18 = i19;
                    z14 = z13;
                    if (this.f39572c) {
                        z14 = m36388m();
                        i18 = i19;
                    }
                }
            }
            i13 += i18;
            i12 = i18;
            z12 = z14;
        }
        C8466d[] m36389n = m36389n();
        C8701p.m37221e(m36389n);
        return new C8469g(m36389n);
    }

    /* renamed from: h */
    public final int m36385h() {
        if (this.f39571b.size() <= 1) {
            return 0;
        }
        C8466d c8466d = null;
        for (C8466d c8466d2 : this.f39571b) {
            if (c8466d2.m36372h() >= 2) {
                if (c8466d != null) {
                    this.f39572c = true;
                    return ((int) (Math.abs(c8466d.m37222c() - c8466d2.m37222c()) - Math.abs(c8466d.m37223d() - c8466d2.m37223d()))) / 2;
                }
                c8466d = c8466d2;
            }
        }
        return 0;
    }

    /* renamed from: k */
    public final int[] m36386k() {
        m36376e(this.f39573d);
        return this.f39573d;
    }

    /* renamed from: l */
    public final boolean m36387l(int[] iArr, int i10, int i11) {
        boolean z10;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m36375a = (int) m36375a(iArr, i11);
        float m36383d = m36383d(i10, m36375a, iArr[2], i12);
        if (Float.isNaN(m36383d)) {
            return false;
        }
        int i13 = (int) m36383d;
        float m36382c = m36382c(m36375a, i13, iArr[2], i12);
        if (Float.isNaN(m36382c) || !m36381b(i13, (int) m36382c)) {
            return false;
        }
        float f10 = i12 / 7.0f;
        int i14 = 0;
        while (true) {
            z10 = false;
            if (i14 >= this.f39571b.size()) {
                break;
            }
            C8466d c8466d = this.f39571b.get(i14);
            if (c8466d.m36370f(f10, m36383d, m36382c)) {
                this.f39571b.set(i14, c8466d.m36371g(m36383d, m36382c, f10));
                z10 = true;
                break;
            }
            i14++;
        }
        if (z10) {
            return true;
        }
        C8466d c8466d2 = new C8466d(m36382c, m36383d, f10);
        this.f39571b.add(c8466d2);
        InterfaceC8702q interfaceC8702q = this.f39574e;
        if (interfaceC8702q == null) {
            return true;
        }
        interfaceC8702q.mo37224a(c8466d2);
        return true;
    }

    /* renamed from: m */
    public final boolean m36388m() {
        int size = this.f39571b.size();
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        for (C8466d c8466d : this.f39571b) {
            if (c8466d.m36372h() >= 2) {
                i10++;
                f11 += c8466d.m36373i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / size;
        Iterator<C8466d> it = this.f39571b.iterator();
        while (it.hasNext()) {
            f10 += Math.abs(it.next().m36373i() - f12);
        }
        return f10 <= f11 * 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164 A[SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final re.C8466d[] m36389n() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.C8468f.m36389n():re.d[]");
    }
}
