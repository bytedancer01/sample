package p287qc;

import android.util.Log;
import bd.InterfaceC0891b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p383w9.C9436a3;
import p405xc.InterfaceC9722c;
import p405xc.InterfaceC9723d;
import sc.InterfaceC8554a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/n.class
 */
/* renamed from: qc.n */
/* loaded from: combined.jar:classes2.jar:qc/n.class */
public class C7893n extends AbstractC7876a implements InterfaceC8554a {

    /* renamed from: g */
    public static final InterfaceC0891b<Set<Object>> f37999g = C7892m.m34202a();

    /* renamed from: a */
    public final Map<C7882d<?>, InterfaceC0891b<?>> f38000a;

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC0891b<?>> f38001b;

    /* renamed from: c */
    public final Map<Class<?>, C7903x<?>> f38002c;

    /* renamed from: d */
    public final List<InterfaceC0891b<InterfaceC7888i>> f38003d;

    /* renamed from: e */
    public final C7900u f38004e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f38005f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qc/n$b.class
     */
    /* renamed from: qc.n$b */
    /* loaded from: combined.jar:classes2.jar:qc/n$b.class */
    public static final class b {

        /* renamed from: a */
        public final Executor f38006a;

        /* renamed from: b */
        public final List<InterfaceC0891b<InterfaceC7888i>> f38007b = new ArrayList();

        /* renamed from: c */
        public final List<C7882d<?>> f38008c = new ArrayList();

        public b(Executor executor) {
            this.f38006a = executor;
        }

        /* renamed from: e */
        public static /* synthetic */ InterfaceC7888i m34215e(InterfaceC7888i interfaceC7888i) {
            return interfaceC7888i;
        }

        /* renamed from: a */
        public b m34216a(C7882d<?> c7882d) {
            this.f38008c.add(c7882d);
            return this;
        }

        /* renamed from: b */
        public b m34217b(InterfaceC7888i interfaceC7888i) {
            this.f38007b.add(C7894o.m34220a(interfaceC7888i));
            return this;
        }

        /* renamed from: c */
        public b m34218c(Collection<InterfaceC0891b<InterfaceC7888i>> collection) {
            this.f38007b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public C7893n m34219d() {
            return new C7893n(this.f38006a, this.f38007b, this.f38008c);
        }
    }

    public C7893n(Executor executor, Iterable<InterfaceC0891b<InterfaceC7888i>> iterable, Collection<C7882d<?>> collection) {
        this.f38000a = new HashMap();
        this.f38001b = new HashMap();
        this.f38002c = new HashMap();
        this.f38005f = new AtomicReference<>();
        C7900u c7900u = new C7900u(executor);
        this.f38004e = c7900u;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C7882d.m34172n(c7900u, C7900u.class, InterfaceC9723d.class, InterfaceC9722c.class));
        arrayList.add(C7882d.m34172n(this, InterfaceC8554a.class, new Class[0]));
        for (C7882d<?> c7882d : collection) {
            if (c7882d != null) {
                arrayList.add(c7882d);
            }
        }
        this.f38003d = m34204h(iterable);
        m34208e(arrayList);
    }

    /* renamed from: d */
    public static b m34203d(Executor executor) {
        return new b(executor);
    }

    /* renamed from: h */
    public static <T> List<T> m34204h(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // p287qc.InterfaceC7884e
    /* renamed from: a */
    public <T> InterfaceC0891b<Set<T>> mo34189a(Class<T> cls) {
        synchronized (this) {
            C7903x<?> c7903x = this.f38002c.get(cls);
            if (c7903x != null) {
                return c7903x;
            }
            return (InterfaceC0891b<Set<T>>) f37999g;
        }
    }

    @Override // p287qc.AbstractC7876a, p287qc.InterfaceC7884e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Set mo34154b(Class cls) {
        return super.mo34154b(cls);
    }

    @Override // p287qc.InterfaceC7884e
    /* renamed from: c */
    public <T> InterfaceC0891b<T> mo34190c(Class<T> cls) {
        InterfaceC0891b<T> interfaceC0891b;
        synchronized (this) {
            C7881c0.m34164c(cls, "Null interface requested.");
            interfaceC0891b = (InterfaceC0891b) this.f38001b.get(cls);
        }
        return interfaceC0891b;
    }

