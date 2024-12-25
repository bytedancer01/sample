package p422y9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p097fa.C4794e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/u0.class
 */
/* renamed from: y9.u0 */
/* loaded from: combined.jar:classes2.jar:y9/u0.class */
public final class C9954u0 {

    /* renamed from: a */
    public static final Object f45646a = new Object();

    /* renamed from: b */
    public static boolean f45647b;

    /* renamed from: c */
    public static String f45648c;

    /* renamed from: d */
    public static int f45649d;

    /* renamed from: a */
    public static int m41884a(Context context) {
        m41885b(context);
        return f45649d;
    }

    /* renamed from: b */
    public static void m41885b(Context context) {
        Bundle bundle;
        synchronized (f45646a) {
            if (f45647b) {
                return;
            }
            f45647b = true;
            try {
                bundle = C4794e.m24250a(context).m24245c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f45648c = bundle.getString("com.google.app.id");
            f45649d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
