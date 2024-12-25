package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/NonOverlappingLinearLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/NonOverlappingLinearLayout.class */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f3225b;

    /* renamed from: c */
    public boolean f3226c;

    /* renamed from: d */
    public final ArrayList<ArrayList<View>> f3227d;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3225b = false;
        this.f3227d = new ArrayList<>();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(View view) {
        int i10;
        if (!this.f3226c) {
            super.focusableViewAvailable(view);
            return;
        }
        View view2 = view;
        while (true) {
            View view3 = view2;
            if (view3 == this || view3 == null) {
                break;
            }
            if (view3.getParent() == this) {
                i10 = indexOfChild(view3);
                break;
            }
            view2 = (View) view3.getParent();
        }
        i10 = -1;
        if (i10 != -1) {
            this.f3227d.get(i10).add(view);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        try {
            boolean z11 = this.f3225b && getOrientation() == 0 && getLayoutDirection() == 1;
            this.f3226c = z11;
            if (z11) {
                while (this.f3227d.size() > getChildCount()) {
                    ArrayList<ArrayList<View>> arrayList = this.f3227d;
                    arrayList.remove(arrayList.size() - 1);
                }
                while (this.f3227d.size() < getChildCount()) {
                    this.f3227d.add(new ArrayList<>());
                }
            }
            super.onLayout(z10, i10, i11, i12, i13);
            if (this.f3226c) {
                for (int i14 = 0; i14 < this.f3227d.size(); i14++) {
                    for (int i15 = 0; i15 < this.f3227d.get(i14).size(); i15++) {
                        super.focusableViewAvailable(this.f3227d.get(i14).get(i15));
                    }
                }
            }
            if (this.f3226c) {
                this.f3226c = false;
                for (int i16 = 0; i16 < this.f3227d.size(); i16++) {
                    this.f3227d.get(i16).clear();
                }
            }
        } catch (Throwable th2) {
            if (this.f3226c) {
                this.f3226c = false;
                for (int i17 = 0; i17 < this.f3227d.size(); i17++) {
                    this.f3227d.get(i17).clear();
                }
            }
            throw th2;
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z10) {
        this.f3225b = z10;
    }
}
