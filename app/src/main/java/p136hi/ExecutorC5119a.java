package p136hi;

import android.support.v4.media.session.PlaybackStateCompat;
import fi.C4881t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.C4464c;
import p067di.C4483i0;
import p172jh.C5398q;
import p372vh.C9365d;
import p372vh.C9367f;
import p410xh.AbstractC9752c;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/a.class
 */
/* renamed from: hi.a */
/* loaded from: combined.jar:classes2.jar:hi/a.class */
public final class ExecutorC5119a implements Executor, Closeable {

    @NotNull
    private volatile int _isTerminated;

    /* renamed from: b */
    public final int f29395b;

    /* renamed from: c */
    public final int f29396c;

    @NotNull
    public volatile long controlState;

    /* renamed from: d */
    public final long f29397d;

    /* renamed from: e */
    @NotNull
    public final String f29398e;

    /* renamed from: f */
    @NotNull
    public final C5122d f29399f;

    /* renamed from: g */
    @NotNull
    public final C5122d f29400g;

    /* renamed from: h */
    @NotNull
    public final AtomicReferenceArray<c> f29401h;

    @NotNull
    private volatile long parkedWorkersStack;

    /* renamed from: i */
    @NotNull
    public static final a f29390i = new a(null);

    /* renamed from: m */
    @NotNull
    public static final C4881t f29394m = new C4881t("NOT_IN_STACK");

    /* renamed from: j */
    public static final AtomicLongFieldUpdater f29391j = AtomicLongFieldUpdater.newUpdater(ExecutorC5119a.class, "parkedWorkersStack");

    /* renamed from: k */
    public static final AtomicLongFieldUpdater f29392k = AtomicLongFieldUpdater.newUpdater(ExecutorC5119a.class, "controlState");

