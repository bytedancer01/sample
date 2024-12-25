package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p018b0.C0776a;
import p235o0.C6805a;
import p235o0.C6824g0;
import p235o0.C6851s;
import p235o0.C6857v;
import p235o0.InterfaceC6849r;
import p235o0.InterfaceC6855u;
import p261p0.C7535k;
import p261p0.C7537m;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/core/widget/NestedScrollView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/core/widget/NestedScrollView.class */
public class NestedScrollView extends FrameLayout implements InterfaceC6855u, InterfaceC6849r {

    /* renamed from: B */
    public static final C0391a f2669B = new C0391a();

    /* renamed from: C */
    public static final int[] f2670C = {R.attr.fillViewport};

    /* renamed from: A */
    public InterfaceC0392b f2671A;

    /* renamed from: b */
    public long f2672b;

    /* renamed from: c */
    public final Rect f2673c;

    /* renamed from: d */
    public OverScroller f2674d;

    /* renamed from: e */
    public EdgeEffect f2675e;

    /* renamed from: f */
    public EdgeEffect f2676f;

    /* renamed from: g */
    public int f2677g;

    /* renamed from: h */
    public boolean f2678h;

    /* renamed from: i */
    public boolean f2679i;

    /* renamed from: j */
    public View f2680j;

    /* renamed from: k */
    public boolean f2681k;

    /* renamed from: l */
    public VelocityTracker f2682l;

    /* renamed from: m */
    public boolean f2683m;

    /* renamed from: n */
    public boolean f2684n;

    /* renamed from: o */
    public int f2685o;

    /* renamed from: p */
    public int f2686p;

    /* renamed from: q */
    public int f2687q;

    /* renamed from: r */
    public int f2688r;

    /* renamed from: s */
    public final int[] f2689s;

    /* renamed from: t */
    public final int[] f2690t;

    /* renamed from: u */
    public int f2691u;

    /* renamed from: v */
    public int f2692v;

    /* renamed from: w */
    public C0393c f2693w;

    /* renamed from: x */
    public final C6857v f2694x;

    /* renamed from: y */
    public final C6851s f2695y;

