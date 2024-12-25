package p392x;

import java.util.ArrayList;
import p358v.C9212d;
import p373w.C9384d;
import p373w.C9385e;
import p373w.C9386f;
import p373w.C9387g;
import p373w.C9390j;
import p373w.C9391k;
import p373w.InterfaceC9388h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/b.class
 */
/* renamed from: x.b */
/* loaded from: combined.jar:classes1.jar:x/b.class */
public class C9601b {

    /* renamed from: a */
    public final ArrayList<C9385e> f43856a = new ArrayList<>();

    /* renamed from: b */
    public a f43857b = new a();

    /* renamed from: c */
    public C9386f f43858c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x/b$a.class
     */
    /* renamed from: x.b$a */
    /* loaded from: combined.jar:classes1.jar:x/b$a.class */
    public static class a {

        /* renamed from: a */
        public C9385e.b f43859a;

        /* renamed from: b */
        public C9385e.b f43860b;

        /* renamed from: c */
        public int f43861c;

        /* renamed from: d */
        public int f43862d;

        /* renamed from: e */
        public int f43863e;

        /* renamed from: f */
        public int f43864f;

        /* renamed from: g */
        public int f43865g;

        /* renamed from: h */
        public boolean f43866h;

        /* renamed from: i */
        public boolean f43867i;

        /* renamed from: j */
        public boolean f43868j;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x/b$b.class
     */
    /* renamed from: x.b$b */
    /* loaded from: combined.jar:classes1.jar:x/b$b.class */
    public interface b {
        /* renamed from: a */
        void mo1714a();

        /* renamed from: b */
        void mo1715b(C9385e c9385e, a aVar);
    }

    public C9601b(C9386f c9386f) {
        this.f43858c = c9386f;
    }

    /* renamed from: a */
    public final boolean m40444a(b bVar, C9385e c9385e, boolean z10) {
        this.f43857b.f43859a = c9385e.m39660w();
        this.f43857b.f43860b = c9385e.m39605K();
        this.f43857b.f43861c = c9385e.m39608N();
        this.f43857b.f43862d = c9385e.m39654t();
        a aVar = this.f43857b;
        aVar.f43867i = false;
        aVar.f43868j = z10;
        C9385e.b bVar2 = aVar.f43859a;
        C9385e.b bVar3 = C9385e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar2 == bVar3;
        boolean z12 = aVar.f43860b == bVar3;
        boolean z13 = z11 && c9385e.f42963Q > 0.0f;
        boolean z14 = z12 && c9385e.f42963Q > 0.0f;
        if (z13 && c9385e.f42999n[0] == 4) {
            aVar.f43859a = C9385e.b.FIXED;
        }
        if (z14 && c9385e.f42999n[1] == 4) {
            aVar.f43860b = C9385e.b.FIXED;
        }
        bVar.mo1715b(c9385e, aVar);
        c9385e.m39591B0(this.f43857b.f43863e);
        c9385e.m39627e0(this.f43857b.f43864f);
        c9385e.m39625d0(this.f43857b.f43866h);
        c9385e.m39619Y(this.f43857b.f43865g);
        a aVar2 = this.f43857b;
        aVar2.f43868j = false;
        return aVar2.f43867i;
    }

    /* renamed from: b */
    public final void m40445b(C9386f c9386f) {
        int size = c9386f.f43068w0.size();
        b m39676R0 = c9386f.m39676R0();
        for (int i10 = 0; i10 < size; i10++) {
            C9385e c9385e = c9386f.f43068w0.get(i10);
            if (!(c9385e instanceof C9387g) && (!c9385e.f42981e.f43910e.f43889j || !c9385e.f42983f.f43910e.f43889j)) {
                C9385e.b m39648q = c9385e.m39648q(0);
                C9385e.b m39648q2 = c9385e.m39648q(1);
                C9385e.b bVar = C9385e.b.MATCH_CONSTRAINT;
                if (!(m39648q == bVar && c9385e.f42995l != 1 && m39648q2 == bVar && c9385e.f42997m != 1)) {
                    m40444a(m39676R0, c9385e, false);
                }
            }
        }
        m39676R0.mo1714a();
    }

    /* renamed from: c */
    public final void m40446c(C9386f c9386f, String str, int i10, int i11) {
        int m39592C = c9386f.m39592C();
        int m39590B = c9386f.m39590B();
        c9386f.m39651r0(0);
        c9386f.m39649q0(0);
        c9386f.m39591B0(i10);
        c9386f.m39627e0(i11);
        c9386f.m39651r0(m39592C);
        c9386f.m39649q0(m39590B);
        this.f43858c.mo39668H0();
    }

