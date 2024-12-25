package androidx.lifecycle;

import androidx.lifecycle.AbstractC0572g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/CompositeGeneratedAdaptersObserver.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/CompositeGeneratedAdaptersObserver.class */
class CompositeGeneratedAdaptersObserver implements InterfaceC0577k {

    /* renamed from: b */
    public final InterfaceC0570f[] f3706b;

    public CompositeGeneratedAdaptersObserver(InterfaceC0570f[] interfaceC0570fArr) {
        this.f3706b = interfaceC0570fArr;
    }

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
        C0584r c0584r = new C0584r();
        for (InterfaceC0570f interfaceC0570f : this.f3706b) {
            interfaceC0570f.m3152a(interfaceC0579m, bVar, false, c0584r);
        }
        for (InterfaceC0570f interfaceC0570f2 : this.f3706b) {
            interfaceC0570f2.m3152a(interfaceC0579m, bVar, true, c0584r);
        }
    }
}
