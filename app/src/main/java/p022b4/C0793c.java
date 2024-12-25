package p022b4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p396x3.InterfaceC9646c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b4/c.class
 */
/* renamed from: b4.c */
/* loaded from: combined.jar:classes1.jar:b4/c.class */
public final class C0793c {

    /* renamed from: a */
    public final Map<InterfaceC9646c, b> f5528a = new HashMap();

    /* renamed from: b */
    public final c f5529b = new c();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b4/c$b.class
     */
    /* renamed from: b4.c$b */
    /* loaded from: combined.jar:classes1.jar:b4/c$b.class */
    public static class b {

        /* renamed from: a */
        public final Lock f5530a;

        /* renamed from: b */
        public int f5531b;

        public b() {
            this.f5530a = new ReentrantLock();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b4/c$c.class
     */
    /* renamed from: b4.c$c */
    /* loaded from: combined.jar:classes1.jar:b4/c$c.class */
    public static class c {

        /* renamed from: a */
        public final Queue<b> f5532a;

        public c() {
            this.f5532a = new ArrayDeque();
        }

        /* renamed from: a */
        public b m5095a() {
            b poll;
            synchronized (this.f5532a) {
                poll = this.f5532a.poll();
            }
            b bVar = poll;
            if (poll == null) {
                bVar = new b();
            }
            return bVar;
        }

        /* renamed from: b */
        public void m5096b(b bVar) {
            synchronized (this.f5532a) {
                if (this.f5532a.size() < 10) {
                    this.f5532a.offer(bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void m5093a(InterfaceC9646c interfaceC9646c) {
        b bVar;
        synchronized (this) {
            b bVar2 = this.f5528a.get(interfaceC9646c);
            bVar = bVar2;
            if (bVar2 == null) {
                bVar = this.f5529b.m5095a();
                this.f5528a.put(interfaceC9646c, bVar);
            }
            bVar.f5531b++;
        }
        bVar.f5530a.lock();
    }

    /* renamed from: b */
    public void m5094b(InterfaceC9646c interfaceC9646c) {
        b bVar;
        synchronized (this) {
            bVar = this.f5528a.get(interfaceC9646c);
            if (bVar != null) {
                int i10 = bVar.f5531b;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    bVar.f5531b = i11;
                    if (i11 == 0) {
                        b remove = this.f5528a.remove(interfaceC9646c);
                        if (!remove.equals(bVar)) {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + remove + ", key: " + interfaceC9646c);
                        }
                        this.f5529b.m5096b(remove);
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot release a lock that is not held, key: ");
            sb2.append(interfaceC9646c);
            sb2.append(", interestedThreads: ");
            sb2.append(bVar == null ? 0 : bVar.f5531b);
            throw new IllegalArgumentException(sb2.toString());
        }
        bVar.f5530a.unlock();
    }
}
