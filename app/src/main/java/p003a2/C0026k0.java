package p003a2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/k0.class
 */
/* renamed from: a2.k0 */
/* loaded from: combined.jar:classes1.jar:a2/k0.class */
public class C0026k0 extends C0022i0 {

    /* renamed from: i */
    public static boolean f84i = true;

    @Override // p003a2.C0030m0
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo113g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo113g(view, i10);
        } else if (f84i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError e10) {
                f84i = false;
            }
        }
    }
}
