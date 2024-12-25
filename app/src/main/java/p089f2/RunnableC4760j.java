package p089f2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0756a;
import androidx.work.C0757b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import lc.InterfaceFutureC5838a;
import p071e2.AbstractC4579h;
import p071e2.AbstractC4582k;
import p071e2.C4591t;
import p209m2.InterfaceC5918a;
import p223n2.C6636p;
import p223n2.InterfaceC6622b;
import p223n2.InterfaceC6637q;
import p223n2.InterfaceC6640t;
import p237o2.C6872e;
import p237o2.C6881n;
import p237o2.C6882o;
import p237o2.RunnableC6880m;
import p263p2.C7546c;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f2/j.class
 */
/* renamed from: f2.j */
/* loaded from: combined.jar:classes1.jar:f2/j.class */
public class RunnableC4760j implements Runnable {

    /* renamed from: u */
    public static final String f28055u = AbstractC4582k.m23128f("WorkerWrapper");

    /* renamed from: b */
    public Context f28056b;

    /* renamed from: c */
    public String f28057c;

    /* renamed from: d */
    public List<InterfaceC4755e> f28058d;

    /* renamed from: e */
    public WorkerParameters.C0755a f28059e;

    /* renamed from: f */
    public C6636p f28060f;

    /* renamed from: g */
    public ListenableWorker f28061g;

    /* renamed from: h */
    public InterfaceC7748a f28062h;

    /* renamed from: j */
    public C0756a f28064j;

    /* renamed from: k */
    public InterfaceC5918a f28065k;

    /* renamed from: l */
    public WorkDatabase f28066l;

    /* renamed from: m */
    public InterfaceC6637q f28067m;

    /* renamed from: n */
    public InterfaceC6622b f28068n;

    /* renamed from: o */
    public InterfaceC6640t f28069o;

    /* renamed from: p */
    public List<String> f28070p;

    /* renamed from: q */
    public String f28071q;

    /* renamed from: t */
    public volatile boolean f28074t;

    /* renamed from: i */
    public ListenableWorker.AbstractC0753a f28063i = ListenableWorker.AbstractC0753a.m4833a();

    /* renamed from: r */
    public C7546c<Boolean> f28072r = C7546c.m32302t();

    /* renamed from: s */
    public InterfaceFutureC5838a<ListenableWorker.AbstractC0753a> f28073s = null;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f2/j$a.class
     */
    /* renamed from: f2.j$a */
    /* loaded from: combined.jar:classes1.jar:f2/j$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final InterfaceFutureC5838a f28075b;

        /* renamed from: c */
        public final C7546c f28076c;

        /* renamed from: d */
        public final RunnableC4760j f28077d;

