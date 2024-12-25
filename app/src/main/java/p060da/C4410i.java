package p060da;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p350u9.C8822k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/i.class
 */
/* renamed from: da.i */
/* loaded from: combined.jar:classes2.jar:da/i.class */
public final class C4410i {

    /* renamed from: a */
    public static Boolean f26696a;

    /* renamed from: b */
    public static Boolean f26697b;

    /* renamed from: c */
    public static Boolean f26698c;

    /* renamed from: d */
    public static Boolean f26699d;

    /* renamed from: a */
    public static boolean m22440a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f26699d == null) {
            boolean z10 = false;
            if (C4414m.m22458i()) {
                z10 = false;
                if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                    z10 = true;
                }
            }
            f26699d = Boolean.valueOf(z10);
        }
        return f26699d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m22441b() {
        int i10 = C8822k.f40857a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m22442c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f26696a == null) {
            boolean z10 = false;
            if (C4414m.m22454e()) {
                z10 = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z10 = true;
                }
            }
            f26696a = Boolean.valueOf(z10);
        }
        return f26696a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m22443d(Context context) {
        boolean z10 = true;
        if (m22442c(context)) {
            if (C4414m.m22457h()) {
                if (m22444e(context) && !C4414m.m22458i()) {
                    return true;
                }
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m22444e(Context context) {
        if (f26697b == null) {
            boolean z10 = false;
            if (C4414m.m22455f()) {
                z10 = false;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    z10 = true;
                }
            }
            f26697b = Boolean.valueOf(z10);
        }
        return f26697b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m22445f(Context context) {
        if (f26698c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                z10 = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            }
            f26698c = Boolean.valueOf(z10);
        }
        return f26698c.booleanValue();
    }
}
