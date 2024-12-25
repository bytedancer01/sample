package p305ra;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/k7.class
 */
/* renamed from: ra.k7 */
/* loaded from: combined.jar:classes2.jar:ra/k7.class */
public final class C8217k7<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final C8217k7 f39150c;

    /* renamed from: b */
    public boolean f39151b;

    static {
        C8217k7 c8217k7 = new C8217k7();
        f39150c = c8217k7;
        c8217k7.f39151b = false;
    }

    public C8217k7() {
        this.f39151b = true;
    }

    public C8217k7(Map<K, V> map) {
        super(map);
        this.f39151b = true;
    }

    /* renamed from: b */
    public static <K, V> C8217k7<K, V> m35530b() {
        return f39150c;
    }

    /* renamed from: h */
    public static int m35531h(Object obj) {
        if (obj instanceof byte[]) {
            return C8366u6.m35908g((byte[]) obj);
        }
        if (obj instanceof InterfaceC8261n6) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: c */
    public final void m35532c(C8217k7<K, V> c8217k7) {
        m35536i();
        if (c8217k7.isEmpty()) {
            return;
        }
        putAll(c8217k7);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m35536i();
        super.clear();
    }

    /* renamed from: d */
    public final C8217k7<K, V> m35533d() {
        return isEmpty() ? new C8217k7<>() : new C8217k7<>(this);
    }

    /* renamed from: e */
    public final void m35534e() {
        this.f39151b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m35535g() {
        return this.f39151b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return i11;
            }
            Map.Entry<K, V> next = it.next();
            i10 = i11 + (m35531h(next.getValue()) ^ m35531h(next.getKey()));
        }
    }

    /* renamed from: i */
    public final void m35536i() {
        if (!this.f39151b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        m35536i();
        C8366u6.m35902a(k10);
        C8366u6.m35902a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m35536i();
        for (K k10 : map.keySet()) {
            C8366u6.m35902a(k10);
            C8366u6.m35902a(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m35536i();
        return (V) super.remove(obj);
    }
}
