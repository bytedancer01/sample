package p305ra;

import android.app.Activity;
import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b0.class
 */
/* renamed from: ra.b0 */
/* loaded from: combined.jar:classes2.jar:ra/b0.class */
public final class C8075b0 extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Activity f38939f;

    /* renamed from: g */
    public final BinderC8385va f38940g;

    /* renamed from: h */
    public final C8105d0 f38941h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8075b0(C8105d0 c8105d0, Activity activity, BinderC8385va binderC8385va) {
        super(c8105d0.f38985b, true);
        this.f38941h = c8105d0;
        this.f38939f = activity;
        this.f38940g = binderC8385va;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f38941h.f38985b.f39051i;
        interfaceC8313qd.onActivitySaveInstanceState(BinderC4994b.m25160B1(this.f38939f), this.f38940g, this.f39327c);
    }
}
