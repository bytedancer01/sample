package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import p413y0.C9793f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/transition/b.class
 */
/* renamed from: androidx.leanback.transition.b */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/b.class */
public class C0463b {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/b$a.class
     */
    /* renamed from: androidx.leanback.transition.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/b$a.class */
    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: b */
        public final View f3176b;

        /* renamed from: c */
        public final View f3177c;

        /* renamed from: d */
        public final int f3178d;

        /* renamed from: e */
        public final int f3179e;

        /* renamed from: f */
        public int[] f3180f;

        /* renamed from: g */
        public float f3181g;

        /* renamed from: h */
        public float f3182h;

        /* renamed from: i */
        public final float f3183i;

        /* renamed from: j */
        public final float f3184j;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f3177c = view;
            this.f3176b = view2;
            this.f3178d = i10 - Math.round(view.getTranslationX());
            this.f3179e = i11 - Math.round(view.getTranslationY());
            this.f3183i = f10;
            this.f3184j = f11;
            int i12 = C9793f.f44978E;
            int[] iArr = (int[]) view2.getTag(i12);
            this.f3180f = iArr;
            if (iArr != null) {
                view2.setTag(i12, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3180f == null) {
                this.f3180f = new int[2];
            }
            this.f3180f[0] = Math.round(this.f3178d + this.f3177c.getTranslationX());
            this.f3180f[1] = Math.round(this.f3179e + this.f3177c.getTranslationY());
            this.f3176b.setTag(C9793f.f44978E, this.f3180f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f3181g = this.f3177c.getTranslationX();
            this.f3182h = this.f3177c.getTranslationY();
            this.f3177c.setTranslationX(this.f3183i);
            this.f3177c.setTranslationY(this.f3184j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f3177c.setTranslationX(this.f3181g);
            this.f3177c.setTranslationY(this.f3182h);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3177c.setTranslationX(this.f3183i);
            this.f3177c.setTranslationY(this.f3184j);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a */
    public static Animator m2452a(View view, TransitionValues transitionValues, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(C9793f.f44978E)) != null) {
            f10 = (r0[0] - i10) + translationX;
            f11 = (r0[1] - i11) + translationY;
        }
        int round = Math.round(f10 - translationX);
        int round2 = Math.round(f11 - translationY);
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        a aVar = new a(view, transitionValues.view, round + i10, i11 + round2, translationX, translationY);
        transition.addListener(aVar);
        ofFloat.addListener(aVar);
        ofFloat.addPauseListener(aVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }
}
