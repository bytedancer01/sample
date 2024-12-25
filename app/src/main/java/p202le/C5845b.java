package p202le;

import java.util.ArrayList;
import java.util.Map;
import me.C6582j;
import p249oe.C6969a;
import p249oe.C6970b;
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
  classes2.jar:le/b.class
 */
/* renamed from: le.b */
/* loaded from: combined.jar:classes2.jar:le/b.class */
public final class C5845b implements InterfaceC8697l {

    /* renamed from: a */
    public static final C8699n[] f32459a = new C8699n[0];

    /* renamed from: c */
    public static C8699n[] m28431c(C8688c c8688c, Map<EnumC8690e, ?> map, boolean z10) {
        ArrayList arrayList = new ArrayList();
        C6970b m31972c = C6969a.m31972c(c8688c, map, z10);
        for (C8701p[] c8701pArr : m31972c.m31978b()) {
            C10197e m30417i = C6582j.m30417i(m31972c.m31977a(), c8701pArr[4], c8701pArr[5], c8701pArr[6], c8701pArr[7], m28434f(c8701pArr), m28432d(c8701pArr));
            C8699n c8699n = new C8699n(m30417i.m42695h(), m30417i.m42692e(), c8701pArr, EnumC8686a.PDF_417);
            c8699n.m37218h(EnumC8700o.ERROR_CORRECTION_LEVEL, m30417i.m42689b());
            C5846c c5846c = (C5846c) m30417i.m42691d();
            if (c5846c != null) {
                c8699n.m37218h(EnumC8700o.PDF417_EXTRA_METADATA, c5846c);
            }
            arrayList.add(c8699n);
        }
        return (C8699n[]) arrayList.toArray(f32459a);
    }

    /* renamed from: d */
    public static int m28432d(C8701p[] c8701pArr) {
        return Math.max(Math.max(m28433e(c8701pArr[0], c8701pArr[4]), (m28433e(c8701pArr[6], c8701pArr[2]) * 17) / 18), Math.max(m28433e(c8701pArr[1], c8701pArr[5]), (m28433e(c8701pArr[7], c8701pArr[3]) * 17) / 18));
    }

    /* renamed from: e */
    public static int m28433e(C8701p c8701p, C8701p c8701p2) {
        if (c8701p == null || c8701p2 == null) {
            return 0;
        }
        return (int) Math.abs(c8701p.m37222c() - c8701p2.m37222c());
    }

    /* renamed from: f */
    public static int m28434f(C8701p[] c8701pArr) {
        return Math.min(Math.min(m28435g(c8701pArr[0], c8701pArr[4]), (m28435g(c8701pArr[6], c8701pArr[2]) * 17) / 18), Math.min(m28435g(c8701pArr[1], c8701pArr[5]), (m28435g(c8701pArr[7], c8701pArr[3]) * 17) / 18));
    }

    /* renamed from: g */
    public static int m28435g(C8701p c8701p, C8701p c8701p2) {
        if (c8701p == null || c8701p2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(c8701p.m37222c() - c8701p2.m37222c());
    }

    @Override // td.InterfaceC8697l
    /* renamed from: a */
    public C8699n mo6324a(C8688c c8688c, Map<EnumC8690e, ?> map) {
        C8699n c8699n;
        C8699n[] m28431c = m28431c(c8688c, map, false);
        if (m28431c.length == 0 || (c8699n = m28431c[0]) == null) {
            throw C8695j.m37209a();
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
