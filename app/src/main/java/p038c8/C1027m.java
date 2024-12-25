package p038c8;

import p027b9.C0849j0;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p038c8.InterfaceC1021g;
import p057d7.C4320c;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/m.class
 */
/* renamed from: c8.m */
/* loaded from: combined.jar:classes2.jar:c8/m.class */
public final class C1027m extends AbstractC1020f {

    /* renamed from: j */
    public final InterfaceC1021g f6915j;

    /* renamed from: k */
    public InterfaceC1021g.b f6916k;

    /* renamed from: l */
    public long f6917l;

    /* renamed from: m */
    public volatile boolean f6918m;

    public C1027m(InterfaceC0854m interfaceC0854m, C0858p c0858p, C7629w0 c7629w0, int i10, Object obj, InterfaceC1021g interfaceC1021g) {
        super(interfaceC0854m, c0858p, 2, c7629w0, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f6915j = interfaceC1021g;
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: a */
    public void mo498a() {
        if (this.f6917l == 0) {
            this.f6915j.mo5999b(this.f6916k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C0858p m5380e = this.f6869b.m5380e(this.f6917l);
            C0849j0 c0849j0 = this.f6876i;
            C4320c c4320c = new C4320c(c0849j0, m5380e.f5853g, c0849j0.mo521a(m5380e));
            do {
                try {
                    if (this.f6918m) {
                        break;
                    }
                } finally {
                    this.f6917l = c4320c.getPosition() - this.f6869b.f5853g;
                }
            } while (this.f6915j.mo5998a(c4320c));
        } finally {
            C4401z0.m22401o(this.f6876i);
        }
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: c */
    public void mo500c() {
        this.f6918m = true;
    }

    /* renamed from: g */
    public void m6051g(InterfaceC1021g.b bVar) {
        this.f6916k = bVar;
    }
}
