package p181k6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p036c6.AbstractC0998i;
import p036c6.AbstractC1004o;
import p036c6.C0997h;
import p056d6.AbstractC4310f;
import p056d6.AbstractC4311g;
import p056d6.InterfaceC4309e;
import p056d6.InterfaceC4317m;
import p112g6.C4956a;
import p112g6.C4958c;
import p124h6.C5036a;
import p197l6.AbstractC5703k;
import p197l6.InterfaceC5687c;
import p197l6.InterfaceC5689d;
import p213m6.C5930a;
import p213m6.InterfaceC5931b;
import p227n6.InterfaceC6654a;
import p437z5.C10054b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/r.class
 */
/* renamed from: k6.r */
/* loaded from: combined.jar:classes1.jar:k6/r.class */
public class C5503r {

    /* renamed from: a */
    public final Context f31363a;

    /* renamed from: b */
    public final InterfaceC4309e f31364b;

    /* renamed from: c */
    public final InterfaceC5689d f31365c;

    /* renamed from: d */
    public final InterfaceC5509x f31366d;

    /* renamed from: e */
    public final Executor f31367e;

    /* renamed from: f */
    public final InterfaceC5931b f31368f;

    /* renamed from: g */
    public final InterfaceC6654a f31369g;

    /* renamed from: h */
    public final InterfaceC6654a f31370h;

    /* renamed from: i */
    public final InterfaceC5687c f31371i;

