package p038c8;

import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p057d7.C4320c;
import p057d7.InterfaceC4337t;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/p.class
 */
/* renamed from: c8.p */
/* loaded from: combined.jar:classes2.jar:c8/p.class */
public final class C1030p extends AbstractC1015a {

    /* renamed from: o */
    public final int f6921o;

    /* renamed from: p */
    public final C7629w0 f6922p;

    /* renamed from: q */
    public long f6923q;

    /* renamed from: r */
    public boolean f6924r;

    public C1030p(InterfaceC0854m interfaceC0854m, C0858p c0858p, C7629w0 c7629w0, int i10, Object obj, long j10, long j11, long j12, int i11, C7629w0 c7629w02) {
        super(interfaceC0854m, c0858p, c7629w0, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f6921o = i11;
        this.f6922p = c7629w02;
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: a */
    public void mo498a() {
        C1017c m5986j = m5986j();
        m5986j.m5993b(0L);
        InterfaceC4337t mo5994e = m5986j.mo5994e(0, this.f6921o);
        mo5994e.mo608f(this.f6922p);
        try {
            long mo521a = this.f6876i.mo521a(this.f6869b.m5380e(this.f6923q));
            long j10 = mo521a;
            if (mo521a != -1) {
                j10 = mo521a + this.f6923q;
            }
            C4320c c4320c = new C4320c(this.f6876i, this.f6923q, j10);
            for (int i10 = 0; i10 != -1; i10 = mo5994e.mo604d(c4320c, Integer.MAX_VALUE, true)) {
                this.f6923q += i10;
            }
            mo5994e.mo600b(this.f6874g, 1, (int) this.f6923q, 0, null);
            C4401z0.m22401o(this.f6876i);
            this.f6924r = true;
        } catch (Throwable th2) {
            C4401z0.m22401o(this.f6876i);
            throw th2;
        }
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: c */
    public void mo500c() {
    }

    @Override // p038c8.AbstractC1028n
    /* renamed from: h */
    public boolean mo6046h() {
        return this.f6924r;
    }
}
