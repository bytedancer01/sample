package p447zg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/c.class
 */
/* renamed from: zg.c */
/* loaded from: combined.jar:classes2.jar:zg/c.class */
public class C10212c {

    /* renamed from: i */
    public static final byte[] f46712i = {Byte.MAX_VALUE, 69, 76, 70};

    /* renamed from: a */
    public final String f46713a;

    /* renamed from: b */
    public boolean f46714b = false;

    /* renamed from: c */
    public boolean f46715c = false;

    /* renamed from: d */
    public boolean f46716d = false;

    /* renamed from: e */
    public boolean f46717e = false;

    /* renamed from: f */
    public boolean f46718f = false;

    /* renamed from: g */
    public boolean f46719g = false;

    /* renamed from: h */
    public boolean f46720h = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/c$a.class
     */
    /* renamed from: zg.c$a */
    /* loaded from: combined.jar:classes2.jar:zg/c$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f46721a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                zg.c$b$a[] r0 = p447zg.C10212c.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p447zg.C10212c.a.f46721a = r0
                r0 = r4
                zg.c$b$a r1 = p447zg.C10212c.b.a.UINT32     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = p447zg.C10212c.a.f46721a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                zg.c$b$a r1 = p447zg.C10212c.b.a.NTBS     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = p447zg.C10212c.a.f46721a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                zg.c$b$a r1 = p447zg.C10212c.b.a.ULEB128     // Catch: java.lang.NoSuchFieldError -> L33
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
            throw new UnsupportedOperationException("Method not decompiled: p447zg.C10212c.a.m46524clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/c$b.class
     */
    /* renamed from: zg.c$b */
    /* loaded from: combined.jar:classes2.jar:zg/c$b.class */
    public static class b {

        /* renamed from: A */
        public static final b f46722A;

        /* renamed from: B */
        public static final b f46723B;

        /* renamed from: C */
        public static final b f46724C;

        /* renamed from: D */
        public static final b f46725D;

        /* renamed from: E */
        public static final b f46726E;

        /* renamed from: F */
        public static final b f46727F;

        /* renamed from: G */
        public static final b f46728G;

        /* renamed from: H */
        public static final b f46729H;

        /* renamed from: I */
        public static final b f46730I;

        /* renamed from: J */
        public static final b f46731J;

        /* renamed from: K */
        public static final b f46732K;

        /* renamed from: L */
        public static final b f46733L;

        /* renamed from: M */
        public static final b f46734M;

        /* renamed from: N */
        public static final b f46735N;

        /* renamed from: O */
        public static final b f46736O;

        /* renamed from: P */
        public static final b f46737P;

        /* renamed from: Q */
        public static final b f46738Q;

        /* renamed from: R */
        public static final b f46739R;

        /* renamed from: S */
        public static final b f46740S;

        /* renamed from: T */
        public static final b f46741T;

        /* renamed from: U */
        public static final b f46742U;

        /* renamed from: V */
        public static final b f46743V;

        /* renamed from: W */
        public static final b f46744W;

        /* renamed from: d */
        public static final List<b> f46745d = new LinkedList();

        /* renamed from: e */
        public static final Map<Integer, b> f46746e = new HashMap();

        /* renamed from: f */
        public static final Map<String, b> f46747f = new HashMap();

        /* renamed from: g */
        public static final b f46748g;

        /* renamed from: h */
        public static final b f46749h;

        /* renamed from: i */
        public static final b f46750i;

        /* renamed from: j */
        public static final b f46751j;

        /* renamed from: k */
        public static final b f46752k;

        /* renamed from: l */
        public static final b f46753l;

        /* renamed from: m */
        public static final b f46754m;

        /* renamed from: n */
        public static final b f46755n;

        /* renamed from: o */
        public static final b f46756o;

        /* renamed from: p */
        public static final b f46757p;

        /* renamed from: q */
        public static final b f46758q;

        /* renamed from: r */
        public static final b f46759r;

        /* renamed from: s */
        public static final b f46760s;

        /* renamed from: t */
        public static final b f46761t;

        /* renamed from: u */
        public static final b f46762u;

        /* renamed from: v */
        public static final b f46763v;

        /* renamed from: w */
        public static final b f46764w;

        /* renamed from: x */
        public static final b f46765x;

        /* renamed from: y */
        public static final b f46766y;

        /* renamed from: z */
        public static final b f46767z;

        /* renamed from: a */
        public final int f46768a;

        /* renamed from: b */
        public final String f46769b;

        /* renamed from: c */
        public final a f46770c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:zg/c$b$a.class
         */
        /* renamed from: zg.c$b$a */
        /* loaded from: combined.jar:classes2.jar:zg/c$b$a.class */
        public enum a {
            UINT32,
            NTBS,
            ULEB128
        }

