package p003a2;

import android.graphics.Matrix;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/l0.class
 */
/* renamed from: a2.l0 */
/* loaded from: combined.jar:classes1.jar:a2/l0.class */
public class C0028l0 extends C0026k0 {
    @Override // p003a2.C0012d0, p003a2.C0030m0
    /* renamed from: c */
    public float mo77c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p003a2.C0022i0, p003a2.C0030m0
    /* renamed from: e */
    public void mo107e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p003a2.C0012d0, p003a2.C0030m0
    /* renamed from: f */
    public void mo79f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p003a2.C0026k0, p003a2.C0030m0
    /* renamed from: g */
    public void mo113g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p003a2.C0018g0, p003a2.C0030m0
    /* renamed from: h */
    public void mo103h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p003a2.C0018g0, p003a2.C0030m0
    /* renamed from: i */
    public void mo104i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
