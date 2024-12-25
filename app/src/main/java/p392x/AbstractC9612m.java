package p392x;

import p373w.C9384d;
import p373w.C9385e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/m.class
 */
/* renamed from: x.m */
/* loaded from: combined.jar:classes1.jar:x/m.class */
public abstract class AbstractC9612m implements InterfaceC9603d {

    /* renamed from: a */
    public int f43906a;

    /* renamed from: b */
    public C9385e f43907b;

    /* renamed from: c */
    public C9610k f43908c;

    /* renamed from: d */
    public C9385e.b f43909d;

    /* renamed from: e */
    public C9606g f43910e = new C9606g(this);

    /* renamed from: f */
    public int f43911f = 0;

    /* renamed from: g */
    public boolean f43912g = false;

    /* renamed from: h */
    public C9605f f43913h = new C9605f(this);

    /* renamed from: i */
    public C9605f f43914i = new C9605f(this);

    /* renamed from: j */
    public b f43915j = b.NONE;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x/m$a.class
     */
    /* renamed from: x.m$a */
    /* loaded from: combined.jar:classes1.jar:x/m$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f43916a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                w.d$b[] r0 = p373w.C9384d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p392x.AbstractC9612m.a.f43916a = r0
                r0 = r4
                w.d$b r1 = p373w.C9384d.b.LEFT     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = p392x.AbstractC9612m.a.f43916a     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                w.d$b r1 = p373w.C9384d.b.RIGHT     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = p392x.AbstractC9612m.a.f43916a     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                w.d$b r1 = p373w.C9384d.b.TOP     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = p392x.AbstractC9612m.a.f43916a     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                w.d$b r1 = p373w.C9384d.b.BASELINE     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = p392x.AbstractC9612m.a.f43916a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                w.d$b r1 = p373w.C9384d.b.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: p392x.AbstractC9612m.a.m46370clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x/m$b.class
     */
    /* renamed from: x.m$b */
    /* loaded from: combined.jar:classes1.jar:x/m$b.class */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC9612m(C9385e c9385e) {
        this.f43907b = c9385e;
    }

    @Override // p392x.InterfaceC9603d
    /* renamed from: a */
    public void mo40449a(InterfaceC9603d interfaceC9603d) {
    }

    /* renamed from: b */
    public final void m40484b(C9605f c9605f, C9605f c9605f2, int i10) {
        c9605f.f43891l.add(c9605f2);
        c9605f.f43885f = i10;
        c9605f2.f43890k.add(c9605f);
    }

    /* renamed from: c */
    public final void m40485c(C9605f c9605f, C9605f c9605f2, int i10, C9606g c9606g) {
        c9605f.f43891l.add(c9605f2);
        c9605f.f43891l.add(this.f43910e);
        c9605f.f43887h = i10;
        c9605f.f43888i = c9606g;
        c9605f2.f43890k.add(c9605f);
        c9606g.f43890k.add(c9605f);
    }

    /* renamed from: d */
    public abstract void mo40450d();

    /* renamed from: e */
    public abstract void mo40451e();

