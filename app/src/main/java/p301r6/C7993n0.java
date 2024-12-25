package p301r6;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/n0.class
 */
/* renamed from: r6.n0 */
/* loaded from: combined.jar:classes2.jar:r6/n0.class */
public final class C7993n0 {

    /* renamed from: a */
    public final int f38657a;

    /* renamed from: b */
    public final int f38658b;

    /* renamed from: c */
    public final float f38659c;

    /* renamed from: d */
    public final float f38660d;

    /* renamed from: e */
    public final float f38661e;

    /* renamed from: f */
    public final int f38662f;

    /* renamed from: g */
    public final int f38663g;

    /* renamed from: h */
    public final int f38664h;

    /* renamed from: i */
    public final short[] f38665i;

    /* renamed from: j */
    public short[] f38666j;

    /* renamed from: k */
    public int f38667k;

    /* renamed from: l */
    public short[] f38668l;

    /* renamed from: m */
    public int f38669m;

    /* renamed from: n */
    public short[] f38670n;

    /* renamed from: o */
    public int f38671o;

    /* renamed from: p */
    public int f38672p;

    /* renamed from: q */
    public int f38673q;

    /* renamed from: r */
    public int f38674r;

    /* renamed from: s */
    public int f38675s;

    /* renamed from: t */
    public int f38676t;

    /* renamed from: u */
    public int f38677u;

    /* renamed from: v */
    public int f38678v;

    public C7993n0(int i10, int i11, float f10, float f11, int i12) {
        this.f38657a = i10;
        this.f38658b = i11;
        this.f38659c = f10;
        this.f38660d = f11;
        this.f38661e = i10 / i12;
        this.f38662f = i10 / 400;
        int i13 = i10 / 65;
        this.f38663g = i13;
        int i14 = i13 * 2;
        this.f38664h = i14;
        this.f38665i = new short[i14];
        this.f38666j = new short[i14 * i11];
        this.f38668l = new short[i14 * i11];
        this.f38670n = new short[i14 * i11];
    }

