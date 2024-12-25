package p358v;

import java.util.Arrays;
import java.util.HashMap;
import p358v.C9217i;
import p373w.C9384d;
import p373w.C9385e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v/d.class
 */
/* renamed from: v.d */
/* loaded from: combined.jar:classes1.jar:v/d.class */
public class C9212d {

    /* renamed from: q */
    public static int f42041q = 1000;

    /* renamed from: r */
    public static boolean f42042r = true;

    /* renamed from: s */
    public static long f42043s;

    /* renamed from: t */
    public static long f42044t;

    /* renamed from: c */
    public a f42047c;

    /* renamed from: f */
    public C9210b[] f42050f;

    /* renamed from: m */
    public final C9211c f42057m;

    /* renamed from: p */
    public a f42060p;

    /* renamed from: a */
    public int f42045a = 0;

    /* renamed from: b */
    public HashMap<String, C9217i> f42046b = null;

    /* renamed from: d */
    public int f42048d = 32;

    /* renamed from: e */
    public int f42049e = 32;

    /* renamed from: g */
    public boolean f42051g = false;

    /* renamed from: h */
    public boolean f42052h = false;

    /* renamed from: i */
    public boolean[] f42053i = new boolean[32];

    /* renamed from: j */
    public int f42054j = 1;

    /* renamed from: k */
    public int f42055k = 0;

    /* renamed from: l */
    public int f42056l = 32;

    /* renamed from: n */
    public C9217i[] f42058n = new C9217i[f42041q];

    /* renamed from: o */
    public int f42059o = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v/d$a.class
     */
    /* renamed from: v.d$a */
    /* loaded from: combined.jar:classes1.jar:v/d$a.class */
    public interface a {
        /* renamed from: a */
        C9217i mo38715a(C9212d c9212d, boolean[] zArr);

        /* renamed from: b */
        void mo38716b(C9217i c9217i);

        /* renamed from: c */
        void mo38717c(a aVar);

        void clear();

        C9217i getKey();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v/d$b.class
     */
    /* renamed from: v.d$b */
    /* loaded from: combined.jar:classes1.jar:v/d$b.class */
    public class b extends C9210b {

        /* renamed from: g */
        public final C9212d f42061g;

        public b(C9212d c9212d, C9211c c9211c) {
            this.f42061g = c9212d;
            this.f42035e = new C9218j(this, c9211c);
        }
    }

    public C9212d() {
        this.f42050f = null;
        this.f42050f = new C9210b[32];
        m38745C();
        C9211c c9211c = new C9211c();
        this.f42057m = c9211c;
        this.f42047c = new C9216h(c9211c);
        this.f42060p = f42042r ? new b(this, c9211c) : new C9210b(c9211c);
    }

    /* renamed from: s */
    public static C9210b m38741s(C9212d c9212d, C9217i c9217i, C9217i c9217i2, float f10) {
        return c9212d.m38764r().m38724j(c9217i, c9217i2, f10);
    }

    /* renamed from: w */
    public static C9213e m38742w() {
        return null;
    }

    /* renamed from: A */
    public void m38743A(a aVar) {
        m38766u(aVar);
        m38744B(aVar, false);
        m38760n();
    }

