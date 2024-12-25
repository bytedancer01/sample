package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/NonOverlappingView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/NonOverlappingView.class */
class NonOverlappingView extends View {
    public NonOverlappingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }
}
