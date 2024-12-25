package p354ue;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p338te.C8721s;
import p338te.C8722t;
import p406xd.C9725b;
import p426yd.C9981a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/h.class
 */
/* renamed from: ue.h */
/* loaded from: combined.jar:classes2.jar:ue/h.class */
public final class C9163h {

    /* renamed from: n */
    public static final String f41901n = "h";

    /* renamed from: a */
    public Camera f41902a;

    /* renamed from: b */
    public Camera.CameraInfo f41903b;

    /* renamed from: c */
    public C9156a f41904c;

    /* renamed from: d */
    public C9725b f41905d;

    /* renamed from: e */
    public boolean f41906e;

    /* renamed from: f */
    public String f41907f;

    /* renamed from: h */
    public C9168m f41909h;

    /* renamed from: i */
    public C8721s f41910i;

    /* renamed from: j */
    public C8721s f41911j;

    /* renamed from: l */
    public Context f41913l;

    /* renamed from: g */
    public C9164i f41908g = new C9164i();

    /* renamed from: k */
    public int f41912k = -1;

    /* renamed from: m */
    public final a f41914m = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/h$a.class
     */
    /* renamed from: ue.h$a */
    /* loaded from: combined.jar:classes2.jar:ue/h$a.class */
    public final class a implements Camera.PreviewCallback {

        /* renamed from: a */
        public InterfaceC9171p f41915a;

        /* renamed from: b */
        public C8721s f41916b;

        /* renamed from: c */
        public final C9163h f41917c;

        public a(C9163h c9163h) {
            this.f41917c = c9163h;
        }

        /* renamed from: a */
        public void m38578a(InterfaceC9171p interfaceC9171p) {
            this.f41915a = interfaceC9171p;
        }

