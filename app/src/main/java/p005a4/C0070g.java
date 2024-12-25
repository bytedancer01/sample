package p005a4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a4/g.class
 */
@TargetApi(19)
/* renamed from: a4.g */
/* loaded from: combined.jar:classes1.jar:a4/g.class */
public class C0070g implements InterfaceC0068e {

    /* renamed from: d */
    public static final Bitmap.Config[] f212d = {Bitmap.Config.ARGB_8888, null};

    /* renamed from: e */
    public static final Bitmap.Config[] f213e = {Bitmap.Config.RGB_565};

    /* renamed from: f */
    public static final Bitmap.Config[] f214f = {Bitmap.Config.ARGB_4444};

    /* renamed from: g */
    public static final Bitmap.Config[] f215g = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final c f216a = new c();

    /* renamed from: b */
    public final C0066c<b, Bitmap> f217b = new C0066c<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f218c = new HashMap();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a4/g$a.class
     */
    /* renamed from: a4.g$a */
    /* loaded from: combined.jar:classes1.jar:a4/g$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f219a;

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
                p005a4.C0070g.a.f219a = r0
                r0 = r4
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = p005a4.C0070g.a.f219a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = p005a4.C0070g.a.f219a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = p005a4.C0070g.a.f219a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L42
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
            throw new UnsupportedOperationException("Method not decompiled: p005a4.C0070g.a.m42862clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a4/g$b.class
     */
    /* renamed from: a4.g$b */
    /* loaded from: combined.jar:classes1.jar:a4/g$b.class */
    public static final class b implements InterfaceC0069f {

        /* renamed from: a */
        public final c f220a;

        /* renamed from: b */
        public int f221b;

        /* renamed from: c */
        public Bitmap.Config f222c;

        public b(c cVar) {
            this.f220a = cVar;
        }

        @Override // p005a4.InterfaceC0069f
        /* renamed from: a */
        public void mo260a() {
            this.f220a.m230c(this);
        }

