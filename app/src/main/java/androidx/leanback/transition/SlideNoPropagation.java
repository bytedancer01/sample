package androidx.leanback.transition;

import android.content.Context;
import android.transition.Slide;
import android.util.AttributeSet;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/transition/SlideNoPropagation.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideNoPropagation.class */
public class SlideNoPropagation extends Slide {
    public SlideNoPropagation() {
    }

    public SlideNoPropagation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.transition.Slide
    public void setSlideEdge(int i10) {
        super.setSlideEdge(i10);
        setPropagation(null);
    }
}
