package p338te;

import android.graphics.Rect;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/p.class
 */
/* renamed from: te.p */
/* loaded from: combined.jar:classes2.jar:te/p.class */
public class C8718p {

    /* renamed from: a */
    public byte[] f40518a;

    /* renamed from: b */
    public int f40519b;

    /* renamed from: c */
    public int f40520c;

    public C8718p(byte[] bArr, int i10, int i11) {
        this.f40518a = bArr;
        this.f40519b = i10;
        this.f40520c = i11;
    }

    /* renamed from: e */
    public static byte[] m37250e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i13] = bArr[i14];
            i13--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m37251f(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = i11 - 1; i15 >= 0; i15--) {
                bArr2[i13] = bArr[(i15 * i10) + i14];
                i13--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m37252g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i10 * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = i11 - 1; i14 >= 0; i14--) {
                bArr2[i12] = bArr[(i14 * i10) + i13];
                i12++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C8718p m37253a(Rect rect, int i10) {
        int width = rect.width() / i10;
        int height = rect.height() / i10;
        int i11 = rect.top;
        byte[] bArr = new byte[width * height];
        if (i10 == 1) {
            int i12 = (i11 * this.f40519b) + rect.left;
            for (int i13 = 0; i13 < height; i13++) {
                System.arraycopy(this.f40518a, i12, bArr, i13 * width, width);
                i12 += this.f40519b;
            }
        } else {
            int i14 = (i11 * this.f40519b) + rect.left;
            for (int i15 = 0; i15 < height; i15++) {
                int i16 = i15 * width;
                int i17 = i14;
                for (int i18 = 0; i18 < width; i18++) {
                    bArr[i16] = this.f40518a[i17];
                    i17 += i10;
                    i16++;
                }
                i14 += this.f40519b * i10;
            }
        }
        return new C8718p(bArr, width, height);
    }

    /* renamed from: b */
    public byte[] m37254b() {
        return this.f40518a;
    }

    /* renamed from: c */
    public int m37255c() {
        return this.f40520c;
    }

    /* renamed from: d */
    public int m37256d() {
        return this.f40519b;
    }

    /* renamed from: h */
    public C8718p m37257h(int i10) {
        return i10 != 90 ? i10 != 180 ? i10 != 270 ? this : new C8718p(m37251f(this.f40518a, this.f40519b, this.f40520c), this.f40520c, this.f40519b) : new C8718p(m37250e(this.f40518a, this.f40519b, this.f40520c), this.f40519b, this.f40520c) : new C8718p(m37252g(this.f40518a, this.f40519b, this.f40520c), this.f40520c, this.f40519b);
    }
}
