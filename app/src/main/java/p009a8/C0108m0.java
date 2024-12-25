package p009a8;

import com.amazonaws.services.p045s3.internal.Constants;
import p009a8.C0106l0;
import p009a8.C0108m0;
import p009a8.InterfaceC0098h0;
import p009a8.InterfaceC0127w;
import p027b9.C0865w;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0837d0;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p365v6.C9271m;
import p365v6.InterfaceC9252c0;
import p365v6.InterfaceC9292z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/m0.class
 */
/* renamed from: a8.m0 */
/* loaded from: combined.jar:classes2.jar:a8/m0.class */
public final class C0108m0 extends AbstractC0081a implements C0106l0.b {

    /* renamed from: h */
    public final C7561b1 f428h;

    /* renamed from: i */
    public final C7561b1.g f429i;

    /* renamed from: j */
    public final InterfaceC0854m.a f430j;

    /* renamed from: k */
    public final InterfaceC0098h0.a f431k;

    /* renamed from: l */
    public final InterfaceC9292z f432l;

    /* renamed from: m */
    public final InterfaceC0837d0 f433m;

    /* renamed from: n */
    public final int f434n;

    /* renamed from: o */
    public boolean f435o;

    /* renamed from: p */
    public long f436p;

    /* renamed from: q */
    public boolean f437q;

    /* renamed from: r */
    public boolean f438r;

    /* renamed from: s */
    public InterfaceC0853l0 f439s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/m0$a.class
     */
    /* renamed from: a8.m0$a */
    /* loaded from: combined.jar:classes2.jar:a8/m0$a.class */
    public class a extends AbstractC0107m {

        /* renamed from: d */
        public final C0108m0 f440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0108m0 c0108m0, AbstractC7574e2 abstractC7574e2) {
            super(abstractC7574e2);
            this.f440d = c0108m0;
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: g */
        public AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
            super.mo404g(i10, bVar, z10);
            bVar.f36714f = true;
            return bVar;
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: o */
        public AbstractC7574e2.c mo405o(int i10, AbstractC7574e2.c cVar, long j10) {
            super.mo405o(i10, cVar, j10);
            cVar.f36731l = true;
            return cVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/m0$b.class
     */
    /* renamed from: a8.m0$b */
    /* loaded from: combined.jar:classes2.jar:a8/m0$b.class */
    public static final class b implements InterfaceC0092e0 {

        /* renamed from: a */
        public final InterfaceC0854m.a f441a;

        /* renamed from: b */
        public InterfaceC0098h0.a f442b;

        /* renamed from: c */
        public boolean f443c;

        /* renamed from: d */
        public InterfaceC9252c0 f444d;

        /* renamed from: e */
        public InterfaceC0837d0 f445e;

        /* renamed from: f */
        public int f446f;

        /* renamed from: g */
        public String f447g;

        /* renamed from: h */
        public Object f448h;

        public b(InterfaceC0854m.a aVar, InterfaceC0098h0.a aVar2) {
            this.f441a = aVar;
            this.f442b = aVar2;
            this.f444d = new C9271m();
            this.f445e = new C0865w();
            this.f446f = Constants.f7590MB;
        }

        public b(InterfaceC0854m.a aVar, final InterfaceC4329l interfaceC4329l) {
            this(aVar, new InterfaceC0098h0.a(interfaceC4329l) { // from class: a8.n0

                /* renamed from: a */
                public final InterfaceC4329l f454a;

                {
                    this.f454a = interfaceC4329l;
                }

                @Override // p009a8.InterfaceC0098h0.a
                /* renamed from: a */
                public final InterfaceC0098h0 mo436a() {
                    InterfaceC0098h0 m516g;
                    m516g = C0108m0.b.m516g(this.f454a);
                    return m516g;
                }
            });
        }

        /* renamed from: g */
        public static /* synthetic */ InterfaceC0098h0 m516g(InterfaceC4329l interfaceC4329l) {
            return new C0087c(interfaceC4329l);
        }

        /* renamed from: h */
        public static /* synthetic */ InterfaceC9292z m517h(InterfaceC9292z interfaceC9292z, C7561b1 c7561b1) {
            return interfaceC9292z;
        }

        @Override // p009a8.InterfaceC0092e0
        /* renamed from: a */
        public int[] mo407a() {
            return new int[]{4};
        }

        @Override // p009a8.InterfaceC0092e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0108m0 mo409c(C7561b1 c7561b1) {
            C7561b1 c7561b12;
            C7561b1.c m32346a;
            C7561b1.c m32347A;
            C4349a.m21882e(c7561b1.f36449b);
            C7561b1.g gVar = c7561b1.f36449b;
            boolean z10 = true;
            boolean z11 = gVar.f36511h == null && this.f448h != null;
            if (gVar.f36509f != null || this.f447g == null) {
                z10 = false;
            }
            if (!z11 || !z10) {
                if (z11) {
                    m32347A = c7561b1.m32346a().m32347A(this.f448h);
                    c7561b12 = m32347A.m32350a();
                    return new C0108m0(c7561b12, this.f441a, this.f442b, this.f444d.mo526a(c7561b12), this.f445e, this.f446f, null);
                }
                c7561b12 = c7561b1;
                if (z10) {
                    m32346a = c7561b1.m32346a();
                }
                return new C0108m0(c7561b12, this.f441a, this.f442b, this.f444d.mo526a(c7561b12), this.f445e, this.f446f, null);
            }
            m32346a = c7561b1.m32346a().m32347A(this.f448h);
            m32347A = m32346a.m32356g(this.f447g);
            c7561b12 = m32347A.m32350a();
            return new C0108m0(c7561b12, this.f441a, this.f442b, this.f444d.mo526a(c7561b12), this.f445e, this.f446f, null);
        }

        @Override // p009a8.InterfaceC0092e0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b mo408b(final InterfaceC9292z interfaceC9292z) {
            if (interfaceC9292z == null) {
                m520j(null);
            } else {
                m520j(new InterfaceC9252c0(interfaceC9292z) { // from class: a8.o0

                    /* renamed from: a */
                    public final InterfaceC9292z f463a;

                    {
                        this.f463a = interfaceC9292z;
                    }

                    @Override // p365v6.InterfaceC9252c0
                    /* renamed from: a */
                    public final InterfaceC9292z mo526a(C7561b1 c7561b1) {
                        InterfaceC9292z m517h;
                        m517h = C0108m0.b.m517h(this.f463a, c7561b1);
                        return m517h;
                    }
                });
            }
            return this;
        }

        /* renamed from: j */
        public b m520j(InterfaceC9252c0 interfaceC9252c0) {
            boolean z10;
            if (interfaceC9252c0 != null) {
                this.f444d = interfaceC9252c0;
                z10 = true;
            } else {
                this.f444d = new C9271m();
                z10 = false;
            }
            this.f443c = z10;
            return this;
        }
    }

