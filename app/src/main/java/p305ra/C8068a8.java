package p305ra;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/a8.class
 */
/* renamed from: ra.a8 */
/* loaded from: combined.jar:classes2.jar:ra/a8.class */
public final class C8068a8<E> extends AbstractC8364u4<E> implements RandomAccess {

    /* renamed from: e */
    public static final C8068a8<Object> f38929e;

    /* renamed from: c */
    public E[] f38930c;

    /* renamed from: d */
    public int f38931d;

    static {
        C8068a8<Object> c8068a8 = new C8068a8<>(new Object[0], 0);
        f38929e = c8068a8;
        c8068a8.mo35827k();
    }

    public C8068a8(E[] eArr, int i10) {
        this.f38930c = eArr;
        this.f38931d = i10;
    }

    /* renamed from: f */
    public static <E> C8068a8<E> m35003f() {
        return (C8068a8<E>) f38929e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        m35864d();
        if (i10 < 0 || i10 > (i11 = this.f38931d)) {
            throw new IndexOutOfBoundsException(m35005h(i10));
        }
        E[] eArr = this.f38930c;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f38930c, i10, eArr2, i10 + 1, this.f38931d - i10);
            this.f38930c = eArr2;
        }
        this.f38930c[i10] = e10;
        this.f38931d++;
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        m35864d();
        int i10 = this.f38931d;
        E[] eArr = this.f38930c;
        if (i10 == eArr.length) {
            this.f38930c = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f38930c;
        int i11 = this.f38931d;
        this.f38931d = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: g */
    public final void m35004g(int i10) {
        if (i10 < 0 || i10 >= this.f38931d) {
            throw new IndexOutOfBoundsException(m35005h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        m35004g(i10);
        return this.f38930c[i10];
    }

    /* renamed from: h */
    public final String m35005h(int i10) {
        int i11 = this.f38931d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ InterfaceC8351t6 mo35006n(int i10) {
        if (i10 >= this.f38931d) {
            return new C8068a8(Arrays.copyOf(this.f38930c, i10), this.f38931d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        m35864d();
        m35004g(i10);
        E[] eArr = this.f38930c;
        E e10 = eArr[i10];
        int i11 = this.f38931d;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f38931d--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        m35864d();
        m35004g(i10);
        E[] eArr = this.f38930c;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38931d;
    }
}
