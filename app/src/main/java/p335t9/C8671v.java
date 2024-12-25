package p335t9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p060da.C4414m;
import p097fa.C4794e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/v.class
 */
/* renamed from: t9.v */
/* loaded from: combined.jar:classes2.jar:t9/v.class */
public final class C8671v {

    /* renamed from: a */
    public final Context f40443a;

    /* renamed from: b */
    public int f40444b;

    /* renamed from: c */
    public int f40445c = 0;

    public C8671v(Context context) {
        this.f40443a = context;
    }

    /* renamed from: a */
    public final int m37165a() {
        synchronized (this) {
            int i10 = this.f40445c;
            if (i10 != 0) {
                return i10;
            }
            PackageManager packageManager = this.f40443a.getPackageManager();
            if (C4794e.m24250a(this.f40443a).m24244b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            if (!C4414m.m22458i()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    this.f40445c = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.f40445c = 2;
                return 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (C4414m.m22458i()) {
                this.f40445c = 2;
            } else {
                this.f40445c = 1;
            }
            return this.f40445c;
        }
    }

    /* renamed from: b */
    public final PackageInfo m37166b(String str) {
        try {
            return C4794e.m24250a(this.f40443a).m24247e(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("Metadata", sb2.toString());
            return null;
        }
    }

    /* renamed from: c */
    public final int m37167c() {
        int i10;
        PackageInfo m37166b;
        synchronized (this) {
            if (this.f40444b == 0 && (m37166b = m37166b("com.google.android.gms")) != null) {
                this.f40444b = m37166b.versionCode;
            }
            i10 = this.f40444b;
        }
        return i10;
    }
}
