package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0567d0;
import androidx.lifecycle.C0580n;
import androidx.lifecycle.InterfaceC0569e0;
import androidx.savedstate.C0732b;
import androidx.savedstate.InterfaceC0733c;
import androidx.savedstate.SavedStateRegistry;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/c0.class
 */
/* renamed from: androidx.fragment.app.c0 */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/c0.class */
public class C0413c0 implements InterfaceC0733c, InterfaceC0569e0 {

    /* renamed from: b */
    public final Fragment f2830b;

    /* renamed from: c */
    public final C0567d0 f2831c;

    /* renamed from: d */
    public C0580n f2832d = null;

    /* renamed from: e */
    public C0732b f2833e = null;

    public C0413c0(Fragment fragment, C0567d0 c0567d0) {
        this.f2830b = fragment;
        this.f2831c = c0567d0;
    }

    /* renamed from: a */
    public void m2008a(AbstractC0572g.b bVar) {
        this.f2832d.m3166h(bVar);
    }

    /* renamed from: b */
    public void m2009b() {
        if (this.f2832d == null) {
            this.f2832d = new C0580n(this);
            this.f2833e = C0732b.m4739a(this);
        }
    }

    /* renamed from: c */
    public boolean m2010c() {
        return this.f2832d != null;
    }

    /* renamed from: d */
    public void m2011d(Bundle bundle) {
        this.f2833e.m4741c(bundle);
    }

    /* renamed from: e */
    public void m2012e(Bundle bundle) {
        this.f2833e.m4742d(bundle);
    }

    /* renamed from: f */
    public void m2013f(AbstractC0572g.c cVar) {
        this.f2832d.m3172o(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC0579m
    public AbstractC0572g getLifecycle() {
        m2009b();
        return this.f2832d;
    }

    @Override // androidx.savedstate.InterfaceC0733c
    public SavedStateRegistry getSavedStateRegistry() {
        m2009b();
        return this.f2833e.m4740b();
    }

    @Override // androidx.lifecycle.InterfaceC0569e0
    public C0567d0 getViewModelStore() {
        m2009b();
        return this.f2831c;
    }
}
