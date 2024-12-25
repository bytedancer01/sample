package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/savedstate/b.class
 */
/* renamed from: androidx.savedstate.b */
/* loaded from: combined.jar:classes1.jar:androidx/savedstate/b.class */
public final class C0732b {

    /* renamed from: a */
    public final InterfaceC0733c f5042a;

    /* renamed from: b */
    public final SavedStateRegistry f5043b = new SavedStateRegistry();

    public C0732b(InterfaceC0733c interfaceC0733c) {
        this.f5042a = interfaceC0733c;
    }

    /* renamed from: a */
    public static C0732b m4739a(InterfaceC0733c interfaceC0733c) {
        return new C0732b(interfaceC0733c);
    }

    /* renamed from: b */
    public SavedStateRegistry m4740b() {
        return this.f5043b;
    }

    /* renamed from: c */
    public void m4741c(Bundle bundle) {
        AbstractC0572g lifecycle = this.f5042a.getLifecycle();
        if (lifecycle.mo3155b() != AbstractC0572g.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo3154a(new Recreator(this.f5042a));
        this.f5043b.m4735b(lifecycle, bundle);
    }

    /* renamed from: d */
    public void m4742d(Bundle bundle) {
        this.f5043b.m4736c(bundle);
    }
}
