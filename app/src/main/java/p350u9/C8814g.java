package p350u9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import p060da.C4410i;
import p097fa.C4794e;
import p245oa.C6957d;
import p422y9.C9940p1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/g.class
 */
/* renamed from: u9.g */
/* loaded from: combined.jar:classes2.jar:u9/g.class */
public class C8814g {

    /* renamed from: a */
    public static final int f40848a = C8822k.f40857a;

    /* renamed from: b */
    public static final C8814g f40849b = new C8814g();

    /* renamed from: h */
    public static C8814g m37697h() {
        return f40849b;
    }

    /* renamed from: a */
    public void m37698a(Context context) {
        C8822k.m37706a(context);
    }

    /* renamed from: b */
    public int m37699b(Context context) {
        return C8822k.m37708c(context);
    }

    @Deprecated
    /* renamed from: c */
    public Intent m37700c(int i10) {
        return mo37677d(null, i10, null);
    }

    /* renamed from: d */
    public Intent mo37677d(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return C9940p1.m41863c("com.google.android.gms");
        }
        if (context != null && C4410i.m22443d(context)) {
            return C9940p1.m41861a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f40848a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C4794e.m24250a(context).m24247e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e10) {
            }
        }
        return C9940p1.m41862b("com.google.android.gms", sb2.toString());
    }

    /* renamed from: e */
    public PendingIntent mo37678e(Context context, int i10, int i11) {
        return m37701f(context, i10, i11, null);
    }

    /* renamed from: f */
    public PendingIntent m37701f(Context context, int i10, int i11, String str) {
        Intent mo37677d = mo37677d(context, i10, str);
        if (mo37677d == null) {
            return null;
        }
        return C6957d.m31955a(context, i11, mo37677d, C6957d.f35932a | 134217728);
    }

    /* renamed from: g */
    public String mo37679g(int i10) {
        return C8822k.m37709d(i10);
    }

    /* renamed from: i */
    public int mo37680i(Context context) {
        return mo37681j(context, f40848a);
    }

    /* renamed from: j */
    public int mo37681j(Context context, int i10) {
        int m37713h = C8822k.m37713h(context, i10);
        if (C8822k.m37714i(context, m37713h)) {
            return 18;
        }
        return m37713h;
    }

    /* renamed from: k */
    public boolean m37702k(Context context, int i10) {
        return C8822k.m37714i(context, i10);
    }

    /* renamed from: l */
    public boolean m37703l(Context context, String str) {
        return C8822k.m37718m(context, str);
    }

    /* renamed from: m */
    public boolean mo37682m(int i10) {
        return C8822k.m37716k(i10);
    }

    /* renamed from: n */
    public void m37704n(Context context, int i10) {
        C8822k.m37707b(context, i10);
    }
}
