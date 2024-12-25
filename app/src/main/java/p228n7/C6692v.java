package p228n7;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4401z0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/v.class
 */
/* renamed from: n7.v */
/* loaded from: combined.jar:classes2.jar:n7/v.class */
public final class C6692v implements InterfaceC6663b0 {

    /* renamed from: a */
    public C7629w0 f35027a;

    /* renamed from: b */
    public C4389t0 f35028b;

    /* renamed from: c */
    public InterfaceC4337t f35029c;

    public C6692v(String str) {
        this.f35027a = new C7629w0.b().m33220e0(str).m33194E();
    }

    @Override // p228n7.InterfaceC6663b0
    /* renamed from: a */
    public void mo30675a(C4361f0 c4361f0) {
        m30833c();
        long m22243d = this.f35028b.m22243d();
        long m22244e = this.f35028b.m22244e();
        if (m22243d == -9223372036854775807L || m22244e == -9223372036854775807L) {
            return;
        }
        C7629w0 c7629w0 = this.f35027a;
        if (m22244e != c7629w0.f37090q) {
            C7629w0 m33194E = c7629w0.m33157b().m33224i0(m22244e).m33194E();
            this.f35027a = m33194E;
            this.f35029c.mo608f(m33194E);
        }
        int m21985a = c4361f0.m21985a();
        this.f35029c.mo606e(c4361f0, m21985a);
        this.f35029c.mo600b(m22243d, 1, m21985a, 0, null);
    }

    @Override // p228n7.InterfaceC6663b0
    /* renamed from: b */
    public void mo30676b(C4389t0 c4389t0, InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        this.f35028b = c4389t0;
        dVar.m30755a();
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 5);
        this.f35029c = mo479e;
        mo479e.mo608f(this.f35027a);
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    /* renamed from: c */
    public final void m30833c() {
        C4349a.m21886i(this.f35028b);
        C4401z0.m22391j(this.f35029c);
    }
}
