package p247oc;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oc/c.class
 */
/* renamed from: oc.c */
/* loaded from: combined.jar:classes2.jar:oc/c.class */
public final /* synthetic */ class ExecutorC6966c implements Executor {

    /* renamed from: b */
    public static final Executor f35942b = new ExecutorC6966c();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
