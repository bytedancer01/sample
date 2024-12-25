package p392x;

import p373w.C9385e;
import p392x.C9605f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/l.class
 */
/* renamed from: x.l */
/* loaded from: combined.jar:classes1.jar:x/l.class */
public class C9611l extends AbstractC9612m {

    /* renamed from: k */
    public C9605f f43903k;

    /* renamed from: l */
    public C9606g f43904l;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x/l$a.class
     */
    /* renamed from: x.l$a */
    /* loaded from: combined.jar:classes1.jar:x/l$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f43905a;

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
                p392x.C9611l.a.f43905a = r0
                r0 = r4
                x.m$b r1 = p392x.AbstractC9612m.b.START     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = p392x.C9611l.a.f43905a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                x.m$b r1 = p392x.AbstractC9612m.b.END     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = p392x.C9611l.a.f43905a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
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
            throw new UnsupportedOperationException("Method not decompiled: p392x.C9611l.a.m46369clinit():void");
        }
    }

    public C9611l(C9385e c9385e) {
        super(c9385e);
        C9605f c9605f = new C9605f(this);
        this.f43903k = c9605f;
        this.f43904l = null;
        this.f43913h.f43884e = C9605f.a.TOP;
        this.f43914i.f43884e = C9605f.a.BOTTOM;
        c9605f.f43884e = C9605f.a.BASELINE;
        this.f43911f = 1;
    }

    @Override // p392x.AbstractC9612m, p392x.InterfaceC9603d
    /* renamed from: a */
    public void mo40449a(InterfaceC9603d interfaceC9603d) {
        int i10;
        float m39650r;
        int i11 = a.f43905a[this.f43915j.ordinal()];
        if (i11 == 1) {
            m40493p(interfaceC9603d);
        } else if (i11 == 2) {
            m40492o(interfaceC9603d);
        } else if (i11 == 3) {
            C9385e c9385e = this.f43907b;
            m40491n(interfaceC9603d, c9385e.f42949C, c9385e.f42951E, 1);
            return;
        }
        C9606g c9606g = this.f43910e;
        if (c9606g.f43882c && !c9606g.f43889j && this.f43909d == C9385e.b.MATCH_CONSTRAINT) {
            C9385e c9385e2 = this.f43907b;
            int i12 = c9385e2.f42997m;
            if (i12 == 2) {
                C9385e m39596E = c9385e2.m39596E();
                if (m39596E != null) {
                    if (m39596E.f42983f.f43910e.f43889j) {
                        i10 = (int) ((r0.f43886g * this.f43907b.f43011t) + 0.5f);
                        this.f43910e.mo40474d(i10);
                    }
                }
            } else if (i12 == 3 && c9385e2.f42981e.f43910e.f43889j) {
                int m39652s = c9385e2.m39652s();
                if (m39652s != -1) {
                    if (m39652s == 0) {
                        m39650r = r0.f42981e.f43910e.f43886g * this.f43907b.m39650r();
                        i10 = (int) (m39650r + 0.5f);
                        this.f43910e.mo40474d(i10);
                    } else if (m39652s != 1) {
                        i10 = 0;
                        this.f43910e.mo40474d(i10);
                    }
                }
                m39650r = r0.f42981e.f43910e.f43886g / this.f43907b.m39650r();
                i10 = (int) (m39650r + 0.5f);
                this.f43910e.mo40474d(i10);
            }
        }
        C9605f c9605f = this.f43913h;
        if (c9605f.f43882c) {
            C9605f c9605f2 = this.f43914i;
            if (c9605f2.f43882c) {
                if (c9605f.f43889j && c9605f2.f43889j && this.f43910e.f43889j) {
                    return;
                }
                if (!this.f43910e.f43889j && this.f43909d == C9385e.b.MATCH_CONSTRAINT) {
                    C9385e c9385e3 = this.f43907b;
                    if (c9385e3.f42995l == 0 && !c9385e3.m39616V()) {
                        C9605f c9605f3 = this.f43913h.f43891l.get(0);
                        C9605f c9605f4 = this.f43914i.f43891l.get(0);
                        int i13 = c9605f3.f43886g;
                        C9605f c9605f5 = this.f43913h;
                        int i14 = i13 + c9605f5.f43885f;
                        int i15 = c9605f4.f43886g + this.f43914i.f43885f;
                        c9605f5.mo40474d(i14);
                        this.f43914i.mo40474d(i15);
                        this.f43910e.mo40474d(i15 - i14);
                        return;
                    }
                }
                if (!this.f43910e.f43889j && this.f43909d == C9385e.b.MATCH_CONSTRAINT && this.f43906a == 1 && this.f43913h.f43891l.size() > 0 && this.f43914i.f43891l.size() > 0) {
                    int i16 = (this.f43914i.f43891l.get(0).f43886g + this.f43914i.f43885f) - (this.f43913h.f43891l.get(0).f43886g + this.f43913h.f43885f);
                    C9606g c9606g2 = this.f43910e;
                    int i17 = c9606g2.f43892m;
                    if (i16 < i17) {
                        c9606g2.mo40474d(i16);
                    } else {
                        c9606g2.mo40474d(i17);
                    }
                }
                if (this.f43910e.f43889j && this.f43913h.f43891l.size() > 0 && this.f43914i.f43891l.size() > 0) {
                    C9605f c9605f6 = this.f43913h.f43891l.get(0);
                    C9605f c9605f7 = this.f43914i.f43891l.get(0);
                    int i18 = c9605f6.f43886g + this.f43913h.f43885f;
                    int i19 = c9605f7.f43886g + this.f43914i.f43885f;
                    float m39603I = this.f43907b.m39603I();
                    if (c9605f6 == c9605f7) {
                        i18 = c9605f6.f43886g;
                        i19 = c9605f7.f43886g;
                        m39603I = 0.5f;
                    }
                    this.f43913h.mo40474d((int) (i18 + 0.5f + (((i19 - i18) - this.f43910e.f43886g) * m39603I)));
                    this.f43914i.mo40474d(this.f43913h.f43886g + this.f43910e.f43886g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x04e5, code lost:
    
        if (r6.f43907b.m39611Q() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04e8, code lost:
    
        r12 = r6.f43903k;
        r13 = r6.f43913h;
        r11 = r6.f43904l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x058a, code lost:
    
        if (r11.f43909d == r0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x06b9, code lost:
    
        r11.f43910e.f43890k.add(r6.f43910e);
        r6.f43910e.f43891l.add(r6.f43907b.f42981e.f43910e);
        r6.f43910e.f43880a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x05da, code lost:
    
        if (r6.f43907b.m39611Q() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x06b6, code lost:
    
        if (r11.f43909d == r0) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    @Override // p392x.AbstractC9612m
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo40450d() {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.C9611l.mo40450d():void");
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: e */
    public void mo40451e() {
        C9605f c9605f = this.f43913h;
        if (c9605f.f43889j) {
            this.f43907b.m39595D0(c9605f.f43886g);
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: f */
    public void mo40452f() {
        this.f43908c = null;
        this.f43913h.m40473c();
        this.f43914i.m40473c();
        this.f43903k.m40473c();
        this.f43910e.m40473c();
        this.f43912g = false;
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: m */
    public boolean mo40454m() {
        return this.f43909d != C9385e.b.MATCH_CONSTRAINT || this.f43907b.f42997m == 0;
    }

    /* renamed from: q */
    public void m40483q() {
        this.f43912g = false;
        this.f43913h.m40473c();
        this.f43913h.f43889j = false;
        this.f43914i.m40473c();
        this.f43914i.f43889j = false;
        this.f43903k.m40473c();
        this.f43903k.f43889j = false;
        this.f43910e.f43889j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f43907b.m39646p();
    }
}
