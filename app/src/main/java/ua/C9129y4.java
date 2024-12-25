package ua;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/y4.class
 */
/* renamed from: ua.y4 */
/* loaded from: combined.jar:classes2.jar:ua/y4.class */
public final class C9129y4 extends Thread {

    /* renamed from: b */
    public final Object f41799b;

    /* renamed from: c */
    public final BlockingQueue<C9118x4<?>> f41800c;

    /* renamed from: d */
    public boolean f41801d = false;

    /* renamed from: e */
    public final C9140z4 f41802e;

    public C9129y4(C9140z4 c9140z4, String str, BlockingQueue<C9118x4<?>> blockingQueue) {
        this.f41802e = c9140z4;
        C9935o.m41850j(str);
        C9935o.m41850j(blockingQueue);
        this.f41799b = new Object();
        this.f41800c = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m38419a() {
        synchronized (this.f41799b) {
            this.f41799b.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m38420b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C9129y4 c9129y4;
        C9129y4 c9129y42;
        obj = this.f41802e.f41826i;
        synchronized (obj) {
            if (!this.f41801d) {
                semaphore = this.f41802e.f41827j;
                semaphore.release();
                obj2 = this.f41802e.f41826i;
                obj2.notifyAll();
                c9129y4 = this.f41802e.f41820c;
                if (this == c9129y4) {
                    C9140z4.m38431z(this.f41802e, null);
                } else {
                    c9129y42 = this.f41802e.f41821d;
                    if (this == c9129y42) {
                        C9140z4.m38425B(this.f41802e, null);
                    } else {
                        this.f41802e.f41723a.mo37780c().m38408o().m38326a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f41801d = true;
            }
        }
    }

    /* renamed from: c */
    public final void m38421c(InterruptedException interruptedException) {
        this.f41802e.f41723a.mo37780c().m38411r().m38327b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.f41802e.f41827j;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                m38421c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C9118x4<?> poll = this.f41800c.poll();
                if (poll != null) {
                    Process.setThreadPriority(true != poll.f41745c ? 10 : threadPriority);
                    poll.run();
                } else {
                    synchronized (this.f41799b) {
                        if (this.f41800c.peek() == null) {
                            C9140z4.m38428w(this.f41802e);
                            try {
                                this.f41799b.wait(30000L);
                            } catch (InterruptedException e11) {
                                m38421c(e11);
                            }
                        }
                    }
                    obj = this.f41802e.f41826i;
                    synchronized (obj) {
                        if (this.f41800c.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.f41802e.f41723a.m37797z().m37900w(null, C8988m3.f41386r0)) {
                m38420b();
            }
        } finally {
            m38420b();
        }
    }
}
