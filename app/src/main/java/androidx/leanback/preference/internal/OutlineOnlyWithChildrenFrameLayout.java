package androidx.leanback.preference.internal;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/preference/internal/OutlineOnlyWithChildrenFrameLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/preference/internal/OutlineOnlyWithChildrenFrameLayout.class */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {

    /* renamed from: b */
    public ViewOutlineProvider f3142b;

    /* renamed from: c */
    public ViewOutlineProvider f3143c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/preference/internal/OutlineOnlyWithChildrenFrameLayout$a.class
     */
    /* renamed from: androidx.leanback.preference.internal.OutlineOnlyWithChildrenFrameLayout$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/preference/internal/OutlineOnlyWithChildrenFrameLayout$a.class */
    public class C0443a extends ViewOutlineProvider {

        /* renamed from: a */
        public final OutlineOnlyWithChildrenFrameLayout f3144a;

        public C0443a(OutlineOnlyWithChildrenFrameLayout outlineOnlyWithChildrenFrameLayout) {
            this.f3144a = outlineOnlyWithChildrenFrameLayout;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            (this.f3144a.getChildCount() > 0 ? this.f3144a.f3143c : ViewOutlineProvider.BACKGROUND).getOutline(view, outline);
        }
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        invalidateOutline();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        this.f3143c = viewOutlineProvider;
        if (this.f3142b == null) {
            this.f3142b = new C0443a(this);
        }
        super.setOutlineProvider(this.f3142b);
    }
}
