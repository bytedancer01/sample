package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC0417e0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0569e0;
import p235o0.C6824g0;
import p374w0.C9394b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/v.class
 */
/* renamed from: androidx.fragment.app.v */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/v.class */
public class C0436v {

    /* renamed from: a */
    public final C0427m f3016a;

    /* renamed from: b */
    public final C0438x f3017b;

    /* renamed from: c */
    public final Fragment f3018c;

    /* renamed from: d */
    public boolean f3019d = false;

    /* renamed from: e */
    public int f3020e = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/v$a.class
     */
    /* renamed from: androidx.fragment.app.v$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/v$a.class */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f3021b;

        /* renamed from: c */
        public final C0436v f3022c;

        public a(C0436v c0436v, View view) {
            this.f3022c = c0436v;
            this.f3021b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3021b.removeOnAttachStateChangeListener(this);
            C6824g0.m31533m0(this.f3021b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/v$b.class
     */
    /* renamed from: androidx.fragment.app.v$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/v$b.class */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final int[] f3023a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                androidx.lifecycle.g$c[] r0 = androidx.lifecycle.AbstractC0572g.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.fragment.app.C0436v.b.f3023a = r0
                r0 = r4
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.RESUMED     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = androidx.fragment.app.C0436v.b.f3023a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.STARTED     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = androidx.fragment.app.C0436v.b.f3023a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.CREATED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = androidx.fragment.app.C0436v.b.f3023a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                androidx.lifecycle.g$c r1 = androidx.lifecycle.AbstractC0572g.c.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0436v.b.m43025clinit():void");
        }
    }

    public C0436v(C0427m c0427m, C0438x c0438x, Fragment fragment) {
        this.f3016a = c0427m;
        this.f3017b = c0438x;
        this.f3018c = fragment;
    }

