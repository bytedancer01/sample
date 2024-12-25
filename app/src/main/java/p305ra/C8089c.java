package p305ra;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/c.class
 */
/* renamed from: ra.c */
/* loaded from: combined.jar:classes2.jar:ra/c.class */
public final class C8089c extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f38961f;

    /* renamed from: g */
    public final String f38962g;

    /* renamed from: h */
    public final Bundle f38963h;

    /* renamed from: i */
    public final C8120e0 f38964i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8089c(C8120e0 c8120e0, String str, String str2, Bundle bundle) {
        super(c8120e0, true);
        this.f38964i = c8120e0;
        this.f38961f = str;
        this.f38962g = str2;
        this.f38963h = bundle;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f38964i.f39051i;
        interfaceC8313qd.clearConditionalUserProperty(this.f38961f, this.f38962g, this.f38963h);
    }
}
