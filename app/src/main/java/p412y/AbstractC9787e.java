package p412y;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.AbstractC0375b;
import androidx.constraintlayout.widget.ConstraintLayout;
import p373w.C9391k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y/e.class
 */
/* renamed from: y.e */
/* loaded from: combined.jar:classes1.jar:y/e.class */
public abstract class AbstractC9787e extends AbstractC0375b {

    /* renamed from: j */
    public boolean f44916j;

    /* renamed from: k */
    public boolean f44917k;

    @Override // androidx.constraintlayout.widget.AbstractC0375b
    /* renamed from: g */
    public void mo1691g(AttributeSet attributeSet) {
        super.mo1691g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9786d.f44753a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C9786d.f44767c1) {
                    this.f44916j = true;
                } else if (index == C9786d.f44802h1) {
                    this.f44917k = true;
                }
            }
        }
    }

    /* renamed from: n */
    public void m41283n(C9391k c9391k, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0375b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f44916j || this.f44917k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f2474c; i10++) {
                View m1701h = constraintLayout.m1701h(this.f2473b[i10]);
                if (m1701h != null) {
                    if (this.f44916j) {
                        m1701h.setVisibility(visibility);
                    }
                    if (this.f44917k && elevation > 0.0f) {
                        m1701h.setTranslationZ(m1701h.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m1723c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        m1723c();
    }
}
