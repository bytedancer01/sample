package p067di;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/j0.class
 */
/* renamed from: di.j0 */
/* loaded from: combined.jar:classes2.jar:di/j0.class */
public final class RunnableC4486j0 extends AbstractC4510r0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h */
    @NotNull
    public static final RunnableC4486j0 f26887h;

    /* renamed from: i */
    public static final long f26888i;

    static {
        Long l10;
        RunnableC4486j0 runnableC4486j0 = new RunnableC4486j0();
        f26887h = runnableC4486j0;
        AbstractC4507q0.m22793H0(runnableC4486j0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException e10) {
            l10 = 1000L;
        }
        f26888i = timeUnit.toNanos(l10.longValue());
    }

    @Override // p067di.AbstractC4513s0
    @NotNull
    /* renamed from: L0 */
    public Thread mo22652L0() {
        Thread thread = _thread;
        Thread thread2 = thread;
        if (thread == null) {
            thread2 = m22678d1();
        }
        return thread2;
    }

    /* renamed from: c1 */
    public final void m22677c1() {
        synchronized (this) {
            if (m22679e1()) {
                debugStatus = 3;
                m22811X0();
                notifyAll();
            }
        }
    }

    /* renamed from: d1 */
    public final Thread m22678d1() {
        Thread thread;
        synchronized (this) {
            Thread thread2 = _thread;
            thread = thread2;
            if (thread2 == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    /* renamed from: e1 */
    public final boolean m22679e1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    /* renamed from: f1 */
    public final boolean m22680f1() {
        synchronized (this) {
            if (m22679e1()) {
                return false;
            }
            debugStatus = 1;
            notifyAll();
            return true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long j10;
        boolean m22808U0;
        C4517t1.f26935a.m22837c(this);
        C4464c.m22637a();
        try {
            if (!m22680f1()) {
                if (m22808U0) {
                    return;
                } else {
                    return;
                }
            }
            long j11 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m22809V0 = m22809V0();
                if (m22809V0 == Long.MAX_VALUE) {
                    C4464c.m22637a();
                    long nanoTime = System.nanoTime();
                    j10 = j11;
                    if (j11 == Long.MAX_VALUE) {
                        j10 = f26888i + nanoTime;
                    }
                    long j12 = j10 - nanoTime;
                    if (j12 <= 0) {
                        _thread = null;
                        m22677c1();
                        C4464c.m22637a();
                        if (m22808U0()) {
                            return;
                        }
                        mo22652L0();
                        return;
                    }
                    m22809V0 = C10240e.m42837e(m22809V0, j12);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                j11 = j10;
                if (m22809V0 > 0) {
                    if (m22679e1()) {
                        _thread = null;
                        m22677c1();
                        C4464c.m22637a();
                        if (m22808U0()) {
                            return;
                        }
                        mo22652L0();
                        return;
                    }
                    C4464c.m22637a();
                    LockSupport.parkNanos(this, m22809V0);
                    j11 = j10;
                }
            }
        } finally {
            _thread = null;
            m22677c1();
            C4464c.m22637a();
            if (!m22808U0()) {
                mo22652L0();
            }
        }
    }
}
