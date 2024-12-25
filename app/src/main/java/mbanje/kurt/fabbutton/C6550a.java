package mbanje.kurt.fabbutton;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mbanje/kurt/fabbutton/a.class
 */
/* renamed from: mbanje.kurt.fabbutton.a */
/* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a.class */
public class C6550a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/a$a.class
     */
    /* renamed from: mbanje.kurt.fabbutton.a$a */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a$a.class */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final g f34272b;

        /* renamed from: c */
        public final View f34273c;

        public a(g gVar, View view) {
            this.f34272b = gVar;
            this.f34273c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34272b.mo30215a(-1.0f, -1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f);
            this.f34273c.invalidate();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/a$b.class
     */
    /* renamed from: mbanje.kurt.fabbutton.a$b */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a$b.class */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final g f34274b;

        /* renamed from: c */
        public final View f34275c;

        public b(g gVar, View view) {
            this.f34274b = gVar;
            this.f34275c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34274b.mo30215a(-1.0f, -1.0f, -1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f34275c.invalidate();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/a$c.class
     */
    /* renamed from: mbanje.kurt.fabbutton.a$c */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a$c.class */
    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final g f34276b;

        /* renamed from: c */
        public final View f34277c;

        public c(g gVar, View view) {
            this.f34276b = gVar;
            this.f34277c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34276b.mo30215a(((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f, -1.0f);
            this.f34277c.invalidate();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/a$d.class
     */
    /* renamed from: mbanje.kurt.fabbutton.a$d */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a$d.class */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final g f34278b;

        public d(g gVar) {
            this.f34278b = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34278b.mo30215a(-1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/a$e.class
     */
    /* renamed from: mbanje.kurt.fabbutton.a$e */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a$e.class */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final float f34279b;

        /* renamed from: c */
        public final g f34280c;

        /* renamed from: d */
        public final View f34281d;

        public e(float f10, g gVar, View view) {
            this.f34279b = f10;
            this.f34280c = gVar;
            this.f34281d = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f34280c.mo30215a((285.0f - floatValue) + this.f34279b, -1.0f, floatValue, -1.0f);
            this.f34281d.invalidate();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/a$f.class
     */
    /* renamed from: mbanje.kurt.fabbutton.a$f */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a$f.class */
    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final g f34282b;

        public f(g gVar) {
            this.f34282b = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34282b.mo30215a(-1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/a$g.class
     */
    /* renamed from: mbanje.kurt.fabbutton.a$g */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/a$g.class */
    public interface g {
        /* renamed from: a */
        void mo30215a(float f10, float f11, float f12, float f13);
    }

    /* renamed from: a */
    public static AnimatorSet m30222a(View view, float f10, int i10, g gVar) {
        float f11 = (270.0f * f10) - 90.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, 285.0f);
        long j10 = (i10 / 4) / 2;
        ofFloat.setDuration(j10);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new c(gVar, view));
        float f12 = ((f10 + 0.5f) * 720.0f) / 4.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f10 * 720.0f) / 4.0f, f12);
        ofFloat2.setDuration(j10);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new d(gVar));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, (285.0f + f11) - 15.0f);
        ofFloat3.setDuration(j10);
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new e(f11, gVar, view));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f12, ((f10 + 1.0f) * 720.0f) / 4.0f);
        ofFloat4.setDuration(j10);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new f(gVar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* renamed from: b */
    public static ValueAnimator m30223b(View view, float f10, float f11, g gVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new b(gVar, view));
        return ofFloat;
    }

    /* renamed from: c */
    public static ValueAnimator m30224c(View view, float f10, float f11, g gVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setDuration(5000L);
        ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat.addUpdateListener(new a(gVar, view));
        return ofFloat;
    }
}
