package p120h2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0763a;
import p071e2.AbstractC4582k;
import p089f2.C4759i;
import p223n2.C6627g;
import p223n2.InterfaceC6628h;
import p237o2.C6871d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h2/a.class
 */
/* renamed from: h2.a */
/* loaded from: combined.jar:classes1.jar:h2/a.class */
public class C5020a {

    /* renamed from: a */
    public static final String f29063a = AbstractC4582k.m23128f("Alarms");

    /* renamed from: a */
    public static void m25223a(Context context, C4759i c4759i, String str) {
        InterfaceC6628h mo4895y = c4759i.m24119q().mo4895y();
        C6627g mo30577b = mo4895y.mo30577b(str);
        if (mo30577b != null) {
            m25224b(context, str, mo30577b.f34551b);
            AbstractC4582k.m23126c().mo23129a(f29063a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            mo4895y.mo30579d(str);
        }
    }

    /* renamed from: b */
    public static void m25224b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, C0763a.m4925b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC4582k.m23126c().mo23129a(f29063a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* renamed from: c */
    public static void m25225c(Context context, C4759i c4759i, String str, long j10) {
        int m31705b;
        WorkDatabase m24119q = c4759i.m24119q();
        InterfaceC6628h mo4895y = m24119q.mo4895y();
        C6627g mo30577b = mo4895y.mo30577b(str);
        if (mo30577b != null) {
            m25224b(context, str, mo30577b.f34551b);
            m31705b = mo30577b.f34551b;
        } else {
            m31705b = new C6871d(m24119q).m31705b();
            mo4895y.mo30576a(new C6627g(str, m31705b));
        }
        m25226d(context, str, m31705b, j10);
    }

    /* renamed from: d */
    public static void m25226d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, C0763a.m4925b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
