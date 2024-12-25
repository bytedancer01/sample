package p444zd;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/a.class
 */
/* renamed from: zd.a */
/* loaded from: combined.jar:classes2.jar:zd/a.class */
public final class C10193a implements Cloneable {

    /* renamed from: b */
    public int[] f46666b;

    /* renamed from: c */
    public int f46667c;

    public C10193a() {
        this.f46667c = 0;
        this.f46666b = new int[1];
    }

    public C10193a(int i10) {
        this.f46667c = i10;
        this.f46666b = m42657j(i10);
    }

    public C10193a(int[] iArr, int i10) {
        this.f46666b = iArr;
        this.f46667c = i10;
    }

    /* renamed from: j */
    public static int[] m42657j(int i10) {
        return new int[(i10 + 31) / 32];
    }

    /* renamed from: a */
    public void m42658a() {
        int length = this.f46666b.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f46666b[i10] = 0;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10193a clone() {
        return new C10193a((int[]) this.f46666b.clone(), this.f46667c);
    }

    /* renamed from: c */
    public boolean m42660c(int i10) {
        return ((1 << (i10 & 31)) & this.f46666b[i10 / 32]) != 0;
    }

    /* renamed from: d */
    public int[] m42661d() {
        return this.f46666b;
    }

    /* renamed from: e */
    public int m42662e(int i10) {
        int i11 = this.f46667c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f46666b[i12];
        int i14 = i12;
        while (i13 == 0) {
            i14++;
            int[] iArr = this.f46666b;
            if (i14 == iArr.length) {
                return this.f46667c;
            }
            i13 = iArr[i14];
        }
        return Math.min((i14 << 5) + Integer.numberOfTrailingZeros(i13), this.f46667c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10193a)) {
            return false;
        }
        C10193a c10193a = (C10193a) obj;
        return this.f46667c == c10193a.f46667c && Arrays.equals(this.f46666b, c10193a.f46666b);
    }

    /* renamed from: g */
    public int m42663g(int i10) {
        int i11 = this.f46667c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (this.f46666b[i12] ^ (-1));
        int i14 = i12;
        while (i13 == 0) {
            i14++;
            int[] iArr = this.f46666b;
            if (i14 == iArr.length) {
                return this.f46667c;
            }
            i13 = iArr[i14] ^ (-1);
        }
        return Math.min((i14 << 5) + Integer.numberOfTrailingZeros(i13), this.f46667c);
    }

    /* renamed from: h */
    public int m42664h() {
        return this.f46667c;
    }

    public int hashCode() {
        return (this.f46667c * 31) + Arrays.hashCode(this.f46666b);
    }

    /* renamed from: i */
    public boolean m42665i(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f46667c) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = 31;
            int i17 = i15 > i13 ? 0 : i10 & 31;
            if (i15 >= i14) {
                i16 = 31 & i12;
            }
            int i18 = (2 << i16) - (1 << i17);
            if ((this.f46666b[i15] & i18) != (z10 ? i18 : 0)) {
                return false;
            }
            i15++;
        }
        return true;
    }

    /* renamed from: k */
    public void m42666k() {
        int[] iArr = new int[this.f46666b.length];
        int i10 = (this.f46667c - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = this.f46666b[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & 65535) << 16) | ((j14 >> 16) & 65535));
        }
        int i13 = this.f46667c;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f46666b = iArr;
    }

    /* renamed from: l */
    public void m42667l(int i10) {
        int[] iArr = this.f46666b;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    /* renamed from: m */
    public void m42668m(int i10, int i11) {
        this.f46666b[i10 / 32] = i11;
    }

    public String toString() {
        int i10 = this.f46667c;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f46667c; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(m42660c(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
