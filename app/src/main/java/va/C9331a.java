package va;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import p350u9.C8814g;
import p350u9.C8816h;
import p350u9.C8818i;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:va/a.class
 */
/* renamed from: va.a */
/* loaded from: combined.jar:classes2.jar:va/a.class */
public class C9331a {

    /* renamed from: a */
    public static final String f42517a = "a";

    /* renamed from: b */
    public static final C8814g f42518b = C8814g.m37697h();

    /* renamed from: c */
    public static final Object f42519c = new Object();

    /* renamed from: d */
    public static DynamiteModule f42520d = null;

    /* renamed from: e */
    public static String f42521e = "0";

    /* renamed from: a */
    public static boolean m39321a() {
        return m39322b() != null;
    }

    /* renamed from: b */
    public static DynamiteModule m39322b() {
        DynamiteModule dynamiteModule;
        synchronized (f42519c) {
            dynamiteModule = f42520d;
        }
        return dynamiteModule;
    }

    /* renamed from: c */
    public static String m39323c() {
        String str;
        synchronized (f42519c) {
            str = f42521e;
        }
        return str;
    }

    @Deprecated
    /* renamed from: d */
    public static void m39324d(@RecentlyNonNull Context context) {
        synchronized (f42519c) {
            if (m39321a()) {
                return;
            }
            C9935o.m41851k(context, "Context must not be null");
            try {
                ((ClassLoader) C9935o.m41850j(C9331a.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                int apiLevel = ApiVersion.getApiLevel();
                C8814g c8814g = f42518b;
                c8814g.m37704n(context, 11925000);
                try {
                    DynamiteModule m13174e = DynamiteModule.m13174e(context, DynamiteModule.f14835b, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = m13174e.m13181b().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() == C9331a.class.getClassLoader()) {
                            Log.e(f42517a, "ImplVersion class is missing from Cronet module.");
                            throw new C8816h(8);
                        }
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        int intValue = ((Integer) C9935o.m41850j((Integer) method.invoke(null, new Object[0]))).intValue();
                        f42521e = (String) C9935o.m41850j((String) method2.invoke(null, new Object[0]));
                        if (apiLevel <= intValue) {
                            f42520d = m13174e;
                            return;
                        }
                        Intent mo37677d = c8814g.mo37677d(context, 2, "cr");
                        if (mo37677d == null) {
                            Log.e(f42517a, "Unable to fetch error resolution intent");
                            throw new C8816h(2);
                        }
                        String str = f42521e;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 174);
                        sb2.append("Google Play Services update is required. The API Level of the client is ");
                        sb2.append(apiLevel);
                        sb2.append(". The API Level of the implementation is ");
                        sb2.append(intValue);
                        sb2.append(". The Cronet implementation version is ");
                        sb2.append(str);
                        throw new C8818i(2, sb2.toString(), mo37677d);
                    } catch (Exception e10) {
                        Log.e(f42517a, "Unable to read Cronet version from the Cronet module ", e10);
                        throw ((C8816h) new C8816h(8).initCause(e10));
                    }
                } catch (DynamiteModule.C2419a e11) {
                    Log.e(f42517a, "Unable to load Cronet module", e11);
                    throw ((C8816h) new C8816h(8).initCause(e11));
                }
            } catch (ClassNotFoundException e12) {
                Log.e(f42517a, "Cronet API is not available. Have you included all required dependencies?");
                throw ((C8816h) new C8816h(10).initCause(e12));
            }
        }
    }
}
