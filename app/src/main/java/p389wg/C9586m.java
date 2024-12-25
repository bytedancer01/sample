package p389wg;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/m.class
 */
/* renamed from: wg.m */
/* loaded from: combined.jar:classes2.jar:wg/m.class */
public final class C9586m {

    /* renamed from: a */
    public int f43659a;

    /* renamed from: b */
    public int f43660b;

    /* renamed from: c */
    public int f43661c;

    /* renamed from: d */
    public final int[] f43662d = new int[10];

    /* renamed from: a */
    public void m40281a() {
        this.f43661c = 0;
        this.f43660b = 0;
        this.f43659a = 0;
        Arrays.fill(this.f43662d, 0);
    }

    /* renamed from: b */
    public int m40282b(int i10) {
        int i11 = m40287g(i10) ? 2 : 0;
        int i12 = i11;
        if (m40290j(i10)) {
            i12 = i11 | 1;
        }
        return i12;
    }

    /* renamed from: c */
    public int m40283c(int i10) {
        return this.f43662d[i10];
    }

    /* renamed from: d */
    public int m40284d() {
        return (this.f43659a & 2) != 0 ? this.f43662d[1] : -1;
    }

    /* renamed from: e */
    public int m40285e(int i10) {
        if ((this.f43659a & 128) != 0) {
            i10 = this.f43662d[7];
        }
        return i10;
    }

    /* renamed from: f */
    public int m40286f(int i10) {
        if ((this.f43659a & 32) != 0) {
            i10 = this.f43662d[5];
        }
        return i10;
    }

    /* renamed from: g */
    public boolean m40287g(int i10) {
        boolean z10 = true;
        if (((1 << i10) & this.f43661c) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: h */
    public boolean m40288h(int i10) {
        boolean z10 = true;
        if (((1 << i10) & this.f43659a) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: i */
    public void m40289i(C9586m c9586m) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (c9586m.m40288h(i10)) {
                m40291k(i10, c9586m.m40282b(i10), c9586m.m40283c(i10));
            }
        }
    }

    /* renamed from: j */
    public boolean m40290j(int i10) {
        boolean z10 = true;
        if (((1 << i10) & this.f43660b) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: k */
    public C9586m m40291k(int i10, int i11, int i12) {
        int[] iArr = this.f43662d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f43659a |= i13;
        this.f43660b = (i11 & 1) != 0 ? this.f43660b | i13 : this.f43660b & (i13 ^ (-1));
        this.f43661c = (i11 & 2) != 0 ? this.f43661c | i13 : this.f43661c & (i13 ^ (-1));
        iArr[i10] = i12;
        return this;
    }

    /* renamed from: l */
    public int m40292l() {
        return Integer.bitCount(this.f43659a);
    }
}
