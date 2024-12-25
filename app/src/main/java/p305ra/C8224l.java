package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l.class
 */
/* renamed from: ra.l */
/* loaded from: combined.jar:classes2.jar:ra/l.class */
public final class C8224l extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final BinderC8385va f39161f;

    /* renamed from: g */
    public final C8120e0 f39162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8224l(C8120e0 c8120e0, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f39162g = c8120e0;
        this.f39161f = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39162g.f39051i;
        interfaceC8313qd.getCurrentScreenName(this.f39161f);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f39161f.mo35776j(null);
    }
}
