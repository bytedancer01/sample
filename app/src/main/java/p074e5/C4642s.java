package p074e5;

import p055d5.C4304b;
import p111g5.AbstractC4953g;
import p111g5.AbstractC4954h;
import p111g5.C4947a;
import p111g5.C4949c;
import p180k5.C5484i;
import p196l5.AbstractC5681a;
import p319s5.C8535d;
import p378w4.C9411e;
import p397x4.InterfaceC9660j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/s.class
 */
/* renamed from: e5.s */
/* loaded from: combined.jar:classes1.jar:e5/s.class */
public final class C4642s extends AbstractC4954h<EnumC4643t, C4642s> {

    /* renamed from: u */
    public static final InterfaceC9660j f27360u = new C4304b();

    /* renamed from: v */
    public static final C9411e f27361v = C9411e.m39768a();

    /* renamed from: n */
    public final InterfaceC9660j f27362n;

    /* renamed from: o */
    public final int f27363o;

    /* renamed from: p */
    public final int f27364p;

    /* renamed from: q */
    public final int f27365q;

    /* renamed from: r */
    public final int f27366r;

    /* renamed from: s */
    public final int f27367s;

    /* renamed from: t */
    public final C9411e f27368t;

    public C4642s(C4642s c4642s, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(c4642s, i10);
        this.f27363o = i11;
        this.f27368t = c4642s.f27368t;
        this.f27362n = c4642s.f27362n;
        this.f27364p = i12;
        this.f27365q = i13;
        this.f27366r = i14;
        this.f27367s = i15;
    }

    public C4642s(C4947a c4947a, AbstractC5681a abstractC5681a, C5484i c5484i, C8535d c8535d, C4949c c4949c) {
        super(c4947a, abstractC5681a, c5484i, c8535d, c4949c);
        this.f27363o = AbstractC4953g.m24940b(EnumC4643t.class);
        this.f27362n = f27360u;
        this.f27364p = 0;
        this.f27365q = 0;
        this.f27366r = 0;
        this.f27367s = 0;
        this.f27368t = f27361v;
    }

    @Override // p111g5.AbstractC4953g
    /* renamed from: c */
    public AbstractC4625b mo23268c() {
        return m24943f(EnumC4637n.USE_ANNOTATIONS) ? super.mo23268c() : AbstractC4625b.m23267a();
    }

    /* renamed from: g */
    public C4642s m23278g(EnumC4637n... enumC4637nArr) {
        int i10 = this.f28726b;
        for (EnumC4637n enumC4637n : enumC4637nArr) {
            i10 |= enumC4637n.getMask();
        }
        return i10 == this.f28726b ? this : new C4642s(this, i10, this.f27363o, this.f27364p, this.f27365q, this.f27366r, this.f27367s);
    }

    /* renamed from: h */
    public C4642s m23279h(EnumC4637n... enumC4637nArr) {
        int i10 = this.f28726b;
        for (EnumC4637n enumC4637n : enumC4637nArr) {
            i10 &= enumC4637n.getMask() ^ (-1);
        }
        return i10 == this.f28726b ? this : new C4642s(this, i10, this.f27363o, this.f27364p, this.f27365q, this.f27366r, this.f27367s);
    }

    public String toString() {
        return "[SerializationConfig: flags=0x" + Integer.toHexString(this.f27363o) + "]";
    }
}
