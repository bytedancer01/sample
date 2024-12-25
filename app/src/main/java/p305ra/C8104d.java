package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d.class
 */
/* renamed from: ra.d */
/* loaded from: combined.jar:classes2.jar:ra/d.class */
public final class C8104d extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f38981f;

    /* renamed from: g */
    public final String f38982g;

    /* renamed from: h */
    public final BinderC8385va f38983h;

    /* renamed from: i */
    public final C8120e0 f38984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8104d(C8120e0 c8120e0, String str, String str2, BinderC8385va binderC8385va) {
        super(c8120e0, true);
        this.f38984i = c8120e0;
        this.f38981f = str;
        this.f38982g = str2;
        this.f38983h = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f38984i.f39051i;
        interfaceC8313qd.getConditionalUserProperties(this.f38981f, this.f38982g, this.f38983h);
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: b */
    public final void mo35176b() {
        this.f38983h.mo35776j(null);
    }
}