    /* renamed from: B */
    public final int m38744B(a aVar, boolean z10) {
        int i10;
        float f10;
        int i11;
        for (int i12 = 0; i12 < this.f42054j; i12++) {
            this.f42053i[i12] = false;
        }
        boolean z11 = false;
        int i13 = 0;
        while (!z11) {
            int i14 = i13 + 1;
            if (i14 >= this.f42054j * 2) {
                return i14;
            }
            if (aVar.getKey() != null) {
                this.f42053i[aVar.getKey().f42077c] = true;
            }
            C9217i mo38715a = aVar.mo38715a(this, this.f42053i);
            if (mo38715a != null) {
                boolean[] zArr = this.f42053i;
                int i15 = mo38715a.f42077c;
                if (zArr[i15]) {
                    return i14;
                }
                zArr[i15] = true;
            }
            if (mo38715a != null) {
                float f11 = Float.MAX_VALUE;
                int i16 = 0;
                int i17 = -1;
                while (true) {
                    i10 = i17;
                    if (i16 >= this.f42055k) {
                        break;
                    }
                    C9210b c9210b = this.f42050f[i16];
                    if (c9210b.f42031a.f42084j == C9217i.a.UNRESTRICTED) {
                        f10 = f11;
                        i11 = i10;
                    } else if (c9210b.f42036f) {
                        f10 = f11;
                        i11 = i10;
                    } else {
                        f10 = f11;
                        i11 = i10;
                        if (c9210b.m38734t(mo38715a)) {
                            float mo38703d = c9210b.f42035e.mo38703d(mo38715a);
                            f10 = f11;
                            i11 = i10;
                            if (mo38703d < 0.0f) {
                                float f12 = (-c9210b.f42032b) / mo38703d;
                                f10 = f11;
                                i11 = i10;
                                if (f12 < f11) {
                                    i11 = i16;
                                    f10 = f12;
                                }
                            }
                        }
                    }
                    i16++;
                    f11 = f10;
                    i17 = i11;
                }
                i13 = i14;
                if (i10 > -1) {
                    C9210b c9210b2 = this.f42050f[i10];
                    c9210b2.f42031a.f42078d = -1;
                    c9210b2.m38739y(mo38715a);
                    C9217i c9217i = c9210b2.f42031a;
                    c9217i.f42078d = i10;
                    c9217i.m38789g(c9210b2);
                    i13 = i14;
                }
            } else {
                z11 = true;
                i13 = i14;
            }
        }
        return i13;
    }

    /* renamed from: C */
    public final void m38745C() {
        int i10 = 0;
        if (f42042r) {
            int i11 = 0;
            while (true) {
                C9210b[] c9210bArr = this.f42050f;
                if (i11 >= c9210bArr.length) {
                    return;
                }
                C9210b c9210b = c9210bArr[i11];
                if (c9210b != null) {
                    this.f42057m.f42037a.mo38771a(c9210b);
                }
                this.f42050f[i11] = null;
                i11++;
            }
        } else {
            while (true) {
                C9210b[] c9210bArr2 = this.f42050f;
                if (i10 >= c9210bArr2.length) {
                    return;
                }
                C9210b c9210b2 = c9210bArr2[i10];
                if (c9210b2 != null) {
                    this.f42057m.f42038b.mo38771a(c9210b2);
                }
                this.f42050f[i10] = null;
                i10++;
            }
        }
    }

    /* renamed from: D */
    public void m38746D() {
        C9211c c9211c;
        int i10 = 0;
        while (true) {
            c9211c = this.f42057m;
            C9217i[] c9217iArr = c9211c.f42040d;
            if (i10 >= c9217iArr.length) {
                break;
            }
            C9217i c9217i = c9217iArr[i10];
            if (c9217i != null) {
                c9217i.m38786d();
            }
            i10++;
        }
        c9211c.f42039c.mo38773c(this.f42058n, this.f42059o);
        this.f42059o = 0;
        Arrays.fill(this.f42057m.f42040d, (Object) null);
        HashMap<String, C9217i> hashMap = this.f42046b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f42045a = 0;
        this.f42047c.clear();
        this.f42054j = 1;
        for (int i11 = 0; i11 < this.f42055k; i11++) {
            this.f42050f[i11].f42033c = false;
        }
        m38745C();
        this.f42055k = 0;
        this.f42060p = f42042r ? new b(this, this.f42057m) : new C9210b(this.f42057m);
    }

    /* renamed from: a */
    public final C9217i m38747a(C9217i.a aVar, String str) {
        C9217i mo38772b = this.f42057m.f42039c.mo38772b();
        if (mo38772b == null) {
            mo38772b = new C9217i(aVar, str);
        } else {
            mo38772b.m38786d();
        }
        mo38772b.m38788f(aVar, str);
        int i10 = this.f42059o;
        int i11 = f42041q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f42041q = i12;
            this.f42058n = (C9217i[]) Arrays.copyOf(this.f42058n, i12);
        }
        C9217i[] c9217iArr = this.f42058n;
        int i13 = this.f42059o;
        this.f42059o = i13 + 1;
        c9217iArr[i13] = mo38772b;
        return mo38772b;
    }

