package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/n.class
 */
/* renamed from: ra.n */
/* loaded from: combined.jar:classes2.jar:ra/n.class */
public final class C8254n extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f39199f;

    /* renamed from: g */
    public final String f39200g;

    /* renamed from: h */
    public final boolean f39201h;

    /* renamed from: i */
    public final BinderC8385va f39202i;

    /* renamed from: j */
    public final C8120e0 f39203j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8254n(C8120e0 c8120e0, String str, String str2, boolean z10, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f39203j = c8120e0;
        this.f39199f = str;
        this.f39200g = str2;
        this.f39201h = z10;
        this.f39202i = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39203j.f39051i;
        interfaceC8313qd.getUserProperties(this.f39199f, this.f39200g, this.f39201h, this.f39202i);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f39202i.mo35776j(null);
    }
}
