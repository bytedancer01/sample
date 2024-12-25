package ma;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ye.class
 */
/* renamed from: ma.ye */
/* loaded from: combined.jar:classes2.jar:ma/ye.class */
public final class ScheduledExecutorServiceC6520ye extends C6460ve implements ScheduledExecutorService {

    /* renamed from: c */
    public final ScheduledExecutorService f34182c;

    public ScheduledExecutorServiceC6520ye(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f34182c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        RunnableFutureC6042bf m29440x = RunnableFutureC6042bf.m29440x(runnable, null);
        return new ScheduledFutureC6480we(m29440x, this.f34182c.schedule(m29440x, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        RunnableFutureC6042bf runnableFutureC6042bf = new RunnableFutureC6042bf(callable);
        return new ScheduledFutureC6480we(runnableFutureC6042bf, this.f34182c.schedule(runnableFutureC6042bf, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC6500xe runnableC6500xe = new RunnableC6500xe(runnable);
        return new ScheduledFutureC6480we(runnableC6500xe, this.f34182c.scheduleAtFixedRate(runnableC6500xe, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC6500xe runnableC6500xe = new RunnableC6500xe(runnable);
        return new ScheduledFutureC6480we(runnableC6500xe, this.f34182c.scheduleWithFixedDelay(runnableC6500xe, j10, j11, timeUnit));
    }
}
