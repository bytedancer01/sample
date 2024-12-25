package p034c4;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c4/a.class
 */
/* renamed from: c4.a */
/* loaded from: combined.jar:classes1.jar:c4/a.class */
public class C0987a extends ThreadPoolExecutor {

    /* renamed from: b */
    public final AtomicInteger f6742b;

    /* renamed from: c */
    public final d f6743c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c4/a$b.class
     */
    /* renamed from: c4.a$b */
    /* loaded from: combined.jar:classes1.jar:c4/a$b.class */
    public static class b implements ThreadFactory {

        /* renamed from: a */
        public int f6744a = 0;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c4/a$b$a.class
         */
        /* renamed from: c4.a$b$a */
        /* loaded from: combined.jar:classes1.jar:c4/a$b$a.class */
        public class a extends Thread {

            /* renamed from: b */
            public final b f6745b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Runnable runnable, String str) {
                super(runnable, str);
                this.f6745b = bVar;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            a aVar = new a(this, runnable, "fifo-pool-thread-" + this.f6744a);
            this.f6744a = this.f6744a + 1;
            return aVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c4/a$c.class
     */
    /* renamed from: c4.a$c */
    /* loaded from: combined.jar:classes1.jar:c4/a$c.class */
    public static class c<T> extends FutureTask<T> implements Comparable<c<?>> {

        /* renamed from: b */
        public final int f6746b;

        /* renamed from: c */
        public final int f6747c;

        public c(Runnable runnable, T t10, int i10) {
            super(runnable, t10);
            if (!(runnable instanceof InterfaceC0988b)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.f6746b = ((InterfaceC0988b) runnable).getPriority();
            this.f6747c = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c<?> cVar) {
            int i10 = this.f6746b - cVar.f6746b;
            int i11 = i10;
            if (i10 == 0) {
                i11 = this.f6747c - cVar.f6747c;
            }
            return i11;
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof c) {
                c cVar = (c) obj;
                z10 = false;
                if (this.f6747c == cVar.f6747c) {
                    z10 = false;
                    if (this.f6746b == cVar.f6746b) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public int hashCode() {
            return (this.f6746b * 31) + this.f6747c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c4/a$d.class
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: c4.a$d */
    /* loaded from: combined.jar:classes1.jar:c4/a$d.class */
    public static class d {
        private static final d[] $VALUES;
        public static final d IGNORE;
        public static final d LOG;
        public static final d THROW;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c4/a$d$a.class
         */
        /* renamed from: c4.a$d$a */
        /* loaded from: combined.jar:classes1.jar:c4/a$d$a.class */
        public enum a extends d {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // p034c4.C0987a.d
            public void handle(Throwable th2) {
                if (Log.isLoggable("PriorityExecutor", 6)) {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", th2);
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:c4/a$d$b.class
         */
        /* renamed from: c4.a$d$b */
        /* loaded from: combined.jar:classes1.jar:c4/a$d$b.class */
        public enum b extends d {
            public b(String str, int i10) {
                super(str, i10);
            }

            @Override // p034c4.C0987a.d
            public void handle(Throwable th2) {
                super.handle(th2);
                throw new RuntimeException(th2);
            }
        }

        static {
            d dVar = new d("IGNORE", 0);
            IGNORE = dVar;
            a aVar = new a("LOG", 1);
            LOG = aVar;
            b bVar = new b("THROW", 2);
            THROW = bVar;
            $VALUES = new d[]{dVar, aVar, bVar};
        }

        private d(String str, int i10) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public void handle(Throwable th2) {
        }
    }

    public C0987a(int i10) {
        this(i10, d.LOG);
    }

    public C0987a(int i10, int i11, long j10, TimeUnit timeUnit, ThreadFactory threadFactory, d dVar) {
        super(i10, i11, j10, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f6742b = new AtomicInteger();
        this.f6743c = dVar;
    }

    public C0987a(int i10, d dVar) {
        this(i10, i10, 0L, TimeUnit.MILLISECONDS, new b(), dVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        if (th2 == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (!future.isDone() || future.isCancelled()) {
                return;
            }
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f6743c.handle(e10);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t10) {
        return new c(runnable, t10, this.f6742b.getAndIncrement());
    }
}
