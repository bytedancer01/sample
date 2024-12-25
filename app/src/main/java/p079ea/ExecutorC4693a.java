package p079ea;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p245oa.HandlerC6962i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ea/a.class
 */
/* renamed from: ea.a */
/* loaded from: combined.jar:classes2.jar:ea/a.class */
public class ExecutorC4693a implements Executor {

    /* renamed from: b */
    public final Handler f27697b;

    public ExecutorC4693a(Looper looper) {
        this.f27697b = new HandlerC6962i(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27697b.post(runnable);
    }
}
