package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0223c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0232d;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0567d0;
import androidx.lifecycle.C0580n;
import androidx.lifecycle.InterfaceC0569e0;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.InterfaceC0001b;
import p030c0.AbstractC0967s0;
import p030c0.C0936d;
import p088f1.AbstractC4749a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/e.class
 */
/* renamed from: androidx.fragment.app.e */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e.class */
public class ActivityC0416e extends ComponentActivity implements C0936d.c, C0936d.e {
    public static final String FRAGMENTS_TAG = "android:support:fragments";
    public boolean mCreated;
    public final C0580n mFragmentLifecycleRegistry;
    public final C0423i mFragments;
    public boolean mResumed;
    public boolean mStopped;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e$a.class
     */
    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e$a.class */
    public class a implements SavedStateRegistry.InterfaceC0730b {

        /* renamed from: a */
        public final ActivityC0416e f2858a;

        public a(ActivityC0416e activityC0416e) {
            this.f2858a = activityC0416e;
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0730b
        /* renamed from: a */
        public Bundle mo882a() {
            Bundle bundle = new Bundle();
            this.f2858a.markFragmentsCreated();
            this.f2858a.mFragmentLifecycleRegistry.m3166h(AbstractC0572g.b.ON_STOP);
            Parcelable m2101x = this.f2858a.mFragments.m2101x();
            if (m2101x != null) {
                bundle.putParcelable(ActivityC0416e.FRAGMENTS_TAG, m2101x);
            }
            return bundle;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e$b.class
     */
    /* renamed from: androidx.fragment.app.e$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e$b.class */
    public class b implements InterfaceC0001b {

        /* renamed from: a */
        public final ActivityC0416e f2859a;

        public b(ActivityC0416e activityC0416e) {
            this.f2859a = activityC0416e;
        }

        @Override // p000a.InterfaceC0001b
        /* renamed from: a */
        public void mo5a(Context context) {
            this.f2859a.mFragments.m2079a(null);
            Bundle m4734a = this.f2859a.getSavedStateRegistry().m4734a(ActivityC0416e.FRAGMENTS_TAG);
            if (m4734a != null) {
                this.f2859a.mFragments.m2100w(m4734a.getParcelable(ActivityC0416e.FRAGMENTS_TAG));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/e$c.class
     */
    /* renamed from: androidx.fragment.app.e$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/e$c.class */
    public class c extends AbstractC0425k<ActivityC0416e> implements InterfaceC0569e0, InterfaceC0223c, InterfaceC0232d, InterfaceC0432r {

        /* renamed from: g */
        public final ActivityC0416e f2860g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ActivityC0416e activityC0416e) {
            super(activityC0416e);
            this.f2860g = activityC0416e;
        }

        @Override // androidx.fragment.app.InterfaceC0432r
        /* renamed from: a */
        public void mo2034a(AbstractC0428n abstractC0428n, Fragment fragment) {
            this.f2860g.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0425k, androidx.fragment.app.AbstractC0420g
        /* renamed from: c */
        public View mo1940c(int i10) {
            return this.f2860g.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC0425k, androidx.fragment.app.AbstractC0420g
        /* renamed from: d */
        public boolean mo1941d() {
            Window window = this.f2860g.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.InterfaceC0232d
        public ActivityResultRegistry getActivityResultRegistry() {
            return this.f2860g.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC0579m
        public AbstractC0572g getLifecycle() {
            return this.f2860g.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0223c
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return this.f2860g.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.InterfaceC0569e0
        public C0567d0 getViewModelStore() {
            return this.f2860g.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC0425k
        /* renamed from: h */
        public void mo2035h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            this.f2860g.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0425k
        /* renamed from: j */
        public LayoutInflater mo2037j() {
            return this.f2860g.getLayoutInflater().cloneInContext(this.f2860g);
        }

        @Override // androidx.fragment.app.AbstractC0425k
        /* renamed from: l */
        public boolean mo2038l(Fragment fragment) {
            return !this.f2860g.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0425k
        /* renamed from: m */
        public boolean mo2039m(String str) {
            return C0936d.m5645v(this.f2860g, str);
        }

        @Override // androidx.fragment.app.AbstractC0425k
        /* renamed from: p */
        public void mo2040p() {
            this.f2860g.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.AbstractC0425k
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public ActivityC0416e mo2036i() {
            return this.f2860g;
        }
    }

    public ActivityC0416e() {
        this.mFragments = C0423i.m2078b(new c(this));
        this.mFragmentLifecycleRegistry = new C0580n(this);
        this.mStopped = true;
        init();
    }

    public ActivityC0416e(int i10) {
        super(i10);
        this.mFragments = C0423i.m2078b(new c(this));
        this.mFragmentLifecycleRegistry = new C0580n(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m4737d(FRAGMENTS_TAG, new a(this));
        addOnContextAvailableListener(new b(this));
    }

    private static boolean markState(AbstractC0428n abstractC0428n, AbstractC0572g.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : abstractC0428n.m2238t0()) {
            if (fragment != null) {
                boolean z11 = z10;
                if (fragment.getHost() != null) {
                    z11 = z10 | markState(fragment.getChildFragmentManager(), cVar);
                }
                C0413c0 c0413c0 = fragment.mViewLifecycleOwner;
                z10 = z11;
                if (c0413c0 != null) {
                    z10 = z11;
                    if (c0413c0.getLifecycle().mo3155b().isAtLeast(AbstractC0572g.c.STARTED)) {
                        fragment.mViewLifecycleOwner.m2013f(cVar);
                        z10 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.mo3155b().isAtLeast(AbstractC0572g.c.STARTED)) {
                    fragment.mLifecycleRegistry.m3172o(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m2099v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC4749a.m24045b(this).mo24046a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m2097t().m2179X(str, fileDescriptor, printWriter, strArr);
    }

    public AbstractC0428n getSupportFragmentManager() {
        return this.mFragments.m2097t();
    }

    @Deprecated
    public AbstractC4749a getSupportLoaderManager() {
        return AbstractC4749a.m24045b(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC0572g.c.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m2098u();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.m2098u();
        this.mFragments.m2081d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m3166h(AbstractC0572g.b.ON_CREATE);
        this.mFragments.m2083f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.mFragments.m2084g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m2085h();
        this.mFragmentLifecycleRegistry.m3166h(AbstractC0572g.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m2086i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mFragments.m2088k(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.mFragments.m2082e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.mFragments.m2087j(z10);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.m2098u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.mFragments.m2089l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m2090m();
        this.mFragmentLifecycleRegistry.m3166h(AbstractC0572g.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.mFragments.m2091n(z10);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.m2092o(menu) : super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m2098u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.m2098u();
        this.mFragments.m2096s();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m3166h(AbstractC0572g.b.ON_RESUME);
        this.mFragments.m2093p();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m2080c();
        }
        this.mFragments.m2098u();
        this.mFragments.m2096s();
        this.mFragmentLifecycleRegistry.m3166h(AbstractC0572g.b.ON_START);
        this.mFragments.m2094q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m2098u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m2095r();
        this.mFragmentLifecycleRegistry.m3166h(AbstractC0572g.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC0967s0 abstractC0967s0) {
        C0936d.m5643t(this, abstractC0967s0);
    }

    public void setExitSharedElementCallback(AbstractC0967s0 abstractC0967s0) {
        C0936d.m5644u(this, abstractC0967s0);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            C0936d.m5646w(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            C0936d.m5647x(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C0936d.m5637n(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0936d.m5639p(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0936d.m5648y(this);
    }

    @Override // p030c0.C0936d.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
