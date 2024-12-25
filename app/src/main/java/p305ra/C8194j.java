package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j.class
 */
/* renamed from: ra.j */
/* loaded from: combined.jar:classes2.jar:ra/j.class */
public final class C8194j extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final BinderC8385va f39131f;

    /* renamed from: g */
    public final C8120e0 f39132g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8194j(C8120e0 c8120e0, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f39132g = c8120e0;
        this.f39131f = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39132g.f39051i;
        interfaceC8313qd.getCachedAppInstanceId(this.f39131f);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f39131f.mo35776j(null);
    }
}
