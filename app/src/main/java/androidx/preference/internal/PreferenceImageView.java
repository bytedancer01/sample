package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/internal/PreferenceImageView.class
 */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: combined.jar:classes1.jar:androidx/preference/internal/PreferenceImageView.class */
public class PreferenceImageView extends ImageView {

    /* renamed from: b */
    public int f4432b;

    /* renamed from: c */
    public int f4433c;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4432b = Integer.MAX_VALUE;
        this.f4433c = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38325h1, i10, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(C7948g.f38331j1, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(C7948g.f38328i1, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f4433c;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f4432b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r0 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        if (r0 == 0) goto L17;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            r0 = r5
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L14
            r0 = r5
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L3f
        L14:
            r0 = r5
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r10 = r0
            r0 = r4
            int r0 = r0.getMaxWidth()
            r8 = r0
            r0 = r5
            r7 = r0
            r0 = r8
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L3f
            r0 = r8
            r1 = r10
            if (r0 < r1) goto L37
            r0 = r5
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L3f
        L37:
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r7 = r0
        L3f:
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L53
            r0 = r6
            r5 = r0
            r0 = r9
            if (r0 != 0) goto L7e
        L53:
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r8 = r0
            r0 = r4
            int r0 = r0.getMaxHeight()
            r10 = r0
            r0 = r6
            r5 = r0
            r0 = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L7e
            r0 = r10
            r1 = r8
            if (r0 < r1) goto L76
            r0 = r6
            r5 = r0
            r0 = r9
            if (r0 != 0) goto L7e
        L76:
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r5 = r0
        L7e:
            r0 = r4
            r1 = r7
            r2 = r5
            super.onMeasure(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.internal.PreferenceImageView.onMeasure(int, int):void");
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i10) {
        this.f4433c = i10;
        super.setMaxHeight(i10);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i10) {
        this.f4432b = i10;
        super.setMaxWidth(i10);
    }
}
