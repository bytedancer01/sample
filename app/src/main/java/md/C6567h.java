package md;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/h.class
 */
/* renamed from: md.h */
/* loaded from: combined.jar:classes2.jar:md/h.class */
public final class C6567h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i */
    public static final Comparator<Comparable> f34368i = new a();

    /* renamed from: b */
    public Comparator<? super K> f34369b;

    /* renamed from: c */
    public e<K, V> f34370c;

    /* renamed from: d */
    public int f34371d;

    /* renamed from: e */
    public int f34372e;

    /* renamed from: f */
    public final e<K, V> f34373f;

    /* renamed from: g */
    public C6567h<K, V>.b f34374g;

    /* renamed from: h */
    public C6567h<K, V>.c f34375h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/h$a.class
     */
    /* renamed from: md.h$a */
    /* loaded from: combined.jar:classes2.jar:md/h$a.class */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/h$b.class
     */
    /* renamed from: md.h$b */
    /* loaded from: combined.jar:classes2.jar:md/h$b.class */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: b */
        public final C6567h f34376b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:md/h$b$a.class
         */
        /* renamed from: md.h$b$a */
        /* loaded from: combined.jar:classes2.jar:md/h$b$a.class */
        public class a extends C6567h<K, V>.d<Map.Entry<K, V>> {

            /* renamed from: f */
            public final b f34377f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(bVar.f34376b);
                this.f34377f = bVar;
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m30326a();
            }
        }

        public b(C6567h c6567h) {
            this.f34376b = c6567h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f34376b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && this.f34376b.m30316d((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> m30316d;
            if (!(obj instanceof Map.Entry) || (m30316d = this.f34376b.m30316d((Map.Entry) obj)) == null) {
                return false;
            }
            this.f34376b.m30319g(m30316d, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f34376b.f34371d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/h$c.class
     */
    /* renamed from: md.h$c */
    /* loaded from: combined.jar:classes2.jar:md/h$c.class */
    public final class c extends AbstractSet<K> {

        /* renamed from: b */
        public final C6567h f34378b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:md/h$c$a.class
         */
        /* renamed from: md.h$c$a */
        /* loaded from: combined.jar:classes2.jar:md/h$c$a.class */
        public class a extends C6567h<K, V>.d<K> {

            /* renamed from: f */
            public final c f34379f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(cVar.f34378b);
                this.f34379f = cVar;
            }

            @Override // java.util.Iterator
            public K next() {
                return m30326a().f34389g;
            }
        }

        public c(C6567h c6567h) {
            this.f34378b = c6567h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f34378b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f34378b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f34378b.m30320h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f34378b.f34371d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/h$d.class
     */
    /* renamed from: md.h$d */
    /* loaded from: combined.jar:classes2.jar:md/h$d.class */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b */
        public e<K, V> f34380b;

        /* renamed from: c */
        public e<K, V> f34381c = null;

        /* renamed from: d */
        public int f34382d;

        /* renamed from: e */
        public final C6567h f34383e;

        public d(C6567h c6567h) {
            this.f34383e = c6567h;
            this.f34380b = c6567h.f34373f.f34387e;
            this.f34382d = c6567h.f34372e;
        }

        /* renamed from: a */
        public final e<K, V> m30326a() {
            e<K, V> eVar = this.f34380b;
            C6567h c6567h = this.f34383e;
            if (eVar == c6567h.f34373f) {
                throw new NoSuchElementException();
            }
            if (c6567h.f34372e != this.f34382d) {
                throw new ConcurrentModificationException();
            }
            this.f34380b = eVar.f34387e;
            this.f34381c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f34380b != this.f34383e.f34373f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f34381c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            this.f34383e.m30319g(eVar, true);
            this.f34381c = null;
            this.f34382d = this.f34383e.f34372e;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/h$e.class
     */
    /* renamed from: md.h$e */
    /* loaded from: combined.jar:classes2.jar:md/h$e.class */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public e<K, V> f34384b;

        /* renamed from: c */
        public e<K, V> f34385c;

        /* renamed from: d */
        public e<K, V> f34386d;

        /* renamed from: e */
        public e<K, V> f34387e;

        /* renamed from: f */
        public e<K, V> f34388f;

        /* renamed from: g */
        public final K f34389g;

        /* renamed from: h */
        public V f34390h;

        /* renamed from: i */
        public int f34391i;

        public e() {
            this.f34389g = null;
            this.f34388f = this;
            this.f34387e = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f34384b = eVar;
            this.f34389g = k10;
            this.f34391i = 1;
            this.f34387e = eVar2;
            this.f34388f = eVar3;
            eVar3.f34387e = this;
            eVar2.f34388f = this;
        }

        /* renamed from: a */
        public e<K, V> m30327a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f34385c; eVar2 != null; eVar2 = eVar2.f34385c) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public e<K, V> m30328b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f34386d; eVar2 != null; eVar2 = eVar2.f34386d) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
        
            if (r0 != null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        
            if (r0.equals(r0) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r0.equals(r0.getKey()) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
        
            if (r0.getKey() == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
        
            r0 = r3.f34390h;
            r0 = r0.getValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
        
            if (r0 != null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
        
            r5 = false;
         */
        @Override // java.util.Map.Entry
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = r4
                boolean r0 = r0 instanceof java.util.Map.Entry
                r7 = r0
                r0 = 0
                r6 = r0
                r0 = r6
                r5 = r0
                r0 = r7
                if (r0 == 0) goto L66
                r0 = r4
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r8 = r0
                r0 = r3
                K r0 = r0.f34389g
                r4 = r0
                r0 = r4
                if (r0 != 0) goto L2d
                r0 = r6
                r5 = r0
                r0 = r8
                java.lang.Object r0 = r0.getKey()
                if (r0 != 0) goto L66
                goto L3d
            L2d:
                r0 = r6
                r5 = r0
                r0 = r4
                r1 = r8
                java.lang.Object r1 = r1.getKey()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L66
            L3d:
                r0 = r3
                V r0 = r0.f34390h
                r4 = r0
                r0 = r8
                java.lang.Object r0 = r0.getValue()
                r8 = r0
                r0 = r4
                if (r0 != 0) goto L59
                r0 = r6
                r5 = r0
                r0 = r8
                if (r0 != 0) goto L66
                goto L64
            L59:
                r0 = r6
                r5 = r0
                r0 = r4
                r1 = r8
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L66
            L64:
                r0 = 1
                r5 = r0
            L66:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: md.C6567h.e.equals(java.lang.Object):boolean");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f34389g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f34390h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f34389g;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f34390h;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f34390h;
            this.f34390h = v10;
            return v11;
        }

        public String toString() {
            return this.f34389g + "=" + this.f34390h;
        }
    }

    public C6567h() {
        this(f34368i);
    }

    public C6567h(Comparator<? super K> comparator) {
        this.f34371d = 0;
        this.f34372e = 0;
        this.f34373f = new e<>();
        this.f34369b = comparator == null ? f34368i : comparator;
    }

    /* renamed from: b */
    public final boolean m30314b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public e<K, V> m30315c(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f34369b;
        e<K, V> eVar2 = this.f34370c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f34368i ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f34389g;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f34385c : eVar2.f34386d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f34373f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f34388f);
            if (i10 < 0) {
                eVar2.f34385c = eVar;
            } else {
                eVar2.f34386d = eVar;
            }
            m30318f(eVar2, true);
        } else {
            if (comparator == f34368i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f34388f);
            this.f34370c = eVar;
        }
        this.f34371d++;
        this.f34372e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f34370c = null;
        this.f34371d = 0;
        this.f34372e++;
        e<K, V> eVar = this.f34373f;
        eVar.f34388f = eVar;
        eVar.f34387e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m30317e(obj) != null;
    }

    /* renamed from: d */
    public e<K, V> m30316d(Map.Entry<?, ?> entry) {
        e<K, V> m30317e = m30317e(entry.getKey());
        return m30317e != null && m30314b(m30317e.f34390h, entry.getValue()) ? m30317e : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public e<K, V> m30317e(Object obj) {
        e<K, V> eVar = null;
        if (obj != 0) {
            try {
                eVar = m30315c(obj, false);
            } catch (ClassCastException e10) {
                eVar = null;
            }
        }
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C6567h<K, V>.b bVar = this.f34374g;
        if (bVar == null) {
            bVar = new b(this);
            this.f34374g = bVar;
        }
        return bVar;
    }

    /* renamed from: f */
    public final void m30318f(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f34385c;
            e<K, V> eVar3 = eVar.f34386d;
            int i10 = eVar2 != null ? eVar2.f34391i : 0;
            int i11 = eVar3 != null ? eVar3.f34391i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f34385c;
                e<K, V> eVar5 = eVar3.f34386d;
                int i13 = eVar5 != null ? eVar5.f34391i : 0;
                int i14 = 0;
                if (eVar4 != null) {
                    i14 = eVar4.f34391i;
                }
                int i15 = i14 - i13;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    m30323k(eVar3);
                }
                m30322j(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f34385c;
                e<K, V> eVar7 = eVar2.f34386d;
                int i16 = eVar7 != null ? eVar7.f34391i : 0;
                int i17 = 0;
                if (eVar6 != null) {
                    i17 = eVar6.f34391i;
                }
                int i18 = i17 - i16;
                if (i18 != 1 && (i18 != 0 || z10)) {
                    m30322j(eVar2);
                }
                m30323k(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f34391i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f34391i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f34384b;
        }
    }

    /* renamed from: g */
    public void m30319g(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f34388f;
            eVar2.f34387e = eVar.f34387e;
            eVar.f34387e.f34388f = eVar2;
        }
        e<K, V> eVar3 = eVar.f34385c;
        e<K, V> eVar4 = eVar.f34386d;
        e<K, V> eVar5 = eVar.f34384b;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m30321i(eVar, eVar3);
                eVar.f34385c = null;
            } else if (eVar4 != null) {
                m30321i(eVar, eVar4);
                eVar.f34386d = null;
            } else {
                m30321i(eVar, null);
            }
            m30318f(eVar5, false);
            this.f34371d--;
            this.f34372e++;
            return;
        }
        e<K, V> m30328b = eVar3.f34391i > eVar4.f34391i ? eVar3.m30328b() : eVar4.m30327a();
        m30319g(m30328b, false);
        e<K, V> eVar6 = eVar.f34385c;
        if (eVar6 != null) {
            i10 = eVar6.f34391i;
            m30328b.f34385c = eVar6;
            eVar6.f34384b = m30328b;
            eVar.f34385c = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f34386d;
        if (eVar7 != null) {
            i11 = eVar7.f34391i;
            m30328b.f34386d = eVar7;
            eVar7.f34384b = m30328b;
            eVar.f34386d = null;
        }
        m30328b.f34391i = Math.max(i10, i11) + 1;
        m30321i(eVar, m30328b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> m30317e = m30317e(obj);
        return m30317e != null ? m30317e.f34390h : null;
    }

    /* renamed from: h */
    public e<K, V> m30320h(Object obj) {
        e<K, V> m30317e = m30317e(obj);
        if (m30317e != null) {
            m30319g(m30317e, true);
        }
        return m30317e;
    }

    /* renamed from: i */
    public final void m30321i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f34384b;
        eVar.f34384b = null;
        if (eVar2 != null) {
            eVar2.f34384b = eVar3;
        }
        if (eVar3 == null) {
            this.f34370c = eVar2;
        } else if (eVar3.f34385c == eVar) {
            eVar3.f34385c = eVar2;
        } else {
            eVar3.f34386d = eVar2;
        }
    }

    /* renamed from: j */
    public final void m30322j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f34385c;
        e<K, V> eVar3 = eVar.f34386d;
        e<K, V> eVar4 = eVar3.f34385c;
        e<K, V> eVar5 = eVar3.f34386d;
        eVar.f34386d = eVar4;
        if (eVar4 != null) {
            eVar4.f34384b = eVar;
        }
        m30321i(eVar, eVar3);
        eVar3.f34385c = eVar;
        eVar.f34384b = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f34391i : 0, eVar4 != null ? eVar4.f34391i : 0) + 1;
        eVar.f34391i = max;
        int i10 = 0;
        if (eVar5 != null) {
            i10 = eVar5.f34391i;
        }
        eVar3.f34391i = Math.max(max, i10) + 1;
    }

    /* renamed from: k */
    public final void m30323k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f34385c;
        e<K, V> eVar3 = eVar.f34386d;
        e<K, V> eVar4 = eVar2.f34385c;
        e<K, V> eVar5 = eVar2.f34386d;
        eVar.f34385c = eVar5;
        if (eVar5 != null) {
            eVar5.f34384b = eVar;
        }
        m30321i(eVar, eVar2);
        eVar2.f34386d = eVar;
        eVar.f34384b = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f34391i : 0, eVar5 != null ? eVar5.f34391i : 0) + 1;
        eVar.f34391i = max;
        int i10 = 0;
        if (eVar4 != null) {
            i10 = eVar4.f34391i;
        }
        eVar2.f34391i = Math.max(max, i10) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C6567h<K, V>.c cVar = this.f34375h;
        if (cVar == null) {
            cVar = new c(this);
            this.f34375h = cVar;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> m30315c = m30315c(k10, true);
        V v11 = m30315c.f34390h;
        m30315c.f34390h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> m30320h = m30320h(obj);
        return m30320h != null ? m30320h.f34390h : null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f34371d;
    }
}
