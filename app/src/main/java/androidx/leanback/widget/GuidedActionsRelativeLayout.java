package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p413y0.C9793f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/GuidedActionsRelativeLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/GuidedActionsRelativeLayout.class */
class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: b */
    public float f3200b;

    /* renamed from: c */
    public boolean f3201c;

    /* renamed from: d */
    public InterfaceC0468a f3202d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/GuidedActionsRelativeLayout$a.class
     */
    /* renamed from: androidx.leanback.widget.GuidedActionsRelativeLayout$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/GuidedActionsRelativeLayout$a.class */
    public interface InterfaceC0468a {
        /* renamed from: a */
        boolean m2459a(KeyEvent keyEvent);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3201c = false;
        this.f3200b = GuidanceStylingRelativeLayout.m2458a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0468a interfaceC0468a = this.f3202d;
        if (interfaceC0468a == null || !interfaceC0468a.m2459a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3201c = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i11);
        if (size > 0 && (findViewById = findViewById(C9793f.f44987i)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f3201c) {
                this.f3201c = true;
            }
            if (this.f3201c) {
                marginLayoutParams.topMargin = (int) ((this.f3200b * size) / 100.0f);
            }
        }
        super.onMeasure(i10, i11);
    }
}
