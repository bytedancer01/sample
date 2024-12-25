package p305ra;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l8.class
 */
/* renamed from: ra.l8 */
/* loaded from: combined.jar:classes2.jar:ra/l8.class */
public final class C8233l8 extends AbstractSet<Map.Entry> {

    /* renamed from: b */
    public final C8248m8 f39169b;

    public /* synthetic */ C8233l8(C8248m8 c8248m8, C8143f8 c8143f8) {
        this.f39169b = c8248m8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f39169b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39169b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f39169b.get(entry.getKey());
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
    public final Iterator<Map.Entry> iterator() {
        return new C8218k8(this.f39169b, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f39169b.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39169b.size();
    }
}
