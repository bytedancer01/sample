package p026b8;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p009a8.AbstractC0095g;
import p009a8.C0111o;
import p009a8.C0113p;
import p009a8.InterfaceC0092e0;
import p009a8.InterfaceC0121t;
import p009a8.InterfaceC0127w;
import p026b8.C0820a;
import p026b8.C0825f;
import p026b8.InterfaceC0822c;
import p027b9.C0858p;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0853l0;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p440z8.InterfaceC10075b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b8/f.class
 */
/* renamed from: b8.f */
/* loaded from: combined.jar:classes2.jar:b8/f.class */
public final class C0825f extends AbstractC0095g<InterfaceC0127w.a> {

    /* renamed from: w */
    public static final InterfaceC0127w.a f5703w = new InterfaceC0127w.a(new Object());

    /* renamed from: k */
    public final InterfaceC0127w f5704k;

    /* renamed from: l */
    public final InterfaceC0092e0 f5705l;

    /* renamed from: m */
    public final InterfaceC0822c f5706m;

    /* renamed from: n */
    public final InterfaceC10075b f5707n;

    /* renamed from: o */
    public final C0858p f5708o;

    /* renamed from: p */
    public final Object f5709p;

    /* renamed from: s */
    public d f5712s;

    /* renamed from: t */
    public AbstractC7574e2 f5713t;

    /* renamed from: u */
    public C0820a f5714u;

    /* renamed from: q */
    public final Handler f5710q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    public final AbstractC7574e2.b f5711r = new AbstractC7574e2.b();

    /* renamed from: v */
    public b[][] f5715v = new b[0];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b8/f$a.class
     */
    /* renamed from: b8.f$a */
    /* loaded from: combined.jar:classes2.jar:b8/f$a.class */
    public static final class a extends IOException {

        /* renamed from: b */
        public final int f5716b;

        public a(int i10, Exception exc) {
            super(exc);
            this.f5716b = i10;
        }

        /* renamed from: a */
        public static a m5277a(Exception exc) {
            return new a(0, exc);
        }

        /* renamed from: b */
        public static a m5278b(Exception exc, int i10) {
            return new a(1, new IOException("Failed to load ad group " + i10, exc));
        }

        /* renamed from: c */
        public static a m5279c(Exception exc) {
            return new a(2, exc);
        }

