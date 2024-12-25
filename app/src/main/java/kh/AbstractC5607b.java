package kh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/b.class
 */
/* renamed from: kh.b */
/* loaded from: combined.jar:classes2.jar:kh/b.class */
public abstract class AbstractC5607b<E> extends AbstractC5605a<E> implements List<E> {

    /* renamed from: b */
    @NotNull
    public static final a f31690b = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kh/b$a.class
     */
    /* renamed from: kh.b$a */
    /* loaded from: combined.jar:classes2.jar:kh/b$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: a */
        public final void m27665a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: b */
        public final void m27666b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: c */
        public final void m27667c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        /* renamed from: d */
        public final boolean m27668d(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            C9367f.m39526e(collection, "c");
            C9367f.m39526e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!C9367f.m39522a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int m27669e(@NotNull Collection<?> collection) {
            C9367f.m39526e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11;
                }
                Object next = it.next();
                i10 = (i11 * 31) + (next != null ? next.hashCode() : 0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kh/b$b.class
     */
    /* renamed from: kh.b$b */
    /* loaded from: combined.jar:classes2.jar:kh/b$b.class */
    public class b implements Iterator<E>, InterfaceC9591a {

        /* renamed from: b */
        public int f31691b;

        /* renamed from: c */
        public final AbstractC5607b<E> f31692c;

        public b(AbstractC5607b abstractC5607b) {
            this.f31692c = abstractC5607b;
        }

        /* renamed from: a */
        public final int m27670a() {
            return this.f31691b;
        }

        /* renamed from: b */
        public final void m27671b(int i10) {
            this.f31691b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31691b < this.f31692c.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC5607b<E> abstractC5607b = this.f31692c;
            int i10 = this.f31691b;
            this.f31691b = i10 + 1;
            return abstractC5607b.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kh/b$c.class
     */
    /* renamed from: kh.b$c */
    /* loaded from: combined.jar:classes2.jar:kh/b$c.class */
    public class c extends AbstractC5607b<E>.b implements ListIterator<E> {

        /* renamed from: d */
        public final AbstractC5607b<E> f31693d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC5607b abstractC5607b, int i10) {
            super(abstractC5607b);
            this.f31693d = abstractC5607b;
            AbstractC5607b.f31690b.m27666b(i10, abstractC5607b.size());
            m27671b(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m27670a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m27670a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC5607b<E> abstractC5607b = this.f31693d;
            m27671b(m27670a() - 1);
            return abstractC5607b.get(m27670a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m27670a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kh/b$d.class
     */
    /* renamed from: kh.b$d */
    /* loaded from: combined.jar:classes2.jar:kh/b$d.class */
    public static final class d<E> extends AbstractC5607b<E> implements RandomAccess {

        /* renamed from: c */
        @NotNull
        public final AbstractC5607b<E> f31694c;

        /* renamed from: d */
        public final int f31695d;

        /* renamed from: e */
        public int f31696e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull AbstractC5607b<? extends E> abstractC5607b, int i10, int i11) {
            C9367f.m39526e(abstractC5607b, "list");
            this.f31694c = abstractC5607b;
            this.f31695d = i10;
            AbstractC5607b.f31690b.m27667c(i10, i11, abstractC5607b.size());
            this.f31696e = i11 - i10;
        }

        @Override // kh.AbstractC5605a
        /* renamed from: d */
        public int mo27662d() {
            return this.f31696e;
        }

        @Override // kh.AbstractC5607b, java.util.List
        public E get(int i10) {
            AbstractC5607b.f31690b.m27665a(i10, this.f31696e);
            return this.f31694c.get(this.f31695d + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f31690b.m27668d(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f31690b.m27669e(this);
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (C9367f.m39522a(it.next(), e10)) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        int i10;
        ListIterator<E> listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i10 = -1;
                break;
            }
            if (C9367f.m39522a(listIterator.previous(), e10)) {
                i10 = listIterator.nextIndex();
                break;
            }
        }
        return i10;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new c(this, 0);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        return new c(this, i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
