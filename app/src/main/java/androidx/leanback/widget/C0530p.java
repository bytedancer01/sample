package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/p.class
 */
/* renamed from: androidx.leanback.widget.p */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/p.class */
public final class C0530p extends AbstractC0523l0 {

    /* renamed from: e */
    public int f3543e;

    /* renamed from: f */
    public int f3544f;

    /* renamed from: g */
    public int[] f3545g = new int[2];

    /* renamed from: h */
    public Rect f3546h = new Rect();

    @Override // androidx.leanback.widget.AbstractC0523l0
    /* renamed from: d */
    public void mo2701d(View view) {
        m2699b().addView(view);
    }

    @Override // androidx.leanback.widget.AbstractC0523l0
    /* renamed from: e */
    public void mo2702e(View view) {
        int i10;
        int i11;
        int width = m2699b().getWidth() - m2699b().getPaddingRight();
        int paddingLeft = m2699b().getPaddingLeft();
        boolean z10 = false;
        view.measure(0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (C6824g0.m31473C(view) == 1) {
            z10 = true;
        }
        if (!z10 && this.f3543e + view.getMeasuredWidth() > width) {
            i11 = width;
        } else if (z10 && this.f3543e < paddingLeft) {
            marginLayoutParams.leftMargin = paddingLeft;
            view.requestLayout();
        } else {
            if (!z10) {
                i10 = this.f3543e;
                marginLayoutParams.leftMargin = i10;
                view.requestLayout();
            }
            i11 = this.f3544f;
        }
        i10 = i11 - view.getMeasuredWidth();
        marginLayoutParams.leftMargin = i10;
        view.requestLayout();
    }

    /* renamed from: k */
    public void m2914k(HorizontalGridView horizontalGridView, View view, Object obj) {
        ViewGroup m2699b = m2699b();
        horizontalGridView.m2554D1(view, this.f3545g);
        this.f3546h.set(0, 0, view.getWidth(), view.getHeight());
        m2699b.offsetDescendantRectToMyCoords(view, this.f3546h);
        Rect rect = this.f3546h;
        int i10 = rect.left;
        int i11 = this.f3545g[0];
        this.f3543e = i10 - i11;
        this.f3544f = rect.right - i11;
        m2703f(obj);
    }
}
