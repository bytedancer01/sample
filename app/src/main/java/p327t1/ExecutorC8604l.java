package p327t1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/l.class
 */
/* renamed from: t1.l */
/* loaded from: combined.jar:classes1.jar:t1/l.class */
public class ExecutorC8604l implements Executor {

    /* renamed from: b */
    public final Executor f40135b;

    /* renamed from: c */
    public final ArrayDeque<Runnable> f40136c = new ArrayDeque<>();

    /* renamed from: d */
    public Runnable f40137d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t1/l$a.class
     */
    /* renamed from: t1.l$a */
    /* loaded from: combined.jar:classes1.jar:t1/l$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final Runnable f40138b;

        /* renamed from: c */
        public final ExecutorC8604l f40139c;

        public a(ExecutorC8604l executorC8604l, Runnable runnable) {
            this.f40139c = executorC8604l;
            this.f40138b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f40138b.run();
            } finally {
                this.f40139c.m36954a();
            }
        }
    }

    public ExecutorC8604l(Executor executor) {
        this.f40135b = executor;
    }

    /* renamed from: a */
    public void m36954a() {
        synchronized (this) {
            Runnable poll = this.f40136c.poll();
            this.f40137d = poll;
            if (poll != null) {
                this.f40135b.execute(poll);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this) {
            this.f40136c.offer(new a(this, runnable));
            if (this.f40137d == null) {
                m36954a();
            }
        }
    }
}
