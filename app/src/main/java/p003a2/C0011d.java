package p003a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/d.class
 */
/* renamed from: a2.d */
/* loaded from: combined.jar:classes1.jar:a2/d.class */
public class C0011d extends AbstractC0032n0 {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/d$a.class
     */
    /* renamed from: a2.d$a */
    /* loaded from: combined.jar:classes1.jar:a2/d$a.class */
    public class a extends C0029m {

        /* renamed from: b */
        public final View f53b;

        /* renamed from: c */
        public final C0011d f54c;

        public a(C0011d c0011d, View view) {
            this.f54c = c0011d;
            this.f53b = view;
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            C0006a0.m36g(this.f53b, 1.0f);
            C0006a0.m30a(this.f53b);
            abstractC0027l.mo134V(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/d$b.class
     */
    /* renamed from: a2.d$b */
    /* loaded from: combined.jar:classes1.jar:a2/d$b.class */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final View f55b;

        /* renamed from: c */
        public boolean f56c = false;

        public b(View view) {
            this.f55b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0006a0.m36g(this.f55b, 1.0f);
            if (this.f56c) {
                this.f55b.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C6824g0.m31498Q(this.f55b) && this.f55b.getLayerType() == 0) {
                this.f56c = true;
                this.f55b.setLayerType(2, null);
            }
        }
    }

    public C0011d(int i10) {
        m174o0(i10);
    }

    /* renamed from: q0 */
    public static float m72q0(C0039s c0039s, float f10) {
        float f11 = f10;
        if (c0039s != null) {
            Float f12 = (Float) c0039s.f169a.get("android:fade:transitionAlpha");
            f11 = f10;
            if (f12 != null) {
                f11 = f12.floatValue();
            }
        }
        return f11;
    }

    @Override // p003a2.AbstractC0032n0, p003a2.AbstractC0027l
    /* renamed from: j */
    public void mo49j(C0039s c0039s) {
        super.mo49j(c0039s);
        c0039s.f169a.put("android:fade:transitionAlpha", Float.valueOf(C0006a0.m32c(c0039s.f170b)));
    }

    @Override // p003a2.AbstractC0032n0
    /* renamed from: l0 */
    public Animator mo73l0(ViewGroup viewGroup, View view, C0039s c0039s, C0039s c0039s2) {
        float m72q0 = m72q0(c0039s, 0.0f);
        if (m72q0 == 1.0f) {
            m72q0 = 0.0f;
        }
        return m75p0(view, m72q0, 1.0f);
    }

    @Override // p003a2.AbstractC0032n0
    /* renamed from: n0 */
    public Animator mo74n0(ViewGroup viewGroup, View view, C0039s c0039s, C0039s c0039s2) {
        C0006a0.m34e(view);
        return m75p0(view, m72q0(c0039s, 1.0f), 0.0f);
    }

    /* renamed from: p0 */
    public final Animator m75p0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C0006a0.m36g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0006a0.f14b, f11);
        ofFloat.addListener(new b(view));
        mo139a(new a(this, view));
        return ofFloat;
    }
}
