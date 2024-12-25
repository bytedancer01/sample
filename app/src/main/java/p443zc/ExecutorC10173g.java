package p443zc;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/g.class
 */
/* renamed from: zc.g */
/* loaded from: combined.jar:classes2.jar:zc/g.class */
public final /* synthetic */ class ExecutorC10173g implements Executor {

    /* renamed from: b */
    public static final Executor f46623b = new ExecutorC10173g();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
