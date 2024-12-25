package p235o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/y0.class
 */
/* renamed from: o0.y0 */
/* loaded from: combined.jar:classes1.jar:o0/y0.class */
public final class C6864y0 {

    /* renamed from: a */
    public WeakReference<View> f35578a;

    /* renamed from: b */
    public Runnable f35579b = null;

    /* renamed from: c */
    public Runnable f35580c = null;

    /* renamed from: d */
    public int f35581d = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/y0$a.class
     */
    /* renamed from: o0.y0$a */
    /* loaded from: combined.jar:classes1.jar:o0/y0$a.class */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final InterfaceC6866z0 f35582b;

        /* renamed from: c */
        public final View f35583c;

        /* renamed from: d */
        public final C6864y0 f35584d;

        public a(C6864y0 c6864y0, InterfaceC6866z0 interfaceC6866z0, View view) {
            this.f35584d = c6864y0;
            this.f35582b = interfaceC6866z0;
            this.f35583c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35582b.mo1238a(this.f35583c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35582b.mo1239b(this.f35583c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f35582b.mo1240c(this.f35583c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/y0$b.class
     */
    /* renamed from: o0.y0$b */
    /* loaded from: combined.jar:classes1.jar:o0/y0$b.class */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final InterfaceC6810b1 f35585b;

        /* renamed from: c */
        public final View f35586c;

        /* renamed from: d */
        public final C6864y0 f35587d;

        public b(C6864y0 c6864y0, InterfaceC6810b1 interfaceC6810b1, View view) {
            this.f35587d = c6864y0;
            this.f35585b = interfaceC6810b1;
            this.f35586c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35585b.mo21705a(this.f35586c);
        }
    }

    public C6864y0(View view) {
        this.f35578a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C6864y0 m31671a(float f10) {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    /* renamed from: b */
    public void m31672b() {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long m31673c() {
        View view = this.f35578a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: d */
    public C6864y0 m31674d(float f10) {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    /* renamed from: e */
    public C6864y0 m31675e(float f10) {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    /* renamed from: f */
    public C6864y0 m31676f(long j10) {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    /* renamed from: g */
    public C6864y0 m31677g(Interpolator interpolator) {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C6864y0 m31678h(InterfaceC6866z0 interfaceC6866z0) {
        View view = this.f35578a.get();
        if (view != null) {
            m31679i(view, interfaceC6866z0);
        }
        return this;
    }

    /* renamed from: i */
    public final void m31679i(View view, InterfaceC6866z0 interfaceC6866z0) {
        if (interfaceC6866z0 != null) {
            view.animate().setListener(new a(this, interfaceC6866z0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: j */
    public C6864y0 m31680j(long j10) {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    /* renamed from: k */
    public C6864y0 m31681k(InterfaceC6810b1 interfaceC6810b1) {
        View view = this.f35578a.get();
        if (view != null) {
            b bVar = null;
            if (interfaceC6810b1 != null) {
                bVar = new b(this, interfaceC6810b1, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: l */
    public void m31682l() {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C6864y0 m31683m(float f10) {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: n */
    public C6864y0 m31684n() {
        View view = this.f35578a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }
}
