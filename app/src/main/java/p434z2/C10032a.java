package p434z2;

import com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p004a3.InterfaceC0049c;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0052f;
import p004a3.InterfaceC0062p;
import p004a3.InterfaceC0063q;
import p021b3.C0790b;
import p021b3.InterfaceC0789a;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p053d3.C4301a;
import p072e3.AbstractC4597c;
import p072e3.AbstractC4601g;
import p072e3.C4604j;
import p072e3.InterfaceC4595a;
import p121h3.InterfaceC5022a;
import p141i3.InterfaceC5168a;
import p159j3.C5283a;
import p159j3.C5284b;
import p159j3.C5287e;
import p159j3.C5288f;
import p159j3.C5290h;
import p159j3.C5291i;
import p173ji.C5402b0;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5434y;
import p178k3.C5466e;
import p264p3.C7550d;
import p279q3.C7750a;
import p279q3.InterfaceC7751b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z2/a.class
 */
/* renamed from: z2.a */
/* loaded from: combined.jar:classes1.jar:z2/a.class */
public final class C10032a implements AppSyncQueryCall.Factory, AppSyncMutationCall.Factory, AppSyncSubscriptionCall.Factory, AppSyncPrefetch.Factory {

    /* renamed from: a */
    public final C5433x f46003a;

    /* renamed from: b */
    public final InterfaceC5407e.a f46004b;

    /* renamed from: c */
    public final InterfaceC0789a f46005c;

    /* renamed from: d */
    public final InterfaceC4595a f46006d;

    /* renamed from: e */
    public final C7550d f46007e;

    /* renamed from: f */
    public final C5291i f46008f;

    /* renamed from: g */
    public final Executor f46009g;

    /* renamed from: h */
    public final C0790b.c f46010h;

    /* renamed from: i */
    public final InterfaceC5022a f46011i;

    /* renamed from: j */
    public final C4301a f46012j;

    /* renamed from: k */
    public final C5284b f46013k;

    /* renamed from: l */
    public final C5283a f46014l;

    /* renamed from: m */
    public final List<InterfaceC5168a> f46015m;

    /* renamed from: n */
    public final boolean f46016n;

    /* renamed from: o */
    public final InterfaceC7751b f46017o;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z2/a$b.class
     */
    /* renamed from: z2.a$b */
    /* loaded from: combined.jar:classes1.jar:z2/a$b.class */
    public static class b {

        /* renamed from: a */
        public InterfaceC5407e.a f46018a;

        /* renamed from: b */
        public C5433x f46019b;

        /* renamed from: c */
        public InterfaceC0789a f46020c;

        /* renamed from: d */
        public InterfaceC4595a f46021d;

        /* renamed from: e */
        public AbstractC0984d<AbstractC4601g> f46022e;

        /* renamed from: f */
        public AbstractC0984d<AbstractC4597c> f46023f;

        /* renamed from: g */
        public C0790b.c f46024g;

        /* renamed from: h */
        public InterfaceC5022a f46025h;

        /* renamed from: i */
        public C4301a f46026i;

        /* renamed from: j */
        public final Map<InterfaceC0062p, InterfaceC10033b> f46027j;

        /* renamed from: k */
        public Executor f46028k;

        /* renamed from: l */
        public AbstractC0984d<InterfaceC10036e> f46029l;

        /* renamed from: m */
        public final List<InterfaceC5168a> f46030m;

        /* renamed from: n */
        public boolean f46031n;

        /* renamed from: o */
        public InterfaceC7751b f46032o;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:z2/a$b$a.class
         */
        /* renamed from: z2.a$b$a */
        /* loaded from: combined.jar:classes1.jar:z2/a$b$a.class */
        public class a implements ThreadFactory {

            /* renamed from: a */
            public final b f46033a;

            public a(b bVar) {
                this.f46033a = bVar;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Apollo Dispatcher");
            }
        }

