package p159j3;

import com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p004a3.C0053g;
import p004a3.InterfaceC0050d;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p072e3.InterfaceC4595a;
import p109g3.C4935a;
import p109g3.C4936b;
import p109g3.C4937c;
import p109g3.C4938d;
import p109g3.C4939e;
import p121h3.InterfaceC5022a;
import p159j3.EnumC5285c;
import p434z2.InterfaceC10034c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/g.class
 */
/* renamed from: j3.g */
/* loaded from: combined.jar:classes1.jar:j3/g.class */
public final class C5289g<T> implements AppSyncQueryWatcher<T> {

    /* renamed from: a */
    public C5287e<T> f30418a;

    /* renamed from: c */
    public final InterfaceC4595a f30420c;

    /* renamed from: e */
    public final C5284b f30422e;

    /* renamed from: f */
    public final C5283a f30423f;

    /* renamed from: b */
    public InterfaceC5022a f30419b = AppSyncResponseFetchers.CACHE_FIRST;

    /* renamed from: d */
    public Set<String> f30421d = Collections.emptySet();

    /* renamed from: g */
    public final InterfaceC4595a.a f30424g = new a(this);

    /* renamed from: h */
    public final AtomicReference<EnumC5285c> f30425h = new AtomicReference<>(EnumC5285c.IDLE);

    /* renamed from: i */
    public final AtomicReference<InterfaceC10034c.a<T>> f30426i = new AtomicReference<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/g$a.class
     */
    /* renamed from: j3.g$a */
    /* loaded from: combined.jar:classes1.jar:j3/g$a.class */
    public class a implements InterfaceC4595a.a {

        /* renamed from: a */
        public final C5289g f30427a;

        public a(C5289g c5289g) {
            this.f30427a = c5289g;
        }

