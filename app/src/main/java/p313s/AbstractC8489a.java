package p313s;

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

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s/a.class
 */
/* renamed from: s.a */
/* loaded from: combined.jar:classes1.jar:s/a.class */
public abstract class AbstractC8489a<V> implements InterfaceFutureC5838a<V> {

    /* renamed from: e */
    public static final boolean f39793e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f39794f = Logger.getLogger(AbstractC8489a.class.getName());

    /* renamed from: g */
    public static final b f39795g;

    /* renamed from: h */
    public static final Object f39796h;

    /* renamed from: b */
    public volatile Object f39797b;

    /* renamed from: c */
    public volatile e f39798c;

    /* renamed from: d */
    public volatile i f39799d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$b.class
     */
    /* renamed from: s.a$b */
    /* loaded from: combined.jar:classes1.jar:s/a$b.class */
    public static abstract class b {
        public b() {
        }

        /* renamed from: a */
        public abstract boolean mo36632a(AbstractC8489a<?> abstractC8489a, e eVar, e eVar2);

        /* renamed from: b */
        public abstract boolean mo36633b(AbstractC8489a<?> abstractC8489a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo36634c(AbstractC8489a<?> abstractC8489a, i iVar, i iVar2);

        /* renamed from: d */
        public abstract void mo36635d(i iVar, i iVar2);

        /* renamed from: e */
        public abstract void mo36636e(i iVar, Thread thread);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$c.class
     */
    /* renamed from: s.a$c */
    /* loaded from: combined.jar:classes1.jar:s/a$c.class */
    public static final class c {

        /* renamed from: c */
        public static final c f39800c;

        /* renamed from: d */
        public static final c f39801d;

        /* renamed from: a */
        public final boolean f39802a;

        /* renamed from: b */
        public final Throwable f39803b;

        static {
            if (AbstractC8489a.f39793e) {
                f39801d = null;
                f39800c = null;
            } else {
                f39801d = new c(false, null);
                f39800c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th2) {
            this.f39802a = z10;
            this.f39803b = th2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$d.class
     */
    /* renamed from: s.a$d */
    /* loaded from: combined.jar:classes1.jar:s/a$d.class */
    public static final class d {

        /* renamed from: b */
        public static final d f39804b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f39805a;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:s/a$d$a.class
         */
        /* renamed from: s.a$d$a */
        /* loaded from: combined.jar:classes1.jar:s/a$d$a.class */
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
            this.f39805a = (Throwable) AbstractC8489a.m36616e(th2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$e.class
     */
    /* renamed from: s.a$e */
    /* loaded from: combined.jar:classes1.jar:s/a$e.class */
    public static final class e {

        /* renamed from: d */
        public static final e f39806d = new e(null, null);

        /* renamed from: a */
        public final Runnable f39807a;

        /* renamed from: b */
        public final Executor f39808b;

        /* renamed from: c */
        public e f39809c;

        public e(Runnable runnable, Executor executor) {
            this.f39807a = runnable;
            this.f39808b = executor;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$f.class
     */
    /* renamed from: s.a$f */
    /* loaded from: combined.jar:classes1.jar:s/a$f.class */
    public static final class f extends b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f39810a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f39811b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC8489a, i> f39812c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC8489a, e> f39813d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC8489a, Object> f39814e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC8489a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC8489a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC8489a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f39810a = atomicReferenceFieldUpdater;
            this.f39811b = atomicReferenceFieldUpdater2;
            this.f39812c = atomicReferenceFieldUpdater3;
            this.f39813d = atomicReferenceFieldUpdater4;
            this.f39814e = atomicReferenceFieldUpdater5;
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: a */
        public boolean mo36632a(AbstractC8489a<?> abstractC8489a, e eVar, e eVar2) {
            return C8490b.m36639a(this.f39813d, abstractC8489a, eVar, eVar2);
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: b */
        public boolean mo36633b(AbstractC8489a<?> abstractC8489a, Object obj, Object obj2) {
            return C8490b.m36639a(this.f39814e, abstractC8489a, obj, obj2);
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: c */
        public boolean mo36634c(AbstractC8489a<?> abstractC8489a, i iVar, i iVar2) {
            return C8490b.m36639a(this.f39812c, abstractC8489a, iVar, iVar2);
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: d */
        public void mo36635d(i iVar, i iVar2) {
            this.f39811b.lazySet(iVar, iVar2);
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: e */
        public void mo36636e(i iVar, Thread thread) {
            this.f39810a.lazySet(iVar, thread);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$g.class
     */
    /* renamed from: s.a$g */
    /* loaded from: combined.jar:classes1.jar:s/a$g.class */
    public static final class g<V> implements Runnable {

        /* renamed from: b */
        public final AbstractC8489a<V> f39815b;

        /* renamed from: c */
        public final InterfaceFutureC5838a<? extends V> f39816c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39815b.f39797b != this) {
                return;
            }
            if (AbstractC8489a.f39795g.mo36633b(this.f39815b, this, AbstractC8489a.m36619j(this.f39816c))) {
                AbstractC8489a.m36617g(this.f39815b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$h.class
     */
    /* renamed from: s.a$h */
    /* loaded from: combined.jar:classes1.jar:s/a$h.class */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: a */
        public boolean mo36632a(AbstractC8489a<?> abstractC8489a, e eVar, e eVar2) {
            synchronized (abstractC8489a) {
                if (abstractC8489a.f39798c != eVar) {
                    return false;
                }
                abstractC8489a.f39798c = eVar2;
                return true;
            }
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: b */
        public boolean mo36633b(AbstractC8489a<?> abstractC8489a, Object obj, Object obj2) {
            synchronized (abstractC8489a) {
                if (abstractC8489a.f39797b != obj) {
                    return false;
                }
                abstractC8489a.f39797b = obj2;
                return true;
            }
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: c */
        public boolean mo36634c(AbstractC8489a<?> abstractC8489a, i iVar, i iVar2) {
            synchronized (abstractC8489a) {
                if (abstractC8489a.f39799d != iVar) {
                    return false;
                }
                abstractC8489a.f39799d = iVar2;
                return true;
            }
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: d */
        public void mo36635d(i iVar, i iVar2) {
            iVar.f39819b = iVar2;
        }

        @Override // p313s.AbstractC8489a.b
        /* renamed from: e */
        public void mo36636e(i iVar, Thread thread) {
            iVar.f39818a = thread;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/a$i.class
     */
    /* renamed from: s.a$i */
    /* loaded from: combined.jar:classes1.jar:s/a$i.class */
    public static final class i {

        /* renamed from: c */
        public static final i f39817c = new i(false);

        /* renamed from: a */
        public volatile Thread f39818a;

        /* renamed from: b */
        public volatile i f39819b;

        public i() {
            AbstractC8489a.f39795g.mo36636e(this, Thread.currentThread());
        }

        public i(boolean z10) {
        }

        /* renamed from: a */
        public void m36637a(i iVar) {
            AbstractC8489a.f39795g.mo36635d(this, iVar);
        }

        /* renamed from: b */
        public void m36638b() {
            Thread thread = this.f39818a;
            if (thread != null) {
                this.f39818a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, C2582b.f15902o), AtomicReferenceFieldUpdater.newUpdater(AbstractC8489a.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8489a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8489a.class, Object.class, C2582b.f15902o));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f39795g = hVar;
        if (th != null) {
            f39794f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f39796h = new Object();
    }

    /* renamed from: d */
    public static CancellationException m36615d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: e */
    public static <T> T m36616e(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: g */
    public static void m36617g(AbstractC8489a<?> abstractC8489a) {
        AbstractC8489a<?> abstractC8489a2 = abstractC8489a;
        e eVar = null;
        while (true) {
            abstractC8489a2.m36627n();
            abstractC8489a2.m36622c();
            e m36623f = abstractC8489a2.m36623f(eVar);
            while (true) {
                e eVar2 = m36623f;
                if (eVar2 == null) {
                    return;
                }
                eVar = eVar2.f39809c;
                Runnable runnable = eVar2.f39807a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC8489a2 = gVar.f39815b;
                    if (abstractC8489a2.f39797b == gVar) {
                        if (f39795g.mo36633b(abstractC8489a2, gVar, m36619j(gVar.f39816c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m36618h(runnable, eVar2.f39808b);
                }
                m36623f = eVar;
            }
        }
    }

    /* renamed from: h */
    public static void m36618h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f39794f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* renamed from: j */
    public static Object m36619j(InterfaceFutureC5838a<?> interfaceFutureC5838a) {
        if (interfaceFutureC5838a instanceof AbstractC8489a) {
            Object obj = ((AbstractC8489a) interfaceFutureC5838a).f39797b;
            Object obj2 = obj;
            if (obj instanceof c) {
                c cVar = (c) obj;
                obj2 = obj;
                if (cVar.f39802a) {
                    obj2 = cVar.f39803b != null ? new c(false, cVar.f39803b) : c.f39801d;
                }
            }
            return obj2;
        }
        boolean isCancelled = interfaceFutureC5838a.isCancelled();
        if ((!f39793e) && isCancelled) {
            return c.f39801d;
        }
        try {
            Object m36620k = m36620k(interfaceFutureC5838a);
            Object obj3 = m36620k;
            if (m36620k == null) {
                obj3 = f39796h;
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
    public static <V> V m36620k(Future<V> future) {
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
        m36616e(runnable);
        m36616e(executor);
        e eVar2 = this.f39798c;
        if (eVar2 != e.f39806d) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f39809c = eVar2;
                if (f39795g.mo36632a(this, eVar2, eVar3)) {
                    return;
                }
                eVar = this.f39798c;
                eVar2 = eVar;
            } while (eVar != e.f39806d);
        }
        m36618h(runnable, executor);
    }

    /* renamed from: b */
    public final void m36621b(StringBuilder sb2) {
        String str = "]";
        try {
            Object m36620k = m36620k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m36631r(m36620k));
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
    public void m36622c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        Object obj = this.f39797b;
        if ((obj == null) || (obj instanceof g)) {
            c cVar = f39793e ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f39800c : c.f39801d;
            z11 = false;
            AbstractC8489a<V> abstractC8489a = this;
            while (true) {
                if (f39795g.mo36633b(abstractC8489a, obj, cVar)) {
                    if (z10) {
                        abstractC8489a.m36625l();
                    }
                    m36617g(abstractC8489a);
                    z11 = true;
                    if (!(obj instanceof g)) {
                        break;
                    }
                    InterfaceFutureC5838a<? extends V> interfaceFutureC5838a = ((g) obj).f39816c;
                    if (!(interfaceFutureC5838a instanceof AbstractC8489a)) {
                        interfaceFutureC5838a.cancel(z10);
                        z11 = true;
                        break;
                    }
                    abstractC8489a = (AbstractC8489a) interfaceFutureC5838a;
                    obj = abstractC8489a.f39797b;
                    z11 = true;
                    if (!(obj == null) && !(obj instanceof g)) {
                        break;
                    }
                    z11 = true;
                } else {
                    Object obj2 = abstractC8489a.f39797b;
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
    public final e m36623f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f39798c;
        } while (!f39795g.mo36632a(this, eVar2, e.f39806d));
        while (true) {
            e eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                return eVar3;
            }
            eVar2 = eVar.f39809c;
            eVar.f39809c = eVar3;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        i iVar;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f39797b;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m36624i(obj2);
        }
        i iVar2 = this.f39799d;
        if (iVar2 != i.f39817c) {
            i iVar3 = new i();
            do {
                iVar3.m36637a(iVar2);
                if (f39795g.mo36634c(this, iVar2, iVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m36628o(iVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f39797b;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m36624i(obj);
                }
                iVar = this.f39799d;
                iVar2 = iVar;
            } while (iVar != i.f39817c);
        }
        return m36624i(this.f39797b);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        i iVar;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f39797b;
        if ((obj != null) && (!(obj instanceof g))) {
            return m36624i(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        long j11 = nanos;
        if (nanos >= 1000) {
            i iVar2 = this.f39799d;
            if (iVar2 != i.f39817c) {
                i iVar3 = new i();
                do {
                    iVar3.m36637a(iVar2);
                    if (f39795g.mo36634c(this, iVar2, iVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m36628o(iVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f39797b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m36624i(obj2);
                            }
                            j11 = nanoTime - System.nanoTime();
                            nanos = j11;
                        } while (j11 >= 1000);
                        m36628o(iVar3);
                    } else {
                        iVar = this.f39799d;
                        iVar2 = iVar;
                    }
                } while (iVar != i.f39817c);
            }
            return m36624i(this.f39797b);
        }
        while (j11 > 0) {
            Object obj3 = this.f39797b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m36624i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j11 = nanoTime - System.nanoTime();
        }
        String abstractC8489a = toString();
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
        throw new TimeoutException(str2 + " for " + abstractC8489a);
    }

    /* renamed from: i */
    public final V m36624i(Object obj) {
        if (obj instanceof c) {
            throw m36615d("Task was cancelled.", ((c) obj).f39803b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f39805a);
        }
        Object obj2 = obj;
        if (obj == f39796h) {
            obj2 = null;
        }
        return (V) obj2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f39797b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f39797b != null);
    }

    /* renamed from: l */
    public void m36625l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public String mo36626m() {
        Object obj = this.f39797b;
        if (obj instanceof g) {
            return "setFuture=[" + m36631r(((g) obj).f39816c) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: n */
    public final void m36627n() {
        i iVar;
        do {
            iVar = this.f39799d;
        } while (!f39795g.mo36634c(this, iVar, i.f39817c));
        while (iVar != null) {
            iVar.m36638b();
            iVar = iVar.f39819b;
        }
    }

    /* renamed from: o */
    public final void m36628o(i iVar) {
        i iVar2;
        iVar.f39818a = null;
        while (true) {
            i iVar3 = this.f39799d;
            if (iVar3 == i.f39817c) {
                return;
            }
            i iVar4 = null;
            while (true) {
                i iVar5 = iVar4;
                if (iVar3 == null) {
                    return;
                }
                i iVar6 = iVar3.f39819b;
                if (iVar3.f39818a != null) {
                    iVar2 = iVar3;
                } else if (iVar5 != null) {
                    iVar5.f39819b = iVar6;
                    iVar2 = iVar5;
                    if (iVar5.f39818a == null) {
                        break;
                    }
                } else {
                    iVar2 = iVar5;
                    if (!f39795g.mo36634c(this, iVar3, iVar6)) {
                        break;
                    }
                }
                iVar3 = iVar6;
                iVar4 = iVar2;
            }
        }
    }

    /* renamed from: p */
    public boolean mo36629p(V v10) {
        Object obj = v10;
        if (v10 == null) {
            obj = f39796h;
        }
        if (!f39795g.mo36633b(this, null, obj)) {
            return false;
        }
        m36617g(this);
        return true;
    }

    /* renamed from: q */
    public boolean mo36630q(Throwable th2) {
        if (!f39795g.mo36633b(this, null, new d((Throwable) m36616e(th2)))) {
            return false;
        }
        m36617g(this);
        return true;
    }

    /* renamed from: r */
    public final String m36631r(Object obj) {
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
                    str = mo36626m();
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
            m36621b(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
