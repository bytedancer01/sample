package p426yd;

import android.hardware.Camera;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yd/a.class
 */
/* renamed from: yd.a */
/* loaded from: combined.jar:classes2.jar:yd/a.class */
public final class C9981a {

    /* renamed from: a */
    public static final String f45705a = "yd.a";

    /* renamed from: a */
    public static int m41926a(int i10) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f45705a, "No cameras!");
            return -1;
        }
        boolean z10 = i10 >= 0;
        int i11 = i10;
        if (!z10) {
            int i12 = 0;
            while (true) {
                i11 = i12;
                if (i12 >= numberOfCameras) {
                    break;
                }
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i12, cameraInfo);
                if (cameraInfo.facing == 0) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        return i11 < numberOfCameras ? i11 : z10 ? -1 : 0;
    }

    /* renamed from: b */
    public static Camera m41927b(int i10) {
        int m41926a = m41926a(i10);
        if (m41926a == -1) {
            return null;
        }
        return Camera.open(m41926a);
    }
}
