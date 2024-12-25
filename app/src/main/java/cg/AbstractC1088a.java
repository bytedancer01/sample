package cg;

import com.journeyapps.barcodescanner.C2582b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p313s.C8490b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/a.class
 */
/* renamed from: cg.a */
/* loaded from: combined.jar:classes2.jar:cg/a.class */
public abstract class AbstractC1088a<V> implements InterfaceFutureC1097j<V> {

    /* renamed from: e */
    public static final boolean f7264e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f7265f = Logger.getLogger(AbstractC1088a.class.getName());

    /* renamed from: g */
    public static final b f7266g;

    /* renamed from: h */
    public static final Object f7267h;

    /* renamed from: b */
    public volatile Object f7268b;

    /* renamed from: c */
    public volatile e f7269c;

    /* renamed from: d */
    public volatile j f7270d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$b.class
     */
    /* renamed from: cg.a$b */
    /* loaded from: combined.jar:classes2.jar:cg/a$b.class */
    public static abstract class b {
        public b() {
        }

        /* renamed from: a */
        public abstract boolean mo6503a(AbstractC1088a<?> abstractC1088a, e eVar, e eVar2);

        /* renamed from: b */
        public abstract boolean mo6504b(AbstractC1088a<?> abstractC1088a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo6505c(AbstractC1088a<?> abstractC1088a, j jVar, j jVar2);

        /* renamed from: d */
        public abstract void mo6506d(j jVar, j jVar2);

        /* renamed from: e */
        public abstract void mo6507e(j jVar, Thread thread);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$c.class
     */
    /* renamed from: cg.a$c */
    /* loaded from: combined.jar:classes2.jar:cg/a$c.class */
    public static final class c {

        /* renamed from: a */
        public final boolean f7271a;

        /* renamed from: b */
        public final Throwable f7272b;

        public c(boolean z10, Throwable th2) {
            this.f7271a = z10;
            this.f7272b = th2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$d.class
     */
    /* renamed from: cg.a$d */
    /* loaded from: combined.jar:classes2.jar:cg/a$d.class */
    public static final class d {

        /* renamed from: b */
        public static final d f7273b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f7274a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/a$d$a.class
         */
        /* renamed from: cg.a$d$a */
        /* loaded from: combined.jar:classes2.jar:cg/a$d$a.class */
        public final class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        }

        public d(Throwable th2) {
            this.f7274a = (Throwable) C1102o.m6665a(th2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$e.class
     */
    /* renamed from: cg.a$e */
    /* loaded from: combined.jar:classes2.jar:cg/a$e.class */
    public static final class e {

        /* renamed from: d */
        public static final e f7275d = new e(null, null);

        /* renamed from: a */
        public final Runnable f7276a;

        /* renamed from: b */
        public final Executor f7277b;

        /* renamed from: c */
        public e f7278c;

        public e(Runnable runnable, Executor executor) {
            this.f7276a = runnable;
            this.f7277b = executor;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$f.class
     */
    /* renamed from: cg.a$f */
    /* loaded from: combined.jar:classes2.jar:cg/a$f.class */
    public static final class f extends b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<j, Thread> f7279a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<j, j> f7280b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC1088a, j> f7281c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC1088a, e> f7282d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC1088a, Object> f7283e;

        public f(AtomicReferenceFieldUpdater<j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<j, j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC1088a, j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC1088a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC1088a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f7279a = atomicReferenceFieldUpdater;
            this.f7280b = atomicReferenceFieldUpdater2;
            this.f7281c = atomicReferenceFieldUpdater3;
            this.f7282d = atomicReferenceFieldUpdater4;
            this.f7283e = atomicReferenceFieldUpdater5;
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: a */
        public boolean mo6503a(AbstractC1088a<?> abstractC1088a, e eVar, e eVar2) {
            return C8490b.m36639a(this.f7282d, abstractC1088a, eVar, eVar2);
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: b */
        public boolean mo6504b(AbstractC1088a<?> abstractC1088a, Object obj, Object obj2) {
            return C8490b.m36639a(this.f7283e, abstractC1088a, obj, obj2);
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: c */
        public boolean mo6505c(AbstractC1088a<?> abstractC1088a, j jVar, j jVar2) {
            return C8490b.m36639a(this.f7281c, abstractC1088a, jVar, jVar2);
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: d */
        public void mo6506d(j jVar, j jVar2) {
            this.f7280b.lazySet(jVar, jVar2);
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: e */
        public void mo6507e(j jVar, Thread thread) {
            this.f7279a.lazySet(jVar, thread);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$g.class
     */
    /* renamed from: cg.a$g */
    /* loaded from: combined.jar:classes2.jar:cg/a$g.class */
    public final class g implements Runnable {

        /* renamed from: b */
        public final InterfaceFutureC1097j<? extends V> f7284b;

        /* renamed from: c */
        public final AbstractC1088a f7285c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7285c.f7268b != this) {
                return;
            }
            this.f7285c.m6496n(this.f7284b, this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$h.class
     */
    /* renamed from: cg.a$h */
    /* loaded from: combined.jar:classes2.jar:cg/a$h.class */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: a */
        public boolean mo6503a(AbstractC1088a<?> abstractC1088a, e eVar, e eVar2) {
            synchronized (abstractC1088a) {
                if (abstractC1088a.f7269c != eVar) {
                    return false;
                }
                abstractC1088a.f7269c = eVar2;
                return true;
            }
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: b */
        public boolean mo6504b(AbstractC1088a<?> abstractC1088a, Object obj, Object obj2) {
            synchronized (abstractC1088a) {
                if (abstractC1088a.f7268b != obj) {
                    return false;
                }
                abstractC1088a.f7268b = obj2;
                return true;
            }
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: c */
        public boolean mo6505c(AbstractC1088a<?> abstractC1088a, j jVar, j jVar2) {
            synchronized (abstractC1088a) {
                if (abstractC1088a.f7270d != jVar) {
                    return false;
                }
                abstractC1088a.f7270d = jVar2;
                return true;
            }
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: d */
        public void mo6506d(j jVar, j jVar2) {
            jVar.f7288b = jVar2;
        }

        @Override // cg.AbstractC1088a.b
        /* renamed from: e */
        public void mo6507e(j jVar, Thread thread) {
            jVar.f7287a = thread;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$i.class
     */
    /* renamed from: cg.a$i */
    /* loaded from: combined.jar:classes2.jar:cg/a$i.class */
    public static abstract class i<V> extends AbstractC1088a<V> {
        @Override // cg.AbstractC1088a, cg.InterfaceFutureC1097j
        /* renamed from: a */
        public final void mo6492a(Runnable runnable, Executor executor) {
            super.mo6492a(runnable, executor);
        }

        @Override // cg.AbstractC1088a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // cg.AbstractC1088a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }

        @Override // cg.AbstractC1088a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // cg.AbstractC1088a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/a$j.class
     */
    /* renamed from: cg.a$j */
    /* loaded from: combined.jar:classes2.jar:cg/a$j.class */
    public static final class j {

        /* renamed from: c */
        public static final j f7286c = new j(false);

        /* renamed from: a */
        public volatile Thread f7287a;

        /* renamed from: b */
        public volatile j f7288b;

        public j() {
            AbstractC1088a.f7266g.mo6507e(this, Thread.currentThread());
        }

        public j(boolean z10) {
        }

        /* renamed from: a */
        public void m6508a(j jVar) {
            AbstractC1088a.f7266g.mo6506d(this, jVar);
        }

        /* renamed from: b */
        public void m6509b() {
            Thread thread = this.f7287a;
            if (thread != null) {
                this.f7287a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(j.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(j.class, j.class, C2582b.f15902o), AtomicReferenceFieldUpdater.newUpdater(AbstractC1088a.class, j.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1088a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1088a.class, Object.class, C2582b.f15902o));
        } catch (Throwable th2) {
            Logger logger = f7265f;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!");
            logger.log(level, "SafeAtomicHelper is broken!", th2);
            hVar = new h();
        }
        f7266g = hVar;
        f7267h = new Object();
    }

    /* renamed from: j */
    static final CancellationException m6489j(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: p */
    public static void m6490p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f7265f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* renamed from: q */
    private V m6491q(Object obj) {
        if (obj instanceof c) {
            throw m6489j("Task was cancelled.", ((c) obj).f7272b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f7274a);
        }
        Object obj2 = obj;
        if (obj == f7267h) {
            obj2 = null;
        }
        return (V) obj2;
    }

    @Override // cg.InterfaceFutureC1097j
    /* renamed from: a */
    public void mo6492a(Runnable runnable, Executor executor) {
        e eVar;
        C1102o.m6666b(runnable, "Runnable was null.");
        C1102o.m6666b(executor, "Executor was null.");
        e eVar2 = this.f7269c;
        if (eVar2 != e.f7275d) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f7278c = eVar2;
                if (f7266g.mo6503a(this, eVar2, eVar3)) {
                    return;
                }
                eVar = this.f7269c;
                eVar2 = eVar;
            } while (eVar != e.f7275d);
        }
        m6490p(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Object obj = this.f7268b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = new c(z10, f7264e ? m6499s() : null);
        Object obj2 = obj;
        while (!f7266g.mo6504b(this, obj2, cVar)) {
            Object obj3 = this.f7268b;
            obj2 = obj3;
            if (!(obj3 instanceof g)) {
                return false;
            }
        }
        if (z10) {
            m6498r();
        }
        m6495m();
        if (!(obj2 instanceof g)) {
            return true;
        }
        ((g) obj2).f7284b.cancel(z10);
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        j jVar;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7268b;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m6491q(obj2);
        }
        j jVar2 = this.f7270d;
        if (jVar2 != j.f7286c) {
            j jVar3 = new j();
            do {
                jVar3.m6508a(jVar2);
                if (f7266g.mo6505c(this, jVar2, jVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m6500t(jVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f7268b;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m6491q(obj);
                }
                jVar = this.f7270d;
                jVar2 = jVar;
            } while (jVar != j.f7286c);
        }
        return m6491q(this.f7268b);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        j jVar;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7268b;
        if ((obj != null) && (!(obj instanceof g))) {
            return m6491q(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        long j11 = nanos;
        if (nanos >= 1000) {
            j jVar2 = this.f7270d;
            if (jVar2 != j.f7286c) {
                j jVar3 = new j();
                do {
                    jVar3.m6508a(jVar2);
                    if (f7266g.mo6505c(this, jVar2, jVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m6500t(jVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7268b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m6491q(obj2);
                            }
                            j11 = nanoTime - System.nanoTime();
                            nanos = j11;
                        } while (j11 >= 1000);
                        m6500t(jVar3);
                    } else {
                        jVar = this.f7270d;
                        jVar2 = jVar;
                    }
                } while (jVar != j.f7286c);
            }
            return m6491q(this.f7268b);
        }
        while (j11 > 0) {
            Object obj3 = this.f7268b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m6491q(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j11 = nanoTime - System.nanoTime();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f7268b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f7268b != null);
    }

    /* renamed from: k */
    public final e m6493k() {
        e eVar;
        do {
            eVar = this.f7269c;
        } while (!f7266g.mo6503a(this, eVar, e.f7275d));
        return eVar;
    }

    /* renamed from: l */
    public final j m6494l() {
        j jVar;
        do {
            jVar = this.f7270d;
        } while (!f7266g.mo6505c(this, jVar, j.f7286c));
        return jVar;
    }

    /* renamed from: m */
    public final void m6495m() {
        e eVar;
        j m6494l = m6494l();
        while (true) {
            j jVar = m6494l;
            if (jVar == null) {
                break;
            }
            jVar.m6509b();
            m6494l = jVar.f7288b;
        }
        e m6493k = m6493k();
        e eVar2 = null;
        while (true) {
            if (m6493k == null) {
                break;
            }
            e eVar3 = m6493k.f7278c;
            m6493k.f7278c = eVar2;
            eVar2 = m6493k;
            m6493k = eVar3;
        }
        for (eVar = eVar2; eVar != null; eVar = eVar.f7278c) {
            m6490p(eVar.f7276a, eVar.f7277b);
        }
        m6497o();
    }

    /* renamed from: n */
    public final boolean m6496n(InterfaceFutureC1097j<? extends V> interfaceFutureC1097j, Object obj) {
        Object dVar;
        if (interfaceFutureC1097j instanceof i) {
            dVar = ((AbstractC1088a) interfaceFutureC1097j).f7268b;
        } else {
            try {
                Object m6677a = C1109v.m6677a(interfaceFutureC1097j);
                dVar = m6677a;
                if (m6677a == null) {
                    dVar = f7267h;
                }
            } catch (CancellationException e10) {
                dVar = new c(false, e10);
            } catch (ExecutionException e11) {
                dVar = new d(e11.getCause());
            } catch (Throwable th2) {
                dVar = new d(th2);
            }
        }
        if (!f7266g.mo6504b(this, obj, dVar)) {
            return false;
        }
        m6495m();
        return true;
    }

    /* renamed from: o */
    void m6497o() {
    }

    /* renamed from: r */
    public void m6498r() {
    }

    /* renamed from: s */
    public final Throwable m6499s() {
        return new CancellationException("Future.cancel() was called.");
    }

    /* renamed from: t */
    public final void m6500t(j jVar) {
        j jVar2;
        jVar.f7287a = null;
        while (true) {
            j jVar3 = this.f7270d;
            if (jVar3 == j.f7286c) {
                return;
            }
            j jVar4 = null;
            while (true) {
                j jVar5 = jVar4;
                if (jVar3 == null) {
                    return;
                }
                j jVar6 = jVar3.f7288b;
                if (jVar3.f7287a != null) {
                    jVar2 = jVar3;
                } else if (jVar5 != null) {
                    jVar5.f7288b = jVar6;
                    jVar2 = jVar5;
                    if (jVar5.f7287a == null) {
                        break;
                    }
                } else {
                    jVar2 = jVar5;
                    if (!f7266g.mo6505c(this, jVar3, jVar6)) {
                        break;
                    }
                }
                jVar3 = jVar6;
                jVar4 = jVar2;
            }
        }
    }

    /* renamed from: u */
    public boolean mo6501u(V v10) {
        Object obj = v10;
        if (v10 == null) {
            obj = f7267h;
        }
        if (!f7266g.mo6504b(this, null, obj)) {
            return false;
        }
        m6495m();
        return true;
    }

    /* renamed from: v */
    public boolean mo6502v(Throwable th2) {
        if (!f7266g.mo6504b(this, null, new d((Throwable) C1102o.m6665a(th2)))) {
            return false;
        }
        m6495m();
        return true;
    }
}
