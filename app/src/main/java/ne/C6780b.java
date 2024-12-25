package ne;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ne/b.class
 */
/* renamed from: ne.b */
/* loaded from: combined.jar:classes2.jar:ne/b.class */
public final class C6780b {

    /* renamed from: f */
    public static final C6780b f35377f = new C6780b(929, 3);

    /* renamed from: a */
    public final int[] f35378a;

    /* renamed from: b */
    public final int[] f35379b;

    /* renamed from: c */
    public final C6781c f35380c;

    /* renamed from: d */
    public final C6781c f35381d;

    /* renamed from: e */
    public final int f35382e;

    public C6780b(int i10, int i11) {
        this.f35382e = i10;
        this.f35378a = new int[i10];
        this.f35379b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f35378a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f35379b[this.f35378a[i14]] = i14;
        }
        this.f35380c = new C6781c(this, new int[]{0});
        this.f35381d = new C6781c(this, new int[]{1});
    }

    /* renamed from: a */
    public int m31219a(int i10, int i11) {
        return (i10 + i11) % this.f35382e;
    }

    /* renamed from: b */
    public C6781c m31220b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f35380c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new C6781c(this, iArr);
    }

    /* renamed from: c */
    public int m31221c(int i10) {
        return this.f35378a[i10];
    }

    /* renamed from: d */
    public C6781c m31222d() {
        return this.f35381d;
    }

    /* renamed from: e */
    public int m31223e() {
        return this.f35382e;
    }

    /* renamed from: f */
    public C6781c m31224f() {
        return this.f35380c;
    }

    /* renamed from: g */
    public int m31225g(int i10) {
        if (i10 != 0) {
            return this.f35378a[(this.f35382e - this.f35379b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int m31226h(int i10) {
        if (i10 != 0) {
            return this.f35379b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int m31227i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f35378a;
        int[] iArr2 = this.f35379b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f35382e - 1)];
    }

    /* renamed from: j */
    public int m31228j(int i10, int i11) {
        int i12 = this.f35382e;
        return ((i10 + i12) - i11) % i12;
    }
}
