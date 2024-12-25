package p099fc;

import ec.C4708k;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099fc.AbstractC4806f;
import p099fc.C4803d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/d.class
 */
/* renamed from: fc.d */
/* loaded from: combined.jar:classes2.jar:fc/d.class */
public abstract class AbstractC4802d<K, V> extends AbstractC4806f<K, V> implements Serializable {

    /* renamed from: f */
    public transient Map<K, Collection<V>> f28263f;

    /* renamed from: g */
    public transient int f28264g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$a.class
     */
    /* renamed from: fc.d$a */
    /* loaded from: combined.jar:classes2.jar:fc/d$a.class */
    public class a extends AbstractC4802d<K, V>.d<V> {

        /* renamed from: g */
        public final AbstractC4802d f28265g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4802d abstractC4802d) {
            super(abstractC4802d);
            this.f28265g = abstractC4802d;
        }

        @Override // p099fc.AbstractC4802d.d
        /* renamed from: a */
        public V mo24326a(K k10, V v10) {
            return v10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$b.class
     */
    /* renamed from: fc.d$b */
    /* loaded from: combined.jar:classes2.jar:fc/d$b.class */
    public class b extends AbstractC4802d<K, V>.d<Map.Entry<K, V>> {

        /* renamed from: g */
        public final AbstractC4802d f28266g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC4802d abstractC4802d) {
            super(abstractC4802d);
            this.f28266g = abstractC4802d;
        }

        @Override // p099fc.AbstractC4802d.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo24326a(K k10, V v10) {
            return C4803d0.m24360c(k10, v10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$c.class
     */
    /* renamed from: fc.d$c */
    /* loaded from: combined.jar:classes2.jar:fc/d$c.class */
    public class c extends C4803d0.f<K, Collection<V>> {

        /* renamed from: d */
        public final transient Map<K, Collection<V>> f28267d;

        /* renamed from: e */
        public final AbstractC4802d f28268e;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/d$c$a.class
         */
        /* renamed from: fc.d$c$a */
        /* loaded from: combined.jar:classes2.jar:fc/d$c$a.class */
        public class a extends C4803d0.c<K, Collection<V>> {

            /* renamed from: b */
            public final c f28269b;

            public a(c cVar) {
                this.f28269b = cVar;
            }

            @Override // p099fc.C4803d0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C4816k.m24407c(this.f28269b.f28267d.entrySet(), obj);
            }

            @Override // p099fc.C4803d0.c
            /* renamed from: d */
            public Map<K, Collection<V>> mo24332d() {
                return this.f28269b;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b(this.f28269b);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                this.f28269b.f28268e.m24324w(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/d$c$b.class
         */
        /* renamed from: fc.d$c$b */
        /* loaded from: combined.jar:classes2.jar:fc/d$c$b.class */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b */
            public final Iterator<Map.Entry<K, Collection<V>>> f28270b;

            /* renamed from: c */
            @NullableDecl
            public Collection<V> f28271c;

            /* renamed from: d */
            public final c f28272d;

            public b(c cVar) {
                this.f28272d = cVar;
                this.f28270b = cVar.f28267d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f28270b.next();
                this.f28271c = next.getValue();
                return this.f28272d.m24331f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f28270b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                C4814j.m24400c(this.f28271c != null);
                this.f28270b.remove();
                this.f28272d.f28268e.f28264g -= this.f28271c.size();
                this.f28271c.clear();
                this.f28271c = null;
            }
        }

        public c(AbstractC4802d abstractC4802d, Map<K, Collection<V>> map) {
            this.f28268e = abstractC4802d;
            this.f28267d = map;
        }

        @Override // p099fc.C4803d0.f
        /* renamed from: b */
        public Set<Map.Entry<K, Collection<V>>> mo24328b() {
            return new a(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f28267d == this.f28268e.f28263f) {
                this.f28268e.clear();
            } else {
                C4845z.m24609b(new b(this));
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C4803d0.m24365h(this.f28267d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) C4803d0.m24366i(this.f28267d, obj);
            if (collection == null) {
                return null;
            }
            return this.f28268e.mo24306y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f28267d.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> mo24320r = this.f28268e.mo24320r();
            mo24320r.addAll(remove);
            this.f28268e.f28264g -= remove.size();
            remove.clear();
            return mo24320r;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f28267d.equals(obj);
        }

        /* renamed from: f */
        public Map.Entry<K, Collection<V>> m24331f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C4803d0.m24360c(key, this.f28268e.mo24306y(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f28267d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> mo24335h() {
            return this.f28268e.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f28267d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f28267d.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$d.class
     */
    /* renamed from: fc.d$d */
    /* loaded from: combined.jar:classes2.jar:fc/d$d.class */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b */
        public final Iterator<Map.Entry<K, Collection<V>>> f28273b;

        /* renamed from: c */
        @NullableDecl
        public K f28274c = null;

        /* renamed from: d */
        @MonotonicNonNullDecl
        public Collection<V> f28275d = null;

        /* renamed from: e */
        public Iterator<V> f28276e = C4845z.m24613f();

        /* renamed from: f */
        public final AbstractC4802d f28277f;

        public d(AbstractC4802d abstractC4802d) {
            this.f28277f = abstractC4802d;
            this.f28273b = abstractC4802d.f28263f.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo24326a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28273b.hasNext() || this.f28276e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f28276e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f28273b.next();
                this.f28274c = next.getKey();
                Collection<V> value = next.getValue();
                this.f28275d = value;
                this.f28276e = value.iterator();
            }
            return mo24326a(this.f28274c, this.f28276e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f28276e.remove();
            if (this.f28275d.isEmpty()) {
                this.f28273b.remove();
            }
            AbstractC4802d.m24312p(this.f28277f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$e.class
     */
    /* renamed from: fc.d$e */
    /* loaded from: combined.jar:classes2.jar:fc/d$e.class */
    public class e extends C4803d0.d<K, Collection<V>> {

        /* renamed from: c */
        public final AbstractC4802d f28278c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/d$e$a.class
         */
        /* renamed from: fc.d$e$a */
        /* loaded from: combined.jar:classes2.jar:fc/d$e$a.class */
        public class a implements Iterator<K> {

            /* renamed from: b */
            @NullableDecl
            public Map.Entry<K, Collection<V>> f28279b;

            /* renamed from: c */
            public final Iterator f28280c;

            /* renamed from: d */
            public final e f28281d;

            public a(e eVar, Iterator it) {
                this.f28281d = eVar;
                this.f28280c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f28280c.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f28280c.next();
                this.f28279b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                C4814j.m24400c(this.f28279b != null);
                Collection<V> value = this.f28279b.getValue();
                this.f28280c.remove();
                this.f28281d.f28278c.f28264g -= value.size();
                value.clear();
                this.f28279b = null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC4802d abstractC4802d, Map<K, Collection<V>> map) {
            super(map);
            this.f28278c = abstractC4802d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4845z.m24609b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m24373d().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || m24373d().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m24373d().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, m24373d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = m24373d().remove(obj);
            boolean z10 = false;
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                this.f28278c.f28264g -= i10;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$f.class
     */
    /* renamed from: fc.d$f */
    /* loaded from: combined.jar:classes2.jar:fc/d$f.class */
    public class f extends AbstractC4802d<K, V>.i implements NavigableMap<K, Collection<V>> {

        /* renamed from: h */
        public final AbstractC4802d f28282h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC4802d abstractC4802d, NavigableMap<K, Collection<V>> navigableMap) {
            super(abstractC4802d, navigableMap);
            this.f28282h = abstractC4802d;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo24336i().ceilingEntry(k10);
            return ceilingEntry == null ? null : m24331f(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return mo24336i().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(this.f28282h, mo24336i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo24336i().firstEntry();
            return firstEntry == null ? null : m24331f(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = mo24336i().floorEntry(k10);
            return floorEntry == null ? null : m24331f(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return mo24336i().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(this.f28282h, mo24336i().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = mo24336i().higherEntry(k10);
            return higherEntry == null ? null : m24331f(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return mo24336i().higherKey(k10);
        }

        @Override // p099fc.AbstractC4802d.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo24334g() {
            return new g(this.f28282h, mo24336i());
        }

        @Override // p099fc.AbstractC4802d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // p099fc.AbstractC4802d.i, p099fc.AbstractC4802d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo24335h() {
            return (NavigableSet) super.mo24335h();
        }

        /* renamed from: l */
        public Map.Entry<K, Collection<V>> m24339l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> mo24320r = this.f28282h.mo24320r();
            mo24320r.addAll(next.getValue());
            it.remove();
            return C4803d0.m24360c(next.getKey(), this.f28282h.mo24305x(mo24320r));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo24336i().lastEntry();
            return lastEntry == null ? null : m24331f(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = mo24336i().lowerEntry(k10);
            return lowerEntry == null ? null : m24331f(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return mo24336i().lowerKey(k10);
        }

        @Override // p099fc.AbstractC4802d.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo24336i() {
            return (NavigableMap) super.mo24336i();
        }

        @Override // p099fc.AbstractC4802d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo24335h();
        }

        @Override // p099fc.AbstractC4802d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m24339l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m24339l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(this.f28282h, mo24336i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(this.f28282h, mo24336i().tailMap(k10, z10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$g.class
     */
    /* renamed from: fc.d$g */
    /* loaded from: combined.jar:classes2.jar:fc/d$g.class */
    public class g extends AbstractC4802d<K, V>.j implements NavigableSet<K> {

        /* renamed from: e */
        public final AbstractC4802d f28283e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC4802d abstractC4802d, NavigableMap<K, Collection<V>> navigableMap) {
            super(abstractC4802d, navigableMap);
            this.f28283e = abstractC4802d;
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return mo24343f().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(this.f28283e, mo24343f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return mo24343f().floorKey(k10);
        }

        @Override // p099fc.AbstractC4802d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(this.f28283e, mo24343f().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return mo24343f().higherKey(k10);
        }

        @Override // p099fc.AbstractC4802d.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo24343f() {
            return (NavigableMap) super.mo24343f();
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return mo24343f().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) C4845z.m24617j(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) C4845z.m24617j(descendingIterator());
        }

        @Override // p099fc.AbstractC4802d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(this.f28283e, mo24343f().subMap(k10, z10, k11, z11));
        }

        @Override // p099fc.AbstractC4802d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(this.f28283e, mo24343f().tailMap(k10, z10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$h.class
     */
    /* renamed from: fc.d$h */
    /* loaded from: combined.jar:classes2.jar:fc/d$h.class */
    public class h extends AbstractC4802d<K, V>.l implements RandomAccess {

        /* renamed from: h */
        public final AbstractC4802d f28284h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NullableDecl AbstractC4802d abstractC4802d, K k10, @NullableDecl List<V> list, AbstractC4802d<K, V>.k kVar) {
            super(abstractC4802d, k10, list, kVar);
            this.f28284h = abstractC4802d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$i.class
     */
    /* renamed from: fc.d$i */
    /* loaded from: combined.jar:classes2.jar:fc/d$i.class */
    public class i extends AbstractC4802d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: f */
        @MonotonicNonNullDecl
        public SortedSet<K> f28285f;

        /* renamed from: g */
        public final AbstractC4802d f28286g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC4802d abstractC4802d, SortedMap<K, Collection<V>> sortedMap) {
            super(abstractC4802d, sortedMap);
            this.f28286g = abstractC4802d;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo24336i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo24336i().firstKey();
        }

        /* renamed from: g */
        public SortedSet<K> mo24334g() {
            return new j(this.f28286g, mo24336i());
        }

        @Override // p099fc.AbstractC4802d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: h */
        public SortedSet<K> mo24335h() {
            SortedSet<K> sortedSet = this.f28285f;
            SortedSet<K> sortedSet2 = sortedSet;
            if (sortedSet == null) {
                sortedSet2 = mo24334g();
                this.f28285f = sortedSet2;
            }
            return sortedSet2;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(this.f28286g, mo24336i().headMap(k10));
        }

        /* renamed from: i */
        public SortedMap<K, Collection<V>> mo24336i() {
            return (SortedMap) this.f28267d;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo24336i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(this.f28286g, mo24336i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(this.f28286g, mo24336i().tailMap(k10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$j.class
     */
    /* renamed from: fc.d$j */
    /* loaded from: combined.jar:classes2.jar:fc/d$j.class */
    public class j extends AbstractC4802d<K, V>.e implements SortedSet<K> {

        /* renamed from: d */
        public final AbstractC4802d f28287d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC4802d abstractC4802d, SortedMap<K, Collection<V>> sortedMap) {
            super(abstractC4802d, sortedMap);
            this.f28287d = abstractC4802d;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo24343f().comparator();
        }

        /* renamed from: f */
        public SortedMap<K, Collection<V>> mo24343f() {
            return (SortedMap) super.m24373d();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo24343f().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(this.f28287d, mo24343f().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo24343f().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(this.f28287d, mo24343f().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(this.f28287d, mo24343f().tailMap(k10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$k.class
     */
    /* renamed from: fc.d$k */
    /* loaded from: combined.jar:classes2.jar:fc/d$k.class */
    public class k extends AbstractCollection<V> {

        /* renamed from: b */
        @NullableDecl
        public final K f28288b;

        /* renamed from: c */
        public Collection<V> f28289c;

        /* renamed from: d */
        @NullableDecl
        public final AbstractC4802d<K, V>.k f28290d;

        /* renamed from: e */
        @NullableDecl
        public final Collection<V> f28291e;

        /* renamed from: f */
        public final AbstractC4802d f28292f;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/d$k$a.class
         */
        /* renamed from: fc.d$k$a */
        /* loaded from: combined.jar:classes2.jar:fc/d$k$a.class */
        public class a implements Iterator<V> {

            /* renamed from: b */
            public final Iterator<V> f28293b;

            /* renamed from: c */
            public final Collection<V> f28294c;

            /* renamed from: d */
            public final k f28295d;

            public a(k kVar) {
                this.f28295d = kVar;
                Collection<V> collection = kVar.f28289c;
                this.f28294c = collection;
                this.f28293b = AbstractC4802d.m24314v(collection);
            }

            public a(k kVar, Iterator<V> it) {
                this.f28295d = kVar;
                this.f28294c = kVar.f28289c;
                this.f28293b = it;
            }

            /* renamed from: a */
            public Iterator<V> m24354a() {
                m24355b();
                return this.f28293b;
            }

            /* renamed from: b */
            public void m24355b() {
                this.f28295d.m24352q();
                if (this.f28295d.f28289c != this.f28294c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m24355b();
                return this.f28293b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m24355b();
                return this.f28293b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f28293b.remove();
                AbstractC4802d.m24312p(this.f28295d.f28292f);
                this.f28295d.m24353t();
            }
        }

        public k(@NullableDecl AbstractC4802d abstractC4802d, K k10, @NullableDecl Collection<V> collection, AbstractC4802d<K, V>.k kVar) {
            this.f28292f = abstractC4802d;
            this.f28288b = k10;
            this.f28289c = collection;
            this.f28290d = kVar;
            this.f28291e = kVar == null ? null : kVar.m24350g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            m24352q();
            boolean isEmpty = this.f28289c.isEmpty();
            boolean add = this.f28289c.add(v10);
            if (add) {
                AbstractC4802d.m24311o(this.f28292f);
                if (isEmpty) {
                    m24348d();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f28289c.addAll(collection);
            if (addAll) {
                int size2 = this.f28289c.size();
                this.f28292f.f28264g += size2 - size;
                if (size == 0) {
                    m24348d();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f28289c.clear();
            this.f28292f.f28264g -= size;
            m24353t();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m24352q();
            return this.f28289c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m24352q();
            return this.f28289c.containsAll(collection);
        }

        /* renamed from: d */
        public void m24348d() {
            AbstractC4802d<K, V>.k kVar = this.f28290d;
            if (kVar != null) {
                kVar.m24348d();
            } else {
                this.f28292f.f28263f.put(this.f28288b, this.f28289c);
            }
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            m24352q();
            return this.f28289c.equals(obj);
        }

        /* renamed from: f */
        public AbstractC4802d<K, V>.k m24349f() {
            return this.f28290d;
        }

        /* renamed from: g */
        public Collection<V> m24350g() {
            return this.f28289c;
        }

        @Override // java.util.Collection
        public int hashCode() {
            m24352q();
            return this.f28289c.hashCode();
        }

        /* renamed from: i */
        K m24351i() {
            return this.f28288b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m24352q();
            return new a(this);
        }

        /* renamed from: q */
        public void m24352q() {
            Collection<V> collection;
            AbstractC4802d<K, V>.k kVar = this.f28290d;
            if (kVar != null) {
                kVar.m24352q();
                if (this.f28290d.m24350g() != this.f28291e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f28289c.isEmpty() || (collection = (Collection) this.f28292f.f28263f.get(this.f28288b)) == null) {
                    return;
                }
                this.f28289c = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m24352q();
            boolean remove = this.f28289c.remove(obj);
            if (remove) {
                AbstractC4802d.m24312p(this.f28292f);
                m24353t();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f28289c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f28289c.size();
                this.f28292f.f28264g += size2 - size;
                m24353t();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            C4708k.m23668j(collection);
            int size = size();
            boolean retainAll = this.f28289c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f28289c.size();
                this.f28292f.f28264g += size2 - size;
                m24353t();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m24352q();
            return this.f28289c.size();
        }

        /* renamed from: t */
        public void m24353t() {
            AbstractC4802d<K, V>.k kVar = this.f28290d;
            if (kVar != null) {
                kVar.m24353t();
            } else if (this.f28289c.isEmpty()) {
                this.f28292f.f28263f.remove(this.f28288b);
            }
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m24352q();
            return this.f28289c.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/d$l.class
     */
    /* renamed from: fc.d$l */
    /* loaded from: combined.jar:classes2.jar:fc/d$l.class */
    public class l extends AbstractC4802d<K, V>.k implements List<V> {

        /* renamed from: g */
        public final AbstractC4802d f28296g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/d$l$a.class
         */
        /* renamed from: fc.d$l$a */
        /* loaded from: combined.jar:classes2.jar:fc/d$l$a.class */
        public class a extends AbstractC4802d<K, V>.k.a implements ListIterator<V> {

            /* renamed from: e */
            public final l f28297e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar) {
                super(lVar);
                this.f28297e = lVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, int i10) {
                super(lVar, lVar.m24356v().listIterator(i10));
                this.f28297e = lVar;
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = this.f28297e.isEmpty();
                m24357c().add(v10);
                AbstractC4802d.m24311o(this.f28297e.f28296g);
                if (isEmpty) {
                    this.f28297e.m24348d();
                }
            }

            /* renamed from: c */
            public final ListIterator<V> m24357c() {
                return (ListIterator) m24354a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m24357c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m24357c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m24357c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m24357c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                m24357c().set(v10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@NullableDecl AbstractC4802d abstractC4802d, K k10, @NullableDecl List<V> list, AbstractC4802d<K, V>.k kVar) {
            super(abstractC4802d, k10, list, kVar);
            this.f28296g = abstractC4802d;
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            m24352q();
            boolean isEmpty = m24350g().isEmpty();
            m24356v().add(i10, v10);
            AbstractC4802d.m24311o(this.f28296g);
            if (isEmpty) {
                m24348d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m24356v().addAll(i10, collection);
            if (addAll) {
                int size2 = m24350g().size();
                this.f28296g.f28264g += size2 - size;
                if (size == 0) {
                    m24348d();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            m24352q();
            return m24356v().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m24352q();
            return m24356v().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m24352q();
            return m24356v().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m24352q();
            return new a(this);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            m24352q();
            return new a(this, i10);
        }

        @Override // java.util.List
        public V remove(int i10) {
            m24352q();
            V remove = m24356v().remove(i10);
            AbstractC4802d.m24312p(this.f28296g);
            m24353t();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            m24352q();
            return m24356v().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            m24352q();
            return this.f28296g.m24325z(m24351i(), m24356v().subList(i10, i11), m24349f() == null ? this : m24349f());
        }

        /* renamed from: v */
        public List<V> m24356v() {
            return (List) m24350g();
        }
    }

    public AbstractC4802d(Map<K, Collection<V>> map) {
        C4708k.m23662d(map.isEmpty());
        this.f28263f = map;
    }

    /* renamed from: o */
    public static /* synthetic */ int m24311o(AbstractC4802d abstractC4802d) {
        int i10 = abstractC4802d.f28264g;
        abstractC4802d.f28264g = i10 + 1;
        return i10;
    }

    /* renamed from: p */
    public static /* synthetic */ int m24312p(AbstractC4802d abstractC4802d) {
        int i10 = abstractC4802d.f28264g;
        abstractC4802d.f28264g = i10 - 1;
        return i10;
    }

    /* renamed from: v */
    public static <E> Iterator<E> m24314v(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo24315a() {
        return super.mo24315a();
    }

    @Override // p099fc.InterfaceC4805e0
    public void clear() {
        Iterator<Collection<V>> it = this.f28263f.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f28263f.clear();
        this.f28264g = 0;
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: f */
    public Collection<Map.Entry<K, V>> mo24316f() {
        return new AbstractC4806f.a(this);
    }

    @Override // p099fc.InterfaceC4805e0
    public Collection<V> get(@NullableDecl K k10) {
        Collection<V> collection = this.f28263f.get(k10);
        Collection<V> collection2 = collection;
        if (collection == null) {
            collection2 = m24321s(k10);
        }
        return mo24306y(k10, collection2);
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: h */
    public Collection<V> mo24317h() {
        return new AbstractC4806f.b(this);
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: i */
    public Iterator<Map.Entry<K, V>> mo24318i() {
        return new b(this);
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: j */
    public Iterator<V> mo24319j() {
        return new a(this);
    }

    @Override // p099fc.InterfaceC4805e0
    public boolean put(@NullableDecl K k10, @NullableDecl V v10) {
        Collection<V> collection = this.f28263f.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f28264g++;
            return true;
        }
        Collection<V> m24321s = m24321s(k10);
        if (!m24321s.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f28264g++;
        this.f28263f.put(k10, m24321s);
        return true;
    }

    /* renamed from: r */
    public abstract Collection<V> mo24320r();

    /* renamed from: s */
    public Collection<V> m24321s(@NullableDecl K k10) {
        return mo24320r();
    }

    @Override // p099fc.InterfaceC4805e0
    public int size() {
        return this.f28264g;
    }

    /* renamed from: t */
    public final Map<K, Collection<V>> m24322t() {
        Map<K, Collection<V>> map = this.f28263f;
        return map instanceof NavigableMap ? new f(this, (NavigableMap) this.f28263f) : map instanceof SortedMap ? new i(this, (SortedMap) this.f28263f) : new c(this, this.f28263f);
    }

    /* renamed from: u */
    public final Set<K> m24323u() {
        Map<K, Collection<V>> map = this.f28263f;
        return map instanceof NavigableMap ? new g(this, (NavigableMap) this.f28263f) : map instanceof SortedMap ? new j(this, (SortedMap) this.f28263f) : new e(this, this.f28263f);
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: w */
    public final void m24324w(Object obj) {
        Collection collection = (Collection) C4803d0.m24367j(this.f28263f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f28264g -= size;
        }
    }

    /* renamed from: x */
    public abstract <E> Collection<E> mo24305x(Collection<E> collection);

    /* renamed from: y */
    public abstract Collection<V> mo24306y(@NullableDecl K k10, Collection<V> collection);

    /* renamed from: z */
    public final List<V> m24325z(@NullableDecl K k10, List<V> list, @NullableDecl AbstractC4802d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k10, list, kVar) : new l(this, k10, list, kVar);
    }
}
