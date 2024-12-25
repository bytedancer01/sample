package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/ScaleFrameLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/ScaleFrameLayout.class */
public class ScaleFrameLayout extends FrameLayout {

    /* renamed from: b */
    public float f3281b;

    /* renamed from: c */
    public float f3282c;

    /* renamed from: d */
    public float f3283d;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3281b = 1.0f;
        this.f3282c = 1.0f;
        this.f3283d = 1.0f;
    }

    /* renamed from: a */
    public static int m2497a(int i10, float f10) {
        if (f10 != 1.0f) {
            i10 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i10) / f10) + 0.5f), View.MeasureSpec.getMode(i10));
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setScaleX(this.f3283d);
        view.setScaleY(this.f3283d);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        boolean addViewInLayout = super.addViewInLayout(view, i10, layoutParams, z10);
        if (addViewInLayout) {
            view.setScaleX(this.f3283d);
            view.setScaleY(this.f3283d);
        }
        return addViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10 = this.f3281b;
        if (f10 == 1.0f && this.f3282c == 1.0f) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(m2497a(i10, f10), m2497a(i11, this.f3282c));
            setMeasuredDimension((int) ((getMeasuredWidth() * this.f3281b) + 0.5f), (int) ((getMeasuredHeight() * this.f3282c) + 0.5f));
        }
    }

    public void setChildScale(float f10) {
        if (this.f3283d != f10) {
            this.f3283d = f10;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                getChildAt(i10).setScaleX(f10);
                getChildAt(i10).setScaleY(f10);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f10) {
        if (f10 != this.f3281b) {
            this.f3281b = f10;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f10) {
        if (f10 != this.f3282c) {
            this.f3282c = f10;
            requestLayout();
        }
    }
}