        public b() {
            this.f46021d = InterfaceC4595a.f27244a;
            this.f46022e = AbstractC0984d.m5887a();
            this.f46023f = AbstractC0984d.m5887a();
            this.f46024g = C0790b.f5521b;
            this.f46025h = AppSyncResponseFetchers.CACHE_FIRST;
            this.f46026i = C4301a.f26420b;
            this.f46027j = new LinkedHashMap();
            this.f46029l = AbstractC0984d.m5887a();
            this.f46030m = new ArrayList();
            this.f46032o = new C7750a();
        }

        /* renamed from: c */
        public static InterfaceC5407e.a m42192c(InterfaceC5407e.a aVar, InterfaceC5434y interfaceC5434y) {
            InterfaceC5407e.a aVar2 = aVar;
            if (aVar instanceof C5402b0) {
                C5402b0 c5402b0 = (C5402b0) aVar;
                Iterator<InterfaceC5434y> it = c5402b0.m26779A().iterator();
                while (it.hasNext()) {
                    if (it.next().getClass().equals(interfaceC5434y.getClass())) {
                        return aVar;
                    }
                }
                aVar2 = c5402b0.m26782E().m26826a(interfaceC5434y).m26827b();
            }
            return aVar2;
        }

        /* renamed from: a */
        public b m42193a(InterfaceC5168a interfaceC5168a) {
            this.f46030m.add(interfaceC5168a);
            return this;
        }

        /* renamed from: b */
        public <T> b m42194b(InterfaceC0062p interfaceC0062p, InterfaceC10033b<T> interfaceC10033b) {
            this.f46027j.put(interfaceC0062p, interfaceC10033b);
            return this;
        }

        /* renamed from: d */
        public C10032a m42195d() {
            C0986f.m5892c(this.f46019b, "serverUrl is null");
            C5284b c5284b = new C5284b(this.f46029l);
            InterfaceC5407e.a aVar = this.f46018a;
            InterfaceC5407e.a aVar2 = aVar;
            if (aVar == null) {
                aVar2 = new C5402b0();
            }
            InterfaceC0789a interfaceC0789a = this.f46020c;
            InterfaceC5407e.a aVar3 = aVar2;
            if (interfaceC0789a != null) {
                aVar3 = m42192c(aVar2, interfaceC0789a.m5086a());
            }
            Executor executor = this.f46028k;
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = m42198g();
            }
            C7550d c7550d = new C7550d(this.f46027j);
            InterfaceC4595a interfaceC4595a = this.f46021d;
            AbstractC0984d<AbstractC4601g> abstractC0984d = this.f46022e;
            AbstractC0984d<AbstractC4597c> abstractC0984d2 = this.f46023f;
            if (abstractC0984d.mo5882f() && abstractC0984d2.mo5882f()) {
                interfaceC4595a = new C5466e(abstractC0984d.mo5881e().m23199b(C4604j.m23219a()), abstractC0984d2.mo5881e(), c7550d, executor2, c5284b);
            }
            return new C10032a(this.f46019b, aVar3, interfaceC0789a, interfaceC4595a, c7550d, executor2, this.f46024g, this.f46025h, this.f46026i, c5284b, this.f46030m, this.f46031n, this.f46032o);
        }

        /* renamed from: e */
        public b m42196e(InterfaceC5407e.a aVar) {
            this.f46018a = (InterfaceC5407e.a) C0986f.m5892c(aVar, "factory == null");
            return this;
        }

        /* renamed from: f */
        public b m42197f(C4301a c4301a) {
            this.f46026i = (C4301a) C0986f.m5892c(c4301a, "cacheHeaders == null");
            return this;
        }

