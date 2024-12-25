package p383w9;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import p294r.C7929b;
import p350u9.C8804b;
import p350u9.C8812f;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/x.class
 */
/* renamed from: w9.x */
/* loaded from: combined.jar:classes2.jar:w9/x.class */
public final class C9539x extends AbstractDialogInterfaceOnCancelListenerC9441b3 {

    /* renamed from: g */
    public final C7929b<C9437b<?>> f43483g;

    /* renamed from: h */
    public final C9457f f43484h;

    public C9539x(InterfaceC9467h interfaceC9467h, C9457f c9457f, C8812f c8812f) {
        super(interfaceC9467h, c8812f);
        this.f43483g = new C7929b<>();
        this.f43484h = c9457f;
        this.f14831b.mo39917d("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m40074u(Activity activity, C9457f c9457f, C9437b<?> c9437b) {
        InterfaceC9467h m13153c = LifecycleCallback.m13153c(activity);
        C9539x c9539x = (C9539x) m13153c.mo39918f("ConnectionlessLifecycleHelper", C9539x.class);
        C9539x c9539x2 = c9539x;
        if (c9539x == null) {
            c9539x2 = new C9539x(m13153c, c9457f, C8812f.m37675q());
        }
        C9935o.m41851k(c9437b, "ApiKey cannot be null");
        c9539x2.f43483g.add(c9437b);
        c9457f.m39852c(c9539x2);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo13160h() {
        super.mo13160h();
        m40076v();
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo13162j() {
        super.mo13162j();
        m40076v();
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo13163k() {
        super.mo13163k();
        this.f43484h.m39853d(this);
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3
    /* renamed from: m */
    public final void mo39805m(C8804b c8804b, int i10) {
        this.f43484h.m39849J(c8804b, i10);
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3
    /* renamed from: n */
    public final void mo39806n() {
        this.f43484h.m39850a();
    }

    /* renamed from: t */
    public final C7929b<C9437b<?>> m40075t() {
        return this.f43483g;
    }

    /* renamed from: v */
    public final void m40076v() {
        if (this.f43483g.isEmpty()) {
            return;
        }
        this.f43484h.m39852c(this);
    }
}
