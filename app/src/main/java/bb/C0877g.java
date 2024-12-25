package bb;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bb/g.class
 */
/* renamed from: bb.g */
/* loaded from: combined.jar:classes2.jar:bb/g.class */
public class C0877g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f5961a = new float[9];

    /* renamed from: b */
    public final float[] f5962b = new float[9];

    /* renamed from: c */
    public final Matrix f5963c = new Matrix();

    /* renamed from: a */
    public Matrix mo5448a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f5961a);
        matrix2.getValues(this.f5962b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f5962b;
            float f11 = fArr[i10];
            float f12 = this.f5961a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f5963c.setValues(this.f5962b);
        return this.f5963c;
    }
}
