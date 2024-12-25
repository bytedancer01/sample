package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p029c.C0925f;
import p029c.C0929j;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/ActionBarContainer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionBarContainer.class */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f1681b;

    /* renamed from: c */
    public View f1682c;

    /* renamed from: d */
    public View f1683d;

    /* renamed from: e */
    public View f1684e;

    /* renamed from: f */
    public Drawable f1685f;

    /* renamed from: g */
    public Drawable f1686g;

    /* renamed from: h */
    public Drawable f1687h;

    /* renamed from: i */
    public boolean f1688i;

    /* renamed from: j */
    public boolean f1689j;

    /* renamed from: k */
    public int f1690k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6824g0.m31545s0(this, new C0299b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0929j.f6412a);
        this.f1685f = obtainStyledAttributes.getDrawable(C0929j.f6418b);
        this.f1686g = obtainStyledAttributes.getDrawable(C0929j.f6430d);
        this.f1690k = obtainStyledAttributes.getDimensionPixelSize(C0929j.f6464j, -1);
        boolean z10 = true;
        if (getId() == C0925f.f6208H) {
            this.f1688i = true;
            this.f1687h = obtainStyledAttributes.getDrawable(C0929j.f6424c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1688i ? this.f1685f != null || this.f1686g != null : this.f1687h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    /* renamed from: a */
    public final int m1053a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m1054b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1685f;
        if (drawable != null && drawable.isStateful()) {
            this.f1685f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1686g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1686g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1687h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1687h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1682c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1685f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1686g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1687h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1683d = findViewById(C0925f.f6217a);
        this.f1684e = findViewById(C0925f.f6222f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1681b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f1682c;
        boolean z12 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = view2.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view2.layout(i10, (measuredHeight - measuredHeight2) - i14, i12, measuredHeight - i14);
        }
        if (this.f1688i) {
            Drawable drawable3 = this.f1687h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
            if (this.f1685f != null) {
                if (this.f1683d.getVisibility() == 0) {
                    drawable2 = this.f1685f;
                    left = this.f1683d.getLeft();
                    top = this.f1683d.getTop();
                    right = this.f1683d.getRight();
                    view = this.f1683d;
                } else {
                    View view3 = this.f1684e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1685f.setBounds(0, 0, 0, 0);
                        z11 = true;
                    } else {
                        drawable2 = this.f1685f;
                        left = this.f1684e.getLeft();
                        top = this.f1684e.getTop();
                        right = this.f1684e.getRight();
                        view = this.f1684e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z11 = true;
            }
            this.f1689j = z12;
            if (z12 && (drawable = this.f1686g) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z11 = true;
            }
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            r0 = r8
            r9 = r0
            r0 = r6
            android.view.View r0 = r0.f1683d
            if (r0 != 0) goto L30
            r0 = r8
            r9 = r0
            r0 = r8
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L30
            r0 = r6
            int r0 = r0.f1690k
            r10 = r0
            r0 = r8
            r9 = r0
            r0 = r10
            if (r0 < 0) goto L30
            r0 = r10
            r1 = r8
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r0
        L30:
            r0 = r6
            r1 = r7
            r2 = r9
            super.onMeasure(r1, r2)
            r0 = r6
            android.view.View r0 = r0.f1683d
            if (r0 != 0) goto L3e
            return
        L3e:
            r0 = r9
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r8 = r0
            r0 = r6
            android.view.View r0 = r0.f1682c
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Lb6
            r0 = r11
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto Lb6
            r0 = r8
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto Lb6
            r0 = r6
            r1 = r6
            android.view.View r1 = r1.f1683d
            boolean r0 = r0.m1054b(r1)
            if (r0 != 0) goto L79
            r0 = r6
            android.view.View r0 = r0.f1683d
            r11 = r0
        L6f:
            r0 = r6
            r1 = r11
            int r0 = r0.m1053a(r1)
            r7 = r0
            goto L8f
        L79:
            r0 = r6
            r1 = r6
            android.view.View r1 = r1.f1684e
            boolean r0 = r0.m1054b(r1)
            if (r0 != 0) goto L8d
            r0 = r6
            android.view.View r0 = r0.f1684e
            r11 = r0
            goto L6f
        L8d:
            r0 = 0
            r7 = r0
        L8f:
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L9d
            r0 = r9
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r8 = r0
            goto La0
        L9d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8 = r0
        La0:
            r0 = r6
            r1 = r6
            int r1 = r1.getMeasuredWidth()
            r2 = r7
            r3 = r6
            r4 = r6
            android.view.View r4 = r4.f1682c
            int r3 = r3.m1053a(r4)
            int r2 = r2 + r3
            r3 = r8
            int r2 = java.lang.Math.min(r2, r3)
            r0.setMeasuredDimension(r1, r2)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1685f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1685f);
        }
        this.f1685f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1683d;
            if (view != null) {
                this.f1685f.setBounds(view.getLeft(), this.f1683d.getTop(), this.f1683d.getRight(), this.f1683d.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1688i ? this.f1685f != null || this.f1686g != null : this.f1687h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r6.f1687h == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r6.f1686g == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSplitBackground(android.graphics.drawable.Drawable r7) {
        /*
            r6 = this;
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.f1687h
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L19
            r0 = r10
            r1 = 0
            r0.setCallback(r1)
            r0 = r6
            r1 = r6
            android.graphics.drawable.Drawable r1 = r1.f1687h
            r0.unscheduleDrawable(r1)
        L19:
            r0 = r6
            r1 = r7
            r0.f1687h = r1
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L47
            r0 = r7
            r1 = r6
            r0.setCallback(r1)
            r0 = r6
            boolean r0 = r0.f1688i
            if (r0 == 0) goto L47
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.f1687h
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L47
            r0 = r7
            r1 = 0
            r2 = 0
            r3 = r6
            int r3 = r3.getMeasuredWidth()
            r4 = r6
            int r4 = r4.getMeasuredHeight()
            r0.setBounds(r1, r2, r3, r4)
        L47:
            r0 = r6
            boolean r0 = r0.f1688i
            if (r0 == 0) goto L5c
            r0 = r9
            r8 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.f1687h
            if (r0 != 0) goto L71
        L57:
            r0 = 1
            r8 = r0
            goto L71
        L5c:
            r0 = r9
            r8 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.f1685f
            if (r0 != 0) goto L71
            r0 = r9
            r8 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.f1686g
            if (r0 != 0) goto L71
            goto L57
        L71:
            r0 = r6
            r1 = r8
            r0.setWillNotDraw(r1)
            r0 = r6
            r0.invalidate()
            r0 = r6
            r0.invalidateOutline()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setSplitBackground(android.graphics.drawable.Drawable):void");
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1686g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1686g);
        }
        this.f1686g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1689j && (drawable2 = this.f1686g) != null) {
                drawable2.setBounds(this.f1682c.getLeft(), this.f1682c.getTop(), this.f1682c.getRight(), this.f1682c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1688i ? this.f1685f != null || this.f1686g != null : this.f1687h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0316g1 c0316g1) {
        View view = this.f1682c;
        if (view != null) {
            removeView(view);
        }
        this.f1682c = c0316g1;
        if (c0316g1 != null) {
            addView(c0316g1);
            ViewGroup.LayoutParams layoutParams = c0316g1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0316g1.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1681b = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1685f;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1686g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1687h;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1685f && !this.f1688i) || (drawable == this.f1686g && this.f1689j) || ((drawable == this.f1687h && this.f1688i) || super.verifyDrawable(drawable));
    }
}
