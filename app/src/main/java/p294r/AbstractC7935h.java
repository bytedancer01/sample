package p294r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/h.class
 */
/* renamed from: r.h */
/* loaded from: combined.jar:classes1.jar:r/h.class */
public abstract class AbstractC7935h<K, V> {

    /* renamed from: a */
    public AbstractC7935h<K, V>.b f38176a;

    /* renamed from: b */
    public AbstractC7935h<K, V>.c f38177b;

    /* renamed from: c */
    public AbstractC7935h<K, V>.e f38178c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r/h$a.class
     */
    /* renamed from: r.h$a */
    /* loaded from: combined.jar:classes1.jar:r/h$a.class */
    public final class a<T> implements Iterator<T> {

        /* renamed from: b */
        public final int f38179b;

        /* renamed from: c */
        public int f38180c;

        /* renamed from: d */
        public int f38181d;

        /* renamed from: e */
        public boolean f38182e = false;

        /* renamed from: f */
        public final AbstractC7935h f38183f;

        public a(AbstractC7935h abstractC7935h, int i10) {
            this.f38183f = abstractC7935h;
            this.f38179b = i10;
            this.f38180c = abstractC7935h.mo34360d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38181d < this.f38180c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) this.f38183f.mo34358b(this.f38181d, this.f38179b);
            this.f38181d++;
            this.f38182e = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f38182e) {
                throw new IllegalStateException();
            }
            int i10 = this.f38181d - 1;
            this.f38181d = i10;
            this.f38180c--;
            this.f38182e = false;
            this.f38183f.mo34364h(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r/h$b.class
     */
    /* renamed from: r.h$b */
    /* loaded from: combined.jar:classes1.jar:r/h$b.class */
    public final class b implements Set<Map.Entry<K, V>> {

        /* renamed from: b */
        public final AbstractC7935h f38184b;

        public b(AbstractC7935h abstractC7935h) {
            this.f38184b = abstractC7935h;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo34360d = this.f38184b.mo34360d();
            for (Map.Entry<K, V> entry : collection) {
                this.f38184b.mo34363g(entry.getKey(), entry.getValue());
            }
            return mo34360d != this.f38184b.mo34360d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f38184b.mo34357a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo34361e = this.f38184b.mo34361e(entry.getKey());
            if (mo34361e < 0) {
                return false;
            }
            return C7932e.m34391c(this.f38184b.mo34358b(mo34361e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC7935h.m34421k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo34360d = this.f38184b.mo34360d() - 1; mo34360d >= 0; mo34360d--) {
                Object mo34358b = this.f38184b.mo34358b(mo34360d, 0);
                Object mo34358b2 = this.f38184b.mo34358b(mo34360d, 1);
                i10 += (mo34358b == null ? 0 : mo34358b.hashCode()) ^ (mo34358b2 == null ? 0 : mo34358b2.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f38184b.mo34360d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(this.f38184b);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f38184b.mo34360d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r/h$c.class
     */
    /* renamed from: r.h$c */
    /* loaded from: combined.jar:classes1.jar:r/h$c.class */
    public final class c implements Set<K> {

        /* renamed from: b */
        public final AbstractC7935h f38185b;

        public c(AbstractC7935h abstractC7935h) {
            this.f38185b = abstractC7935h;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f38185b.mo34357a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return this.f38185b.mo34361e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC7935h.m34420j(this.f38185b.mo34359c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC7935h.m34421k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo34360d = this.f38185b.mo34360d() - 1; mo34360d >= 0; mo34360d--) {
                Object mo34358b = this.f38185b.mo34358b(mo34360d, 0);
                i10 += mo34358b == null ? 0 : mo34358b.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f38185b.mo34360d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(this.f38185b, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo34361e = this.f38185b.mo34361e(obj);
            if (mo34361e < 0) {
                return false;
            }
            this.f38185b.mo34364h(mo34361e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC7935h.m34422o(this.f38185b.mo34359c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC7935h.m34423p(this.f38185b.mo34359c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f38185b.mo34360d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.f38185b.m34427q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.f38185b.m34428r(tArr, 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r/h$d.class
     */
    /* renamed from: r.h$d */
    /* loaded from: combined.jar:classes1.jar:r/h$d.class */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f38186b;

        /* renamed from: e */
        public final AbstractC7935h f38189e;

        /* renamed from: d */
        public boolean f38188d = false;

        /* renamed from: c */
        public int f38187c = -1;

        public d(AbstractC7935h abstractC7935h) {
            this.f38189e = abstractC7935h;
            this.f38186b = abstractC7935h.mo34360d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f38187c++;
            this.f38188d = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f38188d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            boolean z10 = false;
            if (C7932e.m34391c(entry.getKey(), this.f38189e.mo34358b(this.f38187c, 0))) {
                z10 = false;
                if (C7932e.m34391c(entry.getValue(), this.f38189e.mo34358b(this.f38187c, 1))) {
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f38188d) {
                return (K) this.f38189e.mo34358b(this.f38187c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f38188d) {
                return (V) this.f38189e.mo34358b(this.f38187c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38187c < this.f38186b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f38188d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i10 = 0;
            Object mo34358b = this.f38189e.mo34358b(this.f38187c, 0);
            Object mo34358b2 = this.f38189e.mo34358b(this.f38187c, 1);
            int hashCode = mo34358b == null ? 0 : mo34358b.hashCode();
            if (mo34358b2 != null) {
                i10 = mo34358b2.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f38188d) {
                throw new IllegalStateException();
            }
            this.f38189e.mo34364h(this.f38187c);
            this.f38187c--;
            this.f38186b--;
            this.f38188d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f38188d) {
                return (V) this.f38189e.mo34365i(this.f38187c, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r/h$e.class
     */
    /* renamed from: r.h$e */
    /* loaded from: combined.jar:classes1.jar:r/h$e.class */
    public final class e implements Collection<V> {

        /* renamed from: b */
        public final AbstractC7935h f38190b;

        public e(AbstractC7935h abstractC7935h) {
            this.f38190b = abstractC7935h;
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            this.f38190b.mo34357a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f38190b.mo34362f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f38190b.mo34360d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(this.f38190b, 1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo34362f = this.f38190b.mo34362f(obj);
            if (mo34362f < 0) {
                return false;
            }
            this.f38190b.mo34364h(mo34362f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo34360d = this.f38190b.mo34360d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo34360d) {
                int i11 = mo34360d;
                int i12 = i10;
                if (collection.contains(this.f38190b.mo34358b(i10, 1))) {
                    this.f38190b.mo34364h(i10);
                    i12 = i10 - 1;
                    i11 = mo34360d - 1;
                    z10 = true;
                }
                i10 = i12 + 1;
                mo34360d = i11;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo34360d = this.f38190b.mo34360d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo34360d) {
                int i11 = mo34360d;
                int i12 = i10;
                if (!collection.contains(this.f38190b.mo34358b(i10, 1))) {
                    this.f38190b.mo34364h(i10);
                    i12 = i10 - 1;
                    i11 = mo34360d - 1;
                    z10 = true;
                }
                i10 = i12 + 1;
                mo34360d = i11;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return this.f38190b.mo34360d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return this.f38190b.m34427q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.f38190b.m34428r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m34420j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r3.containsAll(r0) != false) goto L15;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> boolean m34421k(java.util.Set<T> r3, java.lang.Object r4) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L37
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r4 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L39
            r1 = r4
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            if (r0 != r1) goto L33
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L39
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            r5 = r0
        L35:
            r0 = r5
            return r0
        L37:
            r0 = 0
            return r0
        L39:
            r3 = move-exception
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: p294r.AbstractC7935h.m34421k(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: o */
    public static <K, V> boolean m34422o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m34423p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo34357a();

    /* renamed from: b */
    public abstract Object mo34358b(int i10, int i11);

    /* renamed from: c */
    public abstract Map<K, V> mo34359c();

    /* renamed from: d */
    public abstract int mo34360d();

    /* renamed from: e */
    public abstract int mo34361e(Object obj);

    /* renamed from: f */
    public abstract int mo34362f(Object obj);

    /* renamed from: g */
    public abstract void mo34363g(K k10, V v10);

    /* renamed from: h */
    public abstract void mo34364h(int i10);

    /* renamed from: i */
    public abstract V mo34365i(int i10, V v10);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m34424l() {
        if (this.f38176a == null) {
            this.f38176a = new b(this);
        }
        return this.f38176a;
    }

    /* renamed from: m */
    public Set<K> m34425m() {
        if (this.f38177b == null) {
            this.f38177b = new c(this);
        }
        return this.f38177b;
    }

    /* renamed from: n */
    public Collection<V> m34426n() {
        if (this.f38178c == null) {
            this.f38178c = new e(this);
        }
        return this.f38178c;
    }

    /* renamed from: q */
    public Object[] m34427q(int i10) {
        int mo34360d = mo34360d();
        Object[] objArr = new Object[mo34360d];
        for (int i11 = 0; i11 < mo34360d; i11++) {
            objArr[i11] = mo34358b(i11, i10);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object[]] */
    /* renamed from: r */
    public <T> T[] m34428r(T[] tArr, int i10) {
        int mo34360d = mo34360d();
        T[] tArr2 = tArr;
        if (tArr.length < mo34360d) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo34360d);
        }
        for (int i11 = 0; i11 < mo34360d; i11++) {
            tArr2[i11] = mo34358b(i11, i10);
        }
        if (tArr2.length > mo34360d) {
            tArr2[mo34360d] = null;
        }
        return tArr2;
    }
}
