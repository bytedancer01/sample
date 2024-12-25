package p358v;

import java.util.Arrays;
import p358v.C9210b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v/j.class
 */
/* renamed from: v.j */
/* loaded from: combined.jar:classes1.jar:v/j.class */
public class C9218j implements C9210b.a {

    /* renamed from: n */
    public static float f42089n = 0.001f;

    /* renamed from: a */
    public final int f42090a = -1;

    /* renamed from: b */
    public int f42091b = 16;

    /* renamed from: c */
    public int f42092c = 16;

    /* renamed from: d */
    public int[] f42093d = new int[16];

    /* renamed from: e */
    public int[] f42094e = new int[16];

    /* renamed from: f */
    public int[] f42095f = new int[16];

    /* renamed from: g */
    public float[] f42096g = new float[16];

    /* renamed from: h */
    public int[] f42097h = new int[16];

    /* renamed from: i */
    public int[] f42098i = new int[16];

    /* renamed from: j */
    public int f42099j = 0;

    /* renamed from: k */
    public int f42100k = -1;

    /* renamed from: l */
    public final C9210b f42101l;

    /* renamed from: m */
    public final C9211c f42102m;

    public C9218j(C9210b c9210b, C9211c c9211c) {
        this.f42101l = c9210b;
        this.f42102m = c9211c;
        clear();
    }

