package org.apache.http.impl.client;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/RedirectLocations.class */
public class RedirectLocations extends AbstractList<Object> {
    private final Set<URI> unique = new HashSet();
    private final List<URI> all = new ArrayList();

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        URI uri = (URI) obj;
        this.all.add(i10, uri);
        this.unique.add(uri);
    }

    public void add(URI uri) {
        this.unique.add(uri);
        this.all.add(uri);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.unique.contains(obj);
    }

    public boolean contains(URI uri) {
        return this.unique.contains(uri);
    }

    @Override // java.util.AbstractList, java.util.List
    public URI get(int i10) {
        return this.all.get(i10);
    }

    public List<URI> getAll() {
        return new ArrayList(this.all);
    }

    @Override // java.util.AbstractList, java.util.List
    public URI remove(int i10) {
        URI remove = this.all.remove(i10);
        this.unique.remove(remove);
        if (this.all.size() != this.unique.size()) {
            this.unique.addAll(this.all);
        }
        return remove;
    }

    public boolean remove(URI uri) {
        boolean remove = this.unique.remove(uri);
        if (remove) {
            Iterator<URI> it = this.all.iterator();
            while (it.hasNext()) {
                if (it.next().equals(uri)) {
                    it.remove();
                }
            }
        }
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        URI uri = (URI) obj;
        URI uri2 = this.all.set(i10, uri);
        this.unique.remove(uri2);
        this.unique.add(uri);
        if (this.all.size() != this.unique.size()) {
            this.unique.addAll(this.all);
        }
        return uri2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.all.size();
    }
}
