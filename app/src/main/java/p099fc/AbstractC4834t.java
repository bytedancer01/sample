package p099fc;

import ec.C4708k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099fc.AbstractC4830r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/t.class
 */
/* renamed from: fc.t */
/* loaded from: combined.jar:classes2.jar:fc/t.class */
public abstract class AbstractC4834t<E> extends AbstractC4830r<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final AbstractC4843x0<Object> f28415c = new b(C4821m0.f28342f, 0);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/t$a.class
     */
    /* renamed from: fc.t$a */
    /* loaded from: combined.jar:classes2.jar:fc/t$a.class */
    public static final class a<E> extends AbstractC4830r.a<E> {
        public a() {
            this(4);
        }

        public a(int i10) {
            super(i10);
        }

        /* renamed from: d */
        public a<E> m24554d(E e10) {
            super.m24526b(e10);
            return this;
        }

        /* renamed from: e */
        public AbstractC4834t<E> m24555e() {
            this.f28408c = true;
            return AbstractC4834t.m24547w(this.f28406a, this.f28407b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/t$b.class
     */
    /* renamed from: fc.t$b */
    /* loaded from: combined.jar:classes2.jar:fc/t$b.class */
    public static class b<E> extends AbstractC4796a<E> {

        /* renamed from: d */
        public final AbstractC4834t<E> f28416d;

        public b(AbstractC4834t<E> abstractC4834t, int i10) {
            super(abstractC4834t.size(), i10);
            this.f28416d = abstractC4834t;
        }

        @Override // p099fc.AbstractC4796a
        /* renamed from: a */
        public E mo24288a(int i10) {
            return this.f28416d.get(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/t$c.class
     */
    /* renamed from: fc.t$c */
    /* loaded from: combined.jar:classes2.jar:fc/t$c.class */
    public class c extends AbstractC4834t<E> {

        /* renamed from: d */
        public final transient int f28417d;

        /* renamed from: e */
        public final transient int f28418e;

        /* renamed from: f */
        public final AbstractC4834t f28419f;

        public c(AbstractC4834t abstractC4834t, int i10, int i11) {
            this.f28419f = abstractC4834t;
            this.f28417d = i10;
            this.f28418e = i11;
        }

        @Override // p099fc.AbstractC4834t, java.util.List
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public AbstractC4834t<E> subList(int i10, int i11) {
            C4708k.m23672n(i10, i11, this.f28418e);
            AbstractC4834t abstractC4834t = this.f28419f;
            int i12 = this.f28417d;
            return abstractC4834t.subList(i10 + i12, i11 + i12);
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: f */
        public Object[] mo24452f() {
            return this.f28419f.mo24452f();
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: g */
        public int mo24453g() {
            return this.f28419f.mo24454i() + this.f28417d + this.f28418e;
        }

        @Override // java.util.List
        public E get(int i10) {
            C4708k.m23666h(i10, this.f28418e);
            return this.f28419f.get(i10 + this.f28417d);
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: i */
        public int mo24454i() {
            return this.f28419f.mo24454i() + this.f28417d;
        }

        @Override // p099fc.AbstractC4834t, p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p099fc.AbstractC4834t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // p099fc.AbstractC4834t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // p099fc.AbstractC4830r
        /* renamed from: q */
        public boolean mo24455q() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28418e;
        }
    }

    /* renamed from: A */
    public static <E> AbstractC4834t<E> m24538A(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC4830r)) {
            return m24549y(collection.toArray());
        }
        AbstractC4834t<E> mo24480d = ((AbstractC4830r) collection).mo24480d();
        AbstractC4834t<E> abstractC4834t = mo24480d;
        if (mo24480d.mo24455q()) {
            abstractC4834t = m24546v(mo24480d.toArray());
        }
        return abstractC4834t;
    }

    /* renamed from: E */
    public static <E> AbstractC4834t<E> m24539E() {
        return (AbstractC4834t<E>) C4821m0.f28342f;
    }

    /* renamed from: F */
    public static <E> AbstractC4834t<E> m24540F(E e10) {
        return m24549y(e10);
    }

    /* renamed from: G */
    public static <E> AbstractC4834t<E> m24541G(E e10, E e11) {
        return m24549y(e10, e11);
    }

    /* renamed from: H */
    public static <E> AbstractC4834t<E> m24542H(E e10, E e11, E e12) {
        return m24549y(e10, e11, e12);
    }

    /* renamed from: I */
    public static <E> AbstractC4834t<E> m24543I(E e10, E e11, E e12, E e13, E e14) {
        return m24549y(e10, e11, e12, e13, e14);
    }

    /* renamed from: J */
    public static <E> AbstractC4834t<E> m24544J(E e10, E e11, E e12, E e13, E e14, E e15) {
        return m24549y(e10, e11, e12, e13, e14, e15);
    }

    /* renamed from: K */
    public static <E> AbstractC4834t<E> m24545K(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C4708k.m23668j(comparator);
        Object[] m24606f = C4844y.m24606f(iterable);
        C4815j0.m24402b(m24606f);
        Arrays.sort(m24606f, comparator);
        return m24546v(m24606f);
    }

    /* renamed from: v */
    public static <E> AbstractC4834t<E> m24546v(Object[] objArr) {
        return m24547w(objArr, objArr.length);
    }

    /* renamed from: w */
    public static <E> AbstractC4834t<E> m24547w(Object[] objArr, int i10) {
        return i10 == 0 ? m24539E() : new C4821m0(objArr, i10);
    }

    /* renamed from: x */
    public static <E> a<E> m24548x() {
        return new a<>();
    }

    /* renamed from: y */
    public static <E> AbstractC4834t<E> m24549y(Object... objArr) {
        return m24546v(C4815j0.m24402b(objArr));
    }

    @Override // java.util.List
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public AbstractC4843x0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC4843x0<E> listIterator(int i10) {
        C4708k.m23670l(i10, size());
        return isEmpty() ? (AbstractC4843x0<E>) f28415c : new b(this, i10);
    }

    @Override // java.util.List
    /* renamed from: L */
    public AbstractC4834t<E> subList(int i10, int i11) {
        C4708k.m23672n(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? m24539E() : m24553M(i10, i11);
    }

    /* renamed from: M */
    public AbstractC4834t<E> m24553M(int i10, int i11) {
        return new c(this, i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: d */
    public final AbstractC4834t<E> mo24480d() {
        return this;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: e */
    public int mo24451e(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        return C4799b0.m24294c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (((i10 * 31) + get(i11).hashCode()) ^ (-1)) ^ (-1);
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        return obj == null ? -1 : C4799b0.m24295d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        return obj == null ? -1 : C4799b0.m24297f(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC4841w0<E> iterator() {
        return listIterator();
    }
}
