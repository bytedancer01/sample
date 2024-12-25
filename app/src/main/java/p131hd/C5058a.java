package p131hd;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import p050d0.C4290b;
import p405xc.InterfaceC9722c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hd/a.class
 */
/* renamed from: hd.a */
/* loaded from: combined.jar:classes2.jar:hd/a.class */
public class C5058a {

    /* renamed from: a */
    public final Context f29136a;

    /* renamed from: b */
    public final SharedPreferences f29137b;

    /* renamed from: c */
    public final InterfaceC9722c f29138c;

    /* renamed from: d */
    public boolean f29139d;

    public C5058a(Context context, String str, InterfaceC9722c interfaceC9722c) {
        Context m25292a = m25292a(context);
        this.f29136a = m25292a;
        this.f29137b = m25292a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f29138c = interfaceC9722c;
        this.f29139d = m25294c();
    }

    /* renamed from: a */
    public static Context m25292a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C4290b.m21723b(context);
    }

    /* renamed from: b */
    public boolean m25293b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f29139d;
        }
        return z10;
    }

    /* renamed from: c */
    public final boolean m25294c() {
        return this.f29137b.contains("firebase_data_collection_default_enabled") ? this.f29137b.getBoolean("firebase_data_collection_default_enabled", true) : m25295d();
    }

    /* renamed from: d */
    public final boolean m25295d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f29136a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f29136a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException e10) {
            return true;
        }
    }
}
