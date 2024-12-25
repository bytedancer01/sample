package p305ra;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/v5.class
 */
/* renamed from: ra.v5 */
/* loaded from: combined.jar:classes2.jar:ra/v5.class */
public final class C8380v5 extends AbstractC8364u4<Double> implements RandomAccess, InterfaceC8427y7 {

    /* renamed from: e */
    public static final C8380v5 f39341e;

    /* renamed from: c */
    public double[] f39342c;

    /* renamed from: d */
    public int f39343d;

    static {
        C8380v5 c8380v5 = new C8380v5(new double[0], 0);
        f39341e = c8380v5;
        c8380v5.mo35827k();
    }

    public C8380v5() {
        this(new double[10], 0);
    }

    public C8380v5(double[] dArr, int i10) {
        this.f39342c = dArr;
        this.f39343d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        m35864d();
        if (i10 < 0 || i10 > (i11 = this.f39343d)) {
            throw new IndexOutOfBoundsException(m35966h(i10));
        }
        double[] dArr = this.f39342c;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f39342c, i10, dArr2, i10 + 1, this.f39343d - i10);
            this.f39342c = dArr2;
        }
        this.f39342c[i10] = doubleValue;
        this.f39343d++;
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m35964e(((Double) obj).doubleValue());
        return true;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m35864d();
        C8366u6.m35902a(collection);
        if (!(collection instanceof C8380v5)) {
            return super.addAll(collection);
        }
        C8380v5 c8380v5 = (C8380v5) collection;
        int i10 = c8380v5.f39343d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39343d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f39342c;
        if (i12 > dArr.length) {
            this.f39342c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c8380v5.f39342c, 0, this.f39342c, this.f39343d, c8380v5.f39343d);
        this.f39343d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m35964e(double d10) {
        m35864d();
        int i10 = this.f39343d;
        double[] dArr = this.f39342c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f39342c = dArr2;
        }
        double[] dArr3 = this.f39342c;
        int i11 = this.f39343d;
        this.f39343d = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8380v5)) {
            return super.equals(obj);
        }
        C8380v5 c8380v5 = (C8380v5) obj;
        if (this.f39343d != c8380v5.f39343d) {
            return false;
        }
        double[] dArr = c8380v5.f39342c;
        for (int i10 = 0; i10 < this.f39343d; i10++) {
            if (Double.doubleToLongBits(this.f39342c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m35965g(int i10) {
        if (i10 < 0 || i10 >= this.f39343d) {
            throw new IndexOutOfBoundsException(m35966h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        m35965g(i10);
        return Double.valueOf(this.f39342c[i10]);
    }

    /* renamed from: h */
    public final String m35966h(int i10) {
        int i11 = this.f39343d;
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
        for (int i11 = 0; i11 < this.f39343d; i11++) {
            i10 = (i10 * 31) + C8366u6.m35906e(Double.doubleToLongBits(this.f39342c[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f39343d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f39342c[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ InterfaceC8351t6 mo35006n(int i10) {
        if (i10 >= this.f39343d) {
            return new C8380v5(Arrays.copyOf(this.f39342c, i10), this.f39343d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m35864d();
        m35965g(i10);
        double[] dArr = this.f39342c;
        double d10 = dArr[i10];
        int i11 = this.f39343d;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f39343d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m35864d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f39342c;
        System.arraycopy(dArr, i11, dArr, i10, this.f39343d - i11);
        this.f39343d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m35864d();
        m35965g(i10);
        double[] dArr = this.f39342c;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39343d;
    }
}
