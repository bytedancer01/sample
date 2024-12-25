package p079ea;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ea/c.class
 */
/* renamed from: ea.c */
/* loaded from: combined.jar:classes2.jar:ea/c.class */
public class ThreadFactoryC4695c implements ThreadFactory {

    /* renamed from: a */
    public final String f27700a;

    /* renamed from: b */
    public final AtomicInteger f27701b = new AtomicInteger();

    /* renamed from: c */
    public final ThreadFactory f27702c = Executors.defaultThreadFactory();

    public ThreadFactoryC4695c(String str) {
        C9935o.m41851k(str, "Name must not be null");
        this.f27700a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f27702c.newThread(new RunnableC4696d(runnable, 0));
        String str = this.f27700a;
        int andIncrement = this.f27701b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(str.length() + 13);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
