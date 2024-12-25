package p263p2;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p2/b.class
 */
/* renamed from: p2.b */
/* loaded from: combined.jar:classes1.jar:p2/b.class */
public enum EnumC7545b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
