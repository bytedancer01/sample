package p237o2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/i.class
 */
/* renamed from: o2.i */
/* loaded from: combined.jar:classes1.jar:o2/i.class */
public class ExecutorC6876i implements Executor {

    /* renamed from: c */
    public final Executor f35636c;

    /* renamed from: e */
    public volatile Runnable f35638e;

    /* renamed from: b */
    public final ArrayDeque<a> f35635b = new ArrayDeque<>();

    /* renamed from: d */
    public final Object f35637d = new Object();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/i$a.class
     */
    /* renamed from: o2.i$a */
    /* loaded from: combined.jar:classes1.jar:o2/i$a.class */
    public static class a implements Runnable {

        /* renamed from: b */
        public final ExecutorC6876i f35639b;

        /* renamed from: c */
        public final Runnable f35640c;

        public a(ExecutorC6876i executorC6876i, Runnable runnable) {
            this.f35639b = executorC6876i;
            this.f35640c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35640c.run();
            } finally {
                this.f35639b.m31717b();
            }
        }
    }

    public ExecutorC6876i(Executor executor) {
        this.f35636c = executor;
    }

    /* renamed from: a */
    public boolean m31716a() {
        boolean z10;
        synchronized (this.f35637d) {
            z10 = !this.f35635b.isEmpty();
        }
        return z10;
    }

    /* renamed from: b */
    public void m31717b() {
        synchronized (this.f35637d) {
            a poll = this.f35635b.poll();
            this.f35638e = poll;
            if (poll != null) {
                this.f35636c.execute(this.f35638e);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f35637d) {
            this.f35635b.add(new a(this, runnable));
            if (this.f35638e == null) {
                m31717b();
            }
        }
    }
}
