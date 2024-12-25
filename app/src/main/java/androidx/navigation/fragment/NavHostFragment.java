package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0422h;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d;
import androidx.fragment.app.Fragment;
import androidx.navigation.AbstractC0639s;
import androidx.navigation.C0634n;
import androidx.navigation.C0638r;
import androidx.navigation.C0642v;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C0624a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/fragment/NavHostFragment.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/fragment/NavHostFragment.class */
public class NavHostFragment extends Fragment {

    /* renamed from: b */
    public C0634n f4199b;

    /* renamed from: c */
    public Boolean f4200c = null;

    /* renamed from: d */
    public View f4201d;

    /* renamed from: e */
    public int f4202e;

    /* renamed from: f */
    public boolean f4203f;

    /* renamed from: n */
    public static NavController m3518n(Fragment fragment) {
        Fragment fragment2 = fragment;
        while (true) {
            Fragment fragment3 = fragment2;
            if (fragment3 == null) {
                View view = fragment.getView();
                if (view != null) {
                    return C0638r.m3660b(view);
                }
                Dialog m2027u = fragment instanceof DialogInterfaceOnCancelListenerC0414d ? ((DialogInterfaceOnCancelListenerC0414d) fragment).m2027u() : null;
                if (m2027u != null && m2027u.getWindow() != null) {
                    return C0638r.m3660b(m2027u.getWindow().getDecorView());
                }
                throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
            }
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).m3521q();
            }
            Fragment m2253y0 = fragment3.getParentFragmentManager().m2253y0();
            if (m2253y0 instanceof NavHostFragment) {
                return ((NavHostFragment) m2253y0).m3521q();
            }
            fragment2 = fragment3.getParentFragment();
        }
    }

    @Deprecated
    /* renamed from: m */
    public AbstractC0639s<? extends C0624a.a> m3519m() {
        return new C0624a(requireContext(), getChildFragmentManager(), m3520p());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f4203f) {
            getParentFragmentManager().m2216m().mo1972w(this).mo1964j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        ((DialogFragmentNavigator) this.f4199b.m3448l().m3668d(DialogFragmentNavigator.class)).m3515h(fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        C0634n c0634n = new C0634n(requireContext());
        this.f4199b = c0634n;
        c0634n.mo3433D(this);
        this.f4199b.mo3434E(requireActivity().getOnBackPressedDispatcher());
        C0634n c0634n2 = this.f4199b;
        Boolean bool = this.f4200c;
        int i10 = 0;
        c0634n2.mo3439c(bool != null && bool.booleanValue());
        this.f4200c = null;
        this.f4199b.mo3435F(getViewModelStore());
        m3522s(this.f4199b);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f4203f = true;
                getParentFragmentManager().m2216m().mo1972w(this).mo1964j();
            }
            this.f4202e = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f4199b.m3461y(bundle2);
        }
        int i11 = this.f4202e;
        if (i11 != 0) {
            this.f4199b.m3430A(i11);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i10 = arguments.getInt("android-support-nav:fragment:graphId");
            }
            Bundle bundle3 = null;
            if (arguments != null) {
                bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i10 != 0) {
                this.f4199b.m3431B(i10, bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0422h c0422h = new C0422h(layoutInflater.getContext());
        c0422h.setId(m3520p());
        return c0422h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f4201d;
        if (view != null && C0638r.m3660b(view) == this.f4199b) {
            C0638r.m3663e(this.f4201d, null);
        }
        this.f4201d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0642v.f4332p);
        int resourceId = obtainStyledAttributes.getResourceId(C0642v.f4333q, 0);
        if (resourceId != 0) {
            this.f4202e = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0626c.f4228r);
        if (obtainStyledAttributes2.getBoolean(C0626c.f4229s, false)) {
            this.f4203f = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrimaryNavigationFragmentChanged(boolean z10) {
        C0634n c0634n = this.f4199b;
        if (c0634n != null) {
            c0634n.mo3439c(z10);
        } else {
            this.f4200c = Boolean.valueOf(z10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle m3462z = this.f4199b.m3462z();
        if (m3462z != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", m3462z);
        }
        if (this.f4203f) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i10 = this.f4202e;
        if (i10 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        C0638r.m3663e(view, this.f4199b);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f4201d = view2;
            if (view2.getId() == getId()) {
                C0638r.m3663e(this.f4201d, this.f4199b);
            }
        }
    }

    /* renamed from: p */
    public final int m3520p() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? C0625b.f4210a : id2;
    }

    /* renamed from: q */
    public final NavController m3521q() {
        C0634n c0634n = this.f4199b;
        if (c0634n != null) {
            return c0634n;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    /* renamed from: s */
    public void m3522s(NavController navController) {
        navController.m3448l().m3666a(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        navController.m3448l().m3666a(m3519m());
    }
}
