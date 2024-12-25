package p444zd;

import td.AbstractC8687b;
import td.AbstractC8693h;
import td.C8695j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/h.class
 */
/* renamed from: zd.h */
/* loaded from: combined.jar:classes2.jar:zd/h.class */
public class C10200h extends AbstractC8687b {

    /* renamed from: d */
    public static final byte[] f46687d = new byte[0];

    /* renamed from: b */
    public byte[] f46688b;

    /* renamed from: c */
    public final int[] f46689c;

    public C10200h(AbstractC8693h abstractC8693h) {
        super(abstractC8693h);
        this.f46688b = f46687d;
        this.f46689c = new int[32];
    }

    /* renamed from: g */
    public static int m42705g(int[] iArr) {
        int i10;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length) {
            int i15 = iArr[i11];
            int i16 = i12;
            if (i15 > i12) {
                i14 = i11;
                i16 = i15;
            }
            int i17 = i13;
            if (i15 > i13) {
                i17 = i15;
            }
            i11++;
            i12 = i16;
            i13 = i17;
        }
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i20 < length) {
            int i21 = i20 - i14;
            int i22 = iArr[i20] * i21 * i21;
            int i23 = i19;
            if (i22 > i19) {
                i18 = i20;
                i23 = i22;
            }
            i20++;
            i19 = i23;
        }
        if (i14 > i18) {
            i10 = i18;
            i18 = i14;
        } else {
            i10 = i14;
        }
        if (i18 - i10 <= length / 16) {
            throw C8695j.m37209a();
        }
        int i24 = i18 - 1;
        int i25 = i24;
        int i26 = -1;
        while (true) {
            int i27 = i26;
            if (i24 <= i10) {
                return i25 << 3;
            }
            int i28 = i24 - i10;
            int i29 = i28 * i28 * (i18 - i24) * (i13 - iArr[i24]);
            int i30 = i27;
            if (i29 > i27) {
                i25 = i24;
                i30 = i29;
            }
            i24--;
            i26 = i30;
        }
    }

    @Override // td.AbstractC8687b
    /* renamed from: b */
    public C10194b mo37185b() {
        AbstractC8693h m37188e = m37188e();
        int m37205d = m37188e.m37205d();
        int m37204a = m37188e.m37204a();
        C10194b c10194b = new C10194b(m37205d, m37204a);
        m42706h(m37205d);
        int[] iArr = this.f46689c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] mo37200c = m37188e.mo37200c((m37204a * i10) / 5, this.f46688b);
            int i11 = (m37205d << 2) / 5;
            for (int i12 = m37205d / 5; i12 < i11; i12++) {
                int i13 = (mo37200c[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int m42705g = m42705g(iArr);
        byte[] mo37199b = m37188e.mo37199b();
        for (int i14 = 0; i14 < m37204a; i14++) {
            for (int i15 = 0; i15 < m37205d; i15++) {
                if ((mo37199b[(i14 * m37205d) + i15] & 255) < m42705g) {
                    c10194b.m42680m(i15, i14);
                }
            }
        }
        return c10194b;
    }

    @Override // td.AbstractC8687b
    /* renamed from: c */
    public C10193a mo37186c(int i10, C10193a c10193a) {
        AbstractC8693h m37188e = m37188e();
        int m37205d = m37188e.m37205d();
        if (c10193a == null || c10193a.m42664h() < m37205d) {
            c10193a = new C10193a(m37205d);
        } else {
            c10193a.m42658a();
        }
        m42706h(m37205d);
        byte[] mo37200c = m37188e.mo37200c(i10, this.f46688b);
        int[] iArr = this.f46689c;
        for (int i11 = 0; i11 < m37205d; i11++) {
            int i12 = (mo37200c[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int m42705g = m42705g(iArr);
        if (m37205d >= 3) {
            int i13 = 1;
            int i14 = mo37200c[0] & 255;
            int i15 = mo37200c[1] & 255;
            while (true) {
                int i16 = i15;
                if (i13 >= m37205d - 1) {
                    break;
                }
                int i17 = i13 + 1;
                int i18 = mo37200c[i17] & 255;
                if ((((i16 << 2) - i14) - i18) / 2 < m42705g) {
                    c10193a.m42667l(i13);
                }
                i14 = i16;
                i13 = i17;
                i15 = i18;
            }
        } else {
            for (int i19 = 0; i19 < m37205d; i19++) {
                if ((mo37200c[i19] & 255) < m42705g) {
                    c10193a.m42667l(i19);
                }
            }
        }
        return c10193a;
    }

    /* renamed from: h */
    public final void m42706h(int i10) {
        if (this.f46688b.length < i10) {
            this.f46688b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f46689c[i11] = 0;
        }
    }
}
