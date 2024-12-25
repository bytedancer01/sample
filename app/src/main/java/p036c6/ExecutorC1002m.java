package p036c6;

import java.util.concurrent.Executor;
import p124h6.C5036a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/m.class
 */
/* renamed from: c6.m */
/* loaded from: combined.jar:classes1.jar:c6/m.class */
public class ExecutorC1002m implements Executor {

    /* renamed from: b */
    public final Executor f6816b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/m$a.class
     */
    /* renamed from: c6.m$a */
    /* loaded from: combined.jar:classes1.jar:c6/m$a.class */
    public static class a implements Runnable {

        /* renamed from: b */
        public final Runnable f6817b;

        public a(Runnable runnable) {
            this.f6817b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f6817b.run();
            } catch (Exception e10) {
                C5036a.m25237c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public ExecutorC1002m(Executor executor) {
        this.f6816b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6816b.execute(new a(runnable));
    }
}
