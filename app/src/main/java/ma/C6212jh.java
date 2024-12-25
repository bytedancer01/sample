package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/jh.class
 */
/* renamed from: ma.jh */
/* loaded from: combined.jar:classes2.jar:ma/jh.class */
public final class C6212jh extends AbstractC6147gf implements RandomAccess, InterfaceC6442ug, InterfaceC6045bi {

    /* renamed from: e */
    public static final C6212jh f33848e = new C6212jh(new long[0], 0, false);

    /* renamed from: c */
    public long[] f33849c;

    /* renamed from: d */
    public int f33850d;

    public C6212jh() {
        this(new long[10], 0, true);
    }

    public C6212jh(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f33849c = jArr;
        this.f33850d = i10;
    }

    /* renamed from: f */
    public static C6212jh m29784f() {
        return f33848e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        m29639d();
        if (i10 < 0 || i10 > (i11 = this.f33850d)) {
            throw new IndexOutOfBoundsException(m29786g(i10));
        }
        long[] jArr = this.f33849c;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f33849c, i10, jArr2, i10 + 1, this.f33850d - i10);
            this.f33849c = jArr2;
        }
        this.f33849c[i10] = longValue;
        this.f33850d++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        m29639d();
        int i10 = this.f33850d;
        long[] jArr = this.f33849c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f33849c = jArr2;
        }
        long[] jArr3 = this.f33849c;
        int i11 = this.f33850d;
        this.f33850d = i11 + 1;
        jArr3[i11] = longValue;
        return true;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m29639d();
        Charset charset = C6482wg.f34130a;
        collection.getClass();
        if (!(collection instanceof C6212jh)) {
            return super.addAll(collection);
        }
        C6212jh c6212jh = (C6212jh) collection;
        int i10 = c6212jh.f33850d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f33850d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f33849c;
        if (i12 > jArr.length) {
            this.f33849c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c6212jh.f33849c, 0, this.f33849c, this.f33850d, c6212jh.f33850d);
        this.f33850d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final long m29785e(int i10) {
        m29787z(i10);
        return this.f33849c[i10];
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6212jh)) {
            return super.equals(obj);
        }
        C6212jh c6212jh = (C6212jh) obj;
        if (this.f33850d != c6212jh.f33850d) {
            return false;
        }
        long[] jArr = c6212jh.f33849c;
        for (int i10 = 0; i10 < this.f33850d; i10++) {
            if (this.f33849c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final String m29786g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33850d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m29787z(i10);
        return Long.valueOf(this.f33849c[i10]);
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f33850d; i11++) {
            long j10 = this.f33849c[i11];
            Charset charset = C6482wg.f34130a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f33850d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f33849c[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ma.InterfaceC6462vg
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ InterfaceC6462vg mo29429m(int i10) {
        if (i10 >= this.f33850d) {
            return new C6212jh(Arrays.copyOf(this.f33849c, i10), this.f33850d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m29639d();
        m29787z(i10);
        long[] jArr = this.f33849c;
        long j10 = jArr[i10];
        int i11 = this.f33850d;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f33850d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m29639d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f33849c;
        System.arraycopy(jArr, i11, jArr, i10, this.f33850d - i11);
        this.f33850d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        m29639d();
        m29787z(i10);
        long[] jArr = this.f33849c;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33850d;
    }

    /* renamed from: z */
    public final void m29787z(int i10) {
        if (i10 < 0 || i10 >= this.f33850d) {
            throw new IndexOutOfBoundsException(m29786g(i10));
        }
    }
}
