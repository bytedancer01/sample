package p183k8;

import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p164j8.C5322h;
import p301r6.C7968b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k8/c.class
 */
/* renamed from: k8.c */
/* loaded from: combined.jar:classes2.jar:k8/c.class */
public final class C5530c implements InterfaceC5532e {

    /* renamed from: a */
    public final C5322h f31577a;

    /* renamed from: c */
    public InterfaceC4337t f31579c;

    /* renamed from: d */
    public int f31580d;

    /* renamed from: f */
    public long f31582f;

    /* renamed from: g */
    public long f31583g;

    /* renamed from: b */
    public final C4359e0 f31578b = new C4359e0();

    /* renamed from: e */
    public long f31581e = -9223372036854775807L;

    public C5530c(C5322h c5322h) {
        this.f31577a = c5322h;
    }

    /* renamed from: j */
    public static long m27509j(long j10, long j11, long j12, int i10) {
        return j10 + C4401z0.m22346Q0(j11 - j12, 1000000L, i10);
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: a */
    public void mo27505a(long j10, long j11) {
        this.f31581e = j10;
        this.f31583g = j11;
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: b */
    public void mo27506b(C4361f0 c4361f0, long j10, int i10, boolean z10) {
        int m21971D = c4361f0.m21971D() & 3;
        int m21971D2 = c4361f0.m21971D() & 255;
        long m27509j = m27509j(this.f31583g, j10, this.f31581e, this.f31577a.f30580b);
        if (m21971D == 0) {
            m27510e();
            if (m21971D2 == 1) {
                m27514i(c4361f0, m27509j);
                return;
            } else {
                m27513h(c4361f0, m21971D2, m27509j);
                return;
            }
        }
        if (m21971D == 1 || m21971D == 2) {
            m27510e();
        } else if (m21971D != 3) {
            throw new IllegalArgumentException(String.valueOf(m21971D));
        }
        m27512g(c4361f0, z10, m21971D, m27509j);
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: c */
    public void mo27507c(InterfaceC4325h interfaceC4325h, int i10) {
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(i10, 1);
        this.f31579c = mo479e;
        mo479e.mo608f(this.f31577a.f30581c);
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: d */
    public void mo27508d(long j10, int i10) {
        C4349a.m21884g(this.f31581e == -9223372036854775807L);
        this.f31581e = j10;
    }

    /* renamed from: e */
    public final void m27510e() {
        if (this.f31580d > 0) {
            m27511f();
        }
    }

    /* renamed from: f */
    public final void m27511f() {
        ((InterfaceC4337t) C4401z0.m22391j(this.f31579c)).mo600b(this.f31582f, 1, this.f31580d, 0, null);
        this.f31580d = 0;
    }

    /* renamed from: g */
    public final void m27512g(C4361f0 c4361f0, boolean z10, int i10, long j10) {
        int m21985a = c4361f0.m21985a();
        ((InterfaceC4337t) C4349a.m21882e(this.f31579c)).mo606e(c4361f0, m21985a);
        this.f31580d += m21985a;
        this.f31582f = j10;
        if (z10 && i10 == 3) {
            m27511f();
        }
    }

    /* renamed from: h */
    public final void m27513h(C4361f0 c4361f0, int i10, long j10) {
        this.f31578b.m21956n(c4361f0.m21988d());
        this.f31578b.m21961s(2);
        for (int i11 = 0; i11 < i10; i11++) {
            C7968b.b m34540e = C7968b.m34540e(this.f31578b);
            ((InterfaceC4337t) C4349a.m21882e(this.f31579c)).mo606e(c4361f0, m34540e.f38471e);
            ((InterfaceC4337t) C4401z0.m22391j(this.f31579c)).mo600b(j10, 1, m34540e.f38471e, 0, null);
            j10 += (m34540e.f38472f / m34540e.f38469c) * 1000000;
            this.f31578b.m21961s(m34540e.f38471e);
        }
    }

    /* renamed from: i */
    public final void m27514i(C4361f0 c4361f0, long j10) {
        int m21985a = c4361f0.m21985a();
        ((InterfaceC4337t) C4349a.m21882e(this.f31579c)).mo606e(c4361f0, m21985a);
        ((InterfaceC4337t) C4401z0.m22391j(this.f31579c)).mo600b(j10, 1, m21985a, 0, null);
    }
}
