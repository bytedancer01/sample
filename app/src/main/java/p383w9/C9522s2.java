package p383w9;

import p350u9.C8808d;
import p383w9.C9472i;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/s2.class
 */
/* renamed from: w9.s2 */
/* loaded from: combined.jar:classes2.jar:w9/s2.class */
public final class C9522s2 extends AbstractC9490l2<Boolean> {

    /* renamed from: c */
    public final C9472i.a<?> f43416c;

    public C9522s2(C9472i.a<?> aVar, C10146j<Boolean> c10146j) {
        super(4, c10146j);
        this.f43416c = aVar;
    }

    @Override // p383w9.AbstractC9526t2
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo40011d(C9535w c9535w, boolean z10) {
    }

    @Override // p383w9.AbstractC9509p1
    /* renamed from: f */
    public final boolean mo40009f(C9464g1<?> c9464g1) {
        C9537w1 c9537w1 = c9464g1.m39911u().get(this.f43416c);
        return c9537w1 != null && c9537w1.f43475a.m39950f();
    }

    @Override // p383w9.AbstractC9509p1
    /* renamed from: g */
    public final C8808d[] mo40010g(C9464g1<?> c9464g1) {
        C9537w1 c9537w1 = c9464g1.m39911u().get(this.f43416c);
        if (c9537w1 == null) {
            return null;
        }
        return c9537w1.f43475a.m39947c();
    }

    @Override // p383w9.AbstractC9490l2
    /* renamed from: h */
    public final void mo39944h(C9464g1<?> c9464g1) {
        C9537w1 remove = c9464g1.m39911u().remove(this.f43416c);
        if (remove == null) {
            this.f43327b.m42582e(Boolean.FALSE);
        } else {
            remove.f43476b.mo40031b(c9464g1.m39910s(), this.f43327b);
            remove.f43475a.m39945a();
        }
    }
}
