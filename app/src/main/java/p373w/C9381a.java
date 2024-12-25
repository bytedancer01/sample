package p373w;

import p358v.C9212d;
import p358v.C9217i;
import p373w.C9385e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/a.class
 */
/* renamed from: w.a */
/* loaded from: combined.jar:classes1.jar:w/a.class */
public class C9381a extends C9389i {

    /* renamed from: y0 */
    public int f42914y0 = 0;

    /* renamed from: z0 */
    public boolean f42915z0 = true;

    /* renamed from: A0 */
    public int f42913A0 = 0;

    /* renamed from: H0 */
    public boolean m39562H0() {
        return this.f42915z0;
    }

    /* renamed from: I0 */
    public int m39563I0() {
        return this.f42914y0;
    }

    /* renamed from: J0 */
    public int m39564J0() {
        return this.f42913A0;
    }

    /* renamed from: K0 */
    public void m39565K0() {
        for (int i10 = 0; i10 < this.f43053x0; i10++) {
            C9385e c9385e = this.f43052w0[i10];
            int i11 = this.f42914y0;
            if (i11 == 0 || i11 == 1) {
                c9385e.m39639l0(0, true);
            } else if (i11 == 2 || i11 == 3) {
                c9385e.m39639l0(1, true);
            }
        }
    }

    /* renamed from: L0 */
    public void m39566L0(boolean z10) {
        this.f42915z0 = z10;
    }

    /* renamed from: M0 */
    public void m39567M0(int i10) {
        this.f42914y0 = i10;
    }

    /* renamed from: N0 */
    public void m39568N0(int i10) {
        this.f42913A0 = i10;
    }

    @Override // p373w.C9385e
    /* renamed from: f */
    public void mo39569f(C9212d c9212d) {
        C9384d[] c9384dArr;
        boolean z10;
        C9217i c9217i;
        C9384d c9384d;
        int i10;
        int i11;
        int i12;
        C9384d[] c9384dArr2 = this.f42956J;
        c9384dArr2[0] = this.f42948B;
        c9384dArr2[2] = this.f42949C;
        c9384dArr2[1] = this.f42950D;
        c9384dArr2[3] = this.f42951E;
        int i13 = 0;
        while (true) {
            c9384dArr = this.f42956J;
            if (i13 >= c9384dArr.length) {
                break;
            }
            C9384d c9384d2 = c9384dArr[i13];
            c9384d2.f42944g = c9212d.m38763q(c9384d2);
            i13++;
        }
        int i14 = this.f42914y0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        C9384d c9384d3 = c9384dArr[i14];
        for (int i15 = 0; i15 < this.f43053x0; i15++) {
            C9385e c9385e = this.f43052w0[i15];
            if ((this.f42915z0 || c9385e.mo39570g()) && ((((i11 = this.f42914y0) == 0 || i11 == 1) && c9385e.m39660w() == C9385e.b.MATCH_CONSTRAINT && c9385e.f42948B.f42941d != null && c9385e.f42950D.f42941d != null) || (((i12 = this.f42914y0) == 2 || i12 == 3) && c9385e.m39605K() == C9385e.b.MATCH_CONSTRAINT && c9385e.f42949C.f42941d != null && c9385e.f42951E.f42941d != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = this.f42948B.m39583h() || this.f42950D.m39583h();
        boolean z12 = this.f42949C.m39583h() || this.f42951E.m39583h();
        int i16 = !z10 && (((i10 = this.f42914y0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12)))) ? 5 : 4;
        for (int i17 = 0; i17 < this.f43053x0; i17++) {
            C9385e c9385e2 = this.f43052w0[i17];
            if (this.f42915z0 || c9385e2.mo39570g()) {
                C9217i m38763q = c9212d.m38763q(c9385e2.f42956J[this.f42914y0]);
                C9384d[] c9384dArr3 = c9385e2.f42956J;
                int i18 = this.f42914y0;
                C9384d c9384d4 = c9384dArr3[i18];
                c9384d4.f42944g = m38763q;
                C9384d c9384d5 = c9384d4.f42941d;
                int i19 = (c9384d5 == null || c9384d5.f42939b != this) ? 0 : c9384d4.f42942e + 0;
                if (i18 == 0 || i18 == 2) {
                    c9212d.m38755i(c9384d3.f42944g, m38763q, this.f42913A0 - i19, z10);
                } else {
                    c9212d.m38753g(c9384d3.f42944g, m38763q, this.f42913A0 + i19, z10);
                }
                c9212d.m38751e(c9384d3.f42944g, m38763q, this.f42913A0 + i19, i16);
            }
        }
        int i20 = this.f42914y0;
        if (i20 == 0) {
            c9212d.m38751e(this.f42950D.f42944g, this.f42948B.f42944g, 0, 8);
            c9212d.m38751e(this.f42948B.f42944g, this.f42960N.f42950D.f42944g, 0, 4);
            c9217i = this.f42948B.f42944g;
            c9384d = this.f42960N.f42948B;
        } else if (i20 == 1) {
            c9212d.m38751e(this.f42948B.f42944g, this.f42950D.f42944g, 0, 8);
            c9212d.m38751e(this.f42948B.f42944g, this.f42960N.f42948B.f42944g, 0, 4);
            c9217i = this.f42948B.f42944g;
            c9384d = this.f42960N.f42950D;
        } else if (i20 == 2) {
            c9212d.m38751e(this.f42951E.f42944g, this.f42949C.f42944g, 0, 8);
            c9212d.m38751e(this.f42949C.f42944g, this.f42960N.f42951E.f42944g, 0, 4);
            c9217i = this.f42949C.f42944g;
            c9384d = this.f42960N.f42949C;
        } else {
            if (i20 != 3) {
                return;
            }
            c9212d.m38751e(this.f42949C.f42944g, this.f42951E.f42944g, 0, 8);
            c9212d.m38751e(this.f42949C.f42944g, this.f42960N.f42949C.f42944g, 0, 4);
            c9217i = this.f42949C.f42944g;
            c9384d = this.f42960N.f42951E;
        }
        c9212d.m38751e(c9217i, c9384d.f42944g, 0, 0);
    }

    @Override // p373w.C9385e
    /* renamed from: g */
    public boolean mo39570g() {
        return true;
    }

    @Override // p373w.C9385e
    public String toString() {
        String str = "[Barrier] " + m39646p() + " {";
        for (int i10 = 0; i10 < this.f43053x0; i10++) {
            C9385e c9385e = this.f43052w0[i10];
            String str2 = str;
            if (i10 > 0) {
                str2 = str + ", ";
            }
            str = str2 + c9385e.m39646p();
        }
        return str + "}";
    }
}
