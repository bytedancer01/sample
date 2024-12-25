package ua;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p422y9.C9935o;
import p422y9.C9944r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/m7.class
 */
/* renamed from: ua.m7 */
/* loaded from: combined.jar:classes2.jar:ua/m7.class */
public final class C8992m7 {
    @Deprecated
    /* renamed from: a */
    public static String m38132a(Context context, String str) {
        try {
            return new C9944r(context).m41873a("google_app_id");
        } catch (Resources.NotFoundException e10) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m38133b(Context context, String str, String str2) {
        C9935o.m41850j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C9096v4.m38315a(context);
        }
        return C9096v4.m38316b("google_app_id", resources, str2);
    }

    /* renamed from: c */
    public static String m38134c(String str, String[] strArr, String[] strArr2) {
        C9935o.m41850j(strArr);
        C9935o.m41850j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
