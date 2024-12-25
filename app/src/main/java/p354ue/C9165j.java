package p354ue;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/j.class
 */
/* renamed from: ue.j */
/* loaded from: combined.jar:classes2.jar:ue/j.class */
public class C9165j {

    /* renamed from: a */
    public SurfaceHolder f41927a;

    /* renamed from: b */
    public SurfaceTexture f41928b;

    public C9165j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        this.f41928b = surfaceTexture;
    }

    public C9165j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f41927a = surfaceHolder;
    }

    /* renamed from: a */
    public void m38589a(Camera camera) {
        SurfaceHolder surfaceHolder = this.f41927a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f41928b);
        }
    }
}
