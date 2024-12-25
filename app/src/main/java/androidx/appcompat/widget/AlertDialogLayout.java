package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0351s0;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0925f;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/AlertDialogLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/AlertDialogLayout.class */
public class AlertDialogLayout extends C0351s0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: j */
    private void m1113j(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        for (int i12 = 0; i12 < i10; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0351s0.a aVar = (C0351s0.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    /* renamed from: y */
    private void m1114y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    /* renamed from: z */
    public static int m1115z(View view) {
        int m31475D = C6824g0.m31475D(view);
        if (m31475D > 0) {
            return m31475D;
        }
        if (!(view instanceof ViewGroup)) {
            return 0;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 1) {
            return m1115z(viewGroup.getChildAt(0));
        }
        return 0;
    }

    /* renamed from: A */
    public final boolean m1116A(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == C0925f.f6216P) {
                    view = childAt;
                } else if (id2 == C0925f.f6227k) {
                    view2 = childAt;
                } else {
                    if ((id2 != C0925f.f6229m && id2 != C0925f.f6231o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i10, 0);
            paddingTop += view.getMeasuredHeight();
            i12 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i12 = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i13 = m1115z(view2);
            i14 = view2.getMeasuredHeight() - i13;
            paddingTop += i13;
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i15 = view3.getMeasuredHeight();
            paddingTop += i15;
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        } else {
            i15 = 0;
        }
        int i18 = size - paddingTop;
        int i19 = i12;
        int i20 = i18;
        int i21 = paddingTop;
        if (view2 != null) {
            int min = Math.min(i18, i14);
            int i22 = i18;
            int i23 = i13;
            if (min > 0) {
                i22 = i18 - min;
                i23 = i13 + min;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i23, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH));
            i21 = (paddingTop - i13) + view2.getMeasuredHeight();
            i20 = i22;
            i19 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        }
        int i24 = i19;
        int i25 = i21;
        if (view3 != null) {
            i24 = i19;
            i25 = i21;
            if (i20 > 0) {
                view3.measure(i10, View.MeasureSpec.makeMeasureSpec(i15 + i20, mode));
                i25 = (i21 - i15) + view3.getMeasuredHeight();
                i24 = View.combineMeasuredStates(i19, view3.getMeasuredState());
            }
        }
        int i26 = 0;
        int i27 = 0;
        while (true) {
            i16 = i27;
            if (i26 >= childCount) {
                break;
            }
            View childAt2 = getChildAt(i26);
            int i28 = i16;
            if (childAt2.getVisibility() != 8) {
                i28 = Math.max(i16, childAt2.getMeasuredWidth());
            }
            i26++;
            i27 = i28;
        }
        setMeasuredDimension(View.resolveSizeAndState(i16 + getPaddingLeft() + getPaddingRight(), i10, i24), View.resolveSizeAndState(i25, i11, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        m1113j(childCount, i11);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    @Override // androidx.appcompat.widget.C0351s0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.C0351s0, android.view.View
    public void onMeasure(int i10, int i11) {
        if (m1116A(i10, i11)) {
            return;
        }
        super.onMeasure(i10, i11);
    }
}
