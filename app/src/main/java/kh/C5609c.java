package kh;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p372vh.C9363b;
import p372vh.C9364c;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/c.class
 */
/* renamed from: kh.c */
/* loaded from: combined.jar:classes2.jar:kh/c.class */
public final class C5609c<T> implements Collection<T>, InterfaceC9591a {

    /* renamed from: b */
    @NotNull
    public final T[] f31697b;

    /* renamed from: c */
    public final boolean f31698c;

    public C5609c(@NotNull T[] tArr, boolean z10) {
        C9367f.m39526e(tArr, "values");
        this.f31697b = tArr;
        this.f31698c = z10;
    }

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C5613g.m27684j(this.f31697b, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        boolean z10;
        C9367f.m39526e(collection, "elements");
        if (collection.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = collection.iterator();
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                if (!contains(it.next())) {
                    z10 = false;
                    break;
                }
            }
        }
        return z10;
    }

    /* renamed from: d */
    public int m27674d() {
        return this.f31697b.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f31697b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return C9363b.m39519a(this.f31697b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m27674d();
    }

    @Override // java.util.Collection
    @NotNull
    public final Object[] toArray() {
        return C5615i.m27695a(this.f31697b, this.f31698c);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C9367f.m39526e(tArr, "array");
        return (T[]) C9364c.m39521b(this, tArr);
    }
}
