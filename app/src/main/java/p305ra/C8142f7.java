package p305ra;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f7.class
 */
/* renamed from: ra.f7 */
/* loaded from: combined.jar:classes2.jar:ra/f7.class */
public final class C8142f7 extends AbstractC8364u4<Long> implements RandomAccess, InterfaceC8321r6, InterfaceC8427y7 {

    /* renamed from: e */
    public static final C8142f7 f39077e;

    /* renamed from: c */
    public long[] f39078c;

    /* renamed from: d */
    public int f39079d;

    static {
        C8142f7 c8142f7 = new C8142f7(new long[0], 0);
        f39077e = c8142f7;
        c8142f7.mo35827k();
    }

    public C8142f7() {
        this(new long[10], 0);
    }

    public C8142f7(long[] jArr, int i10) {
        this.f39078c = jArr;
        this.f39079d = i10;
    }

    /* renamed from: f */
    public static C8142f7 m35363f() {
        return f39077e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        m35864d();
        if (i10 < 0 || i10 > (i11 = this.f39079d)) {
            throw new IndexOutOfBoundsException(m35365h(i10));
        }
        long[] jArr = this.f39078c;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f39078c, i10, jArr2, i10 + 1, this.f39079d - i10);
            this.f39078c = jArr2;
        }
        this.f39078c[i10] = longValue;
        this.f39079d++;
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m35364g(((Long) obj).longValue());
        return true;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m35864d();
        C8366u6.m35902a(collection);
        if (!(collection instanceof C8142f7)) {
            return super.addAll(collection);
        }
        C8142f7 c8142f7 = (C8142f7) collection;
        int i10 = c8142f7.f39079d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39079d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f39078c;
        if (i12 > jArr.length) {
            this.f39078c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c8142f7.f39078c, 0, this.f39078c, this.f39079d, c8142f7.f39079d);
        this.f39079d = i12;
        ((AbstractList) this).modCount++;
        return true;
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
        if (!(obj instanceof C8142f7)) {
            return super.equals(obj);
        }
        C8142f7 c8142f7 = (C8142f7) obj;
        if (this.f39079d != c8142f7.f39079d) {
            return false;
        }
        long[] jArr = c8142f7.f39078c;
        for (int i10 = 0; i10 < this.f39079d; i10++) {
            if (this.f39078c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m35364g(long j10) {
        m35864d();
        int i10 = this.f39079d;
        long[] jArr = this.f39078c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f39078c = jArr2;
        }
        long[] jArr3 = this.f39078c;
        int i11 = this.f39079d;
        this.f39079d = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        m35368z(i10);
        return Long.valueOf(this.f39078c[i10]);
    }

    /* renamed from: h */
    public final String m35365h(int i10) {
        int i11 = this.f39079d;
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
        for (int i11 = 0; i11 < this.f39079d; i11++) {
            i10 = (i10 * 31) + C8366u6.m35906e(this.f39078c[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f39079d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f39078c[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m35864d();
        m35368z(i10);
        long[] jArr = this.f39078c;
        long j10 = jArr[i10];
        int i11 = this.f39079d;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f39079d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m35864d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f39078c;
        System.arraycopy(jArr, i11, jArr, i10, this.f39079d - i11);
        this.f39079d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8321r6 mo35006n(int i10) {
        if (i10 >= this.f39079d) {
            return new C8142f7(Arrays.copyOf(this.f39078c, i10), this.f39079d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        m35864d();
        m35368z(i10);
        long[] jArr = this.f39078c;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39079d;
    }

    @Override // p305ra.InterfaceC8321r6
    /* renamed from: u */
    public final long mo35367u(int i10) {
        m35368z(i10);
        return this.f39078c[i10];
    }

    /* renamed from: z */
    public final void m35368z(int i10) {
        if (i10 < 0 || i10 >= this.f39079d) {
            throw new IndexOutOfBoundsException(m35365h(i10));
        }
    }
}
