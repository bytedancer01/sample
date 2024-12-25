package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import p413y0.C9793f;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/transition/SlideKitkat.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat.class */
class SlideKitkat extends Visibility {

    /* renamed from: d */
    public static final TimeInterpolator f3159d = new DecelerateInterpolator();

    /* renamed from: e */
    public static final TimeInterpolator f3160e = new AccelerateInterpolator();

    /* renamed from: f */
    public static final InterfaceC0458g f3161f = new C0452a();

    /* renamed from: g */
    public static final InterfaceC0458g f3162g = new C0453b();

    /* renamed from: h */
    public static final InterfaceC0458g f3163h = new C0454c();

    /* renamed from: i */
    public static final InterfaceC0458g f3164i = new C0455d();

    /* renamed from: j */
    public static final InterfaceC0458g f3165j = new C0456e();

    /* renamed from: k */
    public static final InterfaceC0458g f3166k = new C0457f();

    /* renamed from: b */
    public int f3167b;

    /* renamed from: c */
    public InterfaceC0458g f3168c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$a.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$a.class */
    public static final class C0452a extends AbstractC0459h {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: a */
        public float mo2448a(View view) {
            return view.getTranslationX() - view.getWidth();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$b.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$b.class */
    public static final class C0453b extends AbstractC0460i {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: a */
        public float mo2448a(View view) {
            return view.getTranslationY() - view.getHeight();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$c.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$c.class */
    public static final class C0454c extends AbstractC0459h {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: a */
        public float mo2448a(View view) {
            return view.getTranslationX() + view.getWidth();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$d.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$d.class */
    public static final class C0455d extends AbstractC0460i {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: a */
        public float mo2448a(View view) {
            return view.getTranslationY() + view.getHeight();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$e.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$e */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$e.class */
    public static final class C0456e extends AbstractC0459h {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: a */
        public float mo2448a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$f.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$f */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$f.class */
    public static final class C0457f extends AbstractC0459h {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: a */
        public float mo2448a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$g.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$g */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$g.class */
    public interface InterfaceC0458g {
        /* renamed from: a */
        float mo2448a(View view);

        /* renamed from: b */
        float mo2449b(View view);

        /* renamed from: c */
        Property<View, Float> mo2450c();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$h.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$h */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$h.class */
    public static abstract class AbstractC0459h implements InterfaceC0458g {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: b */
        public float mo2449b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: c */
        public Property<View, Float> mo2450c() {
            return View.TRANSLATION_X;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$i.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$i */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$i.class */
    public static abstract class AbstractC0460i implements InterfaceC0458g {
        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: b */
        public float mo2449b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.leanback.transition.SlideKitkat.InterfaceC0458g
        /* renamed from: c */
        public Property<View, Float> mo2450c() {
            return View.TRANSLATION_Y;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/transition/SlideKitkat$j.class
     */
    /* renamed from: androidx.leanback.transition.SlideKitkat$j */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/transition/SlideKitkat$j.class */
    public static class C0461j extends AnimatorListenerAdapter {

        /* renamed from: b */
        public boolean f3169b = false;

        /* renamed from: c */
        public float f3170c;

        /* renamed from: d */
        public final View f3171d;

        /* renamed from: e */
        public final float f3172e;

        /* renamed from: f */
        public final float f3173f;

        /* renamed from: g */
        public final int f3174g;

        /* renamed from: h */
        public final Property<View, Float> f3175h;

        public C0461j(View view, Property<View, Float> property, float f10, float f11, int i10) {
            this.f3175h = property;
            this.f3171d = view;
            this.f3173f = f10;
            this.f3172e = f11;
            this.f3174g = i10;
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3171d.setTag(C9793f.f44999u, new float[]{this.f3171d.getTranslationX(), this.f3171d.getTranslationY()});
            this.f3175h.set(this.f3171d, Float.valueOf(this.f3173f));
            this.f3169b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3169b) {
                this.f3175h.set(this.f3171d, Float.valueOf(this.f3173f));
            }
            this.f3171d.setVisibility(this.f3174g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f3170c = this.f3175h.get(this.f3171d).floatValue();
            this.f3175h.set(this.f3171d, Float.valueOf(this.f3172e));
            this.f3171d.setVisibility(this.f3174g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f3175h.set(this.f3171d, Float.valueOf(this.f3170c));
            this.f3171d.setVisibility(0);
        }
    }

    public SlideKitkat() {
        m2447b(80);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45068e0);
        m2447b(obtainStyledAttributes.getInt(C9799l.f45076i0, 80));
        long j10 = obtainStyledAttributes.getInt(C9799l.f45072g0, -1);
        if (j10 >= 0) {
            setDuration(j10);
        }
        long j11 = obtainStyledAttributes.getInt(C9799l.f45074h0, -1);
        if (j11 > 0) {
            setStartDelay(j11);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C9799l.f45070f0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final Animator m2446a(View view, Property<View, Float> property, float f10, float f11, float f12, TimeInterpolator timeInterpolator, int i10) {
        int i11 = C9793f.f44999u;
        float[] fArr = (float[]) view.getTag(i11);
        if (fArr != null) {
            f10 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(i11, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f10, f11);
        C0461j c0461j = new C0461j(view, property, f12, f11, i10);
        ofFloat.addListener(c0461j);
        ofFloat.addPauseListener(c0461j);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    /* renamed from: b */
    public void m2447b(int i10) {
        InterfaceC0458g interfaceC0458g;
        if (i10 == 3) {
            interfaceC0458g = f3161f;
        } else if (i10 == 5) {
            interfaceC0458g = f3163h;
        } else if (i10 == 48) {
            interfaceC0458g = f3162g;
        } else if (i10 == 80) {
            interfaceC0458g = f3164i;
        } else if (i10 == 8388611) {
            interfaceC0458g = f3165j;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            interfaceC0458g = f3166k;
        }
        this.f3168c = interfaceC0458g;
        this.f3167b = i10;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i10, TransitionValues transitionValues2, int i11) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float mo2449b = this.f3168c.mo2449b(view);
        return m2446a(view, this.f3168c.mo2450c(), this.f3168c.mo2448a(view), mo2449b, mo2449b, f3159d, 0);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i10, TransitionValues transitionValues2, int i11) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float mo2449b = this.f3168c.mo2449b(view);
        return m2446a(view, this.f3168c.mo2450c(), mo2449b, this.f3168c.mo2448a(view), mo2449b, f3160e, 4);
    }
}
