package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/q.class
 */
/* renamed from: ra.q */
/* loaded from: combined.jar:classes2.jar:ra/q.class */
public final class C8299q extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f39239f;

    /* renamed from: g */
    public final BinderC8385va f39240g;

    /* renamed from: h */
    public final C8120e0 f39241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8299q(C8120e0 c8120e0, String str, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f39241h = c8120e0;
        this.f39239f = str;
        this.f39240g = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39241h.f39051i;
        interfaceC8313qd.getMaxUserProperties(this.f39239f, this.f39240g);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f39240g.mo35776j(null);
    }
}
