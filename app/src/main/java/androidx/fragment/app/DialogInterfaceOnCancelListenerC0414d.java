package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0571f0;
import androidx.lifecycle.C0573g0;
import androidx.lifecycle.InterfaceC0579m;
import androidx.lifecycle.InterfaceC0586t;
import androidx.savedstate.C0734d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/d.class
 */
/* renamed from: androidx.fragment.app.d */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/d.class */
public class DialogInterfaceOnCancelListenerC0414d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: b */
    public Handler f2834b;

    /* renamed from: k */
    public boolean f2843k;

    /* renamed from: m */
    public Dialog f2845m;

    /* renamed from: n */
    public boolean f2846n;

    /* renamed from: o */
    public boolean f2847o;

    /* renamed from: p */
    public boolean f2848p;

    /* renamed from: c */
    public Runnable f2835c = new a(this);

    /* renamed from: d */
    public DialogInterface.OnCancelListener f2836d = new b(this);

    /* renamed from: e */
    public DialogInterface.OnDismissListener f2837e = new c(this);

    /* renamed from: f */
    public int f2838f = 0;

    /* renamed from: g */
    public int f2839g = 0;

    /* renamed from: h */
    public boolean f2840h = true;

    /* renamed from: i */
    public boolean f2841i = true;

    /* renamed from: j */
    public int f2842j = -1;

    /* renamed from: l */
    public InterfaceC0586t<InterfaceC0579m> f2844l = new d(this);

    /* renamed from: q */
    public boolean f2849q = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/d$a.class
     */
    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final DialogInterfaceOnCancelListenerC0414d f2850b;

        public a(DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d) {
            this.f2850b = dialogInterfaceOnCancelListenerC0414d;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            this.f2850b.f2837e.onDismiss(this.f2850b.f2845m);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/d$b.class
     */
    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/d$b.class */
    public class b implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        public final DialogInterfaceOnCancelListenerC0414d f2851b;

        public b(DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d) {
            this.f2851b = dialogInterfaceOnCancelListenerC0414d;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (this.f2851b.f2845m != null) {
                DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d = this.f2851b;
                dialogInterfaceOnCancelListenerC0414d.onCancel(dialogInterfaceOnCancelListenerC0414d.f2845m);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/d$c.class
     */
    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/d$c.class */
    public class c implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final DialogInterfaceOnCancelListenerC0414d f2852b;

        public c(DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d) {
            this.f2852b = dialogInterfaceOnCancelListenerC0414d;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f2852b.f2845m != null) {
                DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d = this.f2852b;
                dialogInterfaceOnCancelListenerC0414d.onDismiss(dialogInterfaceOnCancelListenerC0414d.f2845m);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/d$d.class
     */
    /* renamed from: androidx.fragment.app.d$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/d$d.class */
    public class d implements InterfaceC0586t<InterfaceC0579m> {

        /* renamed from: a */
        public final DialogInterfaceOnCancelListenerC0414d f2853a;

        public d(DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d) {
            this.f2853a = dialogInterfaceOnCancelListenerC0414d;
        }

        @Override // androidx.lifecycle.InterfaceC0586t
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2031a(InterfaceC0579m interfaceC0579m) {
            if (interfaceC0579m == null || !this.f2853a.f2841i) {
                return;
            }
            View requireView = this.f2853a.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (this.f2853a.f2845m != null) {
                if (AbstractC0428n.m2129G0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + this.f2853a.f2845m);
                }
                this.f2853a.f2845m.setContentView(requireView);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/d$e.class
     */
    /* renamed from: androidx.fragment.app.d$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/d$e.class */
    public class e extends AbstractC0420g {

        /* renamed from: b */
        public final AbstractC0420g f2854b;

        /* renamed from: c */
        public final DialogInterfaceOnCancelListenerC0414d f2855c;

        public e(DialogInterfaceOnCancelListenerC0414d dialogInterfaceOnCancelListenerC0414d, AbstractC0420g abstractC0420g) {
            this.f2855c = dialogInterfaceOnCancelListenerC0414d;
            this.f2854b = abstractC0420g;
        }

        @Override // androidx.fragment.app.AbstractC0420g
        /* renamed from: c */
        public View mo1940c(int i10) {
            return this.f2854b.mo1941d() ? this.f2854b.mo1940c(i10) : this.f2855c.m2030y(i10);
        }

        @Override // androidx.fragment.app.AbstractC0420g
        /* renamed from: d */
        public boolean mo1941d() {
            return this.f2854b.mo1941d() || this.f2855c.m2017A();
        }
    }

    /* renamed from: A */
    public boolean m2017A() {
        return this.f2849q;
    }

    /* renamed from: B */
    public final void m2018B(Bundle bundle) {
        if (this.f2841i && !this.f2849q) {
            try {
                this.f2843k = true;
                Dialog mo2029x = mo2029x(bundle);
                this.f2845m = mo2029x;
                if (this.f2841i) {
                    m2022I(mo2029x, this.f2838f);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f2845m.setOwnerActivity((Activity) context);
                    }
                    this.f2845m.setCancelable(this.f2840h);
                    this.f2845m.setOnCancelListener(this.f2836d);
                    this.f2845m.setOnDismissListener(this.f2837e);
                    this.f2849q = true;
                } else {
                    this.f2845m = null;
                }
            } finally {
                this.f2843k = false;
            }
        }
    }

    /* renamed from: E */
    public final Dialog m2019E() {
        Dialog m2027u = m2027u();
        if (m2027u != null) {
            return m2027u;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: F */
    public void m2020F(boolean z10) {
        this.f2840h = z10;
        Dialog dialog = this.f2845m;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    /* renamed from: G */
    public void m2021G(boolean z10) {
        this.f2841i = z10;
    }

    /* renamed from: I */
    public void m2022I(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: J */
    public int m2023J(AbstractC0439y abstractC0439y, String str) {
        this.f2847o = false;
        this.f2848p = true;
        abstractC0439y.m2364e(this, str);
        this.f2846n = false;
        int mo1964j = abstractC0439y.mo1964j();
        this.f2842j = mo1964j;
        return mo1964j;
    }

    /* renamed from: M */
    public void mo2024M(AbstractC0428n abstractC0428n, String str) {
        this.f2847o = false;
        this.f2848p = true;
        AbstractC0439y m2216m = abstractC0428n.m2216m();
        m2216m.m2364e(this, str);
        m2216m.mo1964j();
    }

    @Override // androidx.fragment.app.Fragment
    public AbstractC0420g createFragmentContainer() {
        return new e(this, super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m3101i(this.f2844l);
        if (this.f2848p) {
            return;
        }
        this.f2847o = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2834b = new Handler();
        this.f2841i = this.mContainerId == 0;
        if (bundle != null) {
            this.f2838f = bundle.getInt("android:style", 0);
            this.f2839g = bundle.getInt("android:theme", 0);
            this.f2840h = bundle.getBoolean("android:cancelable", true);
            this.f2841i = bundle.getBoolean("android:showsDialog", this.f2841i);
            this.f2842j = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f2845m;
        if (dialog != null) {
            this.f2846n = true;
            dialog.setOnDismissListener(null);
            this.f2845m.dismiss();
            if (!this.f2847o) {
                onDismiss(this.f2845m);
            }
            this.f2845m = null;
            this.f2849q = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.f2848p && !this.f2847o) {
            this.f2847o = true;
        }
        getViewLifecycleOwnerLiveData().mo3105m(this.f2844l);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2846n) {
            return;
        }
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m2026s(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f2841i && !this.f2843k) {
            m2018B(bundle);
            if (AbstractC0428n.m2129G0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2845m;
            LayoutInflater layoutInflater = onGetLayoutInflater;
            if (dialog != null) {
                layoutInflater = onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
            return layoutInflater;
        }
        if (AbstractC0428n.m2129G0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f2841i) {
                sb2 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb2 = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb2.append(str);
            sb2.append(str2);
            Log.d("FragmentManager", sb2.toString());
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f2845m;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f2838f;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2839g;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2840h;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2841i;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2842j;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f2845m;
        if (dialog != null) {
            this.f2846n = false;
            dialog.show();
            View decorView = this.f2845m.getWindow().getDecorView();
            C0571f0.m3153a(decorView, this);
            C0573g0.m3157a(decorView, this);
            C0734d.m4743a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f2845m;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f2845m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2845m.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f2845m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2845m.onRestoreInstanceState(bundle2);
    }

    /* renamed from: q */
    public void m2025q() {
        m2026s(false, false);
    }

    /* renamed from: s */
    public final void m2026s(boolean z10, boolean z11) {
        if (this.f2847o) {
            return;
        }
        this.f2847o = true;
        this.f2848p = false;
        Dialog dialog = this.f2845m;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2845m.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f2834b.getLooper()) {
                    onDismiss(this.f2845m);
                } else {
                    this.f2834b.post(this.f2835c);
                }
            }
        }
        this.f2846n = true;
        if (this.f2842j >= 0) {
            getParentFragmentManager().m2180X0(this.f2842j, 1);
            this.f2842j = -1;
            return;
        }
        AbstractC0439y m2216m = getParentFragmentManager().m2216m();
        m2216m.mo1970q(this);
        if (z10) {
            m2216m.mo1965k();
        } else {
            m2216m.mo1964j();
        }
    }

    /* renamed from: u */
    public Dialog m2027u() {
        return this.f2845m;
    }

    /* renamed from: w */
    public int m2028w() {
        return this.f2839g;
    }

    /* renamed from: x */
    public Dialog mo2029x(Bundle bundle) {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), m2028w());
    }

    /* renamed from: y */
    public View m2030y(int i10) {
        Dialog dialog = this.f2845m;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }
}
