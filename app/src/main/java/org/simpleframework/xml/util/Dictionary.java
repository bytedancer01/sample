package org.simpleframework.xml.util;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import org.simpleframework.xml.util.Entry;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/Dictionary.class */
public class Dictionary<T extends Entry> extends AbstractSet<T> {
    public final Table<T> map = new Table<>();

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/Dictionary$Table.class */
    public static class Table<T> extends HashMap<String, T> {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        return this.map.put(t10.getName(), t10) != null;
    }

    public T get(String str) {
        return this.map.get(str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return this.map.values().iterator();
    }

    public T remove(String str) {
        return this.map.remove(str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }
}
