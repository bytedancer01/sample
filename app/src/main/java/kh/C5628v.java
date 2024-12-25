package kh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9364c;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/v.class
 */
/* renamed from: kh.v */
/* loaded from: combined.jar:classes2.jar:kh/v.class */
public final class C5628v implements Set, Serializable, InterfaceC9591a {

    /* renamed from: b */
    @NotNull
    public static final C5628v f31703b = new C5628v();

    /* renamed from: a */
    public boolean m27745a(@NotNull Void r42) {
        C9367f.m39526e(r42, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m27745a((Void) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection collection) {
        C9367f.m39526e(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: d */
    public int m27746d() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator iterator() {
        return C5625s.f31700b;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m27746d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C9364c.m39520a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C9367f.m39526e(tArr, "array");
        return (T[]) C9364c.m39521b(this, tArr);
    }

    @NotNull
    public String toString() {
        return "[]";
    }
}
