package p101fe;

import ge.C5002c;
import java.util.Map;
import p444zd.C10194b;
import p444zd.C10197e;
import td.C8688c;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;
import td.EnumC8700o;
import td.InterfaceC8697l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fe/a.class
 */
/* renamed from: fe.a */
/* loaded from: combined.jar:classes2.jar:fe/a.class */
public final class C4852a implements InterfaceC8697l {

    /* renamed from: b */
    public static final C8701p[] f28480b = new C8701p[0];

    /* renamed from: a */
    public final C5002c f28481a = new C5002c();

    /* renamed from: c */
    public static C10194b m24666c(C10194b c10194b) {
        int[] m42674g = c10194b.m42674g();
        if (m42674g == null) {
            throw C8695j.m37209a();
        }
        int i10 = m42674g[0];
        int i11 = m42674g[1];
        int i12 = m42674g[2];
        int i13 = m42674g[3];
        C10194b c10194b2 = new C10194b(30, 33);
        for (int i14 = 0; i14 < 33; i14++) {
            int i15 = ((i14 * i13) + (i13 / 2)) / 33;
            for (int i16 = 0; i16 < 30; i16++) {
                if (c10194b.m42672d(((((i16 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30) + i10, i15 + i11)) {
                    c10194b2.m42680m(i16, i14);
                }
            }
        }
        return c10194b2;
    }

    @Override // td.InterfaceC8697l
    /* renamed from: a */
    public C8699n mo6324a(C8688c c8688c, Map<EnumC8690e, ?> map) {
        C10197e m25176b = this.f28481a.m25176b(m24666c(c8688c.m37190a()), map);
        C8699n c8699n = new C8699n(m25176b.m42695h(), m25176b.m42692e(), f28480b, EnumC8686a.MAXICODE);
        String m42689b = m25176b.m42689b();
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
