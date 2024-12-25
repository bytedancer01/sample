package p407xe;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xe/f.class
 */
/* renamed from: xe.f */
/* loaded from: combined.jar:classes2.jar:xe/f.class */
public class C9744f {

    /* renamed from: a */
    public static SharedPreferences f44472a;

    /* renamed from: b */
    public static SharedPreferences.Editor f44473b;

    /* renamed from: c */
    public static String f44474c = "";

    /* renamed from: d */
    public static Boolean f44475d = Boolean.FALSE;

    /* renamed from: a */
    public static String m41039a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("url", "");
        f44474c = string;
        return string.toLowerCase();
    }

    /* renamed from: b */
    public static String m41040b(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("notificationkey", "");
        f44474c = string;
        return string;
    }

    /* renamed from: c */
    public static String m41041c(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("key", "");
        f44474c = string;
        return string;
    }

    /* renamed from: d */
    public static String m41042d(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("salt", "");
        f44474c = string;
        return string;
    }

    /* renamed from: e */
    public static void m41043e(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        f44473b = edit;
        edit.putString("url", str);
        f44473b.commit();
    }

    /* renamed from: f */
    public static void m41044f(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        f44473b = edit;
        edit.putString("notificationkey", str);
        f44473b.commit();
    }

    /* renamed from: g */
    public static void m41045g(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        f44473b = edit;
        edit.putString("key", str);
        f44473b.commit();
    }

    /* renamed from: h */
    public static void m41046h(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f44472a = defaultSharedPreferences;
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        f44473b = edit;
        edit.putString("salt", str);
        f44473b.commit();
    }
}
