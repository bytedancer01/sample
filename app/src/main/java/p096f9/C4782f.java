package p096f9;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p096f9.C4781e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/f.class
 */
/* renamed from: f9.f */
/* loaded from: combined.jar:classes2.jar:f9/f.class */
public final class C4782f {
    /* renamed from: a */
    public static C4781e m24204a(byte[] bArr, int i10) {
        ArrayList<C4781e.a> arrayList;
        C4361f0 c4361f0 = new C4361f0(bArr);
        try {
            arrayList = m24206c(c4361f0) ? m24209f(c4361f0) : m24208e(c4361f0);
        } catch (ArrayIndexOutOfBoundsException e10) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new C4781e(arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new C4781e(arrayList.get(0), arrayList.get(1), i10);
    }

    /* renamed from: b */
    public static int m24205b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    /* renamed from: c */
    public static boolean m24206c(C4361f0 c4361f0) {
        c4361f0.m21984Q(4);
        int m21998n = c4361f0.m21998n();
        boolean z10 = false;
        c4361f0.m21983P(0);
        if (m21998n == 1886547818) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: d */
    public static C4781e.a m24207d(C4361f0 c4361f0) {
        int m21998n = c4361f0.m21998n();
        if (m21998n > 10000) {
            return null;
        }
        float[] fArr = new float[m21998n];
        for (int i10 = 0; i10 < m21998n; i10++) {
            fArr[i10] = c4361f0.m21997m();
        }
        int m21998n2 = c4361f0.m21998n();
        if (m21998n2 > 32000) {
            return null;
        }
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(m21998n * 2.0d) / log);
        C4359e0 c4359e0 = new C4359e0(c4361f0.m21988d());
        c4359e0.m21958p(c4361f0.m21989e() * 8);
        float[] fArr2 = new float[m21998n2 * 5];
        int[] iArr = new int[5];
        int i11 = 0;
        for (int i12 = 0; i12 < m21998n2; i12++) {
            int i13 = 0;
            while (i13 < 5) {
                int m24205b = iArr[i13] + m24205b(c4359e0.m21950h(ceil));
                if (m24205b >= m21998n || m24205b < 0) {
                    return null;
                }
                fArr2[i11] = fArr[m24205b];
                iArr[i13] = m24205b;
                i13++;
                i11++;
            }
        }
        c4359e0.m21958p((c4359e0.m21947e() + 7) & (-8));
        int m21950h = c4359e0.m21950h(32);
        C4781e.b[] bVarArr = new C4781e.b[m21950h];
        for (int i14 = 0; i14 < m21950h; i14++) {
            int m21950h2 = c4359e0.m21950h(8);
            int m21950h3 = c4359e0.m21950h(8);
            int m21950h4 = c4359e0.m21950h(32);
            if (m21950h4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(m21998n2 * 2.0d) / log);
            float[] fArr3 = new float[m21950h4 * 3];
            float[] fArr4 = new float[m21950h4 * 2];
            int i15 = 0;
            for (int i16 = 0; i16 < m21950h4; i16++) {
                i15 += m24205b(c4359e0.m21950h(ceil2));
                if (i15 < 0 || i15 >= m21998n2) {
                    return null;
                }
                int i17 = i16 * 3;
                int i18 = i15 * 5;
                fArr3[i17] = fArr2[i18];
                fArr3[i17 + 1] = fArr2[i18 + 1];
                fArr3[i17 + 2] = fArr2[i18 + 2];
                int i19 = i16 * 2;
                fArr4[i19] = fArr2[i18 + 3];
                fArr4[i19 + 1] = fArr2[i18 + 4];
            }
            bVarArr[i14] = new C4781e.b(m21950h2, fArr3, fArr4, m21950h3);
        }
        return new C4781e.a(bVarArr);
    }

    /* renamed from: e */
    public static ArrayList<C4781e.a> m24208e(C4361f0 c4361f0) {
        if (c4361f0.m21971D() != 0) {
            return null;
        }
        c4361f0.m21984Q(7);
        int m21998n = c4361f0.m21998n();
        if (m21998n == 1684433976) {
            C4361f0 c4361f02 = new C4361f0();
            Inflater inflater = new Inflater(true);
            try {
                if (!C4401z0.m22406q0(c4361f0, c4361f02, inflater)) {
                    return null;
                }
                c4361f0 = c4361f02;
            } finally {
                inflater.end();
            }
        } else if (m21998n != 1918990112) {
            return null;
        }
        return m24210g(c4361f0);
    }

    /* renamed from: f */
    public static ArrayList<C4781e.a> m24209f(C4361f0 c4361f0) {
        int m21998n;
        c4361f0.m21984Q(8);
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        while (m21989e < m21990f && (m21998n = c4361f0.m21998n() + m21989e) > m21989e && m21998n <= m21990f) {
            int m21998n2 = c4361f0.m21998n();
            if (m21998n2 == 2037673328 || m21998n2 == 1836279920) {
                c4361f0.m21982O(m21998n);
                return m24208e(c4361f0);
            }
            c4361f0.m21983P(m21998n);
            m21989e = m21998n;
        }
        return null;
    }

    /* renamed from: g */
    public static ArrayList<C4781e.a> m24210g(C4361f0 c4361f0) {
        ArrayList<C4781e.a> arrayList = new ArrayList<>();
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        while (m21989e < m21990f) {
            int m21998n = c4361f0.m21998n() + m21989e;
            if (m21998n <= m21989e || m21998n > m21990f) {
                return null;
            }
            if (c4361f0.m21998n() == 1835365224) {
                C4781e.a m24207d = m24207d(c4361f0);
                if (m24207d == null) {
                    return null;
                }
                arrayList.add(m24207d);
            }
            c4361f0.m21983P(m21998n);
            m21989e = m21998n;
        }
        return arrayList;
    }
}
