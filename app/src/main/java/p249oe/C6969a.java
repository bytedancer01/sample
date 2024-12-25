package p249oe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p444zd.C10194b;
import td.C8688c;
import td.C8701p;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oe/a.class
 */
/* renamed from: oe.a */
/* loaded from: combined.jar:classes2.jar:oe/a.class */
public final class C6969a {

    /* renamed from: a */
    public static final int[] f35945a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final int[] f35946b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final int[] f35947c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    public static final int[] f35948d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    public static void m31970a(C8701p[] c8701pArr, C8701p[] c8701pArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            c8701pArr[iArr[i10]] = c8701pArr2[i10];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r7 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r0 = (td.C8701p[]) r0.next();
        r0 = r0[1];
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r7 = (int) java.lang.Math.max(r6, r0.m37223d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r0 = r0[3];
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r6 = java.lang.Math.max(r7, (int) r0.m37223d());
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<td.C8701p[]> m31971b(boolean r4, p444zd.C10194b r5) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p249oe.C6969a.m31971b(boolean, zd.b):java.util.List");
    }

    /* renamed from: c */
    public static C6970b m31972c(C8688c c8688c, Map<EnumC8690e, ?> map, boolean z10) {
        C10194b m37190a = c8688c.m37190a();
        List<C8701p[]> m31971b = m31971b(z10, m37190a);
        C10194b c10194b = m37190a;
        List<C8701p[]> list = m31971b;
        if (m31971b.isEmpty()) {
            c10194b = m37190a.clone();
            c10194b.m42679l();
            list = m31971b(z10, c10194b);
        }
        return new C6970b(c10194b, list);
    }

    /* renamed from: d */
    public static int[] m31973d(C10194b c10194b, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        for (int i13 = 0; c10194b.m42672d(i10, i11) && i10 > 0 && i13 < 3; i13++) {
            i10--;
        }
        int length = iArr.length;
        int i14 = 0;
        boolean z10 = false;
        int i15 = i10;
        int i16 = i10;
        while (i15 < i12) {
            if (c10194b.m42672d(i15, i11) != z10) {
                iArr2[i14] = iArr2[i14] + 1;
            } else {
                if (i14 != length - 1) {
                    i14++;
                } else {
                    if (m31976g(iArr2, iArr) < 0.42f) {
                        return new int[]{i16, i15};
                    }
                    i16 += iArr2[0] + iArr2[1];
                    int i17 = i14 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i14] = 0;
                    i14--;
                }
                iArr2[i14] = 1;
                z10 = !z10;
            }
            i15++;
        }
        if (i14 != length - 1 || m31976g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i16, i15 - 1};
    }

    /* renamed from: e */
    public static C8701p[] m31974e(C10194b c10194b, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        boolean z10;
        C8701p[] c8701pArr = new C8701p[4];
        int[] iArr2 = new int[iArr.length];
        while (true) {
            if (i12 >= i10) {
                i14 = i12;
                z10 = false;
                break;
            }
            int[] m31973d = m31973d(c10194b, i13, i12, i11, iArr, iArr2);
            if (m31973d != null) {
                while (true) {
                    if (i12 <= 0) {
                        break;
                    }
                    i12--;
                    int[] m31973d2 = m31973d(c10194b, i13, i12, i11, iArr, iArr2);
                    if (m31973d2 == null) {
                        i12++;
                        break;
                    }
                    m31973d = m31973d2;
                }
                float f10 = i12;
                c8701pArr[0] = new C8701p(m31973d[0], f10);
                c8701pArr[1] = new C8701p(m31973d[1], f10);
                i14 = i12;
                z10 = true;
            } else {
                i12 += 5;
            }
        }
        int i15 = i14 + 1;
        int i16 = i15;
        if (z10) {
            int[] iArr3 = {(int) c8701pArr[0].m37222c(), (int) c8701pArr[1].m37222c()};
            int i17 = i15;
            int i18 = 0;
            while (i17 < i10) {
                int[] m31973d3 = m31973d(c10194b, iArr3[0], i17, i11, iArr, iArr2);
                if (m31973d3 != null && Math.abs(iArr3[0] - m31973d3[0]) < 5 && Math.abs(iArr3[1] - m31973d3[1]) < 5) {
                    iArr3 = m31973d3;
                    i18 = 0;
                } else {
                    if (i18 > 25) {
                        break;
                    }
                    i18++;
                }
                i17++;
            }
            i16 = i17 - (i18 + 1);
            float f11 = i16;
            c8701pArr[2] = new C8701p(iArr3[0], f11);
            c8701pArr[3] = new C8701p(iArr3[1], f11);
        }
        if (i16 - i14 < 10) {
            Arrays.fill(c8701pArr, (Object) null);
        }
        return c8701pArr;
    }

    /* renamed from: f */
    public static C8701p[] m31975f(C10194b c10194b, int i10, int i11) {
        int m42675h = c10194b.m42675h();
        int m42678k = c10194b.m42678k();
        C8701p[] c8701pArr = new C8701p[8];
        m31970a(c8701pArr, m31974e(c10194b, m42675h, m42678k, i10, i11, f35947c), f35945a);
        C8701p c8701p = c8701pArr[4];
        if (c8701p != null) {
            i11 = (int) c8701p.m37222c();
            i10 = (int) c8701pArr[4].m37223d();
        }
        m31970a(c8701pArr, m31974e(c10194b, m42675h, m42678k, i10, i11, f35948d), f35946b);
        return c8701pArr;
    }

    /* renamed from: g */
    public static float m31976g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f13 = iArr2[i13] * f11;
            float f14 = iArr[i13];
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > 0.8f * f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f10;
    }
}