    /* renamed from: e */
    public final void m34208e(List<C7882d<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC0891b<InterfaceC7888i>> it = this.f38003d.iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC7888i interfaceC7888i = it.next().get();
                    if (interfaceC7888i != null) {
                        list.addAll(interfaceC7888i.getComponents());
                        it.remove();
                    }
                } catch (C7901v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f38000a.isEmpty()) {
                C7895p.m34221a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f38000a.keySet());
                arrayList2.addAll(list);
                C7895p.m34221a(arrayList2);
            }
            for (C7882d<?> c7882d : list) {
                this.f38000a.put(c7882d, new C7902w(C7889j.m34199a(this, c7882d)));
            }
            arrayList.addAll(m34213n(list));
            arrayList.addAll(m34214o());
            m34212m();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        m34211l();
    }

    /* renamed from: f */
    public final void m34209f(Map<C7882d<?>, InterfaceC0891b<?>> map, boolean z10) {
        for (Map.Entry<C7882d<?>, InterfaceC0891b<?>> entry : map.entrySet()) {
            C7882d<?> key = entry.getKey();
            InterfaceC0891b<?> value = entry.getValue();
            if (key.m34177i() || (key.m34178j() && z10)) {
                value.get();
            }
        }
        this.f38004e.m34246c();
    }

    /* renamed from: g */
    public void m34210g(boolean z10) {
        HashMap hashMap;
        if (C9436a3.m39798a(this.f38005f, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f38000a);
            }
            m34209f(hashMap, z10);
        }
    }

    @Override // p287qc.AbstractC7876a, p287qc.InterfaceC7884e
    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    /* renamed from: l */
    public final void m34211l() {
        Boolean bool = this.f38005f.get();
        if (bool != null) {
            m34209f(this.f38000a, bool.booleanValue());
        }
    }

    /* renamed from: m */
    public final void m34212m() {
        Map<Class<?>, InterfaceC0891b<?>> map;
        Class<?> m34237b;
        InterfaceC0891b<?> m34157a;
        for (C7882d<?> c7882d : this.f38000a.keySet()) {
            for (C7896q c7896q : c7882d.m34173c()) {
                if (c7896q.m34241f() && !this.f38002c.containsKey(c7896q.m34237b())) {
                    map = this.f38002c;
                    m34237b = c7896q.m34237b();
                    m34157a = C7903x.m34249b(Collections.emptySet());
                } else if (this.f38001b.containsKey(c7896q.m34237b())) {
                    continue;
                } else {
                    if (c7896q.m34240e()) {
                        throw new C7904y(String.format("Unsatisfied dependency for component %s: %s", c7882d, c7896q.m34237b()));
                    }
                    if (!c7896q.m34241f()) {
                        map = this.f38001b;
                        m34237b = c7896q.m34237b();
                        m34157a = C7879b0.m34157a();
                    }
                }
                map.put(m34237b, m34157a);
            }
        }
    }

    /* renamed from: n */
    public final List<Runnable> m34213n(List<C7882d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C7882d<?> c7882d : list) {
            if (c7882d.m34179k()) {
                InterfaceC0891b<?> interfaceC0891b = this.f38000a.get(c7882d);
                for (Class<? super Object> cls : c7882d.m34175e()) {
                    if (this.f38001b.containsKey(cls)) {
                        arrayList.add(RunnableC7890k.m34200a((C7879b0) this.f38001b.get(cls), interfaceC0891b));
                    } else {
                        this.f38001b.put(cls, interfaceC0891b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final List<Runnable> m34214o() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C7882d<?>, InterfaceC0891b<?>> entry : this.f38000a.entrySet()) {
            C7882d<?> key = entry.getKey();
            if (!key.m34179k()) {
                InterfaceC0891b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m34175e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f38002c.containsKey(entry2.getKey())) {
                C7903x<?> c7903x = this.f38002c.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(RunnableC7891l.m34201a(c7903x, (InterfaceC0891b) it.next()));
                }
            } else {
                this.f38002c.put((Class) entry2.getKey(), C7903x.m34249b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }
}
