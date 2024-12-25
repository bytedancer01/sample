package be;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:be/a.class
 */
/* renamed from: be.a */
/* loaded from: combined.jar:classes2.jar:be/a.class */
public final class C0892a {

    /* renamed from: h */
    public static final C0892a f6010h = new C0892a(4201, 4096, 1);

    /* renamed from: i */
    public static final C0892a f6011i = new C0892a(1033, 1024, 1);

    /* renamed from: j */
    public static final C0892a f6012j;

    /* renamed from: k */
    public static final C0892a f6013k;

    /* renamed from: l */
    public static final C0892a f6014l;

    /* renamed from: m */
    public static final C0892a f6015m;

    /* renamed from: n */
    public static final C0892a f6016n;

    /* renamed from: o */
    public static final C0892a f6017o;

    /* renamed from: a */
    public final int[] f6018a;

    /* renamed from: b */
    public final int[] f6019b;

    /* renamed from: c */
    public final C0893b f6020c;

    /* renamed from: d */
    public final C0893b f6021d;

    /* renamed from: e */
    public final int f6022e;

    /* renamed from: f */
    public final int f6023f;

    /* renamed from: g */
    public final int f6024g;

    static {
        C0892a c0892a = new C0892a(67, 64, 1);
        f6012j = c0892a;
        f6013k = new C0892a(19, 16, 1);
        f6014l = new C0892a(285, 256, 0);
        C0892a c0892a2 = new C0892a(301, 256, 1);
        f6015m = c0892a2;
        f6016n = c0892a2;
        f6017o = c0892a;
    }

    public C0892a(int i10, int i11, int i12) {
        this.f6023f = i10;
        this.f6022e = i11;
        this.f6024g = i12;
        this.f6018a = new int[i11];
        this.f6019b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f6018a[i14] = i13;
            int i15 = i13 << 1;
            i13 = i15;
            if (i15 >= i11) {
                i13 = (i15 ^ i10) & (i11 - 1);
            }
        }
        for (int i16 = 0; i16 < i11 - 1; i16++) {
            this.f6019b[this.f6018a[i16]] = i16;
        }
        this.f6020c = new C0893b(this, new int[]{0});
        this.f6021d = new C0893b(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m5530a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* renamed from: b */
    public C0893b m5531b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f6020c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new C0893b(this, iArr);
    }

    /* renamed from: c */
    public int m5532c(int i10) {
        return this.f6018a[i10];
    }

    /* renamed from: d */
    public int m5533d() {
        return this.f6024g;
    }

    /* renamed from: e */
    public C0893b m5534e() {
        return this.f6021d;
    }

    /* renamed from: f */
    public int m5535f() {
        return this.f6022e;
    }

    /* renamed from: g */
    public C0893b m5536g() {
        return this.f6020c;
    }

    /* renamed from: h */
    public int m5537h(int i10) {
        if (i10 != 0) {
            return this.f6018a[(this.f6022e - this.f6019b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: i */
    public int m5538i(int i10) {
        if (i10 != 0) {
            return this.f6019b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public int m5539j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f6018a;
        int[] iArr2 = this.f6019b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f6022e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f6023f) + ',' + this.f6022e + ')';
    }
}
