package kh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9364c;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/t.class
 */
/* renamed from: kh.t */
/* loaded from: combined.jar:classes2.jar:kh/t.class */
public final class C5626t implements List, Serializable, RandomAccess, InterfaceC9591a {

    /* renamed from: b */
    @NotNull
    public static final C5626t f31701b = new C5626t();

    /* renamed from: a */
    public boolean m27733a(@NotNull Void r42) {
        C9367f.m39526e(r42, "element");
        return false;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m27733a((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection collection) {
        C9367f.m39526e(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: d */
    public int m27735d() {
        return 0;
    }

    /* renamed from: e */
    public int m27736e(@NotNull Void r42) {
        C9367f.m39526e(r42, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* renamed from: f */
    public int m27737f(@NotNull Void r42) {
        C9367f.m39526e(r42, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return m27736e((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator iterator() {
        return C5625s.f31700b;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return m27737f((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator listIterator() {
        return C5625s.f31700b;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return C5625s.f31700b;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m27735d();
    }

    @Override // java.util.List
    @NotNull
    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C9364c.m39520a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C9367f.m39526e(tArr, "array");
        return (T[]) C9364c.m39521b(this, tArr);
    }

    @NotNull
    public String toString() {
        return "[]";
    }
}
