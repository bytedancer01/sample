package p364v5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import p398x5.AbstractC9668f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v5/a.class
 */
/* renamed from: v5.a */
/* loaded from: combined.jar:classes1.jar:v5/a.class */
public class C9243a {
    /* renamed from: a */
    public static boolean m38975a(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: b */
    public static boolean m38976b(AbstractC9668f... abstractC9668fArr) {
        for (AbstractC9668f abstractC9668f : abstractC9668fArr) {
            if (abstractC9668f.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m38977c(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* renamed from: d */
    public static void m38978d(Animator animator) {
        if (animator == null || animator.isStarted()) {
            return;
        }
        animator.start();
    }

    /* renamed from: e */
    public static void m38979e(AbstractC9668f... abstractC9668fArr) {
        for (AbstractC9668f abstractC9668f : abstractC9668fArr) {
            abstractC9668f.start();
        }
    }

    /* renamed from: f */
    public static void m38980f(AbstractC9668f... abstractC9668fArr) {
        for (AbstractC9668f abstractC9668f : abstractC9668fArr) {
            abstractC9668f.stop();
        }
    }
}
