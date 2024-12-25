package p099fc;

import ec.C4705h;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/e.class
 */
/* renamed from: fc.e */
/* loaded from: combined.jar:classes2.jar:fc/e.class */
public abstract class AbstractC4804e<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(@NullableDecl Object obj) {
        boolean z10 = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            z10 = false;
            if (C4705h.m23655a(getKey(), entry.getKey())) {
                z10 = false;
                if (C4705h.m23655a(getValue(), entry.getValue())) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

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

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