        /* renamed from: g */
        public final Executor m42198g() {
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new a(this));
        }

        /* renamed from: h */
        public b m42199h(InterfaceC5022a interfaceC5022a) {
            this.f46025h = (InterfaceC5022a) C0986f.m5892c(interfaceC5022a, "defaultResponseFetcher == null");
            return this;
        }

        /* renamed from: i */
        public b m42200i(Executor executor) {
            this.f46028k = (Executor) C0986f.m5892c(executor, "dispatcher == null");
            return this;
        }

        /* renamed from: j */
        public b m42201j(AbstractC4601g abstractC4601g, AbstractC4597c abstractC4597c) {
            this.f46022e = AbstractC0984d.m5888d(C0986f.m5892c(abstractC4601g, "normalizedCacheFactory == null"));
            this.f46023f = AbstractC0984d.m5888d(C0986f.m5892c(abstractC4597c, "cacheKeyResolver == null"));
            return this;
        }

        /* renamed from: k */
        public b m42202k(C5402b0 c5402b0) {
            return m42196e((InterfaceC5407e.a) C0986f.m5892c(c5402b0, "okHttpClient is null"));
        }

        /* renamed from: l */
        public b m42203l(String str) {
            this.f46019b = C5433x.m27105m((String) C0986f.m5892c(str, "serverUrl == null"));
            return this;
        }

        /* renamed from: m */
        public b m42204m(InterfaceC7751b interfaceC7751b) {
            this.f46032o = interfaceC7751b;
            return this;
        }
    }

    public C10032a(C5433x c5433x, InterfaceC5407e.a aVar, InterfaceC0789a interfaceC0789a, InterfaceC4595a interfaceC4595a, C7550d c7550d, Executor executor, C0790b.c cVar, InterfaceC5022a interfaceC5022a, C4301a c4301a, C5284b c5284b, List<InterfaceC5168a> list, boolean z10, InterfaceC7751b interfaceC7751b) {
        this.f46008f = new C5291i();
        this.f46014l = new C5283a();
        this.f46003a = c5433x;
        this.f46004b = aVar;
        this.f46005c = interfaceC0789a;
        this.f46006d = interfaceC4595a;
        this.f46007e = c7550d;
        this.f46009g = executor;
        this.f46010h = cVar;
        this.f46011i = interfaceC5022a;
        this.f46012j = c4301a;
        this.f46013k = c5284b;
        this.f46015m = list;
        this.f46016n = z10;
        this.f46017o = interfaceC7751b;
    }

    /* renamed from: b */
    public static b m42189b() {
        return new b();
    }

    /* renamed from: a */
    public InterfaceC4595a m42190a() {
        return this.f46006d;
    }

    /* renamed from: c */
    public final <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> C5287e<T> m42191c(InterfaceC0050d<D, T, V> interfaceC0050d) {
        return C5287e.m26416d().m26440j(interfaceC0050d).m26448r(this.f46003a).m26438h(this.f46004b).m26436f(this.f46005c).m26437g(this.f46010h).m26445o(this.f46008f).m26446p(this.f46007e).m26431a(this.f46006d).m26444n(this.f46011i).m26434d(this.f46012j).m26435e(this.f46009g).m26439i(this.f46013k).m26432b(this.f46015m).m26450t(this.f46014l).m26442l(Collections.emptyList()).m26443m(Collections.emptyList()).m26447q(this.f46016n).m26449s(this.f46017o).m26433c();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall.Factory
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AppSyncMutationCall<T> mutate(InterfaceC0049c<D, T, V> interfaceC0049c) {
        return m42191c(interfaceC0049c).responseFetcher(AppSyncResponseFetchers.NETWORK_ONLY);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall.Factory
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AppSyncMutationCall<T> mutate(InterfaceC0049c<D, T, V> interfaceC0049c, D d10) {
        C0986f.m5892c(d10, "withOptimisticUpdate == null");
        return m42191c(interfaceC0049c).m26427n().m26444n(AppSyncResponseFetchers.NETWORK_ONLY).m26441k(AbstractC0984d.m5888d(d10)).m26433c();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch.Factory
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AppSyncPrefetch prefetch(InterfaceC0050d<D, T, V> interfaceC0050d) {
        return new C5288f(interfaceC0050d, this.f46003a, this.f46004b, this.f46007e, this.f46009g, this.f46013k, this.f46014l, this.f46016n);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall.Factory
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AppSyncQueryCall<T> query(InterfaceC0052f<D, T, V> interfaceC0052f) {
        return m42191c(interfaceC0052f);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall.Factory
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AppSyncSubscriptionCall<T> subscribe(InterfaceC0063q<D, T, V> interfaceC0063q) {
        return new C5290h(interfaceC0063q, this.f46017o, this, this.f46013k, m42191c(interfaceC0063q));
    }
}
