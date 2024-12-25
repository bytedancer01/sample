package p421y8;

import android.util.Pair;
import java.util.Arrays;
import p009a8.C0083a1;
import p009a8.C0134z0;
import p009a8.InterfaceC0127w;
import p059d9.C4400z;
import p059d9.C4401z0;
import p267p6.AbstractC7574e2;
import p267p6.C7630w1;
import p267p6.C7636y1;
import p267p6.InterfaceC7633x1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/j.class
 */
/* renamed from: y8.j */
/* loaded from: combined.jar:classes2.jar:y8/j.class */
public abstract class AbstractC9886j extends AbstractC9891o {

    /* renamed from: c */
    public a f45450c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/j$a.class
     */
    /* renamed from: y8.j$a */
    /* loaded from: combined.jar:classes2.jar:y8/j$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f45451a;

        /* renamed from: b */
        public final String[] f45452b;

        /* renamed from: c */
        public final int[] f45453c;

        /* renamed from: d */
        public final C0083a1[] f45454d;

        /* renamed from: e */
        public final int[] f45455e;

        /* renamed from: f */
        public final int[][][] f45456f;

        /* renamed from: g */
        public final C0083a1 f45457g;

        public a(String[] strArr, int[] iArr, C0083a1[] c0083a1Arr, int[] iArr2, int[][][] iArr3, C0083a1 c0083a1) {
            this.f45452b = strArr;
            this.f45453c = iArr;
            this.f45454d = c0083a1Arr;
            this.f45456f = iArr3;
            this.f45455e = iArr2;
            this.f45457g = c0083a1;
            this.f45451a = iArr.length;
        }

