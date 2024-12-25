package cg;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p354ue.C9163h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/t.class
 */
/* renamed from: cg.t */
/* loaded from: combined.jar:classes2.jar:cg/t.class */
public final class C1107t {

    /* renamed from: a */
    public final AbstractC1108u f7433a = AbstractC1108u.m6676b();

    /* renamed from: b */
    public boolean f7434b;

    /* renamed from: c */
    public long f7435c;

    /* renamed from: d */
    public long f7436d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/t$a.class
     */
    /* renamed from: cg.t$a */
    /* loaded from: combined.jar:classes2.jar:cg/t$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f7437a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x006d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                cg.C1107t.a.f7437a = r0
                r0 = r4
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = cg.C1107t.a.f7437a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = cg.C1107t.a.f7437a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = cg.C1107t.a.f7437a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = cg.C1107t.a.f7437a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = cg.C1107t.a.f7437a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = cg.C1107t.a.f7437a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L58:
                return
            L59:
                r4 = move-exception
                goto L14
            L5d:
                r4 = move-exception
                goto L1f
            L61:
                r4 = move-exception
                goto L2a
            L65:
                r4 = move-exception
                goto L35
            L69:
                r4 = move-exception
                goto L40
            L6d:
                r4 = move-exception
                goto L4c
            L71:
                r4 = move-exception
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: cg.C1107t.a.m43213clinit():void");
        }
    }

    /* renamed from: a */
    public static String m6671a(TimeUnit timeUnit) {
        switch (a.f7437a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return C9163h.f41901n;
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static TimeUnit m6672b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    /* renamed from: c */
    public static C1107t m6673c() {
        return new C1107t();
    }

    /* renamed from: d */
    public final long m6674d() {
        return this.f7434b ? (this.f7433a.mo6533a() - this.f7436d) + this.f7435c : this.f7435c;
    }

    /* renamed from: e */
    public C1107t m6675e() {
        C1102o.m6668d(!this.f7434b, "This stopwatch is already running.");
        this.f7434b = true;
        this.f7436d = this.f7433a.mo6533a();
        return this;
    }

    public String toString() {
        long m6674d = m6674d();
        return String.format(Locale.ROOT, "%.4g %s", Double.valueOf(m6674d / TimeUnit.NANOSECONDS.convert(1L, r0)), m6671a(m6672b(m6674d)));
    }
}
