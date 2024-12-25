package be;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:be/b.class
 */
/* renamed from: be.b */
/* loaded from: combined.jar:classes2.jar:be/b.class */
public final class C0893b {

    /* renamed from: a */
    public final C0892a f6025a;

    /* renamed from: b */
    public final int[] f6026b;

    public C0893b(C0892a c0892a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f6025a = c0892a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f6026b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f6026b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f6026b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    public C0893b m5540a(C0893b c0893b) {
        int[] iArr;
        if (!this.f6025a.equals(c0893b.f6025a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m5544e()) {
            return c0893b;
        }
        if (c0893b.m5544e()) {
            return this;
        }
        int[] iArr2 = this.f6026b;
        int[] iArr3 = c0893b.f6026b;
        if (iArr2.length > iArr3.length) {
            iArr = iArr2;
        } else {
            iArr = iArr3;
            iArr3 = iArr2;
        }
        int[] iArr4 = new int[iArr.length];
        int length = iArr.length - iArr3.length;
        System.arraycopy(iArr, 0, iArr4, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr4[i10] = C0892a.m5530a(iArr3[i10 - length], iArr[i10]);
        }
        return new C0893b(this.f6025a, iArr4);
    }

    /* renamed from: b */
    public int m5541b(int i10) {
        if (i10 == 0) {
            return m5542c(0);
        }
        if (i10 != 1) {
            int[] iArr = this.f6026b;
            int i11 = iArr[0];
            int length = iArr.length;
            for (int i12 = 1; i12 < length; i12++) {
                i11 = C0892a.m5530a(this.f6025a.m5539j(i10, i11), this.f6026b[i12]);
            }
            return i11;
        }
        int i13 = 0;
        for (int i14 : this.f6026b) {
            i13 = C0892a.m5530a(i13, i14);
        }
        return i13;
    }

    /* renamed from: c */
    public int m5542c(int i10) {
        int[] iArr = this.f6026b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* renamed from: d */
    public int m5543d() {
        return this.f6026b.length - 1;
    }

    /* renamed from: e */
    public boolean m5544e() {
        return this.f6026b[0] == 0;
    }

    /* renamed from: f */
    public C0893b m5545f(int i10) {
        if (i10 == 0) {
            return this.f6025a.m5536g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f6026b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f6025a.m5539j(this.f6026b[i11], i10);
        }
        return new C0893b(this.f6025a, iArr);
    }

    /* renamed from: g */
    public C0893b m5546g(C0893b c0893b) {
        if (!this.f6025a.equals(c0893b.f6025a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m5544e() || c0893b.m5544e()) {
            return this.f6025a.m5536g();
        }
        int[] iArr = this.f6026b;
        int length = iArr.length;
        int[] iArr2 = c0893b.f6026b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = C0892a.m5530a(iArr3[i13], this.f6025a.m5539j(i11, iArr2[i12]));
            }
        }
        return new C0893b(this.f6025a, iArr3);
    }

    /* renamed from: h */
    public C0893b m5547h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f6025a.m5536g();
        }
        int length = this.f6026b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f6025a.m5539j(this.f6026b[i12], i11);
        }
        return new C0893b(this.f6025a, iArr);
    }

    public String toString() {
        int i10;
        char c10;
        if (m5544e()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(m5543d() * 8);
        int m5543d = m5543d();
        while (m5543d >= 0) {
            int m5542c = m5542c(m5543d);
            if (m5542c != 0) {
                if (m5542c < 0) {
                    sb2.append(m5543d == m5543d() ? "-" : " - ");
                    i10 = -m5542c;
                } else {
                    i10 = m5542c;
                    if (sb2.length() > 0) {
                        sb2.append(" + ");
                        i10 = m5542c;
                    }
                }
                if (m5543d == 0 || i10 != 1) {
                    int m5538i = this.f6025a.m5538i(i10);
                    if (m5538i == 0) {
                        c10 = '1';
                    } else if (m5538i == 1) {
                        c10 = 'a';
                    } else {
                        sb2.append("a^");
                        sb2.append(m5538i);
                    }
                    sb2.append(c10);
                }
                if (m5543d != 0) {
                    if (m5543d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m5543d);
                    }
                }
            }
            m5543d--;
        }
        return sb2.toString();
    }
}
