package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/h.class
 */
/* renamed from: ra.h */
/* loaded from: combined.jar:classes2.jar:ra/h.class */
public final class C8164h extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f39097f;

    /* renamed from: g */
    public final C8120e0 f39098g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8164h(C8120e0 c8120e0, String str) {
        super(c8120e0, true);
        this.f39098g = c8120e0;
        this.f39097f = str;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39098g.f39051i;
        interfaceC8313qd.endAdUnitExposure(this.f39097f, this.f39327c);
    }
}
