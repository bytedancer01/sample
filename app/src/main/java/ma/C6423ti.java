package ma;

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
  classes2.jar:ma/ti.class
 */
/* renamed from: ma.ti */
/* loaded from: combined.jar:classes2.jar:ma/ti.class */
public class C6423ti extends AbstractMap {

    /* renamed from: b */
    public final int f34071b;

    /* renamed from: e */
    public boolean f34074e;

    /* renamed from: f */
    public volatile C6381ri f34075f;

    /* renamed from: c */
    public List f34072c = Collections.emptyList();

    /* renamed from: d */
    public Map f34073d = Collections.emptyMap();

    /* renamed from: g */
    public Map f34076g = Collections.emptyMap();

    /* renamed from: b */
    public void mo29788b() {
        if (this.f34074e) {
            return;
        }
        this.f34073d = this.f34073d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f34073d);
        this.f34076g = this.f34076g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f34076g);
        this.f34074e = true;
    }

    /* renamed from: c */
    public final int m30049c() {
        return this.f34072c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m30057o();
        if (!this.f34072c.isEmpty()) {
            this.f34072c.clear();
        }
        if (this.f34073d.isEmpty()) {
            return;
        }
        this.f34073d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m30054l(comparable) >= 0 || this.f34073d.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable] */
    /* renamed from: d */
    public final Iterable m30050d() {
        return this.f34073d.isEmpty() ? C6276mi.m29853a() : this.f34073d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f34075f == null) {
            this.f34075f = new C6381ri(this, null);
        }
        return this.f34075f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6423ti)) {
            return super.equals(obj);
        }
        C6423ti c6423ti = (C6423ti) obj;
        int size = size();
        if (size != c6423ti.size()) {
            return false;
        }
        int m30049c = m30049c();
        if (m30049c == c6423ti.m30049c()) {
            for (int i10 = 0; i10 < m30049c; i10++) {
                if (!m30052h(i10).equals(c6423ti.m30052h(i10))) {
                    return false;
                }
            }
            if (m30049c == size) {
                return true;
            }
            entrySet = this.f34073d;
            entrySet2 = c6423ti.f34073d;
        } else {
            entrySet = entrySet();
            entrySet2 = c6423ti.entrySet();
        }
        return entrySet.equals(entrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m30057o();
        int m30054l = m30054l(comparable);
        if (m30054l >= 0) {
            return ((C6297ni) this.f34072c.get(m30054l)).setValue(obj);
        }
        m30057o();
        if (this.f34072c.isEmpty() && !(this.f34072c instanceof ArrayList)) {
            this.f34072c = new ArrayList(this.f34071b);
        }
        int i10 = -(m30054l + 1);
        if (i10 >= this.f34071b) {
            return m30056n().put(comparable, obj);
        }
        int size = this.f34072c.size();
        int i11 = this.f34071b;
        if (size == i11) {
            C6297ni c6297ni = (C6297ni) this.f34072c.remove(i11 - 1);
            m30056n().put(c6297ni.m29920d(), c6297ni.getValue());
        }
        this.f34072c.add(i10, new C6297ni(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m30054l = m30054l(comparable);
        return m30054l >= 0 ? ((C6297ni) this.f34072c.get(m30054l)).getValue() : this.f34073d.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry m30052h(int i10) {
        return (Map.Entry) this.f34072c.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m30049c = m30049c();
        int i10 = 0;
        for (int i11 = 0; i11 < m30049c; i11++) {
            i10 += ((C6297ni) this.f34072c.get(i11)).hashCode();
        }
        int i12 = i10;
        if (this.f34073d.size() > 0) {
            i12 = i10 + this.f34073d.hashCode();
        }
        return i12;
    }

    /* renamed from: k */
    public final boolean m30053k() {
        return this.f34074e;
    }

    /* renamed from: l */
    public final int m30054l(Comparable comparable) {
        int size = this.f34072c.size() - 1;
        int i10 = size;
        int i11 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C6297ni) this.f34072c.get(size)).m29920d());
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
            int compareTo2 = comparable.compareTo(((C6297ni) this.f34072c.get(i12)).m29920d());
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

    /* renamed from: m */
    public final Object m30055m(int i10) {
        m30057o();
        Object value = ((C6297ni) this.f34072c.remove(i10)).getValue();
        if (!this.f34073d.isEmpty()) {
            Iterator it = m30056n().entrySet().iterator();
            List list = this.f34072c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C6297ni(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    public final SortedMap m30056n() {
        m30057o();
        if (this.f34073d.isEmpty() && !(this.f34073d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f34073d = treeMap;
            this.f34076g = treeMap.descendingMap();
        }
        return (SortedMap) this.f34073d;
    }

    /* renamed from: o */
    public final void m30057o() {
        if (this.f34074e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m30057o();
        Comparable comparable = (Comparable) obj;
        int m30054l = m30054l(comparable);
        if (m30054l >= 0) {
            return m30055m(m30054l);
        }
        if (this.f34073d.isEmpty()) {
            return null;
        }
        return this.f34073d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34072c.size() + this.f34073d.size();
    }
}