    /* renamed from: l */
    public static final AtomicIntegerFieldUpdater f29393l = AtomicIntegerFieldUpdater.newUpdater(ExecutorC5119a.class, "_isTerminated");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hi/a$a.class
     */
    /* renamed from: hi.a$a */
    /* loaded from: combined.jar:classes2.jar:hi/a$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hi/a$b.class
     */
    /* renamed from: hi.a$b */
    /* loaded from: combined.jar:classes2.jar:hi/a$b.class */
    public final /* synthetic */ class b {

        /* renamed from: a */
        public static final int[] f29402a;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f29402a = iArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hi/a$c.class
     */
    /* renamed from: hi.a$c */
    /* loaded from: combined.jar:classes2.jar:hi/a$c.class */
    public final class c extends Thread {

        /* renamed from: i */
        public static final AtomicIntegerFieldUpdater f29403i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: b */
        @NotNull
        public final C5132n f29404b;

        /* renamed from: c */
        @NotNull
        public d f29405c;

        /* renamed from: d */
        public long f29406d;

        /* renamed from: e */
        public long f29407e;

        /* renamed from: f */
        public int f29408f;

        /* renamed from: g */
        public boolean f29409g;

        /* renamed from: h */
        public final ExecutorC5119a f29410h;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;

        @NotNull
        public volatile int workerCtl;

        public c(ExecutorC5119a executorC5119a) {
            this.f29410h = executorC5119a;
            setDaemon(true);
            this.f29404b = new C5132n();
            this.f29405c = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC5119a.f29394m;
            this.f29408f = AbstractC9752c.f44498b.mo41071b();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(ExecutorC5119a executorC5119a, int i10) {
            this(executorC5119a);
            this.f29410h = executorC5119a;
            m25706n(i10);
        }

        /* renamed from: a */
        public final void m25693a(int i10) {
            if (i10 == 0) {
                return;
            }
            ExecutorC5119a.f29392k.addAndGet(this.f29410h, -2097152L);
            if (this.f29405c != d.TERMINATED) {
                this.f29405c = d.DORMANT;
            }
        }

        /* renamed from: b */
        public final void m25694b(int i10) {
            if (i10 != 0 && m25710r(d.BLOCKING)) {
                this.f29410h.m25677A0();
            }
        }

        /* renamed from: c */
        public final void m25695c(AbstractRunnableC5127i abstractRunnableC5127i) {
            int mo25718q0 = abstractRunnableC5127i.f29428c.mo25718q0();
            m25700h(mo25718q0);
            m25694b(mo25718q0);
            this.f29410h.m25685o0(abstractRunnableC5127i);
            m25693a(mo25718q0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        
            if (r0 == null) goto L28;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p136hi.AbstractRunnableC5127i m25696d(boolean r5) {
            /*
                r4 = this;
                r0 = r5
                if (r0 == 0) goto L4d
                r0 = r4
                r1 = r4
                hi.a r1 = r1.f29410h
                int r1 = r1.f29395b
                r2 = 2
                int r1 = r1 * r2
                int r0 = r0.m25702j(r1)
                if (r0 != 0) goto L19
                r0 = 1
                r6 = r0
                goto L1b
            L19:
                r0 = 0
                r6 = r0
            L1b:
                r0 = r6
                if (r0 == 0) goto L2d
                r0 = r4
                hi.i r0 = r0.m25704l()
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L2b
                goto L2d
            L2b:
                r0 = r7
                return r0
            L2d:
                r0 = r4
                hi.n r0 = r0.f29404b
                hi.i r0 = r0.m25728h()
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L4b
                r0 = r6
                if (r0 != 0) goto L5b
                r0 = r4
                hi.i r0 = r0.m25704l()
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L49
                goto L5b
            L49:
                r0 = r7
                return r0
            L4b:
                r0 = r7
                return r0
            L4d:
                r0 = r4
                hi.i r0 = r0.m25704l()
                r8 = r0
                r0 = r8
                r7 = r0
                r0 = r8
                if (r0 != 0) goto L61
            L5b:
                r0 = r4
                r1 = 0
                hi.i r0 = r0.m25711s(r1)
                r7 = r0
            L61:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p136hi.ExecutorC5119a.c.m25696d(boolean):hi.i");
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        
            if (r0 == null) goto L10;
         */
        @org.jetbrains.annotations.Nullable
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p136hi.AbstractRunnableC5127i m25697e(boolean r4) {
            /*
                r3 = this;
                r0 = r3
                boolean r0 = r0.m25708p()
                if (r0 == 0) goto Ld
                r0 = r3
                r1 = r4
                hi.i r0 = r0.m25696d(r1)
                return r0
            Ld:
                r0 = r4
                if (r0 == 0) goto L1f
                r0 = r3
                hi.n r0 = r0.f29404b
                hi.i r0 = r0.m25728h()
                r6 = r0
                r0 = r6
                r5 = r0
                r0 = r6
                if (r0 != 0) goto L2d
            L1f:
                r0 = r3
                hi.a r0 = r0.f29410h
                hi.d r0 = r0.f29400g
                java.lang.Object r0 = r0.m24778d()
                hi.i r0 = (p136hi.AbstractRunnableC5127i) r0
                r5 = r0
            L2d:
                r0 = r5
                r6 = r0
                r0 = r5
                if (r0 != 0) goto L39
                r0 = r3
                r1 = 1
                hi.i r0 = r0.m25711s(r1)
                r6 = r0
            L39:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p136hi.ExecutorC5119a.c.m25697e(boolean):hi.i");
        }

        /* renamed from: f */
        public final int m25698f() {
            return this.indexInArray;
        }

        @Nullable
        /* renamed from: g */
        public final Object m25699g() {
            return this.nextParkedWorker;
        }

        /* renamed from: h */
        public final void m25700h(int i10) {
            this.f29406d = 0L;
            if (this.f29405c == d.PARKING) {
                this.f29405c = d.BLOCKING;
            }
        }

        /* renamed from: i */
        public final boolean m25701i() {
            return this.nextParkedWorker != ExecutorC5119a.f29394m;
        }

        /* renamed from: j */
        public final int m25702j(int i10) {
            int i11 = this.f29408f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f29408f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        /* renamed from: k */
        public final void m25703k() {
            if (this.f29406d == 0) {
                this.f29406d = System.nanoTime() + this.f29410h.f29397d;
            }
            LockSupport.parkNanos(this.f29410h.f29397d);
            if (System.nanoTime() - this.f29406d >= 0) {
                this.f29406d = 0L;
                m25712t();
            }
        }

        /* renamed from: l */
        public final AbstractRunnableC5127i m25704l() {
            C5122d c5122d;
            AbstractRunnableC5127i abstractRunnableC5127i;
            if (m25702j(2) == 0) {
                AbstractRunnableC5127i m24778d = this.f29410h.f29399f.m24778d();
                abstractRunnableC5127i = m24778d;
                if (m24778d == null) {
                    c5122d = this.f29410h.f29400g;
                }
                return abstractRunnableC5127i;
            }
            AbstractRunnableC5127i m24778d2 = this.f29410h.f29400g.m24778d();
            if (m24778d2 != null) {
                return m24778d2;
            }
            c5122d = this.f29410h.f29399f;
            abstractRunnableC5127i = c5122d.m24778d();
            return abstractRunnableC5127i;
        }

        /* renamed from: m */
        public final void m25705m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!this.f29410h.isTerminated() && this.f29405c != d.TERMINATED) {
                    AbstractRunnableC5127i m25697e = m25697e(this.f29409g);
                    if (m25697e != null) {
                        this.f29407e = 0L;
                        m25695c(m25697e);
                    } else {
                        this.f29409g = false;
                        if (this.f29407e == 0) {
                            m25709q();
                        } else if (z10) {
                            m25710r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f29407e);
                            this.f29407e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            m25710r(d.TERMINATED);
        }

        /* renamed from: n */
        public final void m25706n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29410h.f29398e);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* renamed from: o */
        public final void m25707o(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: p */
        public final boolean m25708p() {
            boolean z10;
            boolean z11 = false;
            if (this.f29405c != d.CPU_ACQUIRED) {
                ExecutorC5119a executorC5119a = this.f29410h;
                while (true) {
                    long j10 = executorC5119a.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (ExecutorC5119a.f29392k.compareAndSet(executorC5119a, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    this.f29405c = d.CPU_ACQUIRED;
                }
                return z11;
            }
            z11 = true;
            return z11;
        }

        /* renamed from: q */
        public final void m25709q() {
            if (!m25701i()) {
                this.f29410h.m25692y(this);
                return;
            }
            this.workerCtl = -1;
            while (m25701i() && this.workerCtl == -1 && !this.f29410h.isTerminated() && this.f29405c != d.TERMINATED) {
                m25710r(d.PARKING);
                Thread.interrupted();
                m25703k();
            }
        }

        /* renamed from: r */
        public final boolean m25710r(@NotNull d dVar) {
            d dVar2 = this.f29405c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                ExecutorC5119a.f29392k.addAndGet(this.f29410h, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f29405c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m25705m();
        }

        /* renamed from: s */
        public final AbstractRunnableC5127i m25711s(boolean z10) {
            int i10 = (int) (this.f29410h.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int m25702j = m25702j(i10);
            ExecutorC5119a executorC5119a = this.f29410h;
            int i11 = 0;
            long j10 = Long.MAX_VALUE;
            while (true) {
                long j11 = j10;
                if (i11 >= i10) {
                    if (j11 == Long.MAX_VALUE) {
                        j11 = 0;
                    }
                    this.f29407e = j11;
                    return null;
                }
                int i12 = m25702j + 1;
                m25702j = i12;
                if (i12 > i10) {
                    m25702j = 1;
                }
                c cVar = executorC5119a.f29401h.get(m25702j);
                long j12 = j11;
                if (cVar != null) {
                    j12 = j11;
                    if (cVar != this) {
                        C5132n c5132n = this.f29404b;
                        C5132n c5132n2 = cVar.f29404b;
                        long m25731k = z10 ? c5132n.m25731k(c5132n2) : c5132n.m25732l(c5132n2);
                        if (m25731k == -1) {
                            return this.f29404b.m25728h();
                        }
                        j12 = j11;
                        if (m25731k > 0) {
                            j12 = Math.min(j11, m25731k);
                        }
                    } else {
                        continue;
                    }
                }
                i11++;
                j10 = j12;
            }
        }

        /* renamed from: t */
        public final void m25712t() {
            ExecutorC5119a executorC5119a = this.f29410h;
            synchronized (executorC5119a.f29401h) {
                if (executorC5119a.isTerminated()) {
                    return;
                }
                if (((int) (executorC5119a.controlState & 2097151)) <= executorC5119a.f29395b) {
                    return;
                }
                if (f29403i.compareAndSet(this, -1, 1)) {
                    int m25698f = m25698f();
                    m25706n(0);
                    executorC5119a.m25678B(this, m25698f, 0);
                    int andDecrement = (int) (ExecutorC5119a.f29392k.getAndDecrement(executorC5119a) & 2097151);
                    if (andDecrement != m25698f) {
                        c cVar = executorC5119a.f29401h.get(andDecrement);
                        C9367f.m39524c(cVar);
                        executorC5119a.f29401h.set(m25698f, cVar);
                        cVar.m25706n(m25698f);
                        executorC5119a.m25678B(cVar, andDecrement, m25698f);
                    }
                    executorC5119a.f29401h.set(andDecrement, null);
                    C5398q c5398q = C5398q.f30770a;
                    this.f29405c = d.TERMINATED;
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hi/a$d.class
     */
    /* renamed from: hi.a$d */
    /* loaded from: combined.jar:classes2.jar:hi/a$d.class */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public ExecutorC5119a(int i10, int i11, long j10, @NotNull String str) {
        this.f29395b = i10;
        this.f29396c = i11;
        this.f29397d = j10;
        this.f29398e = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f29399f = new C5122d();
        this.f29400g = new C5122d();
        this.parkedWorkersStack = 0L;
        this.f29401h = new AtomicReferenceArray<>(i11 + 1);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    /* renamed from: D0 */
    public static /* synthetic */ boolean m25675D0(ExecutorC5119a executorC5119a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = executorC5119a.controlState;
        }
        return executorC5119a.m25680C0(j10);
    }

    /* renamed from: t */
    public static /* synthetic */ void m25676t(ExecutorC5119a executorC5119a, Runnable runnable, InterfaceC5128j interfaceC5128j, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC5128j = C5125g.f29425b;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        executorC5119a.m25687q(runnable, interfaceC5128j, z10);
    }

    /* renamed from: A0 */
    public final void m25677A0() {
        if (m25681E0() || m25675D0(this, 0L, 1, null)) {
            return;
        }
        m25681E0();
    }

    /* renamed from: B */
    public final void m25678B(@NotNull c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            int i13 = i12;
            if (i12 == i10) {
                i13 = i11 == 0 ? m25689v(cVar) : i11;
            }
            if (i13 >= 0 && f29391j.compareAndSet(this, j10, ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152)) | i13)) {
                return;
            }
        }
    }

    /* renamed from: B0 */
    public final AbstractRunnableC5127i m25679B0(c cVar, AbstractRunnableC5127i abstractRunnableC5127i, boolean z10) {
        if (cVar != null && cVar.f29405c != d.TERMINATED) {
            if (abstractRunnableC5127i.f29428c.mo25718q0() == 0 && cVar.f29405c == d.BLOCKING) {
                return abstractRunnableC5127i;
            }
            cVar.f29409g = true;
            return cVar.f29404b.m25722a(abstractRunnableC5127i, z10);
        }
        return abstractRunnableC5127i;
    }

    /* renamed from: C0 */
    public final boolean m25680C0(long j10) {
        if (C10240e.m42834b(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) >= this.f29395b) {
            return false;
        }
        int m25683l = m25683l();
        if (m25683l == 1 && this.f29395b > 1) {
            m25683l();
        }
        return m25683l > 0;
    }

    /* renamed from: E0 */
    public final boolean m25681E0() {
        c m25691w;
        do {
            m25691w = m25691w();
            if (m25691w == null) {
                return false;
            }
        } while (!c.f29403i.compareAndSet(m25691w, -1, 0));
        LockSupport.unpark(m25691w);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m25688q0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        m25676t(this, runnable, null, false, 6, null);
    }

    /* renamed from: f */
    public final boolean m25682f(AbstractRunnableC5127i abstractRunnableC5127i) {
        boolean z10 = true;
        if (abstractRunnableC5127i.f29428c.mo25718q0() != 1) {
            z10 = false;
        }
        return (z10 ? this.f29400g : this.f29399f).m24775a(abstractRunnableC5127i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: l */
    public final int m25683l() {
        int i10;
        synchronized (this.f29401h) {
            if (isTerminated()) {
                i10 = -1;
            } else {
                long j10 = this.controlState;
                int i11 = (int) (j10 & 2097151);
                int m42834b = C10240e.m42834b(i11 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (m42834b >= this.f29395b) {
                    return 0;
                }
                if (i11 >= this.f29396c) {
                    return 0;
                }
                int i12 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i12 > 0 && this.f29401h.get(i12) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i12);
                this.f29401h.set(i12, cVar);
                boolean z10 = false;
                if (i12 == ((int) (2097151 & f29392k.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i10 = m42834b + 1;
            }
            return i10;
        }
    }

    @NotNull
    /* renamed from: o */
    public final AbstractRunnableC5127i m25684o(@NotNull Runnable runnable, @NotNull InterfaceC5128j interfaceC5128j) {
        long mo25719a = C5130l.f29435f.mo25719a();
        if (!(runnable instanceof AbstractRunnableC5127i)) {
            return new C5129k(runnable, mo25719a, interfaceC5128j);
        }
        AbstractRunnableC5127i abstractRunnableC5127i = (AbstractRunnableC5127i) runnable;
        abstractRunnableC5127i.f29427b = mo25719a;
        abstractRunnableC5127i.f29428c = interfaceC5128j;
        return abstractRunnableC5127i;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x000e -> B:3:0x0006). Please report as a decompilation issue!!! */
    /* renamed from: o0 */
    public final void m25685o0(@NotNull AbstractRunnableC5127i abstractRunnableC5127i) {
        try {
            abstractRunnableC5127i.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: p */
    public final c m25686p() {
        Thread currentThread = Thread.currentThread();
        c cVar = null;
        c cVar2 = currentThread instanceof c ? (c) currentThread : null;
        if (cVar2 != null && C9367f.m39522a(cVar2.f29410h, this)) {
            cVar = cVar2;
        }
        return cVar;
    }

    /* renamed from: q */
    public final void m25687q(@NotNull Runnable runnable, @NotNull InterfaceC5128j interfaceC5128j, boolean z10) {
        C4464c.m22637a();
        AbstractRunnableC5127i m25684o = m25684o(runnable, interfaceC5128j);
        c m25686p = m25686p();
        AbstractRunnableC5127i m25679B0 = m25679B0(m25686p, m25684o, z10);
        if (m25679B0 != null && !m25682f(m25679B0)) {
            throw new RejectedExecutionException(C9367f.m39532k(this.f29398e, " was terminated"));
        }
        boolean z11 = z10 && m25686p != null;
        if (m25684o.f29428c.mo25718q0() != 0) {
            m25690v0(z11);
        } else {
            if (z11) {
                return;
            }
            m25677A0();
        }
    }

    /* renamed from: q0 */
    public final void m25688q0(long j10) {
        int i10;
        if (f29393l.compareAndSet(this, 0, 1)) {
            c m25686p = m25686p();
            synchronized (this.f29401h) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVar = this.f29401h.get(i11);
                    C9367f.m39524c(cVar);
                    if (cVar != m25686p) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f29404b.m25727g(this.f29400g);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f29400g.m24776b();
            this.f29399f.m24776b();
            while (true) {
                AbstractRunnableC5127i m25697e = m25686p == null ? null : m25686p.m25697e(true);
                AbstractRunnableC5127i abstractRunnableC5127i = m25697e;
                if (m25697e == null) {
                    abstractRunnableC5127i = this.f29399f.m24778d();
                }
                AbstractRunnableC5127i abstractRunnableC5127i2 = abstractRunnableC5127i;
                if (abstractRunnableC5127i == null) {
                    AbstractRunnableC5127i m24778d = this.f29400g.m24778d();
                    abstractRunnableC5127i2 = m24778d;
                    if (m24778d == null) {
                        break;
                    }
                }
                m25685o0(abstractRunnableC5127i2);
            }
            if (m25686p != null) {
                m25686p.m25710r(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @NotNull
    public String toString() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int length = this.f29401h.length();
        int i16 = 0;
        int i17 = 0;
        if (1 < length) {
            int i18 = 0;
            int i19 = 0;
            i12 = 0;
            int i20 = 0;
            int i21 = 1;
            while (true) {
                int i22 = i21;
                int i23 = i22 + 1;
                c cVar = this.f29401h.get(i22);
                if (cVar == null) {
                    i14 = i17;
                    i11 = i18;
                    i15 = i19;
                    i13 = i20;
                } else {
                    int m25726f = cVar.f29404b.m25726f();
                    int i24 = b.f29402a[cVar.f29405c.ordinal()];
                    if (i24 != 1) {
                        if (i24 == 2) {
                            i11 = i18 + 1;
                            sb2 = new StringBuilder();
                            sb2.append(m25726f);
                            c10 = 'b';
                        } else if (i24 == 3) {
                            i19++;
                            sb2 = new StringBuilder();
                            sb2.append(m25726f);
                            c10 = 'c';
                            i11 = i18;
                        } else if (i24 == 4) {
                            int i25 = i12 + 1;
                            i14 = i17;
                            i11 = i18;
                            i15 = i19;
                            i12 = i25;
                            i13 = i20;
                            if (m25726f > 0) {
                                sb2 = new StringBuilder();
                                sb2.append(m25726f);
                                c10 = 'd';
                                i11 = i18;
                                i12 = i25;
                            }
                        } else if (i24 != 5) {
                            i14 = i17;
                            i11 = i18;
                            i15 = i19;
                            i13 = i20;
                        } else {
                            i13 = i20 + 1;
                            i14 = i17;
                            i11 = i18;
                            i15 = i19;
                        }
                        sb2.append(c10);
                        arrayList.add(sb2.toString());
                        i14 = i17;
                        i15 = i19;
                        i13 = i20;
                    } else {
                        i14 = i17 + 1;
                        i13 = i20;
                        i15 = i19;
                        i11 = i18;
                    }
                }
                if (i23 >= length) {
                    break;
                }
                i17 = i14;
                i18 = i11;
                i19 = i15;
                i20 = i13;
                i21 = i23;
            }
            i10 = i14;
            i16 = i15;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        long j10 = this.controlState;
        return this.f29398e + '@' + C4483i0.m22671b(this) + "[Pool Size {core = " + this.f29395b + ", max = " + this.f29396c + "}, Worker States {CPU = " + i16 + ", blocking = " + i11 + ", parked = " + i10 + ", dormant = " + i12 + ", terminated = " + i13 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f29399f.m24777c() + ", global blocking queue size = " + this.f29400g.m24777c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f29395b - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: v */
    public final int m25689v(c cVar) {
        int m25698f;
        do {
            Object m25699g = cVar.m25699g();
            if (m25699g == f29394m) {
                return -1;
            }
            if (m25699g == null) {
                return 0;
            }
            cVar = (c) m25699g;
            m25698f = cVar.m25698f();
        } while (m25698f == 0);
        return m25698f;
    }

    /* renamed from: v0 */
    public final void m25690v0(boolean z10) {
        long addAndGet = f29392k.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        if (z10 || m25681E0() || m25680C0(addAndGet)) {
            return;
        }
        m25681E0();
    }

    /* renamed from: w */
    public final c m25691w() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c cVar = this.f29401h.get((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            int m25689v = m25689v(cVar);
            if (m25689v >= 0 && f29391j.compareAndSet(this, j10, m25689v | ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152)))) {
                cVar.m25707o(f29394m);
                return cVar;
            }
        }
    }

    /* renamed from: y */
    public final boolean m25692y(@NotNull c cVar) {
        long j10;
        int m25698f;
        if (cVar.m25699g() != f29394m) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            int i10 = (int) (2097151 & j10);
            m25698f = cVar.m25698f();
            cVar.m25707o(this.f29401h.get(i10));
        } while (!f29391j.compareAndSet(this, j10, ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152)) | m25698f));
        return true;
    }
}
