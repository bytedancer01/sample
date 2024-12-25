package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/viewpager2/adapter/FragmentStateAdapter$5.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/viewpager2/adapter/FragmentStateAdapter$5.class */
class FragmentStateAdapter$5 implements InterfaceC0577k {

    /* renamed from: b */
    public final Handler f5124b;

    /* renamed from: c */
    public final Runnable f5125c;

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
        if (bVar == AbstractC0572g.b.ON_DESTROY) {
            this.f5124b.removeCallbacks(this.f5125c);
            interfaceC0579m.getLifecycle().mo3156c(this);
        }
    }
}
