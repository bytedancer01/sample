package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.leanback.widget.AbstractC0512g0;
import p413y0.C9793f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/transition/ParallaxTransition.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/ParallaxTransition.class */
public class ParallaxTransition extends Visibility {

    /* renamed from: b */
    public static Interpolator f3156b = new LinearInterpolator();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/ParallaxTransition$a.class
     */
    /* renamed from: androidx.leanback.transition.ParallaxTransition$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/ParallaxTransition$a.class */
    public class C0451a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final AbstractC0512g0 f3157b;

        /* renamed from: c */
        public final ParallaxTransition f3158c;

        public C0451a(ParallaxTransition parallaxTransition, AbstractC0512g0 abstractC0512g0) {
            this.f3158c = parallaxTransition;
            this.f3157b = abstractC0512g0;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f3157b.m2601b();
        }
    }

    public ParallaxTransition() {
    }

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public Animator m2445a(View view) {
        AbstractC0512g0 abstractC0512g0 = (AbstractC0512g0) view.getTag(C9793f.f44990l);
        if (abstractC0512g0 == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(f3156b);
        ofFloat.addUpdateListener(new C0451a(this, abstractC0512g0));
        return ofFloat;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return m2445a(view);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return m2445a(view);
    }
}
