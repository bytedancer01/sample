package me;

import java.math.BigInteger;
import java.util.Arrays;
import p202le.C5846c;
import td.C8691f;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/e.class
 */
/* renamed from: me.e */
/* loaded from: combined.jar:classes2.jar:me/e.class */
public final class C6577e {

    /* renamed from: a */
    public static final char[] f34420a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    public static final char[] f34421b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    public static final BigInteger[] f34422c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:me/e$a.class
     */
    /* renamed from: me.e$a */
    /* loaded from: combined.jar:classes2.jar:me/e$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f34423a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x005d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                me.e$b[] r0 = me.C6577e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                me.C6577e.a.f34423a = r0
                r0 = r4
                me.e$b r1 = me.C6577e.b.ALPHA     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L14:
                int[] r0 = me.C6577e.a.f34423a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                me.e$b r1 = me.C6577e.b.LOWER     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L1f:
                int[] r0 = me.C6577e.a.f34423a     // Catch: java.lang.NoSuchFieldError -> L51 java.lang.NoSuchFieldError -> L55
                me.e$b r1 = me.C6577e.b.MIXED     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L2a:
                int[] r0 = me.C6577e.a.f34423a     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                me.e$b r1 = me.C6577e.b.PUNCT     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L35:
                int[] r0 = me.C6577e.a.f34423a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                me.e$b r1 = me.C6577e.b.ALPHA_SHIFT     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L40:
                int[] r0 = me.C6577e.a.f34423a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                me.e$b r1 = me.C6577e.b.PUNCT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L4c:
                return
            L4d:
                r4 = move-exception
                goto L14
            L51:
                r4 = move-exception
                goto L1f
            L55:
                r4 = move-exception
                goto L2a
            L59:
                r4 = move-exception
                goto L35
            L5d:
                r4 = move-exception
                goto L40
            L61:
                r4 = move-exception
                goto L4c
            */
            throw new UnsupportedOperationException("Method not decompiled: me.C6577e.a.m45064clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:me/e$b.class
     */
    /* renamed from: me.e$b */
    /* loaded from: combined.jar:classes2.jar:me/e$b.class */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f34422c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f34422c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
            i10++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x0169. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m30367a(int r6, int[] r7, java.nio.charset.Charset r8, int r9, java.lang.StringBuilder r10) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.C6577e.m30367a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p444zd.C10197e m30368b(int[] r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.C6577e.m30368b(int[], java.lang.String):zd.e");
    }

    /* renamed from: c */
    public static String m30369c(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f34422c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C8691f.m37197a();
    }

    /* renamed from: d */
    public static int m30370d(int[] iArr, int i10, C5846c c5846c) {
        if (i10 + 2 > iArr[0]) {
            throw C8691f.m37197a();
        }
        int[] iArr2 = new int[2];
        int i11 = 0;
        while (i11 < 2) {
            iArr2[i11] = iArr[i10];
            i11++;
            i10++;
        }
        c5846c.m28445j(Integer.parseInt(m30369c(iArr2, 2)));
        StringBuilder sb2 = new StringBuilder();
        int m30373g = m30373g(iArr, i10, sb2);
        c5846c.m28439d(sb2.toString());
        int i12 = iArr[m30373g] == 923 ? m30373g + 1 : -1;
        while (m30373g < iArr[0]) {
            int i13 = iArr[m30373g];
            if (i13 == 922) {
                m30373g++;
                c5846c.m28442g(true);
            } else {
                if (i13 != 923) {
                    throw C8691f.m37197a();
                }
                int i14 = m30373g + 1;
                switch (iArr[i14]) {
                    case 0:
                        StringBuilder sb3 = new StringBuilder();
                        m30373g = m30373g(iArr, i14 + 1, sb3);
                        c5846c.m28440e(sb3.toString());
                        break;
                    case 1:
                        StringBuilder sb4 = new StringBuilder();
                        m30373g = m30372f(iArr, i14 + 1, sb4);
                        c5846c.m28444i(Integer.parseInt(sb4.toString()));
                        break;
                    case 2:
                        StringBuilder sb5 = new StringBuilder();
                        m30373g = m30372f(iArr, i14 + 1, sb5);
                        c5846c.m28447l(Long.parseLong(sb5.toString()));
                        break;
                    case 3:
                        StringBuilder sb6 = new StringBuilder();
                        m30373g = m30373g(iArr, i14 + 1, sb6);
                        c5846c.m28446k(sb6.toString());
                        break;
                    case 4:
                        StringBuilder sb7 = new StringBuilder();
                        m30373g = m30373g(iArr, i14 + 1, sb7);
                        c5846c.m28437b(sb7.toString());
                        break;
                    case 5:
                        StringBuilder sb8 = new StringBuilder();
                        m30373g = m30372f(iArr, i14 + 1, sb8);
                        c5846c.m28441f(Long.parseLong(sb8.toString()));
                        break;
                    case 6:
                        StringBuilder sb9 = new StringBuilder();
                        m30373g = m30372f(iArr, i14 + 1, sb9);
                        c5846c.m28438c(Integer.parseInt(sb9.toString()));
                        break;
                    default:
                        throw C8691f.m37197a();
                }
            }
        }
        if (i12 != -1) {
            int i15 = m30373g - i12;
            int i16 = i15;
            if (c5846c.m28436a()) {
                i16 = i15 - 1;
            }
            c5846c.m28443h(Arrays.copyOfRange(iArr, i12, i16 + i12));
        }
        return m30373g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r0 != 900) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024c A[PHI: r12
      0x024c: PHI (r12v2 me.e$b) = 
      (r12v1 me.e$b)
      (r12v1 me.e$b)
      (r12v3 me.e$b)
      (r12v1 me.e$b)
      (r12v4 me.e$b)
      (r12v1 me.e$b)
      (r12v5 me.e$b)
      (r12v1 me.e$b)
      (r12v1 me.e$b)
      (r12v6 me.e$b)
      (r12v7 me.e$b)
     binds: [B:5:0x0029, B:78:0x01f8, B:68:0x022e, B:66:0x0193, B:55:0x0236, B:51:0x012d, B:52:0x0153, B:42:0x0244, B:40:0x00ea, B:24:0x0164, B:23:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m30371e(int[] r4, int[] r5, int r6, java.lang.StringBuilder r7) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.C6577e.m30371e(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: f */
    public static int m30372f(int[] iArr, int i10, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = i11;
            int i14 = iArr[0];
            if (i12 < i14 && !z10) {
                int i15 = i12 + 1;
                int i16 = iArr[i12];
                if (i15 == i14) {
                    z10 = true;
                }
                if (i16 < 900) {
                    iArr2[i13] = i16;
                    i13++;
                    i12 = i15;
                } else {
                    if (i16 != 900 && i16 != 901 && i16 != 928) {
                        switch (i16) {
                            case 922:
                            case 923:
                            case 924:
                                break;
                            default:
                                i12 = i15;
                                break;
                        }
                    }
                    i12 = i15 - 1;
                    z10 = true;
                }
                if (i13 % 15 != 0 && i16 != 902) {
                    i11 = i13;
                    if (!z10) {
                    }
                }
                i11 = i13;
                if (i13 > 0) {
                    sb2.append(m30369c(iArr2, i13));
                    i11 = 0;
                }
            }
        }
        return i12;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x007d. Please report as an issue. */
    /* renamed from: g */
    public static int m30373g(int[] iArr, int i10, StringBuilder sb2) {
        int i11 = iArr[0];
        int[] iArr2 = new int[(i11 - i10) << 1];
        int[] iArr3 = new int[(i11 - i10) << 1];
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 != 913) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i12] = 900;
                            i12++;
                            break;
                        case IMediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE /* 901 */:
                        case IMediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT /* 902 */:
                            break;
                        default:
                            switch (i14) {
                            }
                    }
                }
                i10 = i13 - 1;
                z10 = true;
            } else {
                iArr2[i12] = 913;
                i10 = i13 + 1;
                iArr3[i12] = iArr[i13];
                i12++;
            }
            i10 = i13;
        }
        m30371e(iArr2, iArr3, i12, sb2);
        return i10;
    }
}
