package cg;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/g.class
 */
/* renamed from: cg.g */
/* loaded from: combined.jar:classes2.jar:cg/g.class */
public enum EnumC1094g implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
