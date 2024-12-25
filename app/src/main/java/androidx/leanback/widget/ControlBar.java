package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/ControlBar.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/ControlBar.class */
class ControlBar extends LinearLayout {

    /* renamed from: b */
    public int f3190b;

    /* renamed from: c */
    public InterfaceC0466a f3191c;

    /* renamed from: d */
    public int f3192d;

    /* renamed from: e */
    public boolean f3193e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/ControlBar$a.class
     */
    /* renamed from: androidx.leanback.widget.ControlBar$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/ControlBar$a.class */
    public interface InterfaceC0466a {
        /* renamed from: a */
        void m2457a(View view, View view2);
    }

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3192d = -1;
        this.f3193e = true;
    }

    /* renamed from: a */
    public int m2456a() {
        return this.f3193e ? getChildCount() / 2 : 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        int m2456a;
        if (i10 != 33 && i10 != 130) {
            super.addFocusables(arrayList, i10, i11);
            return;
        }
        int i12 = this.f3192d;
        if (i12 >= 0 && i12 < getChildCount()) {
            m2456a = this.f3192d;
        } else if (getChildCount() <= 0) {
            return;
        } else {
            m2456a = m2456a();
        }
        arrayList.add(getChildAt(m2456a));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3190b <= 0) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i12 >= getChildCount() - 1) {
                setMeasuredDimension(getMeasuredWidth() + i14, getMeasuredHeight());
                return;
            }
            View childAt = getChildAt(i12);
            i12++;
            View childAt2 = getChildAt(i12);
            int measuredWidth = this.f3190b - ((childAt.getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            int marginStart = layoutParams.getMarginStart();
            layoutParams.setMarginStart(measuredWidth);
            childAt2.setLayoutParams(layoutParams);
            i13 = i14 + (measuredWidth - marginStart);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (getChildCount() > 0) {
            int i11 = this.f3192d;
            if (getChildAt((i11 < 0 || i11 >= getChildCount()) ? m2456a() : this.f3192d).requestFocus(i10, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f3192d = indexOfChild(view);
        InterfaceC0466a interfaceC0466a = this.f3191c;
        if (interfaceC0466a != null) {
            interfaceC0466a.m2457a(view, view2);
        }
    }
}
