package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/FragmentManager$6.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/FragmentManager$6.class */
class FragmentManager$6 implements InterfaceC0577k {

    /* renamed from: b */
    public final String f2739b;

    /* renamed from: c */
    public final InterfaceC0434t f2740c;

    /* renamed from: d */
    public final AbstractC0572g f2741d;

    /* renamed from: e */
    public final AbstractC0428n f2742e;

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
        Map map;
        Map map2;
        if (bVar == AbstractC0572g.b.ON_START) {
            map2 = this.f2742e.f2942j;
            Bundle bundle = (Bundle) map2.get(this.f2739b);
            if (bundle != null) {
                this.f2740c.m2310a(this.f2739b, bundle);
                this.f2742e.m2231r(this.f2739b);
            }
        }
        if (bVar == AbstractC0572g.b.ON_DESTROY) {
            this.f2741d.mo3156c(this);
            map = this.f2742e.f2943k;
            map.remove(this.f2739b);
        }
    }
}
