package p174k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k/c.class
 */
/* renamed from: k.c */
/* loaded from: combined.jar:classes1.jar:k/c.class */
public class C5438c extends AbstractC5439d {

    /* renamed from: a */
    public final Object f31179a = new Object();

    /* renamed from: b */
    public final ExecutorService f31180b = Executors.newFixedThreadPool(4, new a(this));

    /* renamed from: c */
    public volatile Handler f31181c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k/c$a.class
     */
    /* renamed from: k.c$a */
    /* loaded from: combined.jar:classes1.jar:k/c$a.class */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f31182a = new AtomicInteger(0);

        /* renamed from: b */
        public final C5438c f31183b;

        public a(C5438c c5438c) {
            this.f31183b = c5438c;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f31182a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    public static Handler m27186d(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e10) {
            return new Handler(looper);
        } catch (InvocationTargetException e11) {
            return new Handler(looper);
        }
    }

    @Override // p174k.AbstractC5439d
    /* renamed from: a */
    public void mo27182a(Runnable runnable) {
        this.f31180b.execute(runnable);
    }

    @Override // p174k.AbstractC5439d
    /* renamed from: b */
    public boolean mo27183b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p174k.AbstractC5439d
    /* renamed from: c */
    public void mo27184c(Runnable runnable) {
        if (this.f31181c == null) {
            synchronized (this.f31179a) {
                if (this.f31181c == null) {
                    this.f31181c = m27186d(Looper.getMainLooper());
                }
            }
        }
        this.f31181c.post(runnable);
    }
}
