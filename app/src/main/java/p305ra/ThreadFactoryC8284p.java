package p305ra;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/p.class
 */
/* renamed from: ra.p */
/* loaded from: combined.jar:classes2.jar:ra/p.class */
public final class ThreadFactoryC8284p implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f39231a = Executors.defaultThreadFactory();

    public ThreadFactoryC8284p(C8120e0 c8120e0) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f39231a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
