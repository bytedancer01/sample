package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/g.class
 */
/* renamed from: androidx.lifecycle.g */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/g.class */
public abstract class AbstractC0572g {

    /* renamed from: a */
    public AtomicReference<Object> f3762a = new AtomicReference<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/g$a.class
     */
    /* renamed from: androidx.lifecycle.g$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/g$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f3763a;

        /* renamed from: b */
        public static final int[] f3764b;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:72:0x00bd
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.AbstractC0572g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.lifecycle.AbstractC0572g.a.f3764b = r0
                r0 = r4
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L14:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3764b     // Catch: java.lang.NoSuchFieldError -> L99 java.lang.NoSuchFieldError -> L9d
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L1f:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3764b     // Catch: java.lang.NoSuchFieldError -> L9d java.lang.NoSuchFieldError -> La1
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_START     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La1
            L2a:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3764b     // Catch: java.lang.NoSuchFieldError -> La1 java.lang.NoSuchFieldError -> La5
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> La5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La5
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La5
            L35:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3764b     // Catch: java.lang.NoSuchFieldError -> La5 java.lang.NoSuchFieldError -> La9
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
            L40:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3764b     // Catch: java.lang.NoSuchFieldError -> La9 java.lang.NoSuchFieldError -> Lad
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> Lad
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lad
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lad
            L4c:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3764b     // Catch: java.lang.NoSuchFieldError -> Lad java.lang.NoSuchFieldError -> Lb1
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_ANY     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb1
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb1
            L58:
                androidx.lifecycle.g$c[] r0 = androidx.lifecycle.AbstractC0572g.c.values()     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.lifecycle.AbstractC0572g.a.f3763a = r0
                r0 = r4
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.CREATED     // Catch: java.lang.NoSuchFieldError -> Lb5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb5
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb5
            L6c:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3763a     // Catch: java.lang.NoSuchFieldError -> Lb5 java.lang.NoSuchFieldError -> Lb9
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.STARTED     // Catch: java.lang.NoSuchFieldError -> Lb9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb9
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb9
            L77:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3763a     // Catch: java.lang.NoSuchFieldError -> Lb9 java.lang.NoSuchFieldError -> Lbd
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.RESUMED     // Catch: java.lang.NoSuchFieldError -> Lbd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbd
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lbd
            L82:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3763a     // Catch: java.lang.NoSuchFieldError -> Lbd java.lang.NoSuchFieldError -> Lc1
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.DESTROYED     // Catch: java.lang.NoSuchFieldError -> Lc1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            L8d:
                int[] r0 = androidx.lifecycle.AbstractC0572g.a.f3763a     // Catch: java.lang.NoSuchFieldError -> Lc1 java.lang.NoSuchFieldError -> Lc5
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
            L98:
                return
            L99:
                r4 = move-exception
                goto L14
            L9d:
                r4 = move-exception
                goto L1f
            La1:
                r4 = move-exception
                goto L2a
            La5:
                r4 = move-exception
                goto L35
            La9:
                r4 = move-exception
                goto L40
            Lad:
                r4 = move-exception
                goto L4c
            Lb1:
                r4 = move-exception
                goto L58
            Lb5:
                r4 = move-exception
                goto L6c
            Lb9:
                r4 = move-exception
                goto L77
            Lbd:
                r4 = move-exception
                goto L82
            Lc1:
                r4 = move-exception
                goto L8d
            Lc5:
                r4 = move-exception
                goto L98
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC0572g.a.m43047clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/g$b.class
     */
    /* renamed from: androidx.lifecycle.g$b */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/g$b.class */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static b downFrom(c cVar) {
            int i10 = a.f3763a[cVar.ordinal()];
            if (i10 == 1) {
                return ON_DESTROY;
            }
            if (i10 == 2) {
                return ON_STOP;
            }
            if (i10 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static b downTo(c cVar) {
            int i10 = a.f3763a[cVar.ordinal()];
            if (i10 == 1) {
                return ON_STOP;
            }
            if (i10 == 2) {
                return ON_PAUSE;
            }
            if (i10 != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        public static b upFrom(c cVar) {
            int i10 = a.f3763a[cVar.ordinal()];
            if (i10 == 1) {
                return ON_START;
            }
            if (i10 == 2) {
                return ON_RESUME;
            }
            if (i10 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        public static b upTo(c cVar) {
            int i10 = a.f3763a[cVar.ordinal()];
            if (i10 == 1) {
                return ON_CREATE;
            }
            if (i10 == 2) {
                return ON_START;
            }
            if (i10 != 3) {
                return null;
            }
            return ON_RESUME;
        }

        public c getTargetState() {
            switch (a.f3764b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/g$c.class
     */
    /* renamed from: androidx.lifecycle.g$c */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/g$c.class */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo3154a(InterfaceC0578l interfaceC0578l);

    /* renamed from: b */
    public abstract c mo3155b();

    /* renamed from: c */
    public abstract void mo3156c(InterfaceC0578l interfaceC0578l);
}
