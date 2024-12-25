package org.achartengine.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/util/IndexXYMap.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/util/IndexXYMap.class */
public class IndexXYMap<K, V> extends TreeMap<K, V> {
    private final List<K> indexList = new ArrayList();
    private double maxXDifference = 0.0d;

    private void updateMaxXDifference() {
        if (this.indexList.size() < 2) {
            this.maxXDifference = 0.0d;
            return;
        }
        List<K> list = this.indexList;
        double doubleValue = ((Double) list.get(list.size() - 1)).doubleValue();
        List<K> list2 = this.indexList;
        if (Math.abs(doubleValue - ((Double) list2.get(list2.size() - 2)).doubleValue()) > this.maxXDifference) {
            List<K> list3 = this.indexList;
            double doubleValue2 = ((Double) list3.get(list3.size() - 1)).doubleValue();
            List<K> list4 = this.indexList;
            this.maxXDifference = Math.abs(doubleValue2 - ((Double) list4.get(list4.size() - 2)).doubleValue());
        }
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        updateMaxXDifference();
        super.clear();
        this.indexList.clear();
    }

    public XYEntry<K, V> getByIndex(int i10) {
        K k10 = this.indexList.get(i10);
        return new XYEntry<>(k10, get(k10));
    }

    public int getIndexForKey(K k10) {
        return Collections.binarySearch(this.indexList, k10, null);
    }

    public double getMaxXDifference() {
        return this.maxXDifference;
    }

    public K getXByIndex(int i10) {
        return this.indexList.get(i10);
    }

    public V getYByIndex(int i10) {
        return get(this.indexList.get(i10));
    }

    public V put(int i10, K k10, V v10) {
        this.indexList.add(i10, k10);
        updateMaxXDifference();
        return (V) super.put(k10, v10);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        this.indexList.add(k10);
        updateMaxXDifference();
        return (V) super.put(k10, v10);
    }

    public XYEntry<K, V> removeByIndex(int i10) {
        K remove = this.indexList.remove(i10);
        return new XYEntry<>(remove, remove(remove));
    }
}
