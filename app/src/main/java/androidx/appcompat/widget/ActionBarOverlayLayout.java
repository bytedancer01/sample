package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0254i;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0920a;
import p029c.C0925f;
import p087f0.C4739b;
import p235o0.C6813c1;
import p235o0.C6824g0;
import p235o0.C6857v;
import p235o0.InterfaceC6853t;
import p235o0.InterfaceC6855u;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout.class
 */
@SuppressLint({"UnknownNullness"})
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout.class */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0330l0, InterfaceC6853t, InterfaceC6855u {

    /* renamed from: G */
    public static final int[] f1705G = {C0920a.f6107b, R.attr.windowContentOverlay};

    /* renamed from: A */
    public OverScroller f1706A;

    /* renamed from: B */
    public ViewPropertyAnimator f1707B;

    /* renamed from: C */
    public final AnimatorListenerAdapter f1708C;

    /* renamed from: D */
    public final Runnable f1709D;

    /* renamed from: E */
    public final Runnable f1710E;

    /* renamed from: F */
    public final C6857v f1711F;

    /* renamed from: b */
    public int f1712b;

    /* renamed from: c */
    public int f1713c;

    /* renamed from: d */
    public ContentFrameLayout f1714d;

    /* renamed from: e */
    public ActionBarContainer f1715e;

    /* renamed from: f */
    public InterfaceC0333m0 f1716f;

    /* renamed from: g */
    public Drawable f1717g;

    /* renamed from: h */
    public boolean f1718h;

    /* renamed from: i */
    public boolean f1719i;

    /* renamed from: j */
    public boolean f1720j;

    /* renamed from: k */
    public boolean f1721k;

    /* renamed from: l */
    public boolean f1722l;

    /* renamed from: m */
    public int f1723m;

    /* renamed from: n */
    public int f1724n;

    /* renamed from: o */
    public final Rect f1725o;

    /* renamed from: p */
    public final Rect f1726p;

    /* renamed from: q */
    public final Rect f1727q;

    /* renamed from: r */
    public final Rect f1728r;

    /* renamed from: s */
    public final Rect f1729s;

    /* renamed from: t */
    public final Rect f1730t;

    /* renamed from: u */
    public final Rect f1731u;

    /* renamed from: v */
    public C6813c1 f1732v;

    /* renamed from: w */
    public C6813c1 f1733w;

    /* renamed from: x */
    public C6813c1 f1734x;

    /* renamed from: y */
    public C6813c1 f1735y;

    /* renamed from: z */
    public InterfaceC0262d f1736z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$a.class
     */
    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$a.class */
    public class C0259a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final ActionBarOverlayLayout f1737b;

        public C0259a(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1737b = actionBarOverlayLayout;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1737b;
            actionBarOverlayLayout.f1707B = null;
            actionBarOverlayLayout.f1722l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1737b;
            actionBarOverlayLayout.f1707B = null;
            actionBarOverlayLayout.f1722l = false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$b.class
     */
    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$b.class */
    public class RunnableC0260b implements Runnable {

        /* renamed from: b */
        public final ActionBarOverlayLayout f1738b;

        public RunnableC0260b(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1738b = actionBarOverlayLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1738b.m1084u();
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1738b;
            actionBarOverlayLayout.f1707B = actionBarOverlayLayout.f1715e.animate().translationY(0.0f).setListener(this.f1738b.f1708C);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$c.class
     */
    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$c.class */
    public class RunnableC0261c implements Runnable {

        /* renamed from: b */
        public final ActionBarOverlayLayout f1739b;

        public RunnableC0261c(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1739b = actionBarOverlayLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1739b.m1084u();
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1739b;
            actionBarOverlayLayout.f1707B = actionBarOverlayLayout.f1715e.animate().translationY(-this.f1739b.f1715e.getHeight()).setListener(this.f1739b.f1708C);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$d.class
     */
    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$d.class */
    public interface InterfaceC0262d {
        /* renamed from: a */
        void mo1090a();

        /* renamed from: b */
        void mo1091b();

        /* renamed from: c */
        void mo1092c(boolean z10);

        /* renamed from: d */
        void mo1093d();

        /* renamed from: e */
        void mo1094e();

        void onWindowVisibilityChanged(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$e.class
     */
    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarOverlayLayout$e.class */
    public static class C0263e extends ViewGroup.MarginLayoutParams {
        public C0263e(int i10, int i11) {
            super(i10, i11);
        }

        public C0263e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0263e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1713c = 0;
        this.f1725o = new Rect();
        this.f1726p = new Rect();
        this.f1727q = new Rect();
        this.f1728r = new Rect();
        this.f1729s = new Rect();
        this.f1730t = new Rect();
        this.f1731u = new Rect();
        C6813c1 c6813c1 = C6813c1.f35509b;
        this.f1732v = c6813c1;
        this.f1733w = c6813c1;
        this.f1734x = c6813c1;
        this.f1735y = c6813c1;
        this.f1708C = new C0259a(this);
        this.f1709D = new RunnableC0260b(this);
        this.f1710E = new RunnableC0261c(this);
        m1085v(context);
        this.f1711F = new C6857v(this);
    }

    /* renamed from: A */
    public final void m1062A() {
        m1084u();
        this.f1709D.run();
    }

    /* renamed from: B */
    public final boolean m1063B(float f10) {
        this.f1706A.fling(0, 0, 0, (int) f10, 0, 0, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, Integer.MAX_VALUE);
        return this.f1706A.getFinalY() > this.f1715e.getHeight();
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: a */
    public boolean mo1064a() {
        m1089z();
        return this.f1716f.mo1476a();
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: b */
    public void mo1065b(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: c */
    public boolean mo1066c() {
        m1089z();
        return this.f1716f.mo1478c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0263e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: d */
    public boolean mo1067d() {
        m1089z();
        return this.f1716f.mo1479d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1717g == null || this.f1718h) {
            return;
        }
        int bottom = this.f1715e.getVisibility() == 0 ? (int) (this.f1715e.getBottom() + this.f1715e.getTranslationY() + 0.5f) : 0;
        this.f1717g.setBounds(0, bottom, getWidth(), this.f1717g.getIntrinsicHeight() + bottom);
        this.f1717g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: e */
    public void mo1068e(Menu menu, InterfaceC0254i.a aVar) {
        m1089z();
        this.f1716f.mo1480e(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: f */
    public boolean mo1069f() {
        m1089z();
        return this.f1716f.mo1481f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: g */
    public void mo1070g() {
        m1089z();
        this.f1716f.mo1482g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0263e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1715e;
        return actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1711F.m31653a();
    }

    public CharSequence getTitle() {
        m1089z();
        return this.f1716f.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: h */
    public boolean mo1071h() {
        m1089z();
        return this.f1716f.mo1483h();
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: i */
    public void mo1072i(int i10) {
        m1089z();
        if (i10 == 2) {
            this.f1716f.mo1492q();
        } else if (i10 == 5) {
            this.f1716f.mo1501z();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: j */
    public void mo1073j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: k */
    public void mo1074k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    /* renamed from: l */
    public void mo1075l() {
        m1089z();
        this.f1716f.mo1494s();
    }

    @Override // p235o0.InterfaceC6855u
    /* renamed from: m */
    public void mo1076m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        mo1077n(view, i10, i11, i12, i13, i14);
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: n */
    public void mo1077n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: o */
    public boolean mo1078o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1089z();
        C6813c1 m31390w = C6813c1.m31390w(windowInsets, this);
        boolean m1080q = m1080q(this.f1715e, new Rect(m31390w.m31400j(), m31390w.m31402l(), m31390w.m31401k(), m31390w.m31399i()), true, true, false, true);
        C6824g0.m31520g(this, m31390w, this.f1725o);
        Rect rect = this.f1725o;
        C6813c1 m31403m = m31390w.m31403m(rect.left, rect.top, rect.right, rect.bottom);
        this.f1732v = m31403m;
        if (!this.f1733w.equals(m31403m)) {
            this.f1733w = this.f1732v;
            m1080q = true;
        }
        if (!this.f1726p.equals(this.f1725o)) {
            this.f1726p.set(this.f1725o);
            m1080q = true;
        }
        if (m1080q) {
            requestLayout();
        }
        return m31390w.m31391a().m31393c().m31392b().m31410u();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1085v(getContext());
        C6824g0.m31533m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1084u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0263e c0263e = (C0263e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c0263e).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c0263e).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        C6813c1 m31412a;
        m1089z();
        measureChildWithMargins(this.f1715e, i10, 0, i11, 0);
        C0263e c0263e = (C0263e) this.f1715e.getLayoutParams();
        int max = Math.max(0, this.f1715e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0263e).leftMargin + ((ViewGroup.MarginLayoutParams) c0263e).rightMargin);
        int max2 = Math.max(0, this.f1715e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0263e).topMargin + ((ViewGroup.MarginLayoutParams) c0263e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1715e.getMeasuredState());
        boolean z10 = (C6824g0.m31495N(this) & 256) != 0;
        if (z10) {
            int i12 = this.f1712b;
            measuredHeight = i12;
            if (this.f1720j) {
                measuredHeight = i12;
                if (this.f1715e.getTabContainer() != null) {
                    measuredHeight = i12 + this.f1712b;
                }
            }
        } else {
            measuredHeight = this.f1715e.getVisibility() != 8 ? this.f1715e.getMeasuredHeight() : 0;
        }
        this.f1727q.set(this.f1725o);
        C6813c1 c6813c1 = this.f1732v;
        this.f1734x = c6813c1;
        if (this.f1719i || z10) {
            m31412a = new C6813c1.b(this.f1734x).m31414c(C4739b.m23976b(c6813c1.m31400j(), this.f1734x.m31402l() + measuredHeight, this.f1734x.m31401k(), this.f1734x.m31399i() + 0)).m31412a();
        } else {
            Rect rect = this.f1727q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            m31412a = c6813c1.m31403m(0, measuredHeight, 0, 0);
        }
        this.f1734x = m31412a;
        m1080q(this.f1714d, this.f1727q, true, true, true, true);
        if (!this.f1735y.equals(this.f1734x)) {
            C6813c1 c6813c12 = this.f1734x;
            this.f1735y = c6813c12;
            C6824g0.m31522h(this.f1714d, c6813c12);
        }
        measureChildWithMargins(this.f1714d, i10, 0, i11, 0);
        C0263e c0263e2 = (C0263e) this.f1714d.getLayoutParams();
        int max3 = Math.max(max, this.f1714d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0263e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0263e2).rightMargin);
        int max4 = Math.max(max2, this.f1714d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0263e2).topMargin + ((ViewGroup.MarginLayoutParams) c0263e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1714d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1721k || !z10) {
            return false;
        }
        if (m1063B(f11)) {
            m1079p();
        } else {
            m1062A();
        }
        this.f1722l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1723m + i11;
        this.f1723m = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1711F.m31654b(view, view2, i10);
        this.f1723m = getActionBarHideOffset();
        m1084u();
        InterfaceC0262d interfaceC0262d = this.f1736z;
        if (interfaceC0262d != null) {
            interfaceC0262d.mo1094e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1715e.getVisibility() != 0) {
            return false;
        }
        return this.f1721k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1721k && !this.f1722l) {
            if (this.f1723m <= this.f1715e.getHeight()) {
                m1088y();
            } else {
                m1087x();
            }
        }
        InterfaceC0262d interfaceC0262d = this.f1736z;
        if (interfaceC0262d != null) {
            interfaceC0262d.mo1091b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        m1089z();
        int i11 = this.f1724n;
        this.f1724n = i10;
        boolean z10 = false;
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 256) != 0) {
            z10 = true;
        }
        InterfaceC0262d interfaceC0262d = this.f1736z;
        if (interfaceC0262d != null) {
            interfaceC0262d.mo1092c(!z10);
            if (z11 || !z10) {
                this.f1736z.mo1090a();
            } else {
                this.f1736z.mo1093d();
            }
        }
        if (((i11 ^ i10) & 256) == 0 || this.f1736z == null) {
            return;
        }
        C6824g0.m31533m0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1713c = i10;
        InterfaceC0262d interfaceC0262d = this.f1736z;
        if (interfaceC0262d != null) {
            interfaceC0262d.onWindowVisibilityChanged(i10);
        }
    }

    /* renamed from: p */
    public final void m1079p() {
        m1084u();
        this.f1710E.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1080q(android.view.View r4, android.graphics.Rect r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r3 = this;
            r0 = r4
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0263e) r0
            r4 = r0
            r0 = 1
            r13 = r0
            r0 = r6
            if (r0 == 0) goto L2e
            r0 = r4
            int r0 = r0.leftMargin
            r10 = r0
            r0 = r5
            int r0 = r0.left
            r11 = r0
            r0 = r10
            r1 = r11
            if (r0 == r1) goto L2e
            r0 = r4
            r1 = r11
            r0.leftMargin = r1
            r0 = 1
            r12 = r0
            goto L31
        L2e:
            r0 = 0
            r12 = r0
        L31:
            r0 = r12
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L57
            r0 = r4
            int r0 = r0.topMargin
            r11 = r0
            r0 = r5
            int r0 = r0.top
            r10 = r0
            r0 = r12
            r6 = r0
            r0 = r11
            r1 = r10
            if (r0 == r1) goto L57
            r0 = r4
            r1 = r10
            r0.topMargin = r1
            r0 = 1
            r6 = r0
        L57:
            r0 = r6
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L7e
            r0 = r4
            int r0 = r0.rightMargin
            r10 = r0
            r0 = r5
            int r0 = r0.right
            r11 = r0
            r0 = r6
            r7 = r0
            r0 = r10
            r1 = r11
            if (r0 == r1) goto L7e
            r0 = r4
            r1 = r11
            r0.rightMargin = r1
            r0 = 1
            r7 = r0
        L7e:
            r0 = r8
            if (r0 == 0) goto La3
            r0 = r4
            int r0 = r0.bottomMargin
            r11 = r0
            r0 = r5
            int r0 = r0.bottom
            r10 = r0
            r0 = r11
            r1 = r10
            if (r0 == r1) goto La3
            r0 = r4
            r1 = r10
            r0.bottomMargin = r1
            r0 = r13
            r7 = r0
            goto La3
        La3:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m1080q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0263e generateDefaultLayoutParams() {
        return new C0263e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0263e generateLayoutParams(AttributeSet attributeSet) {
        return new C0263e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        m1084u();
        this.f1715e.setTranslationY(-Math.max(0, Math.min(i10, this.f1715e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0262d interfaceC0262d) {
        this.f1736z = interfaceC0262d;
        if (getWindowToken() != null) {
            this.f1736z.onWindowVisibilityChanged(this.f1713c);
            int i10 = this.f1724n;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                C6824g0.m31533m0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1720j = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1721k) {
            this.f1721k = z10;
            if (z10) {
                return;
            }
            m1084u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        m1089z();
        this.f1716f.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        m1089z();
        this.f1716f.setIcon(drawable);
    }

    public void setLogo(int i10) {
        m1089z();
        this.f1716f.mo1496u(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1719i = z10;
        this.f1718h = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    public void setWindowCallback(Window.Callback callback) {
        m1089z();
        this.f1716f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0330l0
    public void setWindowTitle(CharSequence charSequence) {
        m1089z();
        this.f1716f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final InterfaceC0333m0 m1083t(View view) {
        if (view instanceof InterfaceC0333m0) {
            return (InterfaceC0333m0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: u */
    public void m1084u() {
        removeCallbacks(this.f1709D);
        removeCallbacks(this.f1710E);
        ViewPropertyAnimator viewPropertyAnimator = this.f1707B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: v */
    public final void m1085v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1705G);
        this.f1712b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1717g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        boolean z10 = false;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.f1718h = z10;
        this.f1706A = new OverScroller(context);
    }

    /* renamed from: w */
    public boolean m1086w() {
        return this.f1719i;
    }

    /* renamed from: x */
    public final void m1087x() {
        m1084u();
        postDelayed(this.f1710E, 600L);
    }

    /* renamed from: y */
    public final void m1088y() {
        m1084u();
        postDelayed(this.f1709D, 600L);
    }

    /* renamed from: z */
    public void m1089z() {
        if (this.f1714d == null) {
            this.f1714d = (ContentFrameLayout) findViewById(C0925f.f6218b);
            this.f1715e = (ActionBarContainer) findViewById(C0925f.f6219c);
            this.f1716f = m1083t(findViewById(C0925f.f6217a));
        }
    }
}
