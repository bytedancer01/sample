package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/Guideline.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/Guideline.class */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.C0372b c0372b = (ConstraintLayout.C0372b) getLayoutParams();
        c0372b.f2415a = i10;
        setLayoutParams(c0372b);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.C0372b c0372b = (ConstraintLayout.C0372b) getLayoutParams();
        c0372b.f2417b = i10;
        setLayoutParams(c0372b);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.C0372b c0372b = (ConstraintLayout.C0372b) getLayoutParams();
        c0372b.f2419c = f10;
        setLayoutParams(c0372b);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
