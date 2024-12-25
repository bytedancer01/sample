package p386wc;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import tc.C8680c;
import tc.C8681d;
import tc.InterfaceC8682e;
import tc.InterfaceC8683f;
import tc.InterfaceC8684g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wc/f.class
 */
/* renamed from: wc.f */
/* loaded from: combined.jar:classes2.jar:wc/f.class */
public final class C9565f implements InterfaceC8683f {

    /* renamed from: f */
    public static final Charset f43549f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C8681d f43550g = C8681d.m37172a("key").m37177b(C9560a.m40097b().m40099c(1).m40098a()).m37176a();

    /* renamed from: h */
    public static final C8681d f43551h = C8681d.m37172a("value").m37177b(C9560a.m40097b().m40099c(2).m40098a()).m37176a();

    /* renamed from: i */
    public static final InterfaceC8682e<Map.Entry<Object, Object>> f43552i = new InterfaceC8682e() { // from class: wc.e
        @Override // tc.InterfaceC8679b
        /* renamed from: a */
        public final void mo5160a(Object obj, InterfaceC8683f interfaceC8683f) {
            C9565f.m40105u((Map.Entry) obj, interfaceC8683f);
        }
    };

    /* renamed from: a */
    public OutputStream f43553a;

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC8682e<?>> f43554b;

    /* renamed from: c */
    public final Map<Class<?>, InterfaceC8684g<?>> f43555c;

    /* renamed from: d */
    public final InterfaceC8682e<Object> f43556d;

