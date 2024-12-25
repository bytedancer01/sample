package p099fc;

import ec.C4705h;
import ec.C4708k;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099fc.AbstractC4830r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/p.class
 */
/* renamed from: fc.p */
/* loaded from: combined.jar:classes2.jar:fc/p.class */
public final class C4826p<K, V> extends AbstractMap<K, V> implements InterfaceC4810h<K, V>, Serializable {

    /* renamed from: b */
    public transient K[] f28370b;

    /* renamed from: c */
    public transient V[] f28371c;

    /* renamed from: d */
    public transient int f28372d;

    /* renamed from: e */
    public transient int f28373e;

    /* renamed from: f */
    public transient int[] f28374f;

    /* renamed from: g */
    public transient int[] f28375g;

    /* renamed from: h */
    public transient int[] f28376h;

    /* renamed from: i */
    public transient int[] f28377i;

    /* renamed from: j */
    @NullableDecl
    public transient int f28378j;

    /* renamed from: k */
    @NullableDecl
    public transient int f28379k;

    /* renamed from: l */
    public transient int[] f28380l;

    /* renamed from: m */
    public transient int[] f28381m;

    /* renamed from: n */
    public transient Set<K> f28382n;

    /* renamed from: o */
    public transient Set<V> f28383o;

    /* renamed from: p */
    public transient Set<Map.Entry<K, V>> f28384p;

    /* renamed from: q */
    @MonotonicNonNullDecl
    public transient InterfaceC4810h<V, K> f28385q;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$a.class
     */
    /* renamed from: fc.p$a */
    /* loaded from: combined.jar:classes2.jar:fc/p$a.class */
    public final class a extends AbstractC4804e<K, V> {

        /* renamed from: b */
        @NullableDecl
        public final K f28386b;

        /* renamed from: c */
        public int f28387c;

        /* renamed from: d */
        public final C4826p f28388d;

        public a(C4826p c4826p, int i10) {
            this.f28388d = c4826p;
            this.f28386b = c4826p.f28370b[i10];
            this.f28387c = i10;
        }

        /* renamed from: a */
        public void m24515a() {
            int i10 = this.f28387c;
            if (i10 != -1) {
                C4826p c4826p = this.f28388d;
                if (i10 <= c4826p.f28372d && C4705h.m23655a(c4826p.f28370b[i10], this.f28386b)) {
                    return;
                }
            }
            this.f28387c = this.f28388d.m24504o(this.f28386b);
        }

        @Override // p099fc.AbstractC4804e, java.util.Map.Entry
        public K getKey() {
            return this.f28386b;
        }

