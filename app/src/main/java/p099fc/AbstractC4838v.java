package p099fc;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099fc.AbstractC4830r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/v.class
 */
/* renamed from: fc.v */
/* loaded from: combined.jar:classes2.jar:fc/v.class */
public abstract class AbstractC4838v<K, V> implements Map<K, V>, Serializable {

    /* renamed from: e */
    public static final Map.Entry<?, ?>[] f28423e = new Map.Entry[0];

    /* renamed from: b */
    public transient AbstractC4842x<Map.Entry<K, V>> f28424b;

    /* renamed from: c */
    public transient AbstractC4842x<K> f28425c;

    /* renamed from: d */
    public transient AbstractC4830r<V> f28426d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/v$a.class
     */
    /* renamed from: fc.v$a */
    /* loaded from: combined.jar:classes2.jar:fc/v$a.class */
    public static class a<K, V> {

        /* renamed from: a */
        @MonotonicNonNullDecl
        public Comparator<? super V> f28427a;

        /* renamed from: b */
        public Object[] f28428b;

        /* renamed from: c */
        public int f28429c;

        /* renamed from: d */
        public boolean f28430d;

        public a() {
            this(4);
        }

        public a(int i10) {
            this.f28428b = new Object[i10 * 2];
            this.f28429c = 0;
            this.f28430d = false;
        }

        /* renamed from: a */
        public AbstractC4838v<K, V> m24573a() {
            m24578f();
            this.f28430d = true;
            return C4823n0.m24467n(this.f28429c, this.f28428b);
        }

        /* renamed from: b */
        public final void m24574b(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f28428b;
            if (i11 > objArr.length) {
                this.f28428b = Arrays.copyOf(objArr, AbstractC4830r.b.m24528a(objArr.length, i11));
                this.f28430d = false;
            }
        }

        /* renamed from: c */
        public a<K, V> m24575c(K k10, V v10) {
            m24574b(this.f28429c + 1);
            C4814j.m24398a(k10, v10);
            Object[] objArr = this.f28428b;
            int i10 = this.f28429c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f28429c = i10 + 1;
            return this;
        }

        /* renamed from: d */
        public a<K, V> m24576d(Map.Entry<? extends K, ? extends V> entry) {
            return m24575c(entry.getKey(), entry.getValue());
        }

        /* renamed from: e */
        public a<K, V> m24577e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m24574b(this.f28429c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                m24576d(it.next());
            }
            return this;
        }

        /* renamed from: f */
        public void m24578f() {
            int i10;
            if (this.f28427a != null) {
                if (this.f28430d) {
                    this.f28428b = Arrays.copyOf(this.f28428b, this.f28429c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f28429c];
                int i11 = 0;
                while (true) {
                    i10 = this.f28429c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f28428b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, AbstractC4817k0.m24408a(this.f28427a).m24412e(C4803d0.m24369l()));
                for (int i13 = 0; i13 < this.f28429c; i13++) {
                    int i14 = i13 * 2;
                    this.f28428b[i14] = entryArr[i13].getKey();
                    this.f28428b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }
    }

    /* renamed from: b */
    public static <K, V> a<K, V> m24565b() {
        return new a<>();
    }

    /* renamed from: c */
    public static <K, V> AbstractC4838v<K, V> m24566c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.m24577e(iterable);
        return aVar.m24573a();
    }

    /* renamed from: d */
    public static <K, V> AbstractC4838v<K, V> m24567d(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC4838v) && !(map instanceof SortedMap)) {
            AbstractC4838v<K, V> abstractC4838v = (AbstractC4838v) map;
            if (!abstractC4838v.mo24473i()) {
                return abstractC4838v;
            }
        }
        return m24566c(map.entrySet());
    }

    /* renamed from: k */
    public static <K, V> AbstractC4838v<K, V> m24568k() {
        return (AbstractC4838v<K, V>) C4823n0.f28349i;
    }

    /* renamed from: l */
    public static <K, V> AbstractC4838v<K, V> m24569l(K k10, V v10) {
        C4814j.m24398a(k10, v10);
        return C4823n0.m24467n(1, new Object[]{k10, v10});
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    public abstract AbstractC4842x<Map.Entry<K, V>> mo24470e();

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return C4803d0.m24359b(this, obj);
    }

    /* renamed from: f */
    public abstract AbstractC4842x<K> mo24471f();

    /* renamed from: g */
    public abstract AbstractC4830r<V> mo24472g();

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v10) {
        V v11 = get(obj);
        if (v11 != null) {
            v10 = v11;
        }
        return v10;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC4842x<Map.Entry<K, V>> entrySet() {
        AbstractC4842x<Map.Entry<K, V>> abstractC4842x = this.f28424b;
        AbstractC4842x<Map.Entry<K, V>> abstractC4842x2 = abstractC4842x;
        if (abstractC4842x == null) {
            abstractC4842x2 = mo24470e();
            this.f28424b = abstractC4842x2;
        }
        return abstractC4842x2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return C4833s0.m24530b(entrySet());
    }

    /* renamed from: i */
    public abstract boolean mo24473i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC4842x<K> keySet() {
        AbstractC4842x<K> abstractC4842x = this.f28425c;
        AbstractC4842x<K> abstractC4842x2 = abstractC4842x;
        if (abstractC4842x == null) {
            abstractC4842x2 = mo24471f();
            this.f28425c = abstractC4842x2;
        }
        return abstractC4842x2;
    }

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC4830r<V> values() {
        AbstractC4830r<V> abstractC4830r = this.f28426d;
        AbstractC4830r<V> abstractC4830r2 = abstractC4830r;
        if (abstractC4830r == null) {
            abstractC4830r2 = mo24472g();
            this.f28426d = abstractC4830r2;
        }
        return abstractC4830r2;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C4803d0.m24368k(this);
    }
}
