package p096f9;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/d.class
 */
/* renamed from: f9.d */
/* loaded from: combined.jar:classes2.jar:f9/d.class */
public final class C4780d implements SensorEventListener {

    /* renamed from: a */
    public final float[] f28151a = new float[16];

    /* renamed from: b */
    public final float[] f28152b = new float[16];

    /* renamed from: c */
    public final float[] f28153c = new float[16];

    /* renamed from: d */
    public final float[] f28154d = new float[3];

    /* renamed from: e */
    public final Display f28155e;

    /* renamed from: f */
    public final a[] f28156f;

    /* renamed from: g */
    public boolean f28157g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f9/d$a.class
     */
    /* renamed from: f9.d$a */
    /* loaded from: combined.jar:classes2.jar:f9/d$a.class */
    public interface a {
        /* renamed from: a */
        void mo24198a(float[] fArr, float f10);
    }

    public C4780d(Display display, a... aVarArr) {
        this.f28155e = display;
        this.f28156f = aVarArr;
    }

    /* renamed from: e */
    public static void m24193e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final float m24194a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f28152b);
        SensorManager.getOrientation(this.f28152b, this.f28154d);
        return this.f28154d[2];
    }

    /* renamed from: b */
    public final void m24195b(float[] fArr, float f10) {
        for (a aVar : this.f28156f) {
            aVar.mo24198a(fArr, f10);
        }
    }

    /* renamed from: c */
    public final void m24196c(float[] fArr) {
        if (!this.f28157g) {
            C4779c.m24188a(this.f28153c, fArr);
            this.f28157g = true;
        }
        float[] fArr2 = this.f28152b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f28152b, 0, this.f28153c, 0);
    }

    /* renamed from: d */
    public final void m24197d(float[] fArr, int i10) {
        int i11;
        int i12;
        if (i10 != 0) {
            if (i10 == 1) {
                i11 = 2;
                i12 = 129;
            } else if (i10 == 2) {
                i11 = 129;
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
                i12 = 1;
            }
            float[] fArr2 = this.f28152b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f28152b, i11, i12, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f28151a, sensorEvent.values);
        m24197d(this.f28151a, this.f28155e.getRotation());
        float m24194a = m24194a(this.f28151a);
        m24193e(this.f28151a);
        m24196c(this.f28151a);
        m24195b(this.f28151a, m24194a);
    }
}
