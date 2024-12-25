package za;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import sa.HandlerC8552a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/g0.class
 */
/* renamed from: za.g0 */
/* loaded from: combined.jar:classes2.jar:za/g0.class */
public final class ExecutorC10141g0 implements Executor {

    /* renamed from: b */
    public final Handler f46562b = new HandlerC8552a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f46562b.post(runnable);
    }
}
