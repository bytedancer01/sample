package p443zc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import mc.C6553c;
import p060da.C4414m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/s.class
 */
/* renamed from: zc.s */
/* loaded from: combined.jar:classes2.jar:zc/s.class */
public class C10185s {

    /* renamed from: a */
    public final Context f46647a;

    /* renamed from: b */
    public String f46648b;

    /* renamed from: c */
    public String f46649c;

    /* renamed from: d */
    public int f46650d;

    /* renamed from: e */
    public int f46651e = 0;

    public C10185s(Context context) {
        this.f46647a = context;
    }

    /* renamed from: c */
    public static String m42635c(C6553c c6553c) {
        String m30260d = c6553c.m30240j().m30260d();
        if (m30260d != null) {
            return m30260d;
        }
        String m30259c = c6553c.m30240j().m30259c();
        if (!m30259c.startsWith("1:")) {
            return m30259c;
        }
        String[] split = m30259c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public String m42636a() {
        String str;
        synchronized (this) {
            if (this.f46648b == null) {
                m42642h();
            }
            str = this.f46648b;
        }
        return str;
    }

    /* renamed from: b */
    public String m42637b() {
        String str;
        synchronized (this) {
            if (this.f46649c == null) {
                m42642h();
            }
            str = this.f46649c;
        }
        return str;
    }

    /* renamed from: d */
    public int m42638d() {
        int i10;
        PackageInfo m42640f;
        synchronized (this) {
            if (this.f46650d == 0 && (m42640f = m42640f("com.google.android.gms")) != null) {
                this.f46650d = m42640f.versionCode;
            }
            i10 = this.f46650d;
        }
        return i10;
    }

    /* renamed from: e */
    public int m42639e() {
        synchronized (this) {
            int i10 = this.f46651e;
            if (i10 != 0) {
                return i10;
            }
            PackageManager packageManager = this.f46647a.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                return 0;
            }
            int i11 = 1;
            if (!C4414m.m22458i()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    this.f46651e = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.f46651e = 2;
                return 2;
            }
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C4414m.m22458i()) {
                this.f46651e = 2;
                i11 = 2;
            } else {
                this.f46651e = 1;
            }
            return i11;
        }
    }

    /* renamed from: f */
    public final PackageInfo m42640f(String str) {
        try {
            return this.f46647a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    /* renamed from: g */
    public boolean m42641g() {
        return m42639e() != 0;
    }

    /* renamed from: h */
    public final void m42642h() {
        synchronized (this) {
            PackageInfo m42640f = m42640f(this.f46647a.getPackageName());
            if (m42640f != null) {
                this.f46648b = Integer.toString(m42640f.versionCode);
                this.f46649c = m42640f.versionName;
            }
        }
    }
}