        @Override // p099fc.AbstractC4804e, java.util.Map.Entry
        @NullableDecl
        public V getValue() {
            m24515a();
            int i10 = this.f28387c;
            return i10 == -1 ? null : this.f28388d.f28371c[i10];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            m24515a();
            int i10 = this.f28387c;
            if (i10 == -1) {
                return (V) this.f28388d.put(this.f28386b, v10);
            }
            V v11 = this.f28388d.f28371c[i10];
            if (C4705h.m23655a(v11, v10)) {
                return v10;
            }
            this.f28388d.m24496G(this.f28387c, v10, false);
            return v11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$b.class
     */
    /* renamed from: fc.p$b */
    /* loaded from: combined.jar:classes2.jar:fc/p$b.class */
    public static final class b<K, V> extends AbstractC4804e<V, K> {

        /* renamed from: b */
        public final C4826p<K, V> f28389b;

        /* renamed from: c */
        public final V f28390c;

        /* renamed from: d */
        public int f28391d;

        public b(C4826p<K, V> c4826p, int i10) {
            this.f28389b = c4826p;
            this.f28390c = c4826p.f28371c[i10];
            this.f28391d = i10;
        }

        /* renamed from: a */
        public final void m24516a() {
            int i10 = this.f28391d;
            if (i10 != -1) {
                C4826p<K, V> c4826p = this.f28389b;
                if (i10 <= c4826p.f28372d && C4705h.m23655a(this.f28390c, c4826p.f28371c[i10])) {
                    return;
                }
            }
            this.f28391d = this.f28389b.m24506q(this.f28390c);
        }

        @Override // p099fc.AbstractC4804e, java.util.Map.Entry
        public V getKey() {
            return this.f28390c;
        }

        @Override // p099fc.AbstractC4804e, java.util.Map.Entry
        public K getValue() {
            m24516a();
            int i10 = this.f28391d;
            return i10 == -1 ? null : this.f28389b.f28370b[i10];
        }

        @Override // java.util.Map.Entry
        public K setValue(K k10) {
            m24516a();
            int i10 = this.f28391d;
            if (i10 == -1) {
                return this.f28389b.m24514z(this.f28390c, k10, false);
            }
            K k11 = this.f28389b.f28370b[i10];
            if (C4705h.m23655a(k11, k10)) {
                return k10;
            }
            this.f28389b.m24495F(this.f28391d, k10, false);
            return k11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$c.class
     */
    /* renamed from: fc.p$c */
    /* loaded from: combined.jar:classes2.jar:fc/p$c.class */
    public final class c extends h<K, V, Map.Entry<K, V>> {

        /* renamed from: c */
        public final C4826p f28392c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4826p c4826p) {
            super(c4826p);
            this.f28392c = c4826p;
        }

        @Override // p099fc.C4826p.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo24517a(int i10) {
            return new a(this.f28392c, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            boolean z10 = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int m24504o = this.f28392c.m24504o(key);
                z10 = false;
                if (m24504o != -1) {
                    z10 = false;
                    if (C4705h.m23655a(value, this.f28392c.f28371c[m24504o])) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m24525c = C4828q.m24525c(key);
            int m24505p = this.f28392c.m24505p(key, m24525c);
            if (m24505p == -1 || !C4705h.m23655a(value, this.f28392c.f28371c[m24505p])) {
                return false;
            }
            this.f28392c.m24492C(m24505p, m24525c);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$d.class
     */
    /* renamed from: fc.p$d */
    /* loaded from: combined.jar:classes2.jar:fc/p$d.class */
    public static class d<K, V> extends AbstractMap<V, K> implements InterfaceC4810h<V, K>, Serializable {

        /* renamed from: b */
        public final C4826p<K, V> f28393b;

        /* renamed from: c */
        public transient Set<Map.Entry<V, K>> f28394c;

        public d(C4826p<K, V> c4826p) {
            this.f28393b = c4826p;
        }

        @Override // p099fc.InterfaceC4810h
        @NullableDecl
        /* renamed from: a */
        public K mo24393a(@NullableDecl V v10, @NullableDecl K k10) {
            return this.f28393b.m24514z(v10, k10, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<K> values() {
            return this.f28393b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f28393b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.f28393b.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@NullableDecl Object obj) {
            return this.f28393b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f28394c;
            Set<Map.Entry<V, K>> set2 = set;
            if (set == null) {
                set2 = new e(this.f28393b);
                this.f28394c = set2;
            }
            return set2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K get(@NullableDecl Object obj) {
            return this.f28393b.m24508s(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f28393b.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K put(@NullableDecl V v10, @NullableDecl K k10) {
            return this.f28393b.m24514z(v10, k10, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K remove(@NullableDecl Object obj) {
            return this.f28393b.m24494E(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f28393b.f28372d;
        }

        @Override // p099fc.InterfaceC4810h
        /* renamed from: x */
        public InterfaceC4810h<K, V> mo24394x() {
            return this.f28393b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$e.class
     */
    /* renamed from: fc.p$e */
    /* loaded from: combined.jar:classes2.jar:fc/p$e.class */
    public static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        public e(C4826p<K, V> c4826p) {
            super(c4826p);
        }

        @Override // p099fc.C4826p.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> mo24517a(int i10) {
            return new b(this.f28397b, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            boolean z10 = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int m24506q = this.f28397b.m24506q(key);
                z10 = false;
                if (m24506q != -1) {
                    z10 = false;
                    if (C4705h.m23655a(this.f28397b.f28370b[m24506q], value)) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m24525c = C4828q.m24525c(key);
            int m24507r = this.f28397b.m24507r(key, m24525c);
            if (m24507r == -1 || !C4705h.m23655a(this.f28397b.f28370b[m24507r], value)) {
                return false;
            }
            this.f28397b.m24493D(m24507r, m24525c);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$f.class
     */
    /* renamed from: fc.p$f */
    /* loaded from: combined.jar:classes2.jar:fc/p$f.class */
    public final class f extends h<K, V, K> {

        /* renamed from: c */
        public final C4826p f28395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C4826p c4826p) {
            super(c4826p);
            this.f28395c = c4826p;
        }

        @Override // p099fc.C4826p.h
        /* renamed from: a */
        public K mo24517a(int i10) {
            return this.f28395c.f28370b[i10];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f28395c.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int m24525c = C4828q.m24525c(obj);
            int m24505p = this.f28395c.m24505p(obj, m24525c);
            if (m24505p == -1) {
                return false;
            }
            this.f28395c.m24492C(m24505p, m24525c);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$g.class
     */
    /* renamed from: fc.p$g */
    /* loaded from: combined.jar:classes2.jar:fc/p$g.class */
    public final class g extends h<K, V, V> {

        /* renamed from: c */
        public final C4826p f28396c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C4826p c4826p) {
            super(c4826p);
            this.f28396c = c4826p;
        }

        @Override // p099fc.C4826p.h
        /* renamed from: a */
        public V mo24517a(int i10) {
            return this.f28396c.f28371c[i10];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f28396c.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int m24525c = C4828q.m24525c(obj);
            int m24507r = this.f28396c.m24507r(obj, m24525c);
            if (m24507r == -1) {
                return false;
            }
            this.f28396c.m24493D(m24507r, m24525c);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/p$h.class
     */
    /* renamed from: fc.p$h */
    /* loaded from: combined.jar:classes2.jar:fc/p$h.class */
    public static abstract class h<K, V, T> extends AbstractSet<T> {

        /* renamed from: b */
        public final C4826p<K, V> f28397b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/p$h$a.class
         */
        /* renamed from: fc.p$h$a */
        /* loaded from: combined.jar:classes2.jar:fc/p$h$a.class */
        public class a implements Iterator<T> {

            /* renamed from: b */
            public int f28398b;

            /* renamed from: c */
            public int f28399c = -1;

            /* renamed from: d */
            public int f28400d;

            /* renamed from: e */
            public int f28401e;

            /* renamed from: f */
            public final h f28402f;

            public a(h hVar) {
                this.f28402f = hVar;
                this.f28398b = hVar.f28397b.f28378j;
                C4826p<K, V> c4826p = hVar.f28397b;
                this.f28400d = c4826p.f28373e;
                this.f28401e = c4826p.f28372d;
            }

            /* renamed from: a */
            public final void m24521a() {
                if (this.f28402f.f28397b.f28373e != this.f28400d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m24521a();
                return this.f28398b != -2 && this.f28401e > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t10 = (T) this.f28402f.mo24517a(this.f28398b);
                this.f28399c = this.f28398b;
                this.f28398b = this.f28402f.f28397b.f28381m[this.f28398b];
                this.f28401e--;
                return t10;
            }

            @Override // java.util.Iterator
            public void remove() {
                m24521a();
                C4814j.m24400c(this.f28399c != -1);
                this.f28402f.f28397b.m24490A(this.f28399c);
                int i10 = this.f28398b;
                C4826p<K, V> c4826p = this.f28402f.f28397b;
                if (i10 == c4826p.f28372d) {
                    this.f28398b = this.f28399c;
                }
                this.f28399c = -1;
                this.f28400d = c4826p.f28373e;
            }
        }

        public h(C4826p<K, V> c4826p) {
            this.f28397b = c4826p;
        }

        /* renamed from: a */
        public abstract T mo24517a(int i10);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f28397b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f28397b.f28372d;
        }
    }

    public C4826p(int i10) {
        m24509t(i10);
    }

    /* renamed from: g */
    public static <K, V> C4826p<K, V> m24486g() {
        return m24487h(16);
    }

    /* renamed from: h */
    public static <K, V> C4826p<K, V> m24487h(int i10) {
        return new C4826p<>(i10);
    }

    /* renamed from: i */
    public static int[] m24488i(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: m */
    public static int[] m24489m(int[] iArr, int i10) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i10);
        Arrays.fill(copyOf, length, i10, -1);
        return copyOf;
    }

    /* renamed from: A */
    public void m24490A(int i10) {
        m24492C(i10, C4828q.m24525c(this.f28370b[i10]));
    }

    /* renamed from: B */
    public final void m24491B(int i10, int i11, int i12) {
        C4708k.m23662d(i10 != -1);
        m24500j(i10, i11);
        m24501k(i10, i12);
        m24497H(this.f28380l[i10], this.f28381m[i10]);
        m24512w(this.f28372d - 1, i10);
        K[] kArr = this.f28370b;
        int i13 = this.f28372d;
        kArr[i13 - 1] = null;
        this.f28371c[i13 - 1] = null;
        this.f28372d = i13 - 1;
        this.f28373e++;
    }

    /* renamed from: C */
    public void m24492C(int i10, int i11) {
        m24491B(i10, i11, C4828q.m24525c(this.f28371c[i10]));
    }

    /* renamed from: D */
    public void m24493D(int i10, int i11) {
        m24491B(i10, C4828q.m24525c(this.f28370b[i10]), i11);
    }

    @NullableDecl
    /* renamed from: E */
    public K m24494E(@NullableDecl Object obj) {
        int m24525c = C4828q.m24525c(obj);
        int m24507r = m24507r(obj, m24525c);
        if (m24507r == -1) {
            return null;
        }
        K k10 = this.f28370b[m24507r];
        m24493D(m24507r, m24525c);
        return k10;
    }

    /* renamed from: F */
    public final void m24495F(int i10, @NullableDecl K k10, boolean z10) {
        int i11;
        C4708k.m23662d(i10 != -1);
        int m24525c = C4828q.m24525c(k10);
        int m24505p = m24505p(k10, m24525c);
        int i12 = this.f28379k;
        int i13 = -2;
        int i14 = i10;
        if (m24505p != -1) {
            if (!z10) {
                throw new IllegalArgumentException("Key already present in map: " + k10);
            }
            int i15 = this.f28380l[m24505p];
            int i16 = this.f28381m[m24505p];
            m24492C(m24505p, m24525c);
            i12 = i15;
            i13 = i16;
            i14 = i10;
            if (i10 == this.f28372d) {
                i14 = m24505p;
                i12 = i15;
                i13 = i16;
            }
        }
        if (i12 == i14) {
            i11 = this.f28380l[i14];
        } else {
            i11 = i12;
            if (i12 == this.f28372d) {
                i11 = m24505p;
            }
        }
        if (i13 == i14) {
            m24505p = this.f28381m[i14];
        } else if (i13 != this.f28372d) {
            m24505p = i13;
        }
        m24497H(this.f28380l[i14], this.f28381m[i14]);
        m24500j(i14, C4828q.m24525c(this.f28370b[i14]));
        this.f28370b[i14] = k10;
        m24510u(i14, C4828q.m24525c(k10));
        m24497H(i11, i14);
        m24497H(i14, m24505p);
    }

    /* renamed from: G */
    public final void m24496G(int i10, @NullableDecl V v10, boolean z10) {
        C4708k.m23662d(i10 != -1);
        int m24525c = C4828q.m24525c(v10);
        int m24507r = m24507r(v10, m24525c);
        int i11 = i10;
        if (m24507r != -1) {
            if (!z10) {
                throw new IllegalArgumentException("Value already present in map: " + v10);
            }
            m24493D(m24507r, m24525c);
            i11 = i10;
            if (i10 == this.f28372d) {
                i11 = m24507r;
            }
        }
        m24501k(i11, C4828q.m24525c(this.f28371c[i11]));
        this.f28371c[i11] = v10;
        m24511v(i11, m24525c);
    }

    /* renamed from: H */
    public final void m24497H(int i10, int i11) {
        if (i10 == -2) {
            this.f28378j = i11;
        } else {
            this.f28381m[i10] = i11;
        }
        if (i11 == -2) {
            this.f28379k = i10;
        } else {
            this.f28380l[i11] = i10;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public Set<V> values() {
        Set<V> set = this.f28383o;
        Set<V> set2 = set;
        if (set == null) {
            set2 = new g(this);
            this.f28383o = set2;
        }
        return set2;
    }

    @Override // p099fc.InterfaceC4810h
    @NullableDecl
    /* renamed from: a */
    public V mo24393a(@NullableDecl K k10, @NullableDecl V v10) {
        return m24513y(k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f28370b, 0, this.f28372d, (Object) null);
        Arrays.fill(this.f28371c, 0, this.f28372d, (Object) null);
        Arrays.fill(this.f28374f, -1);
        Arrays.fill(this.f28375g, -1);
        Arrays.fill(this.f28376h, 0, this.f28372d, -1);
        Arrays.fill(this.f28377i, 0, this.f28372d, -1);
        Arrays.fill(this.f28380l, 0, this.f28372d, -1);
        Arrays.fill(this.f28381m, 0, this.f28372d, -1);
        this.f28372d = 0;
        this.f28378j = -2;
        this.f28379k = -2;
        this.f28373e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return m24504o(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return m24506q(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f28384p;
        Set<Map.Entry<K, V>> set2 = set;
        if (set == null) {
            set2 = new c(this);
            this.f28384p = set2;
        }
        return set2;
    }

    /* renamed from: f */
    public final int m24499f(int i10) {
        return i10 & (this.f28374f.length - 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int m24504o = m24504o(obj);
        return m24504o == -1 ? null : this.f28371c[m24504o];
    }

    /* renamed from: j */
    public final void m24500j(int i10, int i11) {
        C4708k.m23662d(i10 != -1);
        int m24499f = m24499f(i11);
        int[] iArr = this.f28374f;
        int i12 = iArr[m24499f];
        if (i12 == i10) {
            int[] iArr2 = this.f28376h;
            iArr[m24499f] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f28376h[i12];
        while (true) {
            int i14 = i13;
            if (i14 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f28370b[i10]);
            }
            if (i14 == i10) {
                int[] iArr3 = this.f28376h;
                iArr3[i12] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i12 = i14;
            i13 = this.f28376h[i14];
        }
    }

    /* renamed from: k */
    public final void m24501k(int i10, int i11) {
        C4708k.m23662d(i10 != -1);
        int m24499f = m24499f(i11);
        int[] iArr = this.f28375g;
        int i12 = iArr[m24499f];
        if (i12 == i10) {
            int[] iArr2 = this.f28377i;
            iArr[m24499f] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f28377i[i12];
        while (true) {
            int i14 = i13;
            if (i14 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f28371c[i10]);
            }
            if (i14 == i10) {
                int[] iArr3 = this.f28377i;
                iArr3[i12] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i12 = i14;
            i13 = this.f28377i[i14];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f28382n;
        Set<K> set2 = set;
        if (set == null) {
            set2 = new f(this);
            this.f28382n = set2;
        }
        return set2;
    }

    /* renamed from: l */
    public final void m24502l(int i10) {
        int[] iArr = this.f28376h;
        if (iArr.length < i10) {
            int m24528a = AbstractC4830r.b.m24528a(iArr.length, i10);
            this.f28370b = (K[]) Arrays.copyOf(this.f28370b, m24528a);
            this.f28371c = (V[]) Arrays.copyOf(this.f28371c, m24528a);
            this.f28376h = m24489m(this.f28376h, m24528a);
            this.f28377i = m24489m(this.f28377i, m24528a);
            this.f28380l = m24489m(this.f28380l, m24528a);
            this.f28381m = m24489m(this.f28381m, m24528a);
        }
        if (this.f28374f.length < i10) {
            int m24523a = C4828q.m24523a(i10, 1.0d);
            this.f28374f = m24488i(m24523a);
            this.f28375g = m24488i(m24523a);
            for (int i11 = 0; i11 < this.f28372d; i11++) {
                int m24499f = m24499f(C4828q.m24525c(this.f28370b[i11]));
                int[] iArr2 = this.f28376h;
                int[] iArr3 = this.f28374f;
                iArr2[i11] = iArr3[m24499f];
                iArr3[m24499f] = i11;
                int m24499f2 = m24499f(C4828q.m24525c(this.f28371c[i11]));
                int[] iArr4 = this.f28377i;
                int[] iArr5 = this.f28375g;
                iArr4[i11] = iArr5[m24499f2];
                iArr5[m24499f2] = i11;
            }
        }
    }

    /* renamed from: n */
    public int m24503n(@NullableDecl Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[m24499f(i10)];
        while (true) {
            int i12 = i11;
            if (i12 == -1) {
                return -1;
            }
            if (C4705h.m23655a(objArr[i12], obj)) {
                return i12;
            }
            i11 = iArr2[i12];
        }
    }

    /* renamed from: o */
    public int m24504o(@NullableDecl Object obj) {
        return m24505p(obj, C4828q.m24525c(obj));
    }

    /* renamed from: p */
    public int m24505p(@NullableDecl Object obj, int i10) {
        return m24503n(obj, i10, this.f28374f, this.f28376h, this.f28370b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(@NullableDecl K k10, @NullableDecl V v10) {
        return m24513y(k10, v10, false);
    }

    /* renamed from: q */
    public int m24506q(@NullableDecl Object obj) {
        return m24507r(obj, C4828q.m24525c(obj));
    }

    /* renamed from: r */
    public int m24507r(@NullableDecl Object obj, int i10) {
        return m24503n(obj, i10, this.f28375g, this.f28377i, this.f28371c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        int m24525c = C4828q.m24525c(obj);
        int m24505p = m24505p(obj, m24525c);
        if (m24505p == -1) {
            return null;
        }
        V v10 = this.f28371c[m24505p];
        m24492C(m24505p, m24525c);
        return v10;
    }

    @NullableDecl
    /* renamed from: s */
    public K m24508s(@NullableDecl Object obj) {
        int m24506q = m24506q(obj);
        return m24506q == -1 ? null : this.f28370b[m24506q];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f28372d;
    }

    /* renamed from: t */
    public void m24509t(int i10) {
        C4814j.m24399b(i10, "expectedSize");
        int m24523a = C4828q.m24523a(i10, 1.0d);
        this.f28372d = 0;
        this.f28370b = (K[]) new Object[i10];
        this.f28371c = (V[]) new Object[i10];
        this.f28374f = m24488i(m24523a);
        this.f28375g = m24488i(m24523a);
        this.f28376h = m24488i(i10);
        this.f28377i = m24488i(i10);
        this.f28378j = -2;
        this.f28379k = -2;
        this.f28380l = m24488i(i10);
        this.f28381m = m24488i(i10);
    }

    /* renamed from: u */
    public final void m24510u(int i10, int i11) {
        C4708k.m23662d(i10 != -1);
        int m24499f = m24499f(i11);
        int[] iArr = this.f28376h;
        int[] iArr2 = this.f28374f;
        iArr[i10] = iArr2[m24499f];
        iArr2[m24499f] = i10;
    }

    /* renamed from: v */
    public final void m24511v(int i10, int i11) {
        C4708k.m23662d(i10 != -1);
        int m24499f = m24499f(i11);
        int[] iArr = this.f28377i;
        int[] iArr2 = this.f28375g;
        iArr[i10] = iArr2[m24499f];
        iArr2[m24499f] = i10;
    }

    /* renamed from: w */
    public final void m24512w(int i10, int i11) {
        int i12;
        int i13;
        if (i10 == i11) {
            return;
        }
        int i14 = this.f28380l[i10];
        int i15 = this.f28381m[i10];
        m24497H(i14, i11);
        m24497H(i11, i15);
        K[] kArr = this.f28370b;
        K k10 = kArr[i10];
        V[] vArr = this.f28371c;
        V v10 = vArr[i10];
        kArr[i11] = k10;
        vArr[i11] = v10;
        int m24499f = m24499f(C4828q.m24525c(k10));
        int[] iArr = this.f28374f;
        int i16 = iArr[m24499f];
        if (i16 == i10) {
            iArr[m24499f] = i11;
        } else {
            int i17 = this.f28376h[i16];
            while (true) {
                int i18 = i17;
                i12 = i16;
                i16 = i18;
                if (i16 == i10) {
                    break;
                } else {
                    i17 = this.f28376h[i16];
                }
            }
            this.f28376h[i12] = i11;
        }
        int[] iArr2 = this.f28376h;
        iArr2[i11] = iArr2[i10];
        iArr2[i10] = -1;
        int m24499f2 = m24499f(C4828q.m24525c(v10));
        int[] iArr3 = this.f28375g;
        int i19 = iArr3[m24499f2];
        if (i19 == i10) {
            iArr3[m24499f2] = i11;
        } else {
            int i20 = this.f28377i[i19];
            while (true) {
                int i21 = i20;
                i13 = i19;
                i19 = i21;
                if (i19 == i10) {
                    break;
                } else {
                    i20 = this.f28377i[i19];
                }
            }
            this.f28377i[i13] = i11;
        }
        int[] iArr4 = this.f28377i;
        iArr4[i11] = iArr4[i10];
        iArr4[i10] = -1;
    }

    @Override // p099fc.InterfaceC4810h
    /* renamed from: x */
    public InterfaceC4810h<V, K> mo24394x() {
        InterfaceC4810h<V, K> interfaceC4810h = this.f28385q;
        InterfaceC4810h<V, K> interfaceC4810h2 = interfaceC4810h;
        if (interfaceC4810h == null) {
            interfaceC4810h2 = new d(this);
            this.f28385q = interfaceC4810h2;
        }
        return interfaceC4810h2;
    }

    @NullableDecl
    /* renamed from: y */
    public V m24513y(@NullableDecl K k10, @NullableDecl V v10, boolean z10) {
        int m24525c = C4828q.m24525c(k10);
        int m24505p = m24505p(k10, m24525c);
        if (m24505p != -1) {
            V v11 = this.f28371c[m24505p];
            if (C4705h.m23655a(v11, v10)) {
                return v10;
            }
            m24496G(m24505p, v10, z10);
            return v11;
        }
        int m24525c2 = C4828q.m24525c(v10);
        int m24507r = m24507r(v10, m24525c2);
        if (!z10) {
            C4708k.m23665g(m24507r == -1, "Value already present: %s", v10);
        } else if (m24507r != -1) {
            m24493D(m24507r, m24525c2);
        }
        m24502l(this.f28372d + 1);
        K[] kArr = this.f28370b;
        int i10 = this.f28372d;
        kArr[i10] = k10;
        this.f28371c[i10] = v10;
        m24510u(i10, m24525c);
        m24511v(this.f28372d, m24525c2);
        m24497H(this.f28379k, this.f28372d);
        m24497H(this.f28372d, -2);
        this.f28372d++;
        this.f28373e++;
        return null;
    }

    @NullableDecl
    /* renamed from: z */
    public K m24514z(@NullableDecl V v10, @NullableDecl K k10, boolean z10) {
        int m24525c = C4828q.m24525c(v10);
        int m24507r = m24507r(v10, m24525c);
        if (m24507r != -1) {
            K k11 = this.f28370b[m24507r];
            if (C4705h.m23655a(k11, k10)) {
                return k10;
            }
            m24495F(m24507r, k10, z10);
            return k11;
        }
        int i10 = this.f28379k;
        int m24525c2 = C4828q.m24525c(k10);
        int m24505p = m24505p(k10, m24525c2);
        if (!z10) {
            C4708k.m23665g(m24505p == -1, "Key already present: %s", k10);
        } else if (m24505p != -1) {
            i10 = this.f28380l[m24505p];
            m24492C(m24505p, m24525c2);
        }
        m24502l(this.f28372d + 1);
        K[] kArr = this.f28370b;
        int i11 = this.f28372d;
        kArr[i11] = k10;
        this.f28371c[i11] = v10;
        m24510u(i11, m24525c2);
        m24511v(this.f28372d, m24525c);
        int i12 = i10 == -2 ? this.f28378j : this.f28381m[i10];
        m24497H(i10, this.f28372d);
        m24497H(this.f28372d, i12);
        this.f28372d++;
        this.f28373e++;
        return null;
    }
}
