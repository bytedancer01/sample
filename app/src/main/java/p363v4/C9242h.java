package p363v4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/h.class
 */
/* renamed from: v4.h */
/* loaded from: combined.jar:classes1.jar:v4/h.class */
public final class C9242h {

    /* renamed from: a */
    public static final char[] f42236a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f42237b = new char[64];

    /* renamed from: c */
    public static final char[] f42238c = new char[40];

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v4/h$a.class
     */
    /* renamed from: v4.h$a */
    /* loaded from: combined.jar:classes1.jar:v4/h$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f42239a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p363v4.C9242h.a.f42239a = r0
                r0 = r4
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = p363v4.C9242h.a.f42239a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = p363v4.C9242h.a.f42239a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = p363v4.C9242h.a.f42239a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: p363v4.C9242h.a.m46261clinit():void");
        }
    }

    /* renamed from: a */
    public static void m38963a() {
        if (!m38971i()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static String m38964b(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f42236a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: c */
    public static <T> Queue<T> m38965c(int i10) {
        return new ArrayDeque(i10);
    }

    /* renamed from: d */
    public static int m38966d(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * m38968f(config);
    }

    @TargetApi(19)
    /* renamed from: e */
    public static int m38967e(Bitmap bitmap) {
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException e10) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    /* renamed from: f */
    public static int m38968f(Bitmap.Config config) {
        int i10;
        Bitmap.Config config2 = config;
        if (config == null) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f42239a[config2.ordinal()];
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2) {
                i10 = 2;
                if (i11 != 3) {
                    i10 = 4;
                }
            }
        } else {
            i10 = 1;
        }
        return i10;
    }

    /* renamed from: g */
    public static <T> List<T> m38969g(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: h */
    public static boolean m38970h() {
        return !m38971i();
    }

    /* renamed from: i */
    public static boolean m38971i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: j */
    public static boolean m38972j(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    /* renamed from: k */
    public static boolean m38973k(int i10, int i11) {
        return m38972j(i10) && m38972j(i11);
    }

    /* renamed from: l */
    public static String m38974l(byte[] bArr) {
        String m38964b;
        char[] cArr = f42237b;
        synchronized (cArr) {
            m38964b = m38964b(bArr, cArr);
        }
        return m38964b;
    }
}