        /* renamed from: d */
        public static a m5280d(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b8/f$b.class
     */
    /* renamed from: b8.f$b */
    /* loaded from: combined.jar:classes2.jar:b8/f$b.class */
    public final class b {

        /* renamed from: a */
        public final InterfaceC0127w.a f5717a;

        /* renamed from: b */
        public final List<C0113p> f5718b = new ArrayList();

        /* renamed from: c */
        public Uri f5719c;

        /* renamed from: d */
        public InterfaceC0127w f5720d;

        /* renamed from: e */
        public AbstractC7574e2 f5721e;

        /* renamed from: f */
        public final C0825f f5722f;

        public b(C0825f c0825f, InterfaceC0127w.a aVar) {
            this.f5722f = c0825f;
            this.f5717a = aVar;
        }

        /* renamed from: a */
        public InterfaceC0121t m5281a(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
            C0113p c0113p = new C0113p(aVar, interfaceC0832b, j10);
            this.f5718b.add(c0113p);
            InterfaceC0127w interfaceC0127w = this.f5720d;
            if (interfaceC0127w != null) {
                c0113p.m534y(interfaceC0127w);
                c0113p.m535z(new c(this.f5722f, (Uri) C4349a.m21882e(this.f5719c)));
            }
            AbstractC7574e2 abstractC7574e2 = this.f5721e;
            if (abstractC7574e2 != null) {
                c0113p.m527e(new InterfaceC0127w.a(abstractC7574e2.mo511m(0), aVar.f547d));
            }
            return c0113p;
        }

        /* renamed from: b */
        public long m5282b() {
            AbstractC7574e2 abstractC7574e2 = this.f5721e;
            return abstractC7574e2 == null ? -9223372036854775807L : abstractC7574e2.m32663f(0, this.f5722f.f5711r).m32679k();
        }

        /* renamed from: c */
        public void m5283c(AbstractC7574e2 abstractC7574e2) {
            C4349a.m21878a(abstractC7574e2.mo509i() == 1);
            if (this.f5721e == null) {
                Object mo511m = abstractC7574e2.mo511m(0);
                for (int i10 = 0; i10 < this.f5718b.size(); i10++) {
                    C0113p c0113p = this.f5718b.get(i10);
                    c0113p.m527e(new InterfaceC0127w.a(mo511m, c0113p.f464b.f547d));
                }
            }
            this.f5721e = abstractC7574e2;
        }

        /* renamed from: d */
        public boolean m5284d() {
            return this.f5720d != null;
        }

        /* renamed from: e */
        public void m5285e(InterfaceC0127w interfaceC0127w, Uri uri) {
            this.f5720d = interfaceC0127w;
            this.f5719c = uri;
            for (int i10 = 0; i10 < this.f5718b.size(); i10++) {
                C0113p c0113p = this.f5718b.get(i10);
                c0113p.m534y(interfaceC0127w);
                c0113p.m535z(new c(this.f5722f, uri));
            }
            this.f5722f.m421K(this.f5717a, interfaceC0127w);
        }

        /* renamed from: f */
        public boolean m5286f() {
            return this.f5718b.isEmpty();
        }

        /* renamed from: g */
        public void m5287g() {
            if (m5284d()) {
                this.f5722f.m422L(this.f5717a);
            }
        }

        /* renamed from: h */
        public void m5288h(C0113p c0113p) {
            this.f5718b.remove(c0113p);
            c0113p.m533x();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b8/f$c.class
     */
    /* renamed from: b8.f$c */
    /* loaded from: combined.jar:classes2.jar:b8/f$c.class */
    public final class c implements C0113p.a {

        /* renamed from: a */
        public final Uri f5723a;

        /* renamed from: b */
        public final C0825f f5724b;

        public c(C0825f c0825f, Uri uri) {
            this.f5724b = c0825f;
            this.f5723a = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m5291e(InterfaceC0127w.a aVar) {
            this.f5724b.f5706m.mo5250d(this.f5724b, aVar.f545b, aVar.f546c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m5292f(InterfaceC0127w.a aVar, IOException iOException) {
            this.f5724b.f5706m.mo5252i(this.f5724b, aVar.f545b, aVar.f546c, iOException);
        }

        @Override // p009a8.C0113p.a
        /* renamed from: a */
        public void mo536a(final InterfaceC0127w.a aVar, final IOException iOException) {
            this.f5724b.m319w(aVar).m394x(new C0111o(C0111o.m525a(), new C0858p(this.f5723a), SystemClock.elapsedRealtime()), 6, a.m5277a(iOException), true);
            this.f5724b.f5710q.post(new Runnable(this, aVar, iOException) { // from class: b8.h

                /* renamed from: b */
                public final C0825f.c f5730b;

                /* renamed from: c */
                public final InterfaceC0127w.a f5731c;

                /* renamed from: d */
                public final IOException f5732d;

                {
                    this.f5730b = this;
                    this.f5731c = aVar;
                    this.f5732d = iOException;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5730b.m5292f(this.f5731c, this.f5732d);
                }
            });
        }

        @Override // p009a8.C0113p.a
        /* renamed from: b */
        public void mo537b(final InterfaceC0127w.a aVar) {
            this.f5724b.f5710q.post(new Runnable(this, aVar) { // from class: b8.g

                /* renamed from: b */
                public final C0825f.c f5728b;

                /* renamed from: c */
                public final InterfaceC0127w.a f5729c;

                {
                    this.f5728b = this;
                    this.f5729c = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5728b.m5291e(this.f5729c);
                }
            });
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b8/f$d.class
     */
    /* renamed from: b8.f$d */
    /* loaded from: combined.jar:classes2.jar:b8/f$d.class */
    public final class d implements InterfaceC0822c.a {

        /* renamed from: a */
        public final Handler f5725a = C4401z0.m22421y();

        /* renamed from: b */
        public volatile boolean f5726b;

        /* renamed from: c */
        public final C0825f f5727c;

        public d(C0825f c0825f) {
            this.f5727c = c0825f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m5294f(C0820a c0820a) {
            if (this.f5726b) {
                return;
            }
            this.f5727c.m5275c0(c0820a);
        }

        @Override // p026b8.InterfaceC0822c.a
        /* renamed from: a */
        public /* synthetic */ void mo5255a() {
            C0821b.m5247a(this);
        }

        @Override // p026b8.InterfaceC0822c.a
        /* renamed from: b */
        public /* synthetic */ void mo5256b() {
            C0821b.m5248b(this);
        }

        @Override // p026b8.InterfaceC0822c.a
        /* renamed from: c */
        public void mo5257c(final C0820a c0820a) {
            if (this.f5726b) {
                return;
            }
            this.f5725a.post(new Runnable(this, c0820a) { // from class: b8.i

                /* renamed from: b */
                public final C0825f.d f5733b;

                /* renamed from: c */
                public final C0820a f5734c;

                {
                    this.f5733b = this;
                    this.f5734c = c0820a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5733b.m5294f(this.f5734c);
                }
            });
        }

        @Override // p026b8.InterfaceC0822c.a
        /* renamed from: d */
        public void mo5258d(a aVar, C0858p c0858p) {
            if (this.f5726b) {
                return;
            }
            this.f5727c.m319w(null).m394x(new C0111o(C0111o.m525a(), c0858p, SystemClock.elapsedRealtime()), 6, aVar, true);
        }

        /* renamed from: g */
        public void m5295g() {
            this.f5726b = true;
            this.f5725a.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [b8.f$b[], b8.f$b[][]] */
    public C0825f(InterfaceC0127w interfaceC0127w, C0858p c0858p, Object obj, InterfaceC0092e0 interfaceC0092e0, InterfaceC0822c interfaceC0822c, InterfaceC10075b interfaceC10075b) {
        this.f5704k = interfaceC0127w;
        this.f5705l = interfaceC0092e0;
        this.f5706m = interfaceC0822c;
        this.f5707n = interfaceC10075b;
        this.f5708o = c0858p;
        this.f5709p = obj;
        interfaceC0822c.mo5251g(interfaceC0092e0.mo407a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m5269Y(d dVar) {
        this.f5706m.mo5249b(this, this.f5708o, this.f5709p, this.f5707n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m5270Z(d dVar) {
        this.f5706m.mo5254l(this, dVar);
    }

    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: B */
    public void mo303B(InterfaceC0853l0 interfaceC0853l0) {
        super.mo303B(interfaceC0853l0);
        final d dVar = new d(this);
        this.f5712s = dVar;
        m421K(f5703w, this.f5704k);
        this.f5710q.post(new Runnable(this, dVar) { // from class: b8.e

            /* renamed from: b */
            public final C0825f f5701b;

            /* renamed from: c */
            public final C0825f.d f5702c;

            {
                this.f5701b = this;
                this.f5702c = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5701b.m5269Y(this.f5702c);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [b8.f$b[], b8.f$b[][]] */
    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: D */
    public void mo305D() {
        super.mo305D();
        final d dVar = (d) C4349a.m21882e(this.f5712s);
        this.f5712s = null;
        dVar.m5295g();
        this.f5713t = null;
        this.f5714u = null;
        this.f5715v = new b[0];
        this.f5710q.post(new Runnable(this, dVar) { // from class: b8.d

            /* renamed from: b */
            public final C0825f f5699b;

            /* renamed from: c */
            public final C0825f.d f5700c;

            {
                this.f5699b = this;
                this.f5700c = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5699b.m5270Z(this.f5700c);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [long[], long[][]] */
    /* renamed from: W */
    public final long[][] m5271W() {
        ?? r02 = new long[this.f5715v.length];
        int i10 = 0;
        while (true) {
            b[][] bVarArr = this.f5715v;
            if (i10 >= bVarArr.length) {
                return r02;
            }
            r02[i10] = new long[bVarArr[i10].length];
            int i11 = 0;
            while (true) {
                b[] bVarArr2 = this.f5715v[i10];
                if (i11 < bVarArr2.length) {
                    b bVar = bVarArr2[i11];
                    r02[i10][i11] = bVar == null ? -9223372036854775807L : bVar.m5282b();
                    i11++;
                }
            }
            i10++;
        }
    }

    @Override // p009a8.AbstractC0095g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public InterfaceC0127w.a mo418F(InterfaceC0127w.a aVar, InterfaceC0127w.a aVar2) {
        if (!aVar.m630b()) {
            aVar = aVar2;
        }
        return aVar;
    }

    /* renamed from: a0 */
    public final void m5273a0() {
        Uri uri;
        C7561b1.e eVar;
        C0820a c0820a = this.f5714u;
        if (c0820a == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f5715v.length; i10++) {
            int i11 = 0;
            while (true) {
                b[] bVarArr = this.f5715v[i10];
                if (i11 < bVarArr.length) {
                    b bVar = bVarArr[i11];
                    C0820a.a m5222b = c0820a.m5222b(i10);
                    if (bVar != null && !bVar.m5284d()) {
                        Uri[] uriArr = m5222b.f5694c;
                        if (i11 < uriArr.length && (uri = uriArr[i11]) != null) {
                            C7561b1.c m32348B = new C7561b1.c().m32348B(uri);
                            C7561b1.g gVar = this.f5704k.mo400d().f36449b;
                            if (gVar != null && (eVar = gVar.f36506c) != null) {
                                m32348B.m32365p(eVar.f36489a);
                                m32348B.m32358i(eVar.m32376a());
                                m32348B.m32360k(eVar.f36490b);
                                m32348B.m32357h(eVar.f36494f);
                                m32348B.m32359j(eVar.f36491c);
                                m32348B.m32362m(eVar.f36492d);
                                m32348B.m32363n(eVar.f36493e);
                                m32348B.m32364o(eVar.f36495g);
                            }
                            bVar.m5285e(this.f5705l.mo409c(m32348B.m32350a()), uri);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    /* renamed from: b0 */
    public final void m5274b0() {
        AbstractC7574e2 abstractC7574e2 = this.f5713t;
        C0820a c0820a = this.f5714u;
        if (c0820a == null || abstractC7574e2 == null) {
            return;
        }
        if (c0820a.f5686b == 0) {
            m304C(abstractC7574e2);
        } else {
            this.f5714u = c0820a.m5228h(m5271W());
            m304C(new C0829j(abstractC7574e2, this.f5714u));
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [b8.f$b[], b8.f$b[][], java.lang.Object[]] */
    /* renamed from: c0 */
    public final void m5275c0(C0820a c0820a) {
        C0820a c0820a2 = this.f5714u;
        boolean z10 = false;
        if (c0820a2 == null) {
            ?? r02 = new b[c0820a.f5686b];
            this.f5715v = r02;
            Arrays.fill((Object[]) r02, new b[0]);
        } else {
            if (c0820a.f5686b == c0820a2.f5686b) {
                z10 = true;
            }
            C4349a.m21884g(z10);
        }
        this.f5714u = c0820a;
        m5273a0();
        m5274b0();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: d */
    public C7561b1 mo400d() {
        return this.f5704k.mo400d();
    }

    @Override // p009a8.AbstractC0095g
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void m417I(InterfaceC0127w.a aVar, InterfaceC0127w interfaceC0127w, AbstractC7574e2 abstractC7574e2) {
        if (aVar.m630b()) {
            ((b) C4349a.m21882e(this.f5715v[aVar.f545b][aVar.f546c])).m5283c(abstractC7574e2);
        } else {
            boolean z10 = true;
            if (abstractC7574e2.mo509i() != 1) {
                z10 = false;
            }
            C4349a.m21878a(z10);
            this.f5713t = abstractC7574e2;
        }
        m5274b0();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: h */
    public InterfaceC0121t mo401h(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        if (((C0820a) C4349a.m21882e(this.f5714u)).f5686b <= 0 || !aVar.m630b()) {
            C0113p c0113p = new C0113p(aVar, interfaceC0832b, j10);
            c0113p.m534y(this.f5704k);
            c0113p.m527e(aVar);
            return c0113p;
        }
        int i10 = aVar.f545b;
        int i11 = aVar.f546c;
        b[][] bVarArr = this.f5715v;
        b[] bVarArr2 = bVarArr[i10];
        if (bVarArr2.length <= i11) {
            bVarArr[i10] = (b[]) Arrays.copyOf(bVarArr2, i11 + 1);
        }
        b bVar = this.f5715v[i10][i11];
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new b(this, aVar);
            this.f5715v[i10][i11] = bVar2;
            m5273a0();
        }
        return bVar2.m5281a(aVar, interfaceC0832b, j10);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: q */
    public void mo403q(InterfaceC0121t interfaceC0121t) {
        C0113p c0113p = (C0113p) interfaceC0121t;
        InterfaceC0127w.a aVar = c0113p.f464b;
        if (!aVar.m630b()) {
            c0113p.m533x();
            return;
        }
        b bVar = (b) C4349a.m21882e(this.f5715v[aVar.f545b][aVar.f546c]);
        bVar.m5288h(c0113p);
        if (bVar.m5286f()) {
            bVar.m5287g();
            this.f5715v[aVar.f545b][aVar.f546c] = null;
        }
    }
}