    /* renamed from: e */
    public final C9568i f43557e = new C9568i(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wc/f$a.class
     */
    /* renamed from: wc.f$a */
    /* loaded from: combined.jar:classes2.jar:wc/f$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f43558a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                wc.d$a[] r0 = p386wc.InterfaceC9563d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p386wc.C9565f.a.f43558a = r0
                r0 = r4
                wc.d$a r1 = p386wc.InterfaceC9563d.a.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = p386wc.C9565f.a.f43558a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                wc.d$a r1 = p386wc.InterfaceC9563d.a.SIGNED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = p386wc.C9565f.a.f43558a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                wc.d$a r1 = p386wc.InterfaceC9563d.a.FIXED     // Catch: java.lang.NoSuchFieldError -> L33
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
            throw new UnsupportedOperationException("Method not decompiled: p386wc.C9565f.a.m46345clinit():void");
        }
    }

    public C9565f(OutputStream outputStream, Map<Class<?>, InterfaceC8682e<?>> map, Map<Class<?>, InterfaceC8684g<?>> map2, InterfaceC8682e<Object> interfaceC8682e) {
        this.f43553a = outputStream;
        this.f43554b = map;
        this.f43555c = map2;
        this.f43556d = interfaceC8682e;
    }

    /* renamed from: n */
    public static ByteBuffer m40102n(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: s */
    public static InterfaceC9563d m40103s(C8681d c8681d) {
        InterfaceC9563d interfaceC9563d = (InterfaceC9563d) c8681d.m37175c(InterfaceC9563d.class);
        if (interfaceC9563d != null) {
            return interfaceC9563d;
        }
        throw new C8680c("Field has no @Protobuf config");
    }

    /* renamed from: t */
    public static int m40104t(C8681d c8681d) {
        InterfaceC9563d interfaceC9563d = (InterfaceC9563d) c8681d.m37175c(InterfaceC9563d.class);
        if (interfaceC9563d != null) {
            return interfaceC9563d.tag();
        }
        throw new C8680c("Field has no @Protobuf config");
    }

    /* renamed from: u */
    public static /* synthetic */ void m40105u(Map.Entry entry, InterfaceC8683f interfaceC8683f) {
        interfaceC8683f.mo37179c(f43550g, entry.getKey());
        interfaceC8683f.mo37179c(f43551h, entry.getValue());
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: a */
    public InterfaceC8683f mo37178a(String str, int i10) {
        return m40109i(C8681d.m37173d(str), i10);
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: c */
    public InterfaceC8683f mo37179c(C8681d c8681d, Object obj) {
        return m40108h(c8681d, obj, true);
    }

    /* renamed from: e */
    public InterfaceC8683f m40106e(C8681d c8681d, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m40118v((m40104t(c8681d) << 3) | 1);
        this.f43553a.write(m40102n(8).putDouble(d10).array());
        return this;
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: f */
    public InterfaceC8683f mo37181f(String str, Object obj) {
        return mo37179c(C8681d.m37173d(str), obj);
    }

    /* renamed from: g */
    public InterfaceC8683f m40107g(C8681d c8681d, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m40118v((m40104t(c8681d) << 3) | 5);
        this.f43553a.write(m40102n(4).putFloat(f10).array());
        return this;
    }

    /* renamed from: h */
    public InterfaceC8683f m40108h(C8681d c8681d, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m40118v((m40104t(c8681d) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f43549f);
            m40118v(bytes.length);
            this.f43553a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m40108h(c8681d, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m40115p(f43552i, c8681d, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m40106e(c8681d, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return m40107g(c8681d, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m40112l(c8681d, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return m40113m(c8681d, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            InterfaceC8682e<?> interfaceC8682e = this.f43554b.get(obj.getClass());
            if (interfaceC8682e != null) {
                return m40115p(interfaceC8682e, c8681d, obj, z10);
            }
            InterfaceC8684g<?> interfaceC8684g = this.f43555c.get(obj.getClass());
            return interfaceC8684g != null ? m40116q(interfaceC8684g, c8681d, obj, z10) : obj instanceof InterfaceC9562c ? m40109i(c8681d, ((InterfaceC9562c) obj).getNumber()) : obj instanceof Enum ? m40109i(c8681d, ((Enum) obj).ordinal()) : m40115p(this.f43556d, c8681d, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        m40118v((m40104t(c8681d) << 3) | 2);
        m40118v(bArr.length);
        this.f43553a.write(bArr);
        return this;
    }

    /* renamed from: i */
    public C9565f m40109i(C8681d c8681d, int i10) {
        return m40110j(c8681d, i10, true);
    }

    /* renamed from: j */
    public C9565f m40110j(C8681d c8681d, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC9563d m40103s = m40103s(c8681d);
        int i11 = a.f43558a[m40103s.intEncoding().ordinal()];
        if (i11 == 1) {
            m40118v(m40103s.tag() << 3);
            m40118v(i10);
        } else if (i11 == 2) {
            m40118v(m40103s.tag() << 3);
            m40118v((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            m40118v((m40103s.tag() << 3) | 5);
            this.f43553a.write(m40102n(4).putInt(i10).array());
        }
        return this;
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C9565f mo37180d(C8681d c8681d, long j10) {
        return m40112l(c8681d, j10, true);
    }

    /* renamed from: l */
    public C9565f m40112l(C8681d c8681d, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC9563d m40103s = m40103s(c8681d);
        int i10 = a.f43558a[m40103s.intEncoding().ordinal()];
        if (i10 == 1) {
            m40118v(m40103s.tag() << 3);
            m40119w(j10);
        } else if (i10 == 2) {
            m40118v(m40103s.tag() << 3);
            m40119w((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            m40118v((m40103s.tag() << 3) | 1);
            this.f43553a.write(m40102n(8).putLong(j10).array());
        }
        return this;
    }

    /* renamed from: m */
    public C9565f m40113m(C8681d c8681d, boolean z10, boolean z11) {
        return m40110j(c8681d, z10 ? 1 : 0, z11);
    }

    /* renamed from: o */
    public final <T> long m40114o(InterfaceC8682e<T> interfaceC8682e, T t10) {
        C9561b c9561b = new C9561b();
        try {
            OutputStream outputStream = this.f43553a;
            this.f43553a = c9561b;
            try {
                interfaceC8682e.mo5160a(t10, this);
                this.f43553a = outputStream;
                long m40100f = c9561b.m40100f();
                c9561b.close();
                return m40100f;
            } catch (Throwable th2) {
                this.f43553a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c9561b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: p */
    public final <T> C9565f m40115p(InterfaceC8682e<T> interfaceC8682e, C8681d c8681d, T t10, boolean z10) {
        long m40114o = m40114o(interfaceC8682e, t10);
        if (z10 && m40114o == 0) {
            return this;
        }
        m40118v((m40104t(c8681d) << 3) | 2);
        m40119w(m40114o);
        interfaceC8682e.mo5160a(t10, this);
        return this;
    }

    /* renamed from: q */
    public final <T> C9565f m40116q(InterfaceC8684g<T> interfaceC8684g, C8681d c8681d, T t10, boolean z10) {
        this.f43557e.m40129c(c8681d, z10);
        interfaceC8684g.mo5160a(t10, this.f43557e);
        return this;
    }

    /* renamed from: r */
    public C9565f m40117r(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC8682e<?> interfaceC8682e = this.f43554b.get(obj.getClass());
        if (interfaceC8682e != null) {
            interfaceC8682e.mo5160a(obj, this);
            return this;
        }
        throw new C8680c("No encoder for " + obj.getClass());
    }

    /* renamed from: v */
    public final void m40118v(int i10) {
        while (true) {
            long j10 = i10 & (-128);
            OutputStream outputStream = this.f43553a;
            if (j10 == 0) {
                outputStream.write(i10 & 127);
                return;
            } else {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            }
        }
    }

    /* renamed from: w */
    public final void m40119w(long j10) {
        while (true) {
            OutputStream outputStream = this.f43553a;
            if (((-128) & j10) == 0) {
                outputStream.write(((int) j10) & 127);
                return;
            } else {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
        }
    }
}
