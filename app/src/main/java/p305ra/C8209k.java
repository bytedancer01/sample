package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/k.class
 */
/* renamed from: ra.k */
/* loaded from: combined.jar:classes2.jar:ra/k.class */
public final class C8209k extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final BinderC8385va f39145f;

    /* renamed from: g */
    public final C8120e0 f39146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8209k(C8120e0 c8120e0, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f39146g = c8120e0;
        this.f39145f = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39146g.f39051i;
        interfaceC8313qd.generateEventId(this.f39145f);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f39145f.mo35776j(null);
    }
}
