package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import androidx.navigation.AbstractC0639s;
import androidx.navigation.C0631k;
import androidx.navigation.C0636p;
import androidx.navigation.InterfaceC0617b;
import java.util.HashSet;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/fragment/DialogFragmentNavigator.class
 */
@AbstractC0639s.b("dialog")
/* loaded from: combined.jar:classes1.jar:androidx/navigation/fragment/DialogFragmentNavigator.class */
public final class DialogFragmentNavigator extends AbstractC0639s<C0623a> {

    /* renamed from: a */
    public final Context f4192a;

    /* renamed from: b */
    public final AbstractC0428n f4193b;

    /* renamed from: c */
    public int f4194c = 0;

    /* renamed from: d */
    public final HashSet<String> f4195d = new HashSet<>();

    /* renamed from: e */
    public InterfaceC0577k f4196e = new InterfaceC0577k(this) { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1

        /* renamed from: b */
        public final DialogFragmentNavigator f4197b;

        {
            this.f4197b = this;
        }

        @Override // androidx.lifecycle.InterfaceC0577k
        /* renamed from: b */
        public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
            if (bVar == AbstractC0572g.b.ON_STOP) {
                DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d = (DialogInterfaceOnCancelListenerC0414d) interfaceC0579m;
                if (dialogInterfaceOnCancelListenerC0414d.m2019E().isShowing()) {
                    return;
                }
                NavHostFragment.m3518n(dialogInterfaceOnCancelListenerC0414d).m3457u();
            }
        }
    };

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/fragment/DialogFragmentNavigator$a.class
     */
    /* renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/fragment/DialogFragmentNavigator$a.class */
    public static class C0623a extends C0631k implements InterfaceC0617b {

        /* renamed from: k */
        public String f4198k;

        public C0623a(AbstractC0639s<? extends C0623a> abstractC0639s) {
            super(abstractC0639s);
        }

        @Override // androidx.navigation.C0631k
        /* renamed from: B */
        public void mo3470B(Context context, AttributeSet attributeSet) {
            super.mo3470B(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0626c.f4213c);
            String string = obtainAttributes.getString(C0626c.f4214d);
            if (string != null) {
                m3517J(string);
            }
            obtainAttributes.recycle();
        }

        /* renamed from: I */
        public final String m3516I() {
            String str = this.f4198k;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        /* renamed from: J */
        public final C0623a m3517J(String str) {
            this.f4198k = str;
            return this;
        }
    }

    public DialogFragmentNavigator(Context context, AbstractC0428n abstractC0428n) {
        this.f4192a = context;
        this.f4193b = abstractC0428n;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: c */
    public void mo3511c(Bundle bundle) {
        if (bundle != null) {
            this.f4194c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i10 = 0; i10 < this.f4194c; i10++) {
                DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d = (DialogInterfaceOnCancelListenerC0414d) this.f4193b.m2206i0("androidx-nav-fragment:navigator:dialog:" + i10);
                if (dialogInterfaceOnCancelListenerC0414d != null) {
                    dialogInterfaceOnCancelListenerC0414d.getLifecycle().mo3154a(this.f4196e);
                } else {
                    this.f4195d.add("androidx-nav-fragment:navigator:dialog:" + i10);
                }
            }
        }
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: d */
    public Bundle mo3512d() {
        if (this.f4194c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f4194c);
        return bundle;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: e */
    public boolean mo3466e() {
        if (this.f4194c == 0) {
            return false;
        }
        if (this.f4193b.m2156L0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        AbstractC0428n abstractC0428n = this.f4193b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("androidx-nav-fragment:navigator:dialog:");
        int i10 = this.f4194c - 1;
        this.f4194c = i10;
        sb2.append(i10);
        Fragment m2206i0 = abstractC0428n.m2206i0(sb2.toString());
        if (m2206i0 == null) {
            return true;
        }
        m2206i0.getLifecycle().mo3156c(this.f4196e);
        ((DialogInterfaceOnCancelListenerC0414d) m2206i0).m2025q();
        return true;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0623a mo3464a() {
        return new C0623a(this);
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0631k mo3465b(C0623a c0623a, Bundle bundle, C0636p c0636p, AbstractC0639s.a aVar) {
        if (this.f4193b.m2156L0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String m3516I = c0623a.m3516I();
        String str = m3516I;
        if (m3516I.charAt(0) == '.') {
            str = this.f4192a.getPackageName() + m3516I;
        }
        Fragment mo2105a = this.f4193b.m2232r0().mo2105a(this.f4192a.getClassLoader(), str);
        if (!DialogInterfaceOnCancelListenerC0414d.class.isAssignableFrom(mo2105a.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + c0623a.m3516I() + " is not an instance of DialogFragment");
        }
        DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d = (DialogInterfaceOnCancelListenerC0414d) mo2105a;
        dialogInterfaceOnCancelListenerC0414d.setArguments(bundle);
        dialogInterfaceOnCancelListenerC0414d.getLifecycle().mo3154a(this.f4196e);
        AbstractC0428n abstractC0428n = this.f4193b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("androidx-nav-fragment:navigator:dialog:");
        int i10 = this.f4194c;
        this.f4194c = i10 + 1;
        sb2.append(i10);
        dialogInterfaceOnCancelListenerC0414d.mo2024M(abstractC0428n, sb2.toString());
        return c0623a;
    }

    /* renamed from: h */
    public void m3515h(Fragment fragment) {
        if (this.f4195d.remove(fragment.getTag())) {
            fragment.getLifecycle().mo3154a(this.f4196e);
        }
    }
}
