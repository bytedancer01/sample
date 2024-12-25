package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/i.class
 */
/* renamed from: ra.i */
/* loaded from: combined.jar:classes2.jar:ra/i.class */
public final class C8179i extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final BinderC8385va f39112f;

    /* renamed from: g */
    public final C8120e0 f39113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8179i(C8120e0 c8120e0, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f39113g = c8120e0;
        this.f39112f = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39113g.f39051i;
        interfaceC8313qd.getGmpAppId(this.f39112f);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f39112f.mo35776j(null);
    }
}
