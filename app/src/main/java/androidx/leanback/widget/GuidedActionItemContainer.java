package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/GuidedActionItemContainer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/GuidedActionItemContainer.class */
class GuidedActionItemContainer extends C0552z {

    /* renamed from: e */
    public boolean f3199e;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3199e = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        if (this.f3199e || !C0507e1.m2582a(this, view)) {
            return super.focusSearch(view, i10);
        }
        View focusSearch = super.focusSearch(view, i10);
        if (C0507e1.m2582a(this, focusSearch)) {
            return focusSearch;
        }
        return null;
    }
}
