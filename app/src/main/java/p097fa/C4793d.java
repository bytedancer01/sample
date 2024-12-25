package p097fa;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import p060da.C4414m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fa/d.class
 */
/* renamed from: fa.d */
/* loaded from: combined.jar:classes2.jar:fa/d.class */
public class C4793d {

    /* renamed from: a */
    public final Context f28235a;

    public C4793d(Context context) {
        this.f28235a = context;
    }

    /* renamed from: a */
    public int m24243a(String str) {
        return this.f28235a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m24244b(String str, String str2) {
        return this.f28235a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m24245c(String str, int i10) {
        return this.f28235a.getPackageManager().getApplicationInfo(str, i10);
    }

    /* renamed from: d */
    public CharSequence m24246d(String str) {
        return this.f28235a.getPackageManager().getApplicationLabel(this.f28235a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo m24247e(String str, int i10) {
        return this.f28235a.getPackageManager().getPackageInfo(str, i10);
    }

    /* renamed from: f */
    public boolean m24248f() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C4791b.m24241a(this.f28235a);
        }
        if (!C4414m.m22458i() || (nameForUid = this.f28235a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.f28235a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean m24249g(int i10, String str) {
        if (C4414m.m22453d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f28235a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i10, str);
                return true;
            } catch (SecurityException e10) {
                return false;
            }
        }
        String[] packagesForUid = this.f28235a.getPackageManager().getPackagesForUid(i10);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (String str2 : packagesForUid) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
