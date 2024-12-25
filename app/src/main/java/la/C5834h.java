package la;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:la/h.class
 */
/* renamed from: la.h */
/* loaded from: combined.jar:classes2.jar:la/h.class */
public final class C5834h implements InterfaceC5832f {
    public /* synthetic */ C5834h(C5833g c5833g) {
    }

    @Override // la.InterfaceC5832f
    /* renamed from: a */
    public final ExecutorService mo28419a(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // la.InterfaceC5832f
    /* renamed from: b */
    public final ExecutorService mo28420b(ThreadFactory threadFactory, int i10) {
        return mo28419a(1, threadFactory, 1);
    }
}
