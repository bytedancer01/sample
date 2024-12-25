package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.AbstractC0231c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0233e;
import androidx.activity.result.InterfaceC0230b;
import androidx.activity.result.InterfaceC0232d;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0565c0;
import androidx.lifecycle.C0567d0;
import androidx.lifecycle.C0571f0;
import androidx.lifecycle.C0573g0;
import androidx.lifecycle.C0580n;
import androidx.lifecycle.C0592z;
import androidx.lifecycle.FragmentC0589w;
import androidx.lifecycle.InterfaceC0569e0;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import androidx.savedstate.C0732b;
import androidx.savedstate.C0734d;
import androidx.savedstate.InterfaceC0733c;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;
import p000a.InterfaceC0001b;
import p017b.AbstractC0773a;
import p030c0.ActivityC0952l;
import p030c0.C0936d;
import p030c0.C0940f;
import p433z1.C10030b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/activity/ComponentActivity.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/activity/ComponentActivity.class */
public class ComponentActivity extends ActivityC0952l implements InterfaceC0569e0, InterfaceC0733c, InterfaceC0223c, InterfaceC0232d {
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final C0000a mContextAwareHelper;
    private C0565c0.b mDefaultFactory;
    private final C0580n mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final C0732b mSavedStateRegistryController;
    private C0567d0 mViewModelStore;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/ComponentActivity$a.class
     */
    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/ComponentActivity$a.class */
    public class RunnableC0217a implements Runnable {

        /* renamed from: b */
        public final ComponentActivity f1303b;

