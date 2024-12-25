package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/Clientdatabase/ClientSharepreferenceHandler.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/Clientdatabase/ClientSharepreferenceHandler.class */
public class ClientSharepreferenceHandler {
    /* renamed from: a */
    public static int m14490a(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getInt(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, -1);
    }

    /* renamed from: b */
    public static int m14491b(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getInt("freetrailtime", DateTimeConstants.SECONDS_PER_DAY);
    }

    /* renamed from: c */
    public static String m14492c(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("email", "abc@gmail.com");
    }

    /* renamed from: d */
    public static String m14493d(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("prefix", "$");
    }

    /* renamed from: e */
    public static String m14494e(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("Suffix", "USD");
    }

    /* renamed from: f */
    public static void m14495f(int i10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("sharedPreference", 0).edit();
        edit.putInt(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, i10);
        edit.apply();
    }

    /* renamed from: g */
    public static void m14496g(int i10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("sharedPreference", 0).edit();
        edit.putInt("freetrailtime", i10);
        edit.apply();
    }

    /* renamed from: h */
    public static void m14497h(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("sharedPreference", 0).edit();
        edit.putString("isfreetrial", str);
        edit.apply();
    }

    /* renamed from: i */
    public static void m14498i(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("sharedPreference", 0).edit();
        edit.putString("email", str);
        edit.apply();
    }

    /* renamed from: j */
    public static void m14499j(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("sharedPreference", 0).edit();
        edit.putString("prefix", str);
        edit.apply();
    }

    /* renamed from: k */
    public static void m14500k(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("sharedPreference", 0).edit();
        edit.putString("Suffix", str);
        edit.apply();
    }
}
