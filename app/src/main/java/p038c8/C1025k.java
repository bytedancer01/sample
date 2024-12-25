package p038c8;

import p027b9.C0849j0;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p038c8.InterfaceC1021g;
import p057d7.C4320c;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/k.class
 */
/* renamed from: c8.k */
/* loaded from: combined.jar:classes2.jar:c8/k.class */
public class C1025k extends AbstractC1015a {

    /* renamed from: o */
    public final int f6907o;

    /* renamed from: p */
    public final long f6908p;

    /* renamed from: q */
    public final InterfaceC1021g f6909q;

    /* renamed from: r */
    public long f6910r;

    /* renamed from: s */
    public volatile boolean f6911s;

    /* renamed from: t */
    public boolean f6912t;

    public C1025k(InterfaceC0854m interfaceC0854m, C0858p c0858p, C7629w0 c7629w0, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, InterfaceC1021g interfaceC1021g) {
        super(interfaceC0854m, c0858p, c7629w0, i10, obj, j10, j11, j12, j13, j14);
        this.f6907o = i11;
        this.f6908p = j15;
        this.f6909q = interfaceC1021g;
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: a */
    public final void mo498a() {
        if (this.f6910r == 0) {
            C1017c m5986j = m5986j();
            m5986j.m5993b(this.f6908p);
            InterfaceC1021g interfaceC1021g = this.f6909q;
            InterfaceC1021g.b m6047l = m6047l(m5986j);
            long j10 = this.f6841k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f6908p;
            long j12 = this.f6842l;
            interfaceC1021g.mo5999b(m6047l, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f6908p);
        }
        try {
            C0858p m5380e = this.f6869b.m5380e(this.f6910r);
            C0849j0 c0849j0 = this.f6876i;
            C4320c c4320c = new C4320c(c0849j0, m5380e.f5853g, c0849j0.mo521a(m5380e));
            while (!this.f6911s && this.f6909q.mo5998a(c4320c)) {
                try {
                } finally {
                    this.f6910r = c4320c.getPosition() - this.f6869b.f5853g;
                }
            }
            C4401z0.m22401o(this.f6876i);
            this.f6912t = !this.f6911s;
        } catch (Throwable th2) {
            C4401z0.m22401o(this.f6876i);
            throw th2;
        }
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: c */
    public final void mo500c() {
        this.f6911s = true;
    }

    @Override // p038c8.AbstractC1028n
    /* renamed from: g */
    public long mo6045g() {
        return this.f6919j + this.f6907o;
    }

    @Override // p038c8.AbstractC1028n
    /* renamed from: h */
    public boolean mo6046h() {
        return this.f6912t;
    }

    /* renamed from: l */
    public InterfaceC1021g.b m6047l(C1017c c1017c) {
        return c1017c;
    }
}
