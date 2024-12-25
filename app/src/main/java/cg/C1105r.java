package cg;

import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/r.class
 */
/* renamed from: cg.r */
/* loaded from: combined.jar:classes2.jar:cg/r.class */
public final class C1105r<K, V> implements Map.Entry<K, V> {

    /* renamed from: b */
    public final K f7430b;

    /* renamed from: c */
    public final V f7431c;

    /* renamed from: d */
    public final EnumC1103p f7432d;

    public C1105r(K k10, V v10, EnumC1103p enumC1103p) {
        this.f7430b = k10;
        this.f7431c = v10;
        this.f7432d = (EnumC1103p) C1102o.m6665a(enumC1103p);
    }

    /* renamed from: a */
    public static <K, V> C1105r<K, V> m6669a(K k10, V v10, EnumC1103p enumC1103p) {
        return new C1105r<>(k10, v10, enumC1103p);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            z10 = false;
            if (C1100m.m6663a(getKey(), entry.getKey())) {
                z10 = false;
                if (C1100m.m6663a(getValue(), entry.getValue())) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f7430b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f7431c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        int i10 = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
