package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/transition/FadeAndShortSlide.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide.class */
public class FadeAndShortSlide extends Visibility {

    /* renamed from: f */
    public static final TimeInterpolator f3145f = new DecelerateInterpolator();

    /* renamed from: g */
    public static final AbstractC0450g f3146g = new C0444a();

    /* renamed from: h */
    public static final AbstractC0450g f3147h = new C0445b();

    /* renamed from: i */
    public static final AbstractC0450g f3148i = new C0446c();

    /* renamed from: j */
    public static final AbstractC0450g f3149j = new C0447d();

    /* renamed from: k */
    public static final AbstractC0450g f3150k = new C0448e();

    /* renamed from: b */
    public AbstractC0450g f3151b;

    /* renamed from: c */
    public Visibility f3152c;

    /* renamed from: d */
    public float f3153d;

    /* renamed from: e */
    public final AbstractC0450g f3154e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/FadeAndShortSlide$a.class
     */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide$a.class */
    public static final class C0444a extends AbstractC0450g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0450g
        /* renamed from: a */
        public float mo2443a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z10 = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z10 = false;
            }
            float translationX = view.getTranslationX();
            float m2440b = fadeAndShortSlide.m2440b(viewGroup);
            return z10 ? translationX + m2440b : translationX - m2440b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/FadeAndShortSlide$b.class
     */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide$b.class */
    public static final class C0445b extends AbstractC0450g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0450g
        /* renamed from: a */
        public float mo2443a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z10 = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z10 = false;
            }
            float translationX = view.getTranslationX();
            float m2440b = fadeAndShortSlide.m2440b(viewGroup);
            return z10 ? translationX - m2440b : translationX + m2440b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/FadeAndShortSlide$c.class
     */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide$c.class */
    public static final class C0446c extends AbstractC0450g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0450g
        /* renamed from: a */
        public float mo2443a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int i10 = iArr[0];
            int width = view.getWidth() / 2;
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            int width2 = epicenter == null ? iArr[0] + (viewGroup.getWidth() / 2) : epicenter.centerX();
            float translationX = view.getTranslationX();
            float m2440b = fadeAndShortSlide.m2440b(viewGroup);
            return i10 + width < width2 ? translationX - m2440b : translationX + m2440b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/FadeAndShortSlide$d.class
     */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide$d.class */
    public static final class C0447d extends AbstractC0450g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0450g
        /* renamed from: b */
        public float mo2444b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() + fadeAndShortSlide.m2441c(viewGroup);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/FadeAndShortSlide$e.class
     */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$e */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide$e.class */
    public static final class C0448e extends AbstractC0450g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0450g
        /* renamed from: b */
        public float mo2444b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.m2441c(viewGroup);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/FadeAndShortSlide$f.class
     */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$f */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide$f.class */
    public class C0449f extends AbstractC0450g {

        /* renamed from: a */
        public final FadeAndShortSlide f3155a;

        public C0449f(FadeAndShortSlide fadeAndShortSlide) {
            this.f3155a = fadeAndShortSlide;
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.AbstractC0450g
        /* renamed from: b */
        public float mo2444b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int i10 = iArr[1];
            int height = view.getHeight() / 2;
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = this.f3155a.getEpicenter();
            int height2 = epicenter == null ? iArr[1] + (viewGroup.getHeight() / 2) : epicenter.centerY();
            float translationY = view.getTranslationY();
            float m2441c = fadeAndShortSlide.m2441c(viewGroup);
            return i10 + height < height2 ? translationY - m2441c : translationY + m2441c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/FadeAndShortSlide$g.class
     */
    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$g */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/FadeAndShortSlide$g.class */
    public static abstract class AbstractC0450g {
        /* renamed from: a */
        public float mo2443a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        /* renamed from: b */
        public float mo2444b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide() {
        this(8388611);
    }

    public FadeAndShortSlide(int i10) {
        this.f3152c = new Fade();
        this.f3153d = -1.0f;
        this.f3154e = new C0449f(this);
        m2442d(i10);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3152c = new Fade();
        this.f3153d = -1.0f;
        this.f3154e = new C0449f(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45068e0);
        m2442d(obtainStyledAttributes.getInt(C9799l.f45076i0, 8388611));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void m2439a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Transition
    public Transition addListener(Transition.TransitionListener transitionListener) {
        this.f3152c.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    /* renamed from: b */
    public float m2440b(ViewGroup viewGroup) {
        float f10 = this.f3153d;
        if (f10 < 0.0f) {
            f10 = viewGroup.getWidth() / 4;
        }
        return f10;
    }

    /* renamed from: c */
    public float m2441c(ViewGroup viewGroup) {
        float f10 = this.f3153d;
        if (f10 < 0.0f) {
            f10 = viewGroup.getHeight() / 4;
        }
        return f10;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        this.f3152c.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        m2439a(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        this.f3152c.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        m2439a(transitionValues);
    }

    @Override // android.transition.Transition
    public Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f3152c = (Visibility) this.f3152c.clone();
        return fadeAndShortSlide;
    }

    /* renamed from: d */
    public void m2442d(int i10) {
        AbstractC0450g abstractC0450g;
        if (i10 == 48) {
            abstractC0450g = f3150k;
        } else if (i10 == 80) {
            abstractC0450g = f3149j;
        } else if (i10 == 112) {
            abstractC0450g = this.f3154e;
        } else if (i10 == 8388611) {
            abstractC0450g = f3146g;
        } else if (i10 == 8388613) {
            abstractC0450g = f3147h;
        } else {
            if (i10 != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            abstractC0450g = f3148i;
        }
        this.f3151b = abstractC0450g;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i10 = iArr[0];
        int i11 = iArr[1];
        float translationX = view.getTranslationX();
        Animator m2452a = C0463b.m2452a(view, transitionValues2, i10, i11, this.f3151b.mo2443a(this, viewGroup, view, iArr), this.f3151b.mo2444b(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f3145f, this);
        Animator onAppear = this.f3152c.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (m2452a == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return m2452a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(m2452a).with(onAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        Animator m2452a = C0463b.m2452a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f3151b.mo2443a(this, viewGroup, view, iArr), this.f3151b.mo2444b(this, viewGroup, view, iArr), f3145f, this);
        Animator onDisappear = this.f3152c.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (m2452a == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return m2452a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(m2452a).with(onDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f3152c.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f3152c.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }
}
