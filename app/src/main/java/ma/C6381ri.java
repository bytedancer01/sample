package ma;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ri.class
 */
/* renamed from: ma.ri */
/* loaded from: combined.jar:classes2.jar:ma/ri.class */
public final class C6381ri extends AbstractSet {

    /* renamed from: b */
    public final C6423ti f34001b;

    public /* synthetic */ C6381ri(C6423ti c6423ti, C6360qi c6360qi) {
        this.f34001b = c6423ti;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f34001b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f34001b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f34001b.get(entry.getKey());
        Object value = entry.getValue();
        boolean z10 = false;
        if (obj2 != value) {
            if (obj2 != null) {
                if (!obj2.equals(value)) {
                    return false;
                }
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6339pi(this.f34001b, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f34001b.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34001b.size();
    }
}
