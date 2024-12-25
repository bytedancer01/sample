package p237o2;

import android.text.TextUtils;
import androidx.work.C0757b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Iterator;
import java.util.List;
import p071e2.AbstractC4582k;
import p071e2.C4573b;
import p071e2.InterfaceC4585n;
import p089f2.C4753c;
import p089f2.C4756f;
import p089f2.C4757g;
import p089f2.C4759i;
import p089f2.InterfaceC4755e;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/b.class
 */
/* renamed from: o2.b */
/* loaded from: combined.jar:classes1.jar:o2/b.class */
public class RunnableC6869b implements Runnable {

    /* renamed from: d */
    public static final String f35628d = AbstractC4582k.m23128f("EnqueueRunnable");

    /* renamed from: b */
    public final C4757g f35629b;

    /* renamed from: c */
    public final C4753c f35630c = new C4753c();

    public RunnableC6869b(C4757g c4757g) {
        this.f35629b = c4757g;
    }

    /* renamed from: b */
    public static boolean m31695b(C4757g c4757g) {
        boolean m31696c = m31696c(c4757g.m24099g(), c4757g.m24098f(), (String[]) C4757g.m24092l(c4757g).toArray(new String[0]), c4757g.m24096d(), c4757g.m24094b());
        c4757g.m24102k();
        return m31696c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030e  */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.util.List] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m31696c(p089f2.C4759i r8, java.util.List<? extends p071e2.AbstractC4593v> r9, java.lang.String[] r10, java.lang.String r11, p071e2.EnumC4575d r12) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p237o2.RunnableC6869b.m31696c(f2.i, java.util.List, java.lang.String[], java.lang.String, e2.d):boolean");
    }

    /* renamed from: e */
    public static boolean m31697e(C4757g c4757g) {
        List<C4757g> m24097e = c4757g.m24097e();
        boolean z10 = false;
        if (m24097e != null) {
            z10 = false;
            for (C4757g c4757g2 : m24097e) {
                if (c4757g2.m24101j()) {
                    AbstractC4582k.m23126c().mo23133h(f35628d, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", c4757g2.m24095c())), new Throwable[0]);
                } else {
                    z10 |= m31697e(c4757g2);
                }
            }
        }
        return m31695b(c4757g) | z10;
    }

    /* renamed from: g */
    public static void m31698g(C6636p c6636p) {
        C4573b c4573b = c6636p.f34582j;
        String str = c6636p.f34575c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (c4573b.m23094f() || c4573b.m23097i()) {
            C0757b.a aVar = new C0757b.a();
            aVar.m4880c(c6636p.f34577e).m4885h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            c6636p.f34575c = ConstraintTrackingWorker.class.getName();
            c6636p.f34577e = aVar.m4878a();
        }
    }

    /* renamed from: h */
    public static boolean m31699h(C4759i c4759i, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<InterfaceC4755e> it = c4759i.m24118p().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException e10) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m31700a() {
        WorkDatabase m24119q = this.f35629b.m24099g().m24119q();
        m24119q.m36898c();
        try {
            boolean m31697e = m31697e(this.f35629b);
            m24119q.m36910r();
            return m31697e;
        } finally {
            m24119q.m36900g();
        }
    }

    /* renamed from: d */
    public InterfaceC4585n m31701d() {
        return this.f35630c;
    }

    /* renamed from: f */
    public void m31702f() {
        C4759i m24099g = this.f35629b.m24099g();
        C4756f.m24089b(m24099g.m24115k(), m24099g.m24119q(), m24099g.m24118p());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f35629b.m24100h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f35629b));
            }
            if (m31700a()) {
                C6872e.m31709a(this.f35629b.m24099g().m24114j(), RescheduleReceiver.class, true);
                m31702f();
            }
            this.f35630c.m24070a(InterfaceC4585n.f27225a);
        } catch (Throwable th2) {
            this.f35630c.m24070a(new InterfaceC4585n.b.a(th2));
        }
    }
}
