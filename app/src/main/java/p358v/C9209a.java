package p358v;

import java.util.Arrays;
import p358v.C9210b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v/a.class
 */
/* renamed from: v.a */
/* loaded from: combined.jar:classes1.jar:v/a.class */
public class C9209a implements C9210b.a {

    /* renamed from: l */
    public static float f42019l = 0.001f;

    /* renamed from: b */
    public final C9210b f42021b;

    /* renamed from: c */
    public final C9211c f42022c;

    /* renamed from: a */
    public int f42020a = 0;

    /* renamed from: d */
    public int f42023d = 8;

    /* renamed from: e */
    public C9217i f42024e = null;

    /* renamed from: f */
    public int[] f42025f = new int[8];

    /* renamed from: g */
    public int[] f42026g = new int[8];

    /* renamed from: h */
    public float[] f42027h = new float[8];

    /* renamed from: i */
    public int f42028i = -1;

    /* renamed from: j */
    public int f42029j = -1;

    /* renamed from: k */
    public boolean f42030k = false;

    public C9209a(C9210b c9210b, C9211c c9211c) {
        this.f42021b = c9210b;
        this.f42022c = c9211c;
    }

    @Override // p358v.C9210b.a
    /* renamed from: a */
    public float mo38700a(C9210b c9210b, boolean z10) {
        float mo38703d = mo38703d(c9210b.f42031a);
        mo38708i(c9210b.f42031a, z10);
        C9210b.a aVar = c9210b.f42035e;
        int mo38705f = aVar.mo38705f();
        for (int i10 = 0; i10 < mo38705f; i10++) {
            C9217i mo38701b = aVar.mo38701b(i10);
            mo38709j(mo38701b, aVar.mo38703d(mo38701b) * mo38703d, z10);
        }
        return mo38703d;
    }

    @Override // p358v.C9210b.a
    /* renamed from: b */
    public C9217i mo38701b(int i10) {
        int i11 = this.f42028i;
        for (int i12 = 0; i11 != -1 && i12 < this.f42020a; i12++) {
            if (i12 == i10) {
                return this.f42022c.f42040d[this.f42025f[i11]];
            }
            i11 = this.f42026g[i11];
        }
        return null;
    }

    @Override // p358v.C9210b.a
    /* renamed from: c */
    public void mo38702c() {
        int i10 = this.f42028i;
        for (int i11 = 0; i10 != -1 && i11 < this.f42020a; i11++) {
            float[] fArr = this.f42027h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f42026g[i10];
        }
    }

    @Override // p358v.C9210b.a
    public final void clear() {
        int i10 = this.f42028i;
        for (int i11 = 0; i10 != -1 && i11 < this.f42020a; i11++) {
            C9217i c9217i = this.f42022c.f42040d[this.f42025f[i10]];
            if (c9217i != null) {
                c9217i.m38785c(this.f42021b);
            }
            i10 = this.f42026g[i10];
        }
        this.f42028i = -1;
        this.f42029j = -1;
        this.f42030k = false;
        this.f42020a = 0;
    }

    @Override // p358v.C9210b.a
    /* renamed from: d */
    public final float mo38703d(C9217i c9217i) {
        int i10 = this.f42028i;
        for (int i11 = 0; i10 != -1 && i11 < this.f42020a; i11++) {
            if (this.f42025f[i10] == c9217i.f42077c) {
                return this.f42027h[i10];
            }
            i10 = this.f42026g[i10];
        }
        return 0.0f;
    }

