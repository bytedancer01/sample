package p175k0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/d.class
 */
/* renamed from: k0.d */
/* loaded from: combined.jar:classes1.jar:k0/d.class */
public final class C5443d {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k0/d$a.class
     */
    /* renamed from: k0.d$a */
    /* loaded from: combined.jar:classes1.jar:k0/d$a.class */
    public static class a implements Executor {

        /* renamed from: b */
        public final Handler f31188b;

        public a(Handler handler) {
            this.f31188b = (Handler) C6616h.m30527e(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f31188b.post((Runnable) C6616h.m30527e(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f31188b + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m27196a(Handler handler) {
        return new a(handler);
    }
}
