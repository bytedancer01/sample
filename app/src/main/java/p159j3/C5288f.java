package p159j3;

import com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p004a3.InterfaceC0050d;
import p021b3.C0790b;
import p033c3.AbstractC0984d;
import p109g3.C4935a;
import p109g3.C4936b;
import p109g3.C4937c;
import p109g3.C4938d;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.EnumC5285c;
import p173ji.C5410f0;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;
import p224n3.C6645c;
import p224n3.C6647e;
import p264p3.C7550d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/f.class
 */
/* renamed from: j3.f */
/* loaded from: combined.jar:classes1.jar:j3/f.class */
public final class C5288f implements AppSyncPrefetch {

    /* renamed from: a */
    public final InterfaceC0050d f30405a;

    /* renamed from: b */
    public final C5433x f30406b;

    /* renamed from: c */
    public final InterfaceC5407e.a f30407c;

    /* renamed from: d */
    public final C7550d f30408d;

    /* renamed from: e */
    public final Executor f30409e;

    /* renamed from: f */
    public final C5284b f30410f;

    /* renamed from: g */
    public final C5283a f30411g;

    /* renamed from: h */
    public final InterfaceC5169b f30412h;

    /* renamed from: i */
    public final boolean f30413i;

    /* renamed from: j */
    public final AtomicReference<EnumC5285c> f30414j = new AtomicReference<>(EnumC5285c.IDLE);

    /* renamed from: k */
    public final AtomicReference<AppSyncPrefetch.Callback> f30415k = new AtomicReference<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/f$a.class
     */
    /* renamed from: j3.f$a */
    /* loaded from: combined.jar:classes1.jar:j3/f$a.class */
    public class a implements InterfaceC5168a.a {

        /* renamed from: a */
        public final C5288f f30416a;

