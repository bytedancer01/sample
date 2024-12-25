package p208m1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/a.class
 */
/* renamed from: m1.a */
/* loaded from: combined.jar:classes1.jar:m1/a.class */
public final /* synthetic */ class ExecutorC5892a implements Executor {

    /* renamed from: b */
    public final Handler f33005b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f33005b.post(runnable);
    }
}
