package org.minidns.util;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/PlatformDetection.class */
public class PlatformDetection {

    /* renamed from: android, reason: collision with root package name */
    private static Boolean f46850android;

    public static boolean isAndroid() {
        if (f46850android == null) {
            try {
                Class.forName("android.Manifest");
                f46850android = Boolean.TRUE;
            } catch (Exception e10) {
                f46850android = Boolean.FALSE;
            }
        }
        return f46850android.booleanValue();
    }
}
