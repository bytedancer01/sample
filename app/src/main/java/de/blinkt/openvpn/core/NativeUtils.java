package de.blinkt.openvpn.core;

import android.os.Build;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/blinkt/openvpn/core/NativeUtils.class
 */
/* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/core/NativeUtils.class */
public class NativeUtils {

    /* renamed from: a */
    public static final int[] f26820a = {16, 64, 256, 1024, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, 16384};

    static {
        if (m22576b()) {
            return;
        }
        System.loadLibrary("ovpnutil");
        System.loadLibrary("osslspeedtest");
    }

    /* renamed from: a */
    public static String m22575a() {
        return m22576b() ? "ROBO" : getJNIAPI();
    }

    /* renamed from: b */
    public static boolean m22576b() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    private static native String getJNIAPI();
}
