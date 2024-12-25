package ma;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/gf.class
 */
/* renamed from: ma.gf */
/* loaded from: combined.jar:classes2.jar:ma/gf.class */
public abstract class AbstractC6147gf extends AbstractList implements InterfaceC6462vg {

    /* renamed from: b */
    public boolean f33790b;

    public AbstractC6147gf(boolean z10) {
        this.f33790b = z10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m29639d();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        m29639d();
        return super.addAll(i10, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m29639d();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m29639d();
        super.clear();
    }

    /* renamed from: d */
    public final void m29639d() {
        if (!this.f33790b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // ma.InterfaceC6462vg
    /* renamed from: k */
    public final void mo29640k() {
        if (this.f33790b) {
            this.f33790b = false;
        }
    }

    @Override // ma.InterfaceC6462vg
    /* renamed from: l */
    public final boolean mo29641l() {
        return this.f33790b;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m29639d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m29639d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m29639d();
        return super.retainAll(collection);
    }
}
