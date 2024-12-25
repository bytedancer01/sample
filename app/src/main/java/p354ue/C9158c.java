package p354ue;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p354ue.C9164i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/c.class
 */
/* renamed from: ue.c */
/* loaded from: combined.jar:classes2.jar:ue/c.class */
public final class C9158c {

    /* renamed from: a */
    public static final Pattern f41876a = Pattern.compile(";");

    @TargetApi(15)
    /* renamed from: a */
    public static List<Camera.Area> m38513a(int i10) {
        int i11 = -i10;
        return Collections.singletonList(new Camera.Area(new Rect(i11, i11, i10, i10), 1));
    }

    /* renamed from: b */
    public static String m38514b(String str, Collection<String> collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: c */
    public static void m38515c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String m38514b = m38514b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (m38514b != null) {
            parameters.setSceneMode(m38514b);
        }
    }

    /* renamed from: d */
    public static void m38516d(Camera.Parameters parameters, boolean z10) {
        String str;
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f10 = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z10) {
                    f10 = 1.5f;
                }
                int round = Math.round(f10 / exposureCompensationStep);
                float f11 = exposureCompensationStep * round;
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    str = "Exposure compensation already set to " + max + " / " + f11;
                    Log.i("CameraConfiguration", str);
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f11);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        str = "Camera does not support exposure compensation";
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: e */
    public static void m38517e(Camera.Parameters parameters) {
        m38518f(parameters, 10, 20);
    }

    /* renamed from: f */
    public static void m38518f(Camera.Parameters parameters, int i10, int i11) {
        int[] iArr;
        String str;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + m38526n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            iArr = null;
            if (!it.hasNext()) {
                break;
            }
            iArr = it.next();
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (i12 >= i10 * 1000 && i13 <= i11 * 1000) {
                break;
            }
        }
        if (iArr == null) {
            str = "No suitable FPS range?";
        } else {
            int[] iArr2 = new int[2];
            parameters.getPreviewFpsRange(iArr2);
            if (!Arrays.equals(iArr2, iArr)) {
                Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                return;
            }
            str = "FPS range already set to " + Arrays.toString(iArr);
        }
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: g */
    public static void m38519g(Camera.Parameters parameters, C9164i.a aVar, boolean z10) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String m38514b = (z10 || aVar == C9164i.a.AUTO) ? m38514b("focus mode", supportedFocusModes, "auto") : aVar == C9164i.a.CONTINUOUS ? m38514b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : aVar == C9164i.a.INFINITY ? m38514b("focus mode", supportedFocusModes, "infinity") : aVar == C9164i.a.MACRO ? m38514b("focus mode", supportedFocusModes, "macro") : null;
        String str = m38514b;
        if (!z10) {
            str = m38514b;
            if (m38514b == null) {
                str = m38514b("focus mode", supportedFocusModes, "macro", "edof");
            }
        }
        if (str != null) {
            if (!str.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(str);
                return;
            }
            Log.i("CameraConfiguration", "Focus mode already set to " + str);
        }
    }

    @TargetApi(15)
    /* renamed from: h */
    public static void m38520h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            Log.i("CameraConfiguration", "Device does not support focus areas");
            return;
        }
        Log.i("CameraConfiguration", "Old focus areas: " + m38525m(parameters.getFocusAreas()));
        List<Camera.Area> m38513a = m38513a(400);
        Log.i("CameraConfiguration", "Setting focus area to : " + m38525m(m38513a));
        parameters.setFocusAreas(m38513a);
    }

    /* renamed from: i */
    public static void m38521i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String m38514b = m38514b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (m38514b != null) {
            parameters.setColorEffect(m38514b);
        }
    }

    @TargetApi(15)
    /* renamed from: j */
    public static void m38522j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            Log.i("CameraConfiguration", "Device does not support metering areas");
            return;
        }
        Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> m38513a = m38513a(400);
        Log.i("CameraConfiguration", "Setting metering area to : " + m38525m(m38513a));
        parameters.setMeteringAreas(m38513a);
    }

    /* renamed from: k */
    public static void m38523k(Camera.Parameters parameters, boolean z10) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String m38514b = z10 ? m38514b("flash mode", supportedFlashModes, "torch", "on") : m38514b("flash mode", supportedFlashModes, "off");
        if (m38514b != null) {
            if (m38514b.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to " + m38514b);
                return;
            }
            Log.i("CameraConfiguration", "Setting flash mode to " + m38514b);
            parameters.setFlashMode(m38514b);
        }
    }

    @TargetApi(15)
    /* renamed from: l */
    public static void m38524l(Camera.Parameters parameters) {
        String str;
        if (!parameters.isVideoStabilizationSupported()) {
            str = "This device does not support video stabilization";
        } else {
            if (!parameters.getVideoStabilization()) {
                Log.i("CameraConfiguration", "Enabling video stabilization...");
                parameters.setVideoStabilization(true);
                return;
            }
            str = "Video stabilization already enabled";
        }
        Log.i("CameraConfiguration", str);
    }

    @TargetApi(15)
    /* renamed from: m */
    public static String m38525m(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb2.append(area.rect);
            sb2.append(':');
            sb2.append(area.weight);
            sb2.append(' ');
        }
        return sb2.toString();
    }

    /* renamed from: n */
    public static String m38526n(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
