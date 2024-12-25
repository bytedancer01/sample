package p167jb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p167jb.InterfaceC5351d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jb/a.class
 */
/* renamed from: jb.a */
/* loaded from: combined.jar:classes2.jar:jb/a.class */
public final class C5348a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jb/a$a.class
     */
    /* renamed from: jb.a$a */
    /* loaded from: combined.jar:classes2.jar:jb/a$a.class */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final InterfaceC5351d f30658b;

        public a(InterfaceC5351d interfaceC5351d) {
            this.f30658b = interfaceC5351d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30658b.mo26626b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f30658b.mo26625a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m26623a(InterfaceC5351d interfaceC5351d, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC5351d, (Property<InterfaceC5351d, V>) InterfaceC5351d.c.f30662a, (TypeEvaluator) InterfaceC5351d.b.f30660b, (Object[]) new InterfaceC5351d.e[]{new InterfaceC5351d.e(f10, f11, f12)});
        InterfaceC5351d.e revealInfo = interfaceC5351d.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC5351d, (int) f10, (int) f11, revealInfo.f30666c, f12);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m26624b(InterfaceC5351d interfaceC5351d) {
        return new a(interfaceC5351d);
    }
}
