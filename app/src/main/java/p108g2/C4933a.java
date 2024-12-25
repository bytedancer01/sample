package p108g2;

import java.util.HashMap;
import java.util.Map;
import p071e2.AbstractC4582k;
import p071e2.InterfaceC4589r;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g2/a.class
 */
/* renamed from: g2.a */
/* loaded from: combined.jar:classes1.jar:g2/a.class */
public class C4933a {

    /* renamed from: d */
    public static final String f28678d = AbstractC4582k.m23128f("DelayedWorkTracker");

    /* renamed from: a */
    public final C4934b f28679a;

    /* renamed from: b */
    public final InterfaceC4589r f28680b;

    /* renamed from: c */
    public final Map<String, Runnable> f28681c = new HashMap();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g2/a$a.class
     */
    /* renamed from: g2.a$a */
    /* loaded from: combined.jar:classes1.jar:g2/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C6636p f28682b;

        /* renamed from: c */
        public final C4933a f28683c;

        public a(C4933a c4933a, C6636p c6636p) {
            this.f28683c = c4933a;
            this.f28682b = c6636p;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4582k.m23126c().mo23129a(C4933a.f28678d, String.format("Scheduling work %s", this.f28682b.f34573a), new Throwable[0]);
            this.f28683c.f28679a.mo24085a(this.f28682b);
        }
    }

    public C4933a(C4934b c4934b, InterfaceC4589r interfaceC4589r) {
        this.f28679a = c4934b;
        this.f28680b = interfaceC4589r;
    }

    /* renamed from: a */
    public void m24926a(C6636p c6636p) {
        Runnable remove = this.f28681c.remove(c6636p.f34573a);
        if (remove != null) {
            this.f28680b.mo23140a(remove);
        }
        a aVar = new a(this, c6636p);
        this.f28681c.put(c6636p.f34573a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f28680b.mo23141b(c6636p.m30587a() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void m24927b(String str) {
        Runnable remove = this.f28681c.remove(str);
        if (remove != null) {
            this.f28680b.mo23140a(remove);
        }
    }
}
