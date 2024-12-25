package p041ce;

import de.C4450d;
import ee.C4717a;
import java.util.List;
import java.util.Map;
import p444zd.C10194b;
import p444zd.C10197e;
import p444zd.C10199g;
import td.C8688c;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;
import td.EnumC8700o;
import td.InterfaceC8697l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ce/a.class
 */
/* renamed from: ce.a */
/* loaded from: combined.jar:classes2.jar:ce/a.class */
public final class C1076a implements InterfaceC8697l {

    /* renamed from: b */
    public static final C8701p[] f7110b = new C8701p[0];

    /* renamed from: a */
    public final C4450d f7111a = new C4450d();

    /* renamed from: c */
    public static C10194b m6322c(C10194b c10194b) {
        int[] m42677j = c10194b.m42677j();
        int[] m42673e = c10194b.m42673e();
        if (m42677j == null || m42673e == null) {
            throw C8695j.m37209a();
        }
        int m6323d = m6323d(m42677j, c10194b);
        int i10 = m42677j[1];
        int i11 = m42673e[1];
        int i12 = m42677j[0];
        int i13 = ((m42673e[0] - i12) + 1) / m6323d;
        int i14 = ((i11 - i10) + 1) / m6323d;
        if (i13 <= 0 || i14 <= 0) {
            throw C8695j.m37209a();
        }
        int i15 = m6323d / 2;
        C10194b c10194b2 = new C10194b(i13, i14);
        for (int i16 = 0; i16 < i14; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                if (c10194b.m42672d((i17 * m6323d) + i12 + i15, (i16 * m6323d) + i10 + i15)) {
                    c10194b2.m42680m(i17, i16);
                }
            }
        }
        return c10194b2;
    }

    /* renamed from: d */
    public static int m6323d(int[] iArr, C10194b c10194b) {
        int m42678k = c10194b.m42678k();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < m42678k && c10194b.m42672d(i10, i11)) {
            i10++;
        }
        if (i10 == m42678k) {
            throw C8695j.m37209a();
        }
        int i12 = i10 - iArr[0];
        if (i12 != 0) {
            return i12;
        }
        throw C8695j.m37209a();
    }

    @Override // td.InterfaceC8697l
    /* renamed from: a */
    public C8699n mo6324a(C8688c c8688c, Map<EnumC8690e, ?> map) {
        C10197e m22587b;
        C8701p[] m42704b;
        if (map == null || !map.containsKey(EnumC8690e.PURE_BARCODE)) {
            C10199g m23735b = new C4717a(c8688c.m37190a()).m23735b();
            m22587b = this.f7111a.m22587b(m23735b.m42703a());
            m42704b = m23735b.m42704b();
        } else {
            m22587b = this.f7111a.m22587b(m6322c(c8688c.m37190a()));
            m42704b = f7110b;
        }
        C8699n c8699n = new C8699n(m22587b.m42695h(), m22587b.m42692e(), m42704b, EnumC8686a.DATA_MATRIX);
        List<byte[]> m42688a = m22587b.m42688a();
        if (m42688a != null) {
            c8699n.m37218h(EnumC8700o.BYTE_SEGMENTS, m42688a);
        }
        String m42689b = m22587b.m42689b();
        if (m42689b != null) {
            c8699n.m37218h(EnumC8700o.ERROR_CORRECTION_LEVEL, m42689b);
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