        /* renamed from: c */
        public void m268c(int i10, Bitmap.Config config) {
            this.f221b = i10;
            this.f222c = config;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            if (r0.equals(r0) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
        
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
        
            r5 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = r4
                boolean r0 = r0 instanceof p005a4.C0070g.b
                r7 = r0
                r0 = 0
                r6 = r0
                r0 = r6
                r5 = r0
                r0 = r7
                if (r0 == 0) goto L4a
                r0 = r4
                a4.g$b r0 = (p005a4.C0070g.b) r0
                r8 = r0
                r0 = r6
                r5 = r0
                r0 = r3
                int r0 = r0.f221b
                r1 = r8
                int r1 = r1.f221b
                if (r0 != r1) goto L4a
                r0 = r3
                android.graphics.Bitmap$Config r0 = r0.f222c
                r4 = r0
                r0 = r8
                android.graphics.Bitmap$Config r0 = r0.f222c
                r8 = r0
                r0 = r4
                if (r0 != 0) goto L3d
                r0 = r6
                r5 = r0
                r0 = r8
                if (r0 != 0) goto L4a
                goto L48
            L3d:
                r0 = r6
                r5 = r0
                r0 = r4
                r1 = r8
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L4a
            L48:
                r0 = 1
                r5 = r0
            L4a:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005a4.C0070g.b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i10 = this.f221b;
            Bitmap.Config config = this.f222c;
            return (i10 * 31) + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C0070g.m262i(this.f221b, this.f222c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a4/g$c.class
     */
    /* renamed from: a4.g$c */
    /* loaded from: combined.jar:classes1.jar:a4/g$c.class */
    public static class c extends AbstractC0064a<b> {
        @Override // p005a4.AbstractC0064a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo228a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m270e(int i10, Bitmap.Config config) {
            b m229b = m229b();
            m229b.m268c(i10, config);
            return m229b;
        }
    }

    /* renamed from: i */
    public static String m262i(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    /* renamed from: j */
    public static Bitmap.Config[] m263j(Bitmap.Config config) {
        int i10 = a.f219a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f215g : f214f : f213e : f212d;
    }

    @Override // p005a4.InterfaceC0068e
    /* renamed from: a */
    public void mo255a(Bitmap bitmap) {
        b m270e = this.f216a.m270e(C9242h.m38967e(bitmap), bitmap.getConfig());
        this.f217b.m241d(m270e, bitmap);
        NavigableMap<Integer, Integer> m266k = m266k(bitmap.getConfig());
        Integer num = m266k.get(Integer.valueOf(m270e.f221b));
        int i10 = m270e.f221b;
        int i11 = 1;
        if (num != null) {
            i11 = 1 + num.intValue();
        }
        m266k.put(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    @Override // p005a4.InterfaceC0068e
    /* renamed from: b */
    public String mo256b(Bitmap bitmap) {
        return m262i(C9242h.m38967e(bitmap), bitmap.getConfig());
    }

    @Override // p005a4.InterfaceC0068e
    /* renamed from: c */
    public String mo257c(int i10, int i11, Bitmap.Config config) {
        return m262i(C9242h.m38966d(i10, i11, config), config);
    }

    @Override // p005a4.InterfaceC0068e
    /* renamed from: d */
    public Bitmap mo258d(int i10, int i11, Bitmap.Config config) {
        int m38966d = C9242h.m38966d(i10, i11, config);
        Bitmap m238a = this.f217b.m238a(m265h(this.f216a.m270e(m38966d, config), m38966d, config));
        if (m238a != null) {
            m264g(Integer.valueOf(C9242h.m38967e(m238a)), m238a.getConfig());
            m238a.reconfigure(i10, i11, m238a.getConfig() != null ? m238a.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return m238a;
    }

    @Override // p005a4.InterfaceC0068e
    /* renamed from: e */
    public int mo259e(Bitmap bitmap) {
        return C9242h.m38967e(bitmap);
    }

    /* renamed from: g */
    public final void m264g(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> m266k = m266k(config);
        Integer num2 = m266k.get(num);
        if (num2.intValue() == 1) {
            m266k.remove(num);
        } else {
            m266k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r7 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r0.equals(r7) == false) goto L18;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p005a4.C0070g.b m265h(p005a4.C0070g.b r5, int r6, android.graphics.Bitmap.Config r7) {
        /*
            r4 = this;
            r0 = r7
            android.graphics.Bitmap$Config[] r0 = m263j(r0)
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
        Le:
            r0 = r5
            r10 = r0
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L89
            r0 = r11
            r1 = r8
            r0 = r0[r1]
            r12 = r0
            r0 = r4
            r1 = r12
            java.util.NavigableMap r0 = r0.m266k(r1)
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.ceilingKey(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L83
            r0 = r13
            int r0 = r0.intValue()
            r1 = r6
            r2 = 8
            int r1 = r1 * r2
            if (r0 > r1) goto L83
            r0 = r13
            int r0 = r0.intValue()
            r1 = r6
            if (r0 != r1) goto L68
            r0 = r12
            if (r0 != 0) goto L5c
            r0 = r5
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L89
            goto L68
        L5c:
            r0 = r5
            r10 = r0
            r0 = r12
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L89
        L68:
            r0 = r4
            a4.g$c r0 = r0.f216a
            r1 = r5
            r0.m230c(r1)
            r0 = r4
            a4.g$c r0 = r0.f216a
            r1 = r13
            int r1 = r1.intValue()
            r2 = r12
            a4.g$b r0 = r0.m270e(r1, r2)
            r10 = r0
            goto L89
        L83:
            int r8 = r8 + 1
            goto Le
        L89:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0070g.m265h(a4.g$b, int, android.graphics.Bitmap$Config):a4.g$b");
    }

    /* renamed from: k */
    public final NavigableMap<Integer, Integer> m266k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f218c.get(config);
        NavigableMap<Integer, Integer> navigableMap2 = navigableMap;
        if (navigableMap == null) {
            navigableMap2 = new TreeMap();
            this.f218c.put(config, navigableMap2);
        }
        return navigableMap2;
    }

    @Override // p005a4.InterfaceC0068e
    public Bitmap removeLast() {
        Bitmap m242f = this.f217b.m242f();
        if (m242f != null) {
            m264g(Integer.valueOf(C9242h.m38967e(m242f)), m242f.getConfig());
        }
        return m242f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f217b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f218c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f218c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
