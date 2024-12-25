package p373w;

import java.util.ArrayList;
import java.util.Arrays;
import p358v.C9212d;
import p373w.C9385e;
import p392x.C9601b;
import p392x.C9604e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/f.class
 */
/* renamed from: w.f */
/* loaded from: combined.jar:classes1.jar:w/f.class */
public class C9386f extends C9392l {

    /* renamed from: C0 */
    public int f43024C0;

    /* renamed from: D0 */
    public int f43025D0;

    /* renamed from: E0 */
    public int f43026E0;

    /* renamed from: F0 */
    public int f43027F0;

    /* renamed from: x0 */
    public C9601b f43042x0 = new C9601b(this);

    /* renamed from: y0 */
    public C9604e f43043y0 = new C9604e(this);

    /* renamed from: z0 */
    public C9601b.b f43044z0 = null;

    /* renamed from: A0 */
    public boolean f43022A0 = false;

    /* renamed from: B0 */
    public C9212d f43023B0 = new C9212d();

    /* renamed from: G0 */
    public int f43028G0 = 0;

    /* renamed from: H0 */
    public int f43029H0 = 0;

    /* renamed from: I0 */
    public C9383c[] f43030I0 = new C9383c[4];

    /* renamed from: J0 */
    public C9383c[] f43031J0 = new C9383c[4];

    /* renamed from: K0 */
    public boolean f43032K0 = false;

    /* renamed from: L0 */
    public boolean f43033L0 = false;

    /* renamed from: M0 */
    public boolean f43034M0 = false;

    /* renamed from: N0 */
    public int f43035N0 = 0;

    /* renamed from: O0 */
    public int f43036O0 = 0;

    /* renamed from: P0 */
    public int f43037P0 = 263;

    /* renamed from: Q0 */
    public boolean f43038Q0 = false;

    /* renamed from: R0 */
    public boolean f43039R0 = false;

    /* renamed from: S0 */
    public boolean f43040S0 = false;

    /* renamed from: T0 */
    public int f43041T0 = 0;

