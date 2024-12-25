package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.leanback.widget.C0507e1;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/app/GuidedStepRootLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/app/GuidedStepRootLayout.class */
class GuidedStepRootLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f3104b;

    /* renamed from: c */
    public boolean f3105c;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3104b = false;
        this.f3105c = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View focusSearch = super.focusSearch(view, i10);
        if (i10 == 17 || i10 == 66) {
            if (C0507e1.m2582a(this, focusSearch)) {
                return focusSearch;
            }
            if (getLayoutDirection() != 0 ? i10 != 66 : i10 != 17) {
                if (!this.f3105c) {
                    return view;
                }
            } else if (!this.f3104b) {
                return view;
            }
        }
        return focusSearch;
    }
}
