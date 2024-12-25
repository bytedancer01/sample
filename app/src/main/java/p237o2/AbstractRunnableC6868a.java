package p237o2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p071e2.C4591t;
import p071e2.InterfaceC4585n;
import p089f2.C4753c;
import p089f2.C4756f;
import p089f2.C4759i;
import p089f2.InterfaceC4755e;
import p223n2.InterfaceC6622b;
import p223n2.InterfaceC6637q;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/a.class
 */
/* renamed from: o2.a */
/* loaded from: combined.jar:classes1.jar:o2/a.class */
public abstract class AbstractRunnableC6868a implements Runnable {

    /* renamed from: b */
    public final C4753c f35620b = new C4753c();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/a$a.class
     */
    /* renamed from: o2.a$a */
    /* loaded from: combined.jar:classes1.jar:o2/a$a.class */
    public class a extends AbstractRunnableC6868a {

        /* renamed from: c */
        public final C4759i f35621c;

        /* renamed from: d */
        public final UUID f35622d;

        public a(C4759i c4759i, UUID uuid) {
            this.f35621c = c4759i;
            this.f35622d = uuid;
        }

        @Override // p237o2.AbstractRunnableC6868a
        /* renamed from: h */
        public void mo31694h() {
            WorkDatabase m24119q = this.f35621c.m24119q();
            m24119q.m36898c();
            try {
                m31690a(this.f35621c, this.f35622d.toString());
                m24119q.m36910r();
                m24119q.m36900g();
                m31693g(this.f35621c);
            } catch (Throwable th2) {
                m24119q.m36900g();
                throw th2;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/a$b.class
     */
    /* renamed from: o2.a$b */
    /* loaded from: combined.jar:classes1.jar:o2/a$b.class */
    public class b extends AbstractRunnableC6868a {

        /* renamed from: c */
        public final C4759i f35623c;

        /* renamed from: d */
        public final String f35624d;

        public b(C4759i c4759i, String str) {
            this.f35623c = c4759i;
            this.f35624d = str;
        }

        @Override // p237o2.AbstractRunnableC6868a
        /* renamed from: h */
        public void mo31694h() {
            WorkDatabase m24119q = this.f35623c.m24119q();
            m24119q.m36898c();
            try {
                Iterator<String> it = m24119q.mo4891B().mo30600h(this.f35624d).iterator();
                while (it.hasNext()) {
                    m31690a(this.f35623c, it.next());
                }
                m24119q.m36910r();
                m24119q.m36900g();
                m31693g(this.f35623c);
            } catch (Throwable th2) {
                m24119q.m36900g();
                throw th2;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/a$c.class
     */
    /* renamed from: o2.a$c */
    /* loaded from: combined.jar:classes1.jar:o2/a$c.class */
    public class c extends AbstractRunnableC6868a {

        /* renamed from: c */
        public final C4759i f35625c;

        /* renamed from: d */
        public final String f35626d;

        /* renamed from: e */
        public final boolean f35627e;

        public c(C4759i c4759i, String str, boolean z10) {
            this.f35625c = c4759i;
            this.f35626d = str;
            this.f35627e = z10;
        }

        @Override // p237o2.AbstractRunnableC6868a
        /* renamed from: h */
        public void mo31694h() {
            WorkDatabase m24119q = this.f35625c.m24119q();
            m24119q.m36898c();
            try {
                Iterator<String> it = m24119q.mo4891B().mo30597e(this.f35626d).iterator();
                while (it.hasNext()) {
                    m31690a(this.f35625c, it.next());
                }
                m24119q.m36910r();
                m24119q.m36900g();
                if (this.f35627e) {
                    m31693g(this.f35625c);
                }
            } catch (Throwable th2) {
                m24119q.m36900g();
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC6868a m31687b(UUID uuid, C4759i c4759i) {
        return new a(c4759i, uuid);
    }

    /* renamed from: c */
    public static AbstractRunnableC6868a m31688c(String str, C4759i c4759i, boolean z10) {
        return new c(c4759i, str, z10);
    }

    /* renamed from: d */
    public static AbstractRunnableC6868a m31689d(String str, C4759i c4759i) {
        return new b(c4759i, str);
    }

    /* renamed from: a */
    public void m31690a(C4759i c4759i, String str) {
        m31692f(c4759i.m24119q(), str);
        c4759i.m24117o().m24081l(str);
        Iterator<InterfaceC4755e> it = c4759i.m24118p().iterator();
        while (it.hasNext()) {
            it.next().mo24086c(str);
        }
    }

    /* renamed from: e */
    public InterfaceC4585n m31691e() {
        return this.f35620b;
    }

    /* renamed from: f */
    public final void m31692f(WorkDatabase workDatabase, String str) {
        InterfaceC6637q mo4891B = workDatabase.mo4891B();
        InterfaceC6622b mo4893t = workDatabase.mo4893t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C4591t.a mo30598f = mo4891B.mo30598f(str2);
            if (mo30598f != C4591t.a.SUCCEEDED && mo30598f != C4591t.a.FAILED) {
                mo4891B.mo30604l(C4591t.a.CANCELLED, str2);
            }
            linkedList.addAll(mo4893t.mo30567b(str2));
        }
    }

    /* renamed from: g */
    public void m31693g(C4759i c4759i) {
        C4756f.m24089b(c4759i.m24115k(), c4759i.m24119q(), c4759i.m24118p());
    }

    /* renamed from: h */
    public abstract void mo31694h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo31694h();
            this.f35620b.m24070a(InterfaceC4585n.f27225a);
        } catch (Throwable th2) {
            this.f35620b.m24070a(new InterfaceC4585n.b.a(th2));
        }
    }
}