        static {
            a aVar = a.UINT32;
            f46748g = m42739a(1, "File", aVar);
            f46749h = m42739a(2, "Section", aVar);
            f46750i = m42739a(3, "Symbol", aVar);
            a aVar2 = a.NTBS;
            f46751j = m42739a(4, "CPU_raw_name", aVar2);
            f46752k = m42739a(5, "CPU_name", aVar2);
            a aVar3 = a.ULEB128;
            f46753l = m42739a(6, "CPU_arch", aVar3);
            f46754m = m42739a(7, "CPU_arch_profile", aVar3);
            f46755n = m42739a(8, "ARM_ISA_use", aVar3);
            f46756o = m42739a(9, "THUMB_ISA_use", aVar3);
            f46757p = m42739a(10, "FP_arch", aVar3);
            f46758q = m42739a(11, "WMMX_arch", aVar3);
            f46759r = m42739a(12, "Advanced_SIMD_arch", aVar3);
            f46760s = m42739a(13, "PCS_config", aVar3);
            f46761t = m42739a(14, "ABI_PCS_R9_use", aVar3);
            f46762u = m42739a(15, "ABI_PCS_RW_data", aVar3);
            f46763v = m42739a(16, "ABI_PCS_RO_data", aVar3);
            f46764w = m42739a(17, "ABI_PCS_GOT_use", aVar3);
            f46765x = m42739a(18, "ABI_PCS_wchar_t", aVar3);
            f46766y = m42739a(19, "ABI_FP_rounding", aVar3);
            f46767z = m42739a(20, "ABI_FP_denormal", aVar3);
            f46722A = m42739a(21, "ABI_FP_exceptions", aVar3);
            f46723B = m42739a(22, "ABI_FP_user_exceptions", aVar3);
            f46724C = m42739a(23, "ABI_FP_number_model", aVar3);
            f46725D = m42739a(24, "ABI_align_needed", aVar3);
            f46726E = m42739a(25, "ABI_align8_preserved", aVar3);
            f46727F = m42739a(26, "ABI_enum_size", aVar3);
            f46728G = m42739a(27, "ABI_HardFP_use", aVar3);
            f46729H = m42739a(28, "ABI_VFP_args", aVar3);
            f46730I = m42739a(29, "ABI_WMMX_args", aVar3);
            f46731J = m42739a(30, "ABI_optimization_goals", aVar3);
            f46732K = m42739a(31, "ABI_FP_optimization_goals", aVar3);
            f46733L = m42739a(32, "compatibility", aVar2);
            f46734M = m42739a(34, "CPU_unaligned_access", aVar3);
            f46735N = m42739a(36, "FP_HP_extension", aVar3);
            f46736O = m42739a(38, "ABI_FP_16bit_format", aVar3);
            f46737P = m42739a(42, "MPextension_use", aVar3);
            f46738Q = m42739a(44, "DIV_use", aVar3);
            f46739R = m42739a(64, "nodefaults", aVar3);
            f46740S = m42739a(65, "also_compatible_with", aVar2);
            f46741T = m42739a(67, "conformance", aVar2);
            f46742U = m42739a(66, "T2EE_use", aVar3);
            f46743V = m42739a(68, "Virtualization_use", aVar3);
            f46744W = m42739a(70, "MPextension_use", aVar3);
        }

        public b(int i10, String str, a aVar) {
            this.f46768a = i10;
            this.f46769b = str;
            this.f46770c = aVar;
        }

        /* renamed from: a */
        public static b m42739a(int i10, String str, a aVar) {
            b bVar = new b(i10, str, aVar);
            Map<Integer, b> map = f46746e;
            if (!map.containsKey(Integer.valueOf(bVar.m42744f()))) {
                map.put(Integer.valueOf(bVar.m42744f()), bVar);
            }
            Map<String, b> map2 = f46747f;
            if (!map2.containsKey(bVar.m42742c())) {
                map2.put(bVar.m42742c(), bVar);
            }
            f46745d.add(bVar);
            return bVar;
        }

        /* renamed from: b */
        public static b m42740b(int i10) {
            Map<Integer, b> map = f46746e;
            if (map.containsKey(Integer.valueOf(i10))) {
                return map.get(Integer.valueOf(i10));
            }
            return new b(i10, "Unknown " + i10, m42741e(i10));
        }

        /* renamed from: e */
        public static a m42741e(int i10) {
            b m42740b = m42740b(i10);
            return m42740b == null ? i10 % 2 == 0 ? a.ULEB128 : a.NTBS : m42740b.m42743d();
        }

