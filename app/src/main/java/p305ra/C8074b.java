package p305ra;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b.class
 */
/* renamed from: ra.b */
/* loaded from: combined.jar:classes2.jar:ra/b.class */
public final class C8074b extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Bundle f38937f;

    /* renamed from: g */
    public final C8120e0 f38938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8074b(C8120e0 c8120e0, Bundle bundle) {
        super(c8120e0, true);
        this.f38938g = c8120e0;
        this.f38937f = bundle;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f38938g.f39051i;
        interfaceC8313qd.setConditionalUserProperty(this.f38937f, this.f39326b);
    }
}
