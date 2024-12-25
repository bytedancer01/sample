package p107g1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g1/d.class
 */
/* renamed from: g1.d */
/* loaded from: combined.jar:classes1.jar:g1/d.class */
public abstract class AbstractC4932d<Params, Progress, Result> {

    /* renamed from: g */
    public static final ThreadFactory f28661g;

    /* renamed from: h */
    public static final BlockingQueue<Runnable> f28662h;

    /* renamed from: i */
    public static final Executor f28663i;

    /* renamed from: j */
    public static f f28664j;

    /* renamed from: k */
    public static volatile Executor f28665k;

    /* renamed from: b */
    public final h<Params, Result> f28666b;

    /* renamed from: c */
    public final FutureTask<Result> f28667c;

    /* renamed from: d */
    public volatile g f28668d = g.PENDING;

    /* renamed from: e */
    public final AtomicBoolean f28669e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f28670f = new AtomicBoolean();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$a.class
     */
    /* renamed from: g1.d$a */
    /* loaded from: combined.jar:classes1.jar:g1/d$a.class */
    public static final class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f28671a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f28671a.getAndIncrement());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$b.class
     */
    /* renamed from: g1.d$b */
    /* loaded from: combined.jar:classes1.jar:g1/d$b.class */
    public class b extends h<Params, Result> {

        /* renamed from: b */
        public final AbstractC4932d f28672b;

        public b(AbstractC4932d abstractC4932d) {
            this.f28672b = abstractC4932d;
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            this.f28672b.f28670f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                Result result2 = (Result) this.f28672b.mo24880b(this.f28677a);
                result = result2;
                Binder.flushPendingCommands();
                this.f28672b.m24924l(result2);
                return result2;
            } finally {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$c.class
     */
    /* renamed from: g1.d$c */
    /* loaded from: combined.jar:classes1.jar:g1/d$c.class */
    public class c extends FutureTask<Result> {

        /* renamed from: b */
        public final AbstractC4932d f28673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC4932d abstractC4932d, Callable callable) {
            super(callable);
            this.f28673b = abstractC4932d;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                this.f28673b.m24925m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException e11) {
                this.f28673b.m24925m(null);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$d.class
     */
    /* renamed from: g1.d$d */
    /* loaded from: combined.jar:classes1.jar:g1/d$d.class */
    public static /* synthetic */ class d {

        /* renamed from: a */
        public static final int[] f28674a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                g1.d$g[] r0 = p107g1.AbstractC4932d.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p107g1.AbstractC4932d.d.f28674a = r0
                r0 = r4
                g1.d$g r1 = p107g1.AbstractC4932d.g.RUNNING     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = p107g1.AbstractC4932d.d.f28674a     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                g1.d$g r1 = p107g1.AbstractC4932d.g.FINISHED     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: p107g1.AbstractC4932d.d.m44531clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$e.class
     */
    /* renamed from: g1.d$e */
    /* loaded from: combined.jar:classes1.jar:g1/d$e.class */
    public static class e<Data> {

        /* renamed from: a */
        public final AbstractC4932d f28675a;

        /* renamed from: b */
        public final Data[] f28676b;

        public e(AbstractC4932d abstractC4932d, Data... dataArr) {
            this.f28675a = abstractC4932d;
            this.f28676b = dataArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$f.class
     */
    /* renamed from: g1.d$f */
    /* loaded from: combined.jar:classes1.jar:g1/d$f.class */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f28675a.m24919d(eVar.f28676b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f28675a.m24923k(eVar.f28676b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$g.class
     */
    /* renamed from: g1.d$g */
    /* loaded from: combined.jar:classes1.jar:g1/d$g.class */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/d$h.class
     */
    /* renamed from: g1.d$h */
    /* loaded from: combined.jar:classes1.jar:g1/d$h.class */
    public static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        public Params[] f28677a;
    }

    static {
        a aVar = new a();
        f28661g = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f28662h = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f28663i = threadPoolExecutor;
        f28665k = threadPoolExecutor;
    }

    public AbstractC4932d() {
        b bVar = new b(this);
        this.f28666b = bVar;
        this.f28667c = new c(this, bVar);
    }

    /* renamed from: e */
    public static Handler m24916e() {
        f fVar;
        synchronized (AbstractC4932d.class) {
            try {
                if (f28664j == null) {
                    f28664j = new f();
                }
                fVar = f28664j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean m24917a(boolean z10) {
        this.f28669e.set(true);
        return this.f28667c.cancel(z10);
    }

    /* renamed from: b */
    public abstract Result mo24880b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC4932d<Params, Progress, Result> m24918c(Executor executor, Params... paramsArr) {
        if (this.f28668d == g.PENDING) {
            this.f28668d = g.RUNNING;
            m24922j();
            this.f28666b.f28677a = paramsArr;
            executor.execute(this.f28667c);
            return this;
        }
        int i10 = d.f28674a[this.f28668d.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    /* renamed from: d */
    public void m24919d(Result result) {
        if (m24920f()) {
            mo24881h(result);
        } else {
            mo24882i(result);
        }
        this.f28668d = g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m24920f() {
        return this.f28669e.get();
    }

    /* renamed from: g */
    public void m24921g() {
    }

    /* renamed from: h */
    public void mo24881h(Result result) {
        m24921g();
    }

    /* renamed from: i */
    public void mo24882i(Result result) {
    }

    /* renamed from: j */
    public void m24922j() {
    }

    /* renamed from: k */
    public void m24923k(Progress... progressArr) {
    }

    /* renamed from: l */
    public Result m24924l(Result result) {
        m24916e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    public void m24925m(Result result) {
        if (this.f28670f.get()) {
            return;
        }
        m24924l(result);
    }
}
