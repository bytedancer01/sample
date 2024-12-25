package p159j3;

import com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p004a3.InterfaceC0049c;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0051e;
import p004a3.InterfaceC0052f;
import p004a3.InterfaceC0055i;
import p021b3.C0790b;
import p021b3.InterfaceC0789a;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p033c3.InterfaceC0982b;
import p053d3.C4301a;
import p072e3.InterfaceC4595a;
import p109g3.C4935a;
import p109g3.C4936b;
import p109g3.C4937c;
import p109g3.C4938d;
import p109g3.C4939e;
import p121h3.InterfaceC5022a;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.EnumC5285c;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;
import p224n3.C6643a;
import p224n3.C6644b;
import p224n3.C6645c;
import p224n3.C6646d;
import p224n3.C6647e;
import p264p3.C7550d;
import p279q3.InterfaceC7751b;
import p434z2.InterfaceC10034c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/e.class
 */
/* renamed from: j3.e */
/* loaded from: combined.jar:classes1.jar:j3/e.class */
public final class C5287e<T> implements AppSyncQueryCall<T>, AppSyncMutationCall<T> {

    /* renamed from: a */
    public final InterfaceC0050d f30357a;

    /* renamed from: b */
    public final C5433x f30358b;

    /* renamed from: c */
    public final InterfaceC5407e.a f30359c;

    /* renamed from: d */
    public final InterfaceC0789a f30360d;

    /* renamed from: e */
    public final C0790b.c f30361e;

    /* renamed from: f */
    public final C5291i f30362f;

    /* renamed from: g */
    public final C7550d f30363g;

    /* renamed from: h */
    public final InterfaceC4595a f30364h;

    /* renamed from: i */
    public final C4301a f30365i;

    /* renamed from: j */
    public final InterfaceC5022a f30366j;

    /* renamed from: k */
    public final InterfaceC5169b f30367k;

    /* renamed from: l */
    public final Executor f30368l;

    /* renamed from: m */
    public final C5284b f30369m;

    /* renamed from: n */
    public final C5283a f30370n;

    /* renamed from: o */
    public final List<InterfaceC5168a> f30371o;

    /* renamed from: p */
    public final List<InterfaceC0051e> f30372p;

    /* renamed from: q */
    public final List<InterfaceC0052f> f30373q;

    /* renamed from: r */
    public final AbstractC0984d<C5286d> f30374r;

    /* renamed from: s */
    public final boolean f30375s;

    /* renamed from: t */
    public final AtomicReference<EnumC5285c> f30376t;

    /* renamed from: u */
    public final AtomicReference<InterfaceC10034c.a<T>> f30377u;

    /* renamed from: v */
    public final AbstractC0984d<InterfaceC0050d.a> f30378v;

    /* renamed from: w */
    public InterfaceC7751b f30379w;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/e$a.class
     */
    /* renamed from: j3.e$a */
    /* loaded from: combined.jar:classes1.jar:j3/e$a.class */
    public class a implements InterfaceC5168a.a {

        /* renamed from: a */
        public final C5287e f30380a;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:j3/e$a$a.class
         */
        /* renamed from: j3.e$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:j3/e$a$a.class */
        public class C10302a implements InterfaceC0982b<InterfaceC10034c.a<T>> {

            /* renamed from: a */
            public final InterfaceC5168a.b f30381a;

            /* renamed from: b */
            public final a f30382b;

            public C10302a(a aVar, InterfaceC5168a.b bVar) {
                this.f30382b = aVar;
                this.f30381a = bVar;
            }

            @Override // p033c3.InterfaceC0982b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void apply(InterfaceC10034c.a<T> aVar) {
                InterfaceC10034c.b bVar;
                int i10 = c.f30385b[this.f30381a.ordinal()];
                if (i10 == 1) {
                    bVar = InterfaceC10034c.b.FETCH_CACHE;
                } else if (i10 != 2) {
                    return;
                } else {
                    bVar = InterfaceC10034c.b.FETCH_NETWORK;
                }
                aVar.onStatusEvent(bVar);
            }
        }

