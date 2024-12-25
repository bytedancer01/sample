package p074e5;

import p111g5.AbstractC4953g;
import p111g5.AbstractC4954h;
import p111g5.C4947a;
import p111g5.C4949c;
import p180k5.AbstractC5483h;
import p180k5.C5484i;
import p196l5.AbstractC5681a;
import p226n5.C6653a;
import p319s5.C8535d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/e.class
 */
/* renamed from: e5.e */
/* loaded from: combined.jar:classes1.jar:e5/e.class */
public final class C4628e extends AbstractC4954h<EnumC4630g, C4628e> {

    /* renamed from: n */
    public final C6653a f27324n;

    /* renamed from: o */
    public final int f27325o;

    /* renamed from: p */
    public final int f27326p;

    /* renamed from: q */
    public final int f27327q;

    /* renamed from: r */
    public final int f27328r;

    /* renamed from: s */
    public final int f27329s;

    public C4628e(C4628e c4628e, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(c4628e, i10);
        this.f27325o = i11;
        this.f27324n = c4628e.f27324n;
        this.f27326p = i12;
        this.f27327q = i13;
        this.f27328r = i14;
        this.f27329s = i15;
    }

    public C4628e(C4947a c4947a, AbstractC5681a abstractC5681a, C5484i c5484i, C8535d c8535d, C4949c c4949c) {
        super(c4947a, abstractC5681a, c5484i, c8535d, c4949c);
        this.f27325o = AbstractC4953g.m24940b(EnumC4630g.class);
        this.f27324n = C6653a.f34686e;
        this.f27326p = 0;
        this.f27327q = 0;
        this.f27328r = 0;
        this.f27329s = 0;
    }

    @Override // p111g5.AbstractC4953g
    /* renamed from: c */
    public AbstractC4625b mo23268c() {
        return m24943f(EnumC4637n.USE_ANNOTATIONS) ? super.mo23268c() : AbstractC5483h.f31314b;
    }

    /* renamed from: g */
    public C4628e m23269g(EnumC4637n... enumC4637nArr) {
        int i10 = this.f28726b;
        for (EnumC4637n enumC4637n : enumC4637nArr) {
            i10 |= enumC4637n.getMask();
        }
        return i10 == this.f28726b ? this : new C4628e(this, i10, this.f27325o, this.f27326p, this.f27327q, this.f27328r, this.f27329s);
    }

    /* renamed from: h */
    public C4628e m23270h(EnumC4637n... enumC4637nArr) {
        int i10 = this.f28726b;
        for (EnumC4637n enumC4637n : enumC4637nArr) {
            i10 &= enumC4637n.getMask() ^ (-1);
        }
        return i10 == this.f28726b ? this : new C4628e(this, i10, this.f27325o, this.f27326p, this.f27327q, this.f27328r, this.f27329s);
    }
}
