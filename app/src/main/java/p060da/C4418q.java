package p060da;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p097fa.C4794e;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/q.class
 */
/* renamed from: da.q */
/* loaded from: combined.jar:classes2.jar:da/q.class */
public class C4418q {

    /* renamed from: a */
    public static final int f26707a = Process.myUid();

    /* renamed from: b */
    public static final Method f26708b;

    /* renamed from: c */
    public static final Method f26709c;

    /* renamed from: d */
    public static final Method f26710d;

    /* renamed from: e */
    public static final Method f26711e;

    /* renamed from: f */
    public static final Method f26712f;

    /* renamed from: g */
    public static final Method f26713g;

    /* renamed from: h */
    public static final Method f26714h;

    /* renamed from: i */
    public static final Method f26715i;

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|1|(2:2|3)|4|(21:55|56|7|8|9|10|11|12|13|(12:45|46|16|(9:40|41|19|(6:35|36|22|(6:24|25|26|27|28|29)|32|33)|21|22|(0)|32|33)|18|19|(0)|21|22|(0)|32|33)|15|16|(0)|18|19|(0)|21|22|(0)|32|33)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005c, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p060da.C4418q.m44352clinit():void");
    }

    /* renamed from: a */
    public static void m22466a(WorkSource workSource, int i10, String str) {
        Method method = f26709c;
        if (method != null) {
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str2);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f26708b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m22467b(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo m24245c = C4794e.m24250a(context).m24245c(str, 0);
            if (m24245c == null) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                return null;
            }
            int i10 = m24245c.uid;
            WorkSource workSource = new WorkSource();
            m22466a(workSource, i10, str);
            return workSource;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m22468c(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int m22470e = workSource == null ? 0 : m22470e(workSource);
        if (m22470e != 0) {
            for (int i10 = 0; i10 < m22470e; i10++) {
                Method method = f26712f;
                String str = null;
                if (method != null) {
                    try {
                        str = (String) method.invoke(workSource, Integer.valueOf(i10));
                    } catch (Exception e10) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                        str = null;
                    }
                }
                if (!C4416o.m22463a(str)) {
                    C9935o.m41850j(str);
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m22469d(Context context) {
        return (context == null || context.getPackageManager() == null || C4794e.m24250a(context).m24244b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: e */
    public static int m22470e(WorkSource workSource) {
        Method method = f26710d;
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, new Object[0]);
            C9935o.m41850j(invoke);
            return ((Integer) invoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
