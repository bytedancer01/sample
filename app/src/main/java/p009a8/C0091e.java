package p009a8;

import java.io.IOException;
import java.util.ArrayList;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0853l0;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7583h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/e.class
 */
/* renamed from: a8.e */
/* loaded from: combined.jar:classes2.jar:a8/e.class */
public final class C0091e extends AbstractC0095g<Void> {

    /* renamed from: k */
    public final InterfaceC0127w f291k;

    /* renamed from: l */
    public final long f292l;

    /* renamed from: m */
    public final long f293m;

    /* renamed from: n */
    public final boolean f294n;

    /* renamed from: o */
    public final boolean f295o;

    /* renamed from: p */
    public final boolean f296p;

    /* renamed from: q */
    public final ArrayList<C0089d> f297q;

    /* renamed from: r */
    public final AbstractC7574e2.c f298r;

    /* renamed from: s */
    public a f299s;

    /* renamed from: t */
    public b f300t;

    /* renamed from: u */
    public long f301u;

    /* renamed from: v */
    public long f302v;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/e$a.class
     */
    /* renamed from: a8.e$a */
    /* loaded from: combined.jar:classes2.jar:a8/e$a.class */
    public static final class a extends AbstractC0107m {

        /* renamed from: d */
        public final long f303d;

        /* renamed from: e */
        public final long f304e;

        /* renamed from: f */
        public final long f305f;

        /* renamed from: g */
        public final boolean f306g;

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
        
            if (r9 == r0) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(p267p6.AbstractC7574e2 r6, long r7, long r9) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p009a8.C0091e.a.<init>(p6.e2, long, long):void");
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: g */
        public AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
            this.f427c.mo404g(0, bVar, z10);
            long m32683o = bVar.m32683o() - this.f303d;
            long j10 = this.f305f;
            return bVar.m32687s(bVar.f36709a, bVar.f36710b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - m32683o, m32683o);
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: o */
        public AbstractC7574e2.c mo405o(int i10, AbstractC7574e2.c cVar, long j10) {
            this.f427c.mo405o(0, cVar, 0L);
            long j11 = cVar.f36736q;
            long j12 = this.f303d;
            cVar.f36736q = j11 + j12;
            cVar.f36733n = this.f305f;
            cVar.f36728i = this.f306g;
            long j13 = cVar.f36732m;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.f36732m = max;
                long j14 = this.f304e;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.f36732m = max - this.f303d;
            }
            long m32761e = C7583h.m32761e(this.f303d);
            long j15 = cVar.f36724e;
            if (j15 != -9223372036854775807L) {
                cVar.f36724e = j15 + m32761e;
            }
            long j16 = cVar.f36725f;
            if (j16 != -9223372036854775807L) {
                cVar.f36725f = j16 + m32761e;
            }
            return cVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/e$b.class
     */
    /* renamed from: a8.e$b */
    /* loaded from: combined.jar:classes2.jar:a8/e$b.class */
    public static final class b extends IOException {

        /* renamed from: b */
        public final int f307b;

        public b(int i10) {
            super("Illegal clipping: " + m406a(i10));
            this.f307b = i10;
        }

        /* renamed from: a */
        public static String m406a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C0091e(InterfaceC0127w interfaceC0127w, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        C4349a.m21878a(j10 >= 0);
        this.f291k = (InterfaceC0127w) C4349a.m21882e(interfaceC0127w);
        this.f292l = j10;
        this.f293m = j11;
        this.f294n = z10;
        this.f295o = z11;
        this.f296p = z12;
        this.f297q = new ArrayList<>();
        this.f298r = new AbstractC7574e2.c();
    }

    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: B */
    public void mo303B(InterfaceC0853l0 interfaceC0853l0) {
        super.mo303B(interfaceC0853l0);
        m421K(null, this.f291k);
    }

    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: D */
    public void mo305D() {
        super.mo305D();
        this.f300t = null;
        this.f299s = null;
    }

    @Override // p009a8.AbstractC0095g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m417I(Void r42, InterfaceC0127w interfaceC0127w, AbstractC7574e2 abstractC7574e2) {
        if (this.f300t != null) {
            return;
        }
        m399N(abstractC7574e2);
    }

    /* renamed from: N */
    public final void m399N(AbstractC7574e2 abstractC7574e2) {
        long j10;
        long j11;
        abstractC7574e2.m32666n(0, this.f298r);
        long m32693e = this.f298r.m32693e();
        if (this.f299s == null || this.f297q.isEmpty() || this.f295o) {
            long j12 = this.f292l;
            long j13 = this.f293m;
            j10 = j12;
            j11 = j13;
            if (this.f296p) {
                long m32691c = this.f298r.m32691c();
                j10 = j12 + m32691c;
                j11 = j13 + m32691c;
            }
            this.f301u = m32693e + j10;
            this.f302v = this.f293m != Long.MIN_VALUE ? m32693e + j11 : Long.MIN_VALUE;
            int size = this.f297q.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f297q.get(i10).m351t(this.f301u, this.f302v);
            }
        } else {
            long j14 = this.f301u;
            j11 = this.f293m == Long.MIN_VALUE ? Long.MIN_VALUE : this.f302v - m32693e;
            j10 = j14 - m32693e;
        }
        try {
            a aVar = new a(abstractC7574e2, j10, j11);
            this.f299s = aVar;
            m304C(aVar);
        } catch (b e10) {
            this.f300t = e10;
        }
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: d */
    public C7561b1 mo400d() {
        return this.f291k.mo400d();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: h */
    public InterfaceC0121t mo401h(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        C0089d c0089d = new C0089d(this.f291k.mo401h(aVar, interfaceC0832b, j10), this.f294n, this.f301u, this.f302v);
        this.f297q.add(c0089d);
        return c0089d;
    }

    @Override // p009a8.AbstractC0095g, p009a8.InterfaceC0127w
    /* renamed from: m */
    public void mo402m() {
        b bVar = this.f300t;
        if (bVar != null) {
            throw bVar;
        }
        super.mo402m();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: q */
    public void mo403q(InterfaceC0121t interfaceC0121t) {
        C4349a.m21884g(this.f297q.remove(interfaceC0121t));
        this.f291k.mo403q(((C0089d) interfaceC0121t).f276b);
        if (!this.f297q.isEmpty() || this.f295o) {
            return;
        }
        m399N(((a) C4349a.m21882e(this.f299s)).f427c);
    }
}
