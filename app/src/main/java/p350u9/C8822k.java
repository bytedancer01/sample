package p350u9;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p060da.C4410i;
import p060da.C4414m;
import p060da.C4417p;
import p060da.C4419r;
import p097fa.C4794e;
import p406xd.C9728e;
import p422y9.C9935o;
import p422y9.C9954u0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/k.class
 */
/* renamed from: u9.k */
/* loaded from: combined.jar:classes2.jar:u9/k.class */
public class C8822k {

    /* renamed from: a */
    @Deprecated
    public static final int f40857a = 12451000;

    /* renamed from: c */
    public static boolean f40859c;

    /* renamed from: d */
    public static boolean f40860d;

    /* renamed from: b */
    public static final AtomicBoolean f40858b = new AtomicBoolean();

    /* renamed from: e */
    public static final AtomicBoolean f40861e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m37706a(Context context) {
        if (f40858b.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e10) {
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m37707b(Context context, int i10) {
        int mo37681j = C8814g.m37697h().mo37681j(context, i10);
        if (mo37681j != 0) {
            Intent mo37677d = C8814g.m37697h().mo37677d(context, mo37681j, C9728e.f44384d);
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(mo37681j);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (mo37677d != null) {
                throw new C8818i(mo37681j, "Google Play Services not available", mo37677d);
            }
            throw new C8816h(mo37681j);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static int m37708c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: d */
    public static String m37709d(int i10) {
        return C8804b.m37658U(i10);
    }

    /* renamed from: e */
    public static Context m37710e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e10) {
            return null;
        }
    }

    /* renamed from: f */
    public static Resources m37711f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e10) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m37712g(Context context) {
        try {
            if (!f40860d) {
                try {
                    PackageInfo m24247e = C4794e.m24250a(context).m24247e("com.google.android.gms", 64);
                    C8824l.m37720a(context);
                    if (m24247e == null || C8824l.m37722e(m24247e, false) || !C8824l.m37722e(m24247e, true)) {
                        f40859c = false;
                    } else {
                        f40859c = true;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                }
                f40860d = true;
            }
            return f40859c || !C4410i.m22441b();
        } catch (Throwable th2) {
            f40860d = true;
            throw th2;
        }
    }

    @Deprecated
    /* renamed from: h */
    public static int m37713h(Context context, int i10) {
        String valueOf;
        String str;
        PackageInfo packageInfo;
        int i11;
        PackageInfo packageInfo2;
        try {
            context.getResources().getString(C8826m.f40870a);
        } catch (Throwable th2) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f40861e.get()) {
            int m41884a = C9954u0.m41884a(context);
            if (m41884a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (m41884a != f40857a) {
                throw new GooglePlayServicesIncorrectManifestValueException(m41884a);
            }
        }
        boolean z10 = (C4410i.m22443d(context) || C4410i.m22445f(context)) ? false : true;
        C9935o.m41841a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e10) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C8824l.m37720a(context);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            i11 = 1;
        }
        if (C8824l.m37722e(packageInfo2, true)) {
            if (z10) {
                C9935o.m41850j(packageInfo);
                if (!C8824l.m37722e(packageInfo, true)) {
                    valueOf = String.valueOf(packageName);
                    str = " requires Google Play Store, but its signature is invalid.";
                }
            }
            if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                if (C4419r.m22471a(packageInfo2.versionCode) < C4419r.m22471a(i10)) {
                    int i12 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i10);
                    sb2.append(" but found ");
                    sb2.append(i12);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    i11 = 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    ApplicationInfo applicationInfo2 = applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo2 = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e12) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e12);
                            i11 = 1;
                        }
                    }
                    if (applicationInfo2.enabled) {
                        return 0;
                    }
                    i11 = 3;
                }
                return i11;
            }
            valueOf = String.valueOf(packageName);
            str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
        } else {
            valueOf = String.valueOf(packageName);
            str = " requires Google Play services, but their signature is invalid.";
        }
        Log.w("GooglePlayServicesUtil", valueOf.concat(str));
        i11 = 9;
        return i11;
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m37714i(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m37718m(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: j */
    public static boolean m37715j(Context context) {
        if (!C4414m.m22452c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C9935o.m41850j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m37716k(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @Deprecated
    @TargetApi(19)
    /* renamed from: l */
    public static boolean m37717l(Context context, int i10, String str) {
        return C4417p.m22465b(context, i10, str);
    }

    @TargetApi(21)
    /* renamed from: m */
    public static boolean m37718m(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C4414m.m22455f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !m37715j(context);
        } catch (PackageManager.NameNotFoundException e11) {
            return false;
        }
    }
}