        public a(RunnableC4760j runnableC4760j, InterfaceFutureC5838a interfaceFutureC5838a, C7546c c7546c) {
            this.f28077d = runnableC4760j;
            this.f28075b = interfaceFutureC5838a;
            this.f28076c = c7546c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28075b.get();
                AbstractC4582k.m23126c().mo23129a(RunnableC4760j.f28055u, String.format("Starting work for %s", this.f28077d.f28060f.f34575c), new Throwable[0]);
                RunnableC4760j runnableC4760j = this.f28077d;
                runnableC4760j.f28073s = runnableC4760j.f28061g.mo4810p();
                this.f28076c.mo32293r(this.f28077d.f28073s);
            } catch (Throwable th2) {
                this.f28076c.mo32292q(th2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f2/j$b.class
     */
    /* renamed from: f2.j$b */
    /* loaded from: combined.jar:classes1.jar:f2/j$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C7546c f28078b;

        /* renamed from: c */
        public final String f28079c;

        /* renamed from: d */
        public final RunnableC4760j f28080d;

        public b(RunnableC4760j runnableC4760j, C7546c c7546c, String str) {
            this.f28080d = runnableC4760j;
            this.f28078b = c7546c;
            this.f28079c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.AbstractC0753a abstractC0753a = (ListenableWorker.AbstractC0753a) this.f28078b.get();
                    if (abstractC0753a == null) {
                        AbstractC4582k.m23126c().mo23130b(RunnableC4760j.f28055u, String.format("%s returned a null result. Treating it as a failure.", this.f28080d.f28060f.f34575c), new Throwable[0]);
                    } else {
                        AbstractC4582k.m23126c().mo23129a(RunnableC4760j.f28055u, String.format("%s returned a %s result.", this.f28080d.f28060f.f34575c, abstractC0753a), new Throwable[0]);
                        this.f28080d.f28063i = abstractC0753a;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    AbstractC4582k.m23126c().mo23130b(RunnableC4760j.f28055u, String.format("%s failed because it threw an exception/error", this.f28079c), e);
                } catch (CancellationException e11) {
                    AbstractC4582k.m23126c().mo23131d(RunnableC4760j.f28055u, String.format("%s was cancelled", this.f28079c), e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    AbstractC4582k.m23126c().mo23130b(RunnableC4760j.f28055u, String.format("%s failed because it threw an exception/error", this.f28079c), e);
                }
            } finally {
                this.f28080d.m24134f();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f2/j$c.class
     */
    /* renamed from: f2.j$c */
    /* loaded from: combined.jar:classes1.jar:f2/j$c.class */
    public static class c {

        /* renamed from: a */
        public Context f28081a;

        /* renamed from: b */
        public ListenableWorker f28082b;

        /* renamed from: c */
        public InterfaceC5918a f28083c;

        /* renamed from: d */
        public InterfaceC7748a f28084d;

        /* renamed from: e */
        public C0756a f28085e;

        /* renamed from: f */
        public WorkDatabase f28086f;

        /* renamed from: g */
        public String f28087g;

        /* renamed from: h */
        public List<InterfaceC4755e> f28088h;

        /* renamed from: i */
        public WorkerParameters.C0755a f28089i = new WorkerParameters.C0755a();

        public c(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a, InterfaceC5918a interfaceC5918a, WorkDatabase workDatabase, String str) {
            this.f28081a = context.getApplicationContext();
            this.f28084d = interfaceC7748a;
            this.f28083c = interfaceC5918a;
            this.f28085e = c0756a;
            this.f28086f = workDatabase;
            this.f28087g = str;
        }

        /* renamed from: a */
        public RunnableC4760j m24144a() {
            return new RunnableC4760j(this);
        }

        /* renamed from: b */
        public c m24145b(WorkerParameters.C0755a c0755a) {
            if (c0755a != null) {
                this.f28089i = c0755a;
            }
            return this;
        }

        /* renamed from: c */
        public c m24146c(List<InterfaceC4755e> list) {
            this.f28088h = list;
            return this;
        }
    }

    public RunnableC4760j(c cVar) {
        this.f28056b = cVar.f28081a;
        this.f28062h = cVar.f28084d;
        this.f28065k = cVar.f28083c;
        this.f28057c = cVar.f28087g;
        this.f28058d = cVar.f28088h;
        this.f28059e = cVar.f28089i;
        this.f28061g = cVar.f28082b;
        this.f28064j = cVar.f28085e;
        WorkDatabase workDatabase = cVar.f28086f;
        this.f28066l = workDatabase;
        this.f28067m = workDatabase.mo4891B();
        this.f28068n = this.f28066l.mo4893t();
        this.f28069o = this.f28066l.mo4892C();
    }

    /* renamed from: a */
    public final String m24129a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f28057c);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    /* renamed from: b */
    public InterfaceFutureC5838a<Boolean> m24130b() {
        return this.f28072r;
    }

    /* renamed from: c */
    public final void m24131c(ListenableWorker.AbstractC0753a abstractC0753a) {
        if (abstractC0753a instanceof ListenableWorker.AbstractC0753a.c) {
            AbstractC4582k.m23126c().mo23131d(f28055u, String.format("Worker result SUCCESS for %s", this.f28071q), new Throwable[0]);
            if (!this.f28060f.m30590d()) {
                m24141m();
                return;
            }
        } else if (abstractC0753a instanceof ListenableWorker.AbstractC0753a.b) {
            AbstractC4582k.m23126c().mo23131d(f28055u, String.format("Worker result RETRY for %s", this.f28071q), new Throwable[0]);
            m24135g();
            return;
        } else {
            AbstractC4582k.m23126c().mo23131d(f28055u, String.format("Worker result FAILURE for %s", this.f28071q), new Throwable[0]);
            if (!this.f28060f.m30590d()) {
                m24140l();
                return;
            }
        }
        m24136h();
    }

    /* renamed from: d */
    public void m24132d() {
        boolean z10;
        this.f28074t = true;
        m24142n();
        InterfaceFutureC5838a<ListenableWorker.AbstractC0753a> interfaceFutureC5838a = this.f28073s;
        if (interfaceFutureC5838a != null) {
            z10 = interfaceFutureC5838a.isDone();
            this.f28073s.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.f28061g;
        if (listenableWorker == null || z10) {
            AbstractC4582k.m23126c().mo23129a(f28055u, String.format("WorkSpec %s is already done. Not interrupting.", this.f28060f), new Throwable[0]);
        } else {
            listenableWorker.m4832q();
        }
    }

    /* renamed from: e */
    public final void m24133e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f28067m.mo30598f(str2) != C4591t.a.CANCELLED) {
                this.f28067m.mo30604l(C4591t.a.FAILED, str2);
            }
            linkedList.addAll(this.f28068n.mo30567b(str2));
        }
    }

    /* renamed from: f */
    public void m24134f() {
        if (!m24142n()) {
            this.f28066l.m36898c();
            try {
                C4591t.a mo30598f = this.f28067m.mo30598f(this.f28057c);
                this.f28066l.mo4890A().mo30584a(this.f28057c);
                if (mo30598f == null) {
                    m24137i(false);
                } else if (mo30598f == C4591t.a.RUNNING) {
                    m24131c(this.f28063i);
                } else if (!mo30598f.isFinished()) {
                    m24135g();
                }
                this.f28066l.m36910r();
            } finally {
                this.f28066l.m36900g();
            }
        }
        List<InterfaceC4755e> list = this.f28058d;
        if (list != null) {
            Iterator<InterfaceC4755e> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo24086c(this.f28057c);
            }
            C4756f.m24089b(this.f28064j, this.f28066l, this.f28058d);
        }
    }

