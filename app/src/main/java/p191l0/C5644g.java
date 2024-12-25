package p191l0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p221n0.InterfaceC6609a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l0/g.class
 */
/* renamed from: l0.g */
/* loaded from: combined.jar:classes1.jar:l0/g.class */
public class C5644g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/g$a.class
     */
    /* renamed from: l0.g$a */
    /* loaded from: combined.jar:classes1.jar:l0/g$a.class */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public String f31770a;

        /* renamed from: b */
        public int f31771b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:l0/g$a$a.class
         */
        /* renamed from: l0.g$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:l0/g$a$a.class */
        public static class C10312a extends Thread {

            /* renamed from: b */
            public final int f31772b;

            public C10312a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f31772b = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f31772b);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f31770a = str;
            this.f31771b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C10312a(runnable, this.f31770a, this.f31771b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/g$b.class
     */
    /* renamed from: l0.g$b */
    /* loaded from: combined.jar:classes1.jar:l0/g$b.class */
    public static class b<T> implements Runnable {

        /* renamed from: b */
        public Callable<T> f31773b;

        /* renamed from: c */
        public InterfaceC6609a<T> f31774c;

        /* renamed from: d */
        public Handler f31775d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:l0/g$b$a.class
         */
        /* renamed from: l0.g$b$a */
        /* loaded from: combined.jar:classes1.jar:l0/g$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final InterfaceC6609a f31776b;

            /* renamed from: c */
            public final Object f31777c;

            /* renamed from: d */
            public final b f31778d;

            public a(b bVar, InterfaceC6609a interfaceC6609a, Object obj) {
                this.f31778d = bVar;
                this.f31776b = interfaceC6609a;
                this.f31777c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f31776b.accept(this.f31777c);
            }
        }

        public b(Handler handler, Callable<T> callable, InterfaceC6609a<T> interfaceC6609a) {
            this.f31773b = callable;
            this.f31774c = interfaceC6609a;
            this.f31775d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f31773b.call();
            } catch (Exception e10) {
                t10 = null;
            }
            this.f31775d.post(new a(this, this.f31774c, t10));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m27859a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static <T> void m27860b(Executor executor, Callable<T> callable, InterfaceC6609a<T> interfaceC6609a) {
        executor.execute(new b(C5639b.m27824a(), callable, interfaceC6609a));
    }

    /* renamed from: c */
    public static <T> T m27861c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException e12) {
            throw new InterruptedException("timeout");
        }
    }
}