    public C5503r(Context context, InterfaceC4309e interfaceC4309e, InterfaceC5689d interfaceC5689d, InterfaceC5509x interfaceC5509x, Executor executor, InterfaceC5931b interfaceC5931b, InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, InterfaceC5687c interfaceC5687c) {
        this.f31363a = context;
        this.f31364b = interfaceC4309e;
        this.f31365c = interfaceC5689d;
        this.f31366d = interfaceC5509x;
        this.f31367e = executor;
        this.f31368f = interfaceC5931b;
        this.f31369g = interfaceC6654a;
        this.f31370h = interfaceC6654a2;
        this.f31371i = interfaceC5687c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m27316l(AbstractC1004o abstractC1004o) {
        return Boolean.valueOf(this.f31365c.mo27964X(abstractC1004o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m27317m(AbstractC1004o abstractC1004o) {
        return this.f31365c.mo27966f0(abstractC1004o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m27318n(Iterable iterable, AbstractC1004o abstractC1004o, long j10) {
        this.f31365c.mo27965Z(iterable);
        this.f31365c.mo27962L(abstractC1004o, this.f31369g.mo30655a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m27319o(Iterable iterable) {
        this.f31365c.mo27960D(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m27320p() {
        this.f31371i.mo27956f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m27321q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f31371i.mo27957l(((Integer) r0.getValue()).intValue(), C4958c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m27322r(AbstractC1004o abstractC1004o, long j10) {
        this.f31365c.mo27962L(abstractC1004o, this.f31369g.mo30655a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m27323s(AbstractC1004o abstractC1004o, int i10) {
        this.f31366d.mo27292b(abstractC1004o, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m27324t(final AbstractC1004o abstractC1004o, final int i10, Runnable runnable) {
        try {
            try {
                InterfaceC5931b interfaceC5931b = this.f31368f;
                final InterfaceC5689d interfaceC5689d = this.f31365c;
                Objects.requireNonNull(interfaceC5689d);
                interfaceC5931b.mo28062p(new InterfaceC5931b.a(interfaceC5689d) { // from class: k6.i

                    /* renamed from: a */
                    public final InterfaceC5689d f31343a;

                    {
                        this.f31343a = interfaceC5689d;
                    }

                    @Override // p213m6.InterfaceC5931b.a
                    public final Object execute() {
                        return Integer.valueOf(this.f31343a.mo27959C());
                    }
                });
                if (m27326k()) {
                    m27327u(abstractC1004o, i10);
                } else {
                    this.f31368f.mo28062p(new InterfaceC5931b.a(this, abstractC1004o, i10) { // from class: k6.j

                        /* renamed from: a */
                        public final C5503r f31344a;

                        /* renamed from: b */
                        public final AbstractC1004o f31345b;

                        /* renamed from: c */
                        public final int f31346c;

                        {
                            this.f31344a = this;
                            this.f31345b = abstractC1004o;
                            this.f31346c = i10;
                        }

                        @Override // p213m6.InterfaceC5931b.a
                        public final Object execute() {
                            Object m27323s;
                            m27323s = this.f31344a.m27323s(this.f31345b, this.f31346c);
                            return m27323s;
                        }
                    });
                }
            } catch (C5930a e10) {
                this.f31366d.mo27292b(abstractC1004o, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC0998i m27325j(InterfaceC4317m interfaceC4317m) {
        InterfaceC5931b interfaceC5931b = this.f31368f;
        final InterfaceC5687c interfaceC5687c = this.f31371i;
        Objects.requireNonNull(interfaceC5687c);
        return interfaceC4317m.mo290a(AbstractC0998i.m5942a().mo5913i(this.f31369g.mo30655a()).mo5915k(this.f31370h.mo30655a()).mo5914j("GDT_CLIENT_METRICS").mo5912h(new C0997h(C10054b.m42268b("proto"), ((C4956a) interfaceC5931b.mo28062p(new InterfaceC5931b.a(interfaceC5687c) { // from class: k6.h

            /* renamed from: a */
            public final InterfaceC5687c f31342a;

            {
                this.f31342a = interfaceC5687c;
            }

            @Override // p213m6.InterfaceC5931b.a
            public final Object execute() {
                return this.f31342a.mo27958o();
            }
        })).m24950f())).mo5908d());
    }

    /* renamed from: k */
    public boolean m27326k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f31363a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    public void m27327u(final AbstractC1004o abstractC1004o, int i10) {
        AbstractC4311g mo291b;
        InterfaceC4317m interfaceC4317m = this.f31364b.get(abstractC1004o.mo5927b());
        long j10 = 0;
        while (((Boolean) this.f31368f.mo28062p(new InterfaceC5931b.a(this, abstractC1004o) { // from class: k6.k

            /* renamed from: a */
            public final C5503r f31347a;

            /* renamed from: b */
            public final AbstractC1004o f31348b;

            {
                this.f31347a = this;
                this.f31348b = abstractC1004o;
            }

            @Override // p213m6.InterfaceC5931b.a
            public final Object execute() {
                Boolean m27316l;
                m27316l = this.f31347a.m27316l(this.f31348b);
                return m27316l;
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f31368f.mo28062p(new InterfaceC5931b.a(this, abstractC1004o) { // from class: k6.l

                /* renamed from: a */
                public final C5503r f31349a;

                /* renamed from: b */
                public final AbstractC1004o f31350b;

                {
                    this.f31349a = this;
                    this.f31350b = abstractC1004o;
                }

                @Override // p213m6.InterfaceC5931b.a
                public final Object execute() {
                    Iterable m27317m;
                    m27317m = this.f31349a.m27317m(this.f31350b);
                    return m27317m;
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (interfaceC4317m == null) {
                C5036a.m25235a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC1004o);
                mo291b = AbstractC4311g.m21780a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC5703k) it.next()).mo27953b());
                }
                if (abstractC1004o.m5961e()) {
                    arrayList.add(m27325j(interfaceC4317m));
                }
                mo291b = interfaceC4317m.mo291b(AbstractC4310f.m21779a().mo21771b(arrayList).mo21772c(abstractC1004o.mo5928c()).mo21770a());
            }
            if (mo291b.mo21774c() == AbstractC4311g.a.TRANSIENT_ERROR) {
                final long j11 = j10;
                this.f31368f.mo28062p(new InterfaceC5931b.a(this, iterable, abstractC1004o, j11) { // from class: k6.m

                    /* renamed from: a */
                    public final C5503r f31351a;

                    /* renamed from: b */
                    public final Iterable f31352b;

                    /* renamed from: c */
                    public final AbstractC1004o f31353c;

                    /* renamed from: d */
                    public final long f31354d;

                    {
                        this.f31351a = this;
                        this.f31352b = iterable;
                        this.f31353c = abstractC1004o;
                        this.f31354d = j11;
                    }

                    @Override // p213m6.InterfaceC5931b.a
                    public final Object execute() {
                        Object m27318n;
                        m27318n = this.f31351a.m27318n(this.f31352b, this.f31353c, this.f31354d);
                        return m27318n;
                    }
                });
                this.f31366d.mo27291a(abstractC1004o, i10 + 1, true);
                return;
            }
            this.f31368f.mo28062p(new InterfaceC5931b.a(this, iterable) { // from class: k6.n

                /* renamed from: a */
                public final C5503r f31355a;

                /* renamed from: b */
                public final Iterable f31356b;

                {
                    this.f31355a = this;
                    this.f31356b = iterable;
                }

                @Override // p213m6.InterfaceC5931b.a
                public final Object execute() {
                    Object m27319o;
                    m27319o = this.f31355a.m27319o(this.f31356b);
                    return m27319o;
                }
            });
            if (mo291b.mo21774c() == AbstractC4311g.a.OK) {
                long max = Math.max(j10, mo291b.mo21773b());
                j10 = max;
                if (abstractC1004o.m5961e()) {
                    this.f31368f.mo28062p(new InterfaceC5931b.a(this) { // from class: k6.o

                        /* renamed from: a */
                        public final C5503r f31357a;

                        {
                            this.f31357a = this;
                        }

                        @Override // p213m6.InterfaceC5931b.a
                        public final Object execute() {
                            Object m27320p;
                            m27320p = this.f31357a.m27320p();
                            return m27320p;
                        }
                    });
                    j10 = max;
                }
            } else if (mo291b.mo21774c() == AbstractC4311g.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String mo5906j = ((AbstractC5703k) it2.next()).mo27953b().mo5906j();
                    hashMap.put(mo5906j, !hashMap.containsKey(mo5906j) ? 1 : Integer.valueOf(((Integer) hashMap.get(mo5906j)).intValue() + 1));
                }
                this.f31368f.mo28062p(new InterfaceC5931b.a(this, hashMap) { // from class: k6.p

                    /* renamed from: a */
                    public final C5503r f31358a;

                    /* renamed from: b */
                    public final Map f31359b;

                    {
                        this.f31358a = this;
                        this.f31359b = hashMap;
                    }

                    @Override // p213m6.InterfaceC5931b.a
                    public final Object execute() {
                        Object m27321q;
                        m27321q = this.f31358a.m27321q(this.f31359b);
                        return m27321q;
                    }
                });
            }
        }
        final long j12 = j10;
        this.f31368f.mo28062p(new InterfaceC5931b.a(this, abstractC1004o, j12) { // from class: k6.q

            /* renamed from: a */
            public final C5503r f31360a;

            /* renamed from: b */
            public final AbstractC1004o f31361b;

            /* renamed from: c */
            public final long f31362c;

            {
                this.f31360a = this;
                this.f31361b = abstractC1004o;
                this.f31362c = j12;
            }

            @Override // p213m6.InterfaceC5931b.a
            public final Object execute() {
                Object m27322r;
                m27322r = this.f31360a.m27322r(this.f31361b, this.f31362c);
                return m27322r;
            }
        });
    }

    /* renamed from: v */
    public void m27328v(final AbstractC1004o abstractC1004o, final int i10, final Runnable runnable) {
        this.f31367e.execute(new Runnable(this, abstractC1004o, i10, runnable) { // from class: k6.g

            /* renamed from: b */
            public final C5503r f31338b;

            /* renamed from: c */
            public final AbstractC1004o f31339c;

            /* renamed from: d */
            public final int f31340d;

            /* renamed from: e */
            public final Runnable f31341e;

            {
                this.f31338b = this;
                this.f31339c = abstractC1004o;
                this.f31340d = i10;
                this.f31341e = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f31338b.m27324t(this.f31339c, this.f31340d, this.f31341e);
            }
        });
    }
}