        /* renamed from: c */
        public String m42742c() {
            return this.f46769b;
        }

        /* renamed from: d */
        public a m42743d() {
            return this.f46770c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f46768a == ((b) obj).f46768a;
        }

        /* renamed from: f */
        public int m42744f() {
            return this.f46768a;
        }

        public int hashCode() {
            return 469 + this.f46768a;
        }

        public String toString() {
            return this.f46769b + " (" + this.f46768a + ")";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/c$c.class
     */
    /* renamed from: zg.c$c */
    /* loaded from: combined.jar:classes2.jar:zg/c$c.class */
    public static class c {

        /* renamed from: a */
        public final int f46771a;

        /* renamed from: b */
        public String f46772b;

        /* renamed from: c */
        public final int f46773c;

        /* renamed from: d */
        public final int f46774d;

        /* renamed from: e */
        public final int f46775e;

        /* renamed from: f */
        public final int f46776f;

        public c(boolean z10, ByteBuffer byteBuffer) {
            this.f46771a = byteBuffer.getInt(0);
            this.f46773c = byteBuffer.getInt(4);
            this.f46774d = (int) (z10 ? byteBuffer.getLong(8) : byteBuffer.getInt(8));
            this.f46775e = (int) (z10 ? byteBuffer.getLong(24) : byteBuffer.getInt(16));
            this.f46776f = (int) (z10 ? byteBuffer.getLong(32) : byteBuffer.getInt(20));
        }

        /* renamed from: a */
        public String m42745a() {
            return this.f46772b;
        }

        /* renamed from: b */
        public int m42746b() {
            return this.f46771a;
        }

        /* renamed from: c */
        public int m42747c() {
            return this.f46775e;
        }

        /* renamed from: d */
        public int m42748d() {
            return this.f46776f;
        }

        /* renamed from: e */
        public void m42749e(String str) {
            this.f46772b = str;
        }

        public String toString() {
            return "ELFSectionHeaderEntry{nameIdx=" + this.f46771a + ", name=" + this.f46772b + ", type=" + this.f46773c + ", flags=" + this.f46774d + ", offset=" + this.f46775e + ", size=" + this.f46776f + '}';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/c$d.class
     */
    /* renamed from: zg.c$d */
    /* loaded from: combined.jar:classes2.jar:zg/c$d.class */
    public static class d {

        /* renamed from: a */
        public final List<c> f46777a = new ArrayList();

        public d(boolean z10, boolean z11, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) {
            long j10;
            short s10;
            short s11;
            int i10;
            byte b10;
            if (z10) {
                j10 = byteBuffer.getLong(40);
                s10 = byteBuffer.getShort(58);
                s11 = byteBuffer.getShort(60);
                i10 = 62;
            } else {
                j10 = byteBuffer.getInt(32);
                s10 = byteBuffer.getShort(46);
                s11 = byteBuffer.getShort(48);
                i10 = 50;
            }
            short s12 = byteBuffer.getShort(i10);
            ByteBuffer allocate = ByteBuffer.allocate(s11 * s10);
            allocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.getChannel().read(allocate, j10);
            for (int i11 = 0; i11 < s11; i11++) {
                allocate.position(i11 * s10);
                ByteBuffer slice = allocate.slice();
                slice.order(allocate.order());
                slice.limit(s10);
                this.f46777a.add(new c(z10, slice));
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(this.f46777a.get(s12).m42748d());
            allocate2.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.getChannel().read(allocate2, r0.m42747c());
            allocate2.rewind();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
            for (c cVar : this.f46777a) {
                byteArrayOutputStream.reset();
                allocate2.position(cVar.m42746b());
                while (allocate2.position() < allocate2.limit() && (b10 = allocate2.get()) != 0) {
                    byteArrayOutputStream.write(b10);
                }
                cVar.m42749e(byteArrayOutputStream.toString(HTTP.ASCII));
            }
        }

        /* renamed from: a */
        public List<c> m42750a() {
            return this.f46777a;
        }
    }

    public C10212c(String str) {
        this.f46713a = str;
    }

    /* renamed from: a */
    public static C10212c m42728a(String str) {
        C10212c c10212c = new C10212c(str);
        c10212c.m42738k();
        return c10212c;
    }

    /* renamed from: e */
    public static Map<Integer, Map<b, Object>> m42729e(ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            int position = byteBuffer.position();
            int intValue = m42733j(byteBuffer).intValue();
            int i10 = byteBuffer.getInt();
            if (intValue == 1) {
                hashMap.put(Integer.valueOf(intValue), m42731h(byteBuffer));
            }
            byteBuffer.position(position + i10);
        }
        return hashMap;
    }

    /* renamed from: f */
    public static Map<Integer, Map<b, Object>> m42730f(ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 65) {
            return Collections.EMPTY_MAP;
        }
        while (byteBuffer.position() < byteBuffer.limit()) {
            int position = byteBuffer.position();
            int i10 = byteBuffer.getInt();
            if (i10 <= 0) {
                break;
            }
            if ("aeabi".equals(m42732i(byteBuffer, null))) {
                return m42729e(byteBuffer);
            }
            byteBuffer.position(position + i10);
        }
        return Collections.EMPTY_MAP;
    }

    /* renamed from: h */
    public static Map<b, Object> m42731h(ByteBuffer byteBuffer) {
        Object valueOf;
        HashMap hashMap = new HashMap();
        while (byteBuffer.position() < byteBuffer.limit()) {
            b m42740b = b.m42740b(m42733j(byteBuffer).intValue());
            int i10 = a.f46721a[m42740b.m42743d().ordinal()];
            if (i10 == 1) {
                valueOf = Integer.valueOf(byteBuffer.getInt());
            } else if (i10 == 2) {
                valueOf = m42732i(byteBuffer, null);
            } else if (i10 == 3) {
                valueOf = m42733j(byteBuffer);
            }
            hashMap.put(m42740b, valueOf);
        }
        return hashMap;
    }

    /* renamed from: i */
    public static String m42732i(ByteBuffer byteBuffer, Integer num) {
        if (num != null) {
            byteBuffer.position(num.intValue());
        }
        int position = byteBuffer.position();
        while (byteBuffer.get() != 0 && byteBuffer.position() <= byteBuffer.limit()) {
        }
        byte[] bArr = new byte[(byteBuffer.position() - position) - 1];
        byteBuffer.position(position);
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() + 1);
        try {
            return new String(bArr, HTTP.ASCII);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: j */
    public static BigInteger m42733j(ByteBuffer byteBuffer) {
        BigInteger bigInteger = BigInteger.ZERO;
        int i10 = 0;
        while (true) {
            byte b10 = byteBuffer.get();
            bigInteger = bigInteger.or(BigInteger.valueOf(b10 & Byte.MAX_VALUE).shiftLeft(i10));
            if ((b10 & 128) == 0) {
                return bigInteger;
            }
            i10 += 7;
        }
    }

    /* renamed from: b */
    public boolean m42734b() {
        return this.f46719g;
    }

    /* renamed from: c */
    public boolean m42735c() {
        return m42734b() || m42736d();
    }

    /* renamed from: d */
    public boolean m42736d() {
        return this.f46717e;
    }

    /* renamed from: g */
    public final void m42737g(ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) {
        for (c cVar : new d(this.f46715c, this.f46716d, byteBuffer, randomAccessFile).m42750a()) {
            if (".ARM.attributes".equals(cVar.m42745a())) {
                ByteBuffer allocate = ByteBuffer.allocate(cVar.m42748d());
                allocate.order(this.f46716d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                randomAccessFile.getChannel().read(allocate, cVar.m42747c());
                allocate.rewind();
                Map<b, Object> map = m42730f(allocate).get(1);
                if (map != null) {
                    Object obj = map.get(b.f46729H);
                    if (((obj instanceof Integer) && ((Integer) obj).equals(1)) || ((obj instanceof BigInteger) && ((BigInteger) obj).intValue() == 1)) {
                        this.f46719g = true;
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void m42738k() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f46713a, "r");
        try {
            if (randomAccessFile.length() > 4) {
                byte[] bArr = new byte[4];
                randomAccessFile.seek(0L);
                randomAccessFile.read(bArr);
                if (Arrays.equals(bArr, f46712i)) {
                    this.f46714b = true;
                }
            }
            if (!this.f46714b) {
                try {
                    randomAccessFile.close();
                    return;
                } catch (IOException e10) {
                    return;
                }
            }
            randomAccessFile.seek(4L);
            byte readByte = randomAccessFile.readByte();
            byte readByte2 = randomAccessFile.readByte();
            this.f46715c = readByte == 2;
            this.f46716d = readByte2 == 2;
            randomAccessFile.seek(0L);
            ByteBuffer allocate = ByteBuffer.allocate(this.f46715c ? 64 : 52);
            randomAccessFile.getChannel().read(allocate, 0L);
            allocate.order(this.f46716d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            boolean z10 = allocate.get(18) == 40;
            this.f46720h = z10;
            if (z10) {
                int i10 = allocate.getInt(this.f46715c ? 48 : 36);
                this.f46717e = (i10 & 1024) == 1024;
                this.f46718f = (i10 & 512) == 512;
                m42737g(allocate, randomAccessFile);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e11) {
            }
        }
    }
}
