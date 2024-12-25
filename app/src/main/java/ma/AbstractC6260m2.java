package ma;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/m2.class
 */
/* renamed from: ma.m2 */
/* loaded from: combined.jar:classes2.jar:ma/m2.class */
public abstract class AbstractC6260m2 extends AbstractCollection implements Serializable {

    /* renamed from: b */
    public static final Object[] f33885b = new Object[0];

    /* renamed from: a */
    public int mo29380a(Object[] objArr, int i10) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    int mo29541d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    int mo29542f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public abstract AbstractC6344q2 mo29381g();

    /* renamed from: i */
    public Object[] mo29543i() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f33885b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] mo29543i = mo29543i();
            if (mo29543i != null) {
                return Arrays.copyOfRange(mo29543i, mo29542f(), mo29541d(), objArr.getClass());
            }
            Object[] objArr3 = objArr;
            if (length != 0) {
                objArr3 = Arrays.copyOf(objArr, 0);
            }
            objArr2 = Arrays.copyOf(objArr3, size);
        } else {
            objArr2 = objArr;
            if (length > size) {
                objArr[size] = null;
                objArr2 = objArr;
            }
        }
        mo29380a(objArr2, 0);
        return objArr2;
    }
}
