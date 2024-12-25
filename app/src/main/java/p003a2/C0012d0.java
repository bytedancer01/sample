package p003a2;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/d0.class
 */
/* renamed from: a2.d0 */
/* loaded from: combined.jar:classes1.jar:a2/d0.class */
public class C0012d0 extends C0030m0 {

    /* renamed from: e */
    public static boolean f57e = true;

    @Override // p003a2.C0030m0
    /* renamed from: a */
    public void mo76a(View view) {
    }

    @Override // p003a2.C0030m0
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo77c(View view) {
        float transitionAlpha;
        if (f57e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError e10) {
                f57e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p003a2.C0030m0
    /* renamed from: d */
    public void mo78d(View view) {
    }

    @Override // p003a2.C0030m0
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo79f(View view, float f10) {
        if (f57e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError e10) {
                f57e = false;
            }
        }
        view.setAlpha(f10);
    }
}
