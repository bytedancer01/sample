package p166ja;

import android.content.Context;
import android.content.SharedPreferences;
import qa.C7873d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ja/f.class
 */
/* renamed from: ja.f */
/* loaded from: combined.jar:classes2.jar:ja/f.class */
public final class C5347f {

    /* renamed from: a */
    public static SharedPreferences f30657a;

    /* renamed from: a */
    public static SharedPreferences m26622a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f30657a == null) {
                    f30657a = (SharedPreferences) C7873d.m34144a(new CallableC5346e(context));
                }
                sharedPreferences = f30657a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
