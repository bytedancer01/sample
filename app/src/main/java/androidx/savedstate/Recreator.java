package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/savedstate/Recreator.class
 */
@SuppressLint({"RestrictedApi"})
/* loaded from: combined.jar:classes1.jar:androidx/savedstate/Recreator.class */
final class Recreator implements InterfaceC0577k {

    /* renamed from: b */
    public final InterfaceC0733c f5033b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/savedstate/Recreator$a.class
     */
    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: combined.jar:classes1.jar:androidx/savedstate/Recreator$a.class */
    public static final class C0727a implements SavedStateRegistry.InterfaceC0730b {

        /* renamed from: a */
        public final Set<String> f5034a = new HashSet();

        public C0727a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m4737d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0730b
        /* renamed from: a */
        public Bundle mo882a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5034a));
            return bundle;
        }

        /* renamed from: b */
        public void m4733b(String str) {
            this.f5034a.add(str);
        }
    }

    public Recreator(InterfaceC0733c interfaceC0733c) {
        this.f5033b = interfaceC0733c;
    }

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
        if (bVar != AbstractC0572g.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0579m.getLifecycle().mo3156c(this);
        Bundle m4734a = this.f5033b.getSavedStateRegistry().m4734a("androidx.savedstate.Restarter");
        if (m4734a == null) {
            return;
        }
        ArrayList<String> stringArrayList = m4734a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m4732c(it.next());
        }
    }

    /* renamed from: c */
    public final void m4732c(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC0729a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC0729a) declaredConstructor.newInstance(new Object[0])).mo3117a(this.f5033b);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }
}
