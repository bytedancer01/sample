package ua;

import android.content.Context;
import android.content.res.Resources;
import p350u9.C8826m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/v4.class
 */
/* renamed from: ua.v4 */
/* loaded from: combined.jar:classes2.jar:ua/v4.class */
public final class C9096v4 {
    /* renamed from: a */
    public static String m38315a(Context context) {
        String packageName;
        try {
            packageName = context.getResources().getResourcePackageName(C8826m.f40870a);
        } catch (Resources.NotFoundException e10) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    /* renamed from: b */
    public static final String m38316b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        String str3 = null;
        if (identifier != 0) {
            try {
                str3 = resources.getString(identifier);
            } catch (Resources.NotFoundException e10) {
            }
        }
        return str3;
    }
}
