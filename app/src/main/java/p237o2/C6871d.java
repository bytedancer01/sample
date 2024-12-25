package p237o2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p223n2.C6624d;
import p375w1.InterfaceC9397b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/d.class
 */
/* renamed from: o2.d */
/* loaded from: combined.jar:classes1.jar:o2/d.class */
public class C6871d {

    /* renamed from: a */
    public final WorkDatabase f35631a;

    public C6871d(WorkDatabase workDatabase) {
        this.f35631a = workDatabase;
    }

    /* renamed from: a */
    public static void m31704a(Context context, InterfaceC9397b interfaceC9397b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            interfaceC9397b.mo39711A();
            try {
                interfaceC9397b.mo39715P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                interfaceC9397b.mo39715P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                interfaceC9397b.mo39714O();
            } finally {
                interfaceC9397b.mo39717S();
            }
        }
    }

    /* renamed from: b */
    public int m31705b() {
        int m31706c;
        synchronized (C6871d.class) {
            try {
                m31706c = m31706c("next_alarm_manager_id");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m31706c;
    }

    /* renamed from: c */
    public final int m31706c(String str) {
        this.f35631a.m36898c();
        try {
            Long mo30574b = this.f35631a.mo4894x().mo30574b(str);
            int i10 = 0;
            int intValue = mo30574b != null ? mo30574b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i10 = intValue + 1;
            }
            m31708e(str, i10);
            this.f35631a.m36910r();
            this.f35631a.m36900g();
            return intValue;
        } catch (Throwable th2) {
            this.f35631a.m36900g();
            throw th2;
        }
    }

    /* renamed from: d */
    public int m31707d(int i10, int i11) {
        synchronized (C6871d.class) {
            try {
                int m31706c = m31706c("next_job_scheduler_id");
                if (m31706c < i10 || m31706c > i11) {
                    m31708e("next_job_scheduler_id", i10 + 1);
                } else {
                    i10 = m31706c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    /* renamed from: e */
    public final void m31708e(String str, int i10) {
        this.f35631a.mo4894x().mo30573a(new C6624d(str, i10));
    }
}
