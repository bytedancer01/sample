package p067di;

import ci.C1127m;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;
import p372vh.C9367f;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/s.class
 */
/* renamed from: di.s */
/* loaded from: combined.jar:classes2.jar:di/s.class */
public final class C4512s extends AbstractC4522v0 {

    /* renamed from: d */
    @NotNull
    public static final C4512s f26932d = new C4512s();

    /* renamed from: e */
    public static final int f26933e;

    /* renamed from: f */
    public static boolean f26934f;

    @Nullable
    private static volatile Executor pool;

    static {
        String str;
        int intValue;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable th2) {
            str = null;
        }
        if (str == null) {
            intValue = -1;
        } else {
            Integer m6713f = C1127m.m6713f(str);
            if (m6713f == null || m6713f.intValue() < 1) {
                throw new IllegalStateException(C9367f.m39532k("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            intValue = m6713f.intValue();
        }
        f26933e = intValue;
    }

    /* renamed from: F0 */
    public static final Thread m22823F0(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, C9367f.m39532k("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: K0 */
    public static final void m22824K0() {
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: A0 */
    public void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable) {
        try {
            Executor executor = pool;
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = m22827H0();
            }
            C4464c.m22637a();
            executor2.execute(runnable);
        } catch (RejectedExecutionException e10) {
            C4464c.m22637a();
            RunnableC4486j0.f26887h.m22806R0(runnable);
        }
    }

    /* renamed from: E0 */
    public final ExecutorService m22825E0() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(m22828I0(), new ThreadFactory(atomicInteger) { // from class: di.q

            /* renamed from: a */
            public final AtomicInteger f26922a;

            {
                this.f26922a = atomicInteger;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m22823F0;
                m22823F0 = C4512s.m22823F0(this.f26922a, runnable);
                return m22823F0;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.concurrent.ExecutorService m22826G0() {
        /*
            r6 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            r0 = r6
            java.util.concurrent.ExecutorService r0 = r0.m22825E0()
            return r0
        Lb:
            r0 = 0
            r9 = r0
            java.lang.String r0 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L16
            r8 = r0
            goto L19
        L16:
            r7 = move-exception
            r0 = 0
            r8 = r0
        L19:
            r0 = r8
            if (r0 != 0) goto L22
            r0 = r6
            java.util.concurrent.ExecutorService r0 = r0.m22825E0()
            return r0
        L22:
            boolean r0 = p067di.C4512s.f26934f
            if (r0 != 0) goto L73
            int r0 = p067di.C4512s.f26933e
            if (r0 >= 0) goto L73
            r0 = r8
            java.lang.String r1 = "commonPool"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L50
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L50
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L51
            r0 = r7
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0     // Catch: java.lang.Throwable -> L50
            r7 = r0
            goto L53
        L50:
            r7 = move-exception
        L51:
            r0 = 0
            r7 = r0
        L53:
            r0 = r7
            if (r0 != 0) goto L5a
            goto L73
        L5a:
            di.s r0 = p067di.C4512s.f26932d
            r1 = r8
            r2 = r7
            boolean r0 = r0.m22829J0(r1, r2)
            if (r0 == 0) goto L68
            goto L6a
        L68:
            r0 = 0
            r7 = r0
        L6a:
            r0 = r7
            if (r0 != 0) goto L71
            goto L73
        L71:
            r0 = r7
            return r0
        L73:
            r0 = r8
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> La6
            r2 = r1
            r3 = 0
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La6
            r2[r3] = r4     // Catch: java.lang.Throwable -> La6
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> La6
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La6
            r2 = r1
            r3 = 0
            di.s r4 = p067di.C4512s.f26932d     // Catch: java.lang.Throwable -> La6
            int r4 = r4.m22828I0()     // Catch: java.lang.Throwable -> La6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La6
            r2[r3] = r4     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> La6
            r8 = r0
            r0 = r9
            r7 = r0
            r0 = r8
            boolean r0 = r0 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto La9
            r0 = r8
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0     // Catch: java.lang.Throwable -> La6
            r7 = r0
            goto La9
        La6:
            r7 = move-exception
            r0 = r9
            r7 = r0
        La9:
            r0 = r7
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lb4
            r0 = r6
            java.util.concurrent.ExecutorService r0 = r0.m22825E0()
            r8 = r0
        Lb4:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067di.C4512s.m22826G0():java.util.concurrent.ExecutorService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor] */
    /* renamed from: H0 */
    public final Executor m22827H0() {
        ExecutorService executorService;
        synchronized (this) {
            ?? r02 = pool;
            executorService = r02;
            if (r02 == 0) {
                executorService = m22826G0();
                pool = executorService;
            }
        }
        return executorService;
    }

    /* renamed from: I0 */
    public final int m22828I0() {
        Integer valueOf = Integer.valueOf(f26933e);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf == null ? C10240e.m42834b(Runtime.getRuntime().availableProcessors() - 1, 1) : valueOf.intValue();
    }

    /* renamed from: J0 */
    public final boolean m22829J0(@NotNull Class<?> cls, @NotNull ExecutorService executorService) {
        Integer num;
        executorService.submit(new Runnable() { // from class: di.r
            @Override // java.lang.Runnable
            public final void run() {
                C4512s.m22824K0();
            }
        });
        boolean z10 = false;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            num = null;
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable th2) {
            num = null;
        }
        if (num == null) {
            return false;
        }
        if (num.intValue() >= 1) {
            z10 = true;
        }
        return z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // p067di.AbstractC4462b0
    @NotNull
    public String toString() {
        return "CommonPool";
    }
}
