package p305ra;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/m8.class
 */
/* renamed from: ra.m8 */
/* loaded from: combined.jar:classes2.jar:ra/m8.class */
public class C8248m8<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    public final int f39186b;

    /* renamed from: e */
    public boolean f39189e;

    /* renamed from: f */
    public volatile C8233l8 f39190f;

    /* renamed from: c */
    public List<C8203j8> f39187c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f39188d = Collections.emptyMap();

    /* renamed from: g */
    public Map<K, V> f39191g = Collections.emptyMap();

    /* renamed from: b */
    public void mo35369b() {
        if (this.f39189e) {
            return;
        }
        this.f39188d = this.f39188d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f39188d);
        this.f39191g = this.f39191g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f39191g);
        this.f39189e = true;
    }

    /* renamed from: c */
    public final boolean m35617c() {
        return this.f39189e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m35624n();
        if (!this.f39187c.isEmpty()) {
            this.f39187c.clear();
        }
        if (this.f39188d.isEmpty()) {
            return;
        }
        this.f39188d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m35623m(comparable) >= 0 || this.f39188d.containsKey(comparable);
    }

    /* renamed from: d */
    public final int m35618d() {
        return this.f39187c.size();
    }

    /* renamed from: e */
    public final Map.Entry<K, V> m35619e(int i10) {
        return this.f39187c.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f39190f == null) {
            this.f39190f = new C8233l8(this, null);
        }
        return this.f39190f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8248m8)) {
            return super.equals(obj);
        }
        C8248m8 c8248m8 = (C8248m8) obj;
        int size = size();
        if (size != c8248m8.size()) {
            return false;
        }
        int m35618d = m35618d();
        if (m35618d != c8248m8.m35618d()) {
            return entrySet().equals(c8248m8.entrySet());
        }
        for (int i10 = 0; i10 < m35618d; i10++) {
            if (!m35619e(i10).equals(c8248m8.m35619e(i10))) {
                return false;
            }
        }
        if (m35618d != size) {
            return this.f39188d.equals(c8248m8.f39188d);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable] */
    /* renamed from: f */
    public final Iterable<Map.Entry<K, V>> m35620f() {
        return this.f39188d.isEmpty() ? C8188i8.m35453a() : this.f39188d.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        m35624n();
        int m35623m = m35623m(k10);
        if (m35623m >= 0) {
            return (V) this.f39187c.get(m35623m).setValue(v10);
        }
        m35624n();
        if (this.f39187c.isEmpty() && !(this.f39187c instanceof ArrayList)) {
            this.f39187c = new ArrayList(this.f39186b);
        }
        int i10 = -(m35623m + 1);
        if (i10 >= this.f39186b) {
            return m35625o().put(k10, v10);
        }
        int size = this.f39187c.size();
        int i11 = this.f39186b;
        if (size == i11) {
            C8203j8 remove = this.f39187c.remove(i11 - 1);
            m35625o().put(remove.m35516d(), remove.getValue());
        }
        this.f39187c.add(i10, new C8203j8(this, k10, v10));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m35623m = m35623m(comparable);
        return m35623m >= 0 ? (V) this.f39187c.get(m35623m).getValue() : this.f39188d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m35618d = m35618d();
        int i10 = 0;
        for (int i11 = 0; i11 < m35618d; i11++) {
            i10 += this.f39187c.get(i11).hashCode();
        }
        int i12 = i10;
        if (this.f39188d.size() > 0) {
            i12 = i10 + this.f39188d.hashCode();
        }
        return i12;
    }

    /* renamed from: l */
    public final V m35622l(int i10) {
        m35624n();
        V v10 = (V) this.f39187c.remove(i10).getValue();
        if (!this.f39188d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m35625o().entrySet().iterator();
            List<C8203j8> list = this.f39187c;
            Map.Entry<K, V> next = it.next();
            list.add(new C8203j8(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    /* renamed from: m */
    public final int m35623m(K k10) {
        int size = this.f39187c.size() - 1;
        int i10 = size;
        int i11 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f39187c.get(size).m35516d());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
            i10 = size;
            i11 = 0;
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = k10.compareTo(this.f39187c.get(i12).m35516d());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* renamed from: n */
    public final void m35624n() {
        if (this.f39189e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    public final SortedMap<K, V> m35625o() {
        m35624n();
        if (this.f39188d.isEmpty() && !(this.f39188d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f39188d = treeMap;
            this.f39191g = treeMap.descendingMap();
        }
        return (SortedMap) this.f39188d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m35624n();
        Comparable comparable = (Comparable) obj;
        int m35623m = m35623m(comparable);
        if (m35623m >= 0) {
            return (V) m35622l(m35623m);
        }
        if (this.f39188d.isEmpty()) {
            return null;
        }
        return this.f39188d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f39187c.size() + this.f39188d.size();
    }
}
