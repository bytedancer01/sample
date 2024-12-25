package p444zd;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/b.class
 */
/* renamed from: zd.b */
/* loaded from: combined.jar:classes2.jar:zd/b.class */
public final class C10194b implements Cloneable {

    /* renamed from: b */
    public final int f46668b;

    /* renamed from: c */
    public final int f46669c;

    /* renamed from: d */
    public final int f46670d;

    /* renamed from: e */
    public final int[] f46671e;

    public C10194b(int i10) {
        this(i10, i10);
    }

    public C10194b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f46668b = i10;
        this.f46669c = i11;
        int i12 = (i10 + 31) / 32;
        this.f46670d = i12;
        this.f46671e = new int[i12 * i11];
    }

    public C10194b(int i10, int i11, int i12, int[] iArr) {
        this.f46668b = i10;
        this.f46669c = i11;
        this.f46670d = i12;
        this.f46671e = iArr;
    }

    /* renamed from: a */
    public final String m42669a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f46669c * (this.f46668b + 1));
        for (int i10 = 0; i10 < this.f46669c; i10++) {
            for (int i11 = 0; i11 < this.f46668b; i11++) {
                sb2.append(m42672d(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10194b clone() {
        return new C10194b(this.f46668b, this.f46669c, this.f46670d, (int[]) this.f46671e.clone());
    }

    /* renamed from: c */
    public void m42671c(int i10, int i11) {
        int i12 = (i11 * this.f46670d) + (i10 / 32);
        int[] iArr = this.f46671e;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    /* renamed from: d */
    public boolean m42672d(int i10, int i11) {
        return ((this.f46671e[(i11 * this.f46670d) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    /* renamed from: e */
    public int[] m42673e() {
        int length = this.f46671e.length - 1;
        while (length >= 0 && this.f46671e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f46670d;
        int i11 = length / i10;
        int i12 = 31;
        while ((this.f46671e[length] >>> i12) == 0) {
            i12--;
        }
        return new int[]{((length % i10) << 5) + i12, i11};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10194b)) {
            return false;
        }
        C10194b c10194b = (C10194b) obj;
        return this.f46668b == c10194b.f46668b && this.f46669c == c10194b.f46669c && this.f46670d == c10194b.f46670d && Arrays.equals(this.f46671e, c10194b.f46671e);
    }

    /* renamed from: g */
    public int[] m42674g() {
        int i10 = this.f46668b;
        int i11 = this.f46669c;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f46669c; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f46670d;
                if (i15 < i16) {
                    int i17 = this.f46671e[(i16 * i14) + i15];
                    int i18 = i10;
                    int i19 = i11;
                    int i20 = i12;
                    int i21 = i13;
                    if (i17 != 0) {
                        int i22 = i11;
                        if (i14 < i11) {
                            i22 = i14;
                        }
                        int i23 = i13;
                        if (i14 > i13) {
                            i23 = i14;
                        }
                        int i24 = i15 << 5;
                        int i25 = i10;
                        if (i24 < i10) {
                            int i26 = 0;
                            while ((i17 << (31 - i26)) == 0) {
                                i26++;
                            }
                            int i27 = i26 + i24;
                            i25 = i10;
                            if (i27 < i10) {
                                i25 = i27;
                            }
                        }
                        i18 = i25;
                        i19 = i22;
                        i20 = i12;
                        i21 = i23;
                        if (i24 + 31 > i12) {
                            int i28 = 31;
                            while ((i17 >>> i28) == 0) {
                                i28--;
                            }
                            int i29 = i24 + i28;
                            i18 = i25;
                            i19 = i22;
                            i20 = i12;
                            i21 = i23;
                            if (i29 > i12) {
                                i20 = i29;
                                i21 = i23;
                                i19 = i22;
                                i18 = i25;
                            }
                        }
                    }
                    i15++;
                    i10 = i18;
                    i11 = i19;
                    i12 = i20;
                    i13 = i21;
                }
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    /* renamed from: h */
    public int m42675h() {
        return this.f46669c;
    }

    public int hashCode() {
        int i10 = this.f46668b;
        return (((((((i10 * 31) + i10) * 31) + this.f46669c) * 31) + this.f46670d) * 31) + Arrays.hashCode(this.f46671e);
    }

    /* renamed from: i */
    public C10193a m42676i(int i10, C10193a c10193a) {
        if (c10193a == null || c10193a.m42664h() < this.f46668b) {
            c10193a = new C10193a(this.f46668b);
        } else {
            c10193a.m42658a();
        }
        int i11 = this.f46670d;
        for (int i12 = 0; i12 < this.f46670d; i12++) {
            c10193a.m42668m(i12 << 5, this.f46671e[(i10 * i11) + i12]);
        }
        return c10193a;
    }

    /* renamed from: j */
    public int[] m42677j() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f46671e;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f46670d;
        int i12 = i10 / i11;
        int i13 = 0;
        while ((iArr[i10] << (31 - i13)) == 0) {
            i13++;
        }
        return new int[]{((i10 % i11) << 5) + i13, i12};
    }

    /* renamed from: k */
    public int m42678k() {
        return this.f46668b;
    }

    /* renamed from: l */
    public void m42679l() {
        C10193a c10193a = new C10193a(this.f46668b);
        C10193a c10193a2 = new C10193a(this.f46668b);
        int i10 = (this.f46669c + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            c10193a = m42676i(i11, c10193a);
            int i12 = (this.f46669c - 1) - i11;
            c10193a2 = m42676i(i12, c10193a2);
            c10193a.m42666k();
            c10193a2.m42666k();
            m42682o(i11, c10193a2);
            m42682o(i12, c10193a);
        }
    }

    /* renamed from: m */
    public void m42680m(int i10, int i11) {
        int i12 = (i11 * this.f46670d) + (i10 / 32);
        int[] iArr = this.f46671e;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    /* renamed from: n */
    public void m42681n(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f46669c || i14 > this.f46668b) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f46670d;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f46671e;
                int i18 = (i17 / 32) + (i16 * i11);
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    /* renamed from: o */
    public void m42682o(int i10, C10193a c10193a) {
        int[] m42661d = c10193a.m42661d();
        int[] iArr = this.f46671e;
        int i11 = this.f46670d;
        System.arraycopy(m42661d, 0, iArr, i10 * i11, i11);
    }

    /* renamed from: p */
    public String m42683p(String str, String str2) {
        return m42669a(str, str2, "\n");
    }

    public String toString() {
        return m42683p("X ", "  ");
    }
}
