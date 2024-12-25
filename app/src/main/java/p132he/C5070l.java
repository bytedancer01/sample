package p132he;

import java.util.Map;
import p444zd.C10193a;
import td.C8688c;
import td.C8691f;
import td.C8699n;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/l.class
 */
/* renamed from: he.l */
/* loaded from: combined.jar:classes2.jar:he/l.class */
public final class C5070l extends AbstractC5074p {

    /* renamed from: i */
    public final AbstractC5074p f29171i = new C5063e();

    /* renamed from: s */
    public static C8699n m25332s(C8699n c8699n) {
        String m37216f = c8699n.m37216f();
        if (m37216f.charAt(0) != '0') {
            throw C8691f.m37197a();
        }
        C8699n c8699n2 = new C8699n(m37216f.substring(1), null, c8699n.m37215e(), EnumC8686a.UPC_A);
        if (c8699n.m37214d() != null) {
            c8699n2.m37217g(c8699n.m37214d());
        }
        return c8699n2;
    }

    @Override // p132he.AbstractC5069k, td.InterfaceC8697l
    /* renamed from: a */
    public C8699n mo6324a(C8688c c8688c, Map<EnumC8690e, ?> map) {
        return m25332s(this.f29171i.mo6324a(c8688c, map));
    }

    @Override // p132he.AbstractC5069k, td.InterfaceC8697l
    /* renamed from: b */
    public C8699n mo6325b(C8688c c8688c) {
        return m25332s(this.f29171i.mo6325b(c8688c));
    }

    @Override // p132he.AbstractC5074p, p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        return m25332s(this.f29171i.mo25297c(i10, c10193a, map));
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: l */
    public int mo25316l(C10193a c10193a, int[] iArr, StringBuilder sb2) {
        return this.f29171i.mo25316l(c10193a, iArr, sb2);
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: m */
    public C8699n mo25333m(int i10, C10193a c10193a, int[] iArr, Map<EnumC8690e, ?> map) {
        return m25332s(this.f29171i.mo25333m(i10, c10193a, iArr, map));
    }

    @Override // p132he.AbstractC5074p
    /* renamed from: q */
    public EnumC8686a mo25317q() {
        return EnumC8686a.UPC_A;
    }
}
