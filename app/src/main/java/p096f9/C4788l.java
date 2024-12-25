package p096f9;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p059d9.C4349a;
import p059d9.C4401z0;
import p078e9.InterfaceC4679m;
import p096f9.C4780d;
import p096f9.ViewOnTouchListenerC4789m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/l.class
 */
/* renamed from: f9.l */
/* loaded from: combined.jar:classes2.jar:f9/l.class */
public final class C4788l extends GLSurfaceView {

    /* renamed from: b */
    public final CopyOnWriteArrayList<b> f28204b;

    /* renamed from: c */
    public final SensorManager f28205c;

    /* renamed from: d */
    public final Sensor f28206d;

    /* renamed from: e */
    public final C4780d f28207e;

    /* renamed from: f */
    public final Handler f28208f;

    /* renamed from: g */
    public final ViewOnTouchListenerC4789m f28209g;

    /* renamed from: h */
    public final C4785i f28210h;

    /* renamed from: i */
    public SurfaceTexture f28211i;

    /* renamed from: j */
    public Surface f28212j;

    /* renamed from: k */
    public boolean f28213k;

    /* renamed from: l */
    public boolean f28214l;

    /* renamed from: m */
    public boolean f28215m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f9/l$a.class
     */
    /* renamed from: f9.l$a */
    /* loaded from: combined.jar:classes2.jar:f9/l$a.class */
    public final class a implements GLSurfaceView.Renderer, ViewOnTouchListenerC4789m.a, C4780d.a {

        /* renamed from: b */
        public final C4785i f28216b;

        /* renamed from: e */
        public final float[] f28219e;

        /* renamed from: f */
        public final float[] f28220f;

        /* renamed from: g */
        public final float[] f28221g;

        /* renamed from: h */
        public float f28222h;

        /* renamed from: i */
        public float f28223i;

        /* renamed from: l */
        public final C4788l f28226l;

        /* renamed from: c */
        public final float[] f28217c = new float[16];

        /* renamed from: d */
        public final float[] f28218d = new float[16];

        /* renamed from: j */
        public final float[] f28224j = new float[16];

        /* renamed from: k */
        public final float[] f28225k = new float[16];

        public a(C4788l c4788l, C4785i c4785i) {
            this.f28226l = c4788l;
            float[] fArr = new float[16];
            this.f28219e = fArr;
            float[] fArr2 = new float[16];
            this.f28220f = fArr2;
            float[] fArr3 = new float[16];
            this.f28221g = fArr3;
            this.f28216b = c4785i;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f28223i = 3.1415927f;
        }

        @Override // p096f9.C4780d.a
        /* renamed from: a */
        public void mo24198a(float[] fArr, float f10) {
            synchronized (this) {
                float[] fArr2 = this.f28219e;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                this.f28223i = -f10;
                m24237d();
            }
        }

        @Override // p096f9.ViewOnTouchListenerC4789m.a
        /* renamed from: b */
        public void mo24235b(PointF pointF) {
            synchronized (this) {
                this.f28222h = pointF.y;
                m24237d();
                Matrix.setRotateM(this.f28221g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
            }
        }

        /* renamed from: c */
        public final float m24236c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        /* renamed from: d */
        public final void m24237d() {
            Matrix.setRotateM(this.f28220f, 0, -this.f28222h, (float) Math.cos(this.f28223i), (float) Math.sin(this.f28223i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f28225k, 0, this.f28219e, 0, this.f28221g, 0);
                Matrix.multiplyMM(this.f28224j, 0, this.f28220f, 0, this.f28225k, 0);
            }
            Matrix.multiplyMM(this.f28218d, 0, this.f28217c, 0, this.f28224j, 0);
            this.f28216b.m24221e(this.f28218d, false);
        }

        @Override // p096f9.ViewOnTouchListenerC4789m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return this.f28226l.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f28217c, 0, m24236c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            synchronized (this) {
                this.f28226l.m24232g(this.f28216b.m24222f());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f9/l$b.class
     */
    /* renamed from: f9.l$b */
    /* loaded from: combined.jar:classes2.jar:f9/l$b.class */
    public interface b {
        /* renamed from: n */
        void mo24238n(Surface surface);

        /* renamed from: o */
        void mo24239o(Surface surface);
    }

    public C4788l(Context context) {
        this(context, null);
    }

    public C4788l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28204b = new CopyOnWriteArrayList<>();
        this.f28208f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C4349a.m21882e(context.getSystemService("sensor"));
        this.f28205c = sensorManager;
        Sensor defaultSensor = C4401z0.f26679a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f28206d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C4785i c4785i = new C4785i();
        this.f28210h = c4785i;
        a aVar = new a(this, c4785i);
        ViewOnTouchListenerC4789m viewOnTouchListenerC4789m = new ViewOnTouchListenerC4789m(context, aVar, 25.0f);
        this.f28209g = viewOnTouchListenerC4789m;
        this.f28207e = new C4780d(((WindowManager) C4349a.m21882e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), viewOnTouchListenerC4789m, aVar);
        this.f28213k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(viewOnTouchListenerC4789m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m24228e() {
        Surface surface = this.f28212j;
        if (surface != null) {
            Iterator<b> it = this.f28204b.iterator();
            while (it.hasNext()) {
                it.next().mo24238n(surface);
            }
        }
        m24230h(this.f28211i, surface);
        this.f28211i = null;
        this.f28212j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m24229f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f28211i;
        Surface surface = this.f28212j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f28211i = surfaceTexture;
        this.f28212j = surface2;
        Iterator<b> it = this.f28204b.iterator();
        while (it.hasNext()) {
            it.next().mo24239o(surface2);
        }
        m24230h(surfaceTexture2, surface);
    }

    /* renamed from: h */
    public static void m24230h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: d */
    public void m24231d(b bVar) {
        this.f28204b.add(bVar);
    }

    /* renamed from: g */
    public final void m24232g(final SurfaceTexture surfaceTexture) {
        this.f28208f.post(new Runnable(this, surfaceTexture) { // from class: f9.j

            /* renamed from: b */
            public final C4788l f28201b;

            /* renamed from: c */
            public final SurfaceTexture f28202c;

            {
                this.f28201b = this;
                this.f28202c = surfaceTexture;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28201b.m24229f(this.f28202c);
            }
        });
    }

    public InterfaceC4777a getCameraMotionListener() {
        return this.f28210h;
    }

    public InterfaceC4679m getVideoFrameMetadataListener() {
        return this.f28210h;
    }

    public Surface getVideoSurface() {
        return this.f28212j;
    }

    /* renamed from: i */
    public void m24233i(b bVar) {
        this.f28204b.remove(bVar);
    }

    /* renamed from: j */
    public final void m24234j() {
        boolean z10 = this.f28213k && this.f28214l;
        Sensor sensor = this.f28206d;
        if (sensor == null || z10 == this.f28215m) {
            return;
        }
        if (z10) {
            this.f28205c.registerListener(this.f28207e, sensor, 0);
        } else {
            this.f28205c.unregisterListener(this.f28207e);
        }
        this.f28215m = z10;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28208f.post(new Runnable(this) { // from class: f9.k

            /* renamed from: b */
            public final C4788l f28203b;

            {
                this.f28203b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28203b.m24228e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f28214l = false;
        m24234j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f28214l = true;
        m24234j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f28210h.m24223h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f28213k = z10;
        m24234j();
    }
}
