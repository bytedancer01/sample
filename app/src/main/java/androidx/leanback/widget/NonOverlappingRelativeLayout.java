package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/NonOverlappingRelativeLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/NonOverlappingRelativeLayout.class */
class NonOverlappingRelativeLayout extends RelativeLayout {
    public NonOverlappingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }
}
