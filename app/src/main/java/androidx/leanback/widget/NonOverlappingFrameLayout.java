package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/NonOverlappingFrameLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/NonOverlappingFrameLayout.class */
class NonOverlappingFrameLayout extends FrameLayout {
    public NonOverlappingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }
}
