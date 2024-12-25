package p310rg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rg/c.class
 */
/* renamed from: rg.c */
/* loaded from: combined.jar:classes2.jar:rg/c.class */
public class C8473c {
    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public static String m36396a(float f10) {
        return String.format("%d:%02d", Integer.valueOf((int) (f10 / 60.0f)), Integer.valueOf((int) (f10 % 60.0f)));
    }

    /* renamed from: b */
    public static boolean m36397b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