    /* renamed from: d */
    public long m40447d(C9386f c9386f, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        boolean z11;
        boolean z12;
        int i20;
        boolean z13;
        boolean z14;
        boolean m39705I0;
        boolean m39674P0;
        int i21;
        b m39676R0 = c9386f.m39676R0();
        int size = c9386f.f43068w0.size();
        int m39608N = c9386f.m39608N();
        int m39654t = c9386f.m39654t();
        boolean m39703b = C9390j.m39703b(i10, 128);
        boolean z15 = m39703b || C9390j.m39703b(i10, 64);
        boolean z16 = z15;
        if (z15) {
            int i22 = 0;
            while (true) {
                z16 = z15;
                if (i22 >= size) {
                    break;
                }
                C9385e c9385e = c9386f.f43068w0.get(i22);
                C9385e.b m39660w = c9385e.m39660w();
                C9385e.b bVar = C9385e.b.MATCH_CONSTRAINT;
                boolean z17 = (m39660w == bVar) && (c9385e.m39605K() == bVar) && c9385e.m39650r() > 0.0f;
                if ((!c9385e.m39614T() || !z17) && ((!c9385e.m39616V() || !z17) && !(c9385e instanceof C9391k) && !c9385e.m39614T() && !c9385e.m39616V())) {
                    i22++;
                }
            }
            z16 = false;
        }
        if (z16) {
            int i23 = C9212d.f42041q;
        }
        if (z16 && ((i13 == 1073741824 && i15 == 1073741824) || m39703b)) {
            int min = Math.min(c9386f.m39588A(), i14);
            int min2 = Math.min(c9386f.m39666z(), i16);
            if (i13 == 1073741824 && c9386f.m39608N() != min) {
                c9386f.m39591B0(min);
                c9386f.m39678T0();
            }
            if (i15 == 1073741824 && c9386f.m39654t() != min2) {
                c9386f.m39627e0(min2);
                c9386f.m39678T0();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                m39674P0 = c9386f.m39673O0(m39703b);
                i21 = 2;
            } else {
                m39674P0 = c9386f.m39674P0(m39703b);
                if (i13 == 1073741824) {
                    m39674P0 &= c9386f.m39675Q0(m39703b, 0);
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                if (i15 == 1073741824) {
                    i21++;
                    m39674P0 = c9386f.m39675Q0(m39703b, 1) & m39674P0;
                }
            }
            z10 = m39674P0;
            i19 = i21;
            if (m39674P0) {
                c9386f.mo39599F0(i13 == 1073741824, i15 == 1073741824);
                z10 = m39674P0;
                i19 = i21;
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        if (size > 0) {
            m40445b(c9386f);
        }
        int m39677S0 = c9386f.m39677S0();
        int size2 = this.f43856a.size();
        if (size > 0) {
            m40446c(c9386f, "First pass", m39608N, m39654t);
        }
        int i24 = m39677S0;
        if (size2 > 0) {
            C9385e.b m39660w2 = c9386f.m39660w();
            C9385e.b bVar2 = C9385e.b.WRAP_CONTENT;
            boolean z18 = m39660w2 == bVar2;
            boolean z19 = c9386f.m39605K() == bVar2;
            int max = Math.max(c9386f.m39608N(), this.f43858c.m39592C());
            int max2 = Math.max(c9386f.m39654t(), this.f43858c.m39590B());
            int i25 = 0;
            boolean z20 = false;
            while (true) {
                z11 = z20;
                if (i25 >= size2) {
                    break;
                }
                C9385e c9385e2 = this.f43856a.get(i25);
                if (c9385e2 instanceof C9391k) {
                    int m39608N2 = c9385e2.m39608N();
                    int m39654t2 = c9385e2.m39654t();
                    boolean m40444a = m40444a(m39676R0, c9385e2, true);
                    int m39608N3 = c9385e2.m39608N();
                    int m39654t3 = c9385e2.m39654t();
                    if (m39608N3 != m39608N2) {
                        c9385e2.m39591B0(m39608N3);
                        int i26 = max;
                        if (z18) {
                            i26 = max;
                            if (c9385e2.m39600G() > max) {
                                i26 = Math.max(max, c9385e2.m39600G() + c9385e2.mo39636k(C9384d.b.RIGHT).m39577b());
                            }
                        }
                        z14 = true;
                        max = i26;
                    } else {
                        z14 = z11 | m40444a;
                    }
                    int i27 = max2;
                    if (m39654t3 != m39654t2) {
                        c9385e2.m39627e0(m39654t3);
                        i27 = max2;
                        if (z19) {
                            i27 = max2;
                            if (c9385e2.m39642n() > max2) {
                                i27 = Math.max(max2, c9385e2.m39642n() + c9385e2.mo39636k(C9384d.b.BOTTOM).m39577b());
                            }
                        }
                        z14 = true;
                    }
                    m39705I0 = z14 | ((C9391k) c9385e2).m39705I0();
                    max2 = i27;
                } else {
                    m39705I0 = z11;
                }
                i25++;
                z20 = m39705I0;
            }
            int i28 = 0;
            boolean z21 = z11;
            int i29 = max2;
            while (i28 < 2) {
                int i30 = 0;
                int i31 = i29;
                int i32 = i28;
                while (i30 < size2) {
                    C9385e c9385e3 = this.f43856a.get(i30);
                    if (((c9385e3 instanceof InterfaceC9388h) && !(c9385e3 instanceof C9391k)) || (c9385e3 instanceof C9387g) || c9385e3.m39607M() == 8 || ((c9385e3.f42981e.f43910e.f43889j && c9385e3.f42983f.f43910e.f43889j) || (c9385e3 instanceof C9391k))) {
                        i20 = max;
                        z13 = z21;
                    } else {
                        int m39608N4 = c9385e3.m39608N();
                        int m39654t4 = c9385e3.m39654t();
                        int m39638l = c9385e3.m39638l();
                        boolean m40444a2 = z21 | m40444a(m39676R0, c9385e3, true);
                        int m39608N5 = c9385e3.m39608N();
                        int m39654t5 = c9385e3.m39654t();
                        int i33 = max;
                        if (m39608N5 != m39608N4) {
                            c9385e3.m39591B0(m39608N5);
                            i33 = max;
                            if (z18) {
                                i33 = max;
                                if (c9385e3.m39600G() > max) {
                                    i33 = Math.max(max, c9385e3.m39600G() + c9385e3.mo39636k(C9384d.b.RIGHT).m39577b());
                                }
                            }
                            m40444a2 = true;
                        }
                        int i34 = i31;
                        boolean z22 = m40444a2;
                        if (m39654t5 != m39654t4) {
                            c9385e3.m39627e0(m39654t5);
                            i34 = i31;
                            if (z19) {
                                i34 = i31;
                                if (c9385e3.m39642n() > i31) {
                                    i34 = Math.max(i31, c9385e3.m39642n() + c9385e3.mo39636k(C9384d.b.BOTTOM).m39577b());
                                }
                            }
                            z22 = true;
                        }
                        i20 = i33;
                        i31 = i34;
                        z13 = z22;
                        if (c9385e3.m39611Q()) {
                            i20 = i33;
                            i31 = i34;
                            z13 = z22;
                            if (m39638l != c9385e3.m39638l()) {
                                z13 = true;
                                i31 = i34;
                                i20 = i33;
                            }
                        }
                    }
                    i30++;
                    max = i20;
                    z21 = z13;
                }
                boolean z23 = z21;
                if (z21) {
                    m40446c(c9386f, "intermediate pass", m39608N, m39654t);
                    z23 = false;
                }
                i28 = i32 + 1;
                i29 = i31;
                z21 = z23;
            }
            if (z21) {
                m40446c(c9386f, "2nd pass", m39608N, m39654t);
                if (c9386f.m39608N() < max) {
                    c9386f.m39591B0(max);
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c9386f.m39654t() < i29) {
                    c9386f.m39627e0(i29);
                    z12 = true;
                }
                if (z12) {
                    m40446c(c9386f, "3rd pass", m39608N, m39654t);
                }
            }
            i24 = m39677S0;
        }
        c9386f.m39687c1(i24);
        return 0L;
    }

    /* renamed from: e */
    public void m40448e(C9386f c9386f) {
        int i10;
        this.f43856a.clear();
        int size = c9386f.f43068w0.size();
        for (0; i10 < size; i10 + 1) {
            C9385e c9385e = c9386f.f43068w0.get(i10);
            C9385e.b m39660w = c9385e.m39660w();
            C9385e.b bVar = C9385e.b.MATCH_CONSTRAINT;
            if (m39660w != bVar) {
                C9385e.b m39660w2 = c9385e.m39660w();
                C9385e.b bVar2 = C9385e.b.MATCH_PARENT;
                i10 = (m39660w2 == bVar2 || c9385e.m39605K() == bVar || c9385e.m39605K() == bVar2) ? 0 : i10 + 1;
            }
            this.f43856a.add(c9385e);
        }
        c9386f.m39678T0();
    }
}
