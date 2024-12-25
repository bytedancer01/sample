package p040cb;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import p012ab.C0142b;
import p012ab.C0147g;
import p306rb.C8458j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cb/e.class
 */
/* renamed from: cb.e */
/* loaded from: combined.jar:classes2.jar:cb/e.class */
public class C1059e {

    /* renamed from: a */
    public static final int[] f7066a = {R.attr.stateListAnimator};

    /* renamed from: a */
    public static void m6262a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    public static void m6263b(View view, float f10) {
        int integer = view.getResources().getInteger(C0147g.f777a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, C0142b.f634C, -C0142b.f635D}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    public static void m6264c(View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray m36338h = C8458j.m36338h(context, attributeSet, f7066a, i10, i11, new int[0]);
        try {
            if (m36338h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m36338h.getResourceId(0, 0)));
            }
        } finally {
            m36338h.recycle();
        }
    }
}