        public RunnableC0217a(ComponentActivity componentActivity) {
            this.f1303b = componentActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/ComponentActivity$b.class
     */
    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/ComponentActivity$b.class */
    public class C0218b extends ActivityResultRegistry {

        /* renamed from: i */
        public final ComponentActivity f1304i;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/activity/ComponentActivity$b$a.class
         */
        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: combined.jar:classes1.jar:androidx/activity/ComponentActivity$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final int f1305b;

            /* renamed from: c */
            public final AbstractC0773a.a f1306c;

            /* renamed from: d */
            public final C0218b f1307d;

            public a(C0218b c0218b, int i10, AbstractC0773a.a aVar) {
                this.f1307d = c0218b;
                this.f1305b = i10;
                this.f1306c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1307d.m789c(this.f1305b, this.f1306c.m4990a());
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/activity/ComponentActivity$b$b.class
         */
        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: combined.jar:classes1.jar:androidx/activity/ComponentActivity$b$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final int f1308b;

            /* renamed from: c */
            public final IntentSender.SendIntentException f1309c;

            /* renamed from: d */
            public final C0218b f1310d;

            public b(C0218b c0218b, int i10, IntentSender.SendIntentException sendIntentException) {
                this.f1310d = c0218b;
                this.f1308b = i10;
                this.f1309c = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1310d.m788b(this.f1308b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f1309c));
            }
        }

        public C0218b(ComponentActivity componentActivity) {
            this.f1304i = componentActivity;
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo776f(int i10, AbstractC0773a<I, O> abstractC0773a, I i11, C0940f c0940f) {
            ComponentActivity componentActivity = this.f1304i;
            AbstractC0773a.a<O> mo4989b = abstractC0773a.mo4989b(componentActivity, i11);
            if (mo4989b != null) {
                new Handler(Looper.getMainLooper()).post(new a(this, i10, mo4989b));
                return;
            }
            Intent mo2261a = abstractC0773a.mo2261a(componentActivity, i11);
            Bundle bundle = null;
            if (mo2261a.getExtras() != null && mo2261a.getExtras().getClassLoader() == null) {
                mo2261a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo2261a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = mo2261a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo2261a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo2261a.getAction())) {
                String[] stringArrayExtra = mo2261a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                String[] strArr = stringArrayExtra;
                if (stringArrayExtra == null) {
                    strArr = new String[0];
                }
                C0936d.m5641r(componentActivity, strArr, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo2261a.getAction())) {
                C0936d.m5646w(componentActivity, mo2261a, i10, bundle);
                return;
            }
            C0233e c0233e = (C0233e) mo2261a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                C0936d.m5647x(componentActivity, c0233e.m812k(), i10, c0233e.m809b(), c0233e.m810c(), c0233e.m811j(), 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new b(this, i10, e10));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/ComponentActivity$c.class
     */
    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/ComponentActivity$c.class */
    public static final class C0219c {

        /* renamed from: a */
        public Object f1311a;

        /* renamed from: b */
        public C0567d0 f1312b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C0000a();
        this.mLifecycleRegistry = new C0580n(this);
        this.mSavedStateRegistryController = C0732b.m4739a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0217a(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0218b(this);
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        getLifecycle().mo3154a(new InterfaceC0577k(this) { // from class: androidx.activity.ComponentActivity.3

            /* renamed from: b */
            public final ComponentActivity f1300b;

            {
                this.f1300b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0577k
            /* renamed from: b */
            public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
                if (bVar == AbstractC0572g.b.ON_STOP) {
                    Window window = this.f1300b.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().mo3154a(new InterfaceC0577k(this) { // from class: androidx.activity.ComponentActivity.4

            /* renamed from: b */
            public final ComponentActivity f1301b;

            {
                this.f1301b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0577k
            /* renamed from: b */
            public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
                if (bVar == AbstractC0572g.b.ON_DESTROY) {
                    this.f1301b.mContextAwareHelper.m1b();
                    if (this.f1301b.isChangingConfigurations()) {
                        return;
                    }
                    this.f1301b.getViewModelStore().m3142a();
                }
            }
        });
        getLifecycle().mo3154a(new InterfaceC0577k(this) { // from class: androidx.activity.ComponentActivity.5

            /* renamed from: b */
            public final ComponentActivity f1302b;

            {
                this.f1302b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0577k
            /* renamed from: b */
            public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
                this.f1302b.ensureViewModelStore();
                this.f1302b.getLifecycle().mo3156c(this);
            }
        });
        if (i10 <= 23) {
            getLifecycle().mo3154a(new ImmLeaksCleaner(this));
        }
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private void initViewTreeOwners() {
        C0571f0.m3153a(getWindow().getDecorView(), this);
        C0573g0.m3157a(getWindow().getDecorView(), this);
        C0734d.m4743a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(InterfaceC0001b interfaceC0001b) {
        this.mContextAwareHelper.m0a(interfaceC0001b);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0219c c0219c = (C0219c) getLastNonConfigurationInstance();
            if (c0219c != null) {
                this.mViewModelStore = c0219c.f1312b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0567d0();
            }
        }
    }

    @Override // androidx.activity.result.InterfaceC0232d
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C0565c0.b getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C0592z(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0219c c0219c = (C0219c) getLastNonConfigurationInstance();
        return c0219c != null ? c0219c.f1311a : null;
    }

    @Override // p030c0.ActivityC0952l, androidx.lifecycle.InterfaceC0579m
    public AbstractC0572g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0223c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.InterfaceC0733c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m4740b();
    }

    @Override // androidx.lifecycle.InterfaceC0569e0
    public C0567d0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.m788b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m780c();
    }

    @Override // p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m4741c(bundle);
        this.mContextAwareHelper.m2c(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.m792g(bundle);
        FragmentC0589w.m3193g(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m788b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0567d0 c0567d0 = this.mViewModelStore;
        C0567d0 c0567d02 = c0567d0;
        if (c0567d0 == null) {
            C0219c c0219c = (C0219c) getLastNonConfigurationInstance();
            c0567d02 = c0567d0;
            if (c0219c != null) {
                c0567d02 = c0219c.f1312b;
            }
        }
        if (c0567d02 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0219c c0219c2 = new C0219c();
        c0219c2.f1311a = onRetainCustomNonConfigurationInstance;
        c0219c2.f1312b = c0567d02;
        return c0219c2;
    }

    @Override // p030c0.ActivityC0952l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0572g lifecycle = getLifecycle();
        if (lifecycle instanceof C0580n) {
            ((C0580n) lifecycle).m3172o(AbstractC0572g.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m4742d(bundle);
        this.mActivityResultRegistry.m793h(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m3d();
    }

    public final <I, O> AbstractC0231c<I> registerForActivityResult(AbstractC0773a<I, O> abstractC0773a, ActivityResultRegistry activityResultRegistry, InterfaceC0230b<O> interfaceC0230b) {
        return activityResultRegistry.m794i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0773a, interfaceC0230b);
    }

    public final <I, O> AbstractC0231c<I> registerForActivityResult(AbstractC0773a<I, O> abstractC0773a, InterfaceC0230b<O> interfaceC0230b) {
        return registerForActivityResult(abstractC0773a, this.mActivityResultRegistry, interfaceC0230b);
    }

    public final void removeOnContextAvailableListener(InterfaceC0001b interfaceC0001b) {
        this.mContextAwareHelper.m4e(interfaceC0001b);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C10030b.m42185d()) {
                C10030b.m42182a("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            C10030b.m42183b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
