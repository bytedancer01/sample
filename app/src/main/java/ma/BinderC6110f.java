package ma;

import ga.BinderC4994b;
import ga.InterfaceC4993a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p216m9.AbstractBinderC5970l1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/f.class
 */
/* renamed from: ma.f */
/* loaded from: combined.jar:classes2.jar:ma/f.class */
public final class BinderC6110f extends AbstractBinderC5970l1 {

    /* renamed from: b */
    public final Set f33755b = Collections.synchronizedSet(new HashSet());

    @Override // p216m9.InterfaceC5973m1
    /* renamed from: k */
    public final InterfaceC4993a mo29326k() {
        return BinderC4994b.m25160B1(this);
    }

    @Override // p216m9.InterfaceC5973m1
    /* renamed from: l */
    public final void mo29327l() {
        Iterator it = this.f33755b.iterator();
        while (it.hasNext()) {
            ((InterfaceC6089e) it.next()).zza();
        }
    }

    @Override // p216m9.InterfaceC5973m1
    /* renamed from: o */
    public final void mo29328o() {
        Iterator it = this.f33755b.iterator();
        while (it.hasNext()) {
            ((InterfaceC6089e) it.next()).mo29558k();
        }
    }

    /* renamed from: y0 */
    public final void m29581y0(InterfaceC6089e interfaceC6089e) {
        this.f33755b.add(interfaceC6089e);
    }
}
