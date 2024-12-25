package ma;

import android.content.SharedPreferences;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/o8.class
 */
/* renamed from: ma.o8 */
/* loaded from: combined.jar:classes2.jar:ma/o8.class */
public final class C6308o8 {

    /* renamed from: k */
    public static final C8015b f33925k = new C8015b("ApplicationAnalyticsSession");

    /* renamed from: l */
    public static long f33926l = System.currentTimeMillis();

    /* renamed from: a */
    public String f33927a;

    /* renamed from: b */
    public String f33928b;

    /* renamed from: c */
    public long f33929c = f33926l;

    /* renamed from: d */
    public int f33930d = 1;

    /* renamed from: e */
    public String f33931e;

    /* renamed from: f */
    public int f33932f;

    /* renamed from: g */
    public String f33933g;

    /* renamed from: h */
    public boolean f33934h;

    /* renamed from: i */
    public boolean f33935i;

    /* renamed from: j */
    public int f33936j;

    public C6308o8(boolean z10) {
        this.f33934h = z10;
    }

    /* renamed from: a */
    public static C6308o8 m29924a(boolean z10) {
        C6308o8 c6308o8 = new C6308o8(z10);
        f33926l++;
        return c6308o8;
    }

    /* renamed from: b */
    public static C6308o8 m29925b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        C6308o8 c6308o8 = new C6308o8(sharedPreferences.getBoolean("is_app_backgrounded", false));
        c6308o8.f33935i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        c6308o8.f33927a = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        c6308o8.f33928b = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        c6308o8.f33929c = sharedPreferences.getLong("analytics_session_id", 0L);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        c6308o8.f33930d = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        c6308o8.f33931e = sharedPreferences.getString("receiver_session_id", "");
        c6308o8.f33932f = sharedPreferences.getInt("device_capabilities", 0);
        c6308o8.f33933g = sharedPreferences.getString("device_model_name", "");
        c6308o8.f33936j = sharedPreferences.getInt("analytics_session_start_type", 0);
        return c6308o8;
    }

    /* renamed from: c */
    public final void m29926c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        f33925k.m34873a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", this.f33927a);
        edit.putString("receiver_metrics_id", this.f33928b);
        edit.putLong("analytics_session_id", this.f33929c);
        edit.putInt("event_sequence_number", this.f33930d);
        edit.putString("receiver_session_id", this.f33931e);
        edit.putInt("device_capabilities", this.f33932f);
        edit.putString("device_model_name", this.f33933g);
        edit.putInt("analytics_session_start_type", this.f33936j);
        edit.putBoolean("is_app_backgrounded", this.f33934h);
        edit.putBoolean("is_output_switcher_enabled", this.f33935i);
        edit.apply();
    }
}