    public C0436v(C0427m c0427m, C0438x c0438x, Fragment fragment, C0435u c0435u) {
        this.f3016a = c0427m;
        this.f3017b = c0438x;
        this.f3018c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = c0435u.f3015n;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public C0436v(C0427m c0427m, C0438x c0438x, ClassLoader classLoader, C0424j c0424j, C0435u c0435u) {
        this.f3016a = c0427m;
        this.f3017b = c0438x;
        Fragment mo2105a = c0424j.mo2105a(classLoader, c0435u.f3003b);
        this.f3018c = mo2105a;
        Bundle bundle = c0435u.f3012k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo2105a.setArguments(c0435u.f3012k);
        mo2105a.mWho = c0435u.f3004c;
        mo2105a.mFromLayout = c0435u.f3005d;
        mo2105a.mRestored = true;
        mo2105a.mFragmentId = c0435u.f3006e;
        mo2105a.mContainerId = c0435u.f3007f;
        mo2105a.mTag = c0435u.f3008g;
        mo2105a.mRetainInstance = c0435u.f3009h;
        mo2105a.mRemoving = c0435u.f3010i;
        mo2105a.mDetached = c0435u.f3011j;
        mo2105a.mHidden = c0435u.f3013l;
        mo2105a.mMaxState = AbstractC0572g.c.values()[c0435u.f3014m];
        Bundle bundle2 = c0435u.f3015n;
        mo2105a.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo2105a);
        }
    }

    /* renamed from: a */
    public void m2313a() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3018c);
        }
        Fragment fragment = this.f3018c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0427m c0427m = this.f3016a;
        Fragment fragment2 = this.f3018c;
        c0427m.m2112a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void m2314b() {
        int m2346j = this.f3017b.m2346j(this.f3018c);
        Fragment fragment = this.f3018c;
        fragment.mContainer.addView(fragment.mView, m2346j);
    }

    /* renamed from: c */
    public void m2315c() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3018c);
        }
        Fragment fragment = this.f3018c;
        Fragment fragment2 = fragment.mTarget;
        C0436v c0436v = null;
        if (fragment2 != null) {
            c0436v = this.f3017b.m2349m(fragment2.mWho);
            if (c0436v == null) {
                throw new IllegalStateException("Fragment " + this.f3018c + " declared target fragment " + this.f3018c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f3018c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
        } else {
            String str = fragment.mTargetWho;
            if (str != null) {
                c0436v = this.f3017b.m2349m(str);
                if (c0436v == null) {
                    throw new IllegalStateException("Fragment " + this.f3018c + " declared target fragment " + this.f3018c.mTargetWho + " that does not belong to this FragmentManager!");
                }
            }
        }
        if (c0436v != null && (AbstractC0428n.f2918P || c0436v.m2323k().mState < 1)) {
            c0436v.m2325m();
        }
        Fragment fragment4 = this.f3018c;
        fragment4.mHost = fragment4.mFragmentManager.m2241u0();
        Fragment fragment5 = this.f3018c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m2250x0();
        this.f3016a.m2118g(this.f3018c, false);
        this.f3018c.performAttach();
        this.f3016a.m2113b(this.f3018c, false);
    }

    /* renamed from: d */
    public int m2316d() {
        int i10;
        Fragment fragment = this.f3018c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i11 = this.f3020e;
        int i12 = b.f3023a[fragment.mMaxState.ordinal()];
        int i13 = i11;
        if (i12 != 1) {
            i13 = i12 != 2 ? i12 != 3 ? i12 != 4 ? Math.min(i11, -1) : Math.min(i11, 0) : Math.min(i11, 1) : Math.min(i11, 5);
        }
        Fragment fragment2 = this.f3018c;
        int i14 = i13;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                int max = Math.max(this.f3020e, 2);
                View view = this.f3018c.mView;
                i14 = max;
                if (view != null) {
                    i14 = max;
                    if (view.getParent() == null) {
                        i14 = Math.min(max, 2);
                    }
                }
            } else {
                i14 = this.f3020e < 4 ? Math.min(i13, fragment2.mState) : Math.min(i13, 1);
            }
        }
        int i15 = i14;
        if (!this.f3018c.mAdded) {
            i15 = Math.min(i14, 1);
        }
        AbstractC0417e0.e.b bVar = null;
        if (AbstractC0428n.f2918P) {
            Fragment fragment3 = this.f3018c;
            ViewGroup viewGroup = fragment3.mContainer;
            bVar = null;
            if (viewGroup != null) {
                bVar = AbstractC0417e0.m2042n(viewGroup, fragment3.getParentFragmentManager()).m2054l(this);
            }
        }
        if (bVar == AbstractC0417e0.e.b.ADDING) {
            i10 = Math.min(i15, 6);
        } else if (bVar == AbstractC0417e0.e.b.REMOVING) {
            i10 = Math.max(i15, 3);
        } else {
            Fragment fragment4 = this.f3018c;
            i10 = i15;
            if (fragment4.mRemoving) {
                i10 = fragment4.isInBackStack() ? Math.min(i15, 1) : Math.min(i15, -1);
            }
        }
        Fragment fragment5 = this.f3018c;
        int i16 = i10;
        if (fragment5.mDeferStart) {
            i16 = i10;
            if (fragment5.mState < 5) {
                i16 = Math.min(i10, 4);
            }
        }
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i16 + " for " + this.f3018c);
        }
        return i16;
    }

    /* renamed from: e */
    public void m2317e() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3018c);
        }
        Fragment fragment = this.f3018c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f3018c.mState = 1;
            return;
        }
        this.f3016a.m2119h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f3018c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C0427m c0427m = this.f3016a;
        Fragment fragment3 = this.f3018c;
        c0427m.m2114c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* renamed from: f */
    public void m2318f() {
        String str;
        if (this.f3018c.mFromLayout) {
            return;
        }
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3018c);
        }
        Fragment fragment = this.f3018c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f3018c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3018c + " for a container view with no id");
                }
                ViewGroup viewGroup3 = (ViewGroup) fragment2.mFragmentManager.m2223o0().mo1940c(this.f3018c.mContainerId);
                viewGroup = viewGroup3;
                if (viewGroup3 == null) {
                    Fragment fragment3 = this.f3018c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f3018c.mContainerId);
                        } catch (Resources.NotFoundException e10) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3018c.mContainerId) + " (" + str + ") for fragment " + this.f3018c);
                    }
                    viewGroup = viewGroup3;
                }
            }
        }
        Fragment fragment4 = this.f3018c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f3018c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3018c;
            fragment5.mView.setTag(C9394b.f43075a, fragment5);
            if (viewGroup != null) {
                m2314b();
            }
            Fragment fragment6 = this.f3018c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C6824g0.m31501T(this.f3018c.mView)) {
                C6824g0.m31533m0(this.f3018c.mView);
            } else {
                View view2 = this.f3018c.mView;
                view2.addOnAttachStateChangeListener(new a(this, view2));
            }
            this.f3018c.performViewCreated();
            C0427m c0427m = this.f3016a;
            Fragment fragment7 = this.f3018c;
            c0427m.m2124m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f3018c.mView.getVisibility();
            float alpha = this.f3018c.mView.getAlpha();
            if (AbstractC0428n.f2918P) {
                this.f3018c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f3018c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.f3018c.setFocusedView(findFocus);
                        if (AbstractC0428n.m2129G0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3018c);
                        }
                    }
                    this.f3018c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f3018c;
                boolean z10 = false;
                if (visibility == 0) {
                    z10 = false;
                    if (fragment9.mContainer != null) {
                        z10 = true;
                    }
                }
                fragment9.mIsNewlyAdded = z10;
            }
        }
        this.f3018c.mState = 2;
    }

    /* renamed from: g */
    public void m2319g() {
        Fragment m2342f;
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3018c);
        }
        Fragment fragment = this.f3018c;
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z11 || this.f3017b.m2351o().m2297p(this.f3018c))) {
            String str = this.f3018c.mTargetWho;
            if (str != null && (m2342f = this.f3017b.m2342f(str)) != null && m2342f.mRetainInstance) {
                this.f3018c.mTarget = m2342f;
            }
            this.f3018c.mState = 0;
            return;
        }
        AbstractC0425k<?> abstractC0425k = this.f3018c.mHost;
        if (abstractC0425k instanceof InterfaceC0569e0) {
            z10 = this.f3017b.m2351o().m2294m();
        } else if (abstractC0425k.m2107f() instanceof Activity) {
            z10 = true ^ ((Activity) abstractC0425k.m2107f()).isChangingConfigurations();
        }
        if (z11 || z10) {
            this.f3017b.m2351o().m2289g(this.f3018c);
        }
        this.f3018c.performDestroy();
        this.f3016a.m2115d(this.f3018c, false);
        for (C0436v c0436v : this.f3017b.m2347k()) {
            if (c0436v != null) {
                Fragment m2323k = c0436v.m2323k();
                if (this.f3018c.mWho.equals(m2323k.mTargetWho)) {
                    m2323k.mTarget = this.f3018c;
                    m2323k.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f3018c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f3017b.m2342f(str2);
        }
        this.f3017b.m2353q(this);
    }

    /* renamed from: h */
    public void m2320h() {
        View view;
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3018c);
        }
        Fragment fragment = this.f3018c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3018c.performDestroyView();
        this.f3016a.m2125n(this.f3018c, false);
        Fragment fragment2 = this.f3018c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo3106n(null);
        this.f3018c.mInLayout = false;
    }

    /* renamed from: i */
    public void m2321i() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3018c);
        }
        this.f3018c.performDetach();
        this.f3016a.m2116e(this.f3018c, false);
        Fragment fragment = this.f3018c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z10 = false;
        if (fragment.mRemoving) {
            z10 = false;
            if (!fragment.isInBackStack()) {
                z10 = true;
            }
        }
        if (z10 || this.f3017b.m2351o().m2297p(this.f3018c)) {
            if (AbstractC0428n.m2129G0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3018c);
            }
            this.f3018c.initState();
        }
    }

    /* renamed from: j */
    public void m2322j() {
        Fragment fragment = this.f3018c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (AbstractC0428n.m2129G0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3018c);
            }
            Fragment fragment2 = this.f3018c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f3018c.mSavedFragmentState);
            View view = this.f3018c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3018c;
                fragment3.mView.setTag(C9394b.f43075a, fragment3);
                Fragment fragment4 = this.f3018c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3018c.performViewCreated();
                C0427m c0427m = this.f3016a;
                Fragment fragment5 = this.f3018c;
                c0427m.m2124m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3018c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment m2323k() {
        return this.f3018c;
    }

    /* renamed from: l */
    public final boolean m2324l(View view) {
        if (view == this.f3018c.mView) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (true) {
            ViewParent viewParent = parent;
            if (viewParent == null) {
                return false;
            }
            if (viewParent == this.f3018c.mView) {
                return true;
            }
            parent = viewParent.getParent();
        }
    }

    /* renamed from: m */
    public void m2325m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3019d) {
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m2323k());
                return;
            }
            return;
        }
        try {
            this.f3019d = true;
            while (true) {
                int m2316d = m2316d();
                Fragment fragment = this.f3018c;
                int i10 = fragment.mState;
                if (m2316d == i10) {
                    if (AbstractC0428n.f2918P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            AbstractC0417e0 m2042n = AbstractC0417e0.m2042n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f3018c.mHidden) {
                                m2042n.m2046c(this);
                            } else {
                                m2042n.m2048e(this);
                            }
                        }
                        Fragment fragment2 = this.f3018c;
                        AbstractC0428n abstractC0428n = fragment2.mFragmentManager;
                        if (abstractC0428n != null) {
                            abstractC0428n.m2143E0(fragment2);
                        }
                        Fragment fragment3 = this.f3018c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (m2316d <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            m2321i();
                            break;
                        case 0:
                            m2319g();
                            break;
                        case 1:
                            m2320h();
                            this.f3018c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (AbstractC0428n.m2129G0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3018c);
                            }
                            Fragment fragment4 = this.f3018c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                m2332t();
                            }
                            Fragment fragment5 = this.f3018c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                AbstractC0417e0.m2042n(viewGroup3, fragment5.getParentFragmentManager()).m2047d(this);
                            }
                            this.f3018c.mState = 3;
                            break;
                        case 4:
                            m2335w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m2326n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            m2315c();
                            break;
                        case 1:
                            m2317e();
                            break;
                        case 2:
                            m2322j();
                            m2318f();
                            break;
                        case 3:
                            m2313a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                AbstractC0417e0.m2042n(viewGroup2, fragment.getParentFragmentManager()).m2045b(AbstractC0417e0.e.c.from(this.f3018c.mView.getVisibility()), this);
                            }
                            this.f3018c.mState = 4;
                            break;
                        case 5:
                            m2334v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m2328p();
                            break;
                    }
                }
            }
        } finally {
            this.f3019d = false;
        }
    }

    /* renamed from: n */
    public void m2326n() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3018c);
        }
        this.f3018c.performPause();
        this.f3016a.m2117f(this.f3018c, false);
    }

    /* renamed from: o */
    public void m2327o(ClassLoader classLoader) {
        Bundle bundle = this.f3018c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3018c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f3018c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f3018c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f3018c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f3018c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f3018c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f3018c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* renamed from: p */
    public void m2328p() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3018c);
        }
        View focusedView = this.f3018c.getFocusedView();
        if (focusedView != null && m2324l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (AbstractC0428n.m2129G0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f3018c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3018c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f3018c.setFocusedView(null);
        this.f3018c.performResume();
        this.f3016a.m2120i(this.f3018c, false);
        Fragment fragment = this.f3018c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public final Bundle m2329q() {
        Bundle bundle = new Bundle();
        this.f3018c.performSaveInstanceState(bundle);
        this.f3016a.m2121j(this.f3018c, bundle, false);
        Bundle bundle2 = bundle;
        if (bundle.isEmpty()) {
            bundle2 = null;
        }
        if (this.f3018c.mView != null) {
            m2332t();
        }
        Bundle bundle3 = bundle2;
        if (this.f3018c.mSavedViewState != null) {
            bundle3 = bundle2;
            if (bundle2 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putSparseParcelableArray("android:view_state", this.f3018c.mSavedViewState);
        }
        Bundle bundle4 = bundle3;
        if (this.f3018c.mSavedViewRegistryState != null) {
            bundle4 = bundle3;
            if (bundle3 == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBundle("android:view_registry_state", this.f3018c.mSavedViewRegistryState);
        }
        Bundle bundle5 = bundle4;
        if (!this.f3018c.mUserVisibleHint) {
            bundle5 = bundle4;
            if (bundle4 == null) {
                bundle5 = new Bundle();
            }
            bundle5.putBoolean("android:user_visible_hint", this.f3018c.mUserVisibleHint);
        }
        return bundle5;
    }

    /* renamed from: r */
    public Fragment.C0407m m2330r() {
        Fragment.C0407m c0407m = null;
        if (this.f3018c.mState > -1) {
            Bundle m2329q = m2329q();
            c0407m = null;
            if (m2329q != null) {
                c0407m = new Fragment.C0407m(m2329q);
            }
        }
        return c0407m;
    }

    /* renamed from: s */
    public C0435u m2331s() {
        C0435u c0435u = new C0435u(this.f3018c);
        Fragment fragment = this.f3018c;
        if (fragment.mState <= -1 || c0435u.f3015n != null) {
            c0435u.f3015n = fragment.mSavedFragmentState;
        } else {
            Bundle m2329q = m2329q();
            c0435u.f3015n = m2329q;
            if (this.f3018c.mTargetWho != null) {
                if (m2329q == null) {
                    c0435u.f3015n = new Bundle();
                }
                c0435u.f3015n.putString("android:target_state", this.f3018c.mTargetWho);
                int i10 = this.f3018c.mTargetRequestCode;
                if (i10 != 0) {
                    c0435u.f3015n.putInt("android:target_req_state", i10);
                }
            }
        }
        return c0435u;
    }

    /* renamed from: t */
    public void m2332t() {
        if (this.f3018c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3018c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3018c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3018c.mViewLifecycleOwner.m2012e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3018c.mSavedViewRegistryState = bundle;
    }

    /* renamed from: u */
    public void m2333u(int i10) {
        this.f3020e = i10;
    }

    /* renamed from: v */
    public void m2334v() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3018c);
        }
        this.f3018c.performStart();
        this.f3016a.m2122k(this.f3018c, false);
    }

    /* renamed from: w */
    public void m2335w() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3018c);
        }
        this.f3018c.performStop();
        this.f3016a.m2123l(this.f3018c, false);
    }
}