        @Override // p072e3.InterfaceC4595a.a
        /* renamed from: a */
        public void mo23179a(Set<String> set) {
            if (C0986f.m5890a(this.f30427a.f30421d, set)) {
                return;
            }
            this.f30427a.refetch();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/g$b.class
     */
    /* renamed from: j3.g$b */
    /* loaded from: combined.jar:classes1.jar:j3/g$b.class */
    public class b extends InterfaceC10034c.a<T> {

        /* renamed from: a */
        public final C5289g f30428a;

        public b(C5289g c5289g) {
            this.f30428a = c5289g;
        }

        @Override // p434z2.InterfaceC10034c.a
        public void onFailure(C4936b c4936b) {
            AbstractC0984d m26466l = this.f30428a.m26466l();
            if (!m26466l.mo5882f()) {
                this.f30428a.f30422e.m26387b(c4936b, "onFailure for operation: %s. No callback present.", this.f30428a.operation().name().name());
                return;
            }
            if (c4936b instanceof C4937c) {
                ((InterfaceC10034c.a) m26466l.mo5881e()).onHttpError((C4937c) c4936b);
                return;
            }
            if (c4936b instanceof C4939e) {
                ((InterfaceC10034c.a) m26466l.mo5881e()).onParseError((C4939e) c4936b);
                return;
            }
            boolean z10 = c4936b instanceof C4938d;
            InterfaceC10034c.a aVar = (InterfaceC10034c.a) m26466l.mo5881e();
            if (z10) {
                aVar.onNetworkError((C4938d) c4936b);
            } else {
                aVar.onFailure(c4936b);
            }
        }

        @Override // p434z2.InterfaceC10034c.a
        public void onResponse(C0053g<T> c0053g) {
            AbstractC0984d m26465k = this.f30428a.m26465k();
            if (!m26465k.mo5882f()) {
                this.f30428a.f30422e.m26386a("onResponse for watched operation: %s. No callback present.", this.f30428a.operation().name().name());
                return;
            }
            this.f30428a.f30421d = c0053g.m212c();
            this.f30428a.f30420c.mo23178w(this.f30428a.f30424g);
            ((InterfaceC10034c.a) m26465k.mo5881e()).onResponse(c0053g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/g$c.class
     */
    /* renamed from: j3.g$c */
    /* loaded from: combined.jar:classes1.jar:j3/g$c.class */
    public static /* synthetic */ class c {

        /* renamed from: a */
        public static final int[] f30429a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                j3.c[] r0 = p159j3.EnumC5285c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p159j3.C5289g.c.f30429a = r0
                r0 = r4
                j3.c r1 = p159j3.EnumC5285c.ACTIVE     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = p159j3.C5289g.c.f30429a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                j3.c r1 = p159j3.EnumC5285c.IDLE     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = p159j3.C5289g.c.f30429a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                j3.c r1 = p159j3.EnumC5285c.CANCELED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = p159j3.C5289g.c.f30429a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                j3.c r1 = p159j3.EnumC5285c.TERMINATED     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: p159j3.C5289g.c.m44659clinit():void");
        }
    }

    public C5289g(C5287e<T> c5287e, InterfaceC4595a interfaceC4595a, C5284b c5284b, C5283a c5283a) {
        this.f30418a = c5287e;
        this.f30420c = interfaceC4595a;
        this.f30422e = c5284b;
        this.f30423f = c5283a;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public void cancel() {
        AtomicReference<EnumC5285c> atomicReference;
        EnumC5285c enumC5285c;
        synchronized (this) {
            int i10 = c.f30429a[this.f30425h.get().ordinal()];
            if (i10 == 1) {
                try {
                    this.f30418a.cancel();
                    this.f30420c.mo23162e(this.f30424g);
                    this.f30423f.m26385o(this);
                    this.f30426i.set(null);
                    atomicReference = this.f30425h;
                    enumC5285c = EnumC5285c.CANCELED;
                } catch (Throwable th2) {
                    this.f30423f.m26385o(this);
                    this.f30426i.set(null);
                    this.f30425h.set(EnumC5285c.CANCELED);
                    throw th2;
                }
            } else if (i10 == 2) {
                atomicReference = this.f30425h;
                enumC5285c = EnumC5285c.CANCELED;
            } else if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("Unknown state");
            }
            atomicReference.set(enumC5285c);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public AppSyncQueryWatcher<T> enqueueAndWatch(InterfaceC10034c.a<T> aVar) {
        try {
            m26462h(AbstractC0984d.m5888d(aVar));
            this.f30418a.enqueue(m26463i());
            return this;
        } catch (C4935a e10) {
            if (aVar != null) {
                aVar.onCanceledError(e10);
            } else {
                this.f30422e.m26389d(e10, "Operation: %s was canceled", operation().name().name());
            }
            return this;
        }
    }

    /* renamed from: h */
    public final void m26462h(AbstractC0984d<InterfaceC10034c.a<T>> abstractC0984d) {
        synchronized (this) {
            int i10 = c.f30429a[this.f30425h.get().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f30426i.set(abstractC0984d.mo5886k());
                    this.f30423f.m26379i(this);
                    this.f30425h.set(EnumC5285c.ACTIVE);
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

    /* renamed from: i */
    public final InterfaceC10034c.a<T> m26463i() {
        return new b(this);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public boolean isCanceled() {
        return this.f30425h.get() == EnumC5285c.CANCELED;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C5289g<T> refetchResponseFetcher(InterfaceC5022a interfaceC5022a) {
        synchronized (this) {
            if (this.f30425h.get() != EnumC5285c.IDLE) {
                throw new IllegalStateException("Already Executed");
            }
            C0986f.m5892c(interfaceC5022a, "responseFetcher == null");
            this.f30419b = interfaceC5022a;
        }
        return this;
    }

    /* renamed from: k */
    public final AbstractC0984d<InterfaceC10034c.a<T>> m26465k() {
        AbstractC0984d<InterfaceC10034c.a<T>> m5888d;
        synchronized (this) {
            int i10 = c.f30429a[this.f30425h.get().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("Unknown state");
                        }
                    }
                }
                throw new IllegalStateException(EnumC5285c.a.m26393b(this.f30425h.get()).m26394a(EnumC5285c.ACTIVE, EnumC5285c.CANCELED));
            }
            m5888d = AbstractC0984d.m5888d(this.f30426i.get());
        }
        return m5888d;
    }

    /* renamed from: l */
    public final AbstractC0984d<InterfaceC10034c.a<T>> m26466l() {
        synchronized (this) {
            int i10 = c.f30429a[this.f30425h.get().ordinal()];
            if (i10 == 1) {
                this.f30423f.m26385o(this);
                this.f30425h.set(EnumC5285c.TERMINATED);
                return AbstractC0984d.m5888d(this.f30426i.getAndSet(null));
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return AbstractC0984d.m5888d(this.f30426i.getAndSet(null));
                }
                if (i10 != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(EnumC5285c.a.m26393b(this.f30425h.get()).m26394a(EnumC5285c.ACTIVE, EnumC5285c.CANCELED));
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public InterfaceC0050d operation() {
        return this.f30418a.operation();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public void refetch() {
        synchronized (this) {
            int i10 = c.f30429a[this.f30425h.get().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot refetch a watcher which has not first called enqueueAndWatch.");
                }
                if (i10 == 3) {
                    throw new IllegalStateException("Cannot refetch a canceled watcher,");
                }
                if (i10 == 4) {
                    throw new IllegalStateException("Cannot refetch a watcher which has experienced an error.");
                }
                throw new IllegalStateException("Unknown state");
            }
            this.f30420c.mo23162e(this.f30424g);
            this.f30418a.cancel();
            C5287e<T> responseFetcher = this.f30418a.clone().responseFetcher(this.f30419b);
            this.f30418a = responseFetcher;
            responseFetcher.enqueue(m26463i());
        }
    }
}