    @Override // p358v.C9210b.a
    /* renamed from: a */
    public float mo38700a(C9210b c9210b, boolean z10) {
        float mo38703d = mo38703d(c9210b.f42031a);
        mo38708i(c9210b.f42031a, z10);
        C9218j c9218j = (C9218j) c9210b.f42035e;
        int mo38705f = c9218j.mo38705f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < mo38705f) {
            int i12 = c9218j.f42095f[i11];
            int i13 = i10;
            if (i12 != -1) {
                mo38709j(this.f42102m.f42040d[i12], c9218j.f42096g[i11] * mo38703d, z10);
                i13 = i10 + 1;
            }
            i11++;
            i10 = i13;
        }
        return mo38703d;
    }

    @Override // p358v.C9210b.a
    /* renamed from: b */
    public C9217i mo38701b(int i10) {
        int i11 = this.f42099j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f42100k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f42102m.f42040d[this.f42095f[i12]];
            }
            i12 = this.f42098i[i12];
            if (i12 == -1) {
                return null;
            }
        }
        return null;
    }

    @Override // p358v.C9210b.a
    /* renamed from: c */
    public void mo38702c() {
        int i10 = this.f42099j;
        int i11 = this.f42100k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f42096g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f42098i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // p358v.C9210b.a
    public void clear() {
        int i10 = this.f42099j;
        for (int i11 = 0; i11 < i10; i11++) {
            C9217i mo38701b = mo38701b(i11);
            if (mo38701b != null) {
                mo38701b.m38785c(this.f42101l);
            }
        }
        for (int i12 = 0; i12 < this.f42091b; i12++) {
            this.f42095f[i12] = -1;
            this.f42094e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f42092c; i13++) {
            this.f42093d[i13] = -1;
        }
        this.f42099j = 0;
        this.f42100k = -1;
    }

    @Override // p358v.C9210b.a
    /* renamed from: d */
    public float mo38703d(C9217i c9217i) {
        int m38794p = m38794p(c9217i);
        if (m38794p != -1) {
            return this.f42096g[m38794p];
        }
        return 0.0f;
    }

    @Override // p358v.C9210b.a
    /* renamed from: e */
    public void mo38704e(C9217i c9217i, float f10) {
        int i10;
        float f11 = f42089n;
        if (f10 > (-f11) && f10 < f11) {
            mo38708i(c9217i, true);
            return;
        }
        int i11 = 0;
        if (this.f42099j == 0) {
            m38791m(0, c9217i, f10);
            m38790l(c9217i, 0);
            this.f42100k = 0;
            return;
        }
        int m38794p = m38794p(c9217i);
        if (m38794p != -1) {
            this.f42096g[m38794p] = f10;
            return;
        }
        if (this.f42099j + 1 >= this.f42091b) {
            m38793o();
        }
        int i12 = this.f42099j;
        int i13 = this.f42100k;
        int i14 = -1;
        while (true) {
            i10 = i14;
            if (i11 >= i12) {
                break;
            }
            int i15 = this.f42095f[i13];
            int i16 = c9217i.f42077c;
            if (i15 == i16) {
                this.f42096g[i13] = f10;
                return;
            }
            if (i15 < i16) {
                i14 = i13;
            }
            i13 = this.f42098i[i13];
            if (i13 == -1) {
                i10 = i14;
                break;
            }
            i11++;
        }
        m38795q(i10, c9217i, f10);
    }

    @Override // p358v.C9210b.a
    /* renamed from: f */
    public int mo38705f() {
        return this.f42099j;
    }

    @Override // p358v.C9210b.a
    /* renamed from: g */
    public boolean mo38706g(C9217i c9217i) {
        return m38794p(c9217i) != -1;
    }

    @Override // p358v.C9210b.a
    /* renamed from: h */
    public float mo38707h(int i10) {
        int i11 = this.f42099j;
        int i12 = this.f42100k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f42096g[i12];
            }
            i12 = this.f42098i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p358v.C9210b.a
    /* renamed from: i */
    public float mo38708i(C9217i c9217i, boolean z10) {
        int m38794p = m38794p(c9217i);
        if (m38794p == -1) {
            return 0.0f;
        }
        m38796r(c9217i);
        float f10 = this.f42096g[m38794p];
        if (this.f42100k == m38794p) {
            this.f42100k = this.f42098i[m38794p];
        }
        this.f42095f[m38794p] = -1;
        int[] iArr = this.f42097h;
        int i10 = iArr[m38794p];
        if (i10 != -1) {
            int[] iArr2 = this.f42098i;
            iArr2[i10] = iArr2[m38794p];
        }
        int i11 = this.f42098i[m38794p];
        if (i11 != -1) {
            iArr[i11] = iArr[m38794p];
        }
        this.f42099j--;
        c9217i.f42087m--;
        if (z10) {
            c9217i.m38785c(this.f42101l);
        }
        return f10;
    }

    @Override // p358v.C9210b.a
    /* renamed from: j */
    public void mo38709j(C9217i c9217i, float f10, boolean z10) {
        float f11 = f42089n;
        if (f10 <= (-f11) || f10 >= f11) {
            int m38794p = m38794p(c9217i);
            if (m38794p == -1) {
                mo38704e(c9217i, f10);
                return;
            }
            float[] fArr = this.f42096g;
            float f12 = fArr[m38794p] + f10;
            fArr[m38794p] = f12;
            float f13 = f42089n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[m38794p] = 0.0f;
            mo38708i(c9217i, z10);
        }
    }

    @Override // p358v.C9210b.a
    /* renamed from: k */
    public void mo38710k(float f10) {
        int i10 = this.f42099j;
        int i11 = this.f42100k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f42096g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f42098i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void m38790l(C9217i c9217i, int i10) {
        int[] iArr;
        int i11 = c9217i.f42077c % this.f42092c;
        int[] iArr2 = this.f42093d;
        int i12 = iArr2[i11];
        int i13 = i12;
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f42094e;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    break;
                } else {
                    i13 = i14;
                }
            }
            iArr[i13] = i10;
        }
        this.f42094e[i10] = -1;
    }

    /* renamed from: m */
    public final void m38791m(int i10, C9217i c9217i, float f10) {
        this.f42095f[i10] = c9217i.f42077c;
        this.f42096g[i10] = f10;
        this.f42097h[i10] = -1;
        this.f42098i[i10] = -1;
        c9217i.m38784a(this.f42101l);
        c9217i.f42087m++;
        this.f42099j++;
    }

    /* renamed from: n */
    public final int m38792n() {
        for (int i10 = 0; i10 < this.f42091b; i10++) {
            if (this.f42095f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final void m38793o() {
        int i10 = this.f42091b * 2;
        this.f42095f = Arrays.copyOf(this.f42095f, i10);
        this.f42096g = Arrays.copyOf(this.f42096g, i10);
        this.f42097h = Arrays.copyOf(this.f42097h, i10);
        this.f42098i = Arrays.copyOf(this.f42098i, i10);
        this.f42094e = Arrays.copyOf(this.f42094e, i10);
        for (int i11 = this.f42091b; i11 < i10; i11++) {
            this.f42095f[i11] = -1;
            this.f42094e[i11] = -1;
        }
        this.f42091b = i10;
    }

    /* renamed from: p */
    public int m38794p(C9217i c9217i) {
        if (this.f42099j == 0) {
            return -1;
        }
        int i10 = c9217i.f42077c;
        int i11 = this.f42093d[i10 % this.f42092c];
        if (i11 == -1) {
            return -1;
        }
        int i12 = i11;
        if (this.f42095f[i11] == i10) {
            return i11;
        }
        do {
            i12 = this.f42094e[i12];
            if (i12 == -1) {
                break;
            }
        } while (this.f42095f[i12] != i10);
        if (i12 != -1 && this.f42095f[i12] == i10) {
            return i12;
        }
        return -1;
    }

    /* renamed from: q */
    public final void m38795q(int i10, C9217i c9217i, float f10) {
        int m38792n = m38792n();
        m38791m(m38792n, c9217i, f10);
        if (i10 != -1) {
            this.f42097h[m38792n] = i10;
            int[] iArr = this.f42098i;
            iArr[m38792n] = iArr[i10];
            iArr[i10] = m38792n;
        } else {
            this.f42097h[m38792n] = -1;
            if (this.f42099j > 0) {
                this.f42098i[m38792n] = this.f42100k;
                this.f42100k = m38792n;
            } else {
                this.f42098i[m38792n] = -1;
            }
        }
        int i11 = this.f42098i[m38792n];
        if (i11 != -1) {
            this.f42097h[i11] = m38792n;
        }
        m38790l(c9217i, m38792n);
    }

    /* renamed from: r */
    public final void m38796r(C9217i c9217i) {
        int[] iArr;
        int i10;
        int i11 = c9217i.f42077c;
        int i12 = i11 % this.f42092c;
        int[] iArr2 = this.f42093d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        int i14 = i13;
        if (this.f42095f[i13] == i11) {
            int[] iArr3 = this.f42094e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f42094e;
            i10 = iArr[i14];
            if (i10 == -1 || this.f42095f[i10] == i11) {
                break;
            } else {
                i14 = i10;
            }
        }
        if (i10 == -1 || this.f42095f[i10] != i11) {
            return;
        }
        iArr[i14] = iArr[i10];
        iArr[i10] = -1;
    }

    public String toString() {
        StringBuilder sb2;
        String str = hashCode() + " { ";
        int i10 = this.f42099j;
        for (int i11 = 0; i11 < i10; i11++) {
            C9217i mo38701b = mo38701b(i11);
            if (mo38701b != null) {
                String str2 = str + mo38701b + " = " + mo38707h(i11) + " ";
                int m38794p = m38794p(mo38701b);
                String str3 = str2 + "[p: ";
                if (this.f42097h[m38794p] != -1) {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(this.f42102m.f42040d[this.f42095f[this.f42097h[m38794p]]]);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append("none");
                }
                String str4 = sb2.toString() + ", n: ";
                str = (this.f42098i[m38794p] != -1 ? str4 + this.f42102m.f42040d[this.f42095f[this.f42098i[m38794p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
