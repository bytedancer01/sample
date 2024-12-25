package kh;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p356uh.InterfaceC9196l;
import p372vh.AbstractC9368g;
import p372vh.C9364c;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/a.class
 */
/* renamed from: kh.a */
/* loaded from: combined.jar:classes2.jar:kh/a.class */
public abstract class AbstractC5605a<E> implements Collection<E>, InterfaceC9591a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kh/a$a.class
     */
    /* renamed from: kh.a$a */
    /* loaded from: combined.jar:classes2.jar:kh/a$a.class */
    public static final class a extends AbstractC9368g implements InterfaceC9196l<E, CharSequence> {

        /* renamed from: c */
        public final AbstractC5605a<E> f31689c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC5605a<? extends E> abstractC5605a) {
            super(1);
            this.f31689c = abstractC5605a;
        }

        @Override // p356uh.InterfaceC9196l
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo6711d(E e10) {
            return e10 == this.f31689c ? "(this Collection)" : String.valueOf(e10);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e10) {
        boolean z10;
        if (isEmpty()) {
            z10 = false;
        } else {
            Iterator<E> it = iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                if (C9367f.m39522a(it.next(), e10)) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public abstract int mo27662d();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
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
        return mo27662d();
    }

    @Override // java.util.Collection
    @NotNull
    public Object[] toArray() {
        return C9364c.m39520a(this);
    }

    @Override // java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "array");
        return (T[]) C9364c.m39521b(this, tArr);
    }

    @NotNull
    public String toString() {
        return C5624r.m27729y(this, ", ", "[", "]", 0, null, new a(this), 24, null);
    }
}
