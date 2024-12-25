package androidx.lifecycle;

import androidx.lifecycle.AbstractC0572g;
import org.jetbrains.annotations.NotNull;
import p067di.InterfaceC4466c1;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/LifecycleController$observer$1.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/LifecycleController$observer$1.class */
final class LifecycleController$observer$1 implements InterfaceC0577k {

    /* renamed from: b */
    public final InterfaceC4466c1 f3710b;

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public final void mo775b(@NotNull InterfaceC0579m interfaceC0579m, @NotNull AbstractC0572g.b bVar) {
        C9367f.m39527f(interfaceC0579m, "source");
        C9367f.m39527f(bVar, "<anonymous parameter 1>");
        AbstractC0572g lifecycle = interfaceC0579m.getLifecycle();
        C9367f.m39523b(lifecycle, "source.lifecycle");
        if (lifecycle.mo3155b() == AbstractC0572g.c.DESTROYED) {
            InterfaceC4466c1.a.m22644a(this.f3710b, null, 1, null);
            throw null;
        }
        AbstractC0572g lifecycle2 = interfaceC0579m.getLifecycle();
        C9367f.m39523b(lifecycle2, "source.lifecycle");
        lifecycle2.mo3155b().compareTo(C0574h.m3159b(null));
        C0574h.m3158a(null);
        throw null;
    }
}
