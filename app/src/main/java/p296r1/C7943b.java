package p296r1;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r1/b.class
 */
/* renamed from: r1.b */
/* loaded from: combined.jar:classes1.jar:r1/b.class */
public class C7943b {
    /* renamed from: a */
    public static SharedPreferences m34478a(Context context) {
        return context.getSharedPreferences(m34480c(context), m34479b());
    }

    /* renamed from: b */
    public static int m34479b() {
        return 0;
    }

    /* renamed from: c */
    public static String m34480c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