        /* renamed from: a */
        public int m41706a(int i10, int i11, boolean z10) {
            int i12;
            int i13 = this.f45454d[i10].m323b(i11).f618b;
            int[] iArr = new int[i13];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = i15;
                if (i14 >= i13) {
                    return m41707b(i10, i11, Arrays.copyOf(iArr, i16));
                }
                int m41713h = m41713h(i10, i11, i14);
                if (m41713h != 4) {
                    i12 = i16;
                    if (z10) {
                        i12 = i16;
                        if (m41713h != 3) {
                        }
                    }
                    i14++;
                    i15 = i12;
                }
                iArr[i16] = i14;
                i12 = i16 + 1;
                i14++;
                i15 = i12;
            }
        }

        /* renamed from: b */
        public int m41707b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            int i14 = 16;
            while (i12 < iArr.length) {
                String str2 = this.f45454d[i10].m323b(i11).m663b(iArr[i12]).f37086m;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !C4401z0.m22371c(str, str2);
                }
                i14 = Math.min(i14, C7630w1.m33228c(this.f45456f[i10][i11][i12]));
                i12++;
                i13++;
            }
            int i15 = i14;
            if (z10) {
                i15 = Math.min(i14, this.f45455e[i10]);
            }
            return i15;
        }

        /* renamed from: c */
        public int m41708c() {
            return this.f45451a;
        }

        /* renamed from: d */
        public String m41709d(int i10) {
            return this.f45452b[i10];
        }

        /* renamed from: e */
        public int m41710e(int i10) {
            int[][] iArr = this.f45456f[i10];
            int i11 = 0;
            for (int[] iArr2 : iArr) {
                for (int i12 : iArr2) {
                    int m33229d = C7630w1.m33229d(i12);
                    int i13 = 2;
                    if (m33229d == 0 || m33229d == 1 || m33229d == 2) {
                        i13 = 1;
                    } else if (m33229d != 3) {
                        if (m33229d == 4) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    i11 = Math.max(i11, i13);
                }
            }
            return i11;
        }

        /* renamed from: f */
        public int m41711f(int i10) {
            return this.f45453c[i10];
        }

        /* renamed from: g */
        public C0083a1 m41712g(int i10) {
            return this.f45454d[i10];
        }

        /* renamed from: h */
        public int m41713h(int i10, int i11, int i12) {
            return C7630w1.m33229d(this.f45456f[i10][i11][i12]);
        }

        /* renamed from: i */
        public int m41714i(int i10) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i11 >= this.f45451a) {
                    return i13;
                }
                int i14 = i13;
                if (this.f45453c[i11] == i10) {
                    i14 = Math.max(i13, m41710e(i11));
                }
                i11++;
                i12 = i14;
            }
        }

        /* renamed from: j */
        public C0083a1 m41715j() {
            return this.f45457g;
        }
    }

    /* renamed from: f */
    public static int m41700f(InterfaceC7633x1[] interfaceC7633x1Arr, C0134z0 c0134z0, int[] iArr, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int length = interfaceC7633x1Arr.length;
        int i12 = 0;
        int i13 = 0;
        boolean z12 = true;
        while (true) {
            boolean z13 = z12;
            if (i12 >= interfaceC7633x1Arr.length) {
                return length;
            }
            InterfaceC7633x1 interfaceC7633x1 = interfaceC7633x1Arr[i12];
            int i14 = 0;
            for (int i15 = 0; i15 < c0134z0.f618b; i15++) {
                i14 = Math.max(i14, C7630w1.m33229d(interfaceC7633x1.mo5981a(c0134z0.m663b(i15))));
            }
            boolean z14 = iArr[i12] == 0;
            if (i14 <= i13) {
                i10 = length;
                i11 = i13;
                z11 = z13;
                if (i14 == i13) {
                    i10 = length;
                    i11 = i13;
                    z11 = z13;
                    if (z10) {
                        i10 = length;
                        i11 = i13;
                        z11 = z13;
                        if (!z13) {
                            i10 = length;
                            i11 = i13;
                            z11 = z13;
                            if (!z14) {
                            }
                        }
                    }
                }
                i12++;
                length = i10;
                i13 = i11;
                z12 = z11;
            }
            i10 = i12;
            z11 = z14;
            i11 = i14;
            i12++;
            length = i10;
            i13 = i11;
            z12 = z11;
        }
    }

    /* renamed from: h */
    public static int[] m41701h(InterfaceC7633x1 interfaceC7633x1, C0134z0 c0134z0) {
        int[] iArr = new int[c0134z0.f618b];
        for (int i10 = 0; i10 < c0134z0.f618b; i10++) {
            iArr[i10] = interfaceC7633x1.mo5981a(c0134z0.m663b(i10));
        }
        return iArr;
    }

    /* renamed from: i */
    public static int[] m41702i(InterfaceC7633x1[] interfaceC7633x1Arr) {
        int length = interfaceC7633x1Arr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = interfaceC7633x1Arr[i10].mo12010p();
        }
        return iArr;
    }

    @Override // p421y8.AbstractC9891o
    /* renamed from: d */
    public final void mo41703d(Object obj) {
        this.f45450c = (a) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int[][], int[][][]] */
    @Override // p421y8.AbstractC9891o
    /* renamed from: e */
    public final C9892p mo41704e(InterfaceC7633x1[] interfaceC7633x1Arr, C0083a1 c0083a1, InterfaceC0127w.a aVar, AbstractC7574e2 abstractC7574e2) {
        int[] iArr = new int[interfaceC7633x1Arr.length + 1];
        int length = interfaceC7633x1Arr.length + 1;
        C0134z0[] c0134z0Arr = new C0134z0[length];
        ?? r02 = new int[interfaceC7633x1Arr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = c0083a1.f261b;
            c0134z0Arr[i10] = new C0134z0[i11];
            r02[i10] = new int[i11];
        }
        int[] m41702i = m41702i(interfaceC7633x1Arr);
        for (int i12 = 0; i12 < c0083a1.f261b; i12++) {
            C0134z0 m323b = c0083a1.m323b(i12);
            int m41700f = m41700f(interfaceC7633x1Arr, m323b, iArr, C4400z.m22304l(m323b.m663b(0).f37086m) == 5);
            int[] m41701h = m41700f == interfaceC7633x1Arr.length ? new int[m323b.f618b] : m41701h(interfaceC7633x1Arr[m41700f], m323b);
            int i13 = iArr[m41700f];
            c0134z0Arr[m41700f][i13] = m323b;
            r02[m41700f][i13] = m41701h;
            iArr[m41700f] = i13 + 1;
        }
        C0083a1[] c0083a1Arr = new C0083a1[interfaceC7633x1Arr.length];
        String[] strArr = new String[interfaceC7633x1Arr.length];
        int[] iArr2 = new int[interfaceC7633x1Arr.length];
        for (int i14 = 0; i14 < interfaceC7633x1Arr.length; i14++) {
            int i15 = iArr[i14];
            c0083a1Arr[i14] = new C0083a1((C0134z0[]) C4401z0.m22328H0(c0134z0Arr[i14], i15));
            r02[i14] = (int[][]) C4401z0.m22328H0(r02[i14], i15);
            strArr[i14] = interfaceC7633x1Arr[i14].getName();
            iArr2[i14] = interfaceC7633x1Arr[i14].getTrackType();
        }
        a aVar2 = new a(strArr, iArr2, c0083a1Arr, m41702i, r02, new C0083a1((C0134z0[]) C4401z0.m22328H0(c0134z0Arr[interfaceC7633x1Arr.length], iArr[interfaceC7633x1Arr.length])));
        Pair<C7636y1[], InterfaceC9884h[]> mo41645j = mo41645j(aVar2, r02, m41702i, aVar, abstractC7574e2);
        return new C9892p((C7636y1[]) mo41645j.first, (InterfaceC9884h[]) mo41645j.second, aVar2);
    }

    /* renamed from: g */
    public final a m41705g() {
        return this.f45450c;
    }

    /* renamed from: j */
    public abstract Pair<C7636y1[], InterfaceC9884h[]> mo41645j(a aVar, int[][][] iArr, int[] iArr2, InterfaceC0127w.a aVar2, AbstractC7574e2 abstractC7574e2);
}
