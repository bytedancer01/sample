package p305ra;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/u4.class
 */
/* renamed from: ra.u4 */
/* loaded from: combined.jar:classes2.jar:ra/u4.class */
public abstract class AbstractC8364u4<E> extends AbstractList<E> implements InterfaceC8351t6<E> {

    /* renamed from: b */
    public boolean f39296b = true;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m35864d();
        return super.add(e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        m35864d();
        return super.addAll(i10, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        m35864d();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m35864d();
        super.clear();
    }

    /* renamed from: d */
    public final void m35864d() {
        if (!this.f39296b) {
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

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: k */
    public final void mo35827k() {
        this.f39296b = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m35864d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        m35864d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        m35864d();
        return super.retainAll(collection);
    }

    @Override // p305ra.InterfaceC8351t6
    public final boolean zza() {
        return this.f39296b;
    }
}