    @Override // p373w.C9385e
    /* renamed from: F0 */
    public void mo39599F0(boolean z10, boolean z11) {
        super.mo39599F0(z10, z11);
        int size = this.f43068w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f43068w0.get(i10).mo39599F0(z10, z11);
        }
    }

    @Override // p373w.C9392l
    /* renamed from: H0 */
    public void mo39668H0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        this.f42965S = 0;
        this.f42966T = 0;
        int max = Math.max(0, m39608N());
        int max2 = Math.max(0, m39654t());
        this.f43039R0 = false;
        this.f43040S0 = false;
        boolean z14 = m39684Z0(64) || m39684Z0(128);
        C9212d c9212d = this.f43023B0;
        c9212d.f42051g = false;
        c9212d.f42052h = false;
        if (this.f43037P0 != 0 && z14) {
            c9212d.f42052h = true;
        }
        C9385e.b[] bVarArr = this.f42959M;
        C9385e.b bVar = bVarArr[1];
        C9385e.b bVar2 = bVarArr[0];
        ArrayList<C9385e> arrayList = this.f43068w0;
        C9385e.b m39660w = m39660w();
        C9385e.b bVar3 = C9385e.b.WRAP_CONTENT;
        boolean z15 = m39660w == bVar3 || m39605K() == bVar3;
        m39685a1();
        int size = this.f43068w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9385e c9385e = this.f43068w0.get(i10);
            if (c9385e instanceof C9392l) {
                ((C9392l) c9385e).mo39668H0();
            }
        }
        int i11 = 0;
        boolean z16 = true;
        boolean z17 = false;
        while (z16) {
            int i12 = i11 + 1;
            boolean z18 = z16;
            try {
                this.f43023B0.m38746D();
                boolean z19 = z16;
                m39685a1();
                boolean z20 = z16;
                m39634j(this.f43023B0);
                for (int i13 = 0; i13 < size; i13++) {
                    this.f43068w0.get(i13).m39634j(this.f43023B0);
                }
                boolean m39670L0 = m39670L0(this.f43023B0);
                z18 = m39670L0;
                if (m39670L0) {
                    this.f43023B0.m38770z();
                    z18 = m39670L0;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                System.out.println("EXCEPTION : " + e10);
            }
            C9212d c9212d2 = this.f43023B0;
            if (z18) {
                m39689e1(c9212d2, C9390j.f43054a);
            } else {
                mo39601G0(c9212d2);
                for (int i14 = 0; i14 < size; i14++) {
                    this.f43068w0.get(i14).mo39601G0(this.f43023B0);
                }
            }
            if (z15 && i12 < 8 && C9390j.f43054a[2]) {
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    C9385e c9385e2 = this.f43068w0.get(i17);
                    i15 = Math.max(i15, c9385e2.f42965S + c9385e2.m39608N());
                    i16 = Math.max(i16, c9385e2.f42966T + c9385e2.m39654t());
                }
                int max3 = Math.max(this.f42972Z, i15);
                int max4 = Math.max(this.f42974a0, i16);
                C9385e.b bVar4 = C9385e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || m39608N() >= max3) {
                    z12 = false;
                    z13 = z17;
                } else {
                    m39591B0(max3);
                    this.f42959M[0] = bVar4;
                    z12 = true;
                    z13 = true;
                }
                z10 = z12;
                z17 = z13;
                if (bVar == bVar4) {
                    z10 = z12;
                    z17 = z13;
                    if (m39654t() < max4) {
                        m39627e0(max4);
                        this.f42959M[1] = bVar4;
                        z10 = true;
                        z17 = true;
                    }
                }
            } else {
                z10 = false;
            }
            int max5 = Math.max(this.f42972Z, m39608N());
            if (max5 > m39608N()) {
                m39591B0(max5);
                this.f42959M[0] = C9385e.b.FIXED;
                z10 = true;
                z17 = true;
            }
            int max6 = Math.max(this.f42974a0, m39654t());
            if (max6 > m39654t()) {
                m39627e0(max6);
                this.f42959M[1] = C9385e.b.FIXED;
                z10 = true;
                z17 = true;
            }
            boolean z21 = z10;
            boolean z22 = z17;
            if (!z17) {
                C9385e.b bVar5 = this.f42959M[0];
                C9385e.b bVar6 = C9385e.b.WRAP_CONTENT;
                boolean z23 = z10;
                boolean z24 = z17;
                if (bVar5 == bVar6) {
                    z23 = z10;
                    z24 = z17;
                    if (max > 0) {
                        z23 = z10;
                        z24 = z17;
                        if (m39608N() > max) {
                            this.f43039R0 = true;
                            this.f42959M[0] = C9385e.b.FIXED;
                            m39591B0(max);
                            z23 = true;
                            z24 = true;
                        }
                    }
                }
                z21 = z23;
                z22 = z24;
                if (this.f42959M[1] == bVar6) {
                    z21 = z23;
                    z22 = z24;
                    if (max2 > 0) {
                        z21 = z23;
                        z22 = z24;
                        if (m39654t() > max2) {
                            this.f43040S0 = true;
                            this.f42959M[1] = C9385e.b.FIXED;
                            m39627e0(max2);
                            z16 = true;
                            z11 = true;
                            z17 = z11;
                            i11 = i12;
                        }
                    }
                }
            }
            z16 = z21;
            z11 = z22;
            z17 = z11;
            i11 = i12;
        }
        this.f43068w0 = arrayList;
        if (z17) {
            C9385e.b[] bVarArr2 = this.f42959M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        mo39618X(this.f43023B0.m38767v());
    }

    /* renamed from: K0 */
    public void m39669K0(C9385e c9385e, int i10) {
        if (i10 == 0) {
            m39671M0(c9385e);
        } else if (i10 == 1) {
            m39672N0(c9385e);
        }
    }

    /* renamed from: L0 */
    public boolean m39670L0(C9212d c9212d) {
        mo39569f(c9212d);
        int size = this.f43068w0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C9385e c9385e = this.f43068w0.get(i10);
            c9385e.m39639l0(0, false);
            c9385e.m39639l0(1, false);
            if (c9385e instanceof C9381a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                C9385e c9385e2 = this.f43068w0.get(i11);
                if (c9385e2 instanceof C9381a) {
                    ((C9381a) c9385e2).m39565K0();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            C9385e c9385e3 = this.f43068w0.get(i12);
            if (c9385e3.m39626e()) {
                c9385e3.mo39569f(c9212d);
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            C9385e c9385e4 = this.f43068w0.get(i13);
            if (c9385e4 instanceof C9386f) {
                C9385e.b[] bVarArr = c9385e4.f42959M;
                C9385e.b bVar = bVarArr[0];
                C9385e.b bVar2 = bVarArr[1];
                C9385e.b bVar3 = C9385e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    c9385e4.m39633i0(C9385e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    c9385e4.m39663x0(C9385e.b.FIXED);
                }
                c9385e4.mo39569f(c9212d);
                if (bVar == bVar3) {
                    c9385e4.m39633i0(bVar);
                }
                if (bVar2 == bVar3) {
                    c9385e4.m39663x0(bVar2);
                }
            } else {
                C9390j.m39702a(this, c9212d, c9385e4);
                if (!c9385e4.m39626e()) {
                    c9385e4.mo39569f(c9212d);
                }
            }
        }
        if (this.f43028G0 > 0) {
            C9382b.m39571a(this, c9212d, 0);
        }
        if (this.f43029H0 <= 0) {
            return true;
        }
        C9382b.m39571a(this, c9212d, 1);
        return true;
    }

    /* renamed from: M0 */
    public final void m39671M0(C9385e c9385e) {
        int i10 = this.f43028G0;
        C9383c[] c9383cArr = this.f43031J0;
        if (i10 + 1 >= c9383cArr.length) {
            this.f43031J0 = (C9383c[]) Arrays.copyOf(c9383cArr, c9383cArr.length * 2);
        }
        this.f43031J0[this.f43028G0] = new C9383c(c9385e, 0, m39681W0());
        this.f43028G0++;
    }

    /* renamed from: N0 */
    public final void m39672N0(C9385e c9385e) {
        int i10 = this.f43029H0;
        C9383c[] c9383cArr = this.f43030I0;
        if (i10 + 1 >= c9383cArr.length) {
            this.f43030I0 = (C9383c[]) Arrays.copyOf(c9383cArr, c9383cArr.length * 2);
        }
        this.f43030I0[this.f43029H0] = new C9383c(c9385e, 1, m39681W0());
        this.f43029H0++;
    }

    /* renamed from: O0 */
    public boolean m39673O0(boolean z10) {
        return this.f43043y0.m40463f(z10);
    }

    /* renamed from: P0 */
    public boolean m39674P0(boolean z10) {
        return this.f43043y0.m40464g(z10);
    }

    /* renamed from: Q0 */
    public boolean m39675Q0(boolean z10, int i10) {
        return this.f43043y0.m40465h(z10, i10);
    }

    /* renamed from: R0 */
    public C9601b.b m39676R0() {
        return this.f43044z0;
    }

    /* renamed from: S0 */
    public int m39677S0() {
        return this.f43037P0;
    }

    /* renamed from: T0 */
    public void m39678T0() {
        this.f43043y0.m40467j();
    }

    /* renamed from: U0 */
    public void m39679U0() {
        this.f43043y0.m40468k();
    }

    /* renamed from: V0 */
    public boolean m39680V0() {
        return this.f43040S0;
    }

    @Override // p373w.C9392l, p373w.C9385e
    /* renamed from: W */
    public void mo39617W() {
        this.f43023B0.m38746D();
        this.f43024C0 = 0;
        this.f43026E0 = 0;
        this.f43025D0 = 0;
        this.f43027F0 = 0;
        this.f43038Q0 = false;
        super.mo39617W();
    }

    /* renamed from: W0 */
    public boolean m39681W0() {
        return this.f43022A0;
    }

    /* renamed from: X0 */
    public boolean m39682X0() {
        return this.f43039R0;
    }

    /* renamed from: Y0 */
    public long m39683Y0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f43024C0 = i17;
        this.f43025D0 = i18;
        return this.f43042x0.m40447d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    /* renamed from: Z0 */
    public boolean m39684Z0(int i10) {
        return (this.f43037P0 & i10) == i10;
    }

    /* renamed from: a1 */
    public final void m39685a1() {
        this.f43028G0 = 0;
        this.f43029H0 = 0;
    }

    /* renamed from: b1 */
    public void m39686b1(C9601b.b bVar) {
        this.f43044z0 = bVar;
        this.f43043y0.m40471n(bVar);
    }

    /* renamed from: c1 */
    public void m39687c1(int i10) {
        this.f43037P0 = i10;
        C9212d.f42042r = C9390j.m39703b(i10, 256);
    }

    /* renamed from: d1 */
    public void m39688d1(boolean z10) {
        this.f43022A0 = z10;
    }

    /* renamed from: e1 */
    public void m39689e1(C9212d c9212d, boolean[] zArr) {
        zArr[2] = false;
        mo39601G0(c9212d);
        int size = this.f43068w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f43068w0.get(i10).mo39601G0(c9212d);
        }
    }

    /* renamed from: f1 */
    public void m39690f1() {
        this.f43042x0.m40448e(this);
    }
}
