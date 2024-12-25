package p173ji;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p253oi.C6981e;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/r.class
 */
/* renamed from: ji.r */
/* loaded from: combined.jar:classes2.jar:ji/r.class */
public final class C5427r {

    /* renamed from: c */
    @Nullable
    public Runnable f31120c;

    /* renamed from: d */
    public ExecutorService f31121d;

    /* renamed from: a */
    public int f31118a = 64;

    /* renamed from: b */
    public int f31119b = 5;

    /* renamed from: e */
    public final ArrayDeque<C6981e.a> f31122e = new ArrayDeque<>();

    /* renamed from: f */
    public final ArrayDeque<C6981e.a> f31123f = new ArrayDeque<>();

    /* renamed from: g */
    public final ArrayDeque<C6981e> f31124g = new ArrayDeque<>();

    /* renamed from: a */
    public final void m27029a(@NotNull C6981e.a aVar) {
        C6981e.a m27032d;
        C9367f.m39526e(aVar, "call");
        synchronized (this) {
            this.f31122e.add(aVar);
            if (!aVar.m32068b().m32059n() && (m27032d = m27032d(aVar.m32070d())) != null) {
                aVar.m32071e(m27032d);
            }
            C5398q c5398q = C5398q.f30770a;
        }
        m27036h();
    }

    /* renamed from: b */
    public final void m27030b(@NotNull C6981e c6981e) {
        synchronized (this) {
            C9367f.m39526e(c6981e, "call");
            this.f31124g.add(c6981e);
        }
    }

    @NotNull
    /* renamed from: c */
    public final ExecutorService m27031c() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.f31121d == null) {
                this.f31121d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C5634b.m27766J(C5634b.f31712i + " Dispatcher", false));
            }
            executorService = this.f31121d;
            C9367f.m39524c(executorService);
        }
        return executorService;
    }

    /* renamed from: d */
    public final C6981e.a m27032d(String str) {
        Iterator<C6981e.a> it = this.f31123f.iterator();
        while (it.hasNext()) {
            C6981e.a next = it.next();
            if (C9367f.m39522a(next.m32070d(), str)) {
                return next;
            }
        }
        Iterator<C6981e.a> it2 = this.f31122e.iterator();
        while (it2.hasNext()) {
            C6981e.a next2 = it2.next();
            if (C9367f.m39522a(next2.m32070d(), str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final <T> void m27033e(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f31120c;
            C5398q c5398q = C5398q.f30770a;
        }
        if (m27036h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: f */
    public final void m27034f(@NotNull C6981e.a aVar) {
        C9367f.m39526e(aVar, "call");
        aVar.m32069c().decrementAndGet();
        m27033e(this.f31123f, aVar);
    }

    /* renamed from: g */
    public final void m27035g(@NotNull C6981e c6981e) {
        C9367f.m39526e(c6981e, "call");
        m27033e(this.f31124g, c6981e);
    }

    /* renamed from: h */
    public final boolean m27036h() {
        int i10;
        boolean z10;
        if (C5634b.f31711h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C6981e.a> it = this.f31122e.iterator();
            C9367f.m39525d(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                C6981e.a next = it.next();
                if (this.f31123f.size() >= this.f31118a) {
                    break;
                }
                if (next.m32069c().get() < this.f31119b) {
                    it.remove();
                    next.m32069c().incrementAndGet();
                    C9367f.m39525d(next, "asyncCall");
                    arrayList.add(next);
                    this.f31123f.add(next);
                }
            }
            z10 = m27037i() > 0;
            C5398q c5398q = C5398q.f30770a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((C6981e.a) arrayList.get(i10)).m32067a(m27031c());
        }
        return z10;
    }

    /* renamed from: i */
    public final int m27037i() {
        int size;
        int size2;
        synchronized (this) {
            size = this.f31123f.size();
            size2 = this.f31124g.size();
        }
        return size + size2;
    }
}
