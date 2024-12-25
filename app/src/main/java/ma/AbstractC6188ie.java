package ma;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import lc.InterfaceFutureC5838a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ie.class
 */
/* renamed from: ma.ie */
/* loaded from: combined.jar:classes2.jar:ma/ie.class */
public abstract class AbstractC6188ie extends AbstractExecutorService implements InterfaceExecutorServiceC6440ue {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return RunnableFutureC6042bf.m29440x(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC6042bf(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC5838a) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC5838a) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC5838a) super.submit(callable);
    }
}
