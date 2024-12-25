package p237o2;

import androidx.work.impl.WorkDatabase;
import p071e2.AbstractC4582k;
import p071e2.C4591t;
import p089f2.C4754d;
import p089f2.C4759i;
import p223n2.InterfaceC6637q;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/k.class
 */
/* renamed from: o2.k */
/* loaded from: combined.jar:classes1.jar:o2/k.class */
public class RunnableC6878k implements Runnable {

    /* renamed from: e */
    public static final String f35644e = AbstractC4582k.m23128f("StopWorkRunnable");

    /* renamed from: b */
    public final C4759i f35645b;

    /* renamed from: c */
    public final String f35646c;

    /* renamed from: d */
    public final boolean f35647d;

    public RunnableC6878k(C4759i c4759i, String str, boolean z10) {
        this.f35645b = c4759i;
        this.f35646c = str;
        this.f35647d = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m24084o;
        WorkDatabase m24119q = this.f35645b.m24119q();
        C4754d m24117o = this.f35645b.m24117o();
        InterfaceC6637q mo4891B = m24119q.mo4891B();
        m24119q.m36898c();
        try {
            boolean m24077h = m24117o.m24077h(this.f35646c);
            if (this.f35647d) {
                m24084o = this.f35645b.m24117o().m24083n(this.f35646c);
            } else {
                if (!m24077h && mo4891B.mo30598f(this.f35646c) == C4591t.a.RUNNING) {
                    mo4891B.mo30604l(C4591t.a.ENQUEUED, this.f35646c);
                }
                m24084o = this.f35645b.m24117o().m24084o(this.f35646c);
            }
            AbstractC4582k.m23126c().mo23129a(f35644e, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f35646c, Boolean.valueOf(m24084o)), new Throwable[0]);
            m24119q.m36910r();
        } finally {
            m24119q.m36900g();
        }
    }
}
