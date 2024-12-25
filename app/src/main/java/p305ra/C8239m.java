package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/m.class
 */
/* renamed from: ra.m */
/* loaded from: combined.jar:classes2.jar:ra/m.class */
public final class C8239m extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final BinderC8385va f39175f;

    /* renamed from: g */
    public final C8120e0 f39176g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8239m(C8120e0 c8120e0, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f39176g = c8120e0;
        this.f39175f = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39176g.f39051i;
        interfaceC8313qd.getCurrentScreenClass(this.f39175f);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f39175f.mo35776j(null);
    }
}
