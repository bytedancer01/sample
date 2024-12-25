package androidx.lifecycle;

import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0562b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/ReflectiveGenericLifecycleObserver.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/ReflectiveGenericLifecycleObserver.class */
class ReflectiveGenericLifecycleObserver implements InterfaceC0577k {

    /* renamed from: b */
    public final Object f3733b;

    /* renamed from: c */
    public final C0562b.a f3734c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3733b = obj;
        this.f3734c = C0562b.f3747c.m3126c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
        this.f3734c.m3130a(interfaceC0579m, bVar, this.f3733b);
    }
}
