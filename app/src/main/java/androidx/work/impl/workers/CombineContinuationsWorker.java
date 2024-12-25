package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/workers/CombineContinuationsWorker.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/workers/CombineContinuationsWorker.class */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    /* renamed from: r */
    public ListenableWorker.AbstractC0753a mo4842r() {
        return ListenableWorker.AbstractC0753a.m4836d(m4824g());
    }
}
