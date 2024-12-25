package p305ra;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f6.class
 */
/* renamed from: ra.f6 */
/* loaded from: combined.jar:classes2.jar:ra/f6.class */
public final class C8141f6 extends AbstractC8364u4<Float> implements RandomAccess, InterfaceC8427y7 {

    /* renamed from: e */
    public static final C8141f6 f39074e;

    /* renamed from: c */
    public float[] f39075c;

    /* renamed from: d */
    public int f39076d;

    static {
        C8141f6 c8141f6 = new C8141f6(new float[0], 0);
        f39074e = c8141f6;
        c8141f6.mo35827k();
    }

    public C8141f6() {
        this(new float[10], 0);
    }

    public C8141f6(float[] fArr, int i10) {
        this.f39075c = fArr;
        this.f39076d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        m35864d();
        if (i10 < 0 || i10 > (i11 = this.f39076d)) {
            throw new IndexOutOfBoundsException(m35362h(i10));
        }
        float[] fArr = this.f39075c;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f39075c, i10, fArr2, i10 + 1, this.f39076d - i10);
            this.f39075c = fArr2;
        }
        this.f39075c[i10] = floatValue;
        this.f39076d++;
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m35360e(((Float) obj).floatValue());
        return true;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m35864d();
        C8366u6.m35902a(collection);
        if (!(collection instanceof C8141f6)) {
            return super.addAll(collection);
        }
        C8141f6 c8141f6 = (C8141f6) collection;
        int i10 = c8141f6.f39076d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39076d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f39075c;
        if (i12 > fArr.length) {
            this.f39075c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c8141f6.f39075c, 0, this.f39075c, this.f39076d, c8141f6.f39076d);
        this.f39076d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m35360e(float f10) {
        m35864d();
        int i10 = this.f39076d;
        float[] fArr = this.f39075c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f39075c = fArr2;
        }
        float[] fArr3 = this.f39075c;
        int i11 = this.f39076d;
        this.f39076d = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8141f6)) {
            return super.equals(obj);
        }
        C8141f6 c8141f6 = (C8141f6) obj;
        if (this.f39076d != c8141f6.f39076d) {
            return false;
        }
        float[] fArr = c8141f6.f39075c;
        for (int i10 = 0; i10 < this.f39076d; i10++) {
            if (Float.floatToIntBits(this.f39075c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m35361g(int i10) {
        if (i10 < 0 || i10 >= this.f39076d) {
            throw new IndexOutOfBoundsException(m35362h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        m35361g(i10);
        return Float.valueOf(this.f39075c[i10]);
    }

    /* renamed from: h */
    public final String m35362h(int i10) {
        int i11 = this.f39076d;
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
        for (int i11 = 0; i11 < this.f39076d; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f39075c[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f39076d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f39075c[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ InterfaceC8351t6 mo35006n(int i10) {
        if (i10 >= this.f39076d) {
            return new C8141f6(Arrays.copyOf(this.f39075c, i10), this.f39076d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m35864d();
        m35361g(i10);
        float[] fArr = this.f39075c;
        float f10 = fArr[i10];
        int i11 = this.f39076d;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f39076d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m35864d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f39075c;
        System.arraycopy(fArr, i11, fArr, i10, this.f39076d - i11);
        this.f39076d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m35864d();
        m35361g(i10);
        float[] fArr = this.f39075c;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39076d;
    }
}
