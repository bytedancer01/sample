package p132he;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p444zd.C10193a;
import td.AbstractC8698m;
import td.C8688c;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8690e;
import td.EnumC8700o;
import td.InterfaceC8697l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/k.class
 */
/* renamed from: he.k */
/* loaded from: combined.jar:classes2.jar:he/k.class */
public abstract class AbstractC5069k implements InterfaceC8697l {
    /* renamed from: e */
    public static float m25328e(int[] iArr, int[] iArr2, float f10) {
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
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = iArr2[i13] * f12;
            float f15 = iArr[i13];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f10 * f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f11;
    }

    /* renamed from: f */
    public static void m25329f(C10193a c10193a, int i10, int[] iArr) {
        int i11;
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int m42664h = c10193a.m42664h();
        if (i10 >= m42664h) {
            throw C8695j.m37209a();
        }
        boolean z10 = !c10193a.m42660c(i10);
        int i12 = i10;
        int i13 = 0;
        while (true) {
            i11 = i13;
            if (i12 >= m42664h) {
                break;
            }
            if (c10193a.m42660c(i12) == z10) {
                i13++;
                i11 = i13;
                if (i13 == length) {
                    break;
                }
                iArr[i13] = 1;
                z10 = !z10;
            } else {
                iArr[i13] = iArr[i13] + 1;
            }
            i12++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i12 != m42664h) {
                throw C8695j.m37209a();
            }
        }
    }

    /* renamed from: g */
    public static void m25330g(C10193a c10193a, int i10, int[] iArr) {
        int length = iArr.length;
        boolean m42660c = c10193a.m42660c(i10);
        while (i10 > 0 && length >= 0) {
            int i11 = i10 - 1;
            i10 = i11;
            if (c10193a.m42660c(i11) != m42660c) {
                length--;
                m42660c = !m42660c;
                i10 = i11;
            }
        }
        if (length >= 0) {
            throw C8695j.m37209a();
        }
        m25329f(c10193a, i10 + 1, iArr);
    }

    @Override // td.InterfaceC8697l
    /* renamed from: a */
    public C8699n mo6324a(C8688c c8688c, Map<EnumC8690e, ?> map) {
        try {
            return m25331d(c8688c, map);
        } catch (C8695j e10) {
            if (!(map != null && map.containsKey(EnumC8690e.TRY_HARDER)) || !c8688c.m37194e()) {
                throw e10;
            }
            C8688c m37195f = c8688c.m37195f();
            C8699n m25331d = m25331d(m37195f, map);
            Map<EnumC8700o, Object> m37214d = m25331d.m37214d();
            int i10 = 270;
            if (m37214d != null) {
                EnumC8700o enumC8700o = EnumC8700o.ORIENTATION;
                i10 = 270;
                if (m37214d.containsKey(enumC8700o)) {
                    i10 = (((Integer) m37214d.get(enumC8700o)).intValue() + 270) % 360;
                }
            }
            m25331d.m37218h(EnumC8700o.ORIENTATION, Integer.valueOf(i10));
            C8701p[] m37215e = m25331d.m37215e();
            if (m37215e != null) {
                int m37192c = m37195f.m37192c();
                for (int i11 = 0; i11 < m37215e.length; i11++) {
                    m37215e[i11] = new C8701p((m37192c - m37215e[i11].m37223d()) - 1.0f, m37215e[i11].m37222c());
                }
            }
            return m25331d;
        }
    }

    @Override // td.InterfaceC8697l
    /* renamed from: b */
    public C8699n mo6325b(C8688c c8688c) {
        return mo6324a(c8688c, null);
    }

    /* renamed from: c */
    public abstract C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map);

    /* renamed from: d */
    public final C8699n m25331d(C8688c c8688c, Map<EnumC8690e, ?> map) {
        int m37193d = c8688c.m37193d();
        int m37192c = c8688c.m37192c();
        C10193a c10193a = new C10193a(m37193d);
        boolean z10 = map != null && map.containsKey(EnumC8690e.TRY_HARDER);
        int max = Math.max(1, m37192c >> (z10 ? 8 : 5));
        int i10 = z10 ? m37192c : 15;
        int i11 = m37192c / 2;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = i12 + 1;
            int i14 = i13 / 2;
            int i15 = (((i12 & 1) == 0 ? i14 : -i14) * max) + i11;
            if (i15 < 0 || i15 >= m37192c) {
                break;
            }
            try {
                C10193a m37191b = c8688c.m37191b(i15, c10193a);
                for (int i16 = 0; i16 < 2; i16++) {
                    if (i16 == 1) {
                        m37191b.m42666k();
                        if (map != null) {
                            EnumC8690e enumC8690e = EnumC8690e.NEED_RESULT_POINT_CALLBACK;
                            if (map.containsKey(enumC8690e)) {
                                EnumMap enumMap = new EnumMap(EnumC8690e.class);
                                enumMap.putAll(map);
                                enumMap.remove(enumC8690e);
                                map = enumMap;
                            }
                        }
                    }
                    try {
                        C8699n mo25297c = mo25297c(i15, m37191b, map);
                        if (i16 == 1) {
                            mo25297c.m37218h(EnumC8700o.ORIENTATION, 180);
                            C8701p[] m37215e = mo25297c.m37215e();
                            if (m37215e != null) {
                                float f10 = m37193d;
                                try {
                                    try {
                                        m37215e[0] = new C8701p((f10 - m37215e[0].m37222c()) - 1.0f, m37215e[0].m37223d());
                                    } catch (AbstractC8698m e10) {
                                    }
                                } catch (AbstractC8698m e11) {
                                }
                                try {
                                    m37215e[1] = new C8701p((f10 - m37215e[1].m37222c()) - 1.0f, m37215e[1].m37223d());
                                } catch (AbstractC8698m e12) {
                                }
                            }
                        }
                        return mo25297c;
                    } catch (AbstractC8698m e13) {
                    }
                }
                c10193a = m37191b;
            } catch (C8695j e14) {
            }
            i12 = i13;
        }
        throw C8695j.m37209a();
    }

    @Override // td.InterfaceC8697l
    public void reset() {
    }
}
