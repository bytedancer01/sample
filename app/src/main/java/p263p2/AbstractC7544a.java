package p263p2;

import com.journeyapps.barcodescanner.C2582b;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import lc.InterfaceFutureC5838a;
import p313s.C8490b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p2/a.class
 */
/* renamed from: p2.a */
/* loaded from: combined.jar:classes1.jar:p2/a.class */
public abstract class AbstractC7544a<V> implements InterfaceFutureC5838a<V> {

    /* renamed from: e */
    public static final boolean f36387e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f36388f = Logger.getLogger(AbstractC7544a.class.getName());

    /* renamed from: g */
    public static final b f36389g;

    /* renamed from: h */
    public static final Object f36390h;

    /* renamed from: b */
    public volatile Object f36391b;

    /* renamed from: c */
    public volatile e f36392c;

    /* renamed from: d */
    public volatile i f36393d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$b.class
     */
    /* renamed from: p2.a$b */
    /* loaded from: combined.jar:classes1.jar:p2/a$b.class */
    public static abstract class b {
        public b() {
        }

        /* renamed from: a */
        public abstract boolean mo32295a(AbstractC7544a<?> abstractC7544a, e eVar, e eVar2);

        /* renamed from: b */
        public abstract boolean mo32296b(AbstractC7544a<?> abstractC7544a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo32297c(AbstractC7544a<?> abstractC7544a, i iVar, i iVar2);

        /* renamed from: d */
        public abstract void mo32298d(i iVar, i iVar2);

        /* renamed from: e */
        public abstract void mo32299e(i iVar, Thread thread);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$c.class
     */
    /* renamed from: p2.a$c */
    /* loaded from: combined.jar:classes1.jar:p2/a$c.class */
    public static final class c {

        /* renamed from: c */
        public static final c f36394c;

        /* renamed from: d */
        public static final c f36395d;

        /* renamed from: a */
        public final boolean f36396a;

        /* renamed from: b */
        public final Throwable f36397b;

        static {
            if (AbstractC7544a.f36387e) {
                f36395d = null;
                f36394c = null;
            } else {
                f36395d = new c(false, null);
                f36394c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f36396a = z10;
            this.f36397b = th2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$d.class
     */
    /* renamed from: p2.a$d */
    /* loaded from: combined.jar:classes1.jar:p2/a$d.class */
    public static final class d {

        /* renamed from: b */
        public static final d f36398b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f36399a;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:p2/a$d$a.class
         */
        /* renamed from: p2.a$d$a */
        /* loaded from: combined.jar:classes1.jar:p2/a$d$a.class */
        public class a extends Throwable {
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
            this.f36399a = (Throwable) AbstractC7544a.m32278e(th2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$e.class
     */
    /* renamed from: p2.a$e */
    /* loaded from: combined.jar:classes1.jar:p2/a$e.class */
    public static final class e {

        /* renamed from: d */
        public static final e f36400d = new e(null, null);

        /* renamed from: a */
        public final Runnable f36401a;

        /* renamed from: b */
        public final Executor f36402b;

        /* renamed from: c */
        public e f36403c;

        public e(Runnable runnable, Executor executor) {
            this.f36401a = runnable;
            this.f36402b = executor;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$f.class
     */
    /* renamed from: p2.a$f */
    /* loaded from: combined.jar:classes1.jar:p2/a$f.class */
    public static final class f extends b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f36404a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f36405b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC7544a, i> f36406c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC7544a, e> f36407d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC7544a, Object> f36408e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC7544a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC7544a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC7544a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f36404a = atomicReferenceFieldUpdater;
            this.f36405b = atomicReferenceFieldUpdater2;
            this.f36406c = atomicReferenceFieldUpdater3;
            this.f36407d = atomicReferenceFieldUpdater4;
            this.f36408e = atomicReferenceFieldUpdater5;
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: a */
        public boolean mo32295a(AbstractC7544a<?> abstractC7544a, e eVar, e eVar2) {
            return C8490b.m36639a(this.f36407d, abstractC7544a, eVar, eVar2);
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: b */
        public boolean mo32296b(AbstractC7544a<?> abstractC7544a, Object obj, Object obj2) {
            return C8490b.m36639a(this.f36408e, abstractC7544a, obj, obj2);
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: c */
        public boolean mo32297c(AbstractC7544a<?> abstractC7544a, i iVar, i iVar2) {
            return C8490b.m36639a(this.f36406c, abstractC7544a, iVar, iVar2);
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: d */
        public void mo32298d(i iVar, i iVar2) {
            this.f36405b.lazySet(iVar, iVar2);
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: e */
        public void mo32299e(i iVar, Thread thread) {
            this.f36404a.lazySet(iVar, thread);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$g.class
     */
    /* renamed from: p2.a$g */
    /* loaded from: combined.jar:classes1.jar:p2/a$g.class */
    public static final class g<V> implements Runnable {

        /* renamed from: b */
        public final AbstractC7544a<V> f36409b;

        /* renamed from: c */
        public final InterfaceFutureC5838a<? extends V> f36410c;

        public g(AbstractC7544a<V> abstractC7544a, InterfaceFutureC5838a<? extends V> interfaceFutureC5838a) {
            this.f36409b = abstractC7544a;
            this.f36410c = interfaceFutureC5838a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36409b.f36391b != this) {
                return;
            }
            if (AbstractC7544a.f36389g.mo32296b(this.f36409b, this, AbstractC7544a.m32281j(this.f36410c))) {
                AbstractC7544a.m32279g(this.f36409b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$h.class
     */
    /* renamed from: p2.a$h */
    /* loaded from: combined.jar:classes1.jar:p2/a$h.class */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: a */
        public boolean mo32295a(AbstractC7544a<?> abstractC7544a, e eVar, e eVar2) {
            synchronized (abstractC7544a) {
                if (abstractC7544a.f36392c != eVar) {
                    return false;
                }
                abstractC7544a.f36392c = eVar2;
                return true;
            }
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: b */
        public boolean mo32296b(AbstractC7544a<?> abstractC7544a, Object obj, Object obj2) {
            synchronized (abstractC7544a) {
                if (abstractC7544a.f36391b != obj) {
                    return false;
                }
                abstractC7544a.f36391b = obj2;
                return true;
            }
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: c */
        public boolean mo32297c(AbstractC7544a<?> abstractC7544a, i iVar, i iVar2) {
            synchronized (abstractC7544a) {
                if (abstractC7544a.f36393d != iVar) {
                    return false;
                }
                abstractC7544a.f36393d = iVar2;
                return true;
            }
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: d */
        public void mo32298d(i iVar, i iVar2) {
            iVar.f36413b = iVar2;
        }

        @Override // p263p2.AbstractC7544a.b
        /* renamed from: e */
        public void mo32299e(i iVar, Thread thread) {
            iVar.f36412a = thread;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p2/a$i.class
     */
    /* renamed from: p2.a$i */
    /* loaded from: combined.jar:classes1.jar:p2/a$i.class */
    public static final class i {

        /* renamed from: c */
        public static final i f36411c = new i(false);

        /* renamed from: a */
        public volatile Thread f36412a;

        /* renamed from: b */
        public volatile i f36413b;

        public i() {
            AbstractC7544a.f36389g.mo32299e(this, Thread.currentThread());
        }

        public i(boolean z10) {
        }

        /* renamed from: a */
        public void m32300a(i iVar) {
            AbstractC7544a.f36389g.mo32298d(this, iVar);
        }

        /* renamed from: b */
        public void m32301b() {
            Thread thread = this.f36412a;
            if (thread != null) {
                this.f36412a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, C2582b.f15902o), AtomicReferenceFieldUpdater.newUpdater(AbstractC7544a.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7544a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC7544a.class, Object.class, C2582b.f15902o));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f36389g = hVar;
        if (th != null) {
            f36388f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f36390h = new Object();
    }

    /* renamed from: d */
    public static CancellationException m32277d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: e */
    public static <T> T m32278e(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: g */
    public static void m32279g(AbstractC7544a<?> abstractC7544a) {
        AbstractC7544a<?> abstractC7544a2 = abstractC7544a;
        e eVar = null;
        while (true) {
            abstractC7544a2.m32289n();
            abstractC7544a2.m32284c();
            e m32285f = abstractC7544a2.m32285f(eVar);
            while (true) {
                e eVar2 = m32285f;
                if (eVar2 == null) {
                    return;
                }
                eVar = eVar2.f36403c;
                Runnable runnable = eVar2.f36401a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC7544a2 = gVar.f36409b;
                    if (abstractC7544a2.f36391b == gVar) {
                        if (f36389g.mo32296b(abstractC7544a2, gVar, m32281j(gVar.f36410c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m32280h(runnable, eVar2.f36402b);
                }
                m32285f = eVar;
            }
        }
    }

    /* renamed from: h */
    public static void m32280h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f36388f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* renamed from: j */
    public static Object m32281j(InterfaceFutureC5838a<?> interfaceFutureC5838a) {
        if (interfaceFutureC5838a instanceof AbstractC7544a) {
            Object obj = ((AbstractC7544a) interfaceFutureC5838a).f36391b;
            Object obj2 = obj;
            if (obj instanceof c) {
                c cVar = (c) obj;
                obj2 = obj;
                if (cVar.f36396a) {
                    obj2 = cVar.f36397b != null ? new c(false, cVar.f36397b) : c.f36395d;
                }
            }
            return obj2;
        }
        boolean isCancelled = interfaceFutureC5838a.isCancelled();
        if ((!f36387e) && isCancelled) {
            return c.f36395d;
        }
        try {
            Object m32282k = m32282k(interfaceFutureC5838a);
            Object obj3 = m32282k;
            if (m32282k == null) {
                obj3 = f36390h;
            }
            return obj3;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC5838a, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    /* renamed from: k */
    public static <V> V m32282k(Future<V> future) {
        boolean z10;
        V v10;
        boolean z11 = false;
        while (true) {
            try {
                z10 = z11;
                v10 = future.get();
                break;
            } catch (InterruptedException e10) {
                z11 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @Override // lc.InterfaceFutureC5838a
    /* renamed from: a */
    public final void mo23123a(Runnable runnable, Executor executor) {
        e eVar;
        m32278e(runnable);
        m32278e(executor);
        e eVar2 = this.f36392c;
        if (eVar2 != e.f36400d) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f36403c = eVar2;
                if (f36389g.mo32295a(this, eVar2, eVar3)) {
                    return;
                }
                eVar = this.f36392c;
                eVar2 = eVar;
            } while (eVar != e.f36400d);
        }
        m32280h(runnable, executor);
    }

    /* renamed from: b */
    public final void m32283b(StringBuilder sb2) {
        String str = "]";
        try {
            Object m32282k = m32282k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m32294s(m32282k));
            sb2.append("]");
        } catch (CancellationException e10) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append(str);
        }
    }

    /* renamed from: c */
    public void m32284c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        Object obj = this.f36391b;
        if ((obj == null) || (obj instanceof g)) {
            c cVar = f36387e ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f36394c : c.f36395d;
            z11 = false;
            AbstractC7544a<V> abstractC7544a = this;
            while (true) {
                if (f36389g.mo32296b(abstractC7544a, obj, cVar)) {
                    if (z10) {
                        abstractC7544a.m32287l();
                    }
                    m32279g(abstractC7544a);
                    z11 = true;
                    if (!(obj instanceof g)) {
                        break;
                    }
                    InterfaceFutureC5838a<? extends V> interfaceFutureC5838a = ((g) obj).f36410c;
                    if (!(interfaceFutureC5838a instanceof AbstractC7544a)) {
                        interfaceFutureC5838a.cancel(z10);
                        z11 = true;
                        break;
                    }
                    abstractC7544a = (AbstractC7544a) interfaceFutureC5838a;
                    obj = abstractC7544a.f36391b;
                    z11 = true;
                    if (!(obj == null) && !(obj instanceof g)) {
                        break;
                    }
                    z11 = true;
                } else {
                    Object obj2 = abstractC7544a.f36391b;
                    obj = obj2;
                    if (!(obj2 instanceof g)) {
                        break;
                    }
                }
            }
        } else {
            z11 = false;
        }
        return z11;
    }

    /* renamed from: f */
    public final e m32285f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f36392c;
        } while (!f36389g.mo32295a(this, eVar2, e.f36400d));
        while (true) {
            e eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                return eVar3;
            }
            eVar2 = eVar.f36403c;
            eVar.f36403c = eVar3;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        i iVar;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f36391b;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m32286i(obj2);
        }
        i iVar2 = this.f36393d;
        if (iVar2 != i.f36411c) {
            i iVar3 = new i();
            do {
                iVar3.m32300a(iVar2);
                if (f36389g.mo32297c(this, iVar2, iVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m32290o(iVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f36391b;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m32286i(obj);
                }
                iVar = this.f36393d;
                iVar2 = iVar;
            } while (iVar != i.f36411c);
        }
        return m32286i(this.f36391b);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        i iVar;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f36391b;
        if ((obj != null) && (!(obj instanceof g))) {
            return m32286i(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        long j11 = nanos;
        if (nanos >= 1000) {
            i iVar2 = this.f36393d;
            if (iVar2 != i.f36411c) {
                i iVar3 = new i();
                do {
                    iVar3.m32300a(iVar2);
                    if (f36389g.mo32297c(this, iVar2, iVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m32290o(iVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f36391b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m32286i(obj2);
                            }
                            j11 = nanoTime - System.nanoTime();
                            nanos = j11;
                        } while (j11 >= 1000);
                        m32290o(iVar3);
                    } else {
                        iVar = this.f36393d;
                        iVar2 = iVar;
                    }
                } while (iVar != i.f36411c);
            }
            return m32286i(this.f36391b);
        }
        while (j11 > 0) {
            Object obj3 = this.f36391b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m32286i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j11 = nanoTime - System.nanoTime();
        }
        String abstractC7544a = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        String str2 = str;
        if (j11 + 1000 < 0) {
            String str3 = str + " (plus ";
            long j12 = -j11;
            long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            String str4 = str3;
            if (convert > 0) {
                String str5 = str3 + convert + " " + lowerCase;
                String str6 = str5;
                if (z10) {
                    str6 = str5 + ",";
                }
                str4 = str6 + " ";
            }
            String str7 = str4;
            if (z10) {
                str7 = str4 + nanos2 + " nanoseconds ";
            }
            str2 = str7 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str2 + " but future completed as timeout expired");
        }
        throw new TimeoutException(str2 + " for " + abstractC7544a);
    }

    /* renamed from: i */
    public final V m32286i(Object obj) {
        if (obj instanceof c) {
            throw m32277d("Task was cancelled.", ((c) obj).f36397b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f36399a);
        }
        Object obj2 = obj;
        if (obj == f36390h) {
            obj2 = null;
        }
        return (V) obj2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36391b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f36391b != null);
    }

    /* renamed from: l */
    public void m32287l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public String m32288m() {
        Object obj = this.f36391b;
        if (obj instanceof g) {
            return "setFuture=[" + m32294s(((g) obj).f36410c) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: n */
    public final void m32289n() {
        i iVar;
        do {
            iVar = this.f36393d;
        } while (!f36389g.mo32297c(this, iVar, i.f36411c));
        while (iVar != null) {
            iVar.m32301b();
            iVar = iVar.f36413b;
        }
    }

    /* renamed from: o */
    public final void m32290o(i iVar) {
        i iVar2;
        iVar.f36412a = null;
        while (true) {
            i iVar3 = this.f36393d;
            if (iVar3 == i.f36411c) {
                return;
            }
            i iVar4 = null;
            while (true) {
                i iVar5 = iVar4;
                if (iVar3 == null) {
                    return;
                }
                i iVar6 = iVar3.f36413b;
                if (iVar3.f36412a != null) {
                    iVar2 = iVar3;
                } else if (iVar5 != null) {
                    iVar5.f36413b = iVar6;
                    iVar2 = iVar5;
                    if (iVar5.f36412a == null) {
                        break;
                    }
                } else {
                    iVar2 = iVar5;
                    if (!f36389g.mo32297c(this, iVar3, iVar6)) {
                        break;
                    }
                }
                iVar3 = iVar6;
                iVar4 = iVar2;
            }
        }
    }

    /* renamed from: p */
    public boolean mo32291p(V v10) {
        Object obj = v10;
        if (v10 == null) {
            obj = f36390h;
        }
        if (!f36389g.mo32296b(this, null, obj)) {
            return false;
        }
        m32279g(this);
        return true;
    }

    /* renamed from: q */
    public boolean mo32292q(Throwable th2) {
        if (!f36389g.mo32296b(this, null, new d((Throwable) m32278e(th2)))) {
            return false;
        }
        m32279g(this);
        return true;
    }

    /* renamed from: r */
    public boolean mo32293r(InterfaceFutureC5838a<? extends V> interfaceFutureC5838a) {
        d dVar;
        m32278e(interfaceFutureC5838a);
        Object obj = this.f36391b;
        Object obj2 = obj;
        if (obj == null) {
            if (interfaceFutureC5838a.isDone()) {
                if (!f36389g.mo32296b(this, null, m32281j(interfaceFutureC5838a))) {
                    return false;
                }
                m32279g(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC5838a);
            if (f36389g.mo32296b(this, null, gVar)) {
                try {
                    interfaceFutureC5838a.mo23123a(gVar, EnumC7545b.INSTANCE);
                    return true;
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable th3) {
                        dVar = d.f36398b;
                    }
                    f36389g.mo32296b(this, gVar, dVar);
                    return true;
                }
            }
            obj2 = this.f36391b;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        interfaceFutureC5838a.cancel(((c) obj2).f36396a);
        return false;
    }

    /* renamed from: s */
    public final String m32294s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = m32288m();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb2.append("PENDING, info=[");
                    sb2.append(str);
                    sb2.append("]");
                    sb2.append("]");
                    return sb2.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            m32283b(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
