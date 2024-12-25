package p079ea;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ea/b.class
 */
/* renamed from: ea.b */
/* loaded from: combined.jar:classes2.jar:ea/b.class */
public class ThreadFactoryC4694b implements ThreadFactory {

    /* renamed from: a */
    public final String f27698a;

    /* renamed from: b */
    public final ThreadFactory f27699b = Executors.defaultThreadFactory();

    public ThreadFactoryC4694b(String str) {
        C9935o.m41851k(str, "Name must not be null");
        this.f27698a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f27699b.newThread(new RunnableC4696d(runnable, 0));
        newThread.setName(this.f27698a);
        return newThread;
    }
}
