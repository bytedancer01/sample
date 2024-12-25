package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0766d;
import java.util.HashMap;
import java.util.Map;
import p071e2.AbstractC4582k;
import p089f2.InterfaceC4752b;
import p120h2.C5020a;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/background/systemalarm/a.class
 */
/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/background/systemalarm/a.class */
public class C0763a implements InterfaceC4752b {

    /* renamed from: e */
    public static final String f5218e = AbstractC4582k.m23128f("CommandHandler");

    /* renamed from: b */
    public final Context f5219b;

    /* renamed from: c */
    public final Map<String, InterfaceC4752b> f5220c = new HashMap();

    /* renamed from: d */
    public final Object f5221d = new Object();

    public C0763a(Context context) {
        this.f5219b = context;
    }

    /* renamed from: a */
    public static Intent m4924a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    public static Intent m4925b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m4926c(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    /* renamed from: d */
    public static Intent m4927d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    public static Intent m4928f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    public static Intent m4929g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: n */
    public static boolean m4930n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p089f2.InterfaceC4752b
    /* renamed from: e */
    public void mo4931e(String str, boolean z10) {
        synchronized (this.f5221d) {
            InterfaceC4752b remove = this.f5220c.remove(str);
            if (remove != null) {
                remove.mo4931e(str, z10);
            }
        }
    }

    /* renamed from: h */
    public final void m4932h(Intent intent, int i10, C0766d c0766d) {
        AbstractC4582k.m23126c().mo23129a(f5218e, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new C0764b(this.f5219b, i10, c0766d).m4940a();
    }

    /* renamed from: i */
    public final void m4933i(Intent intent, int i10, C0766d c0766d) {
        Bundle extras = intent.getExtras();
        synchronized (this.f5221d) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            AbstractC4582k m23126c = AbstractC4582k.m23126c();
            String str = f5218e;
            m23126c.mo23129a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f5220c.containsKey(string)) {
                AbstractC4582k.m23126c().mo23129a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                C0765c c0765c = new C0765c(this.f5219b, i10, string, c0766d);
                this.f5220c.put(string, c0765c);
                c0765c.m4944d();
            }
        }
    }

    /* renamed from: j */
    public final void m4934j(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC4582k.m23126c().mo23129a(f5218e, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        mo4931e(string, z10);
    }

    /* renamed from: k */
    public final void m4935k(Intent intent, int i10, C0766d c0766d) {
        AbstractC4582k.m23126c().mo23129a(f5218e, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        c0766d.m4952g().m24123u();
    }

    /* renamed from: l */
    public final void m4936l(Intent intent, int i10, C0766d c0766d) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC4582k m23126c = AbstractC4582k.m23126c();
        String str = f5218e;
        m23126c.mo23129a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase m24119q = c0766d.m4952g().m24119q();
        m24119q.m36898c();
        try {
            C6636p mo30599g = m24119q.mo4891B().mo30599g(string);
            if (mo30599g == null) {
                AbstractC4582k.m23126c().mo23133h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (mo30599g.f34574b.isFinished()) {
                AbstractC4582k.m23126c().mo23133h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long m30587a = mo30599g.m30587a();
            if (mo30599g.m30588b()) {
                AbstractC4582k.m23126c().mo23129a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(m30587a)), new Throwable[0]);
                C5020a.m25225c(this.f5219b, c0766d.m4952g(), string, m30587a);
                c0766d.m4956k(new C0766d.b(c0766d, m4924a(this.f5219b), i10));
            } else {
                AbstractC4582k.m23126c().mo23129a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(m30587a)), new Throwable[0]);
                C5020a.m25225c(this.f5219b, c0766d.m4952g(), string, m30587a);
            }
            m24119q.m36910r();
        } finally {
            m24119q.m36900g();
        }
    }

    /* renamed from: m */
    public final void m4937m(Intent intent, C0766d c0766d) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC4582k.m23126c().mo23129a(f5218e, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        c0766d.m4952g().m24128z(string);
        C5020a.m25223a(this.f5219b, c0766d.m4952g(), string);
        c0766d.mo4931e(string, false);
    }

    /* renamed from: o */
    public boolean m4938o() {
        boolean z10;
        synchronized (this.f5221d) {
            z10 = !this.f5220c.isEmpty();
        }
        return z10;
    }

    /* renamed from: p */
    public void m4939p(Intent intent, int i10, C0766d c0766d) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m4932h(intent, i10, c0766d);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m4935k(intent, i10, c0766d);
            return;
        }
        if (!m4930n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC4582k.m23126c().mo23130b(f5218e, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m4936l(intent, i10, c0766d);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m4933i(intent, i10, c0766d);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m4937m(intent, c0766d);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m4934j(intent, i10);
        } else {
            AbstractC4582k.m23126c().mo23133h(f5218e, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
