package p287qc;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p405xc.C9720a;
import p405xc.InterfaceC9721b;
import p405xc.InterfaceC9722c;
import p405xc.InterfaceC9723d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/u.class
 */
/* renamed from: qc.u */
/* loaded from: combined.jar:classes2.jar:qc/u.class */
public class C7900u implements InterfaceC9723d, InterfaceC9722c {

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<InterfaceC9721b<Object>, Executor>> f38021a = new HashMap();

    /* renamed from: b */
    public Queue<C9720a<?>> f38022b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f38023c;

    public C7900u(Executor executor) {
        this.f38023c = executor;
    }

    @Override // p405xc.InterfaceC9723d
    /* renamed from: a */
    public <T> void mo34244a(Class<T> cls, InterfaceC9721b<? super T> interfaceC9721b) {
        mo34245b(cls, this.f38023c, interfaceC9721b);
    }

    @Override // p405xc.InterfaceC9723d
    /* renamed from: b */
    public <T> void mo34245b(Class<T> cls, Executor executor, InterfaceC9721b<? super T> interfaceC9721b) {
        synchronized (this) {
            C7881c0.m34163b(cls);
            C7881c0.m34163b(interfaceC9721b);
            C7881c0.m34163b(executor);
            if (!this.f38021a.containsKey(cls)) {
                this.f38021a.put(cls, new ConcurrentHashMap<>());
            }
            this.f38021a.get(cls).put(interfaceC9721b, executor);
        }
    }

    /* renamed from: c */
    public void m34246c() {
        Queue<C9720a<?>> queue;
        synchronized (this) {
            queue = this.f38022b;
            if (queue != null) {
                this.f38022b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<C9720a<?>> it = queue.iterator();
            while (it.hasNext()) {
                m34248f(it.next());
            }
        }
    }

    /* renamed from: d */
    public final Set<Map.Entry<InterfaceC9721b<Object>, Executor>> m34247d(C9720a<?> c9720a) {
        Set<Map.Entry<InterfaceC9721b<Object>, Executor>> emptySet;
        synchronized (this) {
            ConcurrentHashMap<InterfaceC9721b<Object>, Executor> concurrentHashMap = this.f38021a.get(c9720a.m41002b());
            emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
        }
        return emptySet;
    }

    /* renamed from: f */
    public void m34248f(C9720a<?> c9720a) {
        C7881c0.m34163b(c9720a);
        synchronized (this) {
            Queue<C9720a<?>> queue = this.f38022b;
            if (queue != null) {
                queue.add(c9720a);
                return;
            }
            for (Map.Entry<InterfaceC9721b<Object>, Executor> entry : m34247d(c9720a)) {
                entry.getValue().execute(RunnableC7899t.m34242a(entry, c9720a));
            }
        }
    }
}
