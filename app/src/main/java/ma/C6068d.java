package ma;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/d.class
 */
/* renamed from: ma.d */
/* loaded from: combined.jar:classes2.jar:ma/d.class */
public final class C6068d {

    /* renamed from: a */
    public static long f33717a = 6000;

    /* renamed from: b */
    public static boolean f33718b;

    /* renamed from: a */
    public static long m29514a() {
        return f33717a;
    }

    /* renamed from: b */
    public static /* synthetic */ void m29515b(Bundle bundle) {
        bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", 300L);
        bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", 10000L);
        f33717a = bundle.getLong("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS", 6000L);
        f33718b = bundle.getBoolean("com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ENABLE_WIFI_WARNING", false);
    }

    /* renamed from: c */
    public static boolean m29516c() {
        return f33718b;
    }
}
