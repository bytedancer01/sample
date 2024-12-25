package p306rb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/f.class
 */
/* renamed from: rb.f */
/* loaded from: combined.jar:classes2.jar:rb/f.class */
public final class C8454f {

    /* renamed from: a */
    public final ArrayList<b> f39515a = new ArrayList<>();

    /* renamed from: b */
    public b f39516b = null;

    /* renamed from: c */
    public ValueAnimator f39517c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f39518d = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/f$a.class
     */
    /* renamed from: rb.f$a */
    /* loaded from: combined.jar:classes2.jar:rb/f$a.class */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C8454f f39519b;

        public a(C8454f c8454f) {
            this.f39519b = c8454f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8454f c8454f = this.f39519b;
            if (c8454f.f39517c == animator) {
                c8454f.f39517c = null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/f$b.class
     */
    /* renamed from: rb.f$b */
    /* loaded from: combined.jar:classes2.jar:rb/f$b.class */
    public static class b {

        /* renamed from: a */
        public final int[] f39520a;

        /* renamed from: b */
        public final ValueAnimator f39521b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f39520a = iArr;
            this.f39521b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m36312a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f39518d);
        this.f39515a.add(bVar);
    }
}
