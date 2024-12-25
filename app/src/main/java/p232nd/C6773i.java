package p232nd;

import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.C5565r;
import p188kd.EnumC5567t;
import p188kd.InterfaceC5568u;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/i.class
 */
/* renamed from: nd.i */
/* loaded from: combined.jar:classes2.jar:nd/i.class */
public final class C6773i extends AbstractC5569v<Number> {

    /* renamed from: b */
    public static final InterfaceC5570w f35273b = m31139f(EnumC5567t.LAZILY_PARSED_NUMBER);

    /* renamed from: a */
    public final InterfaceC5568u f35274a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/i$a.class
     */
    /* renamed from: nd.i$a */
    /* loaded from: combined.jar:classes2.jar:nd/i$a.class */
    public class a implements InterfaceC5570w {

        /* renamed from: b */
        public final C6773i f35275b;

        public a(C6773i c6773i) {
            this.f35275b = c6773i;
        }

        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            return c8462a.m36351c() == Number.class ? this.f35275b : null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/i$b.class
     */
    /* renamed from: nd.i$b */
    /* loaded from: combined.jar:classes2.jar:nd/i$b.class */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final int[] f35276a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                sd.b[] r0 = sd.EnumC8556b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p232nd.C6773i.b.f35276a = r0
                r0 = r4
                sd.b r1 = sd.EnumC8556b.NULL     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = p232nd.C6773i.b.f35276a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                sd.b r1 = sd.EnumC8556b.NUMBER     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = p232nd.C6773i.b.f35276a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                sd.b r1 = sd.EnumC8556b.STRING     // Catch: java.lang.NoSuchFieldError -> L33
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
            throw new UnsupportedOperationException("Method not decompiled: p232nd.C6773i.b.m45119clinit():void");
        }
    }

    public C6773i(InterfaceC5568u interfaceC5568u) {
        this.f35274a = interfaceC5568u;
    }

    /* renamed from: e */
    public static InterfaceC5570w m31138e(InterfaceC5568u interfaceC5568u) {
        return interfaceC5568u == EnumC5567t.LAZILY_PARSED_NUMBER ? f35273b : m31139f(interfaceC5568u);
    }

    /* renamed from: f */
    public static InterfaceC5570w m31139f(InterfaceC5568u interfaceC5568u) {
        return new a(new C6773i(interfaceC5568u));
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number mo27561b(C8555a c8555a) {
        EnumC8556b mo31105J0 = c8555a.mo31105J0();
        int i10 = b.f35276a[mo31105J0.ordinal()];
        if (i10 == 1) {
            c8555a.mo31103F0();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f35274a.readNumber(c8555a);
        }
        throw new C5565r("Expecting number, got: " + mo31105J0);
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo27562d(C8557c c8557c, Number number) {
        c8557c.mo31122M0(number);
    }
}
