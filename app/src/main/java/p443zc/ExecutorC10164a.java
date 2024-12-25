package p443zc;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/a.class
 */
/* renamed from: zc.a */
/* loaded from: combined.jar:classes2.jar:zc/a.class */
public final /* synthetic */ class ExecutorC10164a implements Executor {

    /* renamed from: b */
    public static final Executor f46602b = new ExecutorC10164a();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
