package p373w;

import p358v.C9212d;
import p358v.C9217i;
import p373w.C9384d;
import p373w.C9385e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/g.class
 */
/* renamed from: w.g */
/* loaded from: combined.jar:classes1.jar:w/g.class */
public class C9387g extends C9385e {

    /* renamed from: w0 */
    public float f43047w0 = -1.0f;

    /* renamed from: x0 */
    public int f43048x0 = -1;

    /* renamed from: y0 */
    public int f43049y0 = -1;

    /* renamed from: z0 */
    public C9384d f43050z0 = this.f42949C;

    /* renamed from: A0 */
    public int f43045A0 = 0;

    /* renamed from: B0 */
    public int f43046B0 = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w/g$a.class
     */
    /* renamed from: w.g$a */
    /* loaded from: combined.jar:classes1.jar:w/g$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f43051a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x008d
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
                p373w.C9387g.a.f43051a = r0
                r0 = r4
                w.d$b r1 = p373w.C9384d.b.LEFT     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L14:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L71 java.lang.NoSuchFieldError -> L75
                w.d$b r1 = p373w.C9384d.b.RIGHT     // Catch: java.lang.NoSuchFieldError -> L75
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L75
            L1f:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L75 java.lang.NoSuchFieldError -> L79
                w.d$b r1 = p373w.C9384d.b.TOP     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L2a:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L79 java.lang.NoSuchFieldError -> L7d
                w.d$b r1 = p373w.C9384d.b.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L35:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                w.d$b r1 = p373w.C9384d.b.BASELINE     // Catch: java.lang.NoSuchFieldError -> L81
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L81
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L81
            L40:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L81 java.lang.NoSuchFieldError -> L85
                w.d$b r1 = p373w.C9384d.b.CENTER     // Catch: java.lang.NoSuchFieldError -> L85
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L85
            L4c:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L85 java.lang.NoSuchFieldError -> L89
                w.d$b r1 = p373w.C9384d.b.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L89
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L89
            L58:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L89 java.lang.NoSuchFieldError -> L8d
                w.d$b r1 = p373w.C9384d.b.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
            L64:
                int[] r0 = p373w.C9387g.a.f43051a     // Catch: java.lang.NoSuchFieldError -> L8d java.lang.NoSuchFieldError -> L91
                w.d$b r1 = p373w.C9384d.b.NONE     // Catch: java.lang.NoSuchFieldError -> L91
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L91
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L91
            L70:
                return
            L71:
                r4 = move-exception
                goto L14
            L75:
                r4 = move-exception
                goto L1f
            L79:
                r4 = move-exception
                goto L2a
            L7d:
                r4 = move-exception
                goto L35
            L81:
                r4 = move-exception
                goto L40
            L85:
                r4 = move-exception
                goto L4c
            L89:
                r4 = move-exception
                goto L58
            L8d:
                r4 = move-exception
                goto L64
            L91:
                r4 = move-exception
                goto L70
            */
            throw new UnsupportedOperationException("Method not decompiled: p373w.C9387g.a.m46311clinit():void");
        }
    }

    public C9387g() {
        this.f42957K.clear();
        this.f42957K.add(this.f43050z0);
        int length = this.f42956J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f42956J[i10] = this.f43050z0;
        }
    }

    @Override // p373w.C9385e
    /* renamed from: G0 */
    public void mo39601G0(C9212d c9212d) {
        if (m39596E() == null) {
            return;
        }
        int m38768x = c9212d.m38768x(this.f43050z0);
        if (this.f43045A0 == 1) {
            m39593C0(m38768x);
            m39595D0(0);
            m39627e0(m39596E().m39654t());
            m39591B0(0);
            return;
        }
        m39593C0(0);
        m39595D0(m38768x);
        m39591B0(m39596E().m39608N());
        m39627e0(0);
    }

    /* renamed from: H0 */
    public int m39691H0() {
        return this.f43045A0;
    }

    /* renamed from: I0 */
    public int m39692I0() {
        return this.f43048x0;
    }

    /* renamed from: J0 */
    public int m39693J0() {
        return this.f43049y0;
    }

    /* renamed from: K0 */
    public float m39694K0() {
        return this.f43047w0;
    }

    /* renamed from: L0 */
    public void m39695L0(int i10) {
        if (i10 > -1) {
            this.f43047w0 = -1.0f;
            this.f43048x0 = i10;
            this.f43049y0 = -1;
        }
    }

    /* renamed from: M0 */
    public void m39696M0(int i10) {
        if (i10 > -1) {
            this.f43047w0 = -1.0f;
            this.f43048x0 = -1;
            this.f43049y0 = i10;
        }
    }

    /* renamed from: N0 */
    public void m39697N0(float f10) {
        if (f10 > -1.0f) {
            this.f43047w0 = f10;
            this.f43048x0 = -1;
            this.f43049y0 = -1;
        }
    }

    /* renamed from: O0 */
    public void m39698O0(int i10) {
        if (this.f43045A0 == i10) {
            return;
        }
        this.f43045A0 = i10;
        this.f42957K.clear();
        this.f43050z0 = this.f43045A0 == 1 ? this.f42948B : this.f42949C;
        this.f42957K.add(this.f43050z0);
        int length = this.f42956J.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f42956J[i11] = this.f43050z0;
        }
    }

    @Override // p373w.C9385e
    /* renamed from: f */
    public void mo39569f(C9212d c9212d) {
        C9386f c9386f = (C9386f) m39596E();
        if (c9386f == null) {
            return;
        }
        C9384d mo39636k = c9386f.mo39636k(C9384d.b.LEFT);
        C9384d mo39636k2 = c9386f.mo39636k(C9384d.b.RIGHT);
        C9385e c9385e = this.f42960N;
        boolean z10 = c9385e != null && c9385e.f42959M[0] == C9385e.b.WRAP_CONTENT;
        if (this.f43045A0 == 0) {
            mo39636k = c9386f.mo39636k(C9384d.b.TOP);
            mo39636k2 = c9386f.mo39636k(C9384d.b.BOTTOM);
            C9385e c9385e2 = this.f42960N;
            z10 = c9385e2 != null && c9385e2.f42959M[1] == C9385e.b.WRAP_CONTENT;
        }
        if (this.f43048x0 != -1) {
            C9217i m38763q = c9212d.m38763q(this.f43050z0);
            c9212d.m38751e(m38763q, c9212d.m38763q(mo39636k), this.f43048x0, 8);
            if (z10) {
                c9212d.m38754h(c9212d.m38763q(mo39636k2), m38763q, 0, 5);
                return;
            }
            return;
        }
        if (this.f43049y0 == -1) {
            if (this.f43047w0 != -1.0f) {
                c9212d.m38750d(C9212d.m38741s(c9212d, c9212d.m38763q(this.f43050z0), c9212d.m38763q(mo39636k2), this.f43047w0));
                return;
            }
            return;
        }
        C9217i m38763q2 = c9212d.m38763q(this.f43050z0);
        C9217i m38763q3 = c9212d.m38763q(mo39636k2);
        c9212d.m38751e(m38763q2, m38763q3, -this.f43049y0, 8);
        if (z10) {
            c9212d.m38754h(m38763q2, c9212d.m38763q(mo39636k), 0, 5);
            c9212d.m38754h(m38763q3, m38763q2, 0, 5);
        }
    }

    @Override // p373w.C9385e
    /* renamed from: g */
    public boolean mo39570g() {
        return true;
    }

    @Override // p373w.C9385e
    /* renamed from: k */
    public C9384d mo39636k(C9384d.b bVar) {
        switch (a.f43051a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f43045A0 == 1) {
                    return this.f43050z0;
                }
                break;
            case 3:
            case 4:
                if (this.f43045A0 == 0) {
                    return this.f43050z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
