package p050d0;

import android.content.Context;
import android.os.Process;
import p030c0.C0948j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d0/j.class
 */
/* renamed from: d0.j */
/* loaded from: combined.jar:classes1.jar:d0/j.class */
public final class C4298j {
    /* renamed from: a */
    public static int m21758a(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String m5669b = C0948j.m5669b(str);
        if (m5669b == null) {
            return 0;
        }
        String str3 = str2;
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str3 = packagesForUid[0];
        }
        return C0948j.m5668a(context, m5669b, str3) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m21759b(Context context, String str) {
        return m21758a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
