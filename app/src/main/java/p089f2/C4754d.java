package p089f2;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C0756a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0770a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import lc.InterfaceFutureC5838a;
import p050d0.C4290b;
import p071e2.AbstractC4582k;
import p071e2.C4576e;
import p089f2.RunnableC4760j;
import p209m2.InterfaceC5918a;
import p237o2.C6879l;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f2/d.class
 */
/* renamed from: f2.d */
/* loaded from: combined.jar:classes1.jar:f2/d.class */
public class C4754d implements InterfaceC4752b, InterfaceC5918a {

    /* renamed from: m */
    public static final String f28014m = AbstractC4582k.m23128f("Processor");

    /* renamed from: c */
    public Context f28016c;

    /* renamed from: d */
    public C0756a f28017d;

    /* renamed from: e */
    public InterfaceC7748a f28018e;

    /* renamed from: f */
    public WorkDatabase f28019f;

    /* renamed from: i */
    public List<InterfaceC4755e> f28022i;

    /* renamed from: h */
    public Map<String, RunnableC4760j> f28021h = new HashMap();

    /* renamed from: g */
    public Map<String, RunnableC4760j> f28020g = new HashMap();

    /* renamed from: j */
    public Set<String> f28023j = new HashSet();

    /* renamed from: k */
    public final List<InterfaceC4752b> f28024k = new ArrayList();

    /* renamed from: b */
    public PowerManager.WakeLock f28015b = null;

    /* renamed from: l */
    public final Object f28025l = new Object();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f2/d$a.class
     */
    /* renamed from: f2.d$a */
    /* loaded from: combined.jar:classes1.jar:f2/d$a.class */
    public static class a implements Runnable {

        /* renamed from: b */
        public InterfaceC4752b f28026b;

        /* renamed from: c */
        public String f28027c;

        /* renamed from: d */
        public InterfaceFutureC5838a<Boolean> f28028d;

        public a(InterfaceC4752b interfaceC4752b, String str, InterfaceFutureC5838a<Boolean> interfaceFutureC5838a) {
            this.f28026b = interfaceC4752b;
            this.f28027c = str;
            this.f28028d = interfaceFutureC5838a;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f28028d.get().booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                z10 = true;
            }
            this.f28026b.mo4931e(this.f28027c, z10);
        }
    }

    public C4754d(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a, WorkDatabase workDatabase, List<InterfaceC4755e> list) {
        this.f28016c = context;
        this.f28017d = c0756a;
        this.f28018e = interfaceC7748a;
        this.f28019f = workDatabase;
        this.f28022i = list;
    }

    /* renamed from: d */
    public static boolean m24071d(String str, RunnableC4760j runnableC4760j) {
        if (runnableC4760j == null) {
            AbstractC4582k.m23126c().mo23129a(f28014m, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        runnableC4760j.m24132d();
        AbstractC4582k.m23126c().mo23129a(f28014m, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // p209m2.InterfaceC5918a
    /* renamed from: a */
    public void mo24072a(String str) {
        synchronized (this.f28025l) {
            this.f28020g.remove(str);
            m24082m();
        }
    }

    @Override // p209m2.InterfaceC5918a
    /* renamed from: b */
    public void mo24073b(String str, C4576e c4576e) {
        synchronized (this.f28025l) {
            AbstractC4582k.m23126c().mo23131d(f28014m, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            RunnableC4760j remove = this.f28021h.remove(str);
            if (remove != null) {
                if (this.f28015b == null) {
                    PowerManager.WakeLock m31719b = C6879l.m31719b(this.f28016c, "ProcessorForegroundLck");
                    this.f28015b = m31719b;
                    m31719b.acquire();
                }
                this.f28020g.put(str, remove);
                C4290b.m21733l(this.f28016c, C0770a.m4965c(this.f28016c, str, c4576e));
            }
        }
    }

    /* renamed from: c */
    public void m24074c(InterfaceC4752b interfaceC4752b) {
        synchronized (this.f28025l) {
            this.f28024k.add(interfaceC4752b);
        }
    }

    @Override // p089f2.InterfaceC4752b
    /* renamed from: e */
    public void mo4931e(String str, boolean z10) {
        synchronized (this.f28025l) {
            this.f28021h.remove(str);
            AbstractC4582k.m23126c().mo23129a(f28014m, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator<InterfaceC4752b> it = this.f28024k.iterator();
            while (it.hasNext()) {
                it.next().mo4931e(str, z10);
            }
        }
    }

    /* renamed from: f */
    public boolean m24075f(String str) {
        boolean contains;
        synchronized (this.f28025l) {
            contains = this.f28023j.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean m24076g(String str) {
        boolean z10;
        synchronized (this.f28025l) {
            if (!this.f28021h.containsKey(str) && !this.f28020g.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    /* renamed from: h */
    public boolean m24077h(String str) {
        boolean containsKey;
        synchronized (this.f28025l) {
            containsKey = this.f28020g.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void m24078i(InterfaceC4752b interfaceC4752b) {
        synchronized (this.f28025l) {
            this.f28024k.remove(interfaceC4752b);
        }
    }

    /* renamed from: j */
    public boolean m24079j(String str) {
        return m24080k(str, null);
    }

    /* renamed from: k */
    public boolean m24080k(String str, WorkerParameters.C0755a c0755a) {
        synchronized (this.f28025l) {
            if (m24076g(str)) {
                AbstractC4582k.m23126c().mo23129a(f28014m, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            RunnableC4760j m24144a = new RunnableC4760j.c(this.f28016c, this.f28017d, this.f28018e, this, this.f28019f, str).m24146c(this.f28022i).m24145b(c0755a).m24144a();
            InterfaceFutureC5838a<Boolean> m24130b = m24144a.m24130b();
            m24130b.mo23123a(new a(this, str, m24130b), this.f28018e.mo33901a());
            this.f28021h.put(str, m24144a);
            this.f28018e.mo33903c().execute(m24144a);
            AbstractC4582k.m23126c().mo23129a(f28014m, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean m24081l(String str) {
        boolean m24071d;
        synchronized (this.f28025l) {
            boolean z10 = true;
            AbstractC4582k.m23126c().mo23129a(f28014m, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f28023j.add(str);
            RunnableC4760j remove = this.f28020g.remove(str);
            if (remove == null) {
                z10 = false;
            }
            RunnableC4760j runnableC4760j = remove;
            if (remove == null) {
                runnableC4760j = this.f28021h.remove(str);
            }
            m24071d = m24071d(str, runnableC4760j);
            if (z10) {
                m24082m();
            }
        }
        return m24071d;
    }

    /* renamed from: m */
    public final void m24082m() {
        synchronized (this.f28025l) {
            if (!(!this.f28020g.isEmpty())) {
                try {
                    this.f28016c.startService(C0770a.m4966d(this.f28016c));
                } catch (Throwable th2) {
                    AbstractC4582k.m23126c().mo23130b(f28014m, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f28015b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f28015b = null;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean m24083n(String str) {
        boolean m24071d;
        synchronized (this.f28025l) {
            AbstractC4582k.m23126c().mo23129a(f28014m, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            m24071d = m24071d(str, this.f28020g.remove(str));
        }
        return m24071d;
    }

    /* renamed from: o */
    public boolean m24084o(String str) {
        boolean m24071d;
        synchronized (this.f28025l) {
            AbstractC4582k.m23126c().mo23129a(f28014m, String.format("Processor stopping background work %s", str), new Throwable[0]);
            m24071d = m24071d(str, this.f28021h.remove(str));
        }
        return m24071d;
    }
}
