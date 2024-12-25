package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import lc.InterfaceFutureC5838a;
import p263p2.C7546c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/Worker.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/Worker.class */
public abstract class Worker extends ListenableWorker {

    /* renamed from: g */
    public C7546c<ListenableWorker.AbstractC0753a> f5144g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/Worker$a.class
     */
    /* renamed from: androidx.work.Worker$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/Worker$a.class */
    public class RunnableC0754a implements Runnable {

        /* renamed from: b */
        public final Worker f5145b;

        public RunnableC0754a(Worker worker) {
            this.f5145b = worker;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5145b.f5144g.mo32291p(this.f5145b.mo4842r());
            } catch (Throwable th2) {
                this.f5145b.f5144g.mo32292q(th2);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: p */
    public final InterfaceFutureC5838a<ListenableWorker.AbstractC0753a> mo4810p() {
        this.f5144g = C7546c.m32302t();
        m4822c().execute(new RunnableC0754a(this));
        return this.f5144g;
    }

    /* renamed from: r */
    public abstract ListenableWorker.AbstractC0753a mo4842r();
}
