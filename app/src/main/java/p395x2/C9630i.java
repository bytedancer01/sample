package p395x2;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/i.class
 */
/* renamed from: x2.i */
/* loaded from: combined.jar:classes1.jar:x2/i.class */
public class C9630i extends Thread {

    /* renamed from: b */
    public final BlockingQueue<AbstractC9635n<?>> f43975b;

    /* renamed from: c */
    public final InterfaceC9629h f43976c;

    /* renamed from: d */
    public final InterfaceC9623b f43977d;

    /* renamed from: e */
    public final InterfaceC9638q f43978e;

    /* renamed from: f */
    public volatile boolean f43979f = false;

    public C9630i(BlockingQueue<AbstractC9635n<?>> blockingQueue, InterfaceC9629h interfaceC9629h, InterfaceC9623b interfaceC9623b, InterfaceC9638q interfaceC9638q) {
        this.f43975b = blockingQueue;
        this.f43976c = interfaceC9629h;
        this.f43977d = interfaceC9623b;
        this.f43978e = interfaceC9638q;
    }

    /* renamed from: c */
    private void m40521c() {
        m40524d(this.f43975b.take());
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void m40522a(AbstractC9635n<?> abstractC9635n) {
        TrafficStats.setThreadStatsTag(abstractC9635n.m40530A());
    }

    /* renamed from: b */
    public final void m40523b(AbstractC9635n<?> abstractC9635n, C9642u c9642u) {
        this.f43978e.mo40516b(abstractC9635n, abstractC9635n.m40537H(c9642u));
    }

    /* renamed from: d */
    public void m40524d(AbstractC9635n<?> abstractC9635n) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            abstractC9635n.m40546b("network-queue-take");
            if (abstractC9635n.m40533D()) {
                abstractC9635n.m40552j("network-discard-cancelled");
                abstractC9635n.m40535F();
                return;
            }
            m40522a(abstractC9635n);
            C9632k mo40520a = this.f43976c.mo40520a(abstractC9635n);
            abstractC9635n.m40546b("network-http-complete");
            if (mo40520a.f43984e && abstractC9635n.m40532C()) {
                abstractC9635n.m40552j("not-modified");
                abstractC9635n.m40535F();
                return;
            }
            C9637p<?> mo40538I = abstractC9635n.mo40538I(mo40520a);
            abstractC9635n.m40546b("network-parse-complete");
            if (abstractC9635n.m40544O() && mo40538I.f44015b != null) {
                this.f43977d.mo40499a(abstractC9635n.m40556p(), mo40538I.f44015b);
                abstractC9635n.m40546b("network-cache-written");
            }
            abstractC9635n.m40534E();
            this.f43978e.mo40517c(abstractC9635n, mo40538I);
            abstractC9635n.m40536G(mo40538I);
        } catch (C9642u e10) {
            e10.m40576a(SystemClock.elapsedRealtime() - elapsedRealtime);
            m40523b(abstractC9635n, e10);
            abstractC9635n.m40535F();
        } catch (Exception e11) {
            C9643v.m40580d(e11, "Unhandled exception %s", e11.toString());
            C9642u c9642u = new C9642u(e11);
            c9642u.m40576a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f43978e.mo40516b(abstractC9635n, c9642u);
            abstractC9635n.m40535F();
        }
    }

    /* renamed from: e */
    public void m40525e() {
        this.f43979f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m40521c();
            } catch (InterruptedException e10) {
                if (this.f43979f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C9643v.m40579c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
