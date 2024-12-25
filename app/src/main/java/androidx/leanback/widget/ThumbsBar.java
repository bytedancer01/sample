package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p413y0.C9790c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/ThumbsBar.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/ThumbsBar.class */
public class ThumbsBar extends LinearLayout {

    /* renamed from: b */
    public int f3372b;

    /* renamed from: c */
    public int f3373c;

    /* renamed from: d */
    public int f3374d;

    /* renamed from: e */
    public int f3375e;

    /* renamed from: f */
    public int f3376f;

    /* renamed from: g */
    public int f3377g;

    /* renamed from: h */
    public final SparseArray<Bitmap> f3378h;

    /* renamed from: i */
    public boolean f3379i;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3372b = -1;
        this.f3378h = new SparseArray<>();
        this.f3379i = false;
        this.f3373c = context.getResources().getDimensionPixelSize(C9790c.f44953s);
        this.f3374d = context.getResources().getDimensionPixelSize(C9790c.f44951q);
        this.f3376f = context.getResources().getDimensionPixelSize(C9790c.f44947m);
        this.f3375e = context.getResources().getDimensionPixelSize(C9790c.f44946l);
        this.f3377g = context.getResources().getDimensionPixelSize(C9790c.f44952r);
    }

    /* renamed from: c */
    public static int m2528c(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    /* renamed from: a */
    public final int m2529a(int i10) {
        int i11;
        int m2528c = m2528c(i10 - this.f3375e, this.f3373c + this.f3377g);
        if (m2528c < 2) {
            i11 = 2;
        } else {
            i11 = m2528c;
            if ((m2528c & 1) != 0) {
                i11 = m2528c + 1;
            }
        }
        return i11 + 1;
    }

    /* renamed from: b */
    public View m2530b(ViewGroup viewGroup) {
        return new ImageView(viewGroup.getContext());
    }

    /* renamed from: d */
    public final void m2531d() {
        int i10;
        while (getChildCount() > this.f3372b) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.f3372b) {
            addView(m2530b(this), new LinearLayout.LayoutParams(this.f3373c, this.f3374d));
        }
        int heroIndex = getHeroIndex();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i11) {
                layoutParams.width = this.f3375e;
                i10 = this.f3376f;
            } else {
                layoutParams.width = this.f3373c;
                i10 = this.f3374d;
            }
            layoutParams.height = i10;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        int i16 = heroIndex - 1;
        while (true) {
            i14 = heroIndex;
            i15 = width2;
            if (i16 < 0) {
                break;
            }
            int i17 = width - this.f3377g;
            View childAt2 = getChildAt(i16);
            childAt2.layout(i17 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i17, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i17 - childAt2.getMeasuredWidth();
            i16--;
        }
        while (true) {
            i14++;
            if (i14 >= this.f3372b) {
                return;
            }
            int i18 = i15 + this.f3377g;
            View childAt3 = getChildAt(i14);
            childAt3.layout(i18, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i18, (childAt3.getMeasuredHeight() / 2) + paddingTop);
            i15 = i18 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int m2529a;
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        if (this.f3379i || this.f3372b == (m2529a = m2529a(measuredWidth))) {
            return;
        }
        this.f3372b = m2529a;
        m2531d();
    }

    public void setNumberOfThumbs(int i10) {
        this.f3379i = true;
        this.f3372b = i10;
        m2531d();
    }

    public void setThumbSpace(int i10) {
        this.f3377g = i10;
        requestLayout();
    }
}
