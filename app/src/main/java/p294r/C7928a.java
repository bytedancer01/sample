package p294r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/a.class
 */
/* renamed from: r.a */
/* loaded from: combined.jar:classes1.jar:r/a.class */
public class C7928a<K, V> extends C7936i<K, V> implements Map<K, V> {

    /* renamed from: i */
    public AbstractC7935h<K, V> f38139i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r/a$a.class
     */
    /* renamed from: r.a$a */
    /* loaded from: combined.jar:classes1.jar:r/a$a.class */
    public class a extends AbstractC7935h<K, V> {

        /* renamed from: d */
        public final C7928a f38140d;

        public a(C7928a c7928a) {
            this.f38140d = c7928a;
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: a */
        public void mo34357a() {
            this.f38140d.clear();
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: b */
        public Object mo34358b(int i10, int i11) {
            return this.f38140d.f38196c[(i10 << 1) + i11];
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: c */
        public Map<K, V> mo34359c() {
            return this.f38140d;
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: d */
        public int mo34360d() {
            return this.f38140d.f38197d;
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: e */
        public int mo34361e(Object obj) {
            return this.f38140d.m34436g(obj);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: f */
        public int mo34362f(Object obj) {
            return this.f38140d.m34438i(obj);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: g */
        public void mo34363g(K k10, V v10) {
            this.f38140d.put(k10, v10);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: h */
        public void mo34364h(int i10) {
            this.f38140d.m34441l(i10);
        }

        @Override // p294r.AbstractC7935h
        /* renamed from: i */
        public V mo34365i(int i10, V v10) {
            return this.f38140d.m34442m(i10, v10);
        }
    }

    public C7928a() {
    }

    public C7928a(int i10) {
        super(i10);
    }

    public C7928a(C7936i c7936i) {
        super(c7936i);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m34355o().m34424l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m34355o().m34425m();
    }

    /* renamed from: o */
    public final AbstractC7935h<K, V> m34355o() {
        if (this.f38139i == null) {
            this.f38139i = new a(this);
        }
        return this.f38139i;
    }

    /* renamed from: p */
    public boolean m34356p(Collection<?> collection) {
        return AbstractC7935h.m34423p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m34434d(this.f38197d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m34355o().m34426n();
    }
}
