package p425yc;

import java.util.concurrent.ThreadFactory;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yc/c.class
 */
/* renamed from: yc.c */
/* loaded from: combined.jar:classes2.jar:yc/c.class */
public final /* synthetic */ class ThreadFactoryC9976c implements ThreadFactory {

    /* renamed from: a */
    public static final ThreadFactoryC9976c f45696a = new ThreadFactoryC9976c();

    /* renamed from: a */
    public static ThreadFactory m41916a() {
        return f45696a;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return C9977d.m41920e(runnable);
    }
}
