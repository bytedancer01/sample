package p282q6;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import org.apache.commons.net.bsd.RCommandClient;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p009a8.C0083a1;
import p009a8.C0111o;
import p009a8.C0117r;
import p009a8.C0123u;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0840f;
import p059d9.C4349a;
import p059d9.C4376n;
import p059d9.C4390u;
import p059d9.C4401z0;
import p059d9.InterfaceC4354c;
import p059d9.InterfaceC4380p;
import p078e9.C4670d0;
import p078e9.C4682p;
import p078e9.C4684r;
import p078e9.InterfaceC4668c0;
import p099fc.AbstractC4834t;
import p099fc.AbstractC4838v;
import p099fc.C4844y;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7565c1;
import p267p6.C7583h;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7607p;
import p267p6.C7609p1;
import p267p6.C7612q1;
import p267p6.C7629w0;
import p267p6.InterfaceC7606o1;
import p282q6.InterfaceC7806j1;
import p283q7.C7839a;
import p301r6.C7972d;
import p301r6.C7982i;
import p301r6.InterfaceC8002t;
import p332t6.C8636d;
import p332t6.C8639g;
import p347u6.C8795a;
import p365v6.C9279q;
import p365v6.InterfaceC9290x;
import p421y8.C9888l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q6/h1.class
 */
/* renamed from: q6.h1 */
/* loaded from: combined.jar:classes2.jar:q6/h1.class */
public class C7800h1 implements InterfaceC7606o1.e, InterfaceC8002t, InterfaceC4668c0, InterfaceC0090d0, InterfaceC0840f.a, InterfaceC9290x {

    /* renamed from: b */
    public final InterfaceC4354c f37689b;

    /* renamed from: c */
    public final AbstractC7574e2.b f37690c;

    /* renamed from: d */
    public final AbstractC7574e2.c f37691d;

    /* renamed from: e */
    public final a f37692e;

    /* renamed from: f */
    public final SparseArray<InterfaceC7806j1.a> f37693f;

    /* renamed from: g */
    public C4390u<InterfaceC7806j1> f37694g;

    /* renamed from: h */
    public InterfaceC7606o1 f37695h;

    /* renamed from: i */
    public InterfaceC4380p f37696i;

    /* renamed from: j */
    public boolean f37697j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q6/h1$a.class
     */
    /* renamed from: q6.h1$a */
    /* loaded from: combined.jar:classes2.jar:q6/h1$a.class */
    public static final class a {

        /* renamed from: a */
        public final AbstractC7574e2.b f37698a;

        /* renamed from: b */
        public AbstractC4834t<InterfaceC0127w.a> f37699b = AbstractC4834t.m24539E();

        /* renamed from: c */
        public AbstractC4838v<InterfaceC0127w.a, AbstractC7574e2> f37700c = AbstractC4838v.m24568k();

        /* renamed from: d */
        public InterfaceC0127w.a f37701d;

        /* renamed from: e */
        public InterfaceC0127w.a f37702e;

        /* renamed from: f */
        public InterfaceC0127w.a f37703f;

        public a(AbstractC7574e2.b bVar) {
            this.f37698a = bVar;
        }

