package ma;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ve.class
 */
/* renamed from: ma.ve */
/* loaded from: combined.jar:classes2.jar:ma/ve.class */
public class C6460ve extends AbstractC6188ie {

    /* renamed from: b */
    public final ExecutorService f34112b;

    public C6460ve(ExecutorService executorService) {
        executorService.getClass();
        this.f34112b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f34112b.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34112b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f34112b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f34112b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f34112b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f34112b.shutdownNow();
    }

    public final String toString() {
        return super.toString() + "[" + String.valueOf(this.f34112b) + "]";
    }
}