        public a(C5287e c5287e) {
            this.f30380a = c5287e;
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onCompleted() {
            AbstractC0984d m26426m = this.f30380a.m26426m();
            if (this.f30380a.f30374r.mo5882f()) {
                this.f30380a.f30374r.mo5881e().m26398d();
            }
            if (m26426m.mo5882f()) {
                ((InterfaceC10034c.a) m26426m.mo5881e()).onStatusEvent(InterfaceC10034c.b.COMPLETED);
            } else {
                C5287e c5287e = this.f30380a;
                c5287e.f30369m.m26386a("onCompleted for operation: %s. No callback present.", c5287e.operation().name().name());
            }
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFailure(C4936b c4936b) {
            AbstractC0984d m26426m = this.f30380a.m26426m();
            if (!m26426m.mo5882f()) {
                C5287e c5287e = this.f30380a;
                c5287e.f30369m.m26387b(c4936b, "onFailure for operation: %s. No callback present.", c5287e.operation().name().name());
                return;
            }
            if (c4936b instanceof C4937c) {
                ((InterfaceC10034c.a) m26426m.mo5881e()).onHttpError((C4937c) c4936b);
                return;
            }
            if (c4936b instanceof C4939e) {
                ((InterfaceC10034c.a) m26426m.mo5881e()).onParseError((C4939e) c4936b);
                return;
            }
            boolean z10 = c4936b instanceof C4938d;
            InterfaceC10034c.a aVar = (InterfaceC10034c.a) m26426m.mo5881e();
            if (z10) {
                aVar.onNetworkError((C4938d) c4936b);
            } else {
                aVar.onFailure(c4936b);
            }
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFetch(InterfaceC5168a.b bVar) {
            this.f30380a.m26424k().mo5879b(new C10302a(this, bVar));
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onResponse(InterfaceC5168a.d dVar) {
            AbstractC0984d m26424k = this.f30380a.m26424k();
            if (m26424k.mo5882f()) {
                ((InterfaceC10034c.a) m26424k.mo5881e()).onResponse(dVar.f29545b.mo5881e());
            } else {
                C5287e c5287e = this.f30380a;
                c5287e.f30369m.m26386a("onResponse for operation: %s. No callback present.", c5287e.operation().name().name());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/e$b.class
     */
    /* renamed from: j3.e$b */
    /* loaded from: combined.jar:classes1.jar:j3/e$b.class */
    public class b implements InterfaceC0982b<InterfaceC10034c.a<T>> {

        /* renamed from: a */
        public final C5287e f30383a;

        public b(C5287e c5287e) {
            this.f30383a = c5287e;
        }

        @Override // p033c3.InterfaceC0982b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(InterfaceC10034c.a<T> aVar) {
            aVar.onStatusEvent(InterfaceC10034c.b.SCHEDULED);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/e$c.class
     */
    /* renamed from: j3.e$c */
    /* loaded from: combined.jar:classes1.jar:j3/e$c.class */
    public static /* synthetic */ class c {

        /* renamed from: a */
        public static final int[] f30384a;

        /* renamed from: b */
        public static final int[] f30385b;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x005d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                i3.a$b[] r0 = p141i3.InterfaceC5168a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p159j3.C5287e.c.f30385b = r0
                r0 = r4
                i3.a$b r1 = p141i3.InterfaceC5168a.b.CACHE     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L14:
                int[] r0 = p159j3.C5287e.c.f30385b     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                i3.a$b r1 = p141i3.InterfaceC5168a.b.NETWORK     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L1f:
                j3.c[] r0 = p159j3.EnumC5285c.values()     // Catch: java.lang.NoSuchFieldError -> L59
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p159j3.C5287e.c.f30384a = r0
                r0 = r4
                j3.c r1 = p159j3.EnumC5285c.ACTIVE     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L33:
                int[] r0 = p159j3.C5287e.c.f30384a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                j3.c r1 = p159j3.EnumC5285c.IDLE     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L3e:
                int[] r0 = p159j3.C5287e.c.f30384a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                j3.c r1 = p159j3.EnumC5285c.CANCELED     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L49:
                int[] r0 = p159j3.C5287e.c.f30384a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                j3.c r1 = p159j3.EnumC5285c.TERMINATED     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L54:
                return
            L55:
                r4 = move-exception
                goto L14
            L59:
                r4 = move-exception
                goto L1f
            L5d:
                r4 = move-exception
                goto L33
            L61:
                r4 = move-exception
                goto L3e
            L65:
                r4 = move-exception
                goto L49
            L69:
                r4 = move-exception
                goto L54
            */
            throw new UnsupportedOperationException("Method not decompiled: p159j3.C5287e.c.m44656clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/e$d.class
     */
    /* renamed from: j3.e$d */
    /* loaded from: combined.jar:classes1.jar:j3/e$d.class */
    public static final class d<T> {

        /* renamed from: a */
        public InterfaceC0050d f30386a;

        /* renamed from: b */
        public C5433x f30387b;

        /* renamed from: c */
        public InterfaceC5407e.a f30388c;

        /* renamed from: d */
        public InterfaceC0789a f30389d;

        /* renamed from: e */
        public C0790b.c f30390e;

        /* renamed from: f */
        public C5291i f30391f;

        /* renamed from: g */
        public C7550d f30392g;

        /* renamed from: h */
        public InterfaceC4595a f30393h;

        /* renamed from: i */
        public InterfaceC5022a f30394i;

        /* renamed from: j */
        public C4301a f30395j;

        /* renamed from: k */
        public Executor f30396k;

        /* renamed from: l */
        public C5284b f30397l;

        /* renamed from: m */
        public List<InterfaceC5168a> f30398m;

        /* renamed from: p */
        public C5283a f30401p;

        /* renamed from: q */
        public boolean f30402q;

        /* renamed from: s */
        public InterfaceC7751b f30404s;

        /* renamed from: n */
        public List<InterfaceC0051e> f30399n = Collections.emptyList();

        /* renamed from: o */
        public List<InterfaceC0052f> f30400o = Collections.emptyList();

        /* renamed from: r */
        public AbstractC0984d<InterfaceC0050d.a> f30403r = AbstractC0984d.m5887a();

        /* renamed from: a */
        public d<T> m26431a(InterfaceC4595a interfaceC4595a) {
            this.f30393h = interfaceC4595a;
            return this;
        }

        /* renamed from: b */
        public d<T> m26432b(List<InterfaceC5168a> list) {
            this.f30398m = list;
            return this;
        }

        /* renamed from: c */
        public C5287e<T> m26433c() {
            return new C5287e<>(this, null);
        }

        /* renamed from: d */
        public d<T> m26434d(C4301a c4301a) {
            this.f30395j = c4301a;
            return this;
        }

        /* renamed from: e */
        public d<T> m26435e(Executor executor) {
            this.f30396k = executor;
            return this;
        }

        /* renamed from: f */
        public d<T> m26436f(InterfaceC0789a interfaceC0789a) {
            this.f30389d = interfaceC0789a;
            return this;
        }

        /* renamed from: g */
        public d<T> m26437g(C0790b.c cVar) {
            this.f30390e = cVar;
            return this;
        }

        /* renamed from: h */
        public d<T> m26438h(InterfaceC5407e.a aVar) {
            this.f30388c = aVar;
            return this;
        }

        /* renamed from: i */
        public d<T> m26439i(C5284b c5284b) {
            this.f30397l = c5284b;
            return this;
        }

        /* renamed from: j */
        public d<T> m26440j(InterfaceC0050d interfaceC0050d) {
            this.f30386a = interfaceC0050d;
            return this;
        }

        /* renamed from: k */
        public d<T> m26441k(AbstractC0984d<InterfaceC0050d.a> abstractC0984d) {
            this.f30403r = abstractC0984d;
            return this;
        }

        /* renamed from: l */
        public d<T> m26442l(List<InterfaceC0052f> list) {
            this.f30400o = list != null ? new ArrayList(list) : Collections.emptyList();
            return this;
        }

        /* renamed from: m */
        public d<T> m26443m(List<InterfaceC0051e> list) {
            this.f30399n = list != null ? new ArrayList(list) : Collections.emptyList();
            return this;
        }

        /* renamed from: n */
        public d<T> m26444n(InterfaceC5022a interfaceC5022a) {
            this.f30394i = interfaceC5022a;
            return this;
        }

        /* renamed from: o */
        public d<T> m26445o(C5291i c5291i) {
            this.f30391f = c5291i;
            return this;
        }

        /* renamed from: p */
        public d<T> m26446p(C7550d c7550d) {
            this.f30392g = c7550d;
            return this;
        }

        /* renamed from: q */
        public d<T> m26447q(boolean z10) {
            this.f30402q = z10;
            return this;
        }

        /* renamed from: r */
        public d<T> m26448r(C5433x c5433x) {
            this.f30387b = c5433x;
            return this;
        }

        /* renamed from: s */
        public d<T> m26449s(InterfaceC7751b interfaceC7751b) {
            this.f30404s = interfaceC7751b;
            return this;
        }

        /* renamed from: t */
        public d<T> m26450t(C5283a c5283a) {
            this.f30401p = c5283a;
            return this;
        }
    }

    public C5287e(d<T> dVar) {
        this.f30376t = new AtomicReference<>(EnumC5285c.IDLE);
        this.f30377u = new AtomicReference<>();
        InterfaceC0050d interfaceC0050d = dVar.f30386a;
        this.f30357a = interfaceC0050d;
        this.f30358b = dVar.f30387b;
        this.f30359c = dVar.f30388c;
        this.f30360d = dVar.f30389d;
        this.f30361e = dVar.f30390e;
        this.f30362f = dVar.f30391f;
        this.f30363g = dVar.f30392g;
        this.f30364h = dVar.f30393h;
        this.f30366j = dVar.f30394i;
        this.f30365i = dVar.f30395j;
        this.f30368l = dVar.f30396k;
        this.f30369m = dVar.f30397l;
        this.f30371o = dVar.f30398m;
        List<InterfaceC0051e> list = dVar.f30399n;
        this.f30372p = list;
        List<InterfaceC0052f> list2 = dVar.f30400o;
        this.f30373q = list2;
        this.f30370n = dVar.f30401p;
        this.f30379w = dVar.f30404s;
        this.f30374r = ((list2.isEmpty() && list.isEmpty()) || dVar.f30393h == null) ? AbstractC0984d.m5887a() : AbstractC0984d.m5889h(C5286d.m26396b().m26408h(dVar.f30400o).m26409i(list).m26412l(dVar.f30387b).m26406f(dVar.f30388c).m26410j(dVar.f30391f).m26411k(dVar.f30392g).m26401a(dVar.f30393h).m26405e(dVar.f30396k).m26407g(dVar.f30397l).m26402b(dVar.f30398m).m26404d(dVar.f30401p).m26403c());
        this.f30375s = dVar.f30402q;
        this.f30367k = m26423j(interfaceC0050d);
        this.f30378v = dVar.f30403r;
    }

    public /* synthetic */ C5287e(d dVar, a aVar) {
        this(dVar);
    }

    /* renamed from: d */
    public static <T> d<T> m26416d() {
        return new d<>();
    }

    /* renamed from: c */
    public final void m26417c(AbstractC0984d<InterfaceC10034c.a<T>> abstractC0984d) {
        synchronized (this) {
            int i10 = c.f30384a[this.f30376t.get().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f30377u.set(abstractC0984d.mo5886k());
                    this.f30370n.m26375e(this);
                    abstractC0984d.mo5879b(new b(this));
                    this.f30376t.set(EnumC5285c.ACTIVE);
                } else {
                    if (i10 == 3) {
                        throw new C4935a("Call is cancelled.");
                    }
                    if (i10 != 4) {
                        throw new IllegalStateException("Unknown state");
                    }
                }
            }
            throw new IllegalStateException("Already Executed");
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public void cancel() {
        synchronized (this) {
            int i10 = c.f30384a[this.f30376t.get().ordinal()];
            if (i10 == 1) {
                this.f30376t.set(EnumC5285c.CANCELED);
                try {
                    if (this.f30357a instanceof InterfaceC0049c) {
                        m26419f();
                    }
                    this.f30367k.dispose();
                    if (this.f30374r.mo5882f()) {
                        this.f30374r.mo5881e().m26397c();
                    }
                } finally {
                    this.f30370n.m26381k(this);
                    this.f30377u.set(null);
                }
            } else if (i10 == 2) {
                this.f30376t.set(EnumC5285c.CANCELED);
            } else if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("Unknown state");
            }
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5287e<T> mo43338cacheHeaders(C4301a c4301a) {
        if (this.f30376t.get() == EnumC5285c.IDLE) {
            return m26427n().m26434d((C4301a) C0986f.m5892c(c4301a, "cacheHeaders == null")).m26433c();
        }
        throw new IllegalStateException("Already Executed");
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public void enqueue(InterfaceC10034c.a<T> aVar) {
        try {
            m26417c(AbstractC0984d.m5888d(aVar));
            this.f30367k.mo25821a(InterfaceC5168a.c.m25814a(this.f30357a).m25817b(this.f30365i).m25818c(false).m25820e(this.f30378v).m25816a(), this.f30368l, m26422i());
        } catch (C4935a e10) {
            if (aVar != null) {
                aVar.onCanceledError(e10);
            } else {
                this.f30369m.m26389d(e10, "Operation: %s was canceled", operation().name().name());
            }
        }
    }

    /* renamed from: f */
    public final void m26419f() {
        InterfaceC5168a interfaceC5168a;
        InterfaceC0049c interfaceC0049c = (InterfaceC0049c) this.f30357a;
        Iterator<InterfaceC5168a> it = this.f30371o.iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC5168a = null;
                break;
            } else {
                interfaceC5168a = it.next();
                if ("AppSyncOfflineMutationInterceptor".equalsIgnoreCase(interfaceC5168a.getClass().getSimpleName())) {
                    break;
                }
            }
        }
        if (interfaceC5168a == null) {
            return;
        }
        try {
            interfaceC5168a.getClass().getMethod("dispose", InterfaceC0049c.class).invoke(interfaceC5168a, interfaceC0049c);
        } catch (Exception e10) {
            this.f30369m.m26392g(e10, "unable to invoke dispose method", new Object[0]);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5287e<T> mo43339clone() {
        return m26427n().m26433c();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C5287e<T> httpCachePolicy(C0790b.c cVar) {
        if (this.f30376t.get() == EnumC5285c.IDLE) {
            return m26427n().m26437g((C0790b.c) C0986f.m5892c(cVar, "httpCachePolicy == null")).m26433c();
        }
        throw new IllegalStateException("Already Executed");
    }

    /* renamed from: i */
    public final InterfaceC5168a.a m26422i() {
        return new a(this);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public boolean isCanceled() {
        return this.f30376t.get() == EnumC5285c.CANCELED;
    }

    /* renamed from: j */
    public final InterfaceC5169b m26423j(InterfaceC0050d interfaceC0050d) {
        ArrayList arrayList = new ArrayList();
        C0790b.c cVar = interfaceC0050d instanceof InterfaceC0052f ? this.f30361e : null;
        InterfaceC0055i m26476a = this.f30362f.m26476a(interfaceC0050d);
        arrayList.addAll(this.f30371o);
        arrayList.add(this.f30366j.mo25228a(this.f30369m));
        arrayList.add(new C6643a(this.f30364h, m26476a, this.f30368l, this.f30369m));
        arrayList.add(new C6644b(this.f30360d, this.f30364h.mo23167j(), m26476a, this.f30363g, this.f30369m));
        arrayList.add(new C6646d(this.f30379w, this.f30364h.mo23167j()));
        arrayList.add(new C6645c(this.f30358b, this.f30359c, cVar, false, this.f30363g, this.f30369m, this.f30375s));
        return new C6647e(arrayList);
    }

    /* renamed from: k */
    public final AbstractC0984d<InterfaceC10034c.a<T>> m26424k() {
        AbstractC0984d<InterfaceC10034c.a<T>> m5888d;
        synchronized (this) {
            int i10 = c.f30384a[this.f30376t.get().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("Unknown state");
                        }
                    }
                }
                throw new IllegalStateException(EnumC5285c.a.m26393b(this.f30376t.get()).m26394a(EnumC5285c.ACTIVE, EnumC5285c.CANCELED));
            }
            m5888d = AbstractC0984d.m5888d(this.f30377u.get());
        }
        return m5888d;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5287e<T> responseFetcher(InterfaceC5022a interfaceC5022a) {
        if (this.f30376t.get() == EnumC5285c.IDLE) {
            return m26427n().m26444n((InterfaceC5022a) C0986f.m5892c(interfaceC5022a, "responseFetcher == null")).m26433c();
        }
        throw new IllegalStateException("Already Executed");
    }

    /* renamed from: m */
    public final AbstractC0984d<InterfaceC10034c.a<T>> m26426m() {
        synchronized (this) {
            int i10 = c.f30384a[this.f30376t.get().ordinal()];
            if (i10 == 1) {
                this.f30370n.m26381k(this);
                this.f30376t.set(EnumC5285c.TERMINATED);
                return AbstractC0984d.m5888d(this.f30377u.getAndSet(null));
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return AbstractC0984d.m5888d(this.f30377u.getAndSet(null));
                }
                if (i10 != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(EnumC5285c.a.m26393b(this.f30376t.get()).m26394a(EnumC5285c.ACTIVE, EnumC5285c.CANCELED));
        }
    }

    /* renamed from: n */
    public d<T> m26427n() {
        return m26416d().m26440j(this.f30357a).m26448r(this.f30358b).m26438h(this.f30359c).m26436f(this.f30360d).m26437g(this.f30361e).m26445o(this.f30362f).m26446p(this.f30363g).m26431a(this.f30364h).m26434d(this.f30365i).m26444n(this.f30366j).m26435e(this.f30368l).m26439i(this.f30369m).m26432b(this.f30371o).m26450t(this.f30370n).m26443m(this.f30372p).m26442l(this.f30373q).m26447q(this.f30375s).m26441k(this.f30378v);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C5289g<T> watcher() {
        return new C5289g<>(clone(), this.f30364h, this.f30369m, this.f30370n);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, p434z2.InterfaceC10034c
    public InterfaceC0050d operation() {
        return this.f30357a;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public AppSyncMutationCall<T> refetchQueries(InterfaceC0051e... interfaceC0051eArr) {
        if (this.f30376t.get() == EnumC5285c.IDLE) {
            return m26427n().m26443m(Arrays.asList((Object[]) C0986f.m5892c(interfaceC0051eArr, "operationNames == null"))).m26433c();
        }
        throw new IllegalStateException("Already Executed");
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public AppSyncMutationCall<T> refetchQueries(InterfaceC0052f... interfaceC0052fArr) {
        if (this.f30376t.get() == EnumC5285c.IDLE) {
            return m26427n().m26442l(Arrays.asList((Object[]) C0986f.m5892c(interfaceC0052fArr, "queries == null"))).m26433c();
        }
        throw new IllegalStateException("Already Executed");
    }
}
