package p350u9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/l.class
 */
/* renamed from: u9.l */
/* loaded from: combined.jar:classes2.jar:u9/l.class */
public class C8824l {

    /* renamed from: c */
    public static C8824l f40863c;

    /* renamed from: a */
    public final Context f40864a;

    /* renamed from: b */
    public volatile String f40865b;

    public C8824l(Context context) {
        this.f40864a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C8824l m37720a(Context context) {
        C9935o.m41850j(context);
        synchronized (C8824l.class) {
            try {
                if (f40863c == null) {
                    C8805b0.m37667d(context);
                    f40863c = new C8824l(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f40863c;
    }

    /* renamed from: d */
    public static final AbstractBinderC8837x m37721d(PackageInfo packageInfo, AbstractBinderC8837x... abstractBinderC8837xArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC8838y binderC8838y = new BinderC8838y(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < abstractBinderC8837xArr.length; i10++) {
            if (abstractBinderC8837xArr[i10].equals(binderC8838y)) {
                return abstractBinderC8837xArr[i10];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m37722e(PackageInfo packageInfo, boolean z10) {
        if (packageInfo == null || packageInfo.signatures == null) {
            return false;
        }
        return (z10 ? m37721d(packageInfo, C8803a0.f40817a) : m37721d(packageInfo, C8803a0.f40817a[0])) != null;
    }

    /* renamed from: b */
    public boolean m37723b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m37722e(packageInfo, false)) {
            return true;
        }
        if (!m37722e(packageInfo, true)) {
            return false;
        }
        if (C8822k.m37712g(this.f40864a)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }

    /* renamed from: c */
    public boolean m37724c(int i10) {
        C8825l0 m37727c;
        int length;
        String[] packagesForUid = this.f40864a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m37727c = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C9935o.m41850j(m37727c);
                    break;
                }
                m37727c = m37725f(packagesForUid[i11], false, false);
                if (m37727c.f40867a) {
                    break;
                }
                i11++;
            }
        } else {
            m37727c = C8825l0.m37727c("no pkgs");
        }
        m37727c.m37729e();
        return m37727c.f40867a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    public final C8825l0 m37725f(String str, boolean z10, boolean z11) {
        C8825l0 m37664a;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return C8825l0.m37727c("null pkg");
        }
        if (str.equals(this.f40865b)) {
            return C8825l0.m37726b();
        }
        if (C8805b0.m37668e()) {
            m37664a = C8805b0.m37665b(str, C8822k.m37712g(this.f40864a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f40864a.getPackageManager().getPackageInfo(str, 64);
                boolean m37712g = C8822k.m37712g(this.f40864a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        BinderC8838y binderC8838y = new BinderC8838y(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        m37664a = C8805b0.m37664a(str3, binderC8838y, m37712g, false);
                        if (m37664a.f40867a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && C8805b0.m37664a(str3, binderC8838y, false, true).f40867a) {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                m37664a = C8825l0.m37727c(str2);
            } catch (PackageManager.NameNotFoundException e10) {
                return C8825l0.m37728d(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e10);
            }
        }
        if (m37664a.f40867a) {
            this.f40865b = str;
        }
        return m37664a;
    }
}
