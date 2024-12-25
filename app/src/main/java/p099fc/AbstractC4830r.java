package p099fc;

import ec.C4708k;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/r.class
 */
/* renamed from: fc.r */
/* loaded from: combined.jar:classes2.jar:fc/r.class */
public abstract class AbstractC4830r<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    public static final Object[] f28405b = new Object[0];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/r$a.class
     */
    /* renamed from: fc.r$a */
    /* loaded from: combined.jar:classes2.jar:fc/r$a.class */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a */
        public Object[] f28406a;

        /* renamed from: b */
        public int f28407b;

        /* renamed from: c */
        public boolean f28408c;

        public a(int i10) {
            C4814j.m24399b(i10, "initialCapacity");
            this.f28406a = new Object[i10];
            this.f28407b = 0;
        }

        /* renamed from: b */
        public a<E> m24526b(E e10) {
            C4708k.m23668j(e10);
            m24527c(this.f28407b + 1);
            Object[] objArr = this.f28406a;
            int i10 = this.f28407b;
            this.f28407b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        /* renamed from: c */
        public final void m24527c(int i10) {
            Object[] objArr = this.f28406a;
            if (objArr.length < i10) {
                this.f28406a = Arrays.copyOf(objArr, b.m24528a(objArr.length, i10));
            } else if (!this.f28408c) {
                return;
            } else {
                this.f28406a = (Object[]) objArr.clone();
            }
            this.f28408c = false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/r$b.class
     */
    /* renamed from: fc.r$b */
    /* loaded from: combined.jar:classes2.jar:fc/r$b.class */
    public static abstract class b<E> {
        /* renamed from: a */
        public static int m24528a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = i10 + (i10 >> 1) + 1;
            int i13 = i12;
            if (i12 < i11) {
                i13 = Integer.highestOneBit(i11 - 1) << 1;
            }
            int i14 = i13;
            if (i13 < 0) {
                i14 = Integer.MAX_VALUE;
            }
            return i14;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: d */
    public AbstractC4834t<E> mo24480d() {
        return isEmpty() ? AbstractC4834t.m24539E() : AbstractC4834t.m24546v(toArray());
    }

    /* renamed from: e */
    public int mo24451e(Object[] objArr, int i10) {
        AbstractC4841w0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* renamed from: f */
    public Object[] mo24452f() {
        return null;
    }

    /* renamed from: g */
    public int mo24453g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public int mo24454i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public abstract boolean mo24455q();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t */
    public abstract AbstractC4841w0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f28405b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object[]] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        C4708k.m23668j(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo24452f = mo24452f();
            if (mo24452f != null) {
                return (T[]) C4819l0.m24447a(mo24452f, mo24454i(), mo24453g(), tArr);
            }
            tArr2 = C4815j0.m24404d(tArr, size);
        } else {
            tArr2 = tArr;
            if (tArr.length > size) {
                tArr[size] = null;
                tArr2 = tArr;
            }
        }
        mo24451e(tArr2, 0);
        return tArr2;
    }
}