        public a(C5288f c5288f) {
            this.f30416a = c5288f;
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onCompleted() {
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFailure(C4936b c4936b) {
            AbstractC0984d m26454d = this.f30416a.m26454d();
            if (!m26454d.mo5882f()) {
                C5288f c5288f = this.f30416a;
                c5288f.f30410f.m26389d(c4936b, "onFailure for prefetch operation: %s. No callback present.", c5288f.operation().name().name());
            } else {
                if (c4936b instanceof C4937c) {
                    ((AppSyncPrefetch.Callback) m26454d.mo5881e()).onHttpError((C4937c) c4936b);
                    return;
                }
                boolean z10 = c4936b instanceof C4938d;
                AppSyncPrefetch.Callback callback = (AppSyncPrefetch.Callback) m26454d.mo5881e();
                if (z10) {
                    callback.onNetworkError((C4938d) c4936b);
                } else {
                    callback.onFailure(c4936b);
                }
            }
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFetch(InterfaceC5168a.b bVar) {
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onResponse(InterfaceC5168a.d dVar) {
            C5410f0 mo5881e = dVar.f29544a.mo5881e();
            try {
                AbstractC0984d m26454d = this.f30416a.m26454d();
                if (!m26454d.mo5882f()) {
                    C5288f c5288f = this.f30416a;
                    c5288f.f30410f.m26386a("onResponse for prefetch operation: %s. No callback present.", c5288f.operation().name().name());
                } else {
                    if (mo5881e.m26926q0()) {
                        ((AppSyncPrefetch.Callback) m26454d.mo5881e()).onSuccess();
                    } else {
                        ((AppSyncPrefetch.Callback) m26454d.mo5881e()).onHttpError(new C4937c(mo5881e));
                    }
                }
            } finally {
                mo5881e.close();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/f$b.class
     */
    /* renamed from: j3.f$b */
    /* loaded from: combined.jar:classes1.jar:j3/f$b.class */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final int[] f30417a;

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
                p159j3.C5288f.b.f30417a = r0
                r0 = r4
                j3.c r1 = p159j3.EnumC5285c.ACTIVE     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = p159j3.C5288f.b.f30417a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                j3.c r1 = p159j3.EnumC5285c.IDLE     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = p159j3.C5288f.b.f30417a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                j3.c r1 = p159j3.EnumC5285c.CANCELED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = p159j3.C5288f.b.f30417a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
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
            throw new UnsupportedOperationException("Method not decompiled: p159j3.C5288f.b.m44658clinit():void");
        }
    }

    public C5288f(InterfaceC0050d interfaceC0050d, C5433x c5433x, InterfaceC5407e.a aVar, C7550d c7550d, Executor executor, C5284b c5284b, C5283a c5283a, boolean z10) {
        this.f30405a = interfaceC0050d;
        this.f30406b = c5433x;
        this.f30407c = aVar;
        this.f30408d = c7550d;
        this.f30409e = executor;
        this.f30410f = c5284b;
        this.f30411g = c5283a;
        this.f30413i = z10;
        this.f30412h = new C6647e(Collections.singletonList(new C6645c(c5433x, aVar, C0790b.f5521b, true, c7550d, c5284b, z10)));
    }

    /* renamed from: b */
    public final void m26452b(AbstractC0984d<AppSyncPrefetch.Callback> abstractC0984d) {
        synchronized (this) {
            int i10 = b.f30417a[this.f30414j.get().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f30415k.set(abstractC0984d.mo5886k());
                    this.f30411g.m26377g(this);
                    this.f30414j.set(EnumC5285c.ACTIVE);
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

    /* renamed from: c */
    public final InterfaceC5168a.a m26453c() {
        return new a(this);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public void cancel() {
        AtomicReference<EnumC5285c> atomicReference;
        EnumC5285c enumC5285c;
        synchronized (this) {
            int i10 = b.f30417a[this.f30414j.get().ordinal()];
            if (i10 == 1) {
                try {
                    this.f30412h.dispose();
                    this.f30411g.m26383m(this);
                    this.f30415k.set(null);
                    atomicReference = this.f30414j;
                    enumC5285c = EnumC5285c.CANCELED;
                } catch (Throwable th2) {
                    this.f30411g.m26383m(this);
                    this.f30415k.set(null);
                    this.f30414j.set(EnumC5285c.CANCELED);
                    throw th2;
                }
            } else if (i10 == 2) {
                atomicReference = this.f30414j;
                enumC5285c = EnumC5285c.CANCELED;
            } else if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("Unknown state");
            }
            atomicReference.set(enumC5285c);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppSyncPrefetch m44657clone() {
        return new C5288f(this.f30405a, this.f30406b, this.f30407c, this.f30408d, this.f30409e, this.f30410f, this.f30411g, this.f30413i);
    }

    /* renamed from: d */
    public final AbstractC0984d<AppSyncPrefetch.Callback> m26454d() {
        synchronized (this) {
            int i10 = b.f30417a[this.f30414j.get().ordinal()];
            if (i10 == 1) {
                this.f30411g.m26383m(this);
                this.f30414j.set(EnumC5285c.TERMINATED);
                return AbstractC0984d.m5888d(this.f30415k.getAndSet(null));
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return AbstractC0984d.m5888d(this.f30415k.getAndSet(null));
                }
                if (i10 != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(EnumC5285c.a.m26393b(this.f30414j.get()).m26394a(EnumC5285c.ACTIVE, EnumC5285c.CANCELED));
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public void enqueue(AppSyncPrefetch.Callback callback) {
        try {
            m26452b(AbstractC0984d.m5888d(callback));
            this.f30412h.mo25821a(InterfaceC5168a.c.m25814a(this.f30405a).m25816a(), this.f30409e, m26453c());
        } catch (C4935a e10) {
            if (callback != null) {
                callback.onFailure(e10);
            } else {
                this.f30410f.m26389d(e10, "Operation: %s was canceled", operation().name().name());
            }
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public boolean isCanceled() {
        return this.f30414j.get() == EnumC5285c.CANCELED;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public InterfaceC0050d operation() {
        return this.f30405a;
    }
}
