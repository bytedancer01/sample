package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p235o0.C6824g0;
import p235o0.C6858v0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/r1.class
 */
/* renamed from: androidx.appcompat.widget.r1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r1.class */
public class ViewOnLongClickListenerC0349r1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static ViewOnLongClickListenerC0349r1 f2231k;

    /* renamed from: l */
    public static ViewOnLongClickListenerC0349r1 f2232l;

    /* renamed from: b */
    public final View f2233b;

    /* renamed from: c */
    public final CharSequence f2234c;

    /* renamed from: d */
    public final int f2235d;

    /* renamed from: e */
    public final Runnable f2236e = new a(this);

    /* renamed from: f */
    public final Runnable f2237f = new b(this);

    /* renamed from: g */
    public int f2238g;

    /* renamed from: h */
    public int f2239h;

    /* renamed from: i */
    public C0352s1 f2240i;

    /* renamed from: j */
    public boolean f2241j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/r1$a.class
     */
    /* renamed from: androidx.appcompat.widget.r1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r1$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final ViewOnLongClickListenerC0349r1 f2242b;

        public a(ViewOnLongClickListenerC0349r1 viewOnLongClickListenerC0349r1) {
            this.f2242b = viewOnLongClickListenerC0349r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2242b.m1584g(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/r1$b.class
     */
    /* renamed from: androidx.appcompat.widget.r1$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r1$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final ViewOnLongClickListenerC0349r1 f2243b;

        public b(ViewOnLongClickListenerC0349r1 viewOnLongClickListenerC0349r1) {
            this.f2243b = viewOnLongClickListenerC0349r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2243b.m1582c();
        }
    }

    public ViewOnLongClickListenerC0349r1(View view, CharSequence charSequence) {
        this.f2233b = view;
        this.f2234c = charSequence;
        this.f2235d = C6858v0.m31659c(ViewConfiguration.get(view.getContext()));
        m1581b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: e */
    public static void m1578e(ViewOnLongClickListenerC0349r1 viewOnLongClickListenerC0349r1) {
        ViewOnLongClickListenerC0349r1 viewOnLongClickListenerC0349r12 = f2231k;
        if (viewOnLongClickListenerC0349r12 != null) {
            viewOnLongClickListenerC0349r12.m1580a();
        }
        f2231k = viewOnLongClickListenerC0349r1;
        if (viewOnLongClickListenerC0349r1 != null) {
            viewOnLongClickListenerC0349r1.m1583d();
        }
    }

    /* renamed from: f */
    public static void m1579f(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0349r1 viewOnLongClickListenerC0349r1 = f2231k;
        if (viewOnLongClickListenerC0349r1 != null && viewOnLongClickListenerC0349r1.f2233b == view) {
            m1578e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0349r1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0349r1 viewOnLongClickListenerC0349r12 = f2232l;
        if (viewOnLongClickListenerC0349r12 != null && viewOnLongClickListenerC0349r12.f2233b == view) {
            viewOnLongClickListenerC0349r12.m1582c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: a */
    public final void m1580a() {
        this.f2233b.removeCallbacks(this.f2236e);
    }

    /* renamed from: b */
    public final void m1581b() {
        this.f2238g = Integer.MAX_VALUE;
        this.f2239h = Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public void m1582c() {
        if (f2232l == this) {
            f2232l = null;
            C0352s1 c0352s1 = this.f2240i;
            if (c0352s1 != null) {
                c0352s1.m1607c();
                this.f2240i = null;
                m1581b();
                this.f2233b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2231k == this) {
            m1578e(null);
        }
        this.f2233b.removeCallbacks(this.f2237f);
    }

    /* renamed from: d */
    public final void m1583d() {
        this.f2233b.postDelayed(this.f2236e, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    public void m1584g(boolean z10) {
        long longPressTimeout;
        if (C6824g0.m31501T(this.f2233b)) {
            m1578e(null);
            ViewOnLongClickListenerC0349r1 viewOnLongClickListenerC0349r1 = f2232l;
            if (viewOnLongClickListenerC0349r1 != null) {
                viewOnLongClickListenerC0349r1.m1582c();
            }
            f2232l = this;
            this.f2241j = z10;
            C0352s1 c0352s1 = new C0352s1(this.f2233b.getContext());
            this.f2240i = c0352s1;
            c0352s1.m1609e(this.f2233b, this.f2238g, this.f2239h, this.f2241j, this.f2234c);
            this.f2233b.addOnAttachStateChangeListener(this);
            if (this.f2241j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((C6824g0.m31495N(this.f2233b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f2233b.removeCallbacks(this.f2237f);
            this.f2233b.postDelayed(this.f2237f, longPressTimeout);
        }
    }

    /* renamed from: h */
    public final boolean m1585h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f2238g) <= this.f2235d && Math.abs(y10 - this.f2239h) <= this.f2235d) {
            return false;
        }
        this.f2238g = x10;
        this.f2239h = y10;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2240i != null && this.f2241j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2233b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action != 10) {
                return false;
            }
            m1581b();
            m1582c();
            return false;
        }
        if (!this.f2233b.isEnabled() || this.f2240i != null || !m1585h(motionEvent)) {
            return false;
        }
        m1578e(this);
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2238g = view.getWidth() / 2;
        this.f2239h = view.getHeight() / 2;
        m1584g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1582c();
    }
}
