package p140i2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p071e2.AbstractC4582k;
import p071e2.C4591t;
import p071e2.EnumC4586o;
import p089f2.C4759i;
import p089f2.InterfaceC4755e;
import p223n2.C6627g;
import p223n2.C6636p;
import p223n2.InterfaceC6637q;
import p237o2.C6871d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i2/k.class
 */
/* renamed from: i2.k */
/* loaded from: combined.jar:classes1.jar:i2/k.class */
public class C5164k implements InterfaceC4755e {

    /* renamed from: f */
    public static final String f29530f = AbstractC4582k.m23128f("SystemJobScheduler");

    /* renamed from: b */
    public final Context f29531b;

    /* renamed from: c */
    public final JobScheduler f29532c;

    /* renamed from: d */
    public final C4759i f29533d;

    /* renamed from: e */
    public final C5163j f29534e;

    public C5164k(Context context, C4759i c4759i) {
        this(context, c4759i, (JobScheduler) context.getSystemService("jobscheduler"), new C5163j(context));
    }

    public C5164k(Context context, C4759i c4759i, JobScheduler jobScheduler, C5163j c5163j) {
        this.f29531b = context;
        this.f29533d = c4759i;
        this.f29532c = jobScheduler;
        this.f29534e = c5163j;
    }

    /* renamed from: b */
    public static void m25804b(Context context) {
        List<JobInfo> m25807g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (m25807g = m25807g(context, jobScheduler)) == null || m25807g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = m25807g.iterator();
        while (it.hasNext()) {
            m25805e(jobScheduler, it.next().getId());
        }
    }

    /* renamed from: e */
    public static void m25805e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            AbstractC4582k.m23126c().mo23130b(f29530f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    /* renamed from: f */
    public static List<Integer> m25806f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m25807g = m25807g(context, jobScheduler);
        if (m25807g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m25807g) {
            if (str.equals(m25808h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<JobInfo> m25807g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            AbstractC4582k.m23126c().mo23130b(f29530f, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static String m25808h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException e10) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m25809i(Context context, C4759i c4759i) {
        boolean z10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m25807g = m25807g(context, jobScheduler);
        List<String> mo30578c = c4759i.m24119q().mo4895y().mo30578c();
        HashSet hashSet = new HashSet(m25807g != null ? m25807g.size() : 0);
        if (m25807g != null && !m25807g.isEmpty()) {
            for (JobInfo jobInfo : m25807g) {
                String m25808h = m25808h(jobInfo);
                if (TextUtils.isEmpty(m25808h)) {
                    m25805e(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(m25808h);
                }
            }
        }
        Iterator<String> it = mo30578c.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC4582k.m23126c().mo23129a(f29530f, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase m24119q = c4759i.m24119q();
            m24119q.m36898c();
            try {
                InterfaceC6637q mo4891B = m24119q.mo4891B();
                Iterator<String> it2 = mo30578c.iterator();
                while (it2.hasNext()) {
                    mo4891B.mo30605m(it2.next(), -1L);
                }
                m24119q.m36910r();
            } finally {
                m24119q.m36900g();
            }
        }
        return z10;
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: a */
    public void mo24085a(C6636p... c6636pArr) {
        List<Integer> m25806f;
        WorkDatabase m24119q = this.f29533d.m24119q();
        C6871d c6871d = new C6871d(m24119q);
        for (C6636p c6636p : c6636pArr) {
            m24119q.m36898c();
            try {
                C6636p mo30599g = m24119q.mo4891B().mo30599g(c6636p.f34573a);
                if (mo30599g == null) {
                    AbstractC4582k.m23126c().mo23133h(f29530f, "Skipping scheduling " + c6636p.f34573a + " because it's no longer in the DB", new Throwable[0]);
                } else if (mo30599g.f34574b != C4591t.a.ENQUEUED) {
                    AbstractC4582k.m23126c().mo23133h(f29530f, "Skipping scheduling " + c6636p.f34573a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    C6627g mo30577b = m24119q.mo4895y().mo30577b(c6636p.f34573a);
                    int m31707d = mo30577b != null ? mo30577b.f34551b : c6871d.m31707d(this.f29533d.m24115k().m4857i(), this.f29533d.m24115k().m4855g());
                    if (mo30577b == null) {
                        this.f29533d.m24119q().mo4895y().mo30576a(new C6627g(c6636p.f34573a, m31707d));
                    }
                    m25810j(c6636p, m31707d);
                    if (Build.VERSION.SDK_INT == 23 && (m25806f = m25806f(this.f29531b, this.f29532c, c6636p.f34573a)) != null) {
                        int indexOf = m25806f.indexOf(Integer.valueOf(m31707d));
                        if (indexOf >= 0) {
                            m25806f.remove(indexOf);
                        }
                        m25810j(c6636p, !m25806f.isEmpty() ? m25806f.get(0).intValue() : c6871d.m31707d(this.f29533d.m24115k().m4857i(), this.f29533d.m24115k().m4855g()));
                    }
                }
                m24119q.m36910r();
                m24119q.m36900g();
            } catch (Throwable th2) {
                m24119q.m36900g();
                throw th2;
            }
        }
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: c */
    public void mo24086c(String str) {
        List<Integer> m25806f = m25806f(this.f29531b, this.f29532c, str);
        if (m25806f == null || m25806f.isEmpty()) {
            return;
        }
        Iterator<Integer> it = m25806f.iterator();
        while (it.hasNext()) {
            m25805e(this.f29532c, it.next().intValue());
        }
        this.f29533d.m24119q().mo4895y().mo30579d(str);
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: d */
    public boolean mo24087d() {
        return true;
    }

    /* renamed from: j */
    public void m25810j(C6636p c6636p, int i10) {
        JobInfo m25803a = this.f29534e.m25803a(c6636p, i10);
        AbstractC4582k m23126c = AbstractC4582k.m23126c();
        String str = f29530f;
        m23126c.mo23129a(str, String.format("Scheduling work ID %s Job ID %s", c6636p.f34573a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f29532c.schedule(m25803a) == 0) {
                AbstractC4582k.m23126c().mo23133h(str, String.format("Unable to schedule work ID %s", c6636p.f34573a), new Throwable[0]);
                if (c6636p.f34589q && c6636p.f34590r == EnumC4586o.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c6636p.f34589q = false;
                    AbstractC4582k.m23126c().mo23129a(str, String.format("Scheduling a non-expedited job (work ID %s)", c6636p.f34573a), new Throwable[0]);
                    m25810j(c6636p, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> m25807g = m25807g(this.f29531b, this.f29532c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(m25807g != null ? m25807g.size() : 0), Integer.valueOf(this.f29533d.m24119q().mo4891B().mo30595c().size()), Integer.valueOf(this.f29533d.m24115k().m4856h()));
            AbstractC4582k.m23126c().mo23130b(f29530f, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            AbstractC4582k.m23126c().mo23130b(f29530f, String.format("Unable to schedule %s", c6636p), th2);
        }
    }
}
