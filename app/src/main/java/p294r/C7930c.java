package p294r;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/c.class
 */
/* renamed from: r.c */
/* loaded from: combined.jar:classes1.jar:r/c.class */
public final class C7930c<E> {

    /* renamed from: a */
    public E[] f38152a;

    /* renamed from: b */
    public int f38153b;

    /* renamed from: c */
    public int f38154c;

    /* renamed from: d */
    public int f38155d;

    public C7930c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        int highestOneBit = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f38155d = highestOneBit - 1;
        this.f38152a = (E[]) new Object[highestOneBit];
    }

    /* renamed from: a */
    public void m34374a(E e10) {
        int i10 = (this.f38153b - 1) & this.f38155d;
        this.f38153b = i10;
        this.f38152a[i10] = e10;
        if (i10 == this.f38154c) {
            m34377d();
        }
    }

    /* renamed from: b */
    public void m34375b(E e10) {
        E[] eArr = this.f38152a;
        int i10 = this.f38154c;
        eArr[i10] = e10;
        int i11 = this.f38155d & (i10 + 1);
        this.f38154c = i11;
        if (i11 == this.f38153b) {
            m34377d();
        }
    }

    /* renamed from: c */
    public void m34376c() {
        m34380g(m34381h());
    }

    /* renamed from: d */
    public final void m34377d() {
        E[] eArr = this.f38152a;
        int length = eArr.length;
        int i10 = this.f38153b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        System.arraycopy(eArr, i10, eArr2, 0, i11);
        System.arraycopy(this.f38152a, 0, eArr2, i11, this.f38153b);
        this.f38152a = eArr2;
        this.f38153b = 0;
        this.f38154c = length;
        this.f38155d = i12 - 1;
    }

    /* renamed from: e */
    public E m34378e(int i10) {
        if (i10 < 0 || i10 >= m34381h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f38152a[this.f38155d & (this.f38153b + i10)];
    }

    /* renamed from: f */
    public void m34379f(int i10) {
        int i11;
        if (i10 <= 0) {
            return;
        }
        if (i10 > m34381h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f38154c;
        int i13 = i10 < i12 ? i12 - i10 : 0;
        int i14 = i13;
        while (true) {
            i11 = this.f38154c;
            if (i14 >= i11) {
                break;
            }
            this.f38152a[i14] = null;
            i14++;
        }
        int i15 = i11 - i13;
        int i16 = i10 - i15;
        this.f38154c = i11 - i15;
        if (i16 > 0) {
            int length = this.f38152a.length;
            this.f38154c = length;
            int i17 = length - i16;
            for (int i18 = i17; i18 < this.f38154c; i18++) {
                this.f38152a[i18] = null;
            }
            this.f38154c = i17;
        }
    }

    /* renamed from: g */
    public void m34380g(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m34381h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f38152a.length;
        int i11 = this.f38153b;
        int i12 = length;
        int i13 = i11;
        if (i10 < length - i11) {
            i12 = i11 + i10;
            i13 = i11;
        }
        while (i13 < i12) {
            this.f38152a[i13] = null;
            i13++;
        }
        int i14 = this.f38153b;
        int i15 = i12 - i14;
        int i16 = i10 - i15;
        this.f38153b = this.f38155d & (i14 + i15);
        if (i16 > 0) {
            for (int i17 = 0; i17 < i16; i17++) {
                this.f38152a[i17] = null;
            }
            this.f38153b = i16;
        }
    }

    /* renamed from: h */
    public int m34381h() {
        return (this.f38154c - this.f38153b) & this.f38155d;
    }
}
