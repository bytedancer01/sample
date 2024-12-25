package p395x2;

import android.os.Process;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import p395x2.AbstractC9635n;
import p395x2.InterfaceC9623b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/c.class
 */
/* renamed from: x2.c */
/* loaded from: combined.jar:classes1.jar:x2/c.class */
public class C9624c extends Thread {

    /* renamed from: h */
    public static final boolean f43952h = C9643v.f44021b;

    /* renamed from: b */
    public final BlockingQueue<AbstractC9635n<?>> f43953b;

    /* renamed from: c */
    public final BlockingQueue<AbstractC9635n<?>> f43954c;

    /* renamed from: d */
    public final InterfaceC9623b f43955d;

    /* renamed from: e */
    public final InterfaceC9638q f43956e;

    /* renamed from: f */
    public volatile boolean f43957f = false;

    /* renamed from: g */
    public final b f43958g = new b(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/c$a.class
     */
    /* renamed from: x2.c$a */
    /* loaded from: combined.jar:classes1.jar:x2/c$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final AbstractC9635n f43959b;

        /* renamed from: c */
        public final C9624c f43960c;

        public a(C9624c c9624c, AbstractC9635n abstractC9635n) {
            this.f43960c = c9624c;
            this.f43959b = abstractC9635n;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f43960c.f43954c.put(this.f43959b);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/c$b.class
     */
    /* renamed from: x2.c$b */
    /* loaded from: combined.jar:classes1.jar:x2/c$b.class */
    public static class b implements AbstractC9635n.b {

        /* renamed from: a */
        public final Map<String, List<AbstractC9635n<?>>> f43961a = new HashMap();

        /* renamed from: b */
        public final C9624c f43962b;

        public b(C9624c c9624c) {
            this.f43962b = c9624c;
        }

        @Override // p395x2.AbstractC9635n.b
        /* renamed from: a */
        public void mo40508a(AbstractC9635n<?> abstractC9635n, C9637p<?> c9637p) {
            List<AbstractC9635n<?>> remove;
            InterfaceC9623b.a aVar = c9637p.f44015b;
            if (aVar == null || aVar.m40500a()) {
                mo40509b(abstractC9635n);
                return;
            }
            String m40556p = abstractC9635n.m40556p();
            synchronized (this) {
                remove = this.f43961a.remove(m40556p);
            }
            if (remove != null) {
                if (C9643v.f44021b) {
                    C9643v.m40581e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m40556p);
                }
                Iterator<AbstractC9635n<?>> it = remove.iterator();
                while (it.hasNext()) {
                    this.f43962b.f43956e.mo40517c(it.next(), c9637p);
                }
            }
        }

        @Override // p395x2.AbstractC9635n.b
        /* renamed from: b */
        public void mo40509b(AbstractC9635n<?> abstractC9635n) {
            synchronized (this) {
                String m40556p = abstractC9635n.m40556p();
                List<AbstractC9635n<?>> remove = this.f43961a.remove(m40556p);
                if (remove != null && !remove.isEmpty()) {
                    if (C9643v.f44021b) {
                        C9643v.m40581e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), m40556p);
                    }
                    AbstractC9635n<?> remove2 = remove.remove(0);
                    this.f43961a.put(m40556p, remove);
                    remove2.m40540K(this);
                    try {
                        this.f43962b.f43954c.put(remove2);
                    } catch (InterruptedException e10) {
                        C9643v.m40579c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        this.f43962b.m40506e();
                    }
                }
            }
        }

        /* renamed from: d */
        public final boolean m40510d(AbstractC9635n<?> abstractC9635n) {
            synchronized (this) {
                String m40556p = abstractC9635n.m40556p();
                if (!this.f43961a.containsKey(m40556p)) {
                    this.f43961a.put(m40556p, null);
                    abstractC9635n.m40540K(this);
                    if (C9643v.f44021b) {
                        C9643v.m40578b("new request, sending to network %s", m40556p);
                    }
                    return false;
                }
                List<AbstractC9635n<?>> list = this.f43961a.get(m40556p);
                List<AbstractC9635n<?>> list2 = list;
                if (list == null) {
                    list2 = new ArrayList<>();
                }
                abstractC9635n.m40546b("waiting-for-response");
                list2.add(abstractC9635n);
                this.f43961a.put(m40556p, list2);
                if (C9643v.f44021b) {
                    C9643v.m40578b("Request for cacheKey=%s is in flight, putting on hold.", m40556p);
                }
                return true;
            }
        }
    }

    public C9624c(BlockingQueue<AbstractC9635n<?>> blockingQueue, BlockingQueue<AbstractC9635n<?>> blockingQueue2, InterfaceC9623b interfaceC9623b, InterfaceC9638q interfaceC9638q) {
        this.f43953b = blockingQueue;
        this.f43954c = blockingQueue2;
        this.f43955d = interfaceC9623b;
        this.f43956e = interfaceC9638q;
    }

    /* renamed from: c */
    private void m40504c() {
        m40505d(this.f43953b.take());
    }

    /* renamed from: d */
    public void m40505d(AbstractC9635n<?> abstractC9635n) {
        abstractC9635n.m40546b("cache-queue-take");
        if (abstractC9635n.m40533D()) {
            abstractC9635n.m40552j("cache-discard-canceled");
            return;
        }
        InterfaceC9623b.a aVar = this.f43955d.get(abstractC9635n.m40556p());
        if (aVar == null) {
            abstractC9635n.m40546b("cache-miss");
            if (this.f43958g.m40510d(abstractC9635n)) {
                return;
            }
            this.f43954c.put(abstractC9635n);
            return;
        }
        if (aVar.m40500a()) {
            abstractC9635n.m40546b("cache-hit-expired");
            abstractC9635n.m40539J(aVar);
            if (this.f43958g.m40510d(abstractC9635n)) {
                return;
            }
            this.f43954c.put(abstractC9635n);
            return;
        }
        abstractC9635n.m40546b("cache-hit");
        C9637p<?> mo40538I = abstractC9635n.mo40538I(new C9632k(aVar.f43944a, aVar.f43950g));
        abstractC9635n.m40546b("cache-hit-parsed");
        if (aVar.m40501b()) {
            abstractC9635n.m40546b("cache-hit-refresh-needed");
            abstractC9635n.m40539J(aVar);
            mo40538I.f44017d = true;
            if (!this.f43958g.m40510d(abstractC9635n)) {
                this.f43956e.mo40515a(abstractC9635n, mo40538I, new a(this, abstractC9635n));
                return;
            }
        }
        this.f43956e.mo40517c(abstractC9635n, mo40538I);
    }

    /* renamed from: e */
    public void m40506e() {
        this.f43957f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f43952h) {
            C9643v.m40581e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f43955d.initialize();
        while (true) {
            try {
                m40504c();
            } catch (InterruptedException e10) {
                if (this.f43957f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C9643v.m40579c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