    /* renamed from: g */
    public final void m24135g() {
        this.f28066l.m36898c();
        try {
            this.f28067m.mo30604l(C4591t.a.ENQUEUED, this.f28057c);
            this.f28067m.mo30613u(this.f28057c, System.currentTimeMillis());
            this.f28067m.mo30605m(this.f28057c, -1L);
            this.f28066l.m36910r();
        } finally {
            this.f28066l.m36900g();
            m24137i(true);
        }
    }

    /* renamed from: h */
    public final void m24136h() {
        this.f28066l.m36898c();
        try {
            this.f28067m.mo30613u(this.f28057c, System.currentTimeMillis());
            this.f28067m.mo30604l(C4591t.a.ENQUEUED, this.f28057c);
            this.f28067m.mo30611s(this.f28057c);
            this.f28067m.mo30605m(this.f28057c, -1L);
            this.f28066l.m36910r();
        } finally {
            this.f28066l.m36900g();
            m24137i(false);
        }
    }

    /* renamed from: i */
    public final void m24137i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f28066l.m36898c();
        try {
            if (!this.f28066l.mo4891B().mo30610r()) {
                C6872e.m31709a(this.f28056b, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f28067m.mo30604l(C4591t.a.ENQUEUED, this.f28057c);
                this.f28067m.mo30605m(this.f28057c, -1L);
            }
            if (this.f28060f != null && (listenableWorker = this.f28061g) != null && listenableWorker.mo4827j()) {
                this.f28065k.mo24072a(this.f28057c);
            }
            this.f28066l.m36910r();
            this.f28066l.m36900g();
            this.f28072r.mo32291p(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f28066l.m36900g();
            throw th2;
        }
    }

    /* renamed from: j */
    public final void m24138j() {
        C4591t.a mo30598f = this.f28067m.mo30598f(this.f28057c);
        if (mo30598f == C4591t.a.RUNNING) {
            AbstractC4582k.m23126c().mo23129a(f28055u, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f28057c), new Throwable[0]);
            m24137i(true);
        } else {
            AbstractC4582k.m23126c().mo23129a(f28055u, String.format("Status for %s is %s; not doing any work", this.f28057c, mo30598f), new Throwable[0]);
            m24137i(false);
        }
    }

