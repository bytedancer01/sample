package p135hh;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/y.class
 */
/* renamed from: hh.y */
/* loaded from: combined.jar:classes2.jar:hh/y.class */
public class C5117y {
    /* renamed from: a */
    public static SharedPreferences m25656a(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 4);
    }

    /* renamed from: b */
    public static SharedPreferences m25657b(String str, Context context) {
        return context.getSharedPreferences(str, 4);
    }
}