    /* renamed from: p */
    public static void m34750p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    /* renamed from: a */
    public final void m34751a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f38669m == i10) {
            return;
        }
        int i13 = this.f38657a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        m34765o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f38671o;
            boolean z10 = true;
            if (i15 >= i16 - 1) {
                m34770u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f38672p;
                i12 = this.f38673q;
                if ((i11 + 1) * i14 <= i12 * i13) {
                    break;
                }
                this.f38668l = m34756f(this.f38668l, this.f38669m, 1);
                int i17 = 0;
                while (true) {
                    int i18 = this.f38658b;
                    if (i17 < i18) {
                        this.f38668l[(this.f38669m * i18) + i17] = m34764n(this.f38670n, (i18 * i15) + i17, i13, i14);
                        i17++;
                    }
                }
                this.f38673q++;
                this.f38669m++;
            }
            int i19 = i11 + 1;
            this.f38672p = i19;
            if (i19 == i13) {
                this.f38672p = 0;
                if (i12 != i14) {
                    z10 = false;
                }
                C4349a.m21884g(z10);
                this.f38673q = 0;
            }
            i15++;
        }
    }

    /* renamed from: b */
    public final void m34752b(float f10) {
        int m34772w;
        int i10;
        int i11 = this.f38667k;
        if (i11 < this.f38664h) {
            return;
        }
        int i12 = 0;
        do {
            if (this.f38674r > 0) {
                m34772w = m34753c(i12);
            } else {
                int m34757g = m34757g(this.f38666j, i12);
                double d10 = f10;
                short[] sArr = this.f38666j;
                m34772w = d10 > 1.0d ? m34757g + m34772w(sArr, i12, f10, m34757g) : m34763m(sArr, i12, f10, m34757g);
            }
            i10 = i12 + m34772w;
            i12 = i10;
        } while (this.f38664h + i10 <= i11);
        m34771v(i10);
    }

    /* renamed from: c */
    public final int m34753c(int i10) {
        int min = Math.min(this.f38664h, this.f38674r);
        m34754d(this.f38666j, i10, min);
        this.f38674r -= min;
        return min;
    }

    /* renamed from: d */
    public final void m34754d(short[] sArr, int i10, int i11) {
        short[] m34756f = m34756f(this.f38668l, this.f38669m, i11);
        this.f38668l = m34756f;
        int i12 = this.f38658b;
        System.arraycopy(sArr, i10 * i12, m34756f, this.f38669m * i12, i12 * i11);
        this.f38669m += i11;
    }

    /* renamed from: e */
    public final void m34755e(short[] sArr, int i10, int i11) {
        int i12 = this.f38664h / i11;
        int i13 = this.f38658b;
        int i14 = i11 * i13;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                i16 += sArr[(i15 * i14) + (i10 * i13) + i17];
            }
            this.f38665i[i15] = (short) (i16 / i14);
        }
    }

    /* renamed from: f */
    public final short[] m34756f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f38658b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    /* renamed from: g */
    public final int m34757g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f38657a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f38658b == 1 && i13 == 1) {
            i11 = m34758h(sArr, i10, this.f38662f, this.f38663g);
        } else {
            m34755e(sArr, i10, i13);
            int m34758h = m34758h(this.f38665i, 0, this.f38662f / i13, this.f38663g / i13);
            if (i13 != 1) {
                int i14 = m34758h * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f38662f;
                int i19 = i16;
                if (i16 < i18) {
                    i19 = i18;
                }
                int i20 = this.f38663g;
                int i21 = i17;
                if (i17 > i20) {
                    i21 = i20;
                }
                if (this.f38658b == 1) {
                    i11 = m34758h(sArr, i10, i19, i21);
                } else {
                    m34755e(sArr, i10, 1);
                    i11 = m34758h(this.f38665i, 0, i19, i21);
                }
            } else {
                i11 = m34758h;
            }
        }
        int i22 = m34766q(this.f38677u, this.f38678v) ? this.f38675s : i11;
        this.f38676t = this.f38677u;
        this.f38675s = i11;
        return i22;
    }

    /* renamed from: h */
    public final int m34758h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f38658b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = i17;
            if (i11 > i12) {
                this.f38677u = i14 / i16;
                this.f38678v = i18 / i15;
                return i16;
            }
            int i19 = 0;
            for (int i20 = 0; i20 < i11; i20++) {
                i19 += Math.abs(sArr[i13 + i20] - sArr[(i13 + i11) + i20]);
            }
            int i21 = i14;
            int i22 = i16;
            if (i19 * i16 < i14 * i11) {
                i22 = i11;
                i21 = i19;
            }
            int i23 = i15;
            int i24 = i18;
            if (i19 * i15 > i18 * i11) {
                i23 = i11;
                i24 = i19;
            }
            i11++;
            i14 = i21;
            i15 = i23;
            i16 = i22;
            i17 = i24;
        }
    }

    /* renamed from: i */
    public void m34759i() {
        this.f38667k = 0;
        this.f38669m = 0;
        this.f38671o = 0;
        this.f38672p = 0;
        this.f38673q = 0;
        this.f38674r = 0;
        this.f38675s = 0;
        this.f38676t = 0;
        this.f38677u = 0;
        this.f38678v = 0;
    }

    /* renamed from: j */
    public void m34760j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f38658b, this.f38669m);
        shortBuffer.put(this.f38668l, 0, this.f38658b * min);
        int i10 = this.f38669m - min;
        this.f38669m = i10;
        short[] sArr = this.f38668l;
        int i11 = this.f38658b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    /* renamed from: k */
    public int m34761k() {
        return this.f38669m * this.f38658b * 2;
    }

    /* renamed from: l */
    public int m34762l() {
        return this.f38667k * this.f38658b * 2;
    }

    /* renamed from: m */
    public final int m34763m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f38674r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] m34756f = m34756f(this.f38668l, this.f38669m, i13);
        this.f38668l = m34756f;
        int i14 = this.f38658b;
        System.arraycopy(sArr, i10 * i14, m34756f, this.f38669m * i14, i14 * i11);
        m34750p(i12, this.f38658b, this.f38668l, this.f38669m + i11, sArr, i10 + i11, sArr, i10);
        this.f38669m += i13;
        return i12;
    }

    /* renamed from: n */
    public final short m34764n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f38658b];
        int i13 = this.f38673q;
        int i14 = this.f38672p;
        int i15 = (i14 + 1) * i12;
        int i16 = i15 - (i13 * i11);
        int i17 = i15 - (i14 * i12);
        return (short) (((s10 * i16) + ((i17 - i16) * s11)) / i17);
    }

    /* renamed from: o */
    public final void m34765o(int i10) {
        int i11 = this.f38669m - i10;
        short[] m34756f = m34756f(this.f38670n, this.f38671o, i11);
        this.f38670n = m34756f;
        short[] sArr = this.f38668l;
        int i12 = this.f38658b;
        System.arraycopy(sArr, i10 * i12, m34756f, this.f38671o * i12, i12 * i11);
        this.f38669m = i10;
        this.f38671o += i11;
    }

    /* renamed from: q */
    public final boolean m34766q(int i10, int i11) {
        return i10 != 0 && this.f38675s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f38676t * 3;
    }

    /* renamed from: r */
    public final void m34767r() {
        int i10 = this.f38669m;
        float f10 = this.f38659c;
        float f11 = this.f38660d;
        float f12 = f10 / f11;
        float f13 = this.f38661e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            m34752b(f12);
        } else {
            m34754d(this.f38666j, 0, this.f38667k);
            this.f38667k = 0;
        }
        if (f13 != 1.0f) {
            m34751a(f13, i10);
        }
    }

    /* renamed from: s */
    public void m34768s() {
        int i10;
        int i11 = this.f38667k;
        float f10 = this.f38659c;
        float f11 = this.f38660d;
        int i12 = this.f38669m + ((int) ((((i11 / (f10 / f11)) + this.f38671o) / (this.f38661e * f11)) + 0.5f));
        this.f38666j = m34756f(this.f38666j, i11, (this.f38664h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f38664h;
            int i14 = this.f38658b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f38666j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f38667k += i10 * 2;
        m34767r();
        if (this.f38669m > i12) {
            this.f38669m = i12;
        }
        this.f38667k = 0;
        this.f38674r = 0;
        this.f38671o = 0;
    }

    /* renamed from: t */
    public void m34769t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f38658b;
        int i11 = remaining / i10;
        short[] m34756f = m34756f(this.f38666j, this.f38667k, i11);
        this.f38666j = m34756f;
        shortBuffer.get(m34756f, this.f38667k * this.f38658b, ((i10 * i11) * 2) / 2);
        this.f38667k += i11;
        m34767r();
    }

    /* renamed from: u */
    public final void m34770u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f38670n;
        int i11 = this.f38658b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f38671o - i10) * i11);
        this.f38671o -= i10;
    }

    /* renamed from: v */
    public final void m34771v(int i10) {
        int i11 = this.f38667k - i10;
        short[] sArr = this.f38666j;
        int i12 = this.f38658b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f38667k = i11;
    }

    /* renamed from: w */
    public final int m34772w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f38674r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] m34756f = m34756f(this.f38668l, this.f38669m, i12);
        this.f38668l = m34756f;
        m34750p(i12, this.f38658b, m34756f, this.f38669m, sArr, i10, sArr, i10 + i11);
        this.f38669m += i12;
        return i12;
    }
}
