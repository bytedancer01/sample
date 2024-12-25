package p067di;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import p067di.AbstractC4510r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/s0.class
 */
/* renamed from: di.s0 */
/* loaded from: combined.jar:classes2.jar:di/s0.class */
public abstract class AbstractC4513s0 extends AbstractC4507q0 {
    @NotNull
    /* renamed from: L0 */
    public abstract Thread mo22652L0();

    /* renamed from: M0 */
    public final void m22830M0(long j10, @NotNull AbstractC4510r0.a aVar) {
        RunnableC4486j0.f26887h.m22812Y0(j10, aVar);
    }

    /* renamed from: N0 */
    public final void m22831N0() {
        Thread mo22652L0 = mo22652L0();
        if (Thread.currentThread() != mo22652L0) {
            C4464c.m22637a();
            LockSupport.unpark(mo22652L0);
        }
    }
}
