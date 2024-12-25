package p003a2;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/i0.class
 */
/* renamed from: a2.i0 */
/* loaded from: combined.jar:classes1.jar:a2/i0.class */
public class C0022i0 extends C0018g0 {

    /* renamed from: h */
    public static boolean f80h = true;

    @Override // p003a2.C0030m0
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo107e(View view, int i10, int i11, int i12, int i13) {
        if (f80h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError e10) {
                f80h = false;
            }
        }
    }
}
