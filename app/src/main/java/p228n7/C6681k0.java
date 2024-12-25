package p228n7;

import java.util.List;
import p057d7.C4319b;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/k0.class
 */
/* renamed from: n7.k0 */
/* loaded from: combined.jar:classes2.jar:n7/k0.class */
public final class C6681k0 {

    /* renamed from: a */
    public final List<C7629w0> f34851a;

    /* renamed from: b */
    public final InterfaceC4337t[] f34852b;

    public C6681k0(List<C7629w0> list) {
        this.f34851a = list;
        this.f34852b = new InterfaceC4337t[list.size()];
    }

    /* renamed from: a */
    public void m30770a(long j10, C4361f0 c4361f0) {
        if (c4361f0.m21985a() < 9) {
            return;
        }
        int m21998n = c4361f0.m21998n();
        int m21998n2 = c4361f0.m21998n();
        int m21971D = c4361f0.m21971D();
        if (m21998n == 434 && m21998n2 == 1195456820 && m21971D == 3) {
            C4319b.m21798b(j10, c4361f0, this.f34852b);
        }
    }

    /* renamed from: b */
    public void m30771b(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        for (int i10 = 0; i10 < this.f34852b.length; i10++) {
            dVar.m30755a();
            InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 3);
            C7629w0 c7629w0 = this.f34851a.get(i10);
            String str = c7629w0.f37086m;
            C4349a.m21879b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            mo479e.mo608f(new C7629w0.b().m33208S(dVar.m30756b()).m33220e0(str).m33222g0(c7629w0.f37078e).m33211V(c7629w0.f37077d).m33195F(c7629w0.f37072E).m33209T(c7629w0.f37088o).m33194E());
            this.f34852b[i10] = mo479e;
        }
    }
}
