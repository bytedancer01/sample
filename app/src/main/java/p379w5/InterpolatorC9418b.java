package p379w5;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w5/b.class
 */
/* renamed from: w5.b */
/* loaded from: combined.jar:classes1.jar:w5/b.class */
public class InterpolatorC9418b implements Interpolator {

    /* renamed from: a */
    public TimeInterpolator f43170a;

    /* renamed from: b */
    public float[] f43171b;

    public InterpolatorC9418b(TimeInterpolator timeInterpolator, float... fArr) {
        this.f43170a = timeInterpolator;
        this.f43171b = fArr;
    }

    /* renamed from: a */
    public static InterpolatorC9418b m39770a(float... fArr) {
        InterpolatorC9418b interpolatorC9418b = new InterpolatorC9418b(C9417a.m39769a(), new float[0]);
        interpolatorC9418b.m39772c(fArr);
        return interpolatorC9418b;
    }

    /* renamed from: b */
    public static InterpolatorC9418b m39771b(float f10, float f11, float f12, float f13, float... fArr) {
        InterpolatorC9418b interpolatorC9418b = new InterpolatorC9418b(C9419c.m39773a(f10, f11, f12, f13), new float[0]);
        interpolatorC9418b.m39772c(fArr);
        return interpolatorC9418b;
    }

    /* renamed from: c */
    public void m39772c(float... fArr) {
        this.f43171b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        synchronized (this) {
            if (this.f43171b.length > 1) {
                int i10 = 0;
                while (true) {
                    float[] fArr = this.f43171b;
                    if (i10 >= fArr.length - 1) {
                        break;
                    }
                    float f11 = fArr[i10];
                    int i11 = i10 + 1;
                    float f12 = fArr[i11];
                    float f13 = f12 - f11;
                    i10 = i11;
                    if (f10 >= f11) {
                        i10 = i11;
                        if (f10 <= f12) {
                            return f11 + (this.f43170a.getInterpolation((f10 - f11) / f13) * f13);
                        }
                    }
                }
            }
            return this.f43170a.getInterpolation(f10);
        }
    }
}
