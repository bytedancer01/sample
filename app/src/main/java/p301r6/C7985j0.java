package p301r6;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/j0.class
 */
/* renamed from: r6.j0 */
/* loaded from: combined.jar:classes2.jar:r6/j0.class */
public final class C7985j0 {

    /* renamed from: a */
    public static final String[] f38622a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f38623b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f38624c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f38625d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f38626e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f38627f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f38628g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/j0$a.class
     */
    /* renamed from: r6.j0$a */
    /* loaded from: combined.jar:classes2.jar:r6/j0$a.class */
    public static final class a {

        /* renamed from: a */
        public int f38629a;

        /* renamed from: b */
        public String f38630b;

        /* renamed from: c */
        public int f38631c;

        /* renamed from: d */
        public int f38632d;

        /* renamed from: e */
        public int f38633e;

        /* renamed from: f */
        public int f38634f;

        /* renamed from: g */
        public int f38635g;

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m34729a(int r6) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p301r6.C7985j0.a.m34729a(int):boolean");
        }
    }

    /* renamed from: j */
    public static int m34725j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!m34727l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f38623b[i14];
        if (i11 == 2) {
            i15 = i16 / 2;
        } else {
            i15 = i16;
            if (i11 == 0) {
                i15 = i16 / 4;
            }
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f38624c[i13 - 1] : f38625d[i13 - 1]) * 12) / i15) + i17) * 4;
        }
        int i18 = i11 == 3 ? i12 == 2 ? f38626e[i13 - 1] : f38627f[i13 - 1] : f38628g[i13 - 1];
        int i19 = 144;
        if (i11 == 3) {
            return ((i18 * IjkMediaMeta.FF_PROFILE_H264_HIGH_444) / i15) + i17;
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return ((i19 * i18) / i15) + i17;
    }

    /* renamed from: k */
    public static int m34726k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static boolean m34727l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    /* renamed from: m */
    public static int m34728m(int i10) {
        int i11;
        int i12;
        int i13;
        if (!m34727l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || ((i10 >>> 10) & 3) == 3) {
            return -1;
        }
        return m34726k(i11, i12);
    }
}
