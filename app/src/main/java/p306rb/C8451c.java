package p306rb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p012ab.C0146f;
import p012ab.C0152l;
import p235o0.C6824g0;
import p235o0.C6829i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/c.class
 */
/* renamed from: rb.c */
/* loaded from: combined.jar:classes2.jar:rb/c.class */
public class C8451c extends ViewGroup {

    /* renamed from: b */
    public int f39505b;

    /* renamed from: c */
    public int f39506c;

    /* renamed from: d */
    public boolean f39507d;

    /* renamed from: e */
    public int f39508e;

    public C8451c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8451c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39507d = false;
        m36310d(context, attributeSet);
    }

    /* renamed from: a */
    public static int m36308a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    /* renamed from: b */
    public int m36309b(View view) {
        Object tag = view.getTag(C0146f.f740F);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo13481c() {
        return this.f39507d;
    }

    /* renamed from: d */
    public final void m36310d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0152l.f972Q1, 0, 0);
        this.f39505b = obtainStyledAttributes.getDimensionPixelSize(C0152l.f988S1, 0);
        this.f39506c = obtainStyledAttributes.getDimensionPixelSize(C0152l.f980R1, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f39506c;
    }

    public int getLineSpacing() {
        return this.f39505b;
    }

    public int getRowCount() {
        return this.f39508e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (getChildCount() == 0) {
            this.f39508e = 0;
            return;
        }
        this.f39508e = 1;
        boolean z11 = C6824g0.m31473C(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i17 = (i12 - i10) - paddingLeft;
        int i18 = paddingRight;
        int i19 = paddingTop;
        int i20 = 0;
        while (i20 < getChildCount()) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C0146f.f740F, -1);
                i16 = i19;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = C6829i.m31600b(marginLayoutParams);
                    i14 = C6829i.m31599a(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int i21 = i18;
                i16 = i19;
                if (!this.f39507d) {
                    i21 = i18;
                    i16 = i19;
                    if (i18 + i15 + measuredWidth > i17) {
                        i16 = this.f39505b + paddingTop;
                        this.f39508e++;
                        i21 = paddingRight;
                    }
                }
                childAt.setTag(C0146f.f740F, Integer.valueOf(this.f39508e - 1));
                int i22 = i21 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i22;
                paddingTop = childAt.getMeasuredHeight() + i16;
                int i23 = measuredWidth2;
                if (z11) {
                    i22 = i17 - measuredWidth2;
                    i23 = (i17 - i21) - i15;
                }
                childAt.layout(i22, i16, i23, paddingTop);
                i18 = i21 + i15 + i14 + childAt.getMeasuredWidth() + this.f39506c;
            }
            i20++;
            i19 = i16;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (paddingLeft + i12 + childAt.getMeasuredWidth() <= i15 - paddingRight || mo13481c()) {
                    i14 = paddingLeft;
                } else {
                    int paddingLeft2 = getPaddingLeft();
                    int i19 = this.f39505b + paddingTop;
                    i14 = paddingLeft2;
                    i16 = i19;
                }
                int measuredWidth = i14 + i12 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i20 = i17;
                if (measuredWidth > i17) {
                    i20 = measuredWidth;
                }
                int measuredWidth2 = i14 + i12 + i13 + childAt.getMeasuredWidth() + this.f39506c;
                i17 = i20;
                if (i18 == getChildCount() - 1) {
                    i17 = i20 + i13;
                }
                paddingTop = i16 + measuredHeight;
                paddingLeft = measuredWidth2;
            }
        }
        setMeasuredDimension(m36308a(size, mode, i17 + getPaddingRight()), m36308a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i10) {
        this.f39506c = i10;
    }

    public void setLineSpacing(int i10) {
        this.f39505b = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f39507d = z10;
    }
}