    /* renamed from: b */
    public void m38748b(C9385e c9385e, C9385e c9385e2, float f10, int i10) {
        C9384d.b bVar = C9384d.b.LEFT;
        C9217i m38763q = m38763q(c9385e.mo39636k(bVar));
        C9384d.b bVar2 = C9384d.b.TOP;
        C9217i m38763q2 = m38763q(c9385e.mo39636k(bVar2));
        C9384d.b bVar3 = C9384d.b.RIGHT;
        C9217i m38763q3 = m38763q(c9385e.mo39636k(bVar3));
        C9384d.b bVar4 = C9384d.b.BOTTOM;
        C9217i m38763q4 = m38763q(c9385e.mo39636k(bVar4));
        C9217i m38763q5 = m38763q(c9385e2.mo39636k(bVar));
        C9217i m38763q6 = m38763q(c9385e2.mo39636k(bVar2));
        C9217i m38763q7 = m38763q(c9385e2.mo39636k(bVar3));
        C9217i m38763q8 = m38763q(c9385e2.mo39636k(bVar4));
        C9210b m38764r = m38764r();
        double d10 = f10;
        double sin = Math.sin(d10);
        double d11 = i10;
        m38764r.m38731q(m38763q2, m38763q4, m38763q6, m38763q8, (float) (sin * d11));
        m38750d(m38764r);
        C9210b m38764r2 = m38764r();
        m38764r2.m38731q(m38763q, m38763q3, m38763q5, m38763q7, (float) (Math.cos(d10) * d11));
        m38750d(m38764r2);
    }

    /* renamed from: c */
    public void m38749c(C9217i c9217i, C9217i c9217i2, int i10, float f10, C9217i c9217i3, C9217i c9217i4, int i11, int i12) {
        C9210b m38764r = m38764r();
        m38764r.m38722h(c9217i, c9217i2, i10, f10, c9217i3, c9217i4, i11);
        if (i12 != 8) {
            m38764r.m38718d(this, i12);
        }
        m38750d(m38764r);
    }

