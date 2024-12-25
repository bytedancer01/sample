package p071e2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/w.class
 */
/* renamed from: e2.w */
/* loaded from: combined.jar:classes1.jar:e2/w.class */
public abstract class AbstractC4594w {

    /* renamed from: a */
    public static final String f27243a = AbstractC4582k.m23128f("WorkerFactory");

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/w$a.class
     */
    /* renamed from: e2.w$a */
    /* loaded from: combined.jar:classes1.jar:e2/w$a.class */
    public class a extends AbstractC4594w {
        @Override // p071e2.AbstractC4594w
        /* renamed from: a */
        public ListenableWorker mo23158a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC4594w m23157c() {
        return new a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo23158a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker m23159b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker mo23158a = mo23158a(context, str, workerParameters);
        ListenableWorker listenableWorker = mo23158a;
        if (mo23158a == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th2) {
                AbstractC4582k.m23126c().mo23130b(f27243a, "Invalid class: " + str, th2);
            }
            listenableWorker = mo23158a;
            if (cls != null) {
                try {
                    listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    AbstractC4582k.m23126c().mo23130b(f27243a, "Could not instantiate " + str, th3);
                    listenableWorker = mo23158a;
                }
            }
        }
        if (listenableWorker == null || !listenableWorker.m4829l()) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
