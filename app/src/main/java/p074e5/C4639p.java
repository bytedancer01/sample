package p074e5;

import java.io.Serializable;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p111g5.C4947a;
import p111g5.C4949c;
import p123h5.AbstractC5030d;
import p123h5.C5028b;
import p180k5.AbstractC5481f;
import p180k5.C5480e;
import p180k5.C5482g;
import p180k5.C5484i;
import p180k5.InterfaceC5485j;
import p196l5.AbstractC5681a;
import p212m5.C5929a;
import p240o5.AbstractC6909d;
import p240o5.AbstractC6911f;
import p240o5.C6907b;
import p300r5.C7960b;
import p300r5.C7963e;
import p319s5.C8535d;
import p319s5.C8536e;
import p397x4.AbstractC9659i;
import p397x4.C9652b;
import p397x4.C9653c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/p.class
 */
/* renamed from: e5.p */
/* loaded from: combined.jar:classes1.jar:e5/p.class */
public class C4639p extends AbstractC9659i implements Serializable {

    /* renamed from: m */
    public static final AbstractC4631h f27341m = C7960b.m34515g(AbstractC4633j.class);

    /* renamed from: n */
    public static final AbstractC4625b f27342n;

    /* renamed from: o */
    public static final InterfaceC5485j<?> f27343o;

    /* renamed from: p */
    public static final C4947a f27344p;

    /* renamed from: b */
    public final C9653c f27345b;

    /* renamed from: c */
    public C7963e f27346c;

    /* renamed from: d */
    public AbstractC5681a f27347d;

    /* renamed from: e */
    public C4949c f27348e;

    /* renamed from: f */
    public C5484i f27349f;

    /* renamed from: g */
    public C4642s f27350g;

    /* renamed from: h */
    public AbstractC6909d f27351h;

    /* renamed from: i */
    public AbstractC6911f f27352i;

    /* renamed from: j */
    public C4628e f27353j;

    /* renamed from: k */
    public AbstractC5030d f27354k;

    /* renamed from: l */
    public final ConcurrentHashMap<AbstractC4631h, AbstractC4632i<Object>> f27355l;

    static {
        C5482g c5482g = new C5482g();
        f27342n = c5482g;
        InterfaceC5485j.a m27281a = InterfaceC5485j.a.m27281a();
        f27343o = m27281a;
        f27344p = new C4947a(null, c5482g, m27281a, null, C7963e.m34522a(), null, C8536e.f39925p, null, Locale.getDefault(), null, C9652b.m40585a());
    }

    public C4639p() {
        this(null, null, null);
    }

    public C4639p(C9653c c9653c) {
        this(c9653c, null, null);
    }

    public C4639p(C9653c c9653c, AbstractC6909d abstractC6909d, AbstractC5030d abstractC5030d) {
        this.f27355l = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (c9653c == null) {
            this.f27345b = new C4638o(this);
        } else {
            this.f27345b = c9653c;
            if (c9653c.mo23274a() == null) {
                c9653c.m40587c(this);
            }
        }
        this.f27347d = new C5929a();
        C8535d c8535d = new C8535d();
        this.f27346c = C7963e.m34522a();
        C5484i c5484i = new C5484i(null);
        this.f27349f = c5484i;
        C4947a m24937c = f27344p.m24937c(m23277b());
        C4949c c4949c = new C4949c();
        this.f27348e = c4949c;
        this.f27350g = new C4642s(m24937c, this.f27347d, c5484i, c8535d, c4949c);
        this.f27353j = new C4628e(m24937c, this.f27347d, c5484i, c8535d, c4949c);
        boolean m40586b = this.f27345b.m40586b();
        C4642s c4642s = this.f27350g;
        EnumC4637n enumC4637n = EnumC4637n.SORT_PROPERTIES_ALPHABETICALLY;
        if (c4642s.m24943f(enumC4637n) ^ m40586b) {
            m23276a(enumC4637n, m40586b);
        }
        this.f27351h = abstractC6909d == null ? new AbstractC6909d.a() : abstractC6909d;
        this.f27354k = abstractC5030d == null ? new AbstractC5030d.a(C5028b.f29081n) : abstractC5030d;
        this.f27352i = C6907b.f35747e;
    }

    /* renamed from: a */
    public C4639p m23276a(EnumC4637n enumC4637n, boolean z10) {
        C4642s m23279h;
        C4642s c4642s = this.f27350g;
        EnumC4637n[] enumC4637nArr = new EnumC4637n[1];
        if (z10) {
            enumC4637nArr[0] = enumC4637n;
            m23279h = c4642s.m23278g(enumC4637nArr);
        } else {
            enumC4637nArr[0] = enumC4637n;
            m23279h = c4642s.m23279h(enumC4637nArr);
        }
        this.f27350g = m23279h;
        this.f27353j = z10 ? this.f27353j.m23269g(enumC4637n) : this.f27353j.m23270h(enumC4637n);
        return this;
    }

    /* renamed from: b */
    public AbstractC5481f m23277b() {
        return new C5480e();
    }
}
