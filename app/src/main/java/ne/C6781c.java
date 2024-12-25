package ne;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ne/c.class
 */
/* renamed from: ne.c */
/* loaded from: combined.jar:classes2.jar:ne/c.class */
public final class C6781c {

    /* renamed from: a */
    public final C6780b f35383a;

    /* renamed from: b */
    public final int[] f35384b;

    public C6781c(C6780b c6780b, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f35383a = c6780b;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f35384b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f35384b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f35384b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    public C6781c m31229a(C6781c c6781c) {
        int[] iArr;
        if (!this.f35383a.equals(c6781c.f35383a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m31233e()) {
            return c6781c;
        }
        if (c6781c.m31233e()) {
            return this;
        }
        int[] iArr2 = this.f35384b;
        int[] iArr3 = c6781c.f35384b;
        if (iArr2.length > iArr3.length) {
            iArr = iArr2;
            iArr2 = iArr3;
        } else {
            iArr = iArr3;
        }
        int[] iArr4 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr4, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr4[i10] = this.f35383a.m31219a(iArr2[i10 - length], iArr[i10]);
        }
        return new C6781c(this.f35383a, iArr4);
    }

    /* renamed from: b */
    public int m31230b(int i10) {
        if (i10 == 0) {
            return m31231c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f35384b) {
                i11 = this.f35383a.m31219a(i11, i12);
            }
            return i11;
        }
        int[] iArr = this.f35384b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            C6780b c6780b = this.f35383a;
            i13 = c6780b.m31219a(c6780b.m31227i(i10, i13), this.f35384b[i14]);
        }
        return i13;
    }

    /* renamed from: c */
    public int m31231c(int i10) {
        int[] iArr = this.f35384b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* renamed from: d */
    public int m31232d() {
        return this.f35384b.length - 1;
    }

    /* renamed from: e */
    public boolean m31233e() {
        return this.f35384b[0] == 0;
    }

    /* renamed from: f */
    public C6781c m31234f(int i10) {
        if (i10 == 0) {
            return this.f35383a.m31224f();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f35384b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f35383a.m31227i(this.f35384b[i11], i10);
        }
        return new C6781c(this.f35383a, iArr);
    }

    /* renamed from: g */
    public C6781c m31235g(C6781c c6781c) {
        if (!this.f35383a.equals(c6781c.f35383a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m31233e() || c6781c.m31233e()) {
            return this.f35383a.m31224f();
        }
        int[] iArr = this.f35384b;
        int length = iArr.length;
        int[] iArr2 = c6781c.f35384b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                C6780b c6780b = this.f35383a;
                iArr3[i13] = c6780b.m31219a(iArr3[i13], c6780b.m31227i(i11, iArr2[i12]));
            }
        }
        return new C6781c(this.f35383a, iArr3);
    }

    /* renamed from: h */
    public C6781c m31236h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f35383a.m31224f();
        }
        int length = this.f35384b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f35383a.m31227i(this.f35384b[i12], i11);
        }
        return new C6781c(this.f35383a, iArr);
    }

    /* renamed from: i */
    public C6781c m31237i() {
        int length = this.f35384b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f35383a.m31228j(0, this.f35384b[i10]);
        }
        return new C6781c(this.f35383a, iArr);
    }

    /* renamed from: j */
    public C6781c m31238j(C6781c c6781c) {
        if (this.f35383a.equals(c6781c.f35383a)) {
            return c6781c.m31233e() ? this : m31229a(c6781c.m31237i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(m31232d() * 8);
        for (int m31232d = m31232d(); m31232d >= 0; m31232d--) {
            int m31231c = m31231c(m31232d);
            if (m31231c != 0) {
                if (m31231c < 0) {
                    sb2.append(" - ");
                    i10 = -m31231c;
                } else {
                    i10 = m31231c;
                    if (sb2.length() > 0) {
                        sb2.append(" + ");
                        i10 = m31231c;
                    }
                }
                if (m31232d == 0 || i10 != 1) {
                    sb2.append(i10);
                }
                if (m31232d != 0) {
                    if (m31232d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m31232d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
