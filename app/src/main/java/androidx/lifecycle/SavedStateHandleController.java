package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;
import androidx.savedstate.InterfaceC0733c;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/SavedStateHandleController.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/SavedStateHandleController.class */
final class SavedStateHandleController implements InterfaceC0577k {

    /* renamed from: b */
    public final String f3735b;

    /* renamed from: c */
    public boolean f3736c = false;

    /* renamed from: d */
    public final C0591y f3737d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/SavedStateHandleController$a.class
     */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/SavedStateHandleController$a.class */
    public static final class C0559a implements SavedStateRegistry.InterfaceC0729a {
        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0729a
        /* renamed from: a */
        public void mo3117a(InterfaceC0733c interfaceC0733c) {
            if (!(interfaceC0733c instanceof InterfaceC0569e0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            C0567d0 viewModelStore = ((InterfaceC0569e0) interfaceC0733c).getViewModelStore();
            SavedStateRegistry savedStateRegistry = interfaceC0733c.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.m3144c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.m3111c(viewModelStore.m3143b(it.next()), savedStateRegistry, interfaceC0733c.getLifecycle());
            }
            if (viewModelStore.m3144c().isEmpty()) {
                return;
            }
            savedStateRegistry.m4738e(C0559a.class);
        }
    }

    public SavedStateHandleController(String str, C0591y c0591y) {
        this.f3735b = str;
        this.f3737d = c0591y;
    }

    /* renamed from: c */
    public static void m3111c(AbstractC0563b0 abstractC0563b0, SavedStateRegistry savedStateRegistry, AbstractC0572g abstractC0572g) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC0563b0.m3134c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m3116l()) {
            return;
        }
        savedStateHandleController.m3114e(savedStateRegistry, abstractC0572g);
        m3113m(savedStateRegistry, abstractC0572g);
    }

    /* renamed from: i */
    public static SavedStateHandleController m3112i(SavedStateRegistry savedStateRegistry, AbstractC0572g abstractC0572g, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C0591y.m3200a(savedStateRegistry.m4734a(str), bundle));
        savedStateHandleController.m3114e(savedStateRegistry, abstractC0572g);
        m3113m(savedStateRegistry, abstractC0572g);
        return savedStateHandleController;
    }

    /* renamed from: m */
    public static void m3113m(SavedStateRegistry savedStateRegistry, AbstractC0572g abstractC0572g) {
        AbstractC0572g.c mo3155b = abstractC0572g.mo3155b();
        if (mo3155b == AbstractC0572g.c.INITIALIZED || mo3155b.isAtLeast(AbstractC0572g.c.STARTED)) {
            savedStateRegistry.m4738e(C0559a.class);
        } else {
            abstractC0572g.mo3154a(new InterfaceC0577k(abstractC0572g, savedStateRegistry) { // from class: androidx.lifecycle.SavedStateHandleController.1

                /* renamed from: b */
                public final AbstractC0572g f3738b;

                /* renamed from: c */
                public final SavedStateRegistry f3739c;

                {
                    this.f3738b = abstractC0572g;
                    this.f3739c = savedStateRegistry;
                }

                @Override // androidx.lifecycle.InterfaceC0577k
                /* renamed from: b */
                public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
                    if (bVar == AbstractC0572g.b.ON_START) {
                        this.f3738b.mo3156c(this);
                        this.f3739c.m4738e(C0559a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
        if (bVar == AbstractC0572g.b.ON_DESTROY) {
            this.f3736c = false;
            interfaceC0579m.getLifecycle().mo3156c(this);
        }
    }

    /* renamed from: e */
    public void m3114e(SavedStateRegistry savedStateRegistry, AbstractC0572g abstractC0572g) {
        if (this.f3736c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3736c = true;
        abstractC0572g.mo3154a(this);
        savedStateRegistry.m4737d(this.f3735b, this.f3737d.m3202b());
    }

    /* renamed from: k */
    public C0591y m3115k() {
        return this.f3737d;
    }

    /* renamed from: l */
    public boolean m3116l() {
        return this.f3736c;
    }
}
