package p108g2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0756a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071e2.AbstractC4582k;
import p071e2.C4591t;
import p089f2.C4759i;
import p089f2.InterfaceC4752b;
import p089f2.InterfaceC4755e;
import p158j2.C5282d;
import p158j2.InterfaceC5281c;
import p223n2.C6636p;
import p237o2.C6875h;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g2/b.class
 */
/* renamed from: g2.b */
/* loaded from: combined.jar:classes1.jar:g2/b.class */
public class C4934b implements InterfaceC4755e, InterfaceC5281c, InterfaceC4752b {

    /* renamed from: j */
    public static final String f28684j = AbstractC4582k.m23128f("GreedyScheduler");

    /* renamed from: b */
    public final Context f28685b;

    /* renamed from: c */
    public final C4759i f28686c;

    /* renamed from: d */
    public final C5282d f28687d;

    /* renamed from: f */
    public C4933a f28689f;

    /* renamed from: g */
    public boolean f28690g;

    /* renamed from: i */
    public Boolean f28692i;

    /* renamed from: e */
    public final Set<C6636p> f28688e = new HashSet();

    /* renamed from: h */
    public final Object f28691h = new Object();

    public C4934b(Context context, C0756a c0756a, InterfaceC7748a interfaceC7748a, C4759i c4759i) {
        this.f28685b = context;
        this.f28686c = c4759i;
        this.f28687d = new C5282d(context, interfaceC7748a, this);
        this.f28689f = new C4933a(this, c0756a.m4859k());
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: a */
    public void mo24085a(C6636p... c6636pArr) {
        if (this.f28692i == null) {
            m24928g();
        }
        if (!this.f28692i.booleanValue()) {
            AbstractC4582k.m23126c().mo23131d(f28684j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m24929h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C6636p c6636p : c6636pArr) {
            long m30587a = c6636p.m30587a();
            long currentTimeMillis = System.currentTimeMillis();
            if (c6636p.f34574b == C4591t.a.ENQUEUED) {
                if (currentTimeMillis < m30587a) {
                    C4933a c4933a = this.f28689f;
                    if (c4933a != null) {
                        c4933a.m24926a(c6636p);
                    }
                } else if (c6636p.m30588b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && c6636p.f34582j.m23096h()) {
                        AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Ignoring WorkSpec %s, Requires device idle.", c6636p), new Throwable[0]);
                    } else if (i10 < 24 || !c6636p.f34582j.m23093e()) {
                        hashSet.add(c6636p);
                        hashSet2.add(c6636p.f34573a);
                    } else {
                        AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c6636p), new Throwable[0]);
                    }
                } else {
                    AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Starting work for %s", c6636p.f34573a), new Throwable[0]);
                    this.f28686c.m24125w(c6636p.f34573a);
                }
            }
        }
        synchronized (this.f28691h) {
            if (!hashSet.isEmpty()) {
                AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f28688e.addAll(hashSet);
                this.f28687d.m26369d(this.f28688e);
            }
        }
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: b */
    public void mo4942b(List<String> list) {
        for (String str : list) {
            AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f28686c.m24128z(str);
        }
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: c */
    public void mo24086c(String str) {
        if (this.f28692i == null) {
            m24928g();
        }
        if (!this.f28692i.booleanValue()) {
            AbstractC4582k.m23126c().mo23131d(f28684j, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m24929h();
        AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C4933a c4933a = this.f28689f;
        if (c4933a != null) {
            c4933a.m24927b(str);
        }
        this.f28686c.m24128z(str);
    }

    @Override // p089f2.InterfaceC4755e
    /* renamed from: d */
    public boolean mo24087d() {
        return false;
    }

    @Override // p089f2.InterfaceC4752b
    /* renamed from: e */
    public void mo4931e(String str, boolean z10) {
        m24930i(str);
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: f */
    public void mo4945f(List<String> list) {
        for (String str : list) {
            AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f28686c.m24125w(str);
        }
    }

    /* renamed from: g */
    public final void m24928g() {
        this.f28692i = Boolean.valueOf(C6875h.m31715b(this.f28685b, this.f28686c.m24115k()));
    }

    /* renamed from: h */
    public final void m24929h() {
        if (this.f28690g) {
            return;
        }
        this.f28686c.m24117o().m24074c(this);
        this.f28690g = true;
    }

    /* renamed from: i */
    public final void m24930i(String str) {
        synchronized (this.f28691h) {
            Iterator<C6636p> it = this.f28688e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6636p next = it.next();
                if (next.f34573a.equals(str)) {
                    AbstractC4582k.m23126c().mo23129a(f28684j, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f28688e.remove(next);
                    this.f28687d.m26369d(this.f28688e);
                    break;
                }
            }
        }
    }
}