    @Override // p358v.C9210b.a
    /* renamed from: e */
    public final void mo38704e(C9217i c9217i, float f10) {
        if (f10 == 0.0f) {
            mo38708i(c9217i, true);
            return;
        }
        int i10 = this.f42028i;
        if (i10 == -1) {
            this.f42028i = 0;
            this.f42027h[0] = f10;
            this.f42025f[0] = c9217i.f42077c;
            this.f42026g[0] = -1;
            c9217i.f42087m++;
            c9217i.m38784a(this.f42021b);
            this.f42020a++;
            if (this.f42030k) {
                return;
            }
            int i11 = this.f42029j + 1;
            this.f42029j = i11;
            int[] iArr = this.f42025f;
            if (i11 >= iArr.length) {
                this.f42030k = true;
                this.f42029j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f42020a; i13++) {
            int i14 = this.f42025f[i10];
            int i15 = c9217i.f42077c;
            if (i14 == i15) {
                this.f42027h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f42026g[i10];
        }
        int i16 = this.f42029j;
        if (this.f42030k) {
            int[] iArr2 = this.f42025f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16++;
        }
        int[] iArr3 = this.f42025f;
        int i17 = i16;
        if (i16 >= iArr3.length) {
            i17 = i16;
            if (this.f42020a < iArr3.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr4 = this.f42025f;
                    i17 = i16;
                    if (i18 >= iArr4.length) {
                        break;
                    }
                    if (iArr4[i18] == -1) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f42025f;
        int i19 = i17;
        if (i17 >= iArr5.length) {
            i19 = iArr5.length;
            int i20 = this.f42023d * 2;
            this.f42023d = i20;
            this.f42030k = false;
            this.f42029j = i19 - 1;
            this.f42027h = Arrays.copyOf(this.f42027h, i20);
            this.f42025f = Arrays.copyOf(this.f42025f, this.f42023d);
            this.f42026g = Arrays.copyOf(this.f42026g, this.f42023d);
        }
        this.f42025f[i19] = c9217i.f42077c;
        this.f42027h[i19] = f10;
        int[] iArr6 = this.f42026g;
        if (i12 != -1) {
            iArr6[i19] = iArr6[i12];
            iArr6[i12] = i19;
        } else {
            iArr6[i19] = this.f42028i;
            this.f42028i = i19;
        }
        c9217i.f42087m++;
        c9217i.m38784a(this.f42021b);
        int i21 = this.f42020a + 1;
        this.f42020a = i21;
        if (!this.f42030k) {
            this.f42029j++;
        }
        int[] iArr7 = this.f42025f;
        if (i21 >= iArr7.length) {
            this.f42030k = true;
        }
        if (this.f42029j >= iArr7.length) {
            this.f42030k = true;
            this.f42029j = iArr7.length - 1;
        }
    }

    @Override // p358v.C9210b.a
    /* renamed from: f */
    public int mo38705f() {
        return this.f42020a;
    }

    @Override // p358v.C9210b.a
    /* renamed from: g */
    public boolean mo38706g(C9217i c9217i) {
        int i10 = this.f42028i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f42020a; i11++) {
            if (this.f42025f[i10] == c9217i.f42077c) {
                return true;
            }
            i10 = this.f42026g[i10];
        }
        return false;
    }

    @Override // p358v.C9210b.a
    /* renamed from: h */
    public float mo38707h(int i10) {
        int i11 = this.f42028i;
        for (int i12 = 0; i11 != -1 && i12 < this.f42020a; i12++) {
            if (i12 == i10) {
                return this.f42027h[i11];
            }
            i11 = this.f42026g[i11];
        }
        return 0.0f;
    }

    @Override // p358v.C9210b.a
    /* renamed from: i */
    public final float mo38708i(C9217i c9217i, boolean z10) {
        if (this.f42024e == c9217i) {
            this.f42024e = null;
        }
        int i10 = this.f42028i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f42020a) {
            if (this.f42025f[i10] == c9217i.f42077c) {
                if (i10 == this.f42028i) {
                    this.f42028i = this.f42026g[i10];
                } else {
                    int[] iArr = this.f42026g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c9217i.m38785c(this.f42021b);
                }
                c9217i.f42087m--;
                this.f42020a--;
                this.f42025f[i10] = -1;
                if (this.f42030k) {
                    this.f42029j = i10;
                }
                return this.f42027h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f42026g[i10];
        }
        return 0.0f;
    }

    @Override // p358v.C9210b.a
    /* renamed from: j */
    public void mo38709j(C9217i c9217i, float f10, boolean z10) {
        float f11 = f42019l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f42028i;
            if (i10 == -1) {
                this.f42028i = 0;
                this.f42027h[0] = f10;
                this.f42025f[0] = c9217i.f42077c;
                this.f42026g[0] = -1;
                c9217i.f42087m++;
                c9217i.m38784a(this.f42021b);
                this.f42020a++;
                if (this.f42030k) {
                    return;
                }
                int i11 = this.f42029j + 1;
                this.f42029j = i11;
                int[] iArr = this.f42025f;
                if (i11 >= iArr.length) {
                    this.f42030k = true;
                    this.f42029j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f42020a; i13++) {
                int i14 = this.f42025f[i10];
                int i15 = c9217i.f42077c;
                if (i14 == i15) {
                    float[] fArr = this.f42027h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f42019l;
                    float f14 = f12;
                    if (f12 > (-f13)) {
                        f14 = f12;
                        if (f12 < f13) {
                            f14 = 0.0f;
                        }
                    }
                    fArr[i10] = f14;
                    if (f14 == 0.0f) {
                        if (i10 == this.f42028i) {
                            this.f42028i = this.f42026g[i10];
                        } else {
                            int[] iArr2 = this.f42026g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            c9217i.m38785c(this.f42021b);
                        }
                        if (this.f42030k) {
                            this.f42029j = i10;
                        }
                        c9217i.f42087m--;
                        this.f42020a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f42026g[i10];
            }
            int i16 = this.f42029j;
            if (this.f42030k) {
                int[] iArr3 = this.f42025f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16++;
            }
            int[] iArr4 = this.f42025f;
            int i17 = i16;
            if (i16 >= iArr4.length) {
                i17 = i16;
                if (this.f42020a < iArr4.length) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr5 = this.f42025f;
                        i17 = i16;
                        if (i18 >= iArr5.length) {
                            break;
                        }
                        if (iArr5[i18] == -1) {
                            i17 = i18;
                            break;
                        }
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f42025f;
            int i19 = i17;
            if (i17 >= iArr6.length) {
                i19 = iArr6.length;
                int i20 = this.f42023d * 2;
                this.f42023d = i20;
                this.f42030k = false;
                this.f42029j = i19 - 1;
                this.f42027h = Arrays.copyOf(this.f42027h, i20);
                this.f42025f = Arrays.copyOf(this.f42025f, this.f42023d);
                this.f42026g = Arrays.copyOf(this.f42026g, this.f42023d);
            }
            this.f42025f[i19] = c9217i.f42077c;
            this.f42027h[i19] = f10;
            int[] iArr7 = this.f42026g;
            if (i12 != -1) {
                iArr7[i19] = iArr7[i12];
                iArr7[i12] = i19;
            } else {
                iArr7[i19] = this.f42028i;
                this.f42028i = i19;
            }
            c9217i.f42087m++;
            c9217i.m38784a(this.f42021b);
            this.f42020a++;
            if (!this.f42030k) {
                this.f42029j++;
            }
            int i21 = this.f42029j;
            int[] iArr8 = this.f42025f;
            if (i21 >= iArr8.length) {
                this.f42030k = true;
                this.f42029j = iArr8.length - 1;
            }
        }
    }

    @Override // p358v.C9210b.a
    /* renamed from: k */
    public void mo38710k(float f10) {
        int i10 = this.f42028i;
        for (int i11 = 0; i10 != -1 && i11 < this.f42020a; i11++) {
            float[] fArr = this.f42027h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f42026g[i10];
        }
    }

    public String toString() {
        int i10 = this.f42028i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f42020a; i11++) {
            str = ((str + " -> ") + this.f42027h[i10] + " : ") + this.f42022c.f42040d[this.f42025f[i10]];
            i10 = this.f42026g[i10];
        }
        return str;
    }
}
