package p373w;

import java.util.HashSet;
import java.util.Iterator;
import p358v.C9211c;
import p358v.C9217i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/d.class
 */
/* renamed from: w.d */
/* loaded from: combined.jar:classes1.jar:w/d.class */
public class C9384d {

    /* renamed from: b */
    public final C9385e f42939b;

    /* renamed from: c */
    public final b f42940c;

    /* renamed from: d */
    public C9384d f42941d;

    /* renamed from: g */
    public C9217i f42944g;

    /* renamed from: a */
    public HashSet<C9384d> f42938a = null;

    /* renamed from: e */
    public int f42942e = 0;

    /* renamed from: f */
    public int f42943f = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w/d$a.class
     */
    /* renamed from: w.d$a */
    /* loaded from: combined.jar:classes1.jar:w/d$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f42945a;

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
                p373w.C9384d.a.f42945a = r0
                r0 = r4
                w.d$b r1 = p373w.C9384d.b.CENTER     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L14:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L71 java.lang.NoSuchFieldError -> L75
                w.d$b r1 = p373w.C9384d.b.LEFT     // Catch: java.lang.NoSuchFieldError -> L75
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L75
            L1f:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L75 java.lang.NoSuchFieldError -> L79
                w.d$b r1 = p373w.C9384d.b.RIGHT     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L2a:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L79 java.lang.NoSuchFieldError -> L7d
                w.d$b r1 = p373w.C9384d.b.TOP     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L35:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                w.d$b r1 = p373w.C9384d.b.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L81
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L81
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L81
            L40:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L81 java.lang.NoSuchFieldError -> L85
                w.d$b r1 = p373w.C9384d.b.BASELINE     // Catch: java.lang.NoSuchFieldError -> L85
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L85
            L4c:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L85 java.lang.NoSuchFieldError -> L89
                w.d$b r1 = p373w.C9384d.b.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L89
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L89
            L58:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L89 java.lang.NoSuchFieldError -> L8d
                w.d$b r1 = p373w.C9384d.b.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
            L64:
                int[] r0 = p373w.C9384d.a.f42945a     // Catch: java.lang.NoSuchFieldError -> L8d java.lang.NoSuchFieldError -> L91
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
            throw new UnsupportedOperationException("Method not decompiled: p373w.C9384d.a.m46306clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w/d$b.class
     */
    /* renamed from: w.d$b */
    /* loaded from: combined.jar:classes1.jar:w/d$b.class */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C9384d(C9385e c9385e, b bVar) {
        this.f42939b = c9385e;
        this.f42940c = bVar;
    }

    /* renamed from: a */
    public boolean m39576a(C9384d c9384d, int i10, int i11, boolean z10) {
        if (c9384d == null) {
            m39586k();
            return true;
        }
        if (!z10 && !m39585j(c9384d)) {
            return false;
        }
        this.f42941d = c9384d;
        if (c9384d.f42938a == null) {
            c9384d.f42938a = new HashSet<>();
        }
        this.f42941d.f42938a.add(this);
        if (i10 > 0) {
            this.f42942e = i10;
        } else {
            this.f42942e = 0;
        }
        this.f42943f = i11;
        return true;
    }

    /* renamed from: b */
    public int m39577b() {
        C9384d c9384d;
        if (this.f42939b.m39607M() == 8) {
            return 0;
        }
        return (this.f42943f <= -1 || (c9384d = this.f42941d) == null || c9384d.f42939b.m39607M() != 8) ? this.f42942e : this.f42943f;
    }

    /* renamed from: c */
    public final C9384d m39578c() {
        switch (a.f42945a[this.f42940c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f42939b.f42950D;
            case 3:
                return this.f42939b.f42948B;
            case 4:
                return this.f42939b.f42951E;
            case 5:
                return this.f42939b.f42949C;
            default:
                throw new AssertionError(this.f42940c.name());
        }
    }

    /* renamed from: d */
    public C9385e m39579d() {
        return this.f42939b;
    }

    /* renamed from: e */
    public C9217i m39580e() {
        return this.f42944g;
    }

    /* renamed from: f */
    public C9384d m39581f() {
        return this.f42941d;
    }

    /* renamed from: g */
    public b m39582g() {
        return this.f42940c;
    }

    /* renamed from: h */
    public boolean m39583h() {
        HashSet<C9384d> hashSet = this.f42938a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C9384d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m39578c().m39584i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean m39584i() {
        return this.f42941d != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        if (r0 == p373w.C9384d.b.CENTER_Y) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        if (r0 == p373w.C9384d.b.CENTER_X) goto L54;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m39585j(p373w.C9384d r5) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p373w.C9384d.m39585j(w.d):boolean");
    }

    /* renamed from: k */
    public void m39586k() {
        HashSet<C9384d> hashSet;
        C9384d c9384d = this.f42941d;
        if (c9384d != null && (hashSet = c9384d.f42938a) != null) {
            hashSet.remove(this);
        }
        this.f42941d = null;
        this.f42942e = 0;
        this.f42943f = -1;
    }

    /* renamed from: l */
    public void m39587l(C9211c c9211c) {
        C9217i c9217i = this.f42944g;
        if (c9217i == null) {
            this.f42944g = new C9217i(C9217i.a.UNRESTRICTED, null);
        } else {
            c9217i.m38786d();
        }
    }

    public String toString() {
        return this.f42939b.m39646p() + ":" + this.f42940c.toString();
    }
}