    public C0108m0(C7561b1 c7561b1, InterfaceC0854m.a aVar, InterfaceC0098h0.a aVar2, InterfaceC9292z interfaceC9292z, InterfaceC0837d0 interfaceC0837d0, int i10) {
        this.f429i = (C7561b1.g) C4349a.m21882e(c7561b1.f36449b);
        this.f428h = c7561b1;
        this.f430j = aVar;
        this.f431k = aVar2;
        this.f432l = interfaceC9292z;
        this.f433m = interfaceC0837d0;
        this.f434n = i10;
        this.f435o = true;
        this.f436p = -9223372036854775807L;
    }

    public /* synthetic */ C0108m0(C7561b1 c7561b1, InterfaceC0854m.a aVar, InterfaceC0098h0.a aVar2, InterfaceC9292z interfaceC9292z, InterfaceC0837d0 interfaceC0837d0, int i10, a aVar3) {
        this(c7561b1, aVar, aVar2, interfaceC9292z, interfaceC0837d0, i10);
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: B */
    public void mo303B(InterfaceC0853l0 interfaceC0853l0) {
        this.f439s = interfaceC0853l0;
        this.f432l.prepare();
        m513E();
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: D */
    public void mo305D() {
        this.f432l.release();
    }

    /* renamed from: E */
    public final void m513E() {
        C0126v0 c0126v0 = new C0126v0(this.f436p, this.f437q, false, this.f438r, null, this.f428h);
        AbstractC7574e2 abstractC7574e2 = c0126v0;
        if (this.f435o) {
            abstractC7574e2 = new a(this, c0126v0);
        }
        m304C(abstractC7574e2);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: d */
    public C7561b1 mo400d() {
        return this.f428h;
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: h */
    public InterfaceC0121t mo401h(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        InterfaceC0854m mo5296a = this.f430j.mo5296a();
        InterfaceC0853l0 interfaceC0853l0 = this.f439s;
        if (interfaceC0853l0 != null) {
            mo5296a.mo522c(interfaceC0853l0);
        }
        return new C0106l0(this.f429i.f36504a, mo5296a, this.f431k.mo436a(), this.f432l, m317u(aVar), this.f433m, m319w(aVar), this, interfaceC0832b, this.f429i.f36509f, this.f434n);
    }

    @Override // p009a8.C0106l0.b
    /* renamed from: j */
    public void mo503j(long j10, boolean z10, boolean z11) {
        long j11 = j10;
        if (j10 == -9223372036854775807L) {
            j11 = this.f436p;
        }
        if (!this.f435o && this.f436p == j11 && this.f437q == z10 && this.f438r == z11) {
            return;
        }
        this.f436p = j11;
        this.f437q = z10;
        this.f438r = z11;
        this.f435o = false;
        m513E();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: m */
    public void mo402m() {
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: q */
    public void mo403q(InterfaceC0121t interfaceC0121t) {
        ((C0106l0) interfaceC0121t).m478d0();
    }
}
