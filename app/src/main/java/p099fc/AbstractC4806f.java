package p099fc;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099fc.C4809g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/f.class
 */
/* renamed from: fc.f */
/* loaded from: combined.jar:classes2.jar:fc/f.class */
public abstract class AbstractC4806f<K, V> implements InterfaceC4805e0<K, V> {

    /* renamed from: b */
    @MonotonicNonNullDecl
    public transient Collection<Map.Entry<K, V>> f28302b;

    /* renamed from: c */
    @MonotonicNonNullDecl
    public transient Set<K> f28303c;

    /* renamed from: d */
    @MonotonicNonNullDecl
    public transient Collection<V> f28304d;

    /* renamed from: e */
    @MonotonicNonNullDecl
    public transient Map<K, Collection<V>> f28305e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/f$a.class
     */
    /* renamed from: fc.f$a */
    /* loaded from: combined.jar:classes2.jar:fc/f$a.class */
    public class a extends C4809g0.b<K, V> {

        /* renamed from: b */
        public final AbstractC4806f f28306b;

        public a(AbstractC4806f abstractC4806f) {
            this.f28306b = abstractC4806f;
        }

        @Override // p099fc.C4809g0.b
        /* renamed from: d */
        public InterfaceC4805e0<K, V> mo24380d() {
            return this.f28306b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.f28306b.mo24318i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/f$b.class
     */
    /* renamed from: fc.f$b */
    /* loaded from: combined.jar:classes2.jar:fc/f$b.class */
    public class b extends AbstractCollection<V> {

        /* renamed from: b */
        public final AbstractC4806f f28307b;

        public b(AbstractC4806f abstractC4806f) {
            this.f28307b = abstractC4806f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f28307b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return this.f28307b.mo24377d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return this.f28307b.mo24319j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f28307b.size();
        }
    }

    @Override // p099fc.InterfaceC4805e0
    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo24315a() {
        Collection<Map.Entry<K, V>> collection = this.f28302b;
        Collection<Map.Entry<K, V>> collection2 = collection;
        if (collection == null) {
            collection2 = mo24316f();
            this.f28302b = collection2;
        }
        return collection2;
    }

    @Override // p099fc.InterfaceC4805e0
    /* renamed from: b */
    public Map<K, Collection<V>> mo24304b() {
        Map<K, Collection<V>> map = this.f28305e;
        Map<K, Collection<V>> map2 = map;
        if (map == null) {
            map2 = mo24378e();
            this.f28305e = map2;
        }
        return map2;
    }

    @Override // p099fc.InterfaceC4805e0
    /* renamed from: c */
    public boolean mo24376c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = mo24304b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: d */
    public boolean mo24377d(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = mo24304b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public abstract Map<K, Collection<V>> mo24378e();

    public boolean equals(@NullableDecl Object obj) {
        return C4809g0.m24390a(this, obj);
    }

    /* renamed from: f */
    public abstract Collection<Map.Entry<K, V>> mo24316f();

    /* renamed from: g */
    public abstract Set<K> mo24379g();

    /* renamed from: h */
    public abstract Collection<V> mo24317h();

    public int hashCode() {
        return mo24304b().hashCode();
    }

    /* renamed from: i */
    public abstract Iterator<Map.Entry<K, V>> mo24318i();

    /* renamed from: j */
    public abstract Iterator<V> mo24319j();

    @Override // p099fc.InterfaceC4805e0
    public Set<K> keySet() {
        Set<K> set = this.f28303c;
        Set<K> set2 = set;
        if (set == null) {
            set2 = mo24379g();
            this.f28303c = set2;
        }
        return set2;
    }

    @Override // p099fc.InterfaceC4805e0
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = mo24304b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo24304b().toString();
    }

    @Override // p099fc.InterfaceC4805e0
    public Collection<V> values() {
        Collection<V> collection = this.f28304d;
        Collection<V> collection2 = collection;
        if (collection == null) {
            collection2 = mo24317h();
            this.f28304d = collection2;
        }
        return collection2;
    }
}
