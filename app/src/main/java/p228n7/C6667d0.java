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
  classes2.jar:n7/d0.class
 */
/* renamed from: n7.d0 */
/* loaded from: combined.jar:classes2.jar:n7/d0.class */
public final class C6667d0 {

    /* renamed from: a */
    public final List<C7629w0> f34732a;

    /* renamed from: b */
    public final InterfaceC4337t[] f34733b;

    public C6667d0(List<C7629w0> list) {
        this.f34732a = list;
        this.f34733b = new InterfaceC4337t[list.size()];
    }

    /* renamed from: a */
    public void m30688a(long j10, C4361f0 c4361f0) {
        C4319b.m21797a(j10, c4361f0, this.f34733b);
    }

    /* renamed from: b */
    public void m30689b(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        for (int i10 = 0; i10 < this.f34733b.length; i10++) {
            dVar.m30755a();
            InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 3);
            C7629w0 c7629w0 = this.f34732a.get(i10);
            String str = c7629w0.f37086m;
            C4349a.m21879b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = c7629w0.f37075b;
            if (str2 == null) {
                str2 = dVar.m30756b();
            }
            mo479e.mo608f(new C7629w0.b().m33208S(str2).m33220e0(str).m33222g0(c7629w0.f37078e).m33211V(c7629w0.f37077d).m33195F(c7629w0.f37072E).m33209T(c7629w0.f37088o).m33194E());
            this.f34733b[i10] = mo479e;
        }
    }
}
