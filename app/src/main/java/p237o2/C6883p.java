package p237o2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p071e2.AbstractC4582k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/p.class
 */
/* renamed from: o2.p */
/* loaded from: combined.jar:classes1.jar:o2/p.class */
public class C6883p {

    /* renamed from: f */
    public static final String f35673f = AbstractC4582k.m23128f("WorkTimer");

    /* renamed from: a */
    public final ThreadFactory f35674a;

    /* renamed from: b */
    public final ScheduledExecutorService f35675b;

    /* renamed from: c */
    public final Map<String, c> f35676c;

    /* renamed from: d */
    public final Map<String, b> f35677d;

    /* renamed from: e */
    public final Object f35678e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/p$a.class
     */
    /* renamed from: o2.p$a */
    /* loaded from: combined.jar:classes1.jar:o2/p$a.class */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public int f35679a = 0;

        /* renamed from: b */
        public final C6883p f35680b;

        public a(C6883p c6883p) {
            this.f35680b = c6883p;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f35679a);
            this.f35679a = this.f35679a + 1;
            return newThread;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/p$b.class
     */
    /* renamed from: o2.p$b */
    /* loaded from: combined.jar:classes1.jar:o2/p$b.class */
    public interface b {
        /* renamed from: a */
        void mo4941a(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/p$c.class
     */
    /* renamed from: o2.p$c */
    /* loaded from: combined.jar:classes1.jar:o2/p$c.class */
    public static class c implements Runnable {

        /* renamed from: b */
        public final C6883p f35681b;

        /* renamed from: c */
        public final String f35682c;

        public c(C6883p c6883p, String str) {
            this.f35681b = c6883p;
            this.f35682c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f35681b.f35678e) {
                if (this.f35681b.f35676c.remove(this.f35682c) != null) {
                    b remove = this.f35681b.f35677d.remove(this.f35682c);
                    if (remove != null) {
                        remove.mo4941a(this.f35682c);
                    }
                } else {
                    AbstractC4582k.m23126c().mo23129a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f35682c), new Throwable[0]);
                }
            }
        }
    }

    public C6883p() {
        a aVar = new a(this);
        this.f35674a = aVar;
        this.f35676c = new HashMap();
        this.f35677d = new HashMap();
        this.f35678e = new Object();
        this.f35675b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void m31721a() {
        if (this.f35675b.isShutdown()) {
            return;
        }
        this.f35675b.shutdownNow();
    }

    /* renamed from: b */
    public void m31722b(String str, long j10, b bVar) {
        synchronized (this.f35678e) {
            AbstractC4582k.m23126c().mo23129a(f35673f, String.format("Starting timer for %s", str), new Throwable[0]);
            m31723c(str);
            c cVar = new c(this, str);
            this.f35676c.put(str, cVar);
            this.f35677d.put(str, bVar);
            this.f35675b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void m31723c(String str) {
        synchronized (this.f35678e) {
            if (this.f35676c.remove(str) != null) {
                AbstractC4582k.m23126c().mo23129a(f35673f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f35677d.remove(str);
            }
        }
    }
}
