package p305ra;

import android.app.Activity;
import android.os.Bundle;
import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/w.class
 */
/* renamed from: ra.w */
/* loaded from: combined.jar:classes2.jar:ra/w.class */
public final class C8389w extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Bundle f39356f;

    /* renamed from: g */
    public final Activity f39357g;

    /* renamed from: h */
    public final C8105d0 f39358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8389w(C8105d0 c8105d0, Bundle bundle, Activity activity) {
        super(c8105d0.f38985b, true);
        this.f39358h = c8105d0;
        this.f39356f = bundle;
        this.f39357g = activity;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        Bundle bundle;
        InterfaceC8313qd interfaceC8313qd;
        if (this.f39356f != null) {
            Bundle bundle2 = new Bundle();
            bundle = bundle2;
            if (this.f39356f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f39356f.get("com.google.app_measurement.screen_service");
                bundle = bundle2;
                if (obj instanceof Bundle) {
                    bundle2.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                    bundle = bundle2;
                }
            }
        } else {
            bundle = null;
        }
        interfaceC8313qd = this.f39358h.f38985b.f39051i;
        interfaceC8313qd.onActivityCreated(BinderC4994b.m25160B1(this.f39357g), bundle, this.f39327c);
    }
}