        /* renamed from: b */
        public void m38579b(C8721s c8721s) {
            this.f41916b = c8721s;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e10;
            C8721s c8721s = this.f41916b;
            InterfaceC9171p interfaceC9171p = this.f41915a;
            if (c8721s == null || interfaceC9171p == null) {
                Log.d(C9163h.f41901n, "Got preview callback, but no handler or resolution available");
                if (interfaceC9171p == null) {
                    return;
                } else {
                    e10 = new Exception("No resolution available");
                }
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    C8722t c8722t = new C8722t(bArr, c8721s.f40526b, c8721s.f40527c, camera.getParameters().getPreviewFormat(), this.f41917c.m38562f());
                    if (this.f41917c.f41903b.facing == 1) {
                        c8722t.m37272e(true);
                    }
                    interfaceC9171p.mo37248a(c8722t);
                    return;
                } catch (RuntimeException e11) {
                    e10 = e11;
                    Log.e(C9163h.f41901n, "Camera preview failed", e10);
                }
            }
            interfaceC9171p.mo37249b(e10);
        }
    }

    public C9163h(Context context) {
        this.f41913l = context;
    }

    /* renamed from: i */
    public static List<C8721s> m38558i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new C8721s(previewSize.width, previewSize.height);
                arrayList.add(new C8721s(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new C8721s(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final int m38559c() {
        int m38600c = this.f41909h.m38600c();
        int i10 = 0;
        if (m38600c != 0) {
            i10 = m38600c != 1 ? m38600c != 2 ? m38600c != 3 ? 0 : 270 : 180 : 90;
        }
        Camera.CameraInfo cameraInfo = this.f41903b;
        int i11 = cameraInfo.facing;
        int i12 = cameraInfo.orientation;
        int i13 = (i11 == 1 ? 360 - ((i12 + i10) % 360) : (i12 - i10) + 360) % 360;
        Log.i(f41901n, "Camera Display Orientation: " + i13);
        return i13;
    }

    /* renamed from: d */
    public void m38560d() {
        Camera camera = this.f41902a;
        if (camera != null) {
            camera.release();
            this.f41902a = null;
        }
    }

    /* renamed from: e */
    public void m38561e() {
        if (this.f41902a == null) {
            throw new RuntimeException("Camera not open");
        }
        m38573r();
    }

    /* renamed from: f */
    public int m38562f() {
        return this.f41912k;
    }

    /* renamed from: g */
    public final Camera.Parameters m38563g() {
        Camera.Parameters parameters = this.f41902a.getParameters();
        String str = this.f41907f;
        if (str == null) {
            this.f41907f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: h */
    public C8721s m38564h() {
        if (this.f41911j == null) {
            return null;
        }
        return m38565j() ? this.f41911j.m37265d() : this.f41911j;
    }

    /* renamed from: j */
    public boolean m38565j() {
        int i10 = this.f41912k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if ("torch".equals(r0) != false) goto L10;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m38566k() {
        /*
            r3 = this;
            r0 = r3
            android.hardware.Camera r0 = r0.f41902a
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L31
            r0 = r6
            java.lang.String r0 = r0.getFlashMode()
            r6 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L31
            java.lang.String r0 = "on"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f
            r0 = r5
            r4 = r0
            java.lang.String r0 = "torch"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
        L2f:
            r0 = 1
            r4 = r0
        L31:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p354ue.C9163h.m38566k():boolean");
    }

    /* renamed from: l */
    public void m38567l() {
        Camera m41927b = C9981a.m41927b(this.f41908g.m38581b());
        this.f41902a = m41927b;
        if (m41927b == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int m41926a = C9981a.m41926a(this.f41908g.m38581b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f41903b = cameraInfo;
        Camera.getCameraInfo(m41926a, cameraInfo);
    }

    /* renamed from: m */
    public void m38568m(InterfaceC9171p interfaceC9171p) {
        Camera camera = this.f41902a;
        if (camera == null || !this.f41906e) {
            return;
        }
        this.f41914m.m38578a(interfaceC9171p);
        camera.setOneShotPreviewCallback(this.f41914m);
    }

    /* renamed from: n */
    public final void m38569n(int i10) {
        this.f41902a.setDisplayOrientation(i10);
    }

    /* renamed from: o */
    public void m38570o(C9164i c9164i) {
        this.f41908g = c9164i;
    }

    /* renamed from: p */
    public final void m38571p(boolean z10) {
        Camera.Parameters m38563g = m38563g();
        if (m38563g == null) {
            Log.w(f41901n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f41901n;
        Log.i(str, "Initial camera parameters: " + m38563g.flatten());
        if (z10) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        C9158c.m38519g(m38563g, this.f41908g.m38580a(), z10);
        if (!z10) {
            C9158c.m38523k(m38563g, false);
            if (this.f41908g.m38587h()) {
                C9158c.m38521i(m38563g);
            }
            if (this.f41908g.m38584e()) {
                C9158c.m38515c(m38563g);
            }
            if (this.f41908g.m38586g()) {
                C9158c.m38524l(m38563g);
                C9158c.m38520h(m38563g);
                C9158c.m38522j(m38563g);
            }
        }
        List<C8721s> m38558i = m38558i(m38563g);
        if (m38558i.size() == 0) {
            this.f41910i = null;
        } else {
            C8721s m38598a = this.f41909h.m38598a(m38558i, m38565j());
            this.f41910i = m38598a;
            m38563g.setPreviewSize(m38598a.f40526b, m38598a.f40527c);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C9158c.m38517e(m38563g);
        }
        Log.i(str, "Final camera parameters: " + m38563g.flatten());
        this.f41902a.setParameters(m38563g);
    }

    /* renamed from: q */
    public void m38572q(C9168m c9168m) {
        this.f41909h = c9168m;
    }

    /* renamed from: r */
    public final void m38573r() {
        try {
            int m38559c = m38559c();
            this.f41912k = m38559c;
            m38569n(m38559c);
        } catch (Exception e10) {
            Log.w(f41901n, "Failed to set rotation.");
        }
        try {
            m38571p(false);
        } catch (Exception e11) {
            try {
                m38571p(true);
            } catch (Exception e12) {
                Log.w(f41901n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f41902a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f41911j = this.f41910i;
        } else {
            this.f41911j = new C8721s(previewSize.width, previewSize.height);
        }
        this.f41914m.m38579b(this.f41911j);
    }

    /* renamed from: s */
    public void m38574s(C9165j c9165j) {
        c9165j.m38589a(this.f41902a);
    }

    /* renamed from: t */
    public void m38575t(boolean z10) {
        if (this.f41902a != null) {
            try {
                if (z10 != m38566k()) {
                    C9156a c9156a = this.f41904c;
                    if (c9156a != null) {
                        c9156a.m38510j();
                    }
                    Camera.Parameters parameters = this.f41902a.getParameters();
                    C9158c.m38523k(parameters, z10);
                    if (this.f41908g.m38585f()) {
                        C9158c.m38516d(parameters, z10);
                    }
                    this.f41902a.setParameters(parameters);
                    C9156a c9156a2 = this.f41904c;
                    if (c9156a2 != null) {
                        c9156a2.m38509i();
                    }
                }
            } catch (RuntimeException e10) {
                Log.e(f41901n, "Failed to set torch", e10);
            }
        }
    }

    /* renamed from: u */
    public void m38576u() {
        Camera camera = this.f41902a;
        if (camera == null || this.f41906e) {
            return;
        }
        camera.startPreview();
        this.f41906e = true;
        this.f41904c = new C9156a(this.f41902a, this.f41908g);
        C9725b c9725b = new C9725b(this.f41913l, this, this.f41908g);
        this.f41905d = c9725b;
        c9725b.m41006d();
    }

    /* renamed from: v */
    public void m38577v() {
        C9156a c9156a = this.f41904c;
        if (c9156a != null) {
            c9156a.m38510j();
            this.f41904c = null;
        }
        C9725b c9725b = this.f41905d;
        if (c9725b != null) {
            c9725b.m41007e();
            this.f41905d = null;
        }
        Camera camera = this.f41902a;
        if (camera == null || !this.f41906e) {
            return;
        }
        camera.stopPreview();
        this.f41914m.m38578a(null);
        this.f41906e = false;
    }
}
