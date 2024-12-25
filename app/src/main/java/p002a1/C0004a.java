package p002a1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a1/a.class
 */
/* renamed from: a1.a */
/* loaded from: combined.jar:classes1.jar:a1/a.class */
public class C0004a {

    /* renamed from: c */
    public static C0004a f8c;

    /* renamed from: a */
    public boolean f9a;

    /* renamed from: b */
    public boolean f10b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a1/a$a.class
     */
    /* renamed from: a1.a$a */
    /* loaded from: combined.jar:classes1.jar:a1/a$a.class */
    public static class a {

        /* renamed from: a */
        public Resources f11a;

        /* renamed from: b */
        public String f12b;

        public a(Resources resources, String str) {
            this.f11a = resources;
            this.f12b = str;
        }

        /* renamed from: a */
        public boolean m26a(String str, boolean z10) {
            int identifier = this.f11a.getIdentifier(str, "bool", this.f12b);
            if (identifier > 0) {
                z10 = this.f11a.getBoolean(identifier);
            }
            return z10;
        }
    }

    public C0004a(Context context) {
        m22a(m23b(context));
    }

    /* renamed from: c */
    public static C0004a m20c(Context context) {
        if (f8c == null) {
            f8c = new C0004a(context);
        }
        return f8c;
    }

    /* renamed from: e */
    public static boolean m21e(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        boolean z10 = true;
        if (activityInfo == null || (activityInfo.applicationInfo.flags & 1) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22a(p002a1.C0004a.a r6) {
        /*
            r5 = this;
            boolean r0 = androidx.leanback.widget.C0543u0.m3027b()
            if (r0 == 0) goto L1a
            r0 = r5
            r1 = 0
            r0.f9a = r1
            r0 = r6
            if (r0 == 0) goto L21
            r0 = r6
            java.lang.String r1 = "leanback_prefer_static_shadows"
            r2 = 0
            boolean r0 = r0.m26a(r1, r2)
            r7 = r0
            goto L1c
        L1a:
            r0 = 1
            r7 = r0
        L1c:
            r0 = r5
            r1 = r7
            r0.f9a = r1
        L21:
            r0 = r5
            r1 = 0
            r0.f10b = r1
            r0 = r6
            if (r0 == 0) goto L35
            r0 = r5
            r1 = r6
            java.lang.String r2 = "leanback_outline_clipping_disabled"
            r3 = 0
            boolean r1 = r1.m26a(r2, r3)
            r0.f10b = r1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0004a.m22a(a1.a$a):void");
    }

    /* renamed from: b */
    public final a m23b(Context context) {
        Resources resources;
        PackageManager packageManager = context.getPackageManager();
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(new Intent("android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"), 0).iterator();
        Resources resources2 = null;
        String str = null;
        while (true) {
            resources = resources2;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.activityInfo.packageName;
            resources = resources2;
            if (str2 != null) {
                resources = resources2;
                if (m21e(next)) {
                    try {
                        resources = packageManager.getResourcesForApplication(str2);
                    } catch (PackageManager.NameNotFoundException e10) {
                        resources = resources2;
                    }
                }
            }
            resources2 = resources;
            str = str2;
            if (resources != null) {
                str = str2;
                break;
            }
        }
        return resources == null ? null : new a(resources, str);
    }

    /* renamed from: d */
    public boolean m24d() {
        return this.f10b;
    }

    /* renamed from: f */
    public boolean m25f() {
        return this.f9a;
    }
}
