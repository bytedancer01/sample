package p237o2;

import android.content.ComponentName;
import android.content.Context;
import p071e2.AbstractC4582k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/e.class
 */
/* renamed from: o2.e */
/* loaded from: combined.jar:classes1.jar:o2/e.class */
public class C6872e {

    /* renamed from: a */
    public static final String f35632a = AbstractC4582k.m23128f("PackageManagerHelper");

    /* renamed from: a */
    public static void m31709a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC4582k.m23126c().mo23129a(f35632a, String.format("%s %s", cls.getName(), z10 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e10) {
            AbstractC4582k.m23126c().mo23129a(f35632a, String.format("%s could not be %s", cls.getName(), z10 ? "enabled" : "disabled"), e10);
        }
    }
}
