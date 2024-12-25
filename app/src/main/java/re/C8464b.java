package re;

import java.util.ArrayList;
import java.util.List;
import p444zd.C10194b;
import td.C8695j;
import td.InterfaceC8702q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:re/b.class
 */
/* renamed from: re.b */
/* loaded from: combined.jar:classes2.jar:re/b.class */
public final class C8464b {

    /* renamed from: a */
    public final C10194b f39556a;

    /* renamed from: c */
    public final int f39558c;

    /* renamed from: d */
    public final int f39559d;

    /* renamed from: e */
    public final int f39560e;

    /* renamed from: f */
    public final int f39561f;

    /* renamed from: g */
    public final float f39562g;

    /* renamed from: i */
    public final InterfaceC8702q f39564i;

    /* renamed from: b */
    public final List<C8463a> f39557b = new ArrayList(5);

    /* renamed from: h */
    public final int[] f39563h = new int[3];

    public C8464b(C10194b c10194b, int i10, int i11, int i12, int i13, float f10, InterfaceC8702q interfaceC8702q) {
        this.f39556a = c10194b;
        this.f39558c = i10;
        this.f39559d = i11;
        this.f39560e = i12;
        this.f39561f = i13;
        this.f39562g = f10;
        this.f39564i = interfaceC8702q;
    }

    /* renamed from: a */
    public static float m36355a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: b */
    public final float m36356b(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        C10194b c10194b = this.f39556a;
        int m42675h = c10194b.m42675h();
        int[] iArr = this.f39563h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i18 = i10;
        while (i18 >= 0 && c10194b.m42672d(i11, i18) && (i17 = iArr[1]) <= i12) {
            iArr[1] = i17 + 1;
            i18--;
        }
        if (i18 < 0 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i18 >= 0 && !c10194b.m42672d(i11, i18) && (i16 = iArr[0]) <= i12) {
            iArr[0] = i16 + 1;
            i18--;
        }
        if (iArr[0] > i12) {
            return Float.NaN;
        }
        while (true) {
            i10++;
            if (i10 >= m42675h || !c10194b.m42672d(i11, i10) || (i15 = iArr[1]) > i12) {
                break;
            }
            iArr[1] = i15 + 1;
        }
        if (i10 == m42675h || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i10 < m42675h && !c10194b.m42672d(i11, i10) && (i14 = iArr[2]) <= i12) {
            iArr[2] = i14 + 1;
            i10++;
        }
        int i19 = iArr[2];
        if (i19 <= i12 && Math.abs(((iArr[0] + iArr[1]) + i19) - i13) * 5 < i13 * 2 && m36358d(iArr)) {
            return m36355a(iArr, i10);
        }
        return Float.NaN;
    }

    /* renamed from: c */
    public C8463a m36357c() {
        C8463a m36359e;
        C8463a m36359e2;
        int i10 = this.f39558c;
        int i11 = this.f39561f;
        int i12 = this.f39560e + i10;
        int i13 = this.f39559d;
        int i14 = i11 / 2;
        int[] iArr = new int[3];
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = ((i15 & 1) == 0 ? (i15 + 1) / 2 : -((i15 + 1) / 2)) + i13 + i14;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i17 = i10;
            while (i17 < i12 && !this.f39556a.m42672d(i17, i16)) {
                i17++;
            }
            int i18 = 0;
            for (int i19 = i17; i19 < i12; i19++) {
                if (!this.f39556a.m42672d(i19, i16)) {
                    int i20 = i18;
                    if (i18 == 1) {
                        i20 = i18 + 1;
                    }
                    iArr[i20] = iArr[i20] + 1;
                    i18 = i20;
                } else if (i18 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i18 != 2) {
                    i18++;
                    iArr[i18] = iArr[i18] + 1;
                } else {
                    if (m36358d(iArr) && (m36359e2 = m36359e(iArr, i16, i19)) != null) {
                        return m36359e2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i18 = 1;
                }
            }
            if (m36358d(iArr) && (m36359e = m36359e(iArr, i16, i12)) != null) {
                return m36359e;
            }
        }
        if (this.f39557b.isEmpty()) {
            throw C8695j.m37209a();
        }
        return this.f39557b.get(0);
    }

    /* renamed from: d */
    public final boolean m36358d(int[] iArr) {
        float f10 = this.f39562g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C8463a m36359e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        float m36355a = m36355a(iArr, i11);
        float m36356b = m36356b(i10, (int) m36355a, iArr[1] * 2, i12 + i13 + i14);
        if (Float.isNaN(m36356b)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C8463a c8463a : this.f39557b) {
            if (c8463a.m36353f(f10, m36356b, m36355a)) {
                return c8463a.m36354g(m36356b, m36355a, f10);
            }
        }
        C8463a c8463a2 = new C8463a(m36355a, m36356b, f10);
        this.f39557b.add(c8463a2);
        InterfaceC8702q interfaceC8702q = this.f39564i;
        if (interfaceC8702q == null) {
            return null;
        }
        interfaceC8702q.mo37224a(c8463a2);
        return null;
    }
}
