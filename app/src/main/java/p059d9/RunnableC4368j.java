package p059d9;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/j.class
 */
/* renamed from: d9.j */
/* loaded from: combined.jar:classes2.jar:d9/j.class */
public final class RunnableC4368j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: i */
    public static final int[] f26584i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    public final Handler f26585b;

    /* renamed from: c */
    public final int[] f26586c;

    /* renamed from: d */
    public final c f26587d;

    /* renamed from: e */
    public EGLDisplay f26588e;

    /* renamed from: f */
    public EGLContext f26589f;

    /* renamed from: g */
    public EGLSurface f26590g;

    /* renamed from: h */
    public SurfaceTexture f26591h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/j$b.class
     */
    /* renamed from: d9.j$b */
    /* loaded from: combined.jar:classes2.jar:d9/j$b.class */
    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/j$c.class
     */
    /* renamed from: d9.j$c */
    /* loaded from: combined.jar:classes2.jar:d9/j$c.class */
    public interface c {
        /* renamed from: a */
        void m22052a();
    }

    public RunnableC4368j(Handler handler) {
        this(handler, null);
    }

    public RunnableC4368j(Handler handler, c cVar) {
        this.f26585b = handler;
        this.f26587d = cVar;
        this.f26586c = new int[1];
    }

    /* renamed from: a */
    public static EGLConfig m22043a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f26584i, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new b(C4401z0.m22321E("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    /* renamed from: b */
    public static EGLContext m22044b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    /* renamed from: c */
    public static EGLSurface m22045c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    /* renamed from: e */
    public static void m22046e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C4378o.m22171b();
    }

    /* renamed from: f */
    public static EGLDisplay m22047f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new b("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new b("eglInitialize failed");
    }

    /* renamed from: d */
    public final void m22048d() {
        c cVar = this.f26587d;
        if (cVar != null) {
            cVar.m22052a();
        }
    }

    /* renamed from: g */
    public SurfaceTexture m22049g() {
        return (SurfaceTexture) C4349a.m21882e(this.f26591h);
    }

    /* renamed from: h */
    public void m22050h(int i10) {
        EGLDisplay m22047f = m22047f();
        this.f26588e = m22047f;
        EGLConfig m22043a = m22043a(m22047f);
        EGLContext m22044b = m22044b(this.f26588e, m22043a, i10);
        this.f26589f = m22044b;
        this.f26590g = m22045c(this.f26588e, m22043a, m22044b, i10);
        m22046e(this.f26586c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f26586c[0]);
        this.f26591h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: i */
    public void m22051i() {
        this.f26585b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f26591h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f26586c, 0);
            }
            EGLDisplay eGLDisplay = this.f26588e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f26588e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f26590g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f26588e, this.f26590g);
            }
            EGLContext eGLContext = this.f26589f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f26588e, eGLContext);
            }
            if (C4401z0.f26679a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f26588e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f26588e);
            }
            this.f26588e = null;
            this.f26589f = null;
            this.f26590g = null;
            this.f26591h = null;
        } catch (Throwable th2) {
            EGLDisplay eGLDisplay4 = this.f26588e;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f26588e;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f26590g;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f26588e, this.f26590g);
            }
            EGLContext eGLContext2 = this.f26589f;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f26588e, eGLContext2);
            }
            if (C4401z0.f26679a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f26588e;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f26588e);
            }
            this.f26588e = null;
            this.f26589f = null;
            this.f26590g = null;
            this.f26591h = null;
            throw th2;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f26585b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m22048d();
        SurfaceTexture surfaceTexture = this.f26591h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException e10) {
            }
        }
    }
}
