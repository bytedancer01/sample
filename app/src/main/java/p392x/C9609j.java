package p392x;

import java.util.List;
import p373w.C9384d;
import p373w.C9385e;
import p373w.InterfaceC9388h;
import p392x.AbstractC9612m;
import p392x.C9605f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/j.class
 */
/* renamed from: x.j */
/* loaded from: combined.jar:classes1.jar:x/j.class */
public class C9609j extends AbstractC9612m {

    /* renamed from: k */
    public static int[] f43893k = new int[2];

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x/j$a.class
     */
    /* renamed from: x.j$a */
    /* loaded from: combined.jar:classes1.jar:x/j$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f43894a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                x.m$b[] r0 = p392x.AbstractC9612m.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p392x.C9609j.a.f43894a = r0
                r0 = r4
                x.m$b r1 = p392x.AbstractC9612m.b.START     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = p392x.C9609j.a.f43894a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                x.m$b r1 = p392x.AbstractC9612m.b.END     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = p392x.C9609j.a.f43894a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                x.m$b r1 = p392x.AbstractC9612m.b.CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: p392x.C9609j.a.m46368clinit():void");
        }
    }

    public C9609j(C9385e c9385e) {
        super(c9385e);
        this.f43913h.f43884e = C9605f.a.LEFT;
        this.f43914i.f43884e = C9605f.a.RIGHT;
        this.f43911f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x04fb, code lost:
    
        if (r0 != 1) goto L151;
     */
    @Override // p392x.AbstractC9612m, p392x.InterfaceC9603d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo40449a(p392x.InterfaceC9603d r10) {
        /*
            Method dump skipped, instructions count: 2003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.C9609j.mo40449a(x.d):void");
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: d */
    public void mo40450d() {
        C9385e m39596E;
        C9605f c9605f;
        C9605f c9605f2;
        int m39609O;
        C9605f c9605f3;
        C9384d c9384d;
        List<InterfaceC9603d> list;
        C9605f c9605f4;
        C9605f c9605f5;
        C9605f c9605f6;
        C9605f c9605f7;
        int m39609O2;
        C9605f c9605f8;
        C9605f c9605f9;
        int i10;
        C9385e m39596E2;
        C9385e c9385e = this.f43907b;
        if (c9385e.f42973a) {
            this.f43910e.mo40474d(c9385e.m39608N());
        }
        if (this.f43910e.f43889j) {
            C9385e.b bVar = this.f43909d;
            C9385e.b bVar2 = C9385e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((m39596E = this.f43907b.m39596E()) != null && m39596E.m39660w() == C9385e.b.FIXED) || m39596E.m39660w() == bVar2)) {
                m40484b(this.f43913h, m39596E.f42981e.f43913h, this.f43907b.f42948B.m39577b());
                m40484b(this.f43914i, m39596E.f42981e.f43914i, -this.f43907b.f42950D.m39577b());
                return;
            }
        } else {
            C9385e.b m39660w = this.f43907b.m39660w();
            this.f43909d = m39660w;
            if (m39660w != C9385e.b.MATCH_CONSTRAINT) {
                C9385e.b bVar3 = C9385e.b.MATCH_PARENT;
                if (m39660w == bVar3 && (((m39596E2 = this.f43907b.m39596E()) != null && m39596E2.m39660w() == C9385e.b.FIXED) || m39596E2.m39660w() == bVar3)) {
                    int m39608N = m39596E2.m39608N();
                    int m39577b = this.f43907b.f42948B.m39577b();
                    int m39577b2 = this.f43907b.f42950D.m39577b();
                    m40484b(this.f43913h, m39596E2.f42981e.f43913h, this.f43907b.f42948B.m39577b());
                    m40484b(this.f43914i, m39596E2.f42981e.f43914i, -this.f43907b.f42950D.m39577b());
                    this.f43910e.mo40474d((m39608N - m39577b) - m39577b2);
                    return;
                }
                if (this.f43909d == C9385e.b.FIXED) {
                    this.f43910e.mo40474d(this.f43907b.m39608N());
                }
            }
        }
        C9606g c9606g = this.f43910e;
        if (c9606g.f43889j) {
            C9385e c9385e2 = this.f43907b;
            if (c9385e2.f42973a) {
                C9384d[] c9384dArr = c9385e2.f42956J;
                C9384d c9384d2 = c9384dArr[0];
                C9384d c9384d3 = c9384d2.f42941d;
                if (c9384d3 != null && c9384dArr[1].f42941d != null) {
                    if (c9385e2.m39614T()) {
                        this.f43913h.f43885f = this.f43907b.f42956J[0].m39577b();
                        c9605f3 = this.f43914i;
                        c9384d = this.f43907b.f42956J[1];
                        c9605f3.f43885f = -c9384d.m39577b();
                        return;
                    }
                    C9605f m40487h = m40487h(this.f43907b.f42956J[0]);
                    if (m40487h != null) {
                        m40484b(this.f43913h, m40487h, this.f43907b.f42956J[0].m39577b());
                    }
                    C9605f m40487h2 = m40487h(this.f43907b.f42956J[1]);
                    if (m40487h2 != null) {
                        m40484b(this.f43914i, m40487h2, -this.f43907b.f42956J[1].m39577b());
                    }
                    this.f43913h.f43881b = true;
                    this.f43914i.f43881b = true;
                    return;
                }
                if (c9384d3 != null) {
                    c9605f6 = m40487h(c9384d2);
                    if (c9605f6 == null) {
                        return;
                    }
                    c9605f7 = this.f43913h;
                    m39609O2 = this.f43907b.f42956J[0].m39577b();
                } else {
                    C9384d c9384d4 = c9384dArr[1];
                    if (c9384d4.f42941d != null) {
                        C9605f m40487h3 = m40487h(c9384d4);
                        if (m40487h3 != null) {
                            m40484b(this.f43914i, m40487h3, -this.f43907b.f42956J[1].m39577b());
                            c9605f8 = this.f43913h;
                            c9605f9 = this.f43914i;
                            i10 = -this.f43910e.f43886g;
                            m40484b(c9605f8, c9605f9, i10);
                            return;
                        }
                        return;
                    }
                    if ((c9385e2 instanceof InterfaceC9388h) || c9385e2.m39596E() == null || this.f43907b.mo39636k(C9384d.b.CENTER).f42941d != null) {
                        return;
                    }
                    c9605f6 = this.f43907b.m39596E().f42981e.f43913h;
                    c9605f7 = this.f43913h;
                    m39609O2 = this.f43907b.m39609O();
                }
                m40484b(c9605f7, c9605f6, m39609O2);
                c9605f8 = this.f43914i;
                c9605f9 = this.f43913h;
                i10 = this.f43910e.f43886g;
                m40484b(c9605f8, c9605f9, i10);
                return;
            }
        }
        if (this.f43909d == C9385e.b.MATCH_CONSTRAINT) {
            C9385e c9385e3 = this.f43907b;
            int i11 = c9385e3.f42995l;
            if (i11 == 2) {
                C9385e m39596E3 = c9385e3.m39596E();
                if (m39596E3 != null) {
                    C9606g c9606g2 = m39596E3.f42983f.f43910e;
                    this.f43910e.f43891l.add(c9606g2);
                    c9606g2.f43890k.add(this.f43910e);
                    C9606g c9606g3 = this.f43910e;
                    c9606g3.f43881b = true;
                    c9606g3.f43890k.add(this.f43913h);
                    list = this.f43910e.f43890k;
                    c9605f4 = this.f43914i;
                    list.add(c9605f4);
                }
            } else if (i11 == 3) {
                if (c9385e3.f42997m == 3) {
                    this.f43913h.f43880a = this;
                    this.f43914i.f43880a = this;
                    C9611l c9611l = c9385e3.f42983f;
                    c9611l.f43913h.f43880a = this;
                    c9611l.f43914i.f43880a = this;
                    c9606g.f43880a = this;
                    if (c9385e3.m39616V()) {
                        this.f43910e.f43891l.add(this.f43907b.f42983f.f43910e);
                        this.f43907b.f42983f.f43910e.f43890k.add(this.f43910e);
                        C9611l c9611l2 = this.f43907b.f42983f;
                        c9611l2.f43910e.f43880a = this;
                        this.f43910e.f43891l.add(c9611l2.f43913h);
                        this.f43910e.f43891l.add(this.f43907b.f42983f.f43914i);
                        this.f43907b.f42983f.f43913h.f43890k.add(this.f43910e);
                        list = this.f43907b.f42983f.f43914i.f43890k;
                        c9605f4 = this.f43910e;
                        list.add(c9605f4);
                    } else if (this.f43907b.m39614T()) {
                        this.f43907b.f42983f.f43910e.f43891l.add(this.f43910e);
                        list = this.f43910e.f43890k;
                        c9605f4 = this.f43907b.f42983f.f43910e;
                        list.add(c9605f4);
                    } else {
                        c9605f5 = this.f43907b.f42983f.f43910e;
                    }
                } else {
                    C9606g c9606g4 = c9385e3.f42983f.f43910e;
                    c9606g.f43891l.add(c9606g4);
                    c9606g4.f43890k.add(this.f43910e);
                    this.f43907b.f42983f.f43913h.f43890k.add(this.f43910e);
                    this.f43907b.f42983f.f43914i.f43890k.add(this.f43910e);
                    C9606g c9606g5 = this.f43910e;
                    c9606g5.f43881b = true;
                    c9606g5.f43890k.add(this.f43913h);
                    this.f43910e.f43890k.add(this.f43914i);
                    this.f43913h.f43891l.add(this.f43910e);
                    c9605f5 = this.f43914i;
                }
                list = c9605f5.f43891l;
                c9605f4 = this.f43910e;
                list.add(c9605f4);
            }
            c9605f3.f43885f = -c9384d.m39577b();
            return;
        }
        C9385e c9385e4 = this.f43907b;
        C9384d[] c9384dArr2 = c9385e4.f42956J;
        C9384d c9384d5 = c9384dArr2[0];
        C9384d c9384d6 = c9384d5.f42941d;
        if (c9384d6 != null && c9384dArr2[1].f42941d != null) {
            if (c9385e4.m39614T()) {
                this.f43913h.f43885f = this.f43907b.f42956J[0].m39577b();
                c9605f3 = this.f43914i;
                c9384d = this.f43907b.f42956J[1];
                c9605f3.f43885f = -c9384d.m39577b();
                return;
            }
            C9605f m40487h4 = m40487h(this.f43907b.f42956J[0]);
            C9605f m40487h5 = m40487h(this.f43907b.f42956J[1]);
            m40487h4.m40472b(this);
            m40487h5.m40472b(this);
            this.f43915j = AbstractC9612m.b.CENTER;
            return;
        }
        if (c9384d6 != null) {
            c9605f = m40487h(c9384d5);
            if (c9605f == null) {
                return;
            }
            c9605f2 = this.f43913h;
            m39609O = this.f43907b.f42956J[0].m39577b();
        } else {
            C9384d c9384d7 = c9384dArr2[1];
            if (c9384d7.f42941d != null) {
                C9605f m40487h6 = m40487h(c9384d7);
                if (m40487h6 != null) {
                    m40484b(this.f43914i, m40487h6, -this.f43907b.f42956J[1].m39577b());
                    m40485c(this.f43913h, this.f43914i, -1, this.f43910e);
                    return;
                }
                return;
            }
            if ((c9385e4 instanceof InterfaceC9388h) || c9385e4.m39596E() == null) {
                return;
            }
            c9605f = this.f43907b.m39596E().f42981e.f43913h;
            c9605f2 = this.f43913h;
            m39609O = this.f43907b.m39609O();
        }
        m40484b(c9605f2, c9605f, m39609O);
        m40485c(this.f43914i, this.f43913h, 1, this.f43910e);
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: e */
    public void mo40451e() {
        C9605f c9605f = this.f43913h;
        if (c9605f.f43889j) {
            this.f43907b.m39593C0(c9605f.f43886g);
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: f */
    public void mo40452f() {
        this.f43908c = null;
        this.f43913h.m40473c();
        this.f43914i.m40473c();
        this.f43910e.m40473c();
        this.f43912g = false;
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: m */
    public boolean mo40454m() {
        return this.f43909d != C9385e.b.MATCH_CONSTRAINT || this.f43907b.f42995l == 0;
    }

    /* renamed from: q */
    public final void m40477q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* renamed from: r */
    public void m40478r() {
        this.f43912g = false;
        this.f43913h.m40473c();
        this.f43913h.f43889j = false;
        this.f43914i.m40473c();
        this.f43914i.f43889j = false;
        this.f43910e.f43889j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f43907b.m39646p();
    }
}
