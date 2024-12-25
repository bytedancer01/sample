package p003a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/a.class
 */
/* renamed from: a2.a */
/* loaded from: combined.jar:classes1.jar:a2/a.class */
public class C0005a {
    /* renamed from: a */
    public static void m27a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public static void m28b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    public static void m29c(Animator animator) {
        animator.resume();
    }
}
