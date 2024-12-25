package p305ra;

import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/o.class
 */
/* renamed from: ra.o */
/* loaded from: combined.jar:classes2.jar:ra/o.class */
public final class C8269o extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f39220f;

    /* renamed from: g */
    public final Object f39221g;

    /* renamed from: h */
    public final C8120e0 f39222h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8269o(C8120e0 c8120e0, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c8120e0, false);
        this.f39222h = c8120e0;
        this.f39220f = str;
        this.f39221g = obj;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39222h.f39051i;
        interfaceC8313qd.logHealthData(5, this.f39220f, BinderC4994b.m25160B1(this.f39221g), BinderC4994b.m25160B1(null), BinderC4994b.m25160B1(null));
    }
}
