package p358v;

import java.util.ArrayList;
import java.util.Iterator;
import p358v.C9212d;
import p358v.C9217i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v/b.class
 */
/* renamed from: v.b */
/* loaded from: combined.jar:classes1.jar:v/b.class */
public class C9210b implements C9212d.a {

    /* renamed from: e */
    public a f42035e;

    /* renamed from: a */
    public C9217i f42031a = null;

    /* renamed from: b */
    public float f42032b = 0.0f;

    /* renamed from: c */
    public boolean f42033c = false;

    /* renamed from: d */
    public ArrayList<C9217i> f42034d = new ArrayList<>();

    /* renamed from: f */
    public boolean f42036f = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v/b$a.class
     */
    /* renamed from: v.b$a */
    /* loaded from: combined.jar:classes1.jar:v/b$a.class */
    public interface a {
        /* renamed from: a */
        float mo38700a(C9210b c9210b, boolean z10);

        /* renamed from: b */
        C9217i mo38701b(int i10);

        /* renamed from: c */
        void mo38702c();

        void clear();

        /* renamed from: d */
        float mo38703d(C9217i c9217i);

        /* renamed from: e */
        void mo38704e(C9217i c9217i, float f10);

        /* renamed from: f */
        int mo38705f();

        /* renamed from: g */
        boolean mo38706g(C9217i c9217i);

        /* renamed from: h */
        float mo38707h(int i10);

        /* renamed from: i */
        float mo38708i(C9217i c9217i, boolean z10);

        /* renamed from: j */
        void mo38709j(C9217i c9217i, float f10, boolean z10);

        /* renamed from: k */
        void mo38710k(float f10);
    }

    public C9210b() {
    }

