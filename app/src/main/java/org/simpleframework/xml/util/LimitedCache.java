package org.simpleframework.xml.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/LimitedCache.class */
public class LimitedCache<T> extends LinkedHashMap<Object, T> implements Cache<T> {
    private final int capacity;

    public LimitedCache() {
        this(50000);
    }

    public LimitedCache(int i10) {
        this.capacity = i10;
    }

    @Override // org.simpleframework.xml.util.Cache
    public void cache(Object obj, T t10) {
        put(obj, t10);
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public T fetch(Object obj) {
        return get(obj);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<Object, T> entry) {
        return size() > this.capacity;
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(Object obj) {
        return remove(obj);
    }
}