    /* renamed from: z */
    public float f2696z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/core/widget/NestedScrollView$a.class
     */
    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/core/widget/NestedScrollView$a.class */
    public static class C0391a extends C6805a {
        @Override // p235o0.C6805a
        /* renamed from: f */
        public void mo1935f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1935f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C7537m.m32261a(accessibilityEvent, nestedScrollView.getScrollX());
            C7537m.m32262b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p235o0.C6805a
        /* renamed from: g */
        public void mo1936g(View view, C7535k c7535k) {
            int scrollRange;
            super.mo1936g(view, c7535k);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c7535k.m32199X(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c7535k.m32231p0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c7535k.m32204b(C7535k.a.f36353r);
                c7535k.m32204b(C7535k.a.f36325C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c7535k.m32204b(C7535k.a.f36352q);
                c7535k.m32204b(C7535k.a.f36327E);
            }
        }

        @Override // p235o0.C6805a
        /* renamed from: j */
        public boolean mo1937j(View view, int i10, Bundle bundle) {
            if (super.mo1937j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int height = nestedScrollView.getHeight();
                    int paddingBottom = nestedScrollView.getPaddingBottom();
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m1913O(0, max, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int height2 = nestedScrollView.getHeight();
            int paddingBottom2 = nestedScrollView.getPaddingBottom();
            int min = Math.min(nestedScrollView.getScrollY() + ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m1913O(0, min, true);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/core/widget/NestedScrollView$b.class
     */
    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: combined.jar:classes1.jar:androidx/core/widget/NestedScrollView$b.class */
    public interface InterfaceC0392b {
        /* renamed from: a */
        void mo846a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/core/widget/NestedScrollView$c.class
     */
    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: combined.jar:classes1.jar:androidx/core/widget/NestedScrollView$c.class */
    public static class C0393c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0393c> CREATOR = new a();

        /* renamed from: b */
        public int f2697b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/core/widget/NestedScrollView$c$a.class
         */
        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        /* loaded from: combined.jar:classes1.jar:androidx/core/widget/NestedScrollView$c$a.class */
        public class a implements Parcelable.Creator<C0393c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0393c createFromParcel(Parcel parcel) {
                return new C0393c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0393c[] newArray(int i10) {
                return new C0393c[i10];
            }
        }

        public C0393c(Parcel parcel) {
            super(parcel);
            this.f2697b = parcel.readInt();
        }

        public C0393c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2697b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2697b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0776a.f5304b);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2673c = new Rect();
        this.f2678h = true;
        this.f2679i = false;
        this.f2680j = null;
        this.f2681k = false;
        this.f2684n = true;
        this.f2688r = -1;
        this.f2689s = new int[2];
        this.f2690t = new int[2];
        m1932x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2670C, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2694x = new C6857v(this);
        this.f2695y = new C6851s(this);
        setNestedScrollingEnabled(true);
        C6824g0.m31539p0(this, f2669B);
    }

    /* renamed from: A */
    public static boolean m1898A(View view, View view2) {
        boolean z10 = true;
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m1898A((View) parent, view2)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: e */
    public static int m1899e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2696z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2696z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2696z;
    }

    /* renamed from: B */
    public final boolean m1900B(View view, int i10, int i11) {
        view.getDrawingRect(this.f2673c);
        offsetDescendantRectToMyCoords(view, this.f2673c);
        return this.f2673c.bottom + i10 >= getScrollY() && this.f2673c.top - i10 <= getScrollY() + i11;
    }

    /* renamed from: C */
    public final void m1901C(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2695y.m31636e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    /* renamed from: D */
    public final void m1902D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2688r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2677g = (int) motionEvent.getY(i10);
            this.f2688r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2682l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x011c, code lost:
    
        if (r21 != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m1903E(int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1903E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean m1904F(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2673c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2673c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2673c.top = getScrollY() - height;
            Rect rect2 = this.f2673c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2673c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return m1907I(i10, i11, i12);
    }

    /* renamed from: G */
    public final void m1905G() {
        VelocityTracker velocityTracker = this.f2682l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2682l = null;
        }
    }

    /* renamed from: H */
    public final void m1906H(boolean z10) {
        if (z10) {
            m1914P(2, 1);
        } else {
            m1915Q(1);
        }
        this.f2692v = getScrollY();
        C6824g0.m31521g0(this);
    }

    /* renamed from: I */
    public final boolean m1907I(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        View m1926r = m1926r(z11, i11, i12);
        View view = m1926r;
        if (m1926r == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            m1922i(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    /* renamed from: J */
    public final void m1908J(View view) {
        view.getDrawingRect(this.f2673c);
        offsetDescendantRectToMyCoords(view, this.f2673c);
        int m1919f = m1919f(this.f2673c);
        if (m1919f != 0) {
            scrollBy(0, m1919f);
        }
    }

    /* renamed from: K */
    public final boolean m1909K(Rect rect, boolean z10) {
        int m1919f = m1919f(rect);
        boolean z11 = m1919f != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, m1919f);
            } else {
                m1910L(0, m1919f);
            }
        }
        return z11;
    }

    /* renamed from: L */
    public final void m1910L(int i10, int i11) {
        m1911M(i10, i11, 250, false);
    }

    /* renamed from: M */
    public final void m1911M(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2672b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i13 = layoutParams.topMargin;
            int i14 = layoutParams.bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            this.f2674d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((height + i13) + i14) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, i12);
            m1906H(z10);
        } else {
            if (!this.f2674d.isFinished()) {
                m1916a();
            }
            scrollBy(i10, i11);
        }
        this.f2672b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: N */
    public void m1912N(int i10, int i11, int i12, boolean z10) {
        m1911M(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* renamed from: O */
    public void m1913O(int i10, int i11, boolean z10) {
        m1912N(i10, i11, 250, z10);
    }

    /* renamed from: P */
    public boolean m1914P(int i10, int i11) {
        return this.f2695y.m31647p(i10, i11);
    }

    /* renamed from: Q */
    public void m1915Q(int i10) {
        this.f2695y.m31649r(i10);
    }

    /* renamed from: a */
    public final void m1916a() {
        this.f2674d.abortAnimation();
        m1915Q(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: b */
    public void mo1065b(View view, View view2, int i10, int i11) {
        this.f2694x.m31655c(view, view2, i10, i11);
        m1914P(2, i11);
    }

    /* renamed from: c */
    public boolean m1917c(int i10) {
        int i11;
        View findFocus = findFocus();
        View view = findFocus;
        if (findFocus == this) {
            view = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1900B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 != 33 || getScrollY() >= maxScrollAmount) {
                i11 = maxScrollAmount;
                if (i10 == 130) {
                    i11 = maxScrollAmount;
                    if (getChildCount() > 0) {
                        View childAt = getChildAt(0);
                        i11 = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
                    }
                }
            } else {
                i11 = getScrollY();
            }
            if (i11 == 0) {
                return false;
            }
            if (i10 != 130) {
                i11 = -i11;
            }
            m1922i(i11);
        } else {
            findNextFocus.getDrawingRect(this.f2673c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2673c);
            m1922i(m1919f(this.f2673c));
            findNextFocus.requestFocus(i10);
        }
        if (view == null || !view.isFocused() || !m1934z(view)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        if (r0 > 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void computeScroll() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int i10;
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            i10 = bottom - scrollY;
        } else {
            i10 = bottom;
            if (scrollY > max) {
                i10 = bottom + (scrollY - max);
            }
        }
        return i10;
    }

    /* renamed from: d */
    public final boolean m1918d() {
        boolean z10 = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            z10 = false;
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1925q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2695y.m31632a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2695y.m31633b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return m1920g(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2695y.m31637f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f2675e != null) {
            int scrollY = getScrollY();
            if (!this.f2675e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i10 = getPaddingLeft() + 0;
                } else {
                    i10 = 0;
                }
                int i11 = height;
                int i12 = min;
                if (getClipToPadding()) {
                    i11 = height - (getPaddingTop() + getPaddingBottom());
                    i12 = min + getPaddingTop();
                }
                canvas.translate(i10, i12);
                this.f2675e.setSize(width, i11);
                if (this.f2675e.draw(canvas)) {
                    C6824g0.m31521g0(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f2676f.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i13 = 0;
            int i14 = width2;
            if (getClipToPadding()) {
                i14 = width2 - (getPaddingLeft() + getPaddingRight());
                i13 = 0 + getPaddingLeft();
            }
            int i15 = max;
            int i16 = height2;
            if (getClipToPadding()) {
                i16 = height2 - (getPaddingTop() + getPaddingBottom());
                i15 = max - getPaddingBottom();
            }
            canvas.translate(i13 - i14, i15);
            canvas.rotate(180.0f, i14, 0.0f);
            this.f2676f.setSize(i14, i16);
            if (this.f2676f.draw(canvas)) {
                C6824g0.m31521g0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: f */
    public int m1919f(Rect rect) {
        int i10;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int i12 = scrollY;
        if (rect.top > 0) {
            i12 = scrollY + verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i11 - verticalFadingEdgeLength : i11;
        int i14 = rect.bottom;
        if (i14 <= i13 || rect.top <= i12) {
            i10 = 0;
            if (rect.top < i12) {
                i10 = 0;
                if (i14 < i13) {
                    i10 = Math.max(rect.height() > height ? 0 - (i13 - rect.bottom) : 0 - (i12 - rect.top), -getScrollY());
                }
            }
        } else {
            i10 = Math.min((rect.height() > height ? rect.top - i12 : rect.bottom - i13) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i11);
        }
        return i10;
    }

    /* renamed from: g */
    public boolean m1920g(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f2695y.m31635d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2694x.m31653a();
    }

    public int getScrollRange() {
        int i10 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            i10 = Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return i10;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void m1921h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f2695y.m31636e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1929u(0);
    }

    /* renamed from: i */
    public final void m1922i(int i10) {
        if (i10 != 0) {
            if (this.f2684n) {
                m1910L(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f2695y.m31643l();
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: j */
    public void mo1073j(View view, int i10) {
        this.f2694x.m31656d(view, i10);
        m1915Q(i10);
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: k */
    public void mo1074k(View view, int i10, int i11, int[] iArr, int i12) {
        m1920g(i10, i11, iArr, null, i12);
    }

    /* renamed from: l */
    public final void m1923l() {
        this.f2681k = false;
        m1905G();
        m1915Q(0);
        EdgeEffect edgeEffect = this.f2675e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2676f.onRelease();
        }
    }

    @Override // p235o0.InterfaceC6855u
    /* renamed from: m */
    public void mo1076m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m1901C(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: n */
    public void mo1077n(View view, int i10, int i11, int i12, int i13, int i14) {
        m1901C(i13, i14, null);
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: o */
    public boolean mo1078o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2679i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || this.f2681k) {
            return false;
        }
        float axisValue = motionEvent.getAxisValue(9);
        if (axisValue == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
        int scrollRange = getScrollRange();
        int scrollY = getScrollY();
        int i10 = scrollY - verticalScrollFactorCompat;
        if (i10 < 0) {
            scrollRange = 0;
        } else if (i10 <= scrollRange) {
            scrollRange = i10;
        }
        if (scrollRange == scrollY) {
            return false;
        }
        super.scrollTo(getScrollX(), scrollRange);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2681k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f2688r;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f2677g) > this.f2685o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2681k = true;
                                this.f2677g = y10;
                                m1933y();
                                this.f2682l.addMovement(motionEvent);
                                this.f2691u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        m1902D(motionEvent);
                    }
                }
            }
            this.f2681k = false;
            this.f2688r = -1;
            m1905G();
            if (this.f2674d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C6824g0.m31521g0(this);
            }
            m1915Q(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (m1930v((int) motionEvent.getX(), y11)) {
                this.f2677g = y11;
                this.f2688r = motionEvent.getPointerId(0);
                m1931w();
                this.f2682l.addMovement(motionEvent);
                this.f2674d.computeScrollOffset();
                this.f2681k = !this.f2674d.isFinished();
                m1914P(2, 0);
            } else {
                this.f2681k = false;
                m1905G();
            }
        }
        return this.f2681k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f2678h = false;
        View view = this.f2680j;
        if (view != null && m1898A(view, this)) {
            m1908J(this.f2680j);
        }
        this.f2680j = null;
        if (!this.f2679i) {
            if (this.f2693w != null) {
                scrollTo(getScrollX(), this.f2693w.f2697b);
                this.f2693w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int m1899e = m1899e(scrollY, ((i13 - i11) - paddingTop) - paddingBottom, i14);
            if (m1899e != scrollY) {
                scrollTo(getScrollX(), m1899e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2679i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2683m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        m1927s((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo1074k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m1901C(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1065b(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        if (i10 == 2) {
            i11 = 130;
        } else {
            i11 = i10;
            if (i10 == 1) {
                i11 = 33;
            }
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i11) : focusFinder.findNextFocusFromRect(this, rect, i11);
        if (findNextFocus == null || m1934z(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i11, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0393c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0393c c0393c = (C0393c) parcelable;
        super.onRestoreInstanceState(c0393c.getSuperState());
        this.f2693w = c0393c;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0393c c0393c = new C0393c(super.onSaveInstanceState());
        c0393c.f2697b = getScrollY();
        return c0393c;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        InterfaceC0392b interfaceC0392b = this.f2671A;
        if (interfaceC0392b != null) {
            interfaceC0392b.mo846a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1900B(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f2673c);
        offsetDescendantRectToMyCoords(findFocus, this.f2673c);
        m1922i(m1919f(this.f2673c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1078o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo1073j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r11.f2674d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        p235o0.C6824g0.m31521g0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0328, code lost:
    
        if (r11.f2674d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m1924p() {
        if (getOverScrollMode() == 2) {
            this.f2675e = null;
            this.f2676f = null;
        } else if (this.f2675e == null) {
            Context context = getContext();
            this.f2675e = new EdgeEffect(context);
            this.f2676f = new EdgeEffect(context);
        }
    }

    /* renamed from: q */
    public boolean m1925q(KeyEvent keyEvent) {
        this.f2673c.setEmpty();
        int i10 = 130;
        if (m1918d()) {
            boolean z10 = false;
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    z10 = !keyEvent.isAltPressed() ? m1917c(33) : m1928t(33);
                } else if (keyCode == 20) {
                    z10 = !keyEvent.isAltPressed() ? m1917c(130) : m1928t(130);
                } else if (keyCode != 62) {
                    z10 = false;
                } else {
                    if (keyEvent.isShiftPressed()) {
                        i10 = 33;
                    }
                    m1904F(i10);
                    z10 = false;
                }
            }
            return z10;
        }
        boolean z11 = false;
        if (isFocused()) {
            z11 = false;
            if (keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                View view = findFocus;
                if (findFocus == this) {
                    view = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, 130);
                z11 = false;
                if (findNextFocus != null) {
                    z11 = false;
                    if (findNextFocus != this) {
                        z11 = false;
                        if (findNextFocus.requestFocus(130)) {
                            z11 = true;
                        }
                    }
                }
            }
        }
        return z11;
    }

    /* renamed from: r */
    public final View m1926r(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            boolean z12 = z11;
            if (i12 >= size) {
                return view;
            }
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            View view3 = view;
            boolean z13 = z12;
            if (i10 < bottom) {
                view3 = view;
                z13 = z12;
                if (top < i11) {
                    boolean z14 = i10 < top && bottom < i11;
                    if (view == null) {
                        view3 = view2;
                        z13 = z14;
                    } else {
                        boolean z15 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                        if (z12) {
                            view3 = view;
                            z13 = z12;
                            if (z14) {
                                view3 = view;
                                z13 = z12;
                                if (!z15) {
                                }
                                view3 = view2;
                                z13 = z12;
                            }
                        } else if (z14) {
                            view3 = view2;
                            z13 = true;
                        } else {
                            view3 = view;
                            z13 = z12;
                            if (!z15) {
                            }
                            view3 = view2;
                            z13 = z12;
                        }
                    }
                }
            }
            i12++;
            view = view3;
            z11 = z13;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2678h) {
            this.f2680j = view2;
        } else {
            m1908J(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1909K(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            m1905G();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2678h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void m1927s(int i10) {
        if (getChildCount() > 0) {
            this.f2674d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, Integer.MAX_VALUE, 0, 0);
            m1906H(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i12 = layoutParams.leftMargin;
            int i13 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i14 = layoutParams.topMargin;
            int i15 = layoutParams.bottomMargin;
            int m1899e = m1899e(i10, (width - paddingLeft) - paddingRight, width2 + i12 + i13);
            int m1899e2 = m1899e(i11, (height - paddingTop) - paddingBottom, height2 + i14 + i15);
            if (m1899e == getScrollX() && m1899e2 == getScrollY()) {
                return;
            }
            super.scrollTo(m1899e, m1899e2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2683m) {
            this.f2683m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2695y.m31644m(z10);
    }

    public void setOnScrollChangeListener(InterfaceC0392b interfaceC0392b) {
        this.f2671A = interfaceC0392b;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2684n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return m1914P(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m1915Q(0);
    }

    /* renamed from: t */
    public boolean m1928t(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2673c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2673c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2673c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2673c;
        return m1907I(i10, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean m1929u(int i10) {
        return this.f2695y.m31642k(i10);
    }

    /* renamed from: v */
    public final boolean m1930v(int i10, int i11) {
        boolean z10 = false;
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            z10 = false;
            if (i11 >= childAt.getTop() - scrollY) {
                z10 = false;
                if (i11 < childAt.getBottom() - scrollY) {
                    z10 = false;
                    if (i10 >= childAt.getLeft()) {
                        z10 = false;
                        if (i10 < childAt.getRight()) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: w */
    public final void m1931w() {
        VelocityTracker velocityTracker = this.f2682l;
        if (velocityTracker == null) {
            this.f2682l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    public final void m1932x() {
        this.f2674d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2685o = viewConfiguration.getScaledTouchSlop();
        this.f2686p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2687q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    public final void m1933y() {
        if (this.f2682l == null) {
            this.f2682l = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    public final boolean m1934z(View view) {
        return !m1900B(view, 0, getHeight());
    }
}
