package com.maxdigitall.maxdigitaliptvbox.view.utility;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/LoadingGearSpinner.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/LoadingGearSpinner.class */
public class LoadingGearSpinner extends ImageView {
    public LoadingGearSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m19722a() {
        clearAnimation();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        startAnimation(rotateAnimation);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setImageResource(2131231098);
        m19722a();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        if (i10 == 0) {
            m19722a();
        } else {
            clearAnimation();
        }
        super.setVisibility(i10);
    }
}
