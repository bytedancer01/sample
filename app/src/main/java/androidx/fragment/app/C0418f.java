package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0440z;
import p175k0.C5441b;
import p235o0.ViewTreeObserverOnPreDrawListenerC6865z;
import p374w0.C9393a;
import p374w0.C9394b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/f.class
 */
/* renamed from: androidx.fragment.app.f */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/f.class */
public class C0418f {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/f$a.class
     */
    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/f$a.class */
    public class a implements C5441b.a {

        /* renamed from: a */
        public final Fragment f2881a;

        public a(Fragment fragment) {
            this.f2881a = fragment;
        }

        @Override // p175k0.C5441b.a
        public void onCancel() {
            if (this.f2881a.getAnimatingAway() != null) {
                View animatingAway = this.f2881a.getAnimatingAway();
                this.f2881a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f2881a.setAnimator(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/f$b.class
     */
    /* renamed from: androidx.fragment.app.f$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/f$b.class */
    public class b implements Animation.AnimationListener {

        /* renamed from: a */
        public final ViewGroup f2882a;

        /* renamed from: b */
        public final Fragment f2883b;

        /* renamed from: c */
        public final C0440z.g f2884c;

        /* renamed from: d */
        public final C5441b f2885d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/fragment/app/f$b$a.class
         */
        /* renamed from: androidx.fragment.app.f$b$a */
        /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/f$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final b f2886b;

            public a(b bVar) {
                this.f2886b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f2886b.f2883b.getAnimatingAway() != null) {
                    this.f2886b.f2883b.setAnimatingAway(null);
                    b bVar = this.f2886b;
                    bVar.f2884c.mo2258a(bVar.f2883b, bVar.f2885d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, C0440z.g gVar, C5441b c5441b) {
            this.f2882a = viewGroup;
            this.f2883b = fragment;
            this.f2884c = gVar;
            this.f2885d = c5441b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2882a.post(new a(this));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/f$c.class
     */
    /* renamed from: androidx.fragment.app.f$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/f$c.class */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final ViewGroup f2887b;

        /* renamed from: c */
        public final View f2888c;

        /* renamed from: d */
        public final Fragment f2889d;

        /* renamed from: e */
        public final C0440z.g f2890e;

        /* renamed from: f */
        public final C5441b f2891f;

        public c(ViewGroup viewGroup, View view, Fragment fragment, C0440z.g gVar, C5441b c5441b) {
            this.f2887b = viewGroup;
            this.f2888c = view;
            this.f2889d = fragment;
            this.f2890e = gVar;
            this.f2891f = c5441b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2887b.endViewTransition(this.f2888c);
            Animator animator2 = this.f2889d.getAnimator();
            this.f2889d.setAnimator(null);
            if (animator2 == null || this.f2887b.indexOfChild(this.f2888c) >= 0) {
                return;
            }
            this.f2890e.mo2258a(this.f2889d, this.f2891f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/f$d.class
     */
    /* renamed from: androidx.fragment.app.f$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/f$d.class */
    public static class d {

        /* renamed from: a */
        public final Animation f2892a;

        /* renamed from: b */
        public final Animator f2893b;

        public d(Animator animator) {
            this.f2892a = null;
            this.f2893b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.f2892a = animation;
            this.f2893b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/f$e.class
     */
    /* renamed from: androidx.fragment.app.f$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/f$e.class */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f2894b;

        /* renamed from: c */
        public final View f2895c;

        /* renamed from: d */
        public boolean f2896d;

        /* renamed from: e */
        public boolean f2897e;

        /* renamed from: f */
        public boolean f2898f;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2898f = true;
            this.f2894b = viewGroup;
            this.f2895c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2898f = true;
            if (this.f2896d) {
                return !this.f2897e;
            }
            if (super.getTransformation(j10, transformation)) {
                return true;
            }
            this.f2896d = true;
            ViewTreeObserverOnPreDrawListenerC6865z.m31685a(this.f2894b, this);
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2898f = true;
            if (this.f2896d) {
                return !this.f2897e;
            }
            if (super.getTransformation(j10, transformation, f10)) {
                return true;
            }
            this.f2896d = true;
            ViewTreeObserverOnPreDrawListenerC6865z.m31685a(this.f2894b, this);
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2896d || !this.f2898f) {
                this.f2894b.endViewTransition(this.f2895c);
                this.f2897e = true;
            } else {
                this.f2898f = false;
                this.f2894b.post(this);
            }
        }
    }

    /* renamed from: a */
    public static void m2071a(Fragment fragment, d dVar, C0440z.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        C5441b c5441b = new C5441b();
        c5441b.m27193d(new a(fragment));
        gVar.mo2259b(fragment, c5441b);
        if (dVar.f2892a != null) {
            e eVar = new e(dVar.f2892a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, c5441b));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2893b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, c5441b));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: b */
    public static int m2072b(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* renamed from: c */
    public static d m2073c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int m2072b = m2072b(fragment, z10, z11);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = C9394b.f43077c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, m2072b);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, m2072b);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        int i11 = m2072b;
        if (m2072b == 0) {
            i11 = m2072b;
            if (nextTransition != 0) {
                i11 = m2074d(nextTransition, z10);
            }
        }
        if (i11 == 0) {
            return null;
        }
        boolean equals = "anim".equals(context.getResources().getResourceTypeName(i11));
        boolean z12 = false;
        if (equals) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, i11);
                if (loadAnimation != null) {
                    return new d(loadAnimation);
                }
                z12 = true;
            } catch (Resources.NotFoundException e10) {
                throw e10;
            } catch (RuntimeException e11) {
                z12 = false;
            }
        }
        if (z12) {
            return null;
        }
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
            if (loadAnimator != null) {
                return new d(loadAnimator);
            }
            return null;
        } catch (RuntimeException e12) {
            if (equals) {
                throw e12;
            }
            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i11);
            if (loadAnimation2 != null) {
                return new d(loadAnimation2);
            }
            return null;
        }
    }

    /* renamed from: d */
    public static int m2074d(int i10, boolean z10) {
        return i10 != 4097 ? i10 != 4099 ? i10 != 8194 ? -1 : z10 ? C9393a.f43069a : C9393a.f43070b : z10 ? C9393a.f43071c : C9393a.f43072d : z10 ? C9393a.f43073e : C9393a.f43074f;
    }
}
