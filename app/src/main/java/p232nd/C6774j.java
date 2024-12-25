package p232nd;

import java.util.ArrayList;
import md.C6567h;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.EnumC5567t;
import p188kd.InterfaceC5568u;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/j.class
 */
/* renamed from: nd.j */
/* loaded from: combined.jar:classes2.jar:nd/j.class */
public final class C6774j extends AbstractC5569v<Object> {

    /* renamed from: c */
    public static final InterfaceC5570w f35277c = m31143f(EnumC5567t.DOUBLE);

    /* renamed from: a */
    public final C5552e f35278a;

    /* renamed from: b */
    public final InterfaceC5568u f35279b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/j$a.class
     */
    /* renamed from: nd.j$a */
    /* loaded from: combined.jar:classes2.jar:nd/j$a.class */
    public class a implements InterfaceC5570w {

        /* renamed from: b */
        public final InterfaceC5568u f35280b;

        public a(InterfaceC5568u interfaceC5568u) {
            this.f35280b = interfaceC5568u;
        }

        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            if (c8462a.m36351c() == Object.class) {
                return new C6774j(c5552e, this.f35280b, null);
            }
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/j$b.class
     */
    /* renamed from: nd.j$b */
    /* loaded from: combined.jar:classes2.jar:nd/j$b.class */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final int[] f35281a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x005d
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
                p232nd.C6774j.b.f35281a = r0
                r0 = r4
                sd.b r1 = sd.EnumC8556b.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L14:
                int[] r0 = p232nd.C6774j.b.f35281a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                sd.b r1 = sd.EnumC8556b.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L1f:
                int[] r0 = p232nd.C6774j.b.f35281a     // Catch: java.lang.NoSuchFieldError -> L51 java.lang.NoSuchFieldError -> L55
                sd.b r1 = sd.EnumC8556b.STRING     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L2a:
                int[] r0 = p232nd.C6774j.b.f35281a     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                sd.b r1 = sd.EnumC8556b.NUMBER     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L35:
                int[] r0 = p232nd.C6774j.b.f35281a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                sd.b r1 = sd.EnumC8556b.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L40:
                int[] r0 = p232nd.C6774j.b.f35281a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                sd.b r1 = sd.EnumC8556b.NULL     // Catch: java.lang.NoSuchFieldError -> L61
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
            throw new UnsupportedOperationException("Method not decompiled: p232nd.C6774j.b.m45121clinit():void");
        }
    }

    public C6774j(C5552e c5552e, InterfaceC5568u interfaceC5568u) {
        this.f35278a = c5552e;
        this.f35279b = interfaceC5568u;
    }

    public /* synthetic */ C6774j(C5552e c5552e, InterfaceC5568u interfaceC5568u, a aVar) {
        this(c5552e, interfaceC5568u);
    }

    /* renamed from: e */
    public static InterfaceC5570w m31142e(InterfaceC5568u interfaceC5568u) {
        return interfaceC5568u == EnumC5567t.DOUBLE ? f35277c : m31143f(interfaceC5568u);
    }

    /* renamed from: f */
    public static InterfaceC5570w m31143f(InterfaceC5568u interfaceC5568u) {
        return new a(interfaceC5568u);
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: b */
    public Object mo27561b(C8555a c8555a) {
        switch (b.f35281a[c8555a.mo31105J0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c8555a.mo31113f();
                while (c8555a.mo31118y()) {
                    arrayList.add(mo27561b(c8555a));
                }
                c8555a.mo31115t();
                return arrayList;
            case 2:
                C6567h c6567h = new C6567h();
                c8555a.mo31114l();
                while (c8555a.mo31118y()) {
                    c6567h.put(c8555a.mo31102D0(), mo27561b(c8555a));
                }
                c8555a.mo31116v();
                return c6567h;
            case 3:
                return c8555a.mo31104H0();
            case 4:
                return this.f35279b.readNumber(c8555a);
            case 5:
                return Boolean.valueOf(c8555a.mo31117v0());
            case 6:
                c8555a.mo31103F0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: d */
    public void mo27562d(C8557c c8557c, Object obj) {
        if (obj == null) {
            c8557c.mo31133v0();
            return;
        }
        AbstractC5569v m27549l = this.f35278a.m27549l(obj.getClass());
        if (!(m27549l instanceof C6774j)) {
            m27549l.mo27562d(c8557c, obj);
        } else {
            c8557c.mo31130p();
            c8557c.mo31132v();
        }
    }
}
