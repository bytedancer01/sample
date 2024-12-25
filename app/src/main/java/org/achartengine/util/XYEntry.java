package org.achartengine.util;

import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/util/XYEntry.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/util/XYEntry.class */
public class XYEntry<K, V> implements Map.Entry<K, V> {
    private final K key;
    private V value;

    public XYEntry(K k10, V v10) {
        this.key = k10;
        this.value = v10;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        this.value = v10;
        return v10;
    }
}
