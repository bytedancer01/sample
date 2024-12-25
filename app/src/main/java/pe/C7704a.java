package pe;

import java.util.List;
import java.util.Map;
import p289qe.C7914e;
import p289qe.C7918i;
import p444zd.C10194b;
import p444zd.C10197e;
import p444zd.C10199g;
import re.C8465c;
import td.C8688c;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;
import td.EnumC8700o;
import td.InterfaceC8697l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pe/a.class
 */
/* renamed from: pe.a */
/* loaded from: combined.jar:classes2.jar:pe/a.class */
public class C7704a implements InterfaceC8697l {

    /* renamed from: b */
    public static final C8701p[] f37451b = new C8701p[0];

    /* renamed from: a */
    public final C7914e f37452a = new C7914e();

    /* renamed from: c */
    public static C10194b m33649c(C10194b c10194b) {
        int[] m42677j = c10194b.m42677j();
        int[] m42673e = c10194b.m42673e();
        if (m42677j == null || m42673e == null) {
            throw C8695j.m37209a();
        }
        float m33650d = m33650d(m42677j, c10194b);
        int i10 = m42677j[1];
        int i11 = m42673e[1];
        int i12 = m42677j[0];
        int i13 = m42673e[0];
        if (i12 >= i13 || i10 >= i11) {
            throw C8695j.m37209a();
        }
        int i14 = i11 - i10;
        int i15 = i13;
        if (i14 != i13 - i12) {
            i15 = i12 + i14;
            if (i15 >= c10194b.m42678k()) {
                throw C8695j.m37209a();
            }
        }
        int round = Math.round(((i15 - i12) + 1) / m33650d);
        int round2 = Math.round((i14 + 1) / m33650d);
        if (round <= 0 || round2 <= 0) {
            throw C8695j.m37209a();
        }
        if (round2 != round) {
            throw C8695j.m37209a();
        }
        int i16 = (int) (m33650d / 2.0f);
        int i17 = i10 + i16;
        int i18 = i12 + i16;
        int i19 = (((int) ((round - 1) * m33650d)) + i18) - i15;
        int i20 = i18;
        if (i19 > 0) {
            if (i19 > i16) {
                throw C8695j.m37209a();
            }
            i20 = i18 - i19;
        }
        int i21 = (((int) ((round2 - 1) * m33650d)) + i17) - i11;
        int i22 = i17;
        if (i21 > 0) {
            if (i21 > i16) {
                throw C8695j.m37209a();
            }
            i22 = i17 - i21;
        }
        C10194b c10194b2 = new C10194b(round, round2);
        for (int i23 = 0; i23 < round2; i23++) {
            int i24 = (int) (i23 * m33650d);
            for (int i25 = 0; i25 < round; i25++) {
                if (c10194b.m42672d(((int) (i25 * m33650d)) + i20, i24 + i22)) {
                    c10194b2.m42680m(i25, i23);
                }
            }
        }
        return c10194b2;
    }

    /* renamed from: d */
    public static float m33650d(int[] iArr, C10194b c10194b) {
        int m42675h = c10194b.m42675h();
        int m42678k = c10194b.m42678k();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i10 >= m42678k || i11 >= m42675h) {
                break;
            }
            boolean z11 = z10;
            int i14 = i13;
            if (z10 != c10194b.m42672d(i10, i11)) {
                i14 = i13 + 1;
                if (i14 == 5) {
                    break;
                }
                z11 = !z10;
            }
            i10++;
            i11++;
            z10 = z11;
            i12 = i14;
        }
        if (i10 == m42678k || i11 == m42675h) {
            throw C8695j.m37209a();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    @Override // td.InterfaceC8697l
    /* renamed from: a */
    public final C8699n mo6324a(C8688c c8688c, Map<EnumC8690e, ?> map) {
        C10197e m34280c;
        C8701p[] m42704b;
        if (map == null || !map.containsKey(EnumC8690e.PURE_BARCODE)) {
            C10199g m36365e = new C8465c(c8688c.m37190a()).m36365e(map);
            m34280c = this.f37452a.m34280c(m36365e.m42703a(), map);
            m42704b = m36365e.m42704b();
        } else {
            m34280c = this.f37452a.m34280c(m33649c(c8688c.m37190a()), map);
            m42704b = f37451b;
        }
        if (m34280c.m42691d() instanceof C7918i) {
            ((C7918i) m34280c.m42691d()).m34286a(m42704b);
        }
        C8699n c8699n = new C8699n(m34280c.m42695h(), m34280c.m42692e(), m42704b, EnumC8686a.QR_CODE);
        List<byte[]> m42688a = m34280c.m42688a();
        if (m42688a != null) {
            c8699n.m37218h(EnumC8700o.BYTE_SEGMENTS, m42688a);
        }
        String m42689b = m34280c.m42689b();
        if (m42689b != null) {
            c8699n.m37218h(EnumC8700o.ERROR_CORRECTION_LEVEL, m42689b);
        }
        if (m34280c.m42696i()) {
            c8699n.m37218h(EnumC8700o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(m34280c.m42694g()));
            c8699n.m37218h(EnumC8700o.STRUCTURED_APPEND_PARITY, Integer.valueOf(m34280c.m42693f()));
        }
        return c8699n;
    }

    @Override // td.InterfaceC8697l
    /* renamed from: b */
    public C8699n mo6325b(C8688c c8688c) {
        return mo6324a(c8688c, null);
    }

    @Override // td.InterfaceC8697l
    public void reset() {
    }
}
