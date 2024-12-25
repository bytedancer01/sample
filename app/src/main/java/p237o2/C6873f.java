package p237o2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p223n2.C6624d;
import p375w1.InterfaceC9397b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/f.class
 */
/* renamed from: o2.f */
/* loaded from: combined.jar:classes1.jar:o2/f.class */
public class C6873f {

    /* renamed from: a */
    public final WorkDatabase f35633a;

    public C6873f(WorkDatabase workDatabase) {
        this.f35633a = workDatabase;
    }

    /* renamed from: b */
    public static void m31710b(Context context, InterfaceC9397b interfaceC9397b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            interfaceC9397b.mo39711A();
            try {
                interfaceC9397b.mo39715P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                interfaceC9397b.mo39715P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                interfaceC9397b.mo39714O();
            } finally {
                interfaceC9397b.mo39717S();
            }
        }
    }

    /* renamed from: a */
    public boolean m31711a() {
        Long mo30574b = this.f35633a.mo4894x().mo30574b("reschedule_needed");
        return mo30574b != null && mo30574b.longValue() == 1;
    }

    /* renamed from: c */
    public void m31712c(boolean z10) {
        this.f35633a.mo4894x().mo30573a(new C6624d("reschedule_needed", z10));
    }
}
