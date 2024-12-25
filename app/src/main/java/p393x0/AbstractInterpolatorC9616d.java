package p393x0;

import android.view.animation.Interpolator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x0/d.class
 */
/* renamed from: x0.d */
/* loaded from: combined.jar:classes1.jar:x0/d.class */
public abstract class AbstractInterpolatorC9616d implements Interpolator {

    /* renamed from: a */
    public final float[] f43920a;

    /* renamed from: b */
    public final float f43921b;

    public AbstractInterpolatorC9616d(float[] fArr) {
        this.f43920a = fArr;
        this.f43921b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((r0.length - 1) * f10), this.f43920a.length - 2);
        float f11 = min;
        float f12 = this.f43921b;
        float f13 = (f10 - (f11 * f12)) / f12;
        float[] fArr = this.f43920a;
        float f14 = fArr[min];
        return f14 + (f13 * (fArr[min + 1] - f14));
    }
}
