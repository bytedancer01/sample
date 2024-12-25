package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.C0346q1;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.AbstractC0439y;
import androidx.fragment.app.ActivityC0416e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p068e.C4561b;
import p106g0.C4917c;
import p192l1.C5645a;
import p192l1.C5654j;
import p192l1.C5656l;
import p208m1.C5900i;
import p208m1.C5901j;
import p208m1.C5911t;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/MediaRouteButton.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteButton.class */
public class MediaRouteButton extends View {

    /* renamed from: s */
    public static C0599a f3829s;

    /* renamed from: t */
    public static final SparseArray<Drawable.ConstantState> f3830t = new SparseArray<>(2);

    /* renamed from: u */
    public static final int[] f3831u = {R.attr.state_checked};

    /* renamed from: v */
    public static final int[] f3832v = {R.attr.state_checkable};

    /* renamed from: b */
    public final C5901j f3833b;

    /* renamed from: c */
    public final C0600b f3834c;

    /* renamed from: d */
    public C5900i f3835d;

    /* renamed from: e */
    public C0608e f3836e;

    /* renamed from: f */
    public boolean f3837f;

    /* renamed from: g */
    public int f3838g;

    /* renamed from: h */
    public boolean f3839h;

    /* renamed from: i */
    public AsyncTaskC0601c f3840i;

    /* renamed from: j */
    public Drawable f3841j;

    /* renamed from: k */
    public int f3842k;

    /* renamed from: l */
    public int f3843l;

    /* renamed from: m */
    public int f3844m;

    /* renamed from: n */
    public ColorStateList f3845n;

    /* renamed from: o */
    public int f3846o;

    /* renamed from: p */
    public int f3847p;

    /* renamed from: q */
    public boolean f3848q;

    /* renamed from: r */
    public boolean f3849r;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/MediaRouteButton$a.class
     */
    /* renamed from: androidx.mediarouter.app.MediaRouteButton$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteButton$a.class */
    public static final class C0599a extends BroadcastReceiver {

        /* renamed from: a */
        public final Context f3850a;

        /* renamed from: b */
        public boolean f3851b = true;

        /* renamed from: c */
        public List<MediaRouteButton> f3852c = new ArrayList();

        public C0599a(Context context) {
            this.f3850a = context;
        }

        /* renamed from: a */
        public boolean m3247a() {
            return this.f3851b;
        }

        /* renamed from: b */
        public void m3248b(MediaRouteButton mediaRouteButton) {
            if (this.f3852c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.f3850a.registerReceiver(this, intentFilter);
            }
            this.f3852c.add(mediaRouteButton);
        }

