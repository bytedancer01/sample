package p335t9;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/d0.class
 */
/* renamed from: t9.d0 */
/* loaded from: combined.jar:classes2.jar:t9/d0.class */
public final /* synthetic */ class ExecutorC8653d0 implements Executor {

    /* renamed from: b */
    public static final Executor f40409b = new ExecutorC8653d0();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
