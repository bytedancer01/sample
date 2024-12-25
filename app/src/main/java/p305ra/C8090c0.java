package p305ra;

import android.app.Activity;
import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/c0.class
 */
/* renamed from: ra.c0 */
/* loaded from: combined.jar:classes2.jar:ra/c0.class */
public final class C8090c0 extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Activity f38965f;

    /* renamed from: g */
    public final C8105d0 f38966g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8090c0(C8105d0 c8105d0, Activity activity) {
        super(c8105d0.f38985b, true);
        this.f38966g = c8105d0;
        this.f38965f = activity;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f38966g.f38985b.f39051i;
        interfaceC8313qd.onActivityDestroyed(BinderC4994b.m25160B1(this.f38965f), this.f39327c);
    }
}
