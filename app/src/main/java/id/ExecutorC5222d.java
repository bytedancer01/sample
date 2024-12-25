package id;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/d.class
 */
/* renamed from: id.d */
/* loaded from: combined.jar:classes2.jar:id/d.class */
public final /* synthetic */ class ExecutorC5222d implements Executor {

    /* renamed from: b */
    public static final Executor f29918b = new ExecutorC5222d();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
