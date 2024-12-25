package p099fc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/w.class
 */
/* renamed from: fc.w */
/* loaded from: combined.jar:classes2.jar:fc/w.class */
public abstract class AbstractC4840w<K, V> extends AbstractC4808g<K, V> implements Serializable {

    /* renamed from: f */
    public final transient AbstractC4838v<K, ? extends AbstractC4830r<V>> f28431f;

    /* renamed from: g */
    public final transient int f28432g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/w$a.class
     */
    /* renamed from: fc.w$a */
    /* loaded from: combined.jar:classes2.jar:fc/w$a.class */
    public class a extends AbstractC4841w0<Map.Entry<K, V>> {

        /* renamed from: b */
        public final Iterator<? extends Map.Entry<K, ? extends AbstractC4830r<V>>> f28433b;

        /* renamed from: c */
        public K f28434c = null;

        /* renamed from: d */
        public Iterator<V> f28435d = C4845z.m24611d();

        /* renamed from: e */
        public final AbstractC4840w f28436e;

        public a(AbstractC4840w abstractC4840w) {
            this.f28436e = abstractC4840w;
            this.f28433b = abstractC4840w.f28431f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f28435d.hasNext()) {
                Map.Entry<K, ? extends AbstractC4830r<V>> next = this.f28433b.next();
                this.f28434c = next.getKey();
                this.f28435d = next.getValue().iterator();
            }
            return C4803d0.m24360c(this.f28434c, this.f28435d.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28435d.hasNext() || this.f28433b.hasNext();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/w$b.class
     */
    /* renamed from: fc.w$b */
    /* loaded from: combined.jar:classes2.jar:fc/w$b.class */
    public class b extends AbstractC4841w0<V> {

        /* renamed from: b */
        public Iterator<? extends AbstractC4830r<V>> f28437b;

        /* renamed from: c */
        public Iterator<V> f28438c = C4845z.m24611d();

        /* renamed from: d */
        public final AbstractC4840w f28439d;

        public b(AbstractC4840w abstractC4840w) {
            this.f28439d = abstractC4840w;
            this.f28437b = abstractC4840w.f28431f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28438c.hasNext() || this.f28437b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f28438c.hasNext()) {
                this.f28438c = this.f28437b.next().iterator();
            }
            return this.f28438c.next();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/w$c.class
     */
    /* renamed from: fc.w$c */
    /* loaded from: combined.jar:classes2.jar:fc/w$c.class */
    public static class c<K, V> {

        /* renamed from: a */
        public Map<K, Collection<V>> f28440a = C4819l0.m24450d();

        /* renamed from: b */
        @MonotonicNonNullDecl
        public Comparator<? super K> f28441b;

        /* renamed from: c */
        @MonotonicNonNullDecl
        public Comparator<? super V> f28442c;

        /* renamed from: a */
        public AbstractC4840w<K, V> m24588a() {
            Set<Map.Entry<K, Collection<V>>> entrySet = this.f28440a.entrySet();
            Comparator<? super K> comparator = this.f28441b;
            Collection collection = entrySet;
            if (comparator != null) {
                collection = AbstractC4817k0.m24408a(comparator).m24411d().m24410b(entrySet);
            }
            return C4836u.m24557t(collection, this.f28442c);
        }

        /* renamed from: b */
        public Collection<V> m24589b() {
            return new ArrayList();
        }

        /* renamed from: c */
        public c<K, V> m24590c(K k10, V v10) {
            C4814j.m24398a(k10, v10);
            Collection<V> collection = this.f28440a.get(k10);
            Collection<V> collection2 = collection;
            if (collection == null) {
                Map<K, Collection<V>> map = this.f28440a;
                collection2 = m24589b();
                map.put(k10, collection2);
            }
            collection2.add(v10);
            return this;
        }

        /* renamed from: d */
        public c<K, V> mo24560d(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                throw new NullPointerException("null key in entry: null=" + C4844y.m24607g(iterable));
            }
            Collection<V> collection = this.f28440a.get(k10);
            Iterator<? extends V> it = iterable.iterator();
            if (collection != null) {
                while (it.hasNext()) {
                    V next = it.next();
                    C4814j.m24398a(k10, next);
                    collection.add(next);
                }
                return this;
            }
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> m24589b = m24589b();
            while (it.hasNext()) {
                V next2 = it.next();
                C4814j.m24398a(k10, next2);
                m24589b.add(next2);
            }
            this.f28440a.put(k10, m24589b);
            return this;
        }

        /* renamed from: e */
        public c<K, V> m24591e(K k10, V... vArr) {
            return mo24560d(k10, Arrays.asList(vArr));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/w$d.class
     */
    /* renamed from: fc.w$d */
    /* loaded from: combined.jar:classes2.jar:fc/w$d.class */
    public static class d<K, V> extends AbstractC4830r<Map.Entry<K, V>> {

        /* renamed from: c */
        public final AbstractC4840w<K, V> f28443c;

        public d(AbstractC4840w<K, V> abstractC4840w) {
            this.f28443c = abstractC4840w;
        }

        @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f28443c.mo24376c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f28443c.size();
        }

        @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: t */
        public AbstractC4841w0<Map.Entry<K, V>> iterator() {
            return this.f28443c.mo24318i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/w$e.class
     */
    /* renamed from: fc.w$e */
    /* loaded from: combined.jar:classes2.jar:fc/w$e.class */
    public static final class e<K, V> extends AbstractC4830r<V> {

        /* renamed from: c */
        public final transient AbstractC4840w<K, V> f28444c;

        public e(AbstractC4840w<K, V> abstractC4840w) {
            this.f28444c = abstractC4840w;
        }

        @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f28444c.mo24377d(obj);
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: e */
        public int mo24451e(Object[] objArr, int i10) {
            AbstractC4841w0<? extends AbstractC4830r<V>> it = this.f28444c.f28431f.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().mo24451e(objArr, i10);
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f28444c.size();
        }

        @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: t */
        public AbstractC4841w0<V> iterator() {
            return this.f28444c.mo24319j();
        }
    }

    public AbstractC4840w(AbstractC4838v<K, ? extends AbstractC4830r<V>> abstractC4838v, int i10) {
        this.f28431f = abstractC4838v;
        this.f28432g = i10;
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo24376c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.mo24376c(obj, obj2);
    }

    @Override // p099fc.InterfaceC4805e0
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: d */
    public boolean mo24377d(@NullableDecl Object obj) {
        return obj != null && super.mo24377d(obj);
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: e */
    public Map<K, Collection<V>> mo24378e() {
        throw new AssertionError("should never be called");
    }

    @Override // p099fc.AbstractC4806f
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: g */
    public Set<K> mo24379g() {
        throw new AssertionError("unreachable");
    }

    @Override // p099fc.AbstractC4806f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC4838v<K, Collection<V>> mo24304b() {
        return this.f28431f;
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC4830r<Map.Entry<K, V>> mo24316f() {
        return new d(this);
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC4830r<V> mo24317h() {
        return new e(this);
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC4830r<Map.Entry<K, V>> mo24315a() {
        return (AbstractC4830r) super.mo24315a();
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4841w0<Map.Entry<K, V>> mo24318i() {
        return new a(this);
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC4842x<K> keySet() {
        return this.f28431f.keySet();
    }

    @Override // p099fc.InterfaceC4805e0
    @Deprecated
    public boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // p099fc.AbstractC4806f
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC4841w0<V> mo24319j() {
        return new b(this);
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC4830r<V> values() {
        return (AbstractC4830r) super.values();
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p099fc.InterfaceC4805e0
    public int size() {
        return this.f28432g;
    }

    @Override // p099fc.AbstractC4806f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
