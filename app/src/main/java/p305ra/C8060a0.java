package p305ra;

import android.app.Activity;
import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/a0.class
 */
/* renamed from: ra.a0 */
/* loaded from: combined.jar:classes2.jar:ra/a0.class */
public final class C8060a0 extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Activity f38922f;

    /* renamed from: g */
    public final C8105d0 f38923g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8060a0(C8105d0 c8105d0, Activity activity) {
        super(c8105d0.f38985b, true);
        this.f38923g = c8105d0;
        this.f38922f = activity;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f38923g.f38985b.f39051i;
        interfaceC8313qd.onActivityStopped(BinderC4994b.m25160B1(this.f38922f), this.f39327c);
    }
}
