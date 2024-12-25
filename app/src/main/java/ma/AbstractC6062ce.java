package ma;

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
  classes2.jar:ma/ce.class
 */
/* renamed from: ma.ce */
/* loaded from: combined.jar:classes2.jar:ma/ce.class */
public abstract class AbstractC6062ce<V> extends AbstractC6063cf implements InterfaceFutureC5838a<V> {

    /* renamed from: e */
    public static final boolean f33704e;

    /* renamed from: f */
    public static final Logger f33705f;

    /* renamed from: g */
    public static final AbstractC6376rd f33706g;

    /* renamed from: h */
    public static final Object f33707h;

    /* renamed from: b */
    public volatile Object f33708b;

    /* renamed from: c */
    public volatile C6439ud f33709c;

    /* renamed from: d */
    public volatile C6041be f33710d;

    static {
        boolean z10;
        AbstractC6376rd c6499xd;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e10) {
            z10 = false;
        }
        f33704e = z10;
        f33705f = Logger.getLogger(AbstractC6062ce.class.getName());
        try {
            c6499xd = new C6020ae(null);
            e = null;
            e = null;
        } catch (Error | RuntimeException e11) {
            e = e11;
            try {
                c6499xd = new C6459vd(AtomicReferenceFieldUpdater.newUpdater(C6041be.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C6041be.class, C6041be.class, C2582b.f15902o), AtomicReferenceFieldUpdater.newUpdater(AbstractC6062ce.class, C6041be.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6062ce.class, C6439ud.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6062ce.class, Object.class, C2582b.f15902o));
                e = null;
            } catch (Error | RuntimeException e12) {
                e = e12;
                c6499xd = new C6499xd(null);
            }
        }
        f33706g = c6499xd;
        if (e != null) {
            Logger logger = f33705f;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", e);
        }
        f33707h = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static Object m29498o(InterfaceFutureC5838a interfaceFutureC5838a) {
        Throwable mo29503b;
        if (interfaceFutureC5838a instanceof InterfaceC6519yd) {
            Object obj = ((AbstractC6062ce) interfaceFutureC5838a).f33708b;
            Object obj2 = obj;
            if (obj instanceof C6397sd) {
                C6397sd c6397sd = (C6397sd) obj;
                obj2 = obj;
                if (c6397sd.f34031a) {
                    Throwable th2 = c6397sd.f34032b;
                    obj2 = th2 != null ? new C6397sd(false, th2) : C6397sd.f34030d;
                }
            }
            obj2.getClass();
            return obj2;
        }
        if ((interfaceFutureC5838a instanceof AbstractC6063cf) && (mo29503b = ((AbstractC6063cf) interfaceFutureC5838a).mo29503b()) != null) {
            return new C6418td(mo29503b);
        }
        boolean isCancelled = interfaceFutureC5838a.isCancelled();
        if ((!f33704e) && isCancelled) {
            C6397sd c6397sd2 = C6397sd.f34030d;
            c6397sd2.getClass();
            return c6397sd2;
        }
        try {
            Object m29499p = m29499p(interfaceFutureC5838a);
            if (!isCancelled) {
                Object obj3 = m29499p;
                if (m29499p == null) {
                    obj3 = f33707h;
                }
                return obj3;
            }
            return new C6397sd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(interfaceFutureC5838a)));
        } catch (Error e10) {
            e = e10;
            return new C6418td(e);
        } catch (CancellationException e11) {
            return !isCancelled ? new C6418td(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC5838a)), e11)) : new C6397sd(false, e11);
        } catch (RuntimeException e12) {
            e = e12;
            return new C6418td(e);
        } catch (ExecutionException e13) {
            return isCancelled ? new C6397sd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC5838a)), e13)) : new C6418td(e13.getCause());
        }
    }

    /* renamed from: p */
    public static Object m29499p(Future future) {
        boolean z10;
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                z10 = z11;
                obj = future.get();
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
        return obj;
    }

    /* renamed from: t */
    public static void m29500t(AbstractC6062ce abstractC6062ce, boolean z10) {
        C6439ud c6439ud;
        AbstractC6062ce abstractC6062ce2 = abstractC6062ce;
        C6439ud c6439ud2 = null;
        while (true) {
            C6041be mo29389b = f33706g.mo29389b(abstractC6062ce2, C6041be.f33686c);
            while (true) {
                C6041be c6041be = mo29389b;
                if (c6041be == null) {
                    break;
                }
                Thread thread = c6041be.f33687a;
                if (thread != null) {
                    c6041be.f33687a = null;
                    LockSupport.unpark(thread);
                }
                mo29389b = c6041be.f33688b;
            }
            abstractC6062ce2.mo29442k();
            C6439ud mo29388a = f33706g.mo29388a(abstractC6062ce2, C6439ud.f34087d);
            while (true) {
                C6439ud c6439ud3 = mo29388a;
                c6439ud = c6439ud2;
                if (c6439ud3 == null) {
                    break;
                }
                C6439ud c6439ud4 = c6439ud3.f34090c;
                c6439ud3.f34090c = c6439ud2;
                c6439ud2 = c6439ud3;
                mo29388a = c6439ud4;
            }
            while (c6439ud != null) {
                c6439ud2 = c6439ud.f34090c;
                Runnable runnable = c6439ud.f34088a;
                runnable.getClass();
                if (runnable instanceof RunnableC6479wd) {
                    RunnableC6479wd runnableC6479wd = (RunnableC6479wd) runnable;
                    abstractC6062ce2 = runnableC6479wd.f34126b;
                    if (abstractC6062ce2.f33708b == runnableC6479wd) {
                        if (f33706g.mo29393f(abstractC6062ce2, runnableC6479wd, m29498o(runnableC6479wd.f34127c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c6439ud.f34089b;
                    executor.getClass();
                    m29501u(runnable, executor);
                }
                c6439ud = c6439ud2;
            }
            return;
        }
    }

    /* renamed from: u */
    public static void m29501u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f33705f.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    /* renamed from: w */
    public static final Object m29502w(Object obj) {
        if (obj instanceof C6397sd) {
            Throwable th2 = ((C6397sd) obj).f34032b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof C6418td) {
            throw new ExecutionException(((C6418td) obj).f34068a);
        }
        Object obj2 = obj;
        if (obj == f33707h) {
            obj2 = null;
        }
        return obj2;
    }

    @Override // lc.InterfaceFutureC5838a
    /* renamed from: a */
    public final void mo23123a(Runnable runnable, Executor executor) {
        C6439ud c6439ud;
        C6050c2.m29480c(runnable, "Runnable was null.");
        C6050c2.m29480c(executor, "Executor was null.");
        if (!isDone()) {
            C6439ud c6439ud2 = this.f33709c;
            if (c6439ud2 != C6439ud.f34087d) {
                C6439ud c6439ud3 = new C6439ud(runnable, executor);
                do {
                    c6439ud3.f34090c = c6439ud2;
                    if (f33706g.mo29392e(this, c6439ud2, c6439ud3)) {
                        return;
                    }
                    c6439ud = this.f33709c;
                    c6439ud2 = c6439ud;
                } while (c6439ud != C6439ud.f34087d);
            }
        }
        m29501u(runnable, executor);
    }

    @Override // ma.AbstractC6063cf
    /* renamed from: b */
    public final Throwable mo29503b() {
        if (!(this instanceof InterfaceC6519yd)) {
            return null;
        }
        Object obj = this.f33708b;
        if (obj instanceof C6418td) {
            return ((C6418td) obj).f34068a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C6397sd c6397sd;
        Object obj = this.f33708b;
        boolean z11 = false;
        if ((obj instanceof RunnableC6479wd) | (obj == null)) {
            if (f33704e) {
                c6397sd = new C6397sd(z10, new CancellationException("Future.cancel() was called."));
            } else {
                C6397sd c6397sd2 = z10 ? C6397sd.f34029c : C6397sd.f34030d;
                c6397sd2.getClass();
                c6397sd = c6397sd2;
            }
            z11 = false;
            AbstractC6062ce<V> abstractC6062ce = this;
            Object obj2 = obj;
            while (true) {
                if (f33706g.mo29393f(abstractC6062ce, obj2, c6397sd)) {
                    m29500t(abstractC6062ce, z10);
                    if (!(obj2 instanceof RunnableC6479wd)) {
                        break;
                    }
                    InterfaceFutureC5838a<? extends V> interfaceFutureC5838a = ((RunnableC6479wd) obj2).f34127c;
                    if (!(interfaceFutureC5838a instanceof InterfaceC6519yd)) {
                        interfaceFutureC5838a.cancel(z10);
                        break;
                    }
                    abstractC6062ce = (AbstractC6062ce) interfaceFutureC5838a;
                    obj2 = abstractC6062ce.f33708b;
                    if (!(obj2 == null) && !(obj2 instanceof RunnableC6479wd)) {
                        break;
                    }
                    z11 = true;
                } else {
                    Object obj3 = abstractC6062ce.f33708b;
                    obj2 = obj3;
                    if (!(obj3 instanceof RunnableC6479wd)) {
                        break;
                    }
                }
            }
            z11 = true;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public String mo29441g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        C6041be c6041be;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f33708b;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC6479wd))) {
            return m29502w(obj2);
        }
        C6041be c6041be2 = this.f33710d;
        if (c6041be2 != C6041be.f33686c) {
            C6041be c6041be3 = new C6041be();
            do {
                AbstractC6376rd abstractC6376rd = f33706g;
                abstractC6376rd.mo29390c(c6041be3, c6041be2);
                if (abstractC6376rd.mo29394g(this, c6041be2, c6041be3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m29510v(c6041be3);
                            throw new InterruptedException();
                        }
                        obj = this.f33708b;
                    } while (!((obj != null) & (!(obj instanceof RunnableC6479wd))));
                    return m29502w(obj);
                }
                c6041be = this.f33710d;
                c6041be2 = c6041be;
            } while (c6041be != C6041be.f33686c);
        }
        Object obj3 = this.f33708b;
        obj3.getClass();
        return m29502w(obj3);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        C6041be c6041be;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f33708b;
        if ((obj != null) && (!(obj instanceof RunnableC6479wd))) {
            return m29502w(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        long j11 = nanos;
        if (nanos >= 1000) {
            C6041be c6041be2 = this.f33710d;
            if (c6041be2 != C6041be.f33686c) {
                C6041be c6041be3 = new C6041be();
                do {
                    AbstractC6376rd abstractC6376rd = f33706g;
                    abstractC6376rd.mo29390c(c6041be3, c6041be2);
                    if (abstractC6376rd.mo29394g(this, c6041be2, c6041be3)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m29510v(c6041be3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f33708b;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC6479wd))) {
                                return m29502w(obj2);
                            }
                            j11 = nanoTime - System.nanoTime();
                            nanos = j11;
                        } while (j11 >= 1000);
                        m29510v(c6041be3);
                    } else {
                        c6041be = this.f33710d;
                        c6041be2 = c6041be;
                    }
                } while (c6041be != C6041be.f33686c);
            }
            Object obj3 = this.f33708b;
            obj3.getClass();
            return m29502w(obj3);
        }
        while (j11 > 0) {
            Object obj4 = this.f33708b;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC6479wd))) {
                return m29502w(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j11 = nanoTime - System.nanoTime();
        }
        String abstractC6062ce = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        String str2 = str;
        if (j11 + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j12 = -j11;
            long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(convert);
            boolean z10 = true;
            if (convert != 0) {
                z10 = nanos2 > 1000;
            }
            String str3 = concat;
            if (convert > 0) {
                String str4 = concat + convert + " " + lowerCase;
                String str5 = str4;
                if (z10) {
                    str5 = str4.concat(",");
                }
                str3 = str5.concat(" ");
            }
            String str6 = str3;
            if (z10) {
                str6 = str3 + nanos2 + " nanoseconds ";
            }
            str2 = str6.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str2 + " for " + abstractC6062ce);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f33708b instanceof C6397sd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f33708b;
        boolean z10 = obj instanceof RunnableC6479wd;
        boolean z11 = true;
        if (obj == null) {
            z11 = false;
        }
        return z11 & (!z10);
    }

    /* renamed from: k */
    public void mo29442k() {
    }

    /* renamed from: l */
    public final boolean m29504l(Object obj) {
        Object obj2 = obj;
        if (obj == null) {
            obj2 = f33707h;
        }
        if (!f33706g.mo29393f(this, null, obj2)) {
            return false;
        }
        m29500t(this, false);
        return true;
    }

    /* renamed from: m */
    public final boolean m29505m(Throwable th2) {
        if (!f33706g.mo29393f(this, null, new C6418td(th2))) {
            return false;
        }
        m29500t(this, false);
        return true;
    }

    /* renamed from: n */
    public final boolean m29506n() {
        Object obj = this.f33708b;
        return (obj instanceof C6397sd) && ((C6397sd) obj).f34031a;
    }

    /* renamed from: q */
    public final void m29507q(StringBuilder sb2) {
        String str;
        String hexString;
        try {
            Object m29499p = m29499p(this);
            sb2.append("SUCCESS, result=[");
            if (m29499p == null) {
                hexString = "null";
            } else if (m29499p == this) {
                hexString = "this future";
            } else {
                sb2.append(m29499p.getClass().getName());
                sb2.append("@");
                hexString = Integer.toHexString(System.identityHashCode(m29499p));
            }
            sb2.append(hexString);
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
            str = "]";
            sb2.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0072  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29508r(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            r0 = r5
            int r0 = r0.length()
            r6 = r0
            r0 = r5
            java.lang.String r1 = "PENDING"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.Object r0 = r0.f33708b
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof ma.RunnableC6479wd
            if (r0 == 0) goto L38
            r0 = r5
            java.lang.String r1 = ", setFuture=["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r5
            r2 = r7
            ma.wd r2 = (ma.RunnableC6479wd) r2
            lc.a<? extends V> r2 = r2.f34127c
            r0.m29509s(r1, r2)
        L2d:
            r0 = r5
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L6b
        L38:
            r0 = r4
            java.lang.String r0 = r0.mo29441g()     // Catch: java.lang.StackOverflowError -> L43 java.lang.RuntimeException -> L47
            java.lang.String r0 = ma.C6092e2.m29560a(r0)     // Catch: java.lang.StackOverflowError -> L43 java.lang.RuntimeException -> L47
            r7 = r0
            goto L56
        L43:
            r7 = move-exception
            goto L48
        L47:
            r7 = move-exception
        L48:
            java.lang.String r0 = "Exception thrown from implementation: "
            r1 = r7
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            r7 = r0
        L56:
            r0 = r7
            if (r0 == 0) goto L6b
            r0 = r5
            java.lang.String r1 = ", info=["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L2d
        L6b:
            r0 = r4
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L81
            r0 = r5
            r1 = r6
            r2 = r5
            int r2 = r2.length()
            java.lang.StringBuilder r0 = r0.delete(r1, r2)
            r0 = r4
            r1 = r5
            r0.m29507q(r1)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.AbstractC6062ce.m29508r(java.lang.StringBuilder):void");
    }

    /* renamed from: s */
    public final void m29509s(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f33708b instanceof C6397sd) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m29507q(sb2);
        } else {
            m29508r(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: v */
    public final void m29510v(C6041be c6041be) {
        C6041be c6041be2;
        c6041be.f33687a = null;
        while (true) {
            C6041be c6041be3 = this.f33710d;
            if (c6041be3 == C6041be.f33686c) {
                return;
            }
            C6041be c6041be4 = null;
            while (true) {
                C6041be c6041be5 = c6041be4;
                if (c6041be3 == null) {
                    return;
                }
                C6041be c6041be6 = c6041be3.f33688b;
                if (c6041be3.f33687a != null) {
                    c6041be2 = c6041be3;
                } else if (c6041be5 != null) {
                    c6041be5.f33688b = c6041be6;
                    c6041be2 = c6041be5;
                    if (c6041be5.f33687a == null) {
                        break;
                    }
                } else {
                    c6041be2 = c6041be5;
                    if (!f33706g.mo29394g(this, c6041be3, c6041be6)) {
                        break;
                    }
                }
                c6041be3 = c6041be6;
                c6041be4 = c6041be2;
            }
        }
    }
}
