package p294r;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/d.class
 */
/* renamed from: r.d */
/* loaded from: combined.jar:classes1.jar:r/d.class */
public final class C7931d {

    /* renamed from: a */
    public int[] f38156a;

    /* renamed from: b */
    public int f38157b;

    /* renamed from: c */
    public int f38158c;

    /* renamed from: d */
    public int f38159d;

    public C7931d() {
        this(8);
    }

    public C7931d(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        int highestOneBit = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f38159d = highestOneBit - 1;
        this.f38156a = new int[highestOneBit];
    }

    /* renamed from: a */
    public void m34382a(int i10) {
        int[] iArr = this.f38156a;
        int i11 = this.f38158c;
        iArr[i11] = i10;
        int i12 = this.f38159d & (i11 + 1);
        this.f38158c = i12;
        if (i12 == this.f38157b) {
            m34384c();
        }
    }

    /* renamed from: b */
    public void m34383b() {
        this.f38158c = this.f38157b;
    }

    /* renamed from: c */
    public final void m34384c() {
        int[] iArr = this.f38156a;
        int length = iArr.length;
        int i10 = this.f38157b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f38156a, 0, iArr2, i11, this.f38157b);
        this.f38156a = iArr2;
        this.f38157b = 0;
        this.f38158c = length;
        this.f38159d = i12 - 1;
    }

    /* renamed from: d */
    public int m34385d(int i10) {
        if (i10 < 0 || i10 >= m34388g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f38156a[this.f38159d & (this.f38157b + i10)];
    }

    /* renamed from: e */
    public int m34386e() {
        int i10 = this.f38157b;
        int i11 = this.f38158c;
        if (i10 != i11) {
            return this.f38156a[(i11 - 1) & this.f38159d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public int m34387f() {
        int i10 = this.f38157b;
        int i11 = this.f38158c;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f38159d & (i11 - 1);
        int i13 = this.f38156a[i12];
        this.f38158c = i12;
        return i13;
    }

    /* renamed from: g */
    public int m34388g() {
        return (this.f38158c - this.f38157b) & this.f38159d;
    }
}
