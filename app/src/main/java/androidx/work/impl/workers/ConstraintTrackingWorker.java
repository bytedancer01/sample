package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import lc.InterfaceFutureC5838a;
import p071e2.AbstractC4582k;
import p089f2.C4759i;
import p158j2.C5282d;
import p158j2.InterfaceC5281c;
import p223n2.C6636p;
import p263p2.C7546c;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/workers/ConstraintTrackingWorker.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/workers/ConstraintTrackingWorker.class */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC5281c {

    /* renamed from: l */
    public static final String f5292l = AbstractC4582k.m23128f("ConstraintTrkngWrkr");

    /* renamed from: g */
    public WorkerParameters f5293g;

    /* renamed from: h */
    public final Object f5294h;

    /* renamed from: i */
    public volatile boolean f5295i;

    /* renamed from: j */
    public C7546c<ListenableWorker.AbstractC0753a> f5296j;

    /* renamed from: k */
    public ListenableWorker f5297k;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/workers/ConstraintTrackingWorker$a.class
     */
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/workers/ConstraintTrackingWorker$a.class */
    public class RunnableC0771a implements Runnable {

        /* renamed from: b */
        public final ConstraintTrackingWorker f5298b;

        public RunnableC0771a(ConstraintTrackingWorker constraintTrackingWorker) {
            this.f5298b = constraintTrackingWorker;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5298b.m4986u();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/workers/ConstraintTrackingWorker$b.class
     */
    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/workers/ConstraintTrackingWorker$b.class */
    public class RunnableC0772b implements Runnable {

        /* renamed from: b */
        public final InterfaceFutureC5838a f5299b;

        /* renamed from: c */
        public final ConstraintTrackingWorker f5300c;

        public RunnableC0772b(ConstraintTrackingWorker constraintTrackingWorker, InterfaceFutureC5838a interfaceFutureC5838a) {
            this.f5300c = constraintTrackingWorker;
            this.f5299b = interfaceFutureC5838a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5300c.f5294h) {
                if (this.f5300c.f5295i) {
                    this.f5300c.m4985t();
                } else {
                    this.f5300c.f5296j.mo32293r(this.f5299b);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5293g = workerParameters;
        this.f5294h = new Object();
        this.f5295i = false;
        this.f5296j = C7546c.m32302t();
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: b */
    public void mo4942b(List<String> list) {
        AbstractC4582k.m23126c().mo23129a(f5292l, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f5294h) {
            this.f5295i = true;
        }
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: f */
    public void mo4945f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: h */
    public InterfaceC7748a mo4825h() {
        return C4759i.m24111m(m4821a()).m24120r();
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: j */
    public boolean mo4827j() {
        ListenableWorker listenableWorker = this.f5297k;
        return listenableWorker != null && listenableWorker.mo4827j();
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: m */
    public void mo4809m() {
        super.mo4809m();
        ListenableWorker listenableWorker = this.f5297k;
        if (listenableWorker == null || listenableWorker.m4828k()) {
            return;
        }
        this.f5297k.m4832q();
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: p */
    public InterfaceFutureC5838a<ListenableWorker.AbstractC0753a> mo4810p() {
        m4822c().execute(new RunnableC0771a(this));
        return this.f5296j;
    }

    /* renamed from: r */
    public WorkDatabase m4983r() {
        return C4759i.m24111m(m4821a()).m24119q();
    }

    /* renamed from: s */
    public void m4984s() {
        this.f5296j.mo32291p(ListenableWorker.AbstractC0753a.m4833a());
    }

    /* renamed from: t */
    public void m4985t() {
        this.f5296j.mo32291p(ListenableWorker.AbstractC0753a.m4834b());
    }

    /* renamed from: u */
    public void m4986u() {
        String m4876l = m4824g().m4876l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(m4876l)) {
            AbstractC4582k.m23126c().mo23130b(f5292l, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker m23159b = m4826i().m23159b(m4821a(), m4876l, this.f5293g);
            this.f5297k = m23159b;
            if (m23159b != null) {
                C6636p mo30599g = m4983r().mo4891B().mo30599g(m4823e().toString());
                if (mo30599g == null) {
                    m4984s();
                    return;
                }
                C5282d c5282d = new C5282d(m4821a(), mo4825h(), this);
                c5282d.m26369d(Collections.singletonList(mo30599g));
                if (!c5282d.m26368c(m4823e().toString())) {
                    AbstractC4582k.m23126c().mo23129a(f5292l, String.format("Constraints not met for delegate %s. Requesting retry.", m4876l), new Throwable[0]);
                    m4985t();
                    return;
                }
                AbstractC4582k.m23126c().mo23129a(f5292l, String.format("Constraints met for delegate %s", m4876l), new Throwable[0]);
                try {
                    InterfaceFutureC5838a<ListenableWorker.AbstractC0753a> mo4810p = this.f5297k.mo4810p();
                    mo4810p.mo23123a(new RunnableC0772b(this, mo4810p), m4822c());
                    return;
                } catch (Throwable th2) {
                    AbstractC4582k m23126c = AbstractC4582k.m23126c();
                    String str = f5292l;
                    m23126c.mo23129a(str, String.format("Delegated worker %s threw exception in startWork.", m4876l), th2);
                    synchronized (this.f5294h) {
                        if (this.f5295i) {
                            AbstractC4582k.m23126c().mo23129a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            m4985t();
                        } else {
                            m4984s();
                        }
                        return;
                    }
                }
            }
            AbstractC4582k.m23126c().mo23129a(f5292l, "No worker to delegate to.", new Throwable[0]);
        }
        m4984s();
    }
}
