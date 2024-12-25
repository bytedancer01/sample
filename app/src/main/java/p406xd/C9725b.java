package p406xd;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import p354ue.C9163h;
import p354ue.C9164i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xd/b.class
 */
/* renamed from: xd.b */
/* loaded from: combined.jar:classes2.jar:xd/b.class */
public final class C9725b implements SensorEventListener {

    /* renamed from: a */
    public C9163h f44379a;

    /* renamed from: b */
    public C9164i f44380b;

    /* renamed from: c */
    public Sensor f44381c;

    /* renamed from: d */
    public Context f44382d;

    /* renamed from: e */
    public Handler f44383e = new Handler();

    public C9725b(Context context, C9163h c9163h, C9164i c9164i) {
        this.f44382d = context;
        this.f44379a = c9163h;
        this.f44380b = c9164i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m41004b(boolean z10) {
        this.f44379a.m38575t(z10);
    }

    /* renamed from: c */
    public final void m41005c(final boolean z10) {
        this.f44383e.post(new Runnable(this, z10) { // from class: xd.a

            /* renamed from: b */
            public final C9725b f44377b;

            /* renamed from: c */
            public final boolean f44378c;

            {
                this.f44377b = this;
                this.f44378c = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f44377b.m41004b(this.f44378c);
            }
        });
    }

    /* renamed from: d */
    public void m41006d() {
        if (this.f44380b.m38583d()) {
            SensorManager sensorManager = (SensorManager) this.f44382d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f44381c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: e */
    public void m41007e() {
        if (this.f44381c != null) {
            ((SensorManager) this.f44382d.getSystemService("sensor")).unregisterListener(this);
            this.f44381c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f44379a != null) {
            if (f10 <= 45.0f) {
                m41005c(true);
            } else if (f10 >= 450.0f) {
                m41005c(false);
            }
        }
    }
}
