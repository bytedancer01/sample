package org.simpleframework.xml.util;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/ConcurrentCache.class */
public class ConcurrentCache<T> extends ConcurrentHashMap<Object, T> implements Cache<T> {
    @Override // org.simpleframework.xml.util.Cache
    public void cache(Object obj, T t10) {
        put(obj, t10);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, org.simpleframework.xml.util.Cache
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public T fetch(Object obj) {
        return get(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(Object obj) {
        return remove(obj);
    }
}
