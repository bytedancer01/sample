package na;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:na/c.class
 */
/* renamed from: na.c */
/* loaded from: combined.jar:classes2.jar:na/c.class */
public final class C6759c implements InterfaceC6758b {
    public C6759c() {
    }

    @Override // na.InterfaceC6758b
    /* renamed from: a */
    public final ExecutorService mo31076a(ThreadFactory threadFactory, int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // na.InterfaceC6758b
    /* renamed from: b */
    public final ScheduledExecutorService mo31077b(int i10, ThreadFactory threadFactory, int i11) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
