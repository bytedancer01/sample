package p099fc;

import ec.C4705h;
import ec.C4708k;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/l.class
 */
/* renamed from: fc.l */
/* loaded from: combined.jar:classes2.jar:fc/l.class */
public class C4818l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: b */
    @MonotonicNonNullDecl
    public transient int[] f28317b;

    /* renamed from: c */
    @MonotonicNonNullDecl
    public transient long[] f28318c;

    /* renamed from: d */
    @MonotonicNonNullDecl
    public transient Object[] f28319d;

    /* renamed from: e */
    @MonotonicNonNullDecl
    public transient Object[] f28320e;

    /* renamed from: f */
    public transient float f28321f;

    /* renamed from: g */
    public transient int f28322g;

    /* renamed from: h */
    public transient int f28323h;

    /* renamed from: i */
    public transient int f28324i;

    /* renamed from: j */
    @MonotonicNonNullDecl
    public transient Set<K> f28325j;

    /* renamed from: k */
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> f28326k;

    /* renamed from: l */
    @MonotonicNonNullDecl
    public transient Collection<V> f28327l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$a.class
     */
    /* renamed from: fc.l$a */
    /* loaded from: combined.jar:classes2.jar:fc/l$a.class */
    public class a extends C4818l<K, V>.e<K> {

        /* renamed from: f */
        public final C4818l f28328f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4818l c4818l) {
            super(c4818l, null);
            this.f28328f = c4818l;
        }

        @Override // p099fc.C4818l.e
        /* renamed from: b */
        public K mo24443b(int i10) {
            return (K) this.f28328f.f28319d[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$b.class
     */
    /* renamed from: fc.l$b */
    /* loaded from: combined.jar:classes2.jar:fc/l$b.class */
    public class b extends C4818l<K, V>.e<Map.Entry<K, V>> {

        /* renamed from: f */
        public final C4818l f28329f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4818l c4818l) {
            super(c4818l, null);
            this.f28329f = c4818l;
        }

        @Override // p099fc.C4818l.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo24443b(int i10) {
            return new g(this.f28329f, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$c.class
     */
    /* renamed from: fc.l$c */
    /* loaded from: combined.jar:classes2.jar:fc/l$c.class */
    public class c extends C4818l<K, V>.e<V> {

        /* renamed from: f */
        public final C4818l f28330f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4818l c4818l) {
            super(c4818l, null);
            this.f28330f = c4818l;
        }

        @Override // p099fc.C4818l.e
        /* renamed from: b */
        public V mo24443b(int i10) {
            return (V) this.f28330f.f28320e[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$d.class
     */
    /* renamed from: fc.l$d */
    /* loaded from: combined.jar:classes2.jar:fc/l$d.class */
    public class d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: b */
        public final C4818l f28331b;

        public d(C4818l c4818l) {
            this.f28331b = c4818l;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f28331b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            boolean z10 = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int m24437r = this.f28331b.m24437r(entry.getKey());
                z10 = false;
                if (m24437r != -1) {
                    z10 = false;
                    if (C4705h.m23655a(this.f28331b.f28320e[m24437r], entry.getValue())) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.f28331b.m24433l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m24437r = this.f28331b.m24437r(entry.getKey());
            if (m24437r == -1 || !C4705h.m23655a(this.f28331b.f28320e[m24437r], entry.getValue())) {
                return false;
            }
            this.f28331b.m24423A(m24437r);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f28331b.f28324i;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$e.class
     */
    /* renamed from: fc.l$e */
    /* loaded from: combined.jar:classes2.jar:fc/l$e.class */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: b */
        public int f28332b;

        /* renamed from: c */
        public int f28333c;

        /* renamed from: d */
        public int f28334d;

        /* renamed from: e */
        public final C4818l f28335e;

        public e(C4818l c4818l) {
            this.f28335e = c4818l;
            this.f28332b = c4818l.f28322g;
            this.f28333c = c4818l.m24434m();
            this.f28334d = -1;
        }

        public /* synthetic */ e(C4818l c4818l, a aVar) {
            this(c4818l);
        }

        /* renamed from: a */
        public final void m24445a() {
            if (this.f28335e.f28322g != this.f28332b) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public abstract T mo24443b(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28333c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            m24445a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f28333c;
            this.f28334d = i10;
            T mo24443b = mo24443b(i10);
            this.f28333c = this.f28335e.m24435p(this.f28333c);
            return mo24443b;
        }

        @Override // java.util.Iterator
        public void remove() {
            m24445a();
            C4814j.m24400c(this.f28334d >= 0);
            this.f28332b++;
            this.f28335e.m24423A(this.f28334d);
            this.f28333c = this.f28335e.m24429f(this.f28333c, this.f28334d);
            this.f28334d = -1;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$f.class
     */
    /* renamed from: fc.l$f */
    /* loaded from: combined.jar:classes2.jar:fc/l$f.class */
    public class f extends AbstractSet<K> {

        /* renamed from: b */
        public final C4818l f28336b;

        public f(C4818l c4818l) {
            this.f28336b = c4818l;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f28336b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f28336b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return this.f28336b.m24440u();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int m24437r = this.f28336b.m24437r(obj);
            if (m24437r == -1) {
                return false;
            }
            this.f28336b.m24423A(m24437r);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f28336b.f28324i;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$g.class
     */
    /* renamed from: fc.l$g */
    /* loaded from: combined.jar:classes2.jar:fc/l$g.class */
    public final class g extends AbstractC4804e<K, V> {

        /* renamed from: b */
        @NullableDecl
        public final K f28337b;

        /* renamed from: c */
        public int f28338c;

        /* renamed from: d */
        public final C4818l f28339d;

        public g(C4818l c4818l, int i10) {
            this.f28339d = c4818l;
            this.f28337b = (K) c4818l.f28319d[i10];
            this.f28338c = i10;
        }

        /* renamed from: a */
        public final void m24446a() {
            int i10 = this.f28338c;
            if (i10 == -1 || i10 >= this.f28339d.size() || !C4705h.m23655a(this.f28337b, this.f28339d.f28319d[this.f28338c])) {
                this.f28338c = this.f28339d.m24437r(this.f28337b);
            }
        }

        @Override // p099fc.AbstractC4804e, java.util.Map.Entry
        public K getKey() {
            return this.f28337b;
        }

        @Override // p099fc.AbstractC4804e, java.util.Map.Entry
        public V getValue() {
            m24446a();
            int i10 = this.f28338c;
            return (V) (i10 == -1 ? null : this.f28339d.f28320e[i10]);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            m24446a();
            int i10 = this.f28338c;
            if (i10 == -1) {
                this.f28339d.put(this.f28337b, v10);
                return null;
            }
            Object[] objArr = this.f28339d.f28320e;
            V v11 = (V) objArr[i10];
            objArr[i10] = v10;
            return v11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/l$h.class
     */
    /* renamed from: fc.l$h */
    /* loaded from: combined.jar:classes2.jar:fc/l$h.class */
    public class h extends AbstractCollection<V> {

        /* renamed from: b */
        public final C4818l f28340b;

        public h(C4818l c4818l) {
            this.f28340b = c4818l;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f28340b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return this.f28340b.m24427F();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f28340b.f28324i;
        }
    }

    public C4818l() {
        m24438s(3, 1.0f);
    }

    public C4818l(int i10) {
        this(i10, 1.0f);
    }

    public C4818l(int i10, float f10) {
        m24438s(i10, f10);
    }

    /* renamed from: E */
    public static long m24413E(long j10, int i10) {
        return (j10 & (-4294967296L)) | (i10 & 4294967295L);
    }

    /* renamed from: g */
    public static <K, V> C4818l<K, V> m24417g() {
        return new C4818l<>();
    }

    /* renamed from: k */
    public static <K, V> C4818l<K, V> m24418k(int i10) {
        return new C4818l<>(i10);
    }

    /* renamed from: n */
    public static int m24419n(long j10) {
        return (int) (j10 >>> 32);
    }

    /* renamed from: o */
    public static int m24420o(long j10) {
        return (int) j10;
    }

    /* renamed from: w */
    public static long[] m24421w(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* renamed from: y */
    public static int[] m24422y(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: A */
    public final V m24423A(int i10) {
        return m24442z(this.f28319d[i10], m24419n(this.f28318c[i10]));
    }

    /* renamed from: B */
    public void m24424B(int i10) {
        this.f28319d = Arrays.copyOf(this.f28319d, i10);
        this.f28320e = Arrays.copyOf(this.f28320e, i10);
        long[] jArr = this.f28318c;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(copyOf, length, i10, -1L);
        }
        this.f28318c = copyOf;
    }

    /* renamed from: C */
    public final void m24425C(int i10) {
        int length = this.f28318c.length;
        if (i10 > length) {
            int max = Math.max(1, length >>> 1) + length;
            int i11 = max;
            if (max < 0) {
                i11 = Integer.MAX_VALUE;
            }
            if (i11 != length) {
                m24424B(i11);
            }
        }
    }

    /* renamed from: D */
    public final void m24426D(int i10) {
        if (this.f28317b.length >= 1073741824) {
            this.f28323h = Integer.MAX_VALUE;
            return;
        }
        int i11 = (int) (i10 * this.f28321f);
        int[] m24422y = m24422y(i10);
        long[] jArr = this.f28318c;
        int length = m24422y.length;
        for (int i12 = 0; i12 < this.f28324i; i12++) {
            int m24419n = m24419n(jArr[i12]);
            int i13 = m24419n & (length - 1);
            int i14 = m24422y[i13];
            m24422y[i13] = i12;
            jArr[i12] = (m24419n << 32) | (i14 & 4294967295L);
        }
        this.f28323h = i11 + 1;
        this.f28317b = m24422y;
    }

    /* renamed from: F */
    public Iterator<V> m24427F() {
        return new c(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f28322g++;
        Arrays.fill(this.f28319d, 0, this.f28324i, (Object) null);
        Arrays.fill(this.f28320e, 0, this.f28324i, (Object) null);
        Arrays.fill(this.f28317b, -1);
        Arrays.fill(this.f28318c, -1L);
        this.f28324i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return m24437r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i10 = 0; i10 < this.f28324i; i10++) {
            if (C4705h.m23655a(obj, this.f28320e[i10])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m24428e(int i10) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f28326k;
        Set<Map.Entry<K, V>> set2 = set;
        if (set == null) {
            set2 = m24430h();
            this.f28326k = set2;
        }
        return set2;
    }

    /* renamed from: f */
    public int m24429f(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int m24437r = m24437r(obj);
        m24428e(m24437r);
        return (V) (m24437r == -1 ? null : this.f28320e[m24437r]);
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> m24430h() {
        return new d(this);
    }

    /* renamed from: i */
    public Set<K> m24431i() {
        return new f(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f28324i == 0;
    }

    /* renamed from: j */
    public Collection<V> m24432j() {
        return new h(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f28325j;
        Set<K> set2 = set;
        if (set == null) {
            set2 = m24431i();
            this.f28325j = set2;
        }
        return set2;
    }

    /* renamed from: l */
    public Iterator<Map.Entry<K, V>> m24433l() {
        return new b(this);
    }

    /* renamed from: m */
    public int m24434m() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: p */
    public int m24435p(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f28324i) {
            i11 = -1;
        }
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V put(@NullableDecl K k10, @NullableDecl V v10) {
        long[] jArr = this.f28318c;
        Object[] objArr = this.f28319d;
        Object[] objArr2 = this.f28320e;
        int m24525c = C4828q.m24525c(k10);
        int m24436q = m24436q() & m24525c;
        int i10 = this.f28324i;
        int[] iArr = this.f28317b;
        int i11 = iArr[m24436q];
        int i12 = i11;
        if (i11 == -1) {
            iArr[m24436q] = i10;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (m24419n(j10) == m24525c && C4705h.m23655a(k10, objArr[i12])) {
                    V v11 = (V) objArr2[i12];
                    objArr2[i12] = v10;
                    m24428e(i12);
                    return v11;
                }
                int m24420o = m24420o(j10);
                if (m24420o == -1) {
                    jArr[i12] = m24413E(j10, i10);
                    break;
                }
                i12 = m24420o;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i13 = i10 + 1;
        m24425C(i13);
        m24439t(i10, k10, v10, m24525c);
        this.f28324i = i13;
        if (i10 >= this.f28323h) {
            m24426D(this.f28317b.length * 2);
        }
        this.f28322g++;
        return null;
    }

    /* renamed from: q */
    public final int m24436q() {
        return this.f28317b.length - 1;
    }

    /* renamed from: r */
    public final int m24437r(@NullableDecl Object obj) {
        int m24525c = C4828q.m24525c(obj);
        int i10 = this.f28317b[m24436q() & m24525c];
        while (true) {
            int i11 = i10;
            if (i11 == -1) {
                return -1;
            }
            long j10 = this.f28318c[i11];
            if (m24419n(j10) == m24525c && C4705h.m23655a(obj, this.f28319d[i11])) {
                return i11;
            }
            i10 = m24420o(j10);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return m24442z(obj, C4828q.m24525c(obj));
    }

    /* renamed from: s */
    public void m24438s(int i10, float f10) {
        C4708k.m23663e(i10 >= 0, "Initial capacity must be non-negative");
        boolean z10 = false;
        if (f10 > 0.0f) {
            z10 = true;
        }
        C4708k.m23663e(z10, "Illegal load factor");
        int m24523a = C4828q.m24523a(i10, f10);
        this.f28317b = m24422y(m24523a);
        this.f28321f = f10;
        this.f28319d = new Object[i10];
        this.f28320e = new Object[i10];
        this.f28318c = m24421w(i10);
        this.f28323h = Math.max(1, (int) (m24523a * f10));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f28324i;
    }

    /* renamed from: t */
    public void m24439t(int i10, @NullableDecl K k10, @NullableDecl V v10, int i11) {
        this.f28318c[i10] = (i11 << 32) | 4294967295L;
        this.f28319d[i10] = k10;
        this.f28320e[i10] = v10;
    }

    /* renamed from: u */
    public Iterator<K> m24440u() {
        return new a(this);
    }

    /* renamed from: v */
    public void m24441v(int i10) {
        int size = size() - 1;
        if (i10 >= size) {
            this.f28319d[i10] = null;
            this.f28320e[i10] = null;
            this.f28318c[i10] = -1;
            return;
        }
        Object[] objArr = this.f28319d;
        objArr[i10] = objArr[size];
        Object[] objArr2 = this.f28320e;
        objArr2[i10] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        long[] jArr = this.f28318c;
        long j10 = jArr[size];
        jArr[i10] = j10;
        jArr[size] = -1;
        int m24419n = m24419n(j10) & m24436q();
        int[] iArr = this.f28317b;
        int i11 = iArr[m24419n];
        int i12 = i11;
        if (i11 == size) {
            iArr[m24419n] = i10;
            return;
        }
        while (true) {
            long j11 = this.f28318c[i12];
            int m24420o = m24420o(j11);
            if (m24420o == size) {
                this.f28318c[i12] = m24413E(j11, i10);
                return;
            }
            i12 = m24420o;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f28327l;
        Collection<V> collection2 = collection;
        if (collection == null) {
            collection2 = m24432j();
            this.f28327l = collection2;
        }
        return collection2;
    }

    @NullableDecl
    /* renamed from: z */
    public final V m24442z(@NullableDecl Object obj, int i10) {
        int m24436q = m24436q() & i10;
        int i11 = this.f28317b[m24436q];
        if (i11 == -1) {
            return null;
        }
        int i12 = -1;
        while (true) {
            if (m24419n(this.f28318c[i11]) == i10 && C4705h.m23655a(obj, this.f28319d[i11])) {
                V v10 = (V) this.f28320e[i11];
                if (i12 == -1) {
                    this.f28317b[m24436q] = m24420o(this.f28318c[i11]);
                } else {
                    long[] jArr = this.f28318c;
                    jArr[i12] = m24413E(jArr[i12], m24420o(jArr[i11]));
                }
                m24441v(i11);
                this.f28324i--;
                this.f28322g++;
                return v10;
            }
            int m24420o = m24420o(this.f28318c[i11]);
            if (m24420o == -1) {
                return null;
            }
            i12 = i11;
            i11 = m24420o;
        }
    }
}
