package p089f2;

import android.content.Context;
import android.os.Build;
import androidx.work.C0756a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import p071e2.AbstractC4582k;
import p120h2.C5021b;
import p140i2.C5164k;
import p223n2.C6636p;
import p223n2.InterfaceC6637q;
import p237o2.C6872e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f2/f.class
 */
/* renamed from: f2.f */
/* loaded from: combined.jar:classes1.jar:f2/f.class */
public class C4756f {

    /* renamed from: a */
    public static final String f28029a = AbstractC4582k.m23128f("Schedulers");

    /* renamed from: a */
    public static InterfaceC4755e m24088a(Context context, C4759i c4759i) {
        InterfaceC4755e interfaceC4755e;
        if (Build.VERSION.SDK_INT >= 23) {
            interfaceC4755e = new C5164k(context, c4759i);
            C6872e.m31709a(context, SystemJobService.class, true);
            AbstractC4582k.m23126c().mo23129a(f28029a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        } else {
            InterfaceC4755e m24090c = m24090c(context);
            interfaceC4755e = m24090c;
            if (m24090c == null) {
                interfaceC4755e = new C5021b(context);
                C6872e.m31709a(context, SystemAlarmService.class, true);
                AbstractC4582k.m23126c().mo23129a(f28029a, "Created SystemAlarmScheduler", new Throwable[0]);
            }
        }
        return interfaceC4755e;
    }

    /* renamed from: b */
    public static void m24089b(C0756a c0756a, WorkDatabase workDatabase, List<InterfaceC4755e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC6637q mo4891B = workDatabase.mo4891B();
        workDatabase.m36898c();
        try {
            List<C6636p> mo30607o = mo4891B.mo30607o(c0756a.m4856h());
            List<C6636p> mo30602j = mo4891B.mo30602j(200);
            if (mo30607o != null && mo30607o.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<C6636p> it = mo30607o.iterator();
                while (it.hasNext()) {
                    mo4891B.mo30605m(it.next().f34573a, currentTimeMillis);
                }
            }
            workDatabase.m36910r();
            if (mo30607o != null && mo30607o.size() > 0) {
                C6636p[] c6636pArr = (C6636p[]) mo30607o.toArray(new C6636p[mo30607o.size()]);
                for (InterfaceC4755e interfaceC4755e : list) {
                    if (interfaceC4755e.mo24087d()) {
                        interfaceC4755e.mo24085a(c6636pArr);
                    }
                }
            }
            if (mo30602j == null || mo30602j.size() <= 0) {
                return;
            }
            C6636p[] c6636pArr2 = (C6636p[]) mo30602j.toArray(new C6636p[mo30602j.size()]);
            for (InterfaceC4755e interfaceC4755e2 : list) {
                if (!interfaceC4755e2.mo24087d()) {
                    interfaceC4755e2.mo24085a(c6636pArr2);
                }
            }
        } finally {
            workDatabase.m36900g();
        }
    }

    /* renamed from: c */
    public static InterfaceC4755e m24090c(Context context) {
        try {
            InterfaceC4755e interfaceC4755e = (InterfaceC4755e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC4582k.m23126c().mo23129a(f28029a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return interfaceC4755e;
        } catch (Throwable th2) {
            AbstractC4582k.m23126c().mo23129a(f28029a, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }
}
