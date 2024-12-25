package p305ra;

import android.app.Activity;
import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/z.class
 */
/* renamed from: ra.z */
/* loaded from: combined.jar:classes2.jar:ra/z.class */
public final class C8434z extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Activity f39434f;

    /* renamed from: g */
    public final C8105d0 f39435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8434z(C8105d0 c8105d0, Activity activity) {
        super(c8105d0.f38985b, true);
        this.f39435g = c8105d0;
        this.f39434f = activity;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39435g.f38985b.f39051i;
        interfaceC8313qd.onActivityPaused(BinderC4994b.m25160B1(this.f39434f), this.f39327c);
    }
}