    /* renamed from: f */
    public abstract void mo40452f();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r5 != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r5 != r4) goto L15;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m40486g(int r4, int r5) {
        /*
            r3 = this;
            r0 = r5
            if (r0 != 0) goto L2e
            r0 = r3
            w.e r0 = r0.f43907b
            r7 = r0
            r0 = r7
            int r0 = r0.f43003p
            r6 = r0
            r0 = r7
            int r0 = r0.f43001o
            r1 = r4
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
            r0 = r6
            if (r0 <= 0) goto L24
            r0 = r6
            r1 = r4
            int r0 = java.lang.Math.min(r0, r1)
            r5 = r0
        L24:
            r0 = r4
            r6 = r0
            r0 = r5
            r1 = r4
            if (r0 == r1) goto L57
            goto L55
        L2e:
            r0 = r3
            w.e r0 = r0.f43907b
            r7 = r0
            r0 = r7
            int r0 = r0.f43009s
            r6 = r0
            r0 = r7
            int r0 = r0.f43007r
            r1 = r4
            int r0 = java.lang.Math.max(r0, r1)
            r5 = r0
            r0 = r6
            if (r0 <= 0) goto L4e
            r0 = r6
            r1 = r4
            int r0 = java.lang.Math.min(r0, r1)
            r5 = r0
        L4e:
            r0 = r4
            r6 = r0
            r0 = r5
            r1 = r4
            if (r0 == r1) goto L57
        L55:
            r0 = r5
            r6 = r0
        L57:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.AbstractC9612m.m40486g(int, int):int");
    }

    /* renamed from: h */
    public final C9605f m40487h(C9384d c9384d) {
        AbstractC9612m abstractC9612m;
        AbstractC9612m abstractC9612m2;
        C9384d c9384d2 = c9384d.f42941d;
        C9605f c9605f = null;
        if (c9384d2 == null) {
            return null;
        }
        C9385e c9385e = c9384d2.f42939b;
        int i10 = a.f43916a[c9384d2.f42940c.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                abstractC9612m2 = c9385e.f42981e;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        c9605f = c9385e.f42983f.f43903k;
                    } else if (i10 == 5) {
                        abstractC9612m2 = c9385e.f42983f;
                    }
                    return c9605f;
                }
                abstractC9612m = c9385e.f42983f;
            }
            c9605f = abstractC9612m2.f43914i;
            return c9605f;
        }
        abstractC9612m = c9385e.f42981e;
        c9605f = abstractC9612m.f43913h;
        return c9605f;
    }

    /* renamed from: i */
    public final C9605f m40488i(C9384d c9384d, int i10) {
        C9605f c9605f;
        C9384d c9384d2 = c9384d.f42941d;
        if (c9384d2 == null) {
            return null;
        }
        C9385e c9385e = c9384d2.f42939b;
        AbstractC9612m abstractC9612m = i10 == 0 ? c9385e.f42981e : c9385e.f42983f;
        int i11 = a.f43916a[c9384d2.f42940c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        c9605f = null;
                        return c9605f;
                    }
                }
            }
            c9605f = abstractC9612m.f43914i;
            return c9605f;
        }
        c9605f = abstractC9612m.f43913h;
        return c9605f;
    }

    /* renamed from: j */
    public long mo40453j() {
        if (this.f43910e.f43889j) {
            return r0.f43886g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m40489k() {
        return this.f43912g;
    }

    /* renamed from: l */
    public final void m40490l(int i10, int i11) {
        C9606g c9606g;
        int m40486g;
        int i12 = this.f43906a;
        int i13 = i11;
        if (i12 != 0) {
            if (i12 == 1) {
                int m40486g2 = m40486g(this.f43910e.f43892m, i10);
                c9606g = this.f43910e;
                m40486g = Math.min(m40486g2, i11);
                c9606g.mo40474d(m40486g);
            }
            if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                C9385e c9385e = this.f43907b;
                AbstractC9612m abstractC9612m = c9385e.f42981e;
                C9385e.b bVar = abstractC9612m.f43909d;
                C9385e.b bVar2 = C9385e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && abstractC9612m.f43906a == 3) {
                    C9611l c9611l = c9385e.f42983f;
                    if (c9611l.f43909d == bVar2 && c9611l.f43906a == 3) {
                        return;
                    }
                }
                if (i10 == 0) {
                    abstractC9612m = c9385e.f42983f;
                }
                if (abstractC9612m.f43910e.f43889j) {
                    float m39650r = c9385e.m39650r();
                    this.f43910e.mo40474d(i10 == 1 ? (int) ((abstractC9612m.f43910e.f43886g / m39650r) + 0.5f) : (int) ((m39650r * abstractC9612m.f43910e.f43886g) + 0.5f));
                    return;
                }
                return;
            }
            C9385e m39596E = this.f43907b.m39596E();
            if (m39596E == null) {
                return;
            }
            if (!(i10 == 0 ? m39596E.f42981e : m39596E.f42983f).f43910e.f43889j) {
                return;
            }
            C9385e c9385e2 = this.f43907b;
            i13 = (int) ((r0.f43886g * (i10 == 0 ? c9385e2.f43005q : c9385e2.f43011t)) + 0.5f);
        }
        c9606g = this.f43910e;
        m40486g = m40486g(i13, i10);
        c9606g.mo40474d(m40486g);
    }

    /* renamed from: m */
    public abstract boolean mo40454m();

    /* renamed from: n */
    public void m40491n(InterfaceC9603d interfaceC9603d, C9384d c9384d, C9384d c9384d2, int i10) {
        C9605f c9605f;
        C9605f m40487h = m40487h(c9384d);
        C9605f m40487h2 = m40487h(c9384d2);
        if (m40487h.f43889j && m40487h2.f43889j) {
            int m39577b = m40487h.f43886g + c9384d.m39577b();
            int m39577b2 = m40487h2.f43886g - c9384d2.m39577b();
            int i11 = m39577b2 - m39577b;
            if (!this.f43910e.f43889j && this.f43909d == C9385e.b.MATCH_CONSTRAINT) {
                m40490l(i10, i11);
            }
            C9606g c9606g = this.f43910e;
            if (c9606g.f43889j) {
                if (c9606g.f43886g == i11) {
                    this.f43913h.mo40474d(m39577b);
                    c9605f = this.f43914i;
                } else {
                    C9385e c9385e = this.f43907b;
                    float m39656u = i10 == 0 ? c9385e.m39656u() : c9385e.m39603I();
                    int i12 = m39577b;
                    if (m40487h == m40487h2) {
                        i12 = m40487h.f43886g;
                        m39577b2 = m40487h2.f43886g;
                        m39656u = 0.5f;
                    }
                    this.f43913h.mo40474d((int) (i12 + 0.5f + (((m39577b2 - i12) - this.f43910e.f43886g) * m39656u)));
                    c9605f = this.f43914i;
                    m39577b2 = this.f43913h.f43886g + this.f43910e.f43886g;
                }
                c9605f.mo40474d(m39577b2);
            }
        }
    }

    /* renamed from: o */
    public void m40492o(InterfaceC9603d interfaceC9603d) {
    }

    /* renamed from: p */
    public void m40493p(InterfaceC9603d interfaceC9603d) {
    }
}