    public C9210b(C9211c c9211c) {
        this.f42035e = new C9209a(this, c9211c);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: A */
    public java.lang.String m38711A() {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p358v.C9210b.m38711A():java.lang.String");
    }

    /* renamed from: B */
    public void m38712B(C9212d c9212d, C9217i c9217i, boolean z10) {
        if (c9217i.f42081g) {
            this.f42032b += c9217i.f42080f * this.f42035e.mo38703d(c9217i);
            this.f42035e.mo38708i(c9217i, z10);
            if (z10) {
                c9217i.m38785c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo38713C(C9210b c9210b, boolean z10) {
        this.f42032b += c9210b.f42032b * this.f42035e.mo38700a(c9210b, z10);
        if (z10) {
            c9210b.f42031a.m38785c(this);
        }
    }

    /* renamed from: D */
    public void m38714D(C9212d c9212d) {
        if (c9212d.f42050f.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int mo38705f = this.f42035e.mo38705f();
            for (int i10 = 0; i10 < mo38705f; i10++) {
                C9217i mo38701b = this.f42035e.mo38701b(i10);
                if (mo38701b.f42078d != -1 || mo38701b.f42081g) {
                    this.f42034d.add(mo38701b);
                }
            }
            if (this.f42034d.size() > 0) {
                Iterator<C9217i> it = this.f42034d.iterator();
                while (it.hasNext()) {
                    C9217i next = it.next();
                    if (next.f42081g) {
                        m38712B(c9212d, next, true);
                    } else {
                        mo38713C(c9212d.f42050f[next.f42078d], true);
                    }
                }
                this.f42034d.clear();
            } else {
                z10 = true;
            }
        }
    }

    @Override // p358v.C9212d.a
    /* renamed from: a */
    public C9217i mo38715a(C9212d c9212d, boolean[] zArr) {
        return m38738x(zArr, null);
    }

    @Override // p358v.C9212d.a
    /* renamed from: b */
    public void mo38716b(C9217i c9217i) {
        int i10 = c9217i.f42079e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f42035e.mo38704e(c9217i, f10);
    }

    @Override // p358v.C9212d.a
    /* renamed from: c */
    public void mo38717c(C9212d.a aVar) {
        if (aVar instanceof C9210b) {
            C9210b c9210b = (C9210b) aVar;
            this.f42031a = null;
            this.f42035e.clear();
            for (int i10 = 0; i10 < c9210b.f42035e.mo38705f(); i10++) {
                this.f42035e.mo38709j(c9210b.f42035e.mo38701b(i10), c9210b.f42035e.mo38707h(i10), true);
            }
        }
    }

    @Override // p358v.C9212d.a
    public void clear() {
        this.f42035e.clear();
        this.f42031a = null;
        this.f42032b = 0.0f;
    }

    /* renamed from: d */
    public C9210b m38718d(C9212d c9212d, int i10) {
        this.f42035e.mo38704e(c9212d.m38761o(i10, "ep"), 1.0f);
        this.f42035e.mo38704e(c9212d.m38761o(i10, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public C9210b m38719e(C9217i c9217i, int i10) {
        this.f42035e.mo38704e(c9217i, i10);
        return this;
    }

    /* renamed from: f */
    public boolean m38720f(C9212d c9212d) {
        boolean z10;
        C9217i m38721g = m38721g(c9212d);
        if (m38721g == null) {
            z10 = true;
        } else {
            m38739y(m38721g);
            z10 = false;
        }
        if (this.f42035e.mo38705f() == 0) {
            this.f42036f = true;
        }
        return z10;
    }

    /* renamed from: g */
    public C9217i m38721g(C9212d c9212d) {
        C9217i c9217i;
        C9217i c9217i2;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        int mo38705f = this.f42035e.mo38705f();
        C9217i c9217i3 = null;
        C9217i c9217i4 = null;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (true) {
            float f14 = f13;
            if (i10 >= mo38705f) {
                break;
            }
            float mo38707h = this.f42035e.mo38707h(i10);
            C9217i mo38701b = this.f42035e.mo38701b(i10);
            if (mo38701b.f42084j != C9217i.a.UNRESTRICTED) {
                c9217i = c9217i3;
                c9217i2 = c9217i4;
                z10 = z12;
                z11 = z13;
                f10 = f12;
                f11 = f14;
                if (c9217i3 == null) {
                    c9217i = c9217i3;
                    c9217i2 = c9217i4;
                    z10 = z12;
                    z11 = z13;
                    f10 = f12;
                    f11 = f14;
                    if (mo38707h < 0.0f) {
                        if (c9217i4 != null && f14 <= mo38707h) {
                            c9217i = c9217i3;
                            c9217i2 = c9217i4;
                            z10 = z12;
                            z11 = z13;
                            f10 = f12;
                            f11 = f14;
                            if (!z13) {
                                c9217i = c9217i3;
                                c9217i2 = c9217i4;
                                z10 = z12;
                                z11 = z13;
                                f10 = f12;
                                f11 = f14;
                                if (m38736v(mo38701b, c9212d)) {
                                    z11 = true;
                                    f11 = mo38707h;
                                    f10 = f12;
                                    z10 = z12;
                                    c9217i2 = mo38701b;
                                    c9217i = c9217i3;
                                }
                            }
                        } else {
                            z11 = m38736v(mo38701b, c9212d);
                            c9217i = c9217i3;
                            c9217i2 = mo38701b;
                            z10 = z12;
                            f10 = f12;
                            f11 = mo38707h;
                        }
                    }
                }
            } else if (c9217i3 != null && f12 <= mo38707h) {
                c9217i = c9217i3;
                c9217i2 = c9217i4;
                z10 = z12;
                z11 = z13;
                f10 = f12;
                f11 = f14;
                if (!z12) {
                    c9217i = c9217i3;
                    c9217i2 = c9217i4;
                    z10 = z12;
                    z11 = z13;
                    f10 = f12;
                    f11 = f14;
                    if (m38736v(mo38701b, c9212d)) {
                        z10 = true;
                        c9217i = mo38701b;
                        c9217i2 = c9217i4;
                        z11 = z13;
                        f10 = mo38707h;
                        f11 = f14;
                    }
                }
            } else {
                z10 = m38736v(mo38701b, c9212d);
                c9217i = mo38701b;
                c9217i2 = c9217i4;
                z11 = z13;
                f10 = mo38707h;
                f11 = f14;
            }
            i10++;
            c9217i3 = c9217i;
            c9217i4 = c9217i2;
            z12 = z10;
            z13 = z11;
            f12 = f10;
            f13 = f11;
        }
        return c9217i3 != null ? c9217i3 : c9217i4;
    }

    @Override // p358v.C9212d.a
    public C9217i getKey() {
        return this.f42031a;
    }

    /* renamed from: h */
    public C9210b m38722h(C9217i c9217i, C9217i c9217i2, int i10, float f10, C9217i c9217i3, C9217i c9217i4, int i11) {
        float f11;
        int i12;
        if (c9217i2 == c9217i3) {
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i4, 1.0f);
            this.f42035e.mo38704e(c9217i2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i2, -1.0f);
            this.f42035e.mo38704e(c9217i3, -1.0f);
            this.f42035e.mo38704e(c9217i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i12 = (-i10) + i11;
                f11 = i12;
            }
            return this;
        }
        if (f10 <= 0.0f) {
            this.f42035e.mo38704e(c9217i, -1.0f);
            this.f42035e.mo38704e(c9217i2, 1.0f);
            f11 = i10;
        } else {
            if (f10 < 1.0f) {
                float f12 = 1.0f - f10;
                this.f42035e.mo38704e(c9217i, f12 * 1.0f);
                this.f42035e.mo38704e(c9217i2, f12 * (-1.0f));
                this.f42035e.mo38704e(c9217i3, (-1.0f) * f10);
                this.f42035e.mo38704e(c9217i4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    f11 = ((-i10) * f12) + (i11 * f10);
                }
                return this;
            }
            this.f42035e.mo38704e(c9217i4, -1.0f);
            this.f42035e.mo38704e(c9217i3, 1.0f);
            i12 = -i11;
            f11 = i12;
        }
        this.f42032b = f11;
        return this;
    }

    /* renamed from: i */
    public C9210b m38723i(C9217i c9217i, int i10) {
        this.f42031a = c9217i;
        float f10 = i10;
        c9217i.f42080f = f10;
        this.f42032b = f10;
        this.f42036f = true;
        return this;
    }

    /* renamed from: j */
    public C9210b m38724j(C9217i c9217i, C9217i c9217i2, float f10) {
        this.f42035e.mo38704e(c9217i, -1.0f);
        this.f42035e.mo38704e(c9217i2, f10);
        return this;
    }

    /* renamed from: k */
    public C9210b m38725k(C9217i c9217i, C9217i c9217i2, C9217i c9217i3, C9217i c9217i4, float f10) {
        this.f42035e.mo38704e(c9217i, -1.0f);
        this.f42035e.mo38704e(c9217i2, 1.0f);
        this.f42035e.mo38704e(c9217i3, f10);
        this.f42035e.mo38704e(c9217i4, -f10);
        return this;
    }

    /* renamed from: l */
    public C9210b m38726l(float f10, float f11, float f12, C9217i c9217i, C9217i c9217i2, C9217i c9217i3, C9217i c9217i4) {
        this.f42032b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i2, -1.0f);
            this.f42035e.mo38704e(c9217i4, 1.0f);
            this.f42035e.mo38704e(c9217i3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f42035e.mo38704e(c9217i3, 1.0f);
            this.f42035e.mo38704e(c9217i4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i2, -1.0f);
            this.f42035e.mo38704e(c9217i4, f13);
            this.f42035e.mo38704e(c9217i3, -f13);
        }
        return this;
    }

    /* renamed from: m */
    public C9210b m38727m(C9217i c9217i, int i10) {
        a aVar;
        float f10;
        if (i10 < 0) {
            this.f42032b = i10 * (-1);
            aVar = this.f42035e;
            f10 = 1.0f;
        } else {
            this.f42032b = i10;
            aVar = this.f42035e;
            f10 = -1.0f;
        }
        aVar.mo38704e(c9217i, f10);
        return this;
    }

    /* renamed from: n */
    public C9210b m38728n(C9217i c9217i, C9217i c9217i2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            z10 = false;
            int i11 = i10;
            if (i10 < 0) {
                i11 = i10 * (-1);
                z10 = true;
            }
            this.f42032b = i11;
        }
        if (z10) {
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i2, -1.0f);
        } else {
            this.f42035e.mo38704e(c9217i, -1.0f);
            this.f42035e.mo38704e(c9217i2, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C9210b m38729o(C9217i c9217i, C9217i c9217i2, C9217i c9217i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            z10 = false;
            int i11 = i10;
            if (i10 < 0) {
                i11 = i10 * (-1);
                z10 = true;
            }
            this.f42032b = i11;
        }
        if (z10) {
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i2, -1.0f);
            this.f42035e.mo38704e(c9217i3, -1.0f);
        } else {
            this.f42035e.mo38704e(c9217i, -1.0f);
            this.f42035e.mo38704e(c9217i2, 1.0f);
            this.f42035e.mo38704e(c9217i3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C9210b m38730p(C9217i c9217i, C9217i c9217i2, C9217i c9217i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            z10 = false;
            int i11 = i10;
            if (i10 < 0) {
                i11 = i10 * (-1);
                z10 = true;
            }
            this.f42032b = i11;
        }
        if (z10) {
            this.f42035e.mo38704e(c9217i, 1.0f);
            this.f42035e.mo38704e(c9217i2, -1.0f);
            this.f42035e.mo38704e(c9217i3, 1.0f);
        } else {
            this.f42035e.mo38704e(c9217i, -1.0f);
            this.f42035e.mo38704e(c9217i2, 1.0f);
            this.f42035e.mo38704e(c9217i3, -1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C9210b m38731q(C9217i c9217i, C9217i c9217i2, C9217i c9217i3, C9217i c9217i4, float f10) {
        this.f42035e.mo38704e(c9217i3, 0.5f);
        this.f42035e.mo38704e(c9217i4, 0.5f);
        this.f42035e.mo38704e(c9217i, -0.5f);
        this.f42035e.mo38704e(c9217i2, -0.5f);
        this.f42032b = -f10;
        return this;
    }

    /* renamed from: r */
    public void m38732r() {
        float f10 = this.f42032b;
        if (f10 < 0.0f) {
            this.f42032b = f10 * (-1.0f);
            this.f42035e.mo38702c();
        }
    }

    /* renamed from: s */
    public boolean m38733s() {
        C9217i c9217i = this.f42031a;
        return c9217i != null && (c9217i.f42084j == C9217i.a.UNRESTRICTED || this.f42032b >= 0.0f);
    }

    /* renamed from: t */
    public boolean m38734t(C9217i c9217i) {
        return this.f42035e.mo38706g(c9217i);
    }

    public String toString() {
        return m38711A();
    }

    /* renamed from: u */
    public boolean m38735u() {
        return this.f42031a == null && this.f42032b == 0.0f && this.f42035e.mo38705f() == 0;
    }

    /* renamed from: v */
    public final boolean m38736v(C9217i c9217i, C9212d c9212d) {
        boolean z10 = true;
        if (c9217i.f42087m > 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: w */
    public C9217i m38737w(C9217i c9217i) {
        return m38738x(null, c9217i);
    }

    /* renamed from: x */
    public final C9217i m38738x(boolean[] zArr, C9217i c9217i) {
        int mo38705f = this.f42035e.mo38705f();
        C9217i c9217i2 = null;
        int i10 = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = f10;
            if (i10 >= mo38705f) {
                return c9217i2;
            }
            float mo38707h = this.f42035e.mo38707h(i10);
            C9217i c9217i3 = c9217i2;
            float f12 = f11;
            if (mo38707h < 0.0f) {
                C9217i mo38701b = this.f42035e.mo38701b(i10);
                if (zArr != null) {
                    c9217i3 = c9217i2;
                    f12 = f11;
                    if (zArr[mo38701b.f42077c]) {
                    }
                }
                c9217i3 = c9217i2;
                f12 = f11;
                if (mo38701b != c9217i) {
                    C9217i.a aVar = mo38701b.f42084j;
                    if (aVar != C9217i.a.SLACK) {
                        c9217i3 = c9217i2;
                        f12 = f11;
                        if (aVar != C9217i.a.ERROR) {
                        }
                    }
                    c9217i3 = c9217i2;
                    f12 = f11;
                    if (mo38707h < f11) {
                        f12 = mo38707h;
                        c9217i3 = mo38701b;
                    }
                }
            }
            i10++;
            c9217i2 = c9217i3;
            f10 = f12;
        }
    }

    /* renamed from: y */
    public void m38739y(C9217i c9217i) {
        C9217i c9217i2 = this.f42031a;
        if (c9217i2 != null) {
            this.f42035e.mo38704e(c9217i2, -1.0f);
            this.f42031a = null;
        }
        float mo38708i = this.f42035e.mo38708i(c9217i, true) * (-1.0f);
        this.f42031a = c9217i;
        if (mo38708i == 1.0f) {
            return;
        }
        this.f42032b /= mo38708i;
        this.f42035e.mo38710k(mo38708i);
    }

    /* renamed from: z */
    public void m38740z() {
        this.f42031a = null;
        this.f42035e.clear();
        this.f42032b = 0.0f;
        this.f42036f = false;
    }
}
