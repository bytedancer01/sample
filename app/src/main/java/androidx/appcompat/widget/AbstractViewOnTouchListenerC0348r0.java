package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p155j.InterfaceC5274f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/r0.class
 */
/* renamed from: androidx.appcompat.widget.r0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r0.class */
public abstract class AbstractViewOnTouchListenerC0348r0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f2220b;

    /* renamed from: c */
    public final int f2221c;

    /* renamed from: d */
    public final int f2222d;

    /* renamed from: e */
    public final View f2223e;

    /* renamed from: f */
    public Runnable f2224f;

    /* renamed from: g */
    public Runnable f2225g;

    /* renamed from: h */
    public boolean f2226h;

    /* renamed from: i */
    public int f2227i;

    /* renamed from: j */
    public final int[] f2228j = new int[2];

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/r0$a.class
     */
    /* renamed from: androidx.appcompat.widget.r0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r0$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final AbstractViewOnTouchListenerC0348r0 f2229b;

        public a(AbstractViewOnTouchListenerC0348r0 abstractViewOnTouchListenerC0348r0) {
            this.f2229b = abstractViewOnTouchListenerC0348r0;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = this.f2229b.f2223e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/r0$b.class
     */
    /* renamed from: androidx.appcompat.widget.r0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r0$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final AbstractViewOnTouchListenerC0348r0 f2230b;

        public b(AbstractViewOnTouchListenerC0348r0 abstractViewOnTouchListenerC0348r0) {
            this.f2230b = abstractViewOnTouchListenerC0348r0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2230b.m1573e();
        }
    }

    public AbstractViewOnTouchListenerC0348r0(View view) {
        this.f2223e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2220b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2221c = tapTimeout;
        this.f2222d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m1571h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    /* renamed from: a */
    public final void m1572a() {
        Runnable runnable = this.f2225g;
        if (runnable != null) {
            this.f2223e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2224f;
        if (runnable2 != null) {
            this.f2223e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC5274f mo890b();

    /* renamed from: c */
    public abstract boolean mo891c();

    /* renamed from: d */
    public boolean mo1272d() {
        InterfaceC5274f mo890b = mo890b();
        if (mo890b == null || !mo890b.mo922a()) {
            return true;
        }
        mo890b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void m1573e() {
        m1572a();
        View view = this.f2223e;
        if (view.isEnabled() && !view.isLongClickable() && mo891c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2226h = true;
        }
    }

    /* renamed from: f */
    public final boolean m1574f(MotionEvent motionEvent) {
        View view = this.f2223e;
        InterfaceC5274f mo890b = mo890b();
        boolean z10 = false;
        if (mo890b != null) {
            if (mo890b.mo922a()) {
                C0342p0 c0342p0 = (C0342p0) mo890b.mo927o();
                z10 = false;
                if (c0342p0 != null) {
                    if (c0342p0.isShown()) {
                        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                        m1576i(view, obtainNoHistory);
                        m1577j(c0342p0, obtainNoHistory);
                        boolean mo1251e = c0342p0.mo1251e(obtainNoHistory, this.f2227i);
                        obtainNoHistory.recycle();
                        int actionMasked = motionEvent.getActionMasked();
                        boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                        z10 = false;
                        if (mo1251e) {
                            z10 = false;
                            if (z11) {
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: g */
    public final boolean m1575g(MotionEvent motionEvent) {
        View view = this.f2223e;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2227i = motionEvent.getPointerId(0);
            if (this.f2224f == null) {
                this.f2224f = new a(this);
            }
            view.postDelayed(this.f2224f, this.f2221c);
            if (this.f2225g == null) {
                this.f2225g = new b(this);
            }
            view.postDelayed(this.f2225g, this.f2222d);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2227i);
                if (findPointerIndex < 0 || m1571h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f2220b)) {
                    return false;
                }
                m1572a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        m1572a();
        return false;
    }

    /* renamed from: i */
    public final boolean m1576i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f2228j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean m1577j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f2228j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f2226h;
        if (z11) {
            z10 = m1574f(motionEvent) || !mo1272d();
        } else {
            boolean z12 = m1575g(motionEvent) && mo891c();
            z10 = z12;
            if (z12) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2223e.onTouchEvent(obtain);
                obtain.recycle();
                z10 = z12;
            }
        }
        this.f2226h = z10;
        boolean z13 = true;
        if (!z10) {
            z13 = z11;
        }
        return z13;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f2226h = false;
        this.f2227i = -1;
        Runnable runnable = this.f2224f;
        if (runnable != null) {
            this.f2223e.removeCallbacks(runnable);
        }
    }
}
