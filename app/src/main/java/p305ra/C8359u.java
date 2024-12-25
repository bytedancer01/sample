package p305ra;

import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/u.class
 */
/* renamed from: ra.u */
/* loaded from: combined.jar:classes2.jar:ra/u.class */
public final class C8359u extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f39290f;

    /* renamed from: g */
    public final String f39291g;

    /* renamed from: h */
    public final Object f39292h;

    /* renamed from: i */
    public final boolean f39293i;

    /* renamed from: j */
    public final C8120e0 f39294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8359u(C8120e0 c8120e0, String str, String str2, Object obj, boolean z10) {
        super(c8120e0, true);
        this.f39294j = c8120e0;
        this.f39290f = str;
        this.f39291g = str2;
        this.f39292h = obj;
        this.f39293i = z10;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39294j.f39051i;
        interfaceC8313qd.setUserProperty(this.f39290f, this.f39291g, BinderC4994b.m25160B1(this.f39292h), this.f39293i, this.f39326b);
    }
}
