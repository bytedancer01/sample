package p305ra;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/m6.class
 */
/* renamed from: ra.m6 */
/* loaded from: combined.jar:classes2.jar:ra/m6.class */
public final class C8246m6 extends AbstractC8364u4<Integer> implements RandomAccess, InterfaceC8306q6, InterfaceC8427y7 {

    /* renamed from: e */
    public static final C8246m6 f39181e;

    /* renamed from: c */
    public int[] f39182c;

    /* renamed from: d */
    public int f39183d;

    static {
        C8246m6 c8246m6 = new C8246m6(new int[0], 0);
        f39181e = c8246m6;
        c8246m6.mo35827k();
    }

    public C8246m6() {
        this(new int[10], 0);
    }

    public C8246m6(int[] iArr, int i10) {
        this.f39182c = iArr;
        this.f39183d = i10;
    }

    /* renamed from: f */
    public static C8246m6 m35605f() {
        return f39181e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        m35864d();
        if (i10 < 0 || i10 > (i11 = this.f39183d)) {
            throw new IndexOutOfBoundsException(m35609i(i10));
        }
        int[] iArr = this.f39182c;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f39182c, i10, iArr2, i10 + 1, this.f39183d - i10);
            this.f39182c = iArr2;
        }
        this.f39182c[i10] = intValue;
        this.f39183d++;
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m35610z(((Integer) obj).intValue());
        return true;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m35864d();
        C8366u6.m35902a(collection);
        if (!(collection instanceof C8246m6)) {
            return super.addAll(collection);
        }
        C8246m6 c8246m6 = (C8246m6) collection;
        int i10 = c8246m6.f39183d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39183d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f39182c;
        if (i12 > iArr.length) {
            this.f39182c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c8246m6.f39182c, 0, this.f39182c, this.f39183d, c8246m6.f39183d);
        this.f39183d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8306q6 mo35006n(int i10) {
        if (i10 >= this.f39183d) {
            return new C8246m6(Arrays.copyOf(this.f39182c, i10), this.f39183d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8246m6)) {
            return super.equals(obj);
        }
        C8246m6 c8246m6 = (C8246m6) obj;
        if (this.f39183d != c8246m6.f39183d) {
            return false;
        }
        int[] iArr = c8246m6.f39182c;
        for (int i10 = 0; i10 < this.f39183d; i10++) {
            if (this.f39182c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final int m35607g(int i10) {
        m35608h(i10);
        return this.f39182c[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        m35608h(i10);
        return Integer.valueOf(this.f39182c[i10]);
    }

    /* renamed from: h */
    public final void m35608h(int i10) {
        if (i10 < 0 || i10 >= this.f39183d) {
            throw new IndexOutOfBoundsException(m35609i(i10));
        }
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f39183d; i11++) {
            i10 = (i10 * 31) + this.f39182c[i11];
        }
        return i10;
    }

    /* renamed from: i */
    public final String m35609i(int i10) {
        int i11 = this.f39183d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f39183d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f39182c[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m35864d();
        m35608h(i10);
        int[] iArr = this.f39182c;
        int i11 = iArr[i10];
        int i12 = this.f39183d;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f39183d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m35864d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f39182c;
        System.arraycopy(iArr, i11, iArr, i10, this.f39183d - i11);
        this.f39183d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m35864d();
        m35608h(i10);
        int[] iArr = this.f39182c;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39183d;
    }

    /* renamed from: z */
    public final void m35610z(int i10) {
        m35864d();
        int i11 = this.f39183d;
        int[] iArr = this.f39182c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f39182c = iArr2;
        }
        int[] iArr3 = this.f39182c;
        int i12 = this.f39183d;
        this.f39183d = i12 + 1;
        iArr3[i12] = i10;
    }
}