        /* renamed from: c */
        public static InterfaceC0127w.a m34047c(InterfaceC7606o1 interfaceC7606o1, AbstractC4834t<InterfaceC0127w.a> abstractC4834t, InterfaceC0127w.a aVar, AbstractC7574e2.b bVar) {
            AbstractC7574e2 mo32467r = interfaceC7606o1.mo32467r();
            int mo32412C = interfaceC7606o1.mo32412C();
            Object mo511m = mo32467r.m32667q() ? null : mo32467r.mo511m(mo32412C);
            int m32672d = (interfaceC7606o1.mo32436a() || mo32467r.m32667q()) ? -1 : mo32467r.m32663f(mo32412C, bVar).m32672d(C7583h.m32760d(interfaceC7606o1.getCurrentPosition()) - bVar.m32683o());
            for (int i10 = 0; i10 < abstractC4834t.size(); i10++) {
                InterfaceC0127w.a aVar2 = abstractC4834t.get(i10);
                if (m34048i(aVar2, mo511m, interfaceC7606o1.mo32436a(), interfaceC7606o1.mo32460n(), interfaceC7606o1.mo32415F(), m32672d)) {
                    return aVar2;
                }
            }
            if (abstractC4834t.isEmpty() && aVar != null && m34048i(aVar, mo511m, interfaceC7606o1.mo32436a(), interfaceC7606o1.mo32460n(), interfaceC7606o1.mo32415F(), m32672d)) {
                return aVar;
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            if (r3.f548e == r8) goto L18;
         */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean m34048i(p009a8.InterfaceC0127w.a r3, java.lang.Object r4, boolean r5, int r6, int r7, int r8) {
            /*
                r0 = r3
                java.lang.Object r0 = r0.f544a
                r1 = r4
                boolean r0 = r0.equals(r1)
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = r9
                if (r0 != 0) goto L14
                r0 = 0
                return r0
            L14:
                r0 = r5
                if (r0 == 0) goto L29
                r0 = r3
                int r0 = r0.f545b
                r1 = r6
                if (r0 != r1) goto L29
                r0 = r3
                int r0 = r0.f546c
                r1 = r7
                if (r0 == r1) goto L4a
            L29:
                r0 = r10
                r9 = r0
                r0 = r5
                if (r0 != 0) goto L4d
                r0 = r10
                r9 = r0
                r0 = r3
                int r0 = r0.f545b
                r1 = -1
                if (r0 != r1) goto L4d
                r0 = r10
                r9 = r0
                r0 = r3
                int r0 = r0.f548e
                r1 = r8
                if (r0 != r1) goto L4d
            L4a:
                r0 = 1
                r9 = r0
            L4d:
                r0 = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p282q6.C7800h1.a.m34048i(a8.w$a, java.lang.Object, boolean, int, int, int):boolean");
        }

        /* renamed from: b */
        public final void m34049b(AbstractC4838v.a<InterfaceC0127w.a, AbstractC7574e2> aVar, InterfaceC0127w.a aVar2, AbstractC7574e2 abstractC7574e2) {
            if (aVar2 == null) {
                return;
            }
            if (abstractC7574e2.mo506b(aVar2.f544a) == -1) {
                abstractC7574e2 = this.f37700c.get(aVar2);
                if (abstractC7574e2 == null) {
                    return;
                }
            }
            aVar.m24575c(aVar2, abstractC7574e2);
        }

        /* renamed from: d */
        public InterfaceC0127w.a m34050d() {
            return this.f37701d;
        }

        /* renamed from: e */
        public InterfaceC0127w.a m34051e() {
            return this.f37699b.isEmpty() ? null : (InterfaceC0127w.a) C4844y.m24603c(this.f37699b);
        }

        /* renamed from: f */
        public AbstractC7574e2 m34052f(InterfaceC0127w.a aVar) {
            return this.f37700c.get(aVar);
        }

        /* renamed from: g */
        public InterfaceC0127w.a m34053g() {
            return this.f37702e;
        }

        /* renamed from: h */
        public InterfaceC0127w.a m34054h() {
            return this.f37703f;
        }

        /* renamed from: j */
        public void m34055j(InterfaceC7606o1 interfaceC7606o1) {
            this.f37701d = m34047c(interfaceC7606o1, this.f37699b, this.f37702e, this.f37698a);
        }

        /* renamed from: k */
        public void m34056k(List<InterfaceC0127w.a> list, InterfaceC0127w.a aVar, InterfaceC7606o1 interfaceC7606o1) {
            this.f37699b = AbstractC4834t.m24538A(list);
            if (!list.isEmpty()) {
                this.f37702e = list.get(0);
                this.f37703f = (InterfaceC0127w.a) C4349a.m21882e(aVar);
            }
            if (this.f37701d == null) {
                this.f37701d = m34047c(interfaceC7606o1, this.f37699b, this.f37702e, this.f37698a);
            }
            m34058m(interfaceC7606o1.mo32467r());
        }

        /* renamed from: l */
        public void m34057l(InterfaceC7606o1 interfaceC7606o1) {
            this.f37701d = m34047c(interfaceC7606o1, this.f37699b, this.f37702e, this.f37698a);
            m34058m(interfaceC7606o1.mo32467r());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0083, code lost:
        
            m34049b(r0, r5.f37701d, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
        
            if (r5.f37699b.contains(r5.f37701d) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
        
            if (ec.C4705h.m23655a(r5.f37701d, r5.f37703f) == false) goto L18;
         */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m34058m(p267p6.AbstractC7574e2 r6) {
            /*
                r5 = this;
                fc.v$a r0 = p099fc.AbstractC4838v.m24565b()
                r8 = r0
                r0 = r5
                fc.t<a8.w$a> r0 = r0.f37699b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L4f
                r0 = r5
                r1 = r8
                r2 = r5
                a8.w$a r2 = r2.f37702e
                r3 = r6
                r0.m34049b(r1, r2, r3)
                r0 = r5
                a8.w$a r0 = r0.f37703f
                r1 = r5
                a8.w$a r1 = r1.f37702e
                boolean r0 = ec.C4705h.m23655a(r0, r1)
                if (r0 != 0) goto L30
                r0 = r5
                r1 = r8
                r2 = r5
                a8.w$a r2 = r2.f37703f
                r3 = r6
                r0.m34049b(r1, r2, r3)
            L30:
                r0 = r5
                a8.w$a r0 = r0.f37701d
                r1 = r5
                a8.w$a r1 = r1.f37702e
                boolean r0 = ec.C4705h.m23655a(r0, r1)
                if (r0 != 0) goto L8d
                r0 = r5
                a8.w$a r0 = r0.f37701d
                r1 = r5
                a8.w$a r1 = r1.f37703f
                boolean r0 = ec.C4705h.m23655a(r0, r1)
                if (r0 != 0) goto L8d
                goto L83
            L4f:
                r0 = 0
                r7 = r0
            L51:
                r0 = r7
                r1 = r5
                fc.t<a8.w$a> r1 = r1.f37699b
                int r1 = r1.size()
                if (r0 >= r1) goto L75
                r0 = r5
                r1 = r8
                r2 = r5
                fc.t<a8.w$a> r2 = r2.f37699b
                r3 = r7
                java.lang.Object r2 = r2.get(r3)
                a8.w$a r2 = (p009a8.InterfaceC0127w.a) r2
                r3 = r6
                r0.m34049b(r1, r2, r3)
                int r7 = r7 + 1
                goto L51
            L75:
                r0 = r5
                fc.t<a8.w$a> r0 = r0.f37699b
                r1 = r5
                a8.w$a r1 = r1.f37701d
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L8d
            L83:
                r0 = r5
                r1 = r8
                r2 = r5
                a8.w$a r2 = r2.f37701d
                r3 = r6
                r0.m34049b(r1, r2, r3)
            L8d:
                r0 = r5
                r1 = r8
                fc.v r1 = r1.m24573a()
                r0.f37700c = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p282q6.C7800h1.a.m34058m(p6.e2):void");
        }
    }

    public C7800h1(InterfaceC4354c interfaceC4354c) {
        this.f37689b = (InterfaceC4354c) C4349a.m21882e(interfaceC4354c);
        this.f37694g = new C4390u<>(C4401z0.m22347R(), interfaceC4354c, new C4390u.b() { // from class: q6.a
            @Override // p059d9.C4390u.b
            /* renamed from: a */
            public final void mo22259a(Object obj, C4376n c4376n) {
                C7800h1.m33920C1((InterfaceC7806j1) obj, c4376n);
            }
        });
        AbstractC7574e2.b bVar = new AbstractC7574e2.b();
        this.f37690c = bVar;
        this.f37691d = new AbstractC7574e2.c();
        this.f37692e = new a(bVar);
        this.f37693f = new SparseArray<>();
    }

    /* renamed from: B2 */
    public static /* synthetic */ void m33918B2(InterfaceC7806j1.a aVar, C8636d c8636d, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22140t(aVar, c8636d);
        interfaceC7806j1.mo22130n(aVar, 2, c8636d);
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m33920C1(InterfaceC7806j1 interfaceC7806j1, C4376n c4376n) {
    }

    /* renamed from: C2 */
    public static /* synthetic */ void m33921C2(InterfaceC7806j1.a aVar, C8636d c8636d, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22093P(aVar, c8636d);
        interfaceC7806j1.mo22094Q(aVar, 2, c8636d);
    }

    /* renamed from: E2 */
    public static /* synthetic */ void m33927E2(InterfaceC7806j1.a aVar, C7629w0 c7629w0, C8639g c8639g, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22142u(aVar, c7629w0);
        interfaceC7806j1.mo22116g(aVar, c7629w0, c8639g);
        interfaceC7806j1.mo22102Y(aVar, 2, c7629w0);
    }

    /* renamed from: F2 */
    public static /* synthetic */ void m33930F2(InterfaceC7806j1.a aVar, C4670d0 c4670d0, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22072C(aVar, c4670d0);
        interfaceC7806j1.mo22076F(aVar, c4670d0.f27559a, c4670d0.f27560b, c4670d0.f27561c, c4670d0.f27562d);
    }

    /* renamed from: G1 */
    public static /* synthetic */ void m33932G1(InterfaceC7806j1.a aVar, String str, long j10, long j11, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22125k0(aVar, str, j10);
        interfaceC7806j1.mo22097T(aVar, str, j11, j10);
        interfaceC7806j1.mo22096S(aVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void m33936H2() {
        this.f37694g.m22255i();
    }

    /* renamed from: I1 */
    public static /* synthetic */ void m33938I1(InterfaceC7806j1.a aVar, C8636d c8636d, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22147y(aVar, c8636d);
        interfaceC7806j1.mo22130n(aVar, 1, c8636d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void m33939I2(InterfaceC7606o1 interfaceC7606o1, InterfaceC7806j1 interfaceC7806j1, C4376n c4376n) {
        interfaceC7806j1.mo22080H(interfaceC7606o1, new InterfaceC7806j1.b(c4376n, this.f37693f));
    }

    /* renamed from: J1 */
    public static /* synthetic */ void m33941J1(InterfaceC7806j1.a aVar, C8636d c8636d, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22084J(aVar, c8636d);
        interfaceC7806j1.mo22094Q(aVar, 1, c8636d);
    }

    /* renamed from: K1 */
    public static /* synthetic */ void m33943K1(InterfaceC7806j1.a aVar, C7629w0 c7629w0, C8639g c8639g, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22136q(aVar, c7629w0);
        interfaceC7806j1.mo22112e(aVar, c7629w0, c8639g);
        interfaceC7806j1.mo22102Y(aVar, 1, c7629w0);
    }

    /* renamed from: U1 */
    public static /* synthetic */ void m33963U1(InterfaceC7806j1.a aVar, int i10, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22128m(aVar);
        interfaceC7806j1.mo22122j(aVar, i10);
    }

    /* renamed from: Y1 */
    public static /* synthetic */ void m33971Y1(InterfaceC7806j1.a aVar, boolean z10, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22145w(aVar, z10);
        interfaceC7806j1.mo22113e0(aVar, z10);
    }

    /* renamed from: n2 */
    public static /* synthetic */ void m34002n2(InterfaceC7806j1.a aVar, int i10, InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22115f0(aVar, i10);
        interfaceC7806j1.mo22071B(aVar, fVar, fVar2, i10);
    }

    /* renamed from: z2 */
    public static /* synthetic */ void m34032z2(InterfaceC7806j1.a aVar, String str, long j10, long j11, InterfaceC7806j1 interfaceC7806j1) {
        interfaceC7806j1.mo22074E(aVar, str, j10);
        interfaceC7806j1.mo22135p0(aVar, str, j11, j10);
        interfaceC7806j1.mo22096S(aVar, 2, str, j10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: A */
    public final void mo12514A(final C7597l1 c7597l1) {
        C0123u c0123u;
        InterfaceC7806j1.a m34042w1 = (!(c7597l1 instanceof C7607p) || (c0123u = ((C7607p) c7597l1).f36923j) == null) ? null : m34042w1(new InterfaceC0127w.a(c0123u));
        InterfaceC7806j1.a aVar = m34042w1;
        if (m34042w1 == null) {
            aVar = m34041v1();
        }
        final InterfaceC7806j1.a aVar2 = aVar;
        m34037L2(aVar, 11, new C4390u.a(aVar2, c7597l1) { // from class: q6.g1

            /* renamed from: a */
            public final InterfaceC7806j1.a f37684a;

            /* renamed from: b */
            public final C7597l1 f37685b;

            {
                this.f37684a = aVar2;
                this.f37685b = c7597l1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22086K(this.f37684a, this.f37685b);
            }
        });
    }

    /* renamed from: A1 */
    public final InterfaceC7806j1.a m34033A1() {
        return m34042w1(this.f37692e.m34053g());
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: B */
    public final void mo32511B(final C8636d c8636d) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1008, new C4390u.a(m34034B1, c8636d) { // from class: q6.s

            /* renamed from: a */
            public final InterfaceC7806j1.a f37767a;

            /* renamed from: b */
            public final C8636d f37768b;

            {
                this.f37767a = m34034B1;
                this.f37768b = c8636d;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33941J1(this.f37767a, this.f37768b, (InterfaceC7806j1) obj);
            }
        });
    }

    /* renamed from: B1 */
    public final InterfaceC7806j1.a m34034B1() {
        return m34042w1(this.f37692e.m34054h());
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: C */
    public /* synthetic */ void mo12515C(InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.d dVar) {
        C7612q1.m32987f(this, interfaceC7606o1, dVar);
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: D */
    public /* synthetic */ void mo12516D() {
        C7612q1.m33000s(this);
    }

    @Override // p243o8.InterfaceC6929k
    /* renamed from: E */
    public /* synthetic */ void mo12517E(List list) {
        C7612q1.m32984c(this, list);
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: F */
    public final void mo32513F(final long j10) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1011, new C4390u.a(m34034B1, j10) { // from class: q6.u0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37777a;

            /* renamed from: b */
            public final long f37778b;

            {
                this.f37777a = m34034B1;
                this.f37778b = j10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22148z(this.f37777a, this.f37778b);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: G */
    public final void mo23447G(final Exception exc) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1038, new C4390u.a(m34034B1, exc) { // from class: q6.f0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37676a;

            /* renamed from: b */
            public final Exception f37677b;

            {
                this.f37676a = m34034B1;
                this.f37677b = exc;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22098U(this.f37676a, this.f37677b);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: H */
    public final void mo23448H(final C8636d c8636d) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1020, new C4390u.a(m34034B1, c8636d) { // from class: q6.m0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37740a;

            /* renamed from: b */
            public final C8636d f37741b;

            {
                this.f37740a = m34034B1;
                this.f37741b = c8636d;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33921C2(this.f37740a, this.f37741b, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: I */
    public void mo12518I(final int i10, final int i11) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1029, new C4390u.a(m34034B1, i10, i11) { // from class: q6.w

            /* renamed from: a */
            public final InterfaceC7806j1.a f37785a;

            /* renamed from: b */
            public final int f37786b;

            /* renamed from: c */
            public final int f37787c;

            {
                this.f37785a = m34034B1;
                this.f37786b = i10;
                this.f37787c = i11;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22099V(this.f37785a, this.f37786b, this.f37787c);
            }
        });
    }

    @Override // p009a8.InterfaceC0090d0
    /* renamed from: J */
    public final void mo359J(int i10, InterfaceC0127w.a aVar, final C0111o c0111o, final C0117r c0117r) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, AdError.NO_FILL_ERROR_CODE, new C4390u.a(m34045z1, c0111o, c0117r) { // from class: q6.c0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37656a;

            /* renamed from: b */
            public final C0111o f37657b;

            /* renamed from: c */
            public final C0117r f37658c;

            {
                this.f37656a = m34045z1;
                this.f37657b = c0111o;
                this.f37658c = c0117r;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22138r(this.f37656a, this.f37657b, this.f37658c);
            }
        });
    }

    /* renamed from: J2 */
    public final void m34035J2() {
        if (this.f37697j) {
            return;
        }
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        this.f37697j = true;
        m34037L2(m34041v1, -1, new C4390u.a(m34041v1) { // from class: q6.c1

            /* renamed from: a */
            public final InterfaceC7806j1.a f37659a;

            {
                this.f37659a = m34041v1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22082I(this.f37659a);
            }
        });
    }

    @Override // p009a8.InterfaceC0090d0
    /* renamed from: K */
    public final void mo360K(int i10, InterfaceC0127w.a aVar, final C0117r c0117r) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1004, new C4390u.a(m34045z1, c0117r) { // from class: q6.q0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37761a;

            /* renamed from: b */
            public final C0117r f37762b;

            {
                this.f37761a = m34045z1;
                this.f37762b = c0117r;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22119h0(this.f37761a, this.f37762b);
            }
        });
    }

    /* renamed from: K2 */
    public void m34036K2() {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        this.f37693f.put(1036, m34041v1);
        m34037L2(m34041v1, 1036, new C4390u.a(m34041v1) { // from class: q6.h0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37688a;

            {
                this.f37688a = m34041v1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22088L(this.f37688a);
            }
        });
        ((InterfaceC4380p) C4349a.m21886i(this.f37696i)).mo22202h(new Runnable(this) { // from class: q6.s0

            /* renamed from: b */
            public final C7800h1 f37769b;

            {
                this.f37769b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f37769b.m33936H2();
            }
        });
    }

    @Override // p283q7.InterfaceC7844f
    /* renamed from: L */
    public final void mo12519L(final C7839a c7839a) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 1007, new C4390u.a(m34041v1, c7839a) { // from class: q6.l

            /* renamed from: a */
            public final InterfaceC7806j1.a f37733a;

            /* renamed from: b */
            public final C7839a f37734b;

            {
                this.f37733a = m34041v1;
                this.f37734b = c7839a;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22070A(this.f37733a, this.f37734b);
            }
        });
    }

    /* renamed from: L2 */
    public final void m34037L2(InterfaceC7806j1.a aVar, int i10, C4390u.a<InterfaceC7806j1> aVar2) {
        this.f37693f.put(i10, aVar);
        this.f37694g.m22257k(i10, aVar2);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: M */
    public /* synthetic */ void mo12520M(int i10) {
        C7609p1.m32891l(this, i10);
    }

    /* renamed from: M2 */
    public void m34038M2(final InterfaceC7606o1 interfaceC7606o1, Looper looper) {
        C4349a.m21884g(this.f37695h == null || this.f37692e.f37699b.isEmpty());
        this.f37695h = (InterfaceC7606o1) C4349a.m21882e(interfaceC7606o1);
        this.f37696i = this.f37689b.mo21915d(looper, null);
        this.f37694g = this.f37694g.m22251d(looper, new C4390u.b(this, interfaceC7606o1) { // from class: q6.e1

            /* renamed from: a */
            public final C7800h1 f37671a;

            /* renamed from: b */
            public final InterfaceC7606o1 f37672b;

            {
                this.f37671a = this;
                this.f37672b = interfaceC7606o1;
            }

            @Override // p059d9.C4390u.b
            /* renamed from: a */
            public final void mo22259a(Object obj, C4376n c4376n) {
                this.f37671a.m33939I2(this.f37672b, (InterfaceC7806j1) obj, c4376n);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: N */
    public final void mo12521N(final boolean z10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 4, new C4390u.a(m34041v1, z10) { // from class: q6.l0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37735a;

            /* renamed from: b */
            public final boolean f37736b;

            {
                this.f37735a = m34041v1;
                this.f37736b = z10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33971Y1(this.f37735a, this.f37736b, (InterfaceC7806j1) obj);
            }
        });
    }

    /* renamed from: N2 */
    public final void m34039N2(List<InterfaceC0127w.a> list, InterfaceC0127w.a aVar) {
        this.f37692e.m34056k(list, aVar, (InterfaceC7606o1) C4349a.m21882e(this.f37695h));
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: O */
    public final void mo12522O() {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, -1, new C4390u.a(m34041v1) { // from class: q6.f1

            /* renamed from: a */
            public final InterfaceC7806j1.a f37678a;

            {
                this.f37678a = m34041v1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22131n0(this.f37678a);
            }
        });
    }

    @Override // p365v6.InterfaceC9290x
    /* renamed from: P */
    public final void mo423P(int i10, InterfaceC0127w.a aVar) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1033, new C4390u.a(m34045z1) { // from class: q6.a1

            /* renamed from: a */
            public final InterfaceC7806j1.a f37645a;

            {
                this.f37645a = m34045z1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22108c(this.f37645a);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: Q */
    public void mo12523Q(final InterfaceC7606o1.b bVar) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 14, new C4390u.a(m34041v1, bVar) { // from class: q6.n0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37745a;

            /* renamed from: b */
            public final InterfaceC7606o1.b f37746b;

            {
                this.f37745a = m34041v1;
                this.f37746b = bVar;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22095R(this.f37745a, this.f37746b);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: R */
    public /* synthetic */ void mo12524R(C7597l1 c7597l1) {
        C7612q1.m32998q(this, c7597l1);
    }

    @Override // p301r6.InterfaceC7978g
    /* renamed from: S */
    public final void mo12525S(final C7972d c7972d) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1016, new C4390u.a(m34034B1, c7972d) { // from class: q6.d1

            /* renamed from: a */
            public final InterfaceC7806j1.a f37665a;

            /* renamed from: b */
            public final C7972d f37666b;

            {
                this.f37665a = m34034B1;
                this.f37666b = c7972d;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22109c0(this.f37665a, this.f37666b);
            }
        });
    }

    @Override // p365v6.InterfaceC9290x
    /* renamed from: T */
    public /* synthetic */ void mo424T(int i10, InterfaceC0127w.a aVar) {
        C9279q.m39150a(this, i10, aVar);
    }

    @Override // p009a8.InterfaceC0090d0
    /* renamed from: U */
    public final void mo361U(int i10, InterfaceC0127w.a aVar, final C0111o c0111o, final C0117r c0117r) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new C4390u.a(m34045z1, c0111o, c0117r) { // from class: q6.d

            /* renamed from: a */
            public final InterfaceC7806j1.a f37660a;

            /* renamed from: b */
            public final C0111o f37661b;

            /* renamed from: c */
            public final C0117r f37662c;

            {
                this.f37660a = m34045z1;
                this.f37661b = c0111o;
                this.f37662c = c0117r;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22114f(this.f37660a, this.f37661b, this.f37662c);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: V */
    public final void mo23449V(final int i10, final long j10) {
        final InterfaceC7806j1.a m34033A1 = m34033A1();
        m34037L2(m34033A1, RCommandClient.MAX_CLIENT_PORT, new C4390u.a(m34033A1, i10, j10) { // from class: q6.f

            /* renamed from: a */
            public final InterfaceC7806j1.a f37673a;

            /* renamed from: b */
            public final int f37674b;

            /* renamed from: c */
            public final long f37675c;

            {
                this.f37673a = m34033A1;
                this.f37674b = i10;
                this.f37675c = j10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22124k(this.f37673a, this.f37674b, this.f37675c);
            }
        });
    }

    @Override // p009a8.InterfaceC0090d0
    /* renamed from: W */
    public final void mo362W(int i10, InterfaceC0127w.a aVar, final C0117r c0117r) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1005, new C4390u.a(m34045z1, c0117r) { // from class: q6.g0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37682a;

            /* renamed from: b */
            public final C0117r f37683b;

            {
                this.f37682a = m34045z1;
                this.f37683b = c0117r;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22117g0(this.f37682a, this.f37683b);
            }
        });
    }

    @Override // p365v6.InterfaceC9290x
    /* renamed from: X */
    public final void mo425X(int i10, InterfaceC0127w.a aVar) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1034, new C4390u.a(m34045z1) { // from class: q6.y0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37800a;

            {
                this.f37800a = m34045z1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22134p(this.f37800a);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: Y */
    public final void mo12526Y(final boolean z10, final int i10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, -1, new C4390u.a(m34041v1, z10, i10) { // from class: q6.i

            /* renamed from: a */
            public final InterfaceC7806j1.a f37704a;

            /* renamed from: b */
            public final boolean f37705b;

            /* renamed from: c */
            public final int f37706c;

            {
                this.f37704a = m34041v1;
                this.f37705b = z10;
                this.f37706c = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22121i0(this.f37704a, this.f37705b, this.f37706c);
            }
        });
    }

    @Override // p009a8.InterfaceC0090d0
    /* renamed from: Z */
    public final void mo363Z(int i10, InterfaceC0127w.a aVar, final C0111o c0111o, final C0117r c0117r, final IOException iOException, final boolean z10) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1003, new C4390u.a(m34045z1, c0111o, c0117r, iOException, z10) { // from class: q6.q

            /* renamed from: a */
            public final InterfaceC7806j1.a f37756a;

            /* renamed from: b */
            public final C0111o f37757b;

            /* renamed from: c */
            public final C0117r f37758c;

            /* renamed from: d */
            public final IOException f37759d;

            /* renamed from: e */
            public final boolean f37760e;

            {
                this.f37756a = m34045z1;
                this.f37757b = c0111o;
                this.f37758c = c0117r;
                this.f37759d = iOException;
                this.f37760e = z10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22144v(this.f37756a, this.f37757b, this.f37758c, this.f37759d, this.f37760e);
            }
        });
    }

    @Override // p301r6.InterfaceC7978g
    /* renamed from: a */
    public final void mo12527a(final boolean z10) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1017, new C4390u.a(m34034B1, z10) { // from class: q6.x0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37794a;

            /* renamed from: b */
            public final boolean f37795b;

            {
                this.f37794a = m34034B1;
                this.f37795b = z10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22105a0(this.f37794a, this.f37795b);
            }
        });
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: a0 */
    public /* synthetic */ void mo12528a0(int i10, int i11, int i12, float f10) {
        C4682p.m23609a(this, i10, i11, i12, f10);
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: b */
    public final void mo32518b(final Exception exc) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1018, new C4390u.a(m34034B1, exc) { // from class: q6.k0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37731a;

            /* renamed from: b */
            public final Exception f37732b;

            {
                this.f37731a = m34034B1;
                this.f37732b = exc;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22090M(this.f37731a, this.f37732b);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: b0 */
    public final void mo23450b0(final C8636d c8636d) {
        final InterfaceC7806j1.a m34033A1 = m34033A1();
        m34037L2(m34033A1, 1025, new C4390u.a(m34033A1, c8636d) { // from class: q6.b0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37648a;

            /* renamed from: b */
            public final C8636d f37649b;

            {
                this.f37648a = m34033A1;
                this.f37649b = c8636d;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33918B2(this.f37648a, this.f37649b, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: c */
    public final void mo12529c(final C4670d0 c4670d0) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1028, new C4390u.a(m34034B1, c4670d0) { // from class: q6.c

            /* renamed from: a */
            public final InterfaceC7806j1.a f37654a;

            /* renamed from: b */
            public final C4670d0 f37655b;

            {
                this.f37654a = m34034B1;
                this.f37655b = c4670d0;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33930F2(this.f37654a, this.f37655b, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: c0 */
    public final void mo23452c0(final Object obj, final long j10) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1027, new C4390u.a(m34034B1, obj, j10) { // from class: q6.n

            /* renamed from: a */
            public final InterfaceC7806j1.a f37742a;

            /* renamed from: b */
            public final Object f37743b;

            /* renamed from: c */
            public final long f37744c;

            {
                this.f37742a = m34034B1;
                this.f37743b = obj;
                this.f37744c = j10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj2) {
                ((InterfaceC7806j1) obj2).mo22123j0(this.f37742a, this.f37743b, this.f37744c);
            }
        });
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: d */
    public final void mo32519d(final C7629w0 c7629w0, final C8639g c8639g) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1010, new C4390u.a(m34034B1, c7629w0, c8639g) { // from class: q6.p

            /* renamed from: a */
            public final InterfaceC7806j1.a f37752a;

            /* renamed from: b */
            public final C7629w0 f37753b;

            /* renamed from: c */
            public final C8639g f37754c;

            {
                this.f37752a = m34034B1;
                this.f37753b = c7629w0;
                this.f37754c = c8639g;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33943K1(this.f37752a, this.f37753b, this.f37754c, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p347u6.InterfaceC8796b
    /* renamed from: d0 */
    public /* synthetic */ void mo12531d0(C8795a c8795a) {
        C7612q1.m32985d(this, c8795a);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: e */
    public final void mo12532e(final C7603n1 c7603n1) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 13, new C4390u.a(m34041v1, c7603n1) { // from class: q6.e0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37669a;

            /* renamed from: b */
            public final C7603n1 f37670b;

            {
                this.f37669a = m34041v1;
                this.f37670b = c7603n1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22133o0(this.f37669a, this.f37670b);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: e0 */
    public final void mo12533e0(final C0083a1 c0083a1, final C9888l c9888l) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 2, new C4390u.a(m34041v1, c0083a1, c9888l) { // from class: q6.v0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37782a;

            /* renamed from: b */
            public final C0083a1 f37783b;

            /* renamed from: c */
            public final C9888l f37784c;

            {
                this.f37782a = m34041v1;
                this.f37783b = c0083a1;
                this.f37784c = c9888l;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22103Z(this.f37782a, this.f37783b, this.f37784c);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: f */
    public final void mo12534f(final int i10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 7, new C4390u.a(m34041v1, i10) { // from class: q6.b

            /* renamed from: a */
            public final InterfaceC7806j1.a f37646a;

            /* renamed from: b */
            public final int f37647b;

            {
                this.f37646a = m34041v1;
                this.f37647b = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22106b(this.f37646a, this.f37647b);
            }
        });
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: f0 */
    public final void mo32520f0(final Exception exc) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1037, new C4390u.a(m34034B1, exc) { // from class: q6.r0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37765a;

            /* renamed from: b */
            public final Exception f37766b;

            {
                this.f37765a = m34034B1;
                this.f37766b = exc;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22111d0(this.f37765a, this.f37766b);
            }
        });
    }

    @Override // p365v6.InterfaceC9290x
    /* renamed from: g */
    public final void mo428g(int i10, InterfaceC0127w.a aVar, final Exception exc) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1032, new C4390u.a(m34045z1, exc) { // from class: q6.x

            /* renamed from: a */
            public final InterfaceC7806j1.a f37792a;

            /* renamed from: b */
            public final Exception f37793b;

            {
                this.f37792a = m34045z1;
                this.f37793b = exc;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22132o(this.f37792a, this.f37793b);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: g0 */
    public final void mo12535g0(final boolean z10, final int i10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 6, new C4390u.a(m34041v1, z10, i10) { // from class: q6.g

            /* renamed from: a */
            public final InterfaceC7806j1.a f37679a;

            /* renamed from: b */
            public final boolean f37680b;

            /* renamed from: c */
            public final int f37681c;

            {
                this.f37679a = m34041v1;
                this.f37680b = z10;
                this.f37681c = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22107b0(this.f37679a, this.f37680b, this.f37681c);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: h */
    public /* synthetic */ void mo12536h(boolean z10) {
        C7609p1.m32883d(this, z10);
    }

    @Override // p009a8.InterfaceC0090d0
    /* renamed from: h0 */
    public final void mo364h0(int i10, InterfaceC0127w.a aVar, final C0111o c0111o, final C0117r c0117r) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1000, new C4390u.a(m34045z1, c0111o, c0117r) { // from class: q6.u

            /* renamed from: a */
            public final InterfaceC7806j1.a f37774a;

            /* renamed from: b */
            public final C0111o f37775b;

            /* renamed from: c */
            public final C0117r f37776c;

            {
                this.f37774a = m34045z1;
                this.f37775b = c0111o;
                this.f37776c = c0117r;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22139s(this.f37774a, this.f37775b, this.f37776c);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: i */
    public final void mo23453i(final String str) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1024, new C4390u.a(m34034B1, str) { // from class: q6.j

            /* renamed from: a */
            public final InterfaceC7806j1.a f37711a;

            /* renamed from: b */
            public final String f37712b;

            {
                this.f37711a = m34034B1;
                this.f37712b = str;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22110d(this.f37711a, this.f37712b);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: i0 */
    public final void mo12537i0(final InterfaceC7606o1.f fVar, final InterfaceC7606o1.f fVar2, final int i10) {
        if (i10 == 1) {
            this.f37697j = false;
        }
        this.f37692e.m34055j((InterfaceC7606o1) C4349a.m21882e(this.f37695h));
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 12, new C4390u.a(m34041v1, i10, fVar, fVar2) { // from class: q6.j0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37713a;

            /* renamed from: b */
            public final int f37714b;

            /* renamed from: c */
            public final InterfaceC7606o1.f f37715c;

            /* renamed from: d */
            public final InterfaceC7606o1.f f37716d;

            {
                this.f37713a = m34041v1;
                this.f37714b = i10;
                this.f37715c = fVar;
                this.f37716d = fVar2;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m34002n2(this.f37713a, this.f37714b, this.f37715c, this.f37716d, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    @Deprecated
    /* renamed from: j */
    public final void mo12538j(final List<C7839a> list) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 3, new C4390u.a(m34041v1, list) { // from class: q6.t

            /* renamed from: a */
            public final InterfaceC7806j1.a f37770a;

            /* renamed from: b */
            public final List f37771b;

            {
                this.f37770a = m34041v1;
                this.f37771b = list;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22104a(this.f37770a, this.f37771b);
            }
        });
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: j0 */
    public final void mo32522j0(final int i10, final long j10, final long j11) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1012, new C4390u.a(m34034B1, i10, j10, j11) { // from class: q6.b1

            /* renamed from: a */
            public final InterfaceC7806j1.a f37650a;

            /* renamed from: b */
            public final int f37651b;

            /* renamed from: c */
            public final long f37652c;

            /* renamed from: d */
            public final long f37653d;

            {
                this.f37650a = m34034B1;
                this.f37651b = i10;
                this.f37652c = j10;
                this.f37653d = j11;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22118h(this.f37650a, this.f37651b, this.f37652c, this.f37653d);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: k */
    public final void mo23454k(final String str, final long j10, final long j11) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1021, new C4390u.a(m34034B1, str, j11, j10) { // from class: q6.w0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37788a;

            /* renamed from: b */
            public final String f37789b;

            /* renamed from: c */
            public final long f37790c;

            /* renamed from: d */
            public final long f37791d;

            {
                this.f37788a = m34034B1;
                this.f37789b = str;
                this.f37790c = j11;
                this.f37791d = j10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m34032z2(this.f37788a, this.f37789b, this.f37790c, this.f37791d, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p365v6.InterfaceC9290x
    /* renamed from: k0 */
    public final void mo429k0(int i10, InterfaceC0127w.a aVar) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1031, new C4390u.a(m34045z1) { // from class: q6.z0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37803a;

            {
                this.f37803a = m34045z1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22127l0(this.f37803a);
            }
        });
    }

    @Override // p365v6.InterfaceC9290x
    /* renamed from: l */
    public final void mo430l(int i10, InterfaceC0127w.a aVar, final int i11) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1030, new C4390u.a(m34045z1, i11) { // from class: q6.z

            /* renamed from: a */
            public final InterfaceC7806j1.a f37801a;

            /* renamed from: b */
            public final int f37802b;

            {
                this.f37801a = m34045z1;
                this.f37802b = i11;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33963U1(this.f37801a, this.f37802b, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: l0 */
    public final void mo23455l0(final long j10, final int i10) {
        final InterfaceC7806j1.a m34033A1 = m34033A1();
        m34037L2(m34033A1, 1026, new C4390u.a(m34033A1, j10, i10) { // from class: q6.o

            /* renamed from: a */
            public final InterfaceC7806j1.a f37747a;

            /* renamed from: b */
            public final long f37748b;

            /* renamed from: c */
            public final int f37749c;

            {
                this.f37747a = m34033A1;
                this.f37748b = j10;
                this.f37749c = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22100W(this.f37747a, this.f37748b, this.f37749c);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m */
    public final void mo12539m(final int i10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 5, new C4390u.a(m34041v1, i10) { // from class: q6.o0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37750a;

            /* renamed from: b */
            public final int f37751b;

            {
                this.f37750a = m34041v1;
                this.f37751b = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22091N(this.f37750a, this.f37751b);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m0 */
    public void mo12540m0(final boolean z10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 8, new C4390u.a(m34041v1, z10) { // from class: q6.t0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37772a;

            /* renamed from: b */
            public final boolean f37773b;

            {
                this.f37772a = m34041v1;
                this.f37773b = z10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22129m0(this.f37772a, this.f37773b);
            }
        });
    }

    @Override // p365v6.InterfaceC9290x
    /* renamed from: n */
    public final void mo431n(int i10, InterfaceC0127w.a aVar) {
        final InterfaceC7806j1.a m34045z1 = m34045z1(i10, aVar);
        m34037L2(m34045z1, 1035, new C4390u.a(m34045z1) { // from class: q6.p0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37755a;

            {
                this.f37755a = m34045z1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22101X(this.f37755a);
            }
        });
    }

    @Override // p027b9.InterfaceC0840f.a
    /* renamed from: o */
    public final void mo5343o(final int i10, final long j10, final long j11) {
        final InterfaceC7806j1.a m34044y1 = m34044y1();
        m34037L2(m34044y1, 1006, new C4390u.a(m34044y1, i10, j10, j11) { // from class: q6.i0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37707a;

            /* renamed from: b */
            public final int f37708b;

            /* renamed from: c */
            public final long f37709c;

            /* renamed from: d */
            public final long f37710d;

            {
                this.f37707a = m34044y1;
                this.f37708b = i10;
                this.f37709c = j10;
                this.f37710d = j11;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22120i(this.f37707a, this.f37708b, this.f37709c, this.f37710d);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    public final void onRepeatModeChanged(final int i10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 9, new C4390u.a(m34041v1, i10) { // from class: q6.h

            /* renamed from: a */
            public final InterfaceC7806j1.a f37686a;

            /* renamed from: b */
            public final int f37687b;

            {
                this.f37686a = m34041v1;
                this.f37687b = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22137q0(this.f37686a, this.f37687b);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: p */
    public final void mo12541p(AbstractC7574e2 abstractC7574e2, final int i10) {
        this.f37692e.m34057l((InterfaceC7606o1) C4349a.m21882e(this.f37695h));
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 0, new C4390u.a(m34041v1, i10) { // from class: q6.k

            /* renamed from: a */
            public final InterfaceC7806j1.a f37729a;

            /* renamed from: b */
            public final int f37730b;

            {
                this.f37729a = m34041v1;
                this.f37730b = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22073D(this.f37729a, this.f37730b);
            }
        });
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: q */
    public final void mo32523q(final String str) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1013, new C4390u.a(m34034B1, str) { // from class: q6.d0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37663a;

            /* renamed from: b */
            public final String f37664b;

            {
                this.f37663a = m34034B1;
                this.f37664b = str;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22126l(this.f37663a, this.f37664b);
            }
        });
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: r */
    public final void mo32524r(final String str, final long j10, final long j11) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1009, new C4390u.a(m34034B1, str, j11, j10) { // from class: q6.y

            /* renamed from: a */
            public final InterfaceC7806j1.a f37796a;

            /* renamed from: b */
            public final String f37797b;

            /* renamed from: c */
            public final long f37798c;

            /* renamed from: d */
            public final long f37799d;

            {
                this.f37796a = m34034B1;
                this.f37797b = str;
                this.f37798c = j11;
                this.f37799d = j10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33932G1(this.f37796a, this.f37797b, this.f37798c, this.f37799d, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: s */
    public final void mo12542s(final boolean z10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 10, new C4390u.a(m34041v1, z10) { // from class: q6.r

            /* renamed from: a */
            public final InterfaceC7806j1.a f37763a;

            /* renamed from: b */
            public final boolean f37764b;

            {
                this.f37763a = m34041v1;
                this.f37764b = z10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22092O(this.f37763a, this.f37764b);
            }
        });
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: t */
    public final void mo23456t(final C7629w0 c7629w0, final C8639g c8639g) {
        final InterfaceC7806j1.a m34034B1 = m34034B1();
        m34037L2(m34034B1, 1022, new C4390u.a(m34034B1, c7629w0, c8639g) { // from class: q6.m

            /* renamed from: a */
            public final InterfaceC7806j1.a f37737a;

            /* renamed from: b */
            public final C7629w0 f37738b;

            /* renamed from: c */
            public final C8639g f37739c;

            {
                this.f37737a = m34034B1;
                this.f37738b = c7629w0;
                this.f37739c = c8639g;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33927E2(this.f37737a, this.f37738b, this.f37739c, (InterfaceC7806j1) obj);
            }
        });
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: u */
    public /* synthetic */ void mo32525u(C7629w0 c7629w0) {
        C7982i.m34701f(this, c7629w0);
    }

    /* renamed from: u1 */
    public void m34040u1(InterfaceC7806j1 interfaceC7806j1) {
        C4349a.m21882e(interfaceC7806j1);
        this.f37694g.m22250c(interfaceC7806j1);
    }

    @Override // p078e9.InterfaceC4668c0
    /* renamed from: v */
    public /* synthetic */ void mo23457v(C7629w0 c7629w0) {
        C4684r.m23618i(this, c7629w0);
    }

    /* renamed from: v1 */
    public final InterfaceC7806j1.a m34041v1() {
        return m34042w1(this.f37692e.m34050d());
    }

    @Override // p347u6.InterfaceC8796b
    /* renamed from: w */
    public /* synthetic */ void mo12543w(int i10, boolean z10) {
        C7612q1.m32986e(this, i10, z10);
    }

    /* renamed from: w1 */
    public final InterfaceC7806j1.a m34042w1(InterfaceC0127w.a aVar) {
        C4349a.m21882e(this.f37695h);
        AbstractC7574e2 m34052f = aVar == null ? null : this.f37692e.m34052f(aVar);
        if (aVar != null && m34052f != null) {
            return m34043x1(m34052f, m34052f.mo32326h(aVar.f544a, this.f37690c).f36711c, aVar);
        }
        int mo32451i = this.f37695h.mo32451i();
        AbstractC7574e2 mo32467r = this.f37695h.mo32467r();
        if (!(mo32451i < mo32467r.mo512p())) {
            mo32467r = AbstractC7574e2.f36706a;
        }
        return m34043x1(mo32467r, mo32451i, null);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: x */
    public final void mo12544x(final C7561b1 c7561b1, final int i10) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 1, new C4390u.a(m34041v1, c7561b1, i10) { // from class: q6.v

            /* renamed from: a */
            public final InterfaceC7806j1.a f37779a;

            /* renamed from: b */
            public final C7561b1 f37780b;

            /* renamed from: c */
            public final int f37781c;

            {
                this.f37779a = m34041v1;
                this.f37780b = c7561b1;
                this.f37781c = i10;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22146x(this.f37779a, this.f37780b, this.f37781c);
            }
        });
    }

    @RequiresNonNull({"player"})
    /* renamed from: x1 */
    public final InterfaceC7806j1.a m34043x1(AbstractC7574e2 abstractC7574e2, int i10, InterfaceC0127w.a aVar) {
        if (abstractC7574e2.m32667q()) {
            aVar = null;
        }
        long mo21913b = this.f37689b.mo21913b();
        boolean z10 = abstractC7574e2.equals(this.f37695h.mo32467r()) && i10 == this.f37695h.mo32451i();
        long j10 = 0;
        if (aVar != null && aVar.m630b()) {
            if (z10 && this.f37695h.mo32460n() == aVar.f545b && this.f37695h.mo32415F() == aVar.f546c) {
                j10 = this.f37695h.getCurrentPosition();
            }
        } else if (z10) {
            j10 = this.f37695h.mo32417H();
        } else if (!abstractC7574e2.m32667q()) {
            j10 = abstractC7574e2.m32666n(i10, this.f37691d).m32690b();
        }
        return new InterfaceC7806j1.a(mo21913b, abstractC7574e2, i10, aVar, j10, this.f37695h.mo32467r(), this.f37695h.mo32451i(), this.f37692e.m34050d(), this.f37695h.getCurrentPosition(), this.f37695h.mo32442d());
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: y */
    public void mo12545y(final C7565c1 c7565c1) {
        final InterfaceC7806j1.a m34041v1 = m34041v1();
        m34037L2(m34041v1, 15, new C4390u.a(m34041v1, c7565c1) { // from class: q6.a0

            /* renamed from: a */
            public final InterfaceC7806j1.a f37643a;

            /* renamed from: b */
            public final C7565c1 f37644b;

            {
                this.f37643a = m34041v1;
                this.f37644b = c7565c1;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                ((InterfaceC7806j1) obj).mo22078G(this.f37643a, this.f37644b);
            }
        });
    }

    /* renamed from: y1 */
    public final InterfaceC7806j1.a m34044y1() {
        return m34042w1(this.f37692e.m34051e());
    }

    @Override // p301r6.InterfaceC8002t
    /* renamed from: z */
    public final void mo32527z(final C8636d c8636d) {
        final InterfaceC7806j1.a m34033A1 = m34033A1();
        m34037L2(m34033A1, 1014, new C4390u.a(m34033A1, c8636d) { // from class: q6.e

            /* renamed from: a */
            public final InterfaceC7806j1.a f37667a;

            /* renamed from: b */
            public final C8636d f37668b;

            {
                this.f37667a = m34033A1;
                this.f37668b = c8636d;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                C7800h1.m33938I1(this.f37667a, this.f37668b, (InterfaceC7806j1) obj);
            }
        });
    }

    /* renamed from: z1 */
    public final InterfaceC7806j1.a m34045z1(int i10, InterfaceC0127w.a aVar) {
        C4349a.m21882e(this.f37695h);
        boolean z10 = true;
        if (aVar != null) {
            return this.f37692e.m34052f(aVar) != null ? m34042w1(aVar) : m34043x1(AbstractC7574e2.f36706a, i10, aVar);
        }
        AbstractC7574e2 mo32467r = this.f37695h.mo32467r();
        if (i10 >= mo32467r.mo512p()) {
            z10 = false;
        }
        if (!z10) {
            mo32467r = AbstractC7574e2.f36706a;
        }
        return m34043x1(mo32467r, i10, null);
    }
}
