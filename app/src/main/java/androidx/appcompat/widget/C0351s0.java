package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0929j;
import p235o0.C6820f;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/s0.class
 */
/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/s0.class */
public class C0351s0 extends ViewGroup {

    /* renamed from: b */
    public boolean f2244b;

    /* renamed from: c */
    public int f2245c;

    /* renamed from: d */
    public int f2246d;

    /* renamed from: e */
    public int f2247e;

    /* renamed from: f */
    public int f2248f;

    /* renamed from: g */
    public int f2249g;

    /* renamed from: h */
    public float f2250h;

    /* renamed from: i */
    public boolean f2251i;

    /* renamed from: j */
    public int[] f2252j;

    /* renamed from: k */
    public int[] f2253k;

    /* renamed from: l */
    public Drawable f2254l;

    /* renamed from: m */
    public int f2255m;

    /* renamed from: n */
    public int f2256n;

    /* renamed from: o */
    public int f2257o;

    /* renamed from: p */
    public int f2258p;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/s0$a.class
     */
    /* renamed from: androidx.appcompat.widget.s0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/s0$a.class */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0351s0(Context context) {
        this(context, null);
    }

    public C0351s0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0351s0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2244b = true;
        this.f2245c = -1;
        this.f2246d = 0;
        this.f2248f = 8388659;
        int[] iArr = C0929j.f6476l1;
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, iArr, i10, 0);
        C6824g0.m31535n0(this, context, iArr, attributeSet, m1505v.m1523r(), i10, 0);
        int m1516k = m1505v.m1516k(C0929j.f6486n1, -1);
        if (m1516k >= 0) {
            setOrientation(m1516k);
        }
        int m1516k2 = m1505v.m1516k(C0929j.f6481m1, -1);
        if (m1516k2 >= 0) {
            setGravity(m1516k2);
        }
        boolean m1506a = m1505v.m1506a(C0929j.f6491o1, true);
        if (!m1506a) {
            setBaselineAligned(m1506a);
        }
        this.f2250h = m1505v.m1514i(C0929j.f6501q1, -1.0f);
        this.f2245c = m1505v.m1516k(C0929j.f6496p1, -1);
        this.f2251i = m1505v.m1506a(C0929j.f6516t1, false);
        setDividerDrawable(m1505v.m1512g(C0929j.f6506r1));
        this.f2257o = m1505v.m1516k(C0929j.f6521u1, 0);
        this.f2258p = m1505v.m1511f(C0929j.f6511s1, 0);
        m1505v.m1525w();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: e */
    public void m1587e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean m1621b = C0358u1.m1621b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View m1596q = m1596q(i11);
            if (m1596q != null && m1596q.getVisibility() != 8 && m1597r(i11)) {
                a aVar = (a) m1596q.getLayoutParams();
                m1590h(canvas, m1621b ? m1596q.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (m1596q.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f2255m);
            }
        }
        if (m1597r(virtualChildCount)) {
            View m1596q2 = m1596q(virtualChildCount - 1);
            if (m1596q2 != null) {
                a aVar2 = (a) m1596q2.getLayoutParams();
                if (m1621b) {
                    left = m1596q2.getLeft();
                    i10 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.f2255m;
                } else {
                    right = m1596q2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (m1621b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i10 = getPaddingRight();
                right = (left - i10) - this.f2255m;
            }
            m1590h(canvas, right);
        }
    }

    /* renamed from: f */
    public void m1588f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View m1596q = m1596q(i10);
            if (m1596q != null && m1596q.getVisibility() != 8 && m1597r(i10)) {
                m1589g(canvas, (m1596q.getTop() - ((LinearLayout.LayoutParams) ((a) m1596q.getLayoutParams())).topMargin) - this.f2256n);
            }
        }
        if (m1597r(virtualChildCount)) {
            View m1596q2 = m1596q(virtualChildCount - 1);
            m1589g(canvas, m1596q2 == null ? (getHeight() - getPaddingBottom()) - this.f2256n : m1596q2.getBottom() + ((LinearLayout.LayoutParams) ((a) m1596q2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: g */
    public void m1589g(Canvas canvas, int i10) {
        this.f2254l.setBounds(getPaddingLeft() + this.f2258p, i10, (getWidth() - getPaddingRight()) - this.f2258p, this.f2256n + i10);
        this.f2254l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.f2245c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f2245c;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2245c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i11 = this.f2246d;
        int i12 = i11;
        if (this.f2247e == 1) {
            int i13 = this.f2248f & 112;
            i12 = i11;
            if (i13 != 48) {
                i12 = i13 != 16 ? i13 != 80 ? i11 : ((getBottom() - getTop()) - getPaddingBottom()) - this.f2249g : i11 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2249g) / 2);
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2245c;
    }

    public Drawable getDividerDrawable() {
        return this.f2254l;
    }

    public int getDividerPadding() {
        return this.f2258p;
    }

    public int getDividerWidth() {
        return this.f2255m;
    }

    public int getGravity() {
        return this.f2248f;
    }

    public int getOrientation() {
        return this.f2247e;
    }

    public int getShowDividers() {
        return this.f2257o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2250h;
    }

    /* renamed from: h */
    public void m1590h(Canvas canvas, int i10) {
        this.f2254l.setBounds(i10, getPaddingTop() + this.f2258p, this.f2255m + i10, (getHeight() - getPaddingBottom()) - this.f2258p);
        this.f2254l.draw(canvas);
    }

    /* renamed from: i */
    public final void m1591i(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1596q = m1596q(i12);
            if (m1596q.getVisibility() != 8) {
                a aVar = (a) m1596q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = m1596q.getMeasuredWidth();
                    measureChildWithMargins(m1596q, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    /* renamed from: j */
    public final void m1592j(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1596q = m1596q(i12);
            if (m1596q.getVisibility() != 8) {
                a aVar = (a) m1596q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = m1596q.getMeasuredHeight();
                    measureChildWithMargins(m1596q, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f2247e;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* renamed from: n */
    public int m1593n(View view, int i10) {
        return 0;
    }

    /* renamed from: o */
    public int m1594o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f2254l == null) {
            return;
        }
        if (this.f2247e == 1) {
            m1588f(canvas);
        } else {
            m1587e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f2247e == 1) {
            m1599t(i10, i11, i12, i13);
        } else {
            m1598s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f2247e == 1) {
            m1603x(i10, i11);
        } else {
            m1601v(i10, i11);
        }
    }

    /* renamed from: p */
    public int m1595p(View view) {
        return 0;
    }

    /* renamed from: q */
    public View m1596q(int i10) {
        return getChildAt(i10);
    }

    /* renamed from: r */
    public boolean m1597r(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            boolean z11 = false;
            if ((this.f2257o & 1) != 0) {
                z11 = true;
            }
            return z11;
        }
        if (i10 == getChildCount()) {
            if ((this.f2257o & 4) != 0) {
                z10 = true;
            }
            return z10;
        }
        boolean z12 = false;
        if ((this.f2257o & 2) != 0) {
            while (true) {
                i10--;
                z12 = false;
                if (i10 < 0) {
                    break;
                }
                if (getChildAt(i10).getVisibility() != 8) {
                    z12 = true;
                    break;
                }
            }
        }
        return z12;
    }

    /* renamed from: s */
    public void m1598s(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        boolean m1621b = C0358u1.m1621b(this);
        int paddingTop = getPaddingTop();
        int i17 = i13 - i11;
        int paddingBottom = getPaddingBottom();
        int paddingBottom2 = getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f2248f;
        int i19 = i18 & 112;
        boolean z10 = this.f2244b;
        int[] iArr = this.f2252j;
        int[] iArr2 = this.f2253k;
        int m31460b = C6820f.m31460b(8388615 & i18, C6824g0.m31473C(this));
        int paddingLeft = m31460b != 1 ? m31460b != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f2249g : getPaddingLeft() + (((i12 - i10) - this.f2249g) / 2);
        if (m1621b) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i20 = 0;
        while (i20 < virtualChildCount) {
            int i21 = i14 + (i15 * i20);
            View m1596q = m1596q(i21);
            if (m1596q == null) {
                paddingLeft += m1602w(i21);
            } else if (m1596q.getVisibility() != 8) {
                int measuredWidth = m1596q.getMeasuredWidth();
                int measuredHeight = m1596q.getMeasuredHeight();
                a aVar = (a) m1596q.getLayoutParams();
                int baseline = (!z10 || ((LinearLayout.LayoutParams) aVar).height == -1) ? -1 : m1596q.getBaseline();
                int i22 = ((LinearLayout.LayoutParams) aVar).gravity;
                int i23 = i22;
                if (i22 < 0) {
                    i23 = i19;
                }
                int i24 = i23 & 112;
                if (i24 == 16) {
                    i16 = ((((((i17 - paddingTop) - paddingBottom2) - measuredHeight) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else if (i24 == 48) {
                    int i25 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                    i16 = i25;
                    if (baseline != -1) {
                        i16 = i25 + (iArr[1] - baseline);
                    }
                } else if (i24 != 80) {
                    i16 = paddingTop;
                } else {
                    int i26 = ((i17 - paddingBottom) - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    i16 = i26;
                    if (baseline != -1) {
                        i16 = i26 - (iArr2[2] - (m1596q.getMeasuredHeight() - baseline));
                    }
                }
                int i27 = paddingLeft;
                if (m1597r(i21)) {
                    i27 = paddingLeft + this.f2255m;
                }
                int i28 = ((LinearLayout.LayoutParams) aVar).leftMargin + i27;
                m1604y(m1596q, i28 + m1594o(m1596q), i16, measuredWidth, measuredHeight);
                int i29 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                int m1595p = m1595p(m1596q);
                i20 += m1593n(m1596q, i21);
                paddingLeft = i28 + measuredWidth + i29 + m1595p;
            }
            i20++;
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f2244b = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f2245c = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2254l) {
            return;
        }
        this.f2254l = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f2255m = drawable.getIntrinsicWidth();
            this.f2256n = drawable.getIntrinsicHeight();
        } else {
            this.f2255m = 0;
            this.f2256n = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f2258p = i10;
    }

    public void setGravity(int i10) {
        if (this.f2248f != i10) {
            int i11 = i10;
            if ((8388615 & i10) == 0) {
                i11 = i10 | 8388611;
            }
            int i12 = i11;
            if ((i11 & 112) == 0) {
                i12 = i11 | 48;
            }
            this.f2248f = i12;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f2248f;
        if ((8388615 & i12) != i11) {
            this.f2248f = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f2251i = z10;
    }

    public void setOrientation(int i10) {
        if (this.f2247e != i10) {
            this.f2247e = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f2257o) {
            requestLayout();
        }
        this.f2257o = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f2248f;
        if ((i12 & 112) != i11) {
            this.f2248f = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f2250h = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0117  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1599t(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0351s0.m1599t(int, int, int, int):void");
    }

    /* renamed from: u */
    public void m1600u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x03ed, code lost:
    
        if (r0 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0642, code lost:
    
        if (r0 < 0) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0317  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1601v(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 2147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0351s0.m1601v(int, int):void");
    }

    /* renamed from: w */
    public int m1602w(int i10) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a7, code lost:
    
        if (r0 < 0) goto L142;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1603x(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 1484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0351s0.m1603x(int, int):void");
    }

    /* renamed from: y */
    public final void m1604y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }
}
