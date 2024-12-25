package com.maxdigitall.maxdigitaliptvbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import ve.C9341b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/MaxHeightLayout.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/MaxHeightLayout.class */
public class MaxHeightLayout extends FrameLayout {

    /* renamed from: b */
    public float f15920b;

    /* renamed from: c */
    public float f15921c;

    public MaxHeightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15920b = 0.6f;
        this.f15921c = 0.0f;
        m14485c(context, attributeSet);
        m14484b();
    }

    /* renamed from: a */
    public final int m14483a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
    }

    /* renamed from: b */
    public final void m14484b() {
        float f10 = this.f15921c;
        this.f15921c = f10 <= 0.0f ? this.f15920b * m14483a(getContext()) : Math.min(f10, this.f15920b * m14483a(getContext()));
    }

    /* renamed from: c */
    public final void m14485c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9341b.f42738o1);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f15920b = obtainStyledAttributes.getFloat(index, 0.6f);
            } else if (index == 0) {
                this.f15921c = obtainStyledAttributes.getDimension(index, 0.0f);
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = size;
        if (mode == 1073741824) {
            float f10 = size;
            float f11 = this.f15921c;
            i12 = f10 <= f11 ? size : (int) f11;
        }
        int i13 = i12;
        if (mode == 0) {
            float f12 = i12;
            float f13 = this.f15921c;
            i13 = f12 <= f13 ? i12 : (int) f13;
        }
        int i14 = i13;
        if (mode == Integer.MIN_VALUE) {
            float f14 = i13;
            float f15 = this.f15921c;
            i14 = f14 <= f15 ? i13 : (int) f15;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, mode));
    }
}
