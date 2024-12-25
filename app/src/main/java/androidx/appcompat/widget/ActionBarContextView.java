package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0920a;
import p029c.C0925f;
import p029c.C0926g;
import p029c.C0929j;
import p137i.AbstractC5134b;
import p235o0.C6824g0;
import p235o0.C6864y0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/ActionBarContextView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarContextView.class */
public class ActionBarContextView extends AbstractC0296a {

    /* renamed from: j */
    public CharSequence f1691j;

    /* renamed from: k */
    public CharSequence f1692k;

    /* renamed from: l */
    public View f1693l;

    /* renamed from: m */
    public View f1694m;

    /* renamed from: n */
    public View f1695n;

    /* renamed from: o */
    public LinearLayout f1696o;

    /* renamed from: p */
    public TextView f1697p;

    /* renamed from: q */
    public TextView f1698q;

    /* renamed from: r */
    public int f1699r;

    /* renamed from: s */
    public int f1700s;

    /* renamed from: t */
    public boolean f1701t;

    /* renamed from: u */
    public int f1702u;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionBarContextView$a.class
     */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarContextView$a.class */
    public class ViewOnClickListenerC0258a implements View.OnClickListener {

        /* renamed from: b */
        public final AbstractC5134b f1703b;

        /* renamed from: c */
        public final ActionBarContextView f1704c;

        public ViewOnClickListenerC0258a(ActionBarContextView actionBarContextView, AbstractC5134b abstractC5134b) {
            this.f1704c = actionBarContextView;
            this.f1703b = abstractC5134b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1703b.mo21706c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6115j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, C0929j.f6539y, i10, 0);
        C6824g0.m31545s0(this, m1505v.m1512g(C0929j.f6544z));
        this.f1699r = m1505v.m1519n(C0929j.f6297D, 0);
        this.f1700s = m1505v.m1519n(C0929j.f6292C, 0);
        this.f1962f = m1505v.m1518m(C0929j.f6287B, 0);
        this.f1702u = m1505v.m1519n(C0929j.f6282A, C0926g.f6246d);
        m1505v.m1525w();
    }

