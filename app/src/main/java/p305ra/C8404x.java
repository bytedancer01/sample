package p305ra;

import android.app.Activity;
import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x.class
 */
/* renamed from: ra.x */
/* loaded from: combined.jar:classes2.jar:ra/x.class */
public final class C8404x extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Activity f39370f;

    /* renamed from: g */
    public final C8105d0 f39371g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8404x(C8105d0 c8105d0, Activity activity) {
        super(c8105d0.f38985b, true);
        this.f39371g = c8105d0;
        this.f39370f = activity;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39371g.f38985b.f39051i;
        interfaceC8313qd.onActivityStarted(BinderC4994b.m25160B1(this.f39370f), this.f39327c);
    }
}