    /* renamed from: k */
    public final void m24139k() {
        C0757b mo4802b;
        if (m24142n()) {
            return;
        }
        this.f28066l.m36898c();
        try {
            C6636p mo30599g = this.f28067m.mo30599g(this.f28057c);
            this.f28060f = mo30599g;
            if (mo30599g == null) {
                AbstractC4582k.m23126c().mo23130b(f28055u, String.format("Didn't find WorkSpec for id %s", this.f28057c), new Throwable[0]);
                m24137i(false);
                this.f28066l.m36910r();
                return;
            }
            if (mo30599g.f34574b != C4591t.a.ENQUEUED) {
                m24138j();
                this.f28066l.m36910r();
                AbstractC4582k.m23126c().mo23129a(f28055u, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f28060f.f34575c), new Throwable[0]);
                return;
            }
            if (mo30599g.m30590d() || this.f28060f.m30589c()) {
                long currentTimeMillis = System.currentTimeMillis();
                C6636p c6636p = this.f28060f;
                if (!(c6636p.f34586n == 0) && currentTimeMillis < c6636p.m30587a()) {
                    AbstractC4582k.m23126c().mo23129a(f28055u, String.format("Delaying execution for %s because it is being executed before schedule.", this.f28060f.f34575c), new Throwable[0]);
                    m24137i(true);
                    this.f28066l.m36910r();
                    return;
                }
            }
            this.f28066l.m36910r();
            this.f28066l.m36900g();
            if (this.f28060f.m30590d()) {
                mo4802b = this.f28060f.f34577e;
            } else {
                AbstractC4579h m23121b = this.f28064j.m4854f().m23121b(this.f28060f.f34576d);
                if (m23121b == null) {
                    AbstractC4582k.m23126c().mo23130b(f28055u, String.format("Could not create Input Merger %s", this.f28060f.f34576d), new Throwable[0]);
                    m24140l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f28060f.f34577e);
                    arrayList.addAll(this.f28067m.mo30601i(this.f28057c));
                    mo4802b = m23121b.mo4802b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f28057c), mo4802b, this.f28070p, this.f28059e, this.f28060f.f34583k, this.f28064j.m4853e(), this.f28062h, this.f28064j.m4861m(), new C6882o(this.f28066l, this.f28062h), new C6881n(this.f28066l, this.f28065k, this.f28062h));
            if (this.f28061g == null) {
                this.f28061g = this.f28064j.m4861m().m23159b(this.f28056b, this.f28060f.f34575c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f28061g;
            if (listenableWorker == null) {
                AbstractC4582k.m23126c().mo23130b(f28055u, String.format("Could not create Worker %s", this.f28060f.f34575c), new Throwable[0]);
                m24140l();
                return;
            }
            if (listenableWorker.m4829l()) {
                AbstractC4582k.m23126c().mo23130b(f28055u, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f28060f.f34575c), new Throwable[0]);
                m24140l();
                return;
            }
            this.f28061g.m4831o();
            if (!m24143o()) {
                m24138j();
                return;
            }
            if (m24142n()) {
                return;
            }
            C7546c m32302t = C7546c.m32302t();
            RunnableC6880m runnableC6880m = new RunnableC6880m(this.f28056b, this.f28060f, this.f28061g, workerParameters.m4844b(), this.f28062h);
            this.f28062h.mo33901a().execute(runnableC6880m);
            InterfaceFutureC5838a<Void> m31720a = runnableC6880m.m31720a();
            m31720a.mo23123a(new a(this, m31720a, m32302t), this.f28062h.mo33901a());
            m32302t.mo23123a(new b(this, m32302t, this.f28071q), this.f28062h.mo33903c());
        } finally {
            this.f28066l.m36900g();
        }
    }

    /* renamed from: l */
    public void m24140l() {
        this.f28066l.m36898c();
        try {
            m24133e(this.f28057c);
            this.f28067m.mo30608p(this.f28057c, ((ListenableWorker.AbstractC0753a.a) this.f28063i).m4837e());
            this.f28066l.m36910r();
        } finally {
            this.f28066l.m36900g();
            m24137i(false);
        }
    }

    /* renamed from: m */
    public final void m24141m() {
        this.f28066l.m36898c();
        try {
            this.f28067m.mo30604l(C4591t.a.SUCCEEDED, this.f28057c);
            this.f28067m.mo30608p(this.f28057c, ((ListenableWorker.AbstractC0753a.c) this.f28063i).m4838e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f28068n.mo30567b(this.f28057c)) {
                if (this.f28067m.mo30598f(str) == C4591t.a.BLOCKED && this.f28068n.mo30568c(str)) {
                    AbstractC4582k.m23126c().mo23131d(f28055u, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f28067m.mo30604l(C4591t.a.ENQUEUED, str);
                    this.f28067m.mo30613u(str, currentTimeMillis);
                }
            }
            this.f28066l.m36910r();
        } finally {
            this.f28066l.m36900g();
            m24137i(false);
        }
    }

    /* renamed from: n */
    public final boolean m24142n() {
        if (!this.f28074t) {
            return false;
        }
        AbstractC4582k.m23126c().mo23129a(f28055u, String.format("Work interrupted for %s", this.f28071q), new Throwable[0]);
        if (this.f28067m.mo30598f(this.f28057c) == null) {
            m24137i(false);
            return true;
        }
        m24137i(!r0.isFinished());
        return true;
    }

    /* renamed from: o */
    public final boolean m24143o() {
        this.f28066l.m36898c();
        try {
            boolean z10 = true;
            if (this.f28067m.mo30598f(this.f28057c) == C4591t.a.ENQUEUED) {
                this.f28067m.mo30604l(C4591t.a.RUNNING, this.f28057c);
                this.f28067m.mo30612t(this.f28057c);
            } else {
                z10 = false;
            }
            this.f28066l.m36910r();
            this.f28066l.m36900g();
            return z10;
        } catch (Throwable th2) {
            this.f28066l.m36900g();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> mo30616b = this.f28069o.mo30616b(this.f28057c);
        this.f28070p = mo30616b;
        this.f28071q = m24129a(mo30616b);
        m24139k();
    }
}
