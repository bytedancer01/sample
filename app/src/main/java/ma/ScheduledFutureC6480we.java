package ma;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lc.InterfaceFutureC5838a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/we.class
 */
/* renamed from: ma.we */
/* loaded from: combined.jar:classes2.jar:ma/we.class */
public final class ScheduledFutureC6480we extends C6272me implements ScheduledFuture {

    /* renamed from: c */
    public final ScheduledFuture f34128c;

    public ScheduledFutureC6480we(InterfaceFutureC5838a interfaceFutureC5838a, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC5838a);
        this.f34128c = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean cancel = mo29833e().cancel(z10);
        if (cancel) {
            this.f34128c.cancel(z10);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f34128c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f34128c.getDelay(timeUnit);
    }
}