        /* renamed from: c */
        public void m3249c(MediaRouteButton mediaRouteButton) {
            this.f3852c.remove(mediaRouteButton);
            if (this.f3852c.size() == 0) {
                this.f3850a.unregisterReceiver(this);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10;
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.f3851b == (!intent.getBooleanExtra("noConnectivity", false))) {
                return;
            }
            this.f3851b = z10;
            Iterator<MediaRouteButton> it = this.f3852c.iterator();
            while (it.hasNext()) {
                it.next().m3240c();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/MediaRouteButton$b.class
     */
    /* renamed from: androidx.mediarouter.app.MediaRouteButton$b */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteButton$b.class */
    public final class C0600b extends C5901j.a {

        /* renamed from: a */
        public final MediaRouteButton f3853a;

        public C0600b(MediaRouteButton mediaRouteButton) {
            this.f3853a = mediaRouteButton;
        }

        @Override // p208m1.C5901j.a
        /* renamed from: a */
        public void mo3231a(C5901j c5901j, C5901j.g gVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: b */
        public void mo3232b(C5901j c5901j, C5901j.g gVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: c */
        public void mo3233c(C5901j c5901j, C5901j.g gVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: d */
        public void mo3234d(C5901j c5901j, C5901j.h hVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: e */
        public void mo3235e(C5901j c5901j, C5901j.h hVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: g */
        public void mo3236g(C5901j c5901j, C5901j.h hVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: h */
        public void mo3250h(C5901j c5901j, C5901j.h hVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: k */
        public void mo3251k(C5901j c5901j, C5901j.h hVar) {
            this.f3853a.m3239b();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: n */
        public void mo3252n(C5901j c5901j, C5911t c5911t) {
            boolean z10 = c5911t != null ? c5911t.m29073b().getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
            MediaRouteButton mediaRouteButton = this.f3853a;
            if (mediaRouteButton.f3839h != z10) {
                mediaRouteButton.f3839h = z10;
                mediaRouteButton.refreshDrawableState();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/MediaRouteButton$c.class
     */
    /* renamed from: androidx.mediarouter.app.MediaRouteButton$c */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteButton$c.class */
    public final class AsyncTaskC0601c extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a */
        public final int f3854a;

        /* renamed from: b */
        public final Context f3855b;

        /* renamed from: c */
        public final MediaRouteButton f3856c;

        public AsyncTaskC0601c(MediaRouteButton mediaRouteButton, int i10, Context context) {
            this.f3856c = mediaRouteButton;
            this.f3854a = i10;
            this.f3855b = context;
        }

        /* renamed from: a */
        public final void m3253a(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.f3830t.put(this.f3854a, drawable.getConstantState());
            }
            this.f3856c.f3840i = null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            if (MediaRouteButton.f3830t.get(this.f3854a) == null) {
                return C4561b.m22999d(this.f3855b, this.f3854a);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Drawable drawable) {
            m3253a(drawable);
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                m3253a(drawable);
            } else {
                Drawable.ConstantState constantState = MediaRouteButton.f3830t.get(this.f3854a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                this.f3856c.f3840i = null;
            }
            this.f3856c.setRemoteIndicatorDrawableInternal(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5645a.f31779a);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i10) {
        super(C0612i.m3407a(context), attributeSet, i10);
        Drawable.ConstantState constantState;
        this.f3835d = C5900i.f33081c;
        this.f3836e = C0608e.m3335a();
        this.f3838g = 0;
        Context context2 = getContext();
        int[] iArr = C5656l.f31903a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C6824g0.m31535n0(this, context2, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        if (isInEditMode()) {
            this.f3833b = null;
            this.f3834c = null;
            this.f3841j = C4561b.m22999d(context2, obtainStyledAttributes.getResourceId(C5656l.f31907e, 0));
            return;
        }
        C5901j m28867j = C5901j.m28867j(context2);
        this.f3833b = m28867j;
        this.f3834c = new C0600b(this);
        C5901j.h m28880n = m28867j.m28880n();
        int m28987c = m28880n.m29007w() ^ true ? m28880n.m28987c() : 0;
        this.f3844m = m28987c;
        this.f3843l = m28987c;
        if (f3829s == null) {
            f3829s = new C0599a(context2.getApplicationContext());
        }
        this.f3845n = obtainStyledAttributes.getColorStateList(C5656l.f31908f);
        this.f3846o = obtainStyledAttributes.getDimensionPixelSize(C5656l.f31904b, 0);
        this.f3847p = obtainStyledAttributes.getDimensionPixelSize(C5656l.f31905c, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C5656l.f31907e, 0);
        this.f3842k = obtainStyledAttributes.getResourceId(C5656l.f31906d, 0);
        obtainStyledAttributes.recycle();
        int i11 = this.f3842k;
        if (i11 != 0 && (constantState = f3830t.get(i11)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.f3841j == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = f3830t.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    AsyncTaskC0601c asyncTaskC0601c = new AsyncTaskC0601c(this, resourceId, getContext());
                    this.f3840i = asyncTaskC0601c;
                    asyncTaskC0601c.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                m3238a();
            }
        }
        m3246i();
        setClickable(true);
    }

    private Activity getActivity() {
        Context context = getContext();
        while (true) {
            Context context2 = context;
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }

    private AbstractC0428n getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof ActivityC0416e) {
            return ((ActivityC0416e) activity).getSupportFragmentManager();
        }
        return null;
    }

    /* renamed from: a */
    public final void m3238a() {
        if (this.f3842k > 0) {
            AsyncTaskC0601c asyncTaskC0601c = this.f3840i;
            if (asyncTaskC0601c != null) {
                asyncTaskC0601c.cancel(false);
            }
            AsyncTaskC0601c asyncTaskC0601c2 = new AsyncTaskC0601c(this, this.f3842k, getContext());
            this.f3840i = asyncTaskC0601c2;
            this.f3842k = 0;
            asyncTaskC0601c2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: b */
    public void m3239b() {
        C5901j.h m28880n = this.f3833b.m28880n();
        boolean z10 = !m28880n.m29007w();
        int m28987c = z10 ? m28880n.m28987c() : 0;
        if (this.f3844m != m28987c) {
            this.f3844m = m28987c;
            m3246i();
            refreshDrawableState();
        }
        if (m28987c == 1) {
            m3238a();
        }
        if (this.f3837f) {
            boolean z11 = true;
            if (!this.f3848q) {
                z11 = true;
                if (!z10) {
                    z11 = this.f3833b.m28881q(this.f3835d, 1);
                }
            }
            setEnabled(z11);
        }
    }

    /* renamed from: c */
    public void m3240c() {
        super.setVisibility((this.f3838g != 0 || this.f3848q || f3829s.m3247a()) ? this.f3838g : 4);
        Drawable drawable = this.f3841j;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* renamed from: d */
    public boolean m3241d() {
        if (!this.f3837f) {
            return false;
        }
        C5911t m28878l = this.f3833b.m28878l();
        if (m28878l == null) {
            return m3242e(1);
        }
        if (m28878l.m29075d() && C5901j.m28869p() && m3243f()) {
            return true;
        }
        return m3242e(m28878l.m29072a());
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3841j != null) {
            this.f3841j.setState(getDrawableState());
            if (this.f3841j.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f3841j.getCurrent();
                int i10 = this.f3844m;
                if (i10 == 1 || this.f3843l != i10) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i10 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.f3843l = this.f3844m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final boolean m3242e(int i10) {
        String str;
        C0607d c0607d;
        String str2;
        AbstractC0428n fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (this.f3833b.m28880n().m29007w()) {
            if (fragmentManager.m2206i0("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                str2 = "showDialog(): Route chooser dialog already showing!";
                Log.w("MediaRouteButton", str2);
                return false;
            }
            C0605b mo3336b = this.f3836e.mo3336b();
            mo3336b.m3287U(this.f3835d);
            str = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
            c0607d = mo3336b;
            if (i10 == 2) {
                mo3336b.m3288X(true);
                str = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
                c0607d = mo3336b;
            }
            AbstractC0439y m2216m = fragmentManager.m2216m();
            m2216m.m2364e(c0607d, str);
            m2216m.mo1965k();
            return true;
        }
        if (fragmentManager.m2206i0("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            str2 = "showDialog(): Route controller dialog already showing!";
            Log.w("MediaRouteButton", str2);
            return false;
        }
        C0607d m3337c = this.f3836e.m3337c();
        m3337c.m3333T(this.f3835d);
        str = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
        c0607d = m3337c;
        if (i10 == 2) {
            m3337c.m3334U(true);
            c0607d = m3337c;
            str = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
        }
        AbstractC0439y m2216m2 = fragmentManager.m2216m();
        m2216m2.m2364e(c0607d, str);
        m2216m2.mo1965k();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0 == false) goto L9;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3243f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = r0
            r0 = r4
            r1 = 31
            if (r0 < r1) goto L18
            r0 = r3
            boolean r0 = r0.m3245h()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L28
            goto L1e
        L18:
            r0 = r4
            r1 = 30
            if (r0 != r1) goto L26
        L1e:
            r0 = r3
            boolean r0 = r0.m3244g()
            r5 = r0
            goto L28
        L26:
            r0 = 0
            r5 = r0
        L28:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.m3243f():boolean");
    }

    /* renamed from: g */
    public final boolean m3244g() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", this.f3833b.m28877k());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    public C0608e getDialogFactory() {
        return this.f3836e;
    }

    public C5900i getRouteSelector() {
        return this.f3835d;
    }

    /* renamed from: h */
    public final boolean m3245h() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent putExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName()).putExtra("key_media_session_token", this.f3833b.m28877k());
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.sendBroadcast(putExtra);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m3246i() {
        int i10 = this.f3844m;
        String string = getContext().getString(i10 != 1 ? i10 != 2 ? C5654j.f31882c : C5654j.f31880a : C5654j.f31881b);
        setContentDescription(string);
        if (!this.f3849r || TextUtils.isEmpty(string)) {
            string = null;
        }
        C0346q1.m1563a(this, string);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3841j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f3837f = true;
        if (!this.f3835d.m28857f()) {
            this.f3833b.m28871a(this.f3835d, this.f3834c);
        }
        m3239b();
        f3829s.m3248b(this);
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f3833b != null && !this.f3839h) {
            int i11 = this.f3844m;
            if (i11 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, f3832v);
            } else if (i11 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, f3831u);
            }
            return onCreateDrawableState;
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f3837f = false;
            if (!this.f3835d.m28857f()) {
                this.f3833b.m28882s(this.f3834c);
            }
            f3829s.m3249c(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3841j != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int intrinsicWidth = this.f3841j.getIntrinsicWidth();
            int intrinsicHeight = this.f3841j.getIntrinsicHeight();
            int i10 = paddingLeft + ((((width - paddingRight) - paddingLeft) - intrinsicWidth) / 2);
            int i11 = paddingTop + ((((height - paddingBottom) - paddingTop) - intrinsicHeight) / 2);
            this.f3841j.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f3841j.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int min;
        int min2;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i12 = this.f3846o;
        Drawable drawable = this.f3841j;
        int max = Math.max(i12, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i13 = this.f3847p;
        Drawable drawable2 = this.f3841j;
        int i14 = 0;
        if (drawable2 != null) {
            i14 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i13, i14);
        if (mode != Integer.MIN_VALUE) {
            min = size;
            if (mode != 1073741824) {
                min = max;
            }
        } else {
            min = Math.min(size, max);
        }
        if (mode2 != Integer.MIN_VALUE) {
            min2 = size2;
            if (mode2 != 1073741824) {
                min2 = max2;
            }
        } else {
            min2 = Math.min(size2, max2);
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        boolean z10 = false;
        if (!performClick) {
            playSoundEffect(0);
        }
        m3238a();
        if (m3241d() || performClick) {
            z10 = true;
        }
        return z10;
    }

    public void setAlwaysVisible(boolean z10) {
        if (z10 != this.f3848q) {
            this.f3848q = z10;
            m3240c();
            m3239b();
        }
    }

    public void setCheatSheetEnabled(boolean z10) {
        if (z10 != this.f3849r) {
            this.f3849r = z10;
            m3246i();
        }
    }

    public void setDialogFactory(C0608e c0608e) {
        if (c0608e == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.f3836e = c0608e;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.f3842k = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        AsyncTaskC0601c asyncTaskC0601c = this.f3840i;
        if (asyncTaskC0601c != null) {
            asyncTaskC0601c.cancel(false);
        }
        Drawable drawable2 = this.f3841j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3841j);
        }
        Drawable drawable3 = drawable;
        if (drawable != null) {
            drawable3 = drawable;
            if (this.f3845n != null) {
                drawable3 = C4917c.m24854r(drawable.mutate());
                C4917c.m24851o(drawable3, this.f3845n);
            }
            drawable3.setCallback(this);
            drawable3.setState(getDrawableState());
            drawable3.setVisible(getVisibility() == 0, false);
        }
        this.f3841j = drawable3;
        refreshDrawableState();
    }

    public void setRouteSelector(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f3835d.equals(c5900i)) {
            return;
        }
        if (this.f3837f) {
            if (!this.f3835d.m28857f()) {
                this.f3833b.m28882s(this.f3834c);
            }
            if (!c5900i.m28857f()) {
                this.f3833b.m28871a(c5900i, this.f3834c);
            }
        }
        this.f3835d = c5900i;
        m3239b();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        this.f3838g = i10;
        m3240c();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3841j;
    }
}
