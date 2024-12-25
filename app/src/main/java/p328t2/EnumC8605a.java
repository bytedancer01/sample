package p328t2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t2/a.class
 */
/* renamed from: t2.a */
/* loaded from: combined.jar:classes1.jar:t2/a.class */
public enum EnumC8605a {
    START,
    CENTER,
    END;

    private static final boolean HAS_RTL = true;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t2/a$a.class
     */
    /* renamed from: t2.a$a */
    /* loaded from: combined.jar:classes1.jar:t2/a$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f40140a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                t2.a[] r0 = p328t2.EnumC8605a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p328t2.EnumC8605a.a.f40140a = r0
                r0 = r4
                t2.a r1 = p328t2.EnumC8605a.START     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = p328t2.EnumC8605a.a.f40140a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                t2.a r1 = p328t2.EnumC8605a.CENTER     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = p328t2.EnumC8605a.a.f40140a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                t2.a r1 = p328t2.EnumC8605a.END     // Catch: java.lang.NoSuchFieldError -> L33
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
            throw new UnsupportedOperationException("Method not decompiled: p328t2.EnumC8605a.a.m46054clinit():void");
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i10 = a.f40140a[ordinal()];
        int i11 = 3;
        if (i10 == 1) {
            if (HAS_RTL) {
                i11 = 8388611;
            }
            return i11;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return HAS_RTL ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i10 = a.f40140a[ordinal()];
        if (i10 != 2) {
            return i10 != 3 ? 5 : 6;
        }
        return 4;
    }
}
