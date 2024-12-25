package p443zc;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/j.class
 */
/* renamed from: zc.j */
/* loaded from: combined.jar:classes2.jar:zc/j.class */
public final /* synthetic */ class ExecutorC10176j implements Executor {

    /* renamed from: b */
    public static final Executor f46628b = new ExecutorC10176j();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
