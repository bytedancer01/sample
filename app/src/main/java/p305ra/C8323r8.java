package p305ra;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/r8.class
 */
/* renamed from: ra.r8 */
/* loaded from: combined.jar:classes2.jar:ra/r8.class */
public final class C8323r8 {

    /* renamed from: f */
    public static final C8323r8 f39259f = new C8323r8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f39260a;

    /* renamed from: b */
    public int[] f39261b;

    /* renamed from: c */
    public Object[] f39262c;

    /* renamed from: d */
    public int f39263d;

    /* renamed from: e */
    public boolean f39264e;

    public C8323r8() {
        this(0, new int[8], new Object[8], true);
    }

    public C8323r8(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f39263d = -1;
        this.f39260a = i10;
        this.f39261b = iArr;
        this.f39262c = objArr;
        this.f39264e = z10;
    }

    /* renamed from: a */
    public static C8323r8 m35762a() {
        return f39259f;
    }

    /* renamed from: b */
    public static C8323r8 m35763b() {
        return new C8323r8(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C8323r8 m35764c(C8323r8 c8323r8, C8323r8 c8323r82) {
        int i10 = c8323r8.f39260a + c8323r82.f39260a;
        int[] copyOf = Arrays.copyOf(c8323r8.f39261b, i10);
        System.arraycopy(c8323r82.f39261b, 0, copyOf, c8323r8.f39260a, c8323r82.f39260a);
        Object[] copyOf2 = Arrays.copyOf(c8323r8.f39262c, i10);
        System.arraycopy(c8323r82.f39262c, 0, copyOf2, c8323r8.f39260a, c8323r82.f39260a);
        return new C8323r8(i10, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public final void m35765d() {
        this.f39264e = false;
    }

    /* renamed from: e */
    public final int m35766e() {
        int i10 = this.f39263d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39260a; i12++) {
            int i13 = this.f39261b[i12];
            AbstractC8230l5 abstractC8230l5 = (AbstractC8230l5) this.f39262c[i12];
            int m35812A = AbstractC8350t5.m35812A(1);
            int m35812A2 = AbstractC8350t5.m35812A(2);
            int m35814C = AbstractC8350t5.m35814C(i13 >>> 3);
            int m35812A3 = AbstractC8350t5.m35812A(3);
            int mo35264d = abstractC8230l5.mo35264d();
            i11 += m35812A + m35812A + m35812A2 + m35814C + m35812A3 + AbstractC8350t5.m35814C(mo35264d) + mo35264d;
        }
        this.f39263d = i11;
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8323r8)) {
            return false;
        }
        C8323r8 c8323r8 = (C8323r8) obj;
        int i10 = this.f39260a;
        if (i10 != c8323r8.f39260a) {
            return false;
        }
        int[] iArr = this.f39261b;
        int[] iArr2 = c8323r8.f39261b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        Object[] objArr = this.f39262c;
        Object[] objArr2 = c8323r8.f39262c;
        int i12 = this.f39260a;
        for (int i13 = 0; i13 < i12; i13++) {
            if (!objArr[i13].equals(objArr2[i13])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int m35767f() {
        int m35812A;
        int m35815D;
        int i10;
        int i11;
        int i12;
        int i13 = this.f39263d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = i15;
            if (i14 >= this.f39260a) {
                this.f39263d = i16;
                return i16;
            }
            int i17 = this.f39261b[i14];
            int i18 = i17 >>> 3;
            int i19 = i17 & 7;
            if (i19 != 0) {
                if (i19 == 1) {
                    ((Long) this.f39262c[i14]).longValue();
                    i10 = AbstractC8350t5.m35812A(i18) + 8;
                } else if (i19 == 2) {
                    AbstractC8230l5 abstractC8230l5 = (AbstractC8230l5) this.f39262c[i14];
                    int m35812A2 = AbstractC8350t5.m35812A(i18);
                    int mo35264d = abstractC8230l5.mo35264d();
                    i12 = i16;
                    i11 = m35812A2 + AbstractC8350t5.m35814C(mo35264d) + mo35264d;
                    i14++;
                    i15 = i12 + i11;
                } else if (i19 == 3) {
                    int m35812A3 = AbstractC8350t5.m35812A(i18);
                    m35812A = m35812A3 + m35812A3;
                    m35815D = ((C8323r8) this.f39262c[i14]).m35767f();
                } else {
                    if (i19 != 5) {
                        throw new IllegalStateException(C8396w6.m35989d());
                    }
                    ((Integer) this.f39262c[i14]).intValue();
                    i10 = AbstractC8350t5.m35812A(i18) + 4;
                }
                i12 = i16;
                i11 = i10;
                i14++;
                i15 = i12 + i11;
            } else {
                long longValue = ((Long) this.f39262c[i14]).longValue();
                m35812A = AbstractC8350t5.m35812A(i18);
                m35815D = AbstractC8350t5.m35815D(longValue);
            }
            i10 = m35812A + m35815D;
            i12 = i16;
            i11 = i10;
            i14++;
            i15 = i12 + i11;
        }
    }

    /* renamed from: g */
    public final void m35768g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f39260a; i11++) {
            C8352t7.m35829b(sb2, i10, String.valueOf(this.f39261b[i11] >>> 3), this.f39262c[i11]);
        }
    }

    /* renamed from: h */
    public final void m35769h(int i10, Object obj) {
        if (!this.f39264e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f39260a;
        int[] iArr = this.f39261b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f39261b = Arrays.copyOf(iArr, i12);
            this.f39262c = Arrays.copyOf(this.f39262c, i12);
        }
        int[] iArr2 = this.f39261b;
        int i13 = this.f39260a;
        iArr2[i13] = i10;
        this.f39262c[i13] = obj;
        this.f39260a = i13 + 1;
    }

    public final int hashCode() {
        int i10 = this.f39260a;
        int[] iArr = this.f39261b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        Object[] objArr = this.f39262c;
        int i14 = this.f39260a;
        for (int i15 = 0; i15 < i14; i15++) {
            i11 = (i11 * 31) + objArr[i15].hashCode();
        }
        return ((((i10 + 527) * 31) + i12) * 31) + i11;
    }

    /* renamed from: i */
    public final void m35770i(C8365u5 c8365u5) {
        if (this.f39260a != 0) {
            for (int i10 = 0; i10 < this.f39260a; i10++) {
                int i11 = this.f39261b[i10];
                Object obj = this.f39262c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    c8365u5.m35889n(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    c8365u5.m35896u(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    c8365u5.m35900y(i12, (AbstractC8230l5) obj);
                } else if (i13 == 3) {
                    c8365u5.m35870E(i12);
                    ((C8323r8) obj).m35770i(c8365u5);
                    c8365u5.m35871F(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(C8396w6.m35989d());
                    }
                    c8365u5.m35897v(i12, ((Integer) obj).intValue());
                }
            }
        }
    }
}
