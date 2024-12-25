package p132he;

import java.util.Map;
import p444zd.C10193a;
import td.C8691f;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/h.class
 */
/* renamed from: he.h */
/* loaded from: combined.jar:classes2.jar:he/h.class */
public final class C5066h extends AbstractC5069k {

    /* renamed from: b */
    public static final int[] f29162b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    public static final int[] f29163c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[][] f29164d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    public static final int[][] f29165e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f29166a = -1;

    /* renamed from: h */
    public static int m25321h(int[] iArr) {
        float f10;
        int length = f29165e.length;
        float f11 = 0.38f;
        int i10 = 0;
        int i11 = -1;
        while (i10 < length) {
            float m25328e = AbstractC5069k.m25328e(iArr, f29165e[i10], 0.5f);
            if (m25328e < f11) {
                i11 = i10;
                f10 = m25328e;
            } else {
                f10 = f11;
                if (m25328e == f11) {
                    i11 = -1;
                    f10 = f11;
                }
            }
            i10++;
            f11 = f10;
        }
        if (i11 >= 0) {
            return i11 % 10;
        }
        throw C8695j.m37209a();
    }

    /* renamed from: j */
    public static void m25322j(C10193a c10193a, int i10, int i11, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            AbstractC5069k.m25329f(c10193a, i10, iArr);
            int i12 = 0;
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = i13 * 2;
                iArr2[i13] = iArr[i14];
                iArr3[i13] = iArr[i14 + 1];
            }
            sb2.append((char) (m25321h(iArr2) + 48));
            sb2.append((char) (m25321h(iArr3) + 48));
            int i15 = i10;
            while (true) {
                i10 = i15;
                if (i12 < 10) {
                    i15 += iArr[i12];
                    i12++;
                }
            }
        }
    }

    /* renamed from: l */
    public static int[] m25323l(C10193a c10193a, int i10, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m42664h = c10193a.m42664h();
        boolean z10 = false;
        int i11 = 0;
        int i12 = i10;
        for (int i13 = i10; i13 < m42664h; i13++) {
            if (c10193a.m42660c(i13) != z10) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (AbstractC5069k.m25328e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i12, i13};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z10 = !z10;
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: m */
    public static int m25324m(C10193a c10193a) {
        int m42664h = c10193a.m42664h();
        int m42662e = c10193a.m42662e(0);
        if (m42662e != m42664h) {
            return m42662e;
        }
        throw C8695j.m37209a();
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        int i11;
        boolean z10;
        int[] m25326k = m25326k(c10193a);
        int[] m25325i = m25325i(c10193a);
        StringBuilder sb2 = new StringBuilder(20);
        m25322j(c10193a, m25326k[1], m25325i[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(EnumC8690e.ALLOWED_LENGTHS) : null;
        int[] iArr2 = iArr;
        if (iArr == null) {
            iArr2 = f29162b;
        }
        int length = sb3.length();
        int length2 = iArr2.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = i13;
            if (i12 >= length2) {
                z10 = false;
                break;
            }
            int i14 = iArr2[i12];
            if (length == i14) {
                z10 = true;
                break;
            }
            int i15 = i11;
            if (i14 > i11) {
                i15 = i14;
            }
            i12++;
            i13 = i15;
        }
        boolean z11 = z10;
        if (!z10) {
            z11 = z10;
            if (length > i11) {
                z11 = true;
            }
        }
        if (!z11) {
            throw C8691f.m37197a();
        }
        float f10 = m25326k[1];
        float f11 = i10;
        return new C8699n(sb3, null, new C8701p[]{new C8701p(f10, f11), new C8701p(m25325i[0], f11)}, EnumC8686a.ITF);
    }

    /* renamed from: i */
    public final int[] m25325i(C10193a c10193a) {
        int[] m25323l;
        c10193a.m42666k();
        try {
            int m25324m = m25324m(c10193a);
            try {
                m25323l = m25323l(c10193a, m25324m, f29164d[0]);
            } catch (C8695j e10) {
                m25323l = m25323l(c10193a, m25324m, f29164d[1]);
            }
            m25327n(c10193a, m25323l[0]);
            int i10 = m25323l[0];
            m25323l[0] = c10193a.m42664h() - m25323l[1];
            m25323l[1] = c10193a.m42664h() - i10;
            c10193a.m42666k();
            return m25323l;
        } catch (Throwable th2) {
            c10193a.m42666k();
            throw th2;
        }
    }

    /* renamed from: k */
    public final int[] m25326k(C10193a c10193a) {
        int[] m25323l = m25323l(c10193a, m25324m(c10193a), f29163c);
        int i10 = m25323l[1];
        int i11 = m25323l[0];
        this.f29166a = (i10 - i11) / 4;
        m25327n(c10193a, i11);
        return m25323l;
    }

    /* renamed from: n */
    public final void m25327n(C10193a c10193a, int i10) {
        int min = Math.min(this.f29166a * 10, i10);
        while (true) {
            i10--;
            if (min <= 0 || i10 < 0 || c10193a.m42660c(i10)) {
                break;
            } else {
                min--;
            }
        }
        if (min != 0) {
            throw C8695j.m37209a();
        }
    }
}
