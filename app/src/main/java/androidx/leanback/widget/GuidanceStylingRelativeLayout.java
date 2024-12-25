package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p413y0.C9793f;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/GuidanceStylingRelativeLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/GuidanceStylingRelativeLayout.class */
class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* renamed from: b */
    public float f3194b;

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3194b = m2458a(context);
    }

    /* renamed from: a */
    public static float m2458a(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(C9799l.f45073h);
        float f10 = obtainStyledAttributes.getFloat(C9799l.f45075i, 40.0f);
        obtainStyledAttributes.recycle();
        return f10;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View findViewById = getRootView().findViewById(C9793f.f44986h);
        View findViewById2 = getRootView().findViewById(C9793f.f44983e);
        View findViewById3 = getRootView().findViewById(C9793f.f44984f);
        ImageView imageView = (ImageView) getRootView().findViewById(C9793f.f44985g);
        int measuredHeight = (int) ((getMeasuredHeight() * this.f3194b) / 100.0f);
        if (findViewById != null && findViewById.getParent() == this) {
            int baseline = (((measuredHeight - findViewById.getBaseline()) - findViewById2.getMeasuredHeight()) - findViewById.getPaddingTop()) - findViewById2.getTop();
            if (findViewById2.getParent() == this) {
                findViewById2.offsetTopAndBottom(baseline);
            }
            findViewById.offsetTopAndBottom(baseline);
            if (findViewById3 != null && findViewById3.getParent() == this) {
                findViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView == null || imageView.getParent() != this || imageView.getDrawable() == null) {
            return;
        }
        imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
    }
}
