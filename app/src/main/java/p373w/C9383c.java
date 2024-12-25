package p373w;

import java.util.ArrayList;
import p373w.C9385e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/c.class
 */
/* renamed from: w.c */
/* loaded from: combined.jar:classes1.jar:w/c.class */
public class C9383c {

    /* renamed from: a */
    public C9385e f42916a;

    /* renamed from: b */
    public C9385e f42917b;

    /* renamed from: c */
    public C9385e f42918c;

    /* renamed from: d */
    public C9385e f42919d;

    /* renamed from: e */
    public C9385e f42920e;

    /* renamed from: f */
    public C9385e f42921f;

    /* renamed from: g */
    public C9385e f42922g;

    /* renamed from: h */
    public ArrayList<C9385e> f42923h;

    /* renamed from: i */
    public int f42924i;

    /* renamed from: j */
    public int f42925j;

    /* renamed from: k */
    public float f42926k = 0.0f;

    /* renamed from: l */
    public int f42927l;

    /* renamed from: m */
    public int f42928m;

    /* renamed from: n */
    public int f42929n;

    /* renamed from: o */
    public boolean f42930o;

    /* renamed from: p */
    public int f42931p;

    /* renamed from: q */
    public boolean f42932q;

    /* renamed from: r */
    public boolean f42933r;

    /* renamed from: s */
    public boolean f42934s;

    /* renamed from: t */
    public boolean f42935t;

    /* renamed from: u */
    public boolean f42936u;

    /* renamed from: v */
    public boolean f42937v;

    public C9383c(C9385e c9385e, int i10, boolean z10) {
        this.f42916a = c9385e;
        this.f42931p = i10;
        this.f42932q = z10;
    }

    /* renamed from: c */
    public static boolean m39573c(C9385e c9385e, int i10) {
        int i11;
        return c9385e.m39607M() != 8 && c9385e.f42959M[i10] == C9385e.b.MATCH_CONSTRAINT && ((i11 = c9385e.f42999n[i10]) == 0 || i11 == 3);
    }

    /* renamed from: a */
    public void m39574a() {
        if (!this.f42937v) {
            m39575b();
        }
        this.f42937v = true;
    }

    /* renamed from: b */
    public final void m39575b() {
        int i10 = this.f42931p * 2;
        C9385e c9385e = this.f42916a;
        boolean z10 = true;
        this.f42930o = true;
        C9385e c9385e2 = c9385e;
        boolean z11 = false;
        while (!z11) {
            this.f42924i++;
            C9385e[] c9385eArr = c9385e.f43010s0;
            int i11 = this.f42931p;
            c9385eArr[i11] = null;
            c9385e.f43008r0[i11] = null;
            if (c9385e.m39607M() != 8) {
                this.f42927l++;
                C9385e.b m39648q = c9385e.m39648q(this.f42931p);
                C9385e.b bVar = C9385e.b.MATCH_CONSTRAINT;
                if (m39648q != bVar) {
                    this.f42928m += c9385e.m39664y(this.f42931p);
                }
                int m39577b = this.f42928m + c9385e.f42956J[i10].m39577b();
                this.f42928m = m39577b;
                int i12 = i10 + 1;
                this.f42928m = m39577b + c9385e.f42956J[i12].m39577b();
                int m39577b2 = this.f42929n + c9385e.f42956J[i10].m39577b();
                this.f42929n = m39577b2;
                this.f42929n = m39577b2 + c9385e.f42956J[i12].m39577b();
                if (this.f42917b == null) {
                    this.f42917b = c9385e;
                }
                this.f42919d = c9385e;
                C9385e.b[] bVarArr = c9385e.f42959M;
                int i13 = this.f42931p;
                if (bVarArr[i13] == bVar) {
                    int i14 = c9385e.f42999n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f42925j++;
                        float f10 = c9385e.f43006q0[i13];
                        if (f10 > 0.0f) {
                            this.f42926k += f10;
                        }
                        if (m39573c(c9385e, i13)) {
                            if (f10 < 0.0f) {
                                this.f42933r = true;
                            } else {
                                this.f42934s = true;
                            }
                            if (this.f42923h == null) {
                                this.f42923h = new ArrayList<>();
                            }
                            this.f42923h.add(c9385e);
                        }
                        if (this.f42921f == null) {
                            this.f42921f = c9385e;
                        }
                        C9385e c9385e3 = this.f42922g;
                        if (c9385e3 != null) {
                            c9385e3.f43008r0[this.f42931p] = c9385e;
                        }
                        this.f42922g = c9385e;
                    }
                    if (this.f42931p != 0 ? !(c9385e.f42997m == 0 && c9385e.f43007r == 0 && c9385e.f43009s == 0) : !(c9385e.f42995l == 0 && c9385e.f43001o == 0 && c9385e.f43003p == 0)) {
                        this.f42930o = false;
                    }
                    if (c9385e.f42963Q != 0.0f) {
                        this.f42930o = false;
                        this.f42936u = true;
                    }
                }
            }
            if (c9385e2 != c9385e) {
                c9385e2.f43010s0[this.f42931p] = c9385e;
            }
            C9384d c9384d = c9385e.f42956J[i10 + 1].f42941d;
            C9385e c9385e4 = null;
            if (c9384d != null) {
                C9385e c9385e5 = c9384d.f42939b;
                C9384d c9384d2 = c9385e5.f42956J[i10].f42941d;
                c9385e4 = null;
                if (c9384d2 != null) {
                    c9385e4 = c9384d2.f42939b != c9385e ? null : c9385e5;
                }
            }
            if (c9385e4 == null) {
                c9385e4 = c9385e;
                z11 = true;
            }
            C9385e c9385e6 = c9385e;
            c9385e = c9385e4;
            c9385e2 = c9385e6;
        }
        C9385e c9385e7 = this.f42917b;
        if (c9385e7 != null) {
            this.f42928m -= c9385e7.f42956J[i10].m39577b();
        }
        C9385e c9385e8 = this.f42919d;
        if (c9385e8 != null) {
            this.f42928m -= c9385e8.f42956J[i10 + 1].m39577b();
        }
        this.f42918c = c9385e;
        if (this.f42931p == 0 && this.f42932q) {
            this.f42920e = c9385e;
        } else {
            this.f42920e = this.f42916a;
        }
        if (!this.f42934s || !this.f42933r) {
            z10 = false;
        }
        this.f42935t = z10;
    }
}
