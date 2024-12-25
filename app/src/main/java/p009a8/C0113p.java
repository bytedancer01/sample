package p009a8;

import java.io.IOException;
import java.util.List;
import p009a8.InterfaceC0121t;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0832b;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7558a2;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/p.class
 */
/* renamed from: a8.p */
/* loaded from: combined.jar:classes2.jar:a8/p.class */
public final class C0113p implements InterfaceC0121t, InterfaceC0121t.a {

    /* renamed from: b */
    public final InterfaceC0127w.a f464b;

    /* renamed from: c */
    public final long f465c;

    /* renamed from: d */
    public final InterfaceC0832b f466d;

    /* renamed from: e */
    public InterfaceC0127w f467e;

    /* renamed from: f */
    public InterfaceC0121t f468f;

    /* renamed from: g */
    public InterfaceC0121t.a f469g;

    /* renamed from: h */
    public a f470h;

    /* renamed from: i */
    public boolean f471i;

    /* renamed from: j */
    public long f472j = -9223372036854775807L;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/p$a.class
     */
    /* renamed from: a8.p$a */
    /* loaded from: combined.jar:classes2.jar:a8/p$a.class */
    public interface a {
        /* renamed from: a */
        void mo536a(InterfaceC0127w.a aVar, IOException iOException);

        /* renamed from: b */
        void mo537b(InterfaceC0127w.a aVar);
    }

    public C0113p(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        this.f464b = aVar;
        this.f466d = interfaceC0832b;
        this.f465c = j10;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        InterfaceC0121t interfaceC0121t = this.f468f;
        return interfaceC0121t != null && interfaceC0121t.mo335b();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: c */
    public long mo336c() {
        return ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo336c();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        InterfaceC0121t interfaceC0121t = this.f468f;
        return interfaceC0121t != null && interfaceC0121t.mo337d(j10);
    }

    /* renamed from: e */
    public void m527e(InterfaceC0127w.a aVar) {
        long m530r = m530r(this.f465c);
        InterfaceC0121t mo401h = ((InterfaceC0127w) C4349a.m21882e(this.f467e)).mo401h(aVar, this.f466d, m530r);
        this.f468f = mo401h;
        if (this.f469g != null) {
            mo401h.mo345l(this, m530r);
        }
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: f */
    public long mo339f(long j10, C7558a2 c7558a2) {
        return ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo339f(j10, c7558a2);
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: g */
    public long mo340g() {
        return ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo340g();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: h */
    public void mo341h(long j10) {
        ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo341h(j10);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: i */
    public /* synthetic */ List mo342i(List list) {
        return C0119s.m628a(this, list);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: j */
    public long mo343j(long j10) {
        return ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo343j(j10);
    }

    @Override // p009a8.InterfaceC0121t.a
    /* renamed from: k */
    public void mo344k(InterfaceC0121t interfaceC0121t) {
        ((InterfaceC0121t.a) C4401z0.m22391j(this.f469g)).mo344k(this);
        a aVar = this.f470h;
        if (aVar != null) {
            aVar.mo537b(this.f464b);
        }
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: l */
    public void mo345l(InterfaceC0121t.a aVar, long j10) {
        this.f469g = aVar;
        InterfaceC0121t interfaceC0121t = this.f468f;
        if (interfaceC0121t != null) {
            interfaceC0121t.mo345l(this, m530r(this.f465c));
        }
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: m */
    public long mo346m(InterfaceC9884h[] interfaceC9884hArr, boolean[] zArr, InterfaceC0120s0[] interfaceC0120s0Arr, boolean[] zArr2, long j10) {
        long j11 = this.f472j;
        if (j11 != -9223372036854775807L && j10 == this.f465c) {
            this.f472j = -9223372036854775807L;
            j10 = j11;
        }
        return ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo346m(interfaceC9884hArr, zArr, interfaceC0120s0Arr, zArr2, j10);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: n */
    public long mo347n() {
        return ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo347n();
    }

    /* renamed from: o */
    public long m528o() {
        return this.f472j;
    }

    /* renamed from: q */
    public long m529q() {
        return this.f465c;
    }

    /* renamed from: r */
    public final long m530r(long j10) {
        long j11 = this.f472j;
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        return j10;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: s */
    public void mo350s() {
        try {
            InterfaceC0121t interfaceC0121t = this.f468f;
            if (interfaceC0121t != null) {
                interfaceC0121t.mo350s();
            } else {
                InterfaceC0127w interfaceC0127w = this.f467e;
                if (interfaceC0127w != null) {
                    interfaceC0127w.mo402m();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f470h;
            if (aVar == null) {
                throw e10;
            }
            if (this.f471i) {
                return;
            }
            this.f471i = true;
            aVar.mo536a(this.f464b, e10);
        }
    }

    @Override // p009a8.InterfaceC0122t0.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo334a(InterfaceC0121t interfaceC0121t) {
        ((InterfaceC0121t.a) C4401z0.m22391j(this.f469g)).mo334a(this);
    }

    /* renamed from: u */
    public void m532u(long j10) {
        this.f472j = j10;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: v */
    public C0083a1 mo352v() {
        return ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo352v();
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: w */
    public void mo353w(long j10, boolean z10) {
        ((InterfaceC0121t) C4401z0.m22391j(this.f468f)).mo353w(j10, z10);
    }

    /* renamed from: x */
    public void m533x() {
        if (this.f468f != null) {
            ((InterfaceC0127w) C4349a.m21882e(this.f467e)).mo403q(this.f468f);
        }
    }

    /* renamed from: y */
    public void m534y(InterfaceC0127w interfaceC0127w) {
        C4349a.m21884g(this.f467e == null);
        this.f467e = interfaceC0127w;
    }

    /* renamed from: z */
    public void m535z(a aVar) {
        this.f470h = aVar;
    }
}
