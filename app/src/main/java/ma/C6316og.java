package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/og.class
 */
/* renamed from: ma.og */
/* loaded from: combined.jar:classes2.jar:ma/og.class */
public final class C6316og extends AbstractC6147gf implements RandomAccess, InterfaceC6400sg, InterfaceC6045bi {

    /* renamed from: e */
    public static final C6316og f33937e = new C6316og(new int[0], 0, false);

    /* renamed from: c */
    public int[] f33938c;

    /* renamed from: d */
    public int f33939d;

    public C6316og() {
        this(new int[10], 0, true);
    }

    public C6316og(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f33938c = iArr;
        this.f33939d = i10;
    }

    /* renamed from: f */
    public static C6316og m29931f() {
        return f33937e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        m29639d();
        if (i10 < 0 || i10 > (i11 = this.f33939d)) {
            throw new IndexOutOfBoundsException(m29934g(i10));
        }
        int[] iArr = this.f33938c;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f33938c, i10, iArr2, i10 + 1, this.f33939d - i10);
            this.f33938c = iArr2;
        }
        this.f33938c[i10] = intValue;
        this.f33939d++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo29936z(((Integer) obj).intValue());
        return true;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m29639d();
        Charset charset = C6482wg.f34130a;
        collection.getClass();
        if (!(collection instanceof C6316og)) {
            return super.addAll(collection);
        }
        C6316og c6316og = (C6316og) collection;
        int i10 = c6316og.f33939d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f33939d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f33938c;
        if (i12 > iArr.length) {
            this.f33938c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c6316og.f33938c, 0, this.f33938c, this.f33939d, c6316og.f33939d);
        this.f33939d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ma.InterfaceC6462vg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC6400sg mo29429m(int i10) {
        if (i10 >= this.f33939d) {
            return new C6316og(Arrays.copyOf(this.f33938c, i10), this.f33939d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int m29933e(int i10) {
        m29935h(i10);
        return this.f33938c[i10];
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6316og)) {
            return super.equals(obj);
        }
        C6316og c6316og = (C6316og) obj;
        if (this.f33939d != c6316og.f33939d) {
            return false;
        }
        int[] iArr = c6316og.f33938c;
        for (int i10 = 0; i10 < this.f33939d; i10++) {
            if (this.f33938c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final String m29934g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33939d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m29935h(i10);
        return Integer.valueOf(this.f33938c[i10]);
    }

    /* renamed from: h */
    public final void m29935h(int i10) {
        if (i10 < 0 || i10 >= this.f33939d) {
            throw new IndexOutOfBoundsException(m29934g(i10));
        }
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f33939d; i11++) {
            i10 = (i10 * 31) + this.f33938c[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f33939d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f33938c[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m29639d();
        m29935h(i10);
        int[] iArr = this.f33938c;
        int i11 = iArr[i10];
        int i12 = this.f33939d;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f33939d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m29639d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f33938c;
        System.arraycopy(iArr, i11, iArr, i10, this.f33939d - i11);
        this.f33939d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m29639d();
        m29935h(i10);
        int[] iArr = this.f33938c;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33939d;
    }

    @Override // ma.InterfaceC6400sg
    /* renamed from: z */
    public final void mo29936z(int i10) {
        m29639d();
        int i11 = this.f33939d;
        int[] iArr = this.f33938c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f33938c = iArr2;
        }
        int[] iArr3 = this.f33938c;
        int i12 = this.f33939d;
        this.f33939d = i12 + 1;
        iArr3[i12] = i10;
    }
}