    /* renamed from: d */
    public void m38750d(C9210b c9210b) {
        C9217i m38737w;
        if (c9210b == null) {
            return;
        }
        if (this.f42055k + 1 >= this.f42056l || this.f42054j + 1 >= this.f42049e) {
            m38769y();
        }
        boolean z10 = false;
        if (!c9210b.f42036f) {
            c9210b.m38714D(this);
            if (c9210b.m38735u()) {
                return;
            }
            c9210b.m38732r();
            if (c9210b.m38720f(this)) {
                C9217i m38762p = m38762p();
                c9210b.f42031a = m38762p;
                m38758l(c9210b);
                this.f42060p.mo38717c(c9210b);
                m38744B(this.f42060p, true);
                z10 = true;
                if (m38762p.f42078d == -1) {
                    if (c9210b.f42031a == m38762p && (m38737w = c9210b.m38737w(m38762p)) != null) {
                        c9210b.m38739y(m38737w);
                    }
                    if (!c9210b.f42036f) {
                        c9210b.f42031a.m38789g(c9210b);
                    }
                    this.f42055k--;
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (!c9210b.m38733s()) {
                return;
            }
        }
        if (z10) {
            return;
        }
        m38758l(c9210b);
    }

    /* renamed from: e */
    public C9210b m38751e(C9217i c9217i, C9217i c9217i2, int i10, int i11) {
        if (i11 == 8 && c9217i2.f42081g && c9217i.f42078d == -1) {
            c9217i.m38787e(this, c9217i2.f42080f + i10);
            return null;
        }
        C9210b m38764r = m38764r();
        m38764r.m38728n(c9217i, c9217i2, i10);
        if (i11 != 8) {
            m38764r.m38718d(this, i11);
        }
        m38750d(m38764r);
        return m38764r;
    }

    /* renamed from: f */
    public void m38752f(C9217i c9217i, int i10) {
        C9210b c9210b;
        int i11 = c9217i.f42078d;
        if (i11 == -1) {
            c9217i.m38787e(this, i10);
            return;
        }
        if (i11 != -1) {
            C9210b c9210b2 = this.f42050f[i11];
            if (!c9210b2.f42036f) {
                if (c9210b2.f42035e.mo38705f() == 0) {
                    c9210b2.f42036f = true;
                } else {
                    C9210b m38764r = m38764r();
                    m38764r.m38727m(c9217i, i10);
                    c9210b = m38764r;
                }
            }
            c9210b2.f42032b = i10;
            return;
        }
        C9210b m38764r2 = m38764r();
        m38764r2.m38723i(c9217i, i10);
        c9210b = m38764r2;
        m38750d(c9210b);
    }

    /* renamed from: g */
    public void m38753g(C9217i c9217i, C9217i c9217i2, int i10, boolean z10) {
        C9210b m38764r = m38764r();
        C9217i m38765t = m38765t();
        m38765t.f42079e = 0;
        m38764r.m38729o(c9217i, c9217i2, m38765t, i10);
        m38750d(m38764r);
    }

    /* renamed from: h */
    public void m38754h(C9217i c9217i, C9217i c9217i2, int i10, int i11) {
        C9210b m38764r = m38764r();
        C9217i m38765t = m38765t();
        m38765t.f42079e = 0;
        m38764r.m38729o(c9217i, c9217i2, m38765t, i10);
        if (i11 != 8) {
            m38759m(m38764r, (int) (m38764r.f42035e.mo38703d(m38765t) * (-1.0f)), i11);
        }
        m38750d(m38764r);
    }

    /* renamed from: i */
    public void m38755i(C9217i c9217i, C9217i c9217i2, int i10, boolean z10) {
        C9210b m38764r = m38764r();
        C9217i m38765t = m38765t();
        m38765t.f42079e = 0;
        m38764r.m38730p(c9217i, c9217i2, m38765t, i10);
        m38750d(m38764r);
    }

    /* renamed from: j */
    public void m38756j(C9217i c9217i, C9217i c9217i2, int i10, int i11) {
        C9210b m38764r = m38764r();
        C9217i m38765t = m38765t();
        m38765t.f42079e = 0;
        m38764r.m38730p(c9217i, c9217i2, m38765t, i10);
        if (i11 != 8) {
            m38759m(m38764r, (int) (m38764r.f42035e.mo38703d(m38765t) * (-1.0f)), i11);
        }
        m38750d(m38764r);
    }

    /* renamed from: k */
    public void m38757k(C9217i c9217i, C9217i c9217i2, C9217i c9217i3, C9217i c9217i4, float f10, int i10) {
        C9210b m38764r = m38764r();
        m38764r.m38725k(c9217i, c9217i2, c9217i3, c9217i4, f10);
        if (i10 != 8) {
            m38764r.m38718d(this, i10);
        }
        m38750d(m38764r);
    }

    /* renamed from: l */
    public final void m38758l(C9210b c9210b) {
        C9210b c9210b2;
        InterfaceC9214f<C9210b> interfaceC9214f;
        if (f42042r) {
            c9210b2 = this.f42050f[this.f42055k];
            if (c9210b2 != null) {
                interfaceC9214f = this.f42057m.f42037a;
                interfaceC9214f.mo38771a(c9210b2);
            }
        } else {
            c9210b2 = this.f42050f[this.f42055k];
            if (c9210b2 != null) {
                interfaceC9214f = this.f42057m.f42038b;
                interfaceC9214f.mo38771a(c9210b2);
            }
        }
        C9210b[] c9210bArr = this.f42050f;
        int i10 = this.f42055k;
        c9210bArr[i10] = c9210b;
        C9217i c9217i = c9210b.f42031a;
        c9217i.f42078d = i10;
        this.f42055k = i10 + 1;
        c9217i.m38789g(c9210b);
    }

    /* renamed from: m */
    public void m38759m(C9210b c9210b, int i10, int i11) {
        c9210b.m38719e(m38761o(i11, null), i10);
    }

    /* renamed from: n */
    public final void m38760n() {
        for (int i10 = 0; i10 < this.f42055k; i10++) {
            C9210b c9210b = this.f42050f[i10];
            c9210b.f42031a.f42080f = c9210b.f42032b;
        }
    }

    /* renamed from: o */
    public C9217i m38761o(int i10, String str) {
        if (this.f42054j + 1 >= this.f42049e) {
            m38769y();
        }
        C9217i m38747a = m38747a(C9217i.a.ERROR, str);
        int i11 = this.f42045a + 1;
        this.f42045a = i11;
        this.f42054j++;
        m38747a.f42077c = i11;
        m38747a.f42079e = i10;
        this.f42057m.f42040d[i11] = m38747a;
        this.f42047c.mo38716b(m38747a);
        return m38747a;
    }

    /* renamed from: p */
    public C9217i m38762p() {
        if (this.f42054j + 1 >= this.f42049e) {
            m38769y();
        }
        C9217i m38747a = m38747a(C9217i.a.SLACK, null);
        int i10 = this.f42045a + 1;
        this.f42045a = i10;
        this.f42054j++;
        m38747a.f42077c = i10;
        this.f42057m.f42040d[i10] = m38747a;
        return m38747a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r4.f42057m.f42040d[r0] == null) goto L20;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p358v.C9217i m38763q(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r4
            int r0 = r0.f42054j
            r1 = 1
            int r0 = r0 + r1
            r1 = r4
            int r1 = r1.f42049e
            if (r0 < r1) goto L19
            r0 = r4
            r0.m38769y()
        L19:
            r0 = r5
            boolean r0 = r0 instanceof p373w.C9384d
            if (r0 == 0) goto L98
            r0 = r5
            w.d r0 = (p373w.C9384d) r0
            r8 = r0
            r0 = r8
            v.i r0 = r0.m39580e()
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L41
            r0 = r8
            r1 = r4
            v.c r1 = r1.f42057m
            r0.m39587l(r1)
            r0 = r8
            v.i r0 = r0.m39580e()
            r5 = r0
        L41:
            r0 = r5
            int r0 = r0.f42077c
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L61
            r0 = r6
            r1 = r4
            int r1 = r1.f42045a
            if (r0 > r1) goto L61
            r0 = r5
            r7 = r0
            r0 = r4
            v.c r0 = r0.f42057m
            v.i[] r0 = r0.f42040d
            r1 = r6
            r0 = r0[r1]
            if (r0 != 0) goto L98
        L61:
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L6a
            r0 = r5
            r0.m38786d()
        L6a:
            r0 = r4
            int r0 = r0.f42045a
            r1 = 1
            int r0 = r0 + r1
            r6 = r0
            r0 = r4
            r1 = r6
            r0.f42045a = r1
            r0 = r4
            r1 = r4
            int r1 = r1.f42054j
            r2 = 1
            int r1 = r1 + r2
            r0.f42054j = r1
            r0 = r5
            r1 = r6
            r0.f42077c = r1
            r0 = r5
            v.i$a r1 = p358v.C9217i.a.UNRESTRICTED
            r0.f42084j = r1
            r0 = r4
            v.c r0 = r0.f42057m
            v.i[] r0 = r0.f42040d
            r1 = r6
            r2 = r5
            r0[r1] = r2
            r0 = r5
            r7 = r0
        L98:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p358v.C9212d.m38763q(java.lang.Object):v.i");
    }

    /* renamed from: r */
    public C9210b m38764r() {
        C9210b c9210b;
        if (f42042r) {
            C9210b mo38772b = this.f42057m.f42037a.mo38772b();
            c9210b = mo38772b;
            if (mo38772b == null) {
                c9210b = new b(this, this.f42057m);
                f42044t++;
            }
            c9210b.m38740z();
        } else {
            C9210b mo38772b2 = this.f42057m.f42038b.mo38772b();
            c9210b = mo38772b2;
            if (mo38772b2 == null) {
                c9210b = new C9210b(this.f42057m);
                f42043s++;
            }
            c9210b.m38740z();
        }
        C9217i.m38783b();
        return c9210b;
    }

    /* renamed from: t */
    public C9217i m38765t() {
        if (this.f42054j + 1 >= this.f42049e) {
            m38769y();
        }
        C9217i m38747a = m38747a(C9217i.a.SLACK, null);
        int i10 = this.f42045a + 1;
        this.f42045a = i10;
        this.f42054j++;
        m38747a.f42077c = i10;
        this.f42057m.f42040d[i10] = m38747a;
        return m38747a;
    }

    /* renamed from: u */
    public final int m38766u(a aVar) {
        boolean z10;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        while (true) {
            if (i18 >= this.f42055k) {
                z10 = false;
                break;
            }
            C9210b c9210b = this.f42050f[i18];
            if (c9210b.f42031a.f42084j != C9217i.a.UNRESTRICTED && c9210b.f42032b < 0.0f) {
                z10 = true;
                break;
            }
            i18++;
        }
        if (z10) {
            boolean z11 = false;
            int i19 = 0;
            while (true) {
                i10 = i19;
                if (z11) {
                    break;
                }
                int i20 = i10 + 1;
                float f12 = Float.MAX_VALUE;
                int i21 = 0;
                int i22 = -1;
                int i23 = -1;
                int i24 = 0;
                while (true) {
                    int i25 = i24;
                    if (i21 >= this.f42055k) {
                        break;
                    }
                    C9210b c9210b2 = this.f42050f[i21];
                    if (c9210b2.f42031a.f42084j == C9217i.a.UNRESTRICTED) {
                        f10 = f12;
                        i11 = i22;
                        i12 = i23;
                        i13 = i25;
                    } else if (c9210b2.f42036f) {
                        f10 = f12;
                        i11 = i22;
                        i12 = i23;
                        i13 = i25;
                    } else {
                        f10 = f12;
                        i11 = i22;
                        i12 = i23;
                        i13 = i25;
                        if (c9210b2.f42032b < 0.0f) {
                            int i26 = 1;
                            while (true) {
                                f10 = f12;
                                i11 = i22;
                                i12 = i23;
                                i13 = i25;
                                if (i26 < this.f42054j) {
                                    C9217i c9217i = this.f42057m.f42040d[i26];
                                    float mo38703d = c9210b2.f42035e.mo38703d(c9217i);
                                    if (mo38703d <= 0.0f) {
                                        f11 = f12;
                                        i14 = i22;
                                        i15 = i23;
                                        i16 = i25;
                                    } else {
                                        int i27 = i22;
                                        int i28 = 0;
                                        while (true) {
                                            f11 = f12;
                                            i14 = i27;
                                            i15 = i23;
                                            i16 = i25;
                                            if (i28 < 9) {
                                                float f13 = c9217i.f42082h[i28] / mo38703d;
                                                if (f13 >= f12 || i28 != i25) {
                                                    i17 = i25;
                                                    if (i28 <= i25) {
                                                        i28++;
                                                        i25 = i17;
                                                    }
                                                }
                                                i17 = i28;
                                                f12 = f13;
                                                i27 = i21;
                                                i23 = i26;
                                                i28++;
                                                i25 = i17;
                                            }
                                        }
                                    }
                                    i26++;
                                    f12 = f11;
                                    i22 = i14;
                                    i23 = i15;
                                    i25 = i16;
                                }
                            }
                        }
                    }
                    i21++;
                    f12 = f10;
                    i22 = i11;
                    i23 = i12;
                    i24 = i13;
                }
                if (i22 != -1) {
                    C9210b c9210b3 = this.f42050f[i22];
                    c9210b3.f42031a.f42078d = -1;
                    c9210b3.m38739y(this.f42057m.f42040d[i23]);
                    C9217i c9217i2 = c9210b3.f42031a;
                    c9217i2.f42078d = i22;
                    c9217i2.m38789g(c9210b3);
                } else {
                    z11 = true;
                }
                if (i20 > this.f42054j / 2) {
                    z11 = true;
                }
                i19 = i20;
            }
        } else {
            i10 = 0;
        }
        return i10;
    }

    /* renamed from: v */
    public C9211c m38767v() {
        return this.f42057m;
    }

    /* renamed from: x */
    public int m38768x(Object obj) {
        C9217i m39580e = ((C9384d) obj).m39580e();
        if (m39580e != null) {
            return (int) (m39580e.f42080f + 0.5f);
        }
        return 0;
    }

    /* renamed from: y */
    public final void m38769y() {
        int i10 = this.f42048d * 2;
        this.f42048d = i10;
        this.f42050f = (C9210b[]) Arrays.copyOf(this.f42050f, i10);
        C9211c c9211c = this.f42057m;
        c9211c.f42040d = (C9217i[]) Arrays.copyOf(c9211c.f42040d, this.f42048d);
        int i11 = this.f42048d;
        this.f42053i = new boolean[i11];
        this.f42049e = i11;
        this.f42056l = i11;
    }

    /* renamed from: z */
    public void m38770z() {
        boolean z10;
        if (this.f42051g || this.f42052h) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f42055k) {
                    z10 = true;
                    break;
                } else {
                    if (!this.f42050f[i10].f42036f) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            if (z10) {
                m38760n();
                return;
            }
        }
        m38743A(this.f42047c);
    }
}
