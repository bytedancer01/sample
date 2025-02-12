package org.simpleframework.xml.util;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/Cache.class */
public interface Cache<T> {
    void cache(Object obj, T t10);

    boolean contains(Object obj);

    T fetch(Object obj);

    boolean isEmpty();

    T take(Object obj);
}
