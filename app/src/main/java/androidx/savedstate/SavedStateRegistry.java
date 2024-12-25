package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import androidx.savedstate.Recreator;
import java.util.Map;
import p190l.C5637b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/savedstate/SavedStateRegistry.class
 */
@SuppressLint({"RestrictedApi"})
/* loaded from: combined.jar:classes1.jar:androidx/savedstate/SavedStateRegistry.class */
public final class SavedStateRegistry {

    /* renamed from: b */
    public Bundle f5036b;

    /* renamed from: c */
    public boolean f5037c;

    /* renamed from: d */
    public Recreator.C0727a f5038d;

    /* renamed from: a */
    public C5637b<String, InterfaceC0730b> f5035a = new C5637b<>();

    /* renamed from: e */
    public boolean f5039e = true;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/savedstate/SavedStateRegistry$a.class
     */
    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: combined.jar:classes1.jar:androidx/savedstate/SavedStateRegistry$a.class */
    public interface InterfaceC0729a {
        /* renamed from: a */
        void mo3117a(InterfaceC0733c interfaceC0733c);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/savedstate/SavedStateRegistry$b.class
     */
    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: combined.jar:classes1.jar:androidx/savedstate/SavedStateRegistry$b.class */
    public interface InterfaceC0730b {
        /* renamed from: a */
        Bundle mo882a();
    }

    /* renamed from: a */
    public Bundle m4734a(String str) {
        if (!this.f5037c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f5036b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f5036b.remove(str);
        if (this.f5036b.isEmpty()) {
            this.f5036b = null;
        }
        return bundle2;
    }

    /* renamed from: b */
    public void m4735b(AbstractC0572g abstractC0572g, Bundle bundle) {
        if (this.f5037c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f5036b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abstractC0572g.mo3154a(new InterfaceC0577k(this) { // from class: androidx.savedstate.SavedStateRegistry.1

            /* renamed from: b */
            public final SavedStateRegistry f5040b;

            {
                this.f5040b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0577k
            /* renamed from: b */
            public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z10;
                if (bVar == AbstractC0572g.b.ON_START) {
                    savedStateRegistry = this.f5040b;
                    z10 = true;
                } else {
                    if (bVar != AbstractC0572g.b.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = this.f5040b;
                    z10 = false;
                }
                savedStateRegistry.f5039e = z10;
            }
        });
        this.f5037c = true;
    }

    /* renamed from: c */
    public void m4736c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5036b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C5637b<String, InterfaceC0730b>.d m27812f = this.f5035a.m27812f();
        while (m27812f.hasNext()) {
            Map.Entry next = m27812f.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC0730b) next.getValue()).mo882a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m4737d(String str, InterfaceC0730b interfaceC0730b) {
        if (this.f5035a.mo27808i(str, interfaceC0730b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m4738e(Class<? extends InterfaceC0729a> cls) {
        if (!this.f5039e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f5038d == null) {
            this.f5038d = new Recreator.C0727a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f5038d.m4733b(cls.getName());
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
