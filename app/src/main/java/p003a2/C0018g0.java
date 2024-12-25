package p003a2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/g0.class
 */
/* renamed from: a2.g0 */
/* loaded from: combined.jar:classes1.jar:a2/g0.class */
public class C0018g0 extends C0012d0 {

    /* renamed from: f */
    public static boolean f76f = true;

    /* renamed from: g */
    public static boolean f77g = true;

    @Override // p003a2.C0030m0
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo103h(View view, Matrix matrix) {
        if (f76f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError e10) {
                f76f = false;
            }
        }
    }

    @Override // p003a2.C0030m0
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo104i(View view, Matrix matrix) {
        if (f77g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError e10) {
                f77g = false;
            }
        }
    }
}
