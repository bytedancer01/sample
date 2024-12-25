package p305ra;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y4.class
 */
/* renamed from: ra.y4 */
/* loaded from: combined.jar:classes2.jar:ra/y4.class */
public final class C8424y4 extends AbstractC8364u4<Boolean> implements RandomAccess, InterfaceC8427y7 {

    /* renamed from: e */
    public static final C8424y4 f39408e;

    /* renamed from: c */
    public boolean[] f39409c;

    /* renamed from: d */
    public int f39410d;

    static {
        C8424y4 c8424y4 = new C8424y4(new boolean[0], 0);
        f39408e = c8424y4;
        c8424y4.mo35827k();
    }

    public C8424y4() {
        this(new boolean[10], 0);
    }

    public C8424y4(boolean[] zArr, int i10) {
        this.f39409c = zArr;
        this.f39410d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m35864d();
        if (i10 < 0 || i10 > (i11 = this.f39410d)) {
            throw new IndexOutOfBoundsException(m36225h(i10));
        }
        boolean[] zArr = this.f39409c;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f39409c, i10, zArr2, i10 + 1, this.f39410d - i10);
            this.f39409c = zArr2;
        }
        this.f39409c[i10] = booleanValue;
        this.f39410d++;
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m36223e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m35864d();
        C8366u6.m35902a(collection);
        if (!(collection instanceof C8424y4)) {
            return super.addAll(collection);
        }
        C8424y4 c8424y4 = (C8424y4) collection;
        int i10 = c8424y4.f39410d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39410d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f39409c;
        if (i12 > zArr.length) {
            this.f39409c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c8424y4.f39409c, 0, this.f39409c, this.f39410d, c8424y4.f39410d);
        this.f39410d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m36223e(boolean z10) {
        m35864d();
        int i10 = this.f39410d;
        boolean[] zArr = this.f39409c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f39409c = zArr2;
        }
        boolean[] zArr3 = this.f39409c;
        int i11 = this.f39410d;
        this.f39410d = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8424y4)) {
            return super.equals(obj);
        }
        C8424y4 c8424y4 = (C8424y4) obj;
        if (this.f39410d != c8424y4.f39410d) {
            return false;
        }
        boolean[] zArr = c8424y4.f39409c;
        for (int i10 = 0; i10 < this.f39410d; i10++) {
            if (this.f39409c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m36224g(int i10) {
        if (i10 < 0 || i10 >= this.f39410d) {
            throw new IndexOutOfBoundsException(m36225h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        m36224g(i10);
        return Boolean.valueOf(this.f39409c[i10]);
    }

    /* renamed from: h */
    public final String m36225h(int i10) {
        int i11 = this.f39410d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f39410d; i11++) {
            i10 = (i10 * 31) + C8366u6.m35907f(this.f39409c[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f39410d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f39409c[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ InterfaceC8351t6 mo35006n(int i10) {
        if (i10 >= this.f39410d) {
            return new C8424y4(Arrays.copyOf(this.f39409c, i10), this.f39410d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m35864d();
        m36224g(i10);
        boolean[] zArr = this.f39409c;
        boolean z10 = zArr[i10];
        int i11 = this.f39410d;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f39410d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m35864d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f39409c;
        System.arraycopy(zArr, i11, zArr, i10, this.f39410d - i11);
        this.f39410d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m35864d();
        m36224g(i10);
        boolean[] zArr = this.f39409c;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39410d;
    }
}
