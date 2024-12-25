package com.maxdigitall.maxdigitaliptvbox.view.utility;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import ve.C9341b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/ListViewMaxHeight.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/ListViewMaxHeight.class */
public class ListViewMaxHeight extends ListView {

    /* renamed from: b */
    public final int f24920b;

    public ListViewMaxHeight(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListViewMaxHeight(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet == null) {
            this.f24920b = 0;
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9341b.f42646U0);
        this.f24920b = obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f24920b;
        int i13 = i11;
        if (i12 > 0) {
            i13 = i11;
            if (i12 < size) {
                i13 = View.MeasureSpec.makeMeasureSpec(this.f24920b, View.MeasureSpec.getMode(i11));
            }
        }
        super.onMeasure(i10, i13);
    }
}
