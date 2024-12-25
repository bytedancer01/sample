package p305ra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/s7.class
 */
/* renamed from: ra.s7 */
/* loaded from: combined.jar:classes2.jar:ra/s7.class */
public final class C8337s7 implements InterfaceC8335s5 {
    public /* synthetic */ C8337s7(C8336s6 c8336s6) {
    }

    /* renamed from: b */
    public static final ExecutorService m35784b(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // p305ra.InterfaceC8335s5
    /* renamed from: a */
    public final ExecutorService mo35783a(ThreadFactory threadFactory, int i10) {
        return m35784b(1, threadFactory, 1);
    }
}
