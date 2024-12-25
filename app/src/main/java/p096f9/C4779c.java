package p096f9;

import android.opengl.Matrix;
import p059d9.C4387s0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/c.class
 */
/* renamed from: f9.c */
/* loaded from: combined.jar:classes2.jar:f9/c.class */
public final class C4779c {

    /* renamed from: a */
    public final float[] f28147a = new float[16];

    /* renamed from: b */
    public final float[] f28148b = new float[16];

    /* renamed from: c */
    public final C4387s0<float[]> f28149c = new C4387s0<>();

    /* renamed from: d */
    public boolean f28150d;

    /* renamed from: a */
    public static void m24188a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    /* renamed from: b */
    public static void m24189b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    /* renamed from: c */
    public boolean m24190c(float[] fArr, long j10) {
        float[] m22234j = this.f28149c.m22234j(j10);
        if (m22234j == null) {
            return false;
        }
        m24189b(this.f28148b, m22234j);
        if (!this.f28150d) {
            m24188a(this.f28147a, this.f28148b);
            this.f28150d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f28147a, 0, this.f28148b, 0);
        return true;
    }

    /* renamed from: d */
    public void m24191d() {
        this.f28149c.m22228c();
        this.f28150d = false;
    }

    /* renamed from: e */
    public void m24192e(long j10, float[] fArr) {
        this.f28149c.m22226a(j10, fArr);
    }
}
