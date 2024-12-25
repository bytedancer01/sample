package androidx.lifecycle;

import androidx.lifecycle.AbstractC0572g;
import org.jetbrains.annotations.NotNull;
import p067di.C4481h1;
import p233nh.InterfaceC6792g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/LifecycleCoroutineScopeImpl.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/LifecycleCoroutineScopeImpl.class */
public final class LifecycleCoroutineScopeImpl extends AbstractC0575i implements InterfaceC0577k {

    /* renamed from: b */
    @NotNull
    public final AbstractC0572g f3711b;

    /* renamed from: c */
    @NotNull
    public final InterfaceC6792g f3712c;

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(@NotNull InterfaceC0579m interfaceC0579m, @NotNull AbstractC0572g.b bVar) {
        C9367f.m39527f(interfaceC0579m, "source");
        C9367f.m39527f(bVar, "event");
        if (m3092c().mo3155b().compareTo(AbstractC0572g.c.DESTROYED) <= 0) {
            m3092c().mo3156c(this);
            C4481h1.m22668d(mo3093i(), null, 1, null);
        }
    }

    @NotNull
    /* renamed from: c */
    public AbstractC0572g m3092c() {
        return this.f3711b;
    }

    @Override // p067di.InterfaceC4471e0
    @NotNull
    /* renamed from: i */
    public InterfaceC6792g mo3093i() {
        return this.f3712c;
    }
}