    @Override // androidx.appcompat.widget.AbstractC0296a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C6864y0 mo1055f(int i10, long j10) {
        return super.mo1055f(i10, j10);
    }

    /* renamed from: g */
    public void m1056g() {
        if (this.f1693l == null) {
            m1060k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0296a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0296a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1692k;
    }

    public CharSequence getTitle() {
        return this.f1691j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1057h(p137i.AbstractC5134b r7) {
        /*
            r6 = this;
            r0 = r6
            android.view.View r0 = r0.f1693l
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L27
            r0 = r6
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = r6
            int r1 = r1.f1702u
            r2 = r6
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.f1693l = r1
        L1f:
            r0 = r6
            r1 = r8
            r0.addView(r1)
            goto L36
        L27:
            r0 = r8
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L36
            r0 = r6
            android.view.View r0 = r0.f1693l
            r8 = r0
            goto L1f
        L36:
            r0 = r6
            android.view.View r0 = r0.f1693l
            int r1 = p029c.C0925f.f6225i
            android.view.View r0 = r0.findViewById(r1)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.f1694m = r1
            r0 = r8
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
            r0.setOnClickListener(r1)
            r0 = r7
            android.view.Menu r0 = r0.mo21708e()
            androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.C0250e) r0
            r7 = r0
            r0 = r6
            androidx.appcompat.widget.c r0 = r0.f1961e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            boolean r0 = r0.m1270y()
        L69:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            r1 = r0
            r2 = r6
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.f1961e = r1
            r0 = r8
            r1 = 1
            r0.m1268J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = r0
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r7
            r1 = r6
            androidx.appcompat.widget.c r1 = r1.f1961e
            r2 = r6
            android.content.Context r2 = r2.f1959c
            r0.m978c(r1, r2)
            r0 = r6
            androidx.appcompat.widget.c r0 = r0.f1961e
            r1 = r6
            androidx.appcompat.view.menu.j r0 = r0.mo914o(r1)
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r7 = r0
            r0 = r6
            r1 = r7
            r0.f1960d = r1
            r0 = r7
            r1 = 0
            p235o0.C6824g0.m31545s0(r0, r1)
            r0 = r6
            r1 = r6
            androidx.appcompat.widget.ActionMenuView r1 = r1.f1960d
            r2 = r8
            r0.addView(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m1057h(i.b):void");
    }

    /* renamed from: i */
    public final void m1058i() {
        if (this.f1696o == null) {
            LayoutInflater.from(getContext()).inflate(C0926g.f6243a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1696o = linearLayout;
            this.f1697p = (TextView) linearLayout.findViewById(C0925f.f6221e);
            this.f1698q = (TextView) this.f1696o.findViewById(C0925f.f6220d);
            if (this.f1699r != 0) {
                this.f1697p.setTextAppearance(getContext(), this.f1699r);
            }
            if (this.f1700s != 0) {
                this.f1698q.setTextAppearance(getContext(), this.f1700s);
            }
        }
        this.f1697p.setText(this.f1691j);
        this.f1698q.setText(this.f1692k);
        boolean isEmpty = TextUtils.isEmpty(this.f1691j);
        boolean z10 = !TextUtils.isEmpty(this.f1692k);
        this.f1698q.setVisibility(z10 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1696o;
        int i10 = 0;
        if (!(!isEmpty)) {
            i10 = z10 ? 0 : 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1696o.getParent() == null) {
            addView(this.f1696o);
        }
    }

    /* renamed from: j */
    public boolean m1059j() {
        return this.f1701t;
    }

    /* renamed from: k */
    public void m1060k() {
        removeAllViews();
        this.f1695n = null;
        this.f1960d = null;
        this.f1961e = null;
        View view = this.f1694m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m1061l() {
        C0302c c0302c = this.f1961e;
        if (c0302c != null) {
            return c0302c.m1269K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0302c c0302c = this.f1961e;
        if (c0302c != null) {
            c0302c.m1260B();
            this.f1961e.m1261C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0296a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1691j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean m1621b = C0358u1.m1621b(this);
        int paddingRight = m1621b ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1693l;
        int i14 = paddingRight;
        if (view != null) {
            i14 = paddingRight;
            if (view.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1693l.getLayoutParams();
                int i15 = m1621b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
                int i16 = m1621b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
                int m1235d = AbstractC0296a.m1235d(paddingRight, i15, m1621b);
                i14 = AbstractC0296a.m1235d(m1235d + m1237e(this.f1693l, m1235d, paddingTop, paddingTop2, m1621b), i16, m1621b);
            }
        }
        int i17 = i14;
        LinearLayout linearLayout = this.f1696o;
        int i18 = i17;
        if (linearLayout != null) {
            i18 = i17;
            if (this.f1695n == null) {
                i18 = i17;
                if (linearLayout.getVisibility() != 8) {
                    i18 = i17 + m1237e(this.f1696o, i17, paddingTop, paddingTop2, m1621b);
                }
            }
        }
        View view2 = this.f1695n;
        if (view2 != null) {
            m1237e(view2, i18, paddingTop, paddingTop2, m1621b);
        }
        int paddingLeft = m1621b ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1960d;
        if (actionMenuView != null) {
            m1237e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m1621b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f1962f;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        View view = this.f1693l;
        int i14 = paddingLeft;
        if (view != null) {
            int m1236c = m1236c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1693l.getLayoutParams();
            i14 = m1236c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1960d;
        int i15 = i14;
        if (actionMenuView != null) {
            i15 = i14;
            if (actionMenuView.getParent() == this) {
                i15 = m1236c(this.f1960d, i14, makeMeasureSpec, 0);
            }
        }
        LinearLayout linearLayout = this.f1696o;
        int i16 = i15;
        if (linearLayout != null) {
            i16 = i15;
            if (this.f1695n == null) {
                if (this.f1701t) {
                    this.f1696o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1696o.getMeasuredWidth();
                    boolean z10 = measuredWidth <= i15;
                    i16 = i15;
                    if (z10) {
                        i16 = i15 - measuredWidth;
                    }
                    this.f1696o.setVisibility(z10 ? 0 : 8);
                } else {
                    i16 = m1236c(linearLayout, i15, makeMeasureSpec, 0);
                }
            }
        }
        View view2 = this.f1695n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i17 = layoutParams.width;
            int i18 = i17 != -2 ? 1073741824 : Integer.MIN_VALUE;
            int i19 = i16;
            if (i17 >= 0) {
                i19 = Math.min(i17, i16);
            }
            int i20 = layoutParams.height;
            int i21 = i20 != -2 ? 1073741824 : Integer.MIN_VALUE;
            int i22 = i13;
            if (i20 >= 0) {
                i22 = Math.min(i20, i13);
            }
            this.f1695n.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i22, i21));
        }
        if (this.f1962f > 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int childCount = getChildCount();
        int i23 = 0;
        int i24 = 0;
        while (i24 < childCount) {
            int measuredHeight = getChildAt(i24).getMeasuredHeight() + paddingTop;
            int i25 = i23;
            if (measuredHeight > i23) {
                i25 = measuredHeight;
            }
            i24++;
            i23 = i25;
        }
        setMeasuredDimension(size, i23);
    }

    @Override // androidx.appcompat.widget.AbstractC0296a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0296a
    public void setContentHeight(int i10) {
        this.f1962f = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1695n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1695n = view;
        if (view != null && (linearLayout = this.f1696o) != null) {
            removeView(linearLayout);
            this.f1696o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1692k = charSequence;
        m1058i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1691j = charSequence;
        m1058i();
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1701t) {
            requestLayout();
        }
        this.f1701t = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC0296a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
