package p444zd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/c.class
 */
/* renamed from: zd.c */
/* loaded from: combined.jar:classes2.jar:zd/c.class */
public final class C10195c {

    /* renamed from: a */
    public final byte[] f46672a;

    /* renamed from: b */
    public int f46673b;

    /* renamed from: c */
    public int f46674c;

    public C10195c(byte[] bArr) {
        this.f46672a = bArr;
    }

    /* renamed from: a */
    public int m42684a() {
        return ((this.f46672a.length - this.f46673b) * 8) - this.f46674c;
    }

    /* renamed from: b */
    public int m42685b() {
        return this.f46674c;
    }

    /* renamed from: c */
    public int m42686c() {
        return this.f46673b;
    }

    /* renamed from: d */
    public int m42687d(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > m42684a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f46674c;
        int i12 = 0;
        int i13 = i10;
        if (i11 > 0) {
            int i14 = 8 - i11;
            int min = Math.min(i10, i14);
            int i15 = i14 - min;
            byte[] bArr = this.f46672a;
            int i16 = this.f46673b;
            byte b10 = bArr[i16];
            i13 = i10 - min;
            int i17 = this.f46674c + min;
            this.f46674c = i17;
            if (i17 == 8) {
                this.f46674c = 0;
                this.f46673b = i16 + 1;
            }
            i12 = (((255 >> (8 - min)) << i15) & b10) >> i15;
        }
        int i18 = i12;
        if (i13 > 0) {
            while (i13 >= 8) {
                byte[] bArr2 = this.f46672a;
                int i19 = this.f46673b;
                i12 = (bArr2[i19] & 255) | (i12 << 8);
                this.f46673b = i19 + 1;
                i13 -= 8;
            }
            i18 = i12;
            if (i13 > 0) {
                int i20 = 8 - i13;
                i18 = (i12 << i13) | ((((255 >> i20) << i20) & this.f46672a[this.f46673b]) >> i20);
                this.f46674c += i13;
            }
        }
        return i18;
    }
}
