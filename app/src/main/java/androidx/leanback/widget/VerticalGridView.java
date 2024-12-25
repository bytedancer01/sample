package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/VerticalGridView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/VerticalGridView.class */
public class VerticalGridView extends AbstractC0496b {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3393R0.m2842q4(1);
        m2534G1(context, attributeSet);
    }

    /* renamed from: G1 */
    public void m2534G1(Context context, AttributeSet attributeSet) {
        m2555E1(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45080k0);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(C9799l.f45084m0, 1));
        obtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i10) {
        this.f3393R0.m2851s4(i10);
        requestLayout();
    }

    public void setColumnWidth(TypedArray typedArray) {
        int i10 = C9799l.f45082l0;
        if (typedArray.peekValue(i10) != null) {
            setColumnWidth(typedArray.getLayoutDimension(i10, 0));
        }
    }

    public void setNumColumns(int i10) {
        this.f3393R0.m2824m4(i10);
        requestLayout();
    }
}
