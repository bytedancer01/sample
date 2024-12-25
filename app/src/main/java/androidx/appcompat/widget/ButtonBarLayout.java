package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0925f;
import p029c.C0929j;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/ButtonBarLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ButtonBarLayout.class */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f1773b;

    /* renamed from: c */
    public int f1774c;

    /* renamed from: d */
    public int f1775d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1774c = -1;
        this.f1775d = 0;
        int[] iArr = C0929j.f6353O0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C6824g0.m31535n0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1773b = obtainStyledAttributes.getBoolean(C0929j.f6358P0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z10) {
        setOrientation(z10 ? 1 : 0);
        setGravity(z10 ? 8388613 : 80);
        View findViewById = findViewById(C0925f.f6207G);
        if (findViewById != null) {
            findViewById.setVisibility(z10 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    public final int m1118a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean m1119b() {
        boolean z10 = true;
        if (getOrientation() != 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f1775d, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1773b) {
            if (size > this.f1774c && m1119b()) {
                setStacked(false);
            }
            this.f1774c = size;
        }
        if (m1119b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        boolean z11 = z10;
        if (this.f1773b) {
            z11 = z10;
            if (!m1119b()) {
                z11 = z10;
                if ((getMeasuredWidthAndState() & DefaultRenderer.BACKGROUND_COLOR) == 16777216) {
                    setStacked(true);
                    z11 = true;
                }
            }
        }
        if (z11) {
            super.onMeasure(i10, i11);
        }
        int m1118a = m1118a(0);
        int i13 = 0;
        if (m1118a >= 0) {
            View childAt = getChildAt(m1118a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1119b()) {
                int m1118a2 = m1118a(m1118a + 1);
                i13 = paddingTop;
                if (m1118a2 >= 0) {
                    i13 = paddingTop + getChildAt(m1118a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (C6824g0.m31475D(this) != i13) {
            setMinimumHeight(i13);
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1773b != z10) {
            this.f1773b = z10;
            if (!z10 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
