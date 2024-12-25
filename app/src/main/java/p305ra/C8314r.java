package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/r.class
 */
/* renamed from: ra.r */
/* loaded from: combined.jar:classes2.jar:ra/r.class */
public final class C8314r extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final boolean f39254f;

    /* renamed from: g */
    public final C8120e0 f39255g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8314r(C8120e0 c8120e0, boolean z10) {
        super(c8120e0, true);
        this.f39255g = c8120e0;
        this.f39254f = z10;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39255g.f39051i;
        interfaceC8313qd.setDataCollectionEnabled(this.f39254f);
    }
}
