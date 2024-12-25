package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0231c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0230b;
import androidx.activity.result.InterfaceC0232d;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0565c0;
import androidx.lifecycle.C0567d0;
import androidx.lifecycle.C0571f0;
import androidx.lifecycle.C0573g0;
import androidx.lifecycle.C0580n;
import androidx.lifecycle.C0585s;
import androidx.lifecycle.C0592z;
import androidx.lifecycle.InterfaceC0569e0;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C0732b;
import androidx.savedstate.C0734d;
import androidx.savedstate.InterfaceC0733c;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p017b.AbstractC0773a;
import p030c0.AbstractC0967s0;
import p030c0.C0940f;
import p088f1.AbstractC4749a;
import p206m.InterfaceC5884a;
import p235o0.C6826h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/Fragment.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment.class */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0579m, InterfaceC0569e0, InterfaceC0733c {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C0403i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    public AbstractC0428n mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public C0565c0.b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC0428n mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC0425k<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C0580n mLifecycleRegistry;
    public AbstractC0572g.c mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC0405k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public C0732b mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C0413c0 mViewLifecycleOwner;
    public C0585s<InterfaceC0579m> mViewLifecycleOwnerLiveData;
    public String mWho;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$a.class
     */
    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$a.class */
    public class RunnableC0395a implements Runnable {

        /* renamed from: b */
        public final Fragment f2699b;

        public RunnableC0395a(Fragment fragment) {
            this.f2699b = fragment;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2699b.startPostponedEnterTransition();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$b.class
     */
    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$b.class */
    public class RunnableC0396b implements Runnable {

        /* renamed from: b */
        public final Fragment f2700b;

        public RunnableC0396b(Fragment fragment) {
            this.f2700b = fragment;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2700b.callStartTransitionListener(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$c.class
     */
    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$c.class */
    public class RunnableC0397c implements Runnable {

        /* renamed from: b */
        public final AbstractC0417e0 f2701b;

        /* renamed from: c */
        public final Fragment f2702c;

        public RunnableC0397c(Fragment fragment, AbstractC0417e0 abstractC0417e0) {
            this.f2702c = fragment;
            this.f2701b = abstractC0417e0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2701b.m2049g();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$d.class
     */
    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$d.class */
    public class C0398d extends AbstractC0420g {

        /* renamed from: b */
        public final Fragment f2703b;

        public C0398d(Fragment fragment) {
            this.f2703b = fragment;
        }

        @Override // androidx.fragment.app.AbstractC0420g
        /* renamed from: c */
        public View mo1940c(int i10) {
            View view = this.f2703b.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + this.f2703b + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0420g
        /* renamed from: d */
        public boolean mo1941d() {
            return this.f2703b.mView != null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$e.class
     */
    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$e.class */
    public class C0399e implements InterfaceC5884a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final Fragment f2704a;

        public C0399e(Fragment fragment) {
            this.f2704a = fragment;
        }

        @Override // p206m.InterfaceC5884a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = this.f2704a;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC0232d ? ((InterfaceC0232d) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$f.class
     */
    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$f.class */
    public class C0400f implements InterfaceC5884a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final ActivityResultRegistry f2705a;

        /* renamed from: b */
        public final Fragment f2706b;

        public C0400f(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
            this.f2706b = fragment;
            this.f2705a = activityResultRegistry;
        }

        @Override // p206m.InterfaceC5884a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            return this.f2705a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$g.class
     */
    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$g.class */
    public class C0401g extends AbstractC0405k {

        /* renamed from: a */
        public final InterfaceC5884a f2707a;

        /* renamed from: b */
        public final AtomicReference f2708b;

        /* renamed from: c */
        public final AbstractC0773a f2709c;

        /* renamed from: d */
        public final InterfaceC0230b f2710d;

        /* renamed from: e */
        public final Fragment f2711e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0401g(Fragment fragment, InterfaceC5884a interfaceC5884a, AtomicReference atomicReference, AbstractC0773a abstractC0773a, InterfaceC0230b interfaceC0230b) {
            super(null);
            this.f2711e = fragment;
            this.f2707a = interfaceC5884a;
            this.f2708b = atomicReference;
            this.f2709c = abstractC0773a;
            this.f2710d = interfaceC0230b;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0405k
        /* renamed from: a */
        public void mo1944a() {
            String generateActivityResultKey = this.f2711e.generateActivityResultKey();
            this.f2708b.set(((ActivityResultRegistry) this.f2707a.apply(null)).m794i(generateActivityResultKey, this.f2711e, this.f2709c, this.f2710d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$h.class
     */
    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$h.class */
    public class C0402h<I> extends AbstractC0231c<I> {

        /* renamed from: a */
        public final AtomicReference f2712a;

        /* renamed from: b */
        public final AbstractC0773a f2713b;

        /* renamed from: c */
        public final Fragment f2714c;

        public C0402h(Fragment fragment, AtomicReference atomicReference, AbstractC0773a abstractC0773a) {
            this.f2714c = fragment;
            this.f2712a = atomicReference;
            this.f2713b = abstractC0773a;
        }

        @Override // androidx.activity.result.AbstractC0231c
        /* renamed from: b */
        public void mo798b(I i10, C0940f c0940f) {
            AbstractC0231c abstractC0231c = (AbstractC0231c) this.f2712a.get();
            if (abstractC0231c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC0231c.mo798b(i10, c0940f);
        }

        @Override // androidx.activity.result.AbstractC0231c
        /* renamed from: c */
        public void mo799c() {
            AbstractC0231c abstractC0231c = (AbstractC0231c) this.f2712a.getAndSet(null);
            if (abstractC0231c != null) {
                abstractC0231c.mo799c();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$i.class
     */
    /* renamed from: androidx.fragment.app.Fragment$i */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$i.class */
    public static class C0403i {

        /* renamed from: a */
        public View f2715a;

        /* renamed from: b */
        public Animator f2716b;

        /* renamed from: c */
        public boolean f2717c;

        /* renamed from: d */
        public int f2718d;

        /* renamed from: e */
        public int f2719e;

        /* renamed from: f */
        public int f2720f;

        /* renamed from: g */
        public int f2721g;

        /* renamed from: h */
        public int f2722h;

        /* renamed from: i */
        public ArrayList<String> f2723i;

        /* renamed from: j */
        public ArrayList<String> f2724j;

        /* renamed from: k */
        public Object f2725k = null;

        /* renamed from: l */
        public Object f2726l;

        /* renamed from: m */
        public Object f2727m;

        /* renamed from: n */
        public Object f2728n;

        /* renamed from: o */
        public Object f2729o;

        /* renamed from: p */
        public Object f2730p;

        /* renamed from: q */
        public Boolean f2731q;

        /* renamed from: r */
        public Boolean f2732r;

        /* renamed from: s */
        public float f2733s;

        /* renamed from: t */
        public View f2734t;

        /* renamed from: u */
        public boolean f2735u;

        /* renamed from: v */
        public InterfaceC0406l f2736v;

        /* renamed from: w */
        public boolean f2737w;

        public C0403i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f2726l = obj;
            this.f2727m = null;
            this.f2728n = obj;
            this.f2729o = null;
            this.f2730p = obj;
            this.f2733s = 1.0f;
            this.f2734t = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$j.class
     */
    /* renamed from: androidx.fragment.app.Fragment$j */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$j.class */
    public static class C0404j extends RuntimeException {
        public C0404j(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$k.class
     */
    /* renamed from: androidx.fragment.app.Fragment$k */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$k.class */
    public static abstract class AbstractC0405k {
        public AbstractC0405k() {
        }

        public /* synthetic */ AbstractC0405k(RunnableC0395a runnableC0395a) {
            this();
        }

        /* renamed from: a */
        public abstract void mo1944a();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$l.class
     */
    /* renamed from: androidx.fragment.app.Fragment$l */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$l.class */
    public interface InterfaceC0406l {
        /* renamed from: a */
        void mo1945a();

        /* renamed from: b */
        void mo1946b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/Fragment$m.class
     */
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.Fragment$m */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$m.class */
    public static class C0407m implements Parcelable {
        public static final Parcelable.Creator<C0407m> CREATOR = new a();

        /* renamed from: b */
        public final Bundle f2738b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/fragment/app/Fragment$m$a.class
         */
        /* renamed from: androidx.fragment.app.Fragment$m$a */
        /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/Fragment$m$a.class */
        public class a implements Parcelable.ClassLoaderCreator<C0407m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0407m createFromParcel(Parcel parcel) {
                return new C0407m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0407m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0407m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0407m[] newArray(int i10) {
                return new C0407m[i10];
            }
        }

        public C0407m(Bundle bundle) {
            this.f2738b = bundle;
        }

        public C0407m(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2738b = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f2738b);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0429o();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0395a(this);
        this.mMaxState = AbstractC0572g.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C0585s<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private C0403i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0403i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC0572g.c cVar = this.mMaxState;
        return (cVar == AbstractC0572g.c.INITIALIZED || this.mParentFragment == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0580n(this);
        this.mSavedStateRegistryController = C0732b.m4739a(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C0424j.m2104d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new C0404j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new C0404j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new C0404j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new C0404j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private <I, O> AbstractC0231c<I> prepareCallInternal(AbstractC0773a<I, O> abstractC0773a, InterfaceC5884a<Void, ActivityResultRegistry> interfaceC5884a, InterfaceC0230b<O> interfaceC0230b) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C0401g(this, interfaceC5884a, atomicReference, abstractC0773a, interfaceC0230b));
            return new C0402h(this, atomicReference, abstractC0773a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(AbstractC0405k abstractC0405k) {
        if (this.mState >= 0) {
            abstractC0405k.mo1944a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC0405k);
        }
    }

    private void restoreViewState() {
        if (AbstractC0428n.m2129G0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        AbstractC0428n abstractC0428n;
        C0403i c0403i = this.mAnimationInfo;
        InterfaceC0406l interfaceC0406l = null;
        if (c0403i != null) {
            c0403i.f2735u = false;
            interfaceC0406l = c0403i.f2736v;
            c0403i.f2736v = null;
        }
        if (interfaceC0406l != null) {
            interfaceC0406l.mo1946b();
            return;
        }
        if (!AbstractC0428n.f2918P || this.mView == null || (viewGroup = this.mContainer) == null || (abstractC0428n = this.mFragmentManager) == null) {
            return;
        }
        AbstractC0417e0 m2042n = AbstractC0417e0.m2042n(viewGroup, abstractC0428n);
        m2042n.m2056p();
        if (z10) {
            this.mHost.m2108g().post(new RunnableC0397c(this, m2042n));
        } else {
            m2042n.m2049g();
        }
    }

    public AbstractC0420g createFragmentContainer() {
        return new C0398d(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC4749a.m24045b(this).mo24046a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m2179X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m2209j0(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC0416e getActivity() {
        AbstractC0425k<?> abstractC0425k = this.mHost;
        return abstractC0425k == null ? null : (ActivityC0416e) abstractC0425k.m2106e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0403i c0403i = this.mAnimationInfo;
        return (c0403i == null || (bool = c0403i.f2732r) == null) ? true : bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0403i c0403i = this.mAnimationInfo;
        return (c0403i == null || (bool = c0403i.f2731q) == null) ? true : bool.booleanValue();
    }

    public View getAnimatingAway() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        return c0403i.f2715a;
    }

    public Animator getAnimator() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        return c0403i.f2716b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC0428n getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC0425k<?> abstractC0425k = this.mHost;
        return abstractC0425k == null ? null : abstractC0425k.m2107f();
    }

    public C0565c0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                Context context = applicationContext;
                application = null;
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Application) {
                    application = (Application) context;
                    break;
                }
                applicationContext = ((ContextWrapper) context).getBaseContext();
            }
            if (application == null && AbstractC0428n.m2129G0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C0592z(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return 0;
        }
        return c0403i.f2718d;
    }

    public Object getEnterTransition() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        return c0403i.f2725k;
    }

    public AbstractC0967s0 getEnterTransitionCallback() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        c0403i.getClass();
        return null;
    }

    public int getExitAnim() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return 0;
        }
        return c0403i.f2719e;
    }

    public Object getExitTransition() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        return c0403i.f2727m;
    }

    public AbstractC0967s0 getExitTransitionCallback() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        c0403i.getClass();
        return null;
    }

    public View getFocusedView() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        return c0403i.f2734t;
    }

    @Deprecated
    public final AbstractC0428n getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC0425k<?> abstractC0425k = this.mHost;
        return abstractC0425k == null ? null : abstractC0425k.mo2036i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        LayoutInflater layoutInflater2 = layoutInflater;
        if (layoutInflater == null) {
            layoutInflater2 = performGetLayoutInflater(null);
        }
        return layoutInflater2;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC0425k<?> abstractC0425k = this.mHost;
        if (abstractC0425k == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo2037j = abstractC0425k.mo2037j();
        C6826h.m31596a(mo2037j, this.mChildFragmentManager.m2244v0());
        return mo2037j;
    }

    @Override // androidx.lifecycle.InterfaceC0579m
    public AbstractC0572g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC4749a getLoaderManager() {
        return AbstractC4749a.m24045b(this);
    }

    public int getNextTransition() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return 0;
        }
        return c0403i.f2722h;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC0428n getParentFragmentManager() {
        AbstractC0428n abstractC0428n = this.mFragmentManager;
        if (abstractC0428n != null) {
            return abstractC0428n;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return false;
        }
        return c0403i.f2717c;
    }

    public int getPopEnterAnim() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return 0;
        }
        return c0403i.f2720f;
    }

    public int getPopExitAnim() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return 0;
        }
        return c0403i.f2721g;
    }

    public float getPostOnViewCreatedAlpha() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return 1.0f;
        }
        return c0403i.f2733s;
    }

    public Object getReenterTransition() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        Object obj = c0403i.f2728n;
        Object obj2 = obj;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj2 = getExitTransition();
        }
        return obj2;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        Object obj = c0403i.f2726l;
        Object obj2 = obj;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj2 = getEnterTransition();
        }
        return obj2;
    }

    @Override // androidx.savedstate.InterfaceC0733c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m4740b();
    }

    public Object getSharedElementEnterTransition() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        return c0403i.f2729o;
    }

    public Object getSharedElementReturnTransition() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return null;
        }
        Object obj = c0403i.f2730p;
        Object obj2 = obj;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj2 = getSharedElementEnterTransition();
        }
        return obj2;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0403i c0403i = this.mAnimationInfo;
        return (c0403i == null || (arrayList = c0403i.f2723i) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0403i c0403i = this.mAnimationInfo;
        return (c0403i == null || (arrayList = c0403i.f2724j) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        AbstractC0428n abstractC0428n = this.mFragmentManager;
        if (abstractC0428n == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC0428n.m2200g0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC0579m getViewLifecycleOwner() {
        C0413c0 c0413c0 = this.mViewLifecycleOwner;
        if (c0413c0 != null) {
            return c0413c0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<InterfaceC0579m> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC0569e0
    public C0567d0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != AbstractC0572g.c.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m2137B0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0429o();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return false;
        }
        return c0403i.f2737w;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        AbstractC0428n abstractC0428n;
        return this.mMenuVisible && ((abstractC0428n = this.mFragmentManager) == null || abstractC0428n.m2150I0(this.mParentFragment));
    }

    public boolean isPostponed() {
        C0403i c0403i = this.mAnimationInfo;
        if (c0403i == null) {
            return false;
        }
        return c0403i.f2735u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        AbstractC0428n abstractC0428n = this.mFragmentManager;
        if (abstractC0428n == null) {
            return false;
        }
        return abstractC0428n.m2156L0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m2174U0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC0425k<?> abstractC0425k = this.mHost;
        Activity m2106e = abstractC0425k == null ? null : abstractC0425k.m2106e();
        if (m2106e != null) {
            this.mCalled = false;
            onAttach(m2106e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.m2154K0(1)) {
            return;
        }
        this.mChildFragmentManager.m2140D();
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC0425k<?> abstractC0425k = this.mHost;
        Activity m2106e = abstractC0425k == null ? null : abstractC0425k.m2106e();
        if (m2106e != null) {
            this.mCalled = false;
            onInflate(m2106e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m2174U0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.m2254z();
        } else {
            throw new C0421g0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        Iterator<AbstractC0405k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo1944a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m2211k(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m2107f());
        if (this.mCalled) {
            this.mFragmentManager.m2151J(this);
            this.mChildFragmentManager.m2135A();
        } else {
            throw new C0421g0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m2136B(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2138C(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m2174U0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo3154a(new InterfaceC0577k(this) { // from class: androidx.fragment.app.Fragment.5

            /* renamed from: b */
            public final Fragment f2698b;

            {
                this.f2698b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0577k
            /* renamed from: b */
            public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
                View view;
                if (bVar != AbstractC0572g.b.ON_STOP || (view = this.f2698b.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.m4741c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m3166h(AbstractC0572g.b.ON_CREATE);
            return;
        }
        throw new C0421g0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (!this.mHidden) {
            boolean z11 = false;
            if (this.mHasMenu) {
                z11 = false;
                if (this.mMenuVisible) {
                    z11 = true;
                    onCreateOptionsMenu(menu, menuInflater);
                }
            }
            z10 = z11 | this.mChildFragmentManager.m2142E(menu, menuInflater);
        }
        return z10;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m2174U0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0413c0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.m2010c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.m2009b();
            C0571f0.m3153a(this.mView, this.mViewLifecycleOwner);
            C0573g0.m3157a(this.mView, this.mViewLifecycleOwner);
            C0734d.m4743a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo3106n(this.mViewLifecycleOwner);
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.m2144F();
        this.mLifecycleRegistry.m3166h(AbstractC0572g.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new C0421g0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m2146G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo3155b().isAtLeast(AbstractC0572g.c.CREATED)) {
            this.mViewLifecycleOwner.m2008a(AbstractC0572g.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC4749a.m24045b(this).mo24048d();
            this.mPerformedCreateView = false;
        } else {
            throw new C0421g0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.m2145F0()) {
                return;
            }
            this.mChildFragmentManager.m2144F();
            this.mChildFragmentManager = new C0429o();
            return;
        }
        throw new C0421g0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m2147H();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
        this.mChildFragmentManager.m2149I(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2153K(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m2155L(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m2159N();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2008a(AbstractC0572g.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.m3166h(AbstractC0572g.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new C0421g0("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
        this.mChildFragmentManager.m2161O(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (!this.mHidden) {
            boolean z11 = false;
            if (this.mHasMenu) {
                z11 = false;
                if (this.mMenuVisible) {
                    z11 = true;
                    onPrepareOptionsMenu(menu);
                }
            }
            z10 = z11 | this.mChildFragmentManager.m2163P(menu);
        }
        return z10;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean m2152J0 = this.mFragmentManager.m2152J0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != m2152J0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(m2152J0);
            onPrimaryNavigationFragmentChanged(m2152J0);
            this.mChildFragmentManager.m2165Q();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m2174U0();
        this.mChildFragmentManager.m2187b0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C0421g0("Fragment " + this + " did not call through to super.onResume()");
        }
        C0580n c0580n = this.mLifecycleRegistry;
        AbstractC0572g.b bVar = AbstractC0572g.b.ON_RESUME;
        c0580n.m3166h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2008a(bVar);
        }
        this.mChildFragmentManager.m2167R();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m4742d(bundle);
        Parcelable m2218m1 = this.mChildFragmentManager.m2218m1();
        if (m2218m1 != null) {
            bundle.putParcelable(ActivityC0416e.FRAGMENTS_TAG, m2218m1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.m2174U0();
        this.mChildFragmentManager.m2187b0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C0421g0("Fragment " + this + " did not call through to super.onStart()");
        }
        C0580n c0580n = this.mLifecycleRegistry;
        AbstractC0572g.b bVar = AbstractC0572g.b.ON_START;
        c0580n.m3166h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2008a(bVar);
        }
        this.mChildFragmentManager.m2169S();
    }

    public void performStop() {
        this.mChildFragmentManager.m2173U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2008a(AbstractC0572g.b.ON_STOP);
        }
        this.mLifecycleRegistry.m3166h(AbstractC0572g.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new C0421g0("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m2175V();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f2735u = true;
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        ensureAnimationInfo().f2735u = true;
        AbstractC0428n abstractC0428n = this.mFragmentManager;
        Handler m2108g = abstractC0428n != null ? abstractC0428n.m2241u0().m2108g() : new Handler(Looper.getMainLooper());
        m2108g.removeCallbacks(this.mPostponedDurationRunnable);
        m2108g.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> AbstractC0231c<I> registerForActivityResult(AbstractC0773a<I, O> abstractC0773a, ActivityResultRegistry activityResultRegistry, InterfaceC0230b<O> interfaceC0230b) {
        return prepareCallInternal(abstractC0773a, new C0400f(this, activityResultRegistry), interfaceC0230b);
    }

    public final <I, O> AbstractC0231c<I> registerForActivityResult(AbstractC0773a<I, O> abstractC0773a, InterfaceC0230b<O> interfaceC0230b) {
        return prepareCallInternal(abstractC0773a, new C0399e(this), interfaceC0230b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().m2158M0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final ActivityC0416e requireActivity() {
        ActivityC0416e activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final AbstractC0428n requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable(ActivityC0416e.FRAGMENTS_TAG)) == null) {
            return;
        }
        this.mChildFragmentManager.m2213k1(parcelable);
        this.mChildFragmentManager.m2140D();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m2011d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m2008a(AbstractC0572g.b.ON_CREATE);
            }
        } else {
            throw new C0421g0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f2732r = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f2731q = Boolean.valueOf(z10);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f2715a = view;
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f2718d = i10;
        ensureAnimationInfo().f2719e = i11;
        ensureAnimationInfo().f2720f = i12;
        ensureAnimationInfo().f2721g = i13;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f2716b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC0967s0 abstractC0967s0) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f2725k = obj;
    }

    public void setExitSharedElementCallback(AbstractC0967s0 abstractC0967s0) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f2727m = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f2734t = view;
    }

    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo2040p();
        }
    }

    public void setHideReplaced(boolean z10) {
        ensureAnimationInfo().f2737w = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r5 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setInitialSavedState(androidx.fragment.app.Fragment.C0407m r5) {
        /*
            r4 = this;
            r0 = r4
            androidx.fragment.app.n r0 = r0.mFragmentManager
            if (r0 != 0) goto L1f
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r5
            android.os.Bundle r0 = r0.f2738b
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            r5 = r0
        L19:
            r0 = r4
            r1 = r5
            r0.mSavedFragmentState = r1
            return
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Fragment already added"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setInitialSavedState(androidx.fragment.app.Fragment$m):void");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo2040p();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f2722h = i10;
    }

    public void setOnStartEnterTransitionListener(InterfaceC0406l interfaceC0406l) {
        ensureAnimationInfo();
        C0403i c0403i = this.mAnimationInfo;
        InterfaceC0406l interfaceC0406l2 = c0403i.f2736v;
        if (interfaceC0406l == interfaceC0406l2) {
            return;
        }
        if (interfaceC0406l != null && interfaceC0406l2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0403i.f2735u) {
            c0403i.f2736v = interfaceC0406l;
        }
        if (interfaceC0406l != null) {
            interfaceC0406l.mo1945a();
        }
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f2717c = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f2733s = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f2728n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        this.mRetainInstance = z10;
        AbstractC0428n abstractC0428n = this.mFragmentManager;
        if (abstractC0428n == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            abstractC0428n.m2205i(this);
        } else {
            abstractC0428n.m2207i1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f2726l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f2729o = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0403i c0403i = this.mAnimationInfo;
        c0403i.f2723i = arrayList;
        c0403i.f2724j = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f2730p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i10) {
        AbstractC0428n abstractC0428n = this.mFragmentManager;
        AbstractC0428n abstractC0428n2 = fragment != null ? fragment.mFragmentManager : null;
        if (abstractC0428n != null && abstractC0428n2 != null && abstractC0428n != abstractC0428n2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        Fragment fragment2 = fragment;
        while (true) {
            Fragment fragment3 = fragment2;
            if (fragment3 == null) {
                if (fragment == null) {
                    this.mTargetWho = null;
                } else {
                    if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                        this.mTargetWho = null;
                        this.mTarget = fragment;
                        this.mTargetRequestCode = i10;
                        return;
                    }
                    this.mTargetWho = fragment.mWho;
                }
                this.mTarget = null;
                this.mTargetRequestCode = i10;
                return;
            }
            if (fragment3.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
            fragment2 = fragment3.getTargetFragment();
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC0428n abstractC0428n = this.mFragmentManager;
            abstractC0428n.m2178W0(abstractC0428n.m2246w(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC0425k<?> abstractC0425k = this.mHost;
        if (abstractC0425k != null) {
            return abstractC0425k.mo2039m(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC0425k<?> abstractC0425k = this.mHost;
        if (abstractC0425k != null) {
            abstractC0425k.m2110n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m2160N0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m2162O0(this, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f2735u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f2735u = false;
        } else if (Looper.myLooper() != this.mHost.m2108g().getLooper()) {
            this.mHost.m2108g().postAtFrontOfQueue(new RunnableC0396b(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
