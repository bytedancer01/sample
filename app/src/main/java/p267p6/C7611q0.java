package p267p6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.http.protocol.HttpRequestExecutor;
import p009a8.C0083a1;
import p009a8.InterfaceC0092e0;
import p009a8.InterfaceC0124u0;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0840f;
import p059d9.C4349a;
import p059d9.C4376n;
import p059d9.C4390u;
import p059d9.C4392v;
import p059d9.C4401z0;
import p059d9.InterfaceC4354c;
import p059d9.InterfaceC4380p;
import p078e9.C4670d0;
import p099fc.AbstractC4834t;
import p243o8.C6919a;
import p267p6.AbstractC7574e2;
import p267p6.C7591j1;
import p267p6.C7615r1;
import p267p6.C7620t0;
import p267p6.InterfaceC7606o1;
import p267p6.InterfaceC7613r;
import p282q6.C7800h1;
import p283q7.C7839a;
import p421y8.AbstractC9891o;
import p421y8.C9888l;
import p421y8.C9892p;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/q0.class
 */
/* renamed from: p6.q0 */
/* loaded from: combined.jar:classes2.jar:p6/q0.class */
public final class C7611q0 extends AbstractC7571e implements InterfaceC7613r {

    /* renamed from: A */
    public C7558a2 f36927A;

    /* renamed from: B */
    public InterfaceC0124u0 f36928B;

    /* renamed from: C */
    public boolean f36929C;

    /* renamed from: D */
    public InterfaceC7606o1.b f36930D;

    /* renamed from: E */
    public C7565c1 f36931E;

    /* renamed from: F */
    public C7565c1 f36932F;

    /* renamed from: G */
    public C7600m1 f36933G;

    /* renamed from: H */
    public int f36934H;

    /* renamed from: I */
    public int f36935I;

    /* renamed from: J */
    public long f36936J;

    /* renamed from: b */
    public final C9892p f36937b;

    /* renamed from: c */
    public final InterfaceC7606o1.b f36938c;

    /* renamed from: d */
    public final InterfaceC7627v1[] f36939d;

    /* renamed from: e */
    public final AbstractC9891o f36940e;

    /* renamed from: f */
    public final InterfaceC4380p f36941f;

    /* renamed from: g */
    public final C7620t0.f f36942g;

    /* renamed from: h */
    public final C7620t0 f36943h;

    /* renamed from: i */
    public final C4390u<InterfaceC7606o1.c> f36944i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<InterfaceC7613r.a> f36945j;

    /* renamed from: k */
    public final AbstractC7574e2.b f36946k;

    /* renamed from: l */
    public final List<a> f36947l;

    /* renamed from: m */
    public final boolean f36948m;

    /* renamed from: n */
    public final InterfaceC0092e0 f36949n;

    /* renamed from: o */
    public final C7800h1 f36950o;

    /* renamed from: p */
    public final Looper f36951p;

    /* renamed from: q */
    public final InterfaceC0840f f36952q;

    /* renamed from: r */
    public final long f36953r;

    /* renamed from: s */
    public final long f36954s;

    /* renamed from: t */
    public final InterfaceC4354c f36955t;

    /* renamed from: u */
    public int f36956u;

    /* renamed from: v */
    public boolean f36957v;

    /* renamed from: w */
    public int f36958w;

    /* renamed from: x */
    public int f36959x;

    /* renamed from: y */
    public boolean f36960y;

    /* renamed from: z */
    public int f36961z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/q0$a.class
     */
    /* renamed from: p6.q0$a */
    /* loaded from: combined.jar:classes2.jar:p6/q0$a.class */
    public static final class a implements InterfaceC7585h1 {

        /* renamed from: a */
        public final Object f36962a;

        /* renamed from: b */
        public AbstractC7574e2 f36963b;

        public a(Object obj, AbstractC7574e2 abstractC7574e2) {
            this.f36962a = obj;
            this.f36963b = abstractC7574e2;
        }

        @Override // p267p6.InterfaceC7585h1
        /* renamed from: a */
        public Object mo32762a() {
            return this.f36962a;
        }

        @Override // p267p6.InterfaceC7585h1
        /* renamed from: b */
        public AbstractC7574e2 mo32763b() {
            return this.f36963b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C7611q0(InterfaceC7627v1[] interfaceC7627v1Arr, AbstractC9891o abstractC9891o, InterfaceC0092e0 interfaceC0092e0, InterfaceC7557a1 interfaceC7557a1, InterfaceC0840f interfaceC0840f, C7800h1 c7800h1, boolean z10, C7558a2 c7558a2, long j10, long j11, InterfaceC7638z0 interfaceC7638z0, long j12, boolean z11, InterfaceC4354c interfaceC4354c, Looper looper, InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.b bVar) {
        C4392v.m22273g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.0] [" + C4401z0.f26683e + "]");
        C4349a.m21884g(interfaceC7627v1Arr.length > 0);
        this.f36939d = (InterfaceC7627v1[]) C4349a.m21882e(interfaceC7627v1Arr);
        this.f36940e = (AbstractC9891o) C4349a.m21882e(abstractC9891o);
        this.f36949n = interfaceC0092e0;
        this.f36952q = interfaceC0840f;
        this.f36950o = c7800h1;
        this.f36948m = z10;
        this.f36927A = c7558a2;
        this.f36953r = j10;
        this.f36954s = j11;
        this.f36929C = z11;
        this.f36951p = looper;
        this.f36955t = interfaceC4354c;
        this.f36956u = 0;
        InterfaceC7606o1 interfaceC7606o12 = interfaceC7606o1 != null ? interfaceC7606o1 : this;
        final InterfaceC7606o1 interfaceC7606o13 = interfaceC7606o12;
        this.f36944i = new C4390u<>(looper, interfaceC4354c, new C4390u.b(interfaceC7606o13) { // from class: p6.e0

            /* renamed from: a */
            public final InterfaceC7606o1 f36696a;

            {
                this.f36696a = interfaceC7606o13;
            }

            @Override // p059d9.C4390u.b
            /* renamed from: a */
            public final void mo22259a(Object obj, C4376n c4376n) {
                C7611q0.m32906Z0(this.f36696a, (InterfaceC7606o1.c) obj, c4376n);
            }
        });
        this.f36945j = new CopyOnWriteArraySet<>();
        this.f36947l = new ArrayList();
        this.f36928B = new InterfaceC0124u0.a(0);
        C9892p c9892p = new C9892p(new C7636y1[interfaceC7627v1Arr.length], new InterfaceC9884h[interfaceC7627v1Arr.length], null);
        this.f36937b = c9892p;
        this.f36946k = new AbstractC7574e2.b();
        InterfaceC7606o1.b m32871e = new InterfaceC7606o1.b.a().m32869c(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).m32868b(bVar).m32871e();
        this.f36938c = m32871e;
        this.f36930D = new InterfaceC7606o1.b.a().m32868b(m32871e).m32867a(3).m32867a(9).m32871e();
        C7565c1 c7565c1 = C7565c1.f36596E;
        this.f36931E = c7565c1;
        this.f36932F = c7565c1;
        this.f36934H = -1;
        this.f36941f = interfaceC4354c.mo21915d(looper, null);
        C7620t0.f fVar = new C7620t0.f(this) { // from class: p6.f0

            /* renamed from: a */
            public final C7611q0 f36749a;

            {
                this.f36749a = this;
            }

            @Override // p267p6.C7620t0.f
            /* renamed from: a */
            public final void mo32716a(C7620t0.e eVar) {
                this.f36749a.m32908b1(eVar);
            }
        };
        this.f36942g = fVar;
        this.f36933G = C7600m1.m32842k(c9892p);
        if (c7800h1 != null) {
            c7800h1.m34038M2(interfaceC7606o12, looper);
            mo32447g(c7800h1);
            interfaceC0840f.mo5340c(new Handler(looper), c7800h1);
        }
        this.f36943h = new C7620t0(interfaceC7627v1Arr, abstractC9891o, c9892p, interfaceC7557a1, interfaceC0840f, this.f36956u, this.f36957v, c7800h1, c7558a2, interfaceC7638z0, j12, z11, looper, interfaceC4354c, fVar);
    }

    /* renamed from: W0 */
    public static long m32904W0(C7600m1 c7600m1) {
        AbstractC7574e2.c cVar = new AbstractC7574e2.c();
        AbstractC7574e2.b bVar = new AbstractC7574e2.b();
        c7600m1.f36864a.mo32326h(c7600m1.f36865b.f544a, bVar);
        return c7600m1.f36866c == -9223372036854775807L ? c7600m1.f36864a.m32666n(bVar.f36711c, cVar).m32691c() : bVar.m32683o() + c7600m1.f36866c;
    }

    /* renamed from: Y0 */
    public static boolean m32905Y0(C7600m1 c7600m1) {
        return c7600m1.f36868e == 3 && c7600m1.f36875l && c7600m1.f36876m == 0;
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m32906Z0(InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.c cVar, C4376n c4376n) {
        cVar.mo12515C(interfaceC7606o1, new InterfaceC7606o1.d(c4376n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ void m32908b1(final C7620t0.e eVar) {
        this.f36941f.mo22202h(new Runnable(this, eVar) { // from class: p6.g0

            /* renamed from: b */
            public final C7611q0 f36757b;

            /* renamed from: c */
            public final C7620t0.e f36758c;

            {
                this.f36757b = this;
                this.f36758c = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f36757b.m32907a1(this.f36758c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ void m32909c1(InterfaceC7606o1.c cVar) {
        cVar.mo12545y(this.f36931E);
    }

    /* renamed from: d1 */
    public static /* synthetic */ void m32910d1(InterfaceC7606o1.c cVar) {
        cVar.mo12514A(C7607p.m32877g(new C7626v0(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m32913g1(InterfaceC7606o1.c cVar) {
        cVar.mo12523Q(this.f36930D);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m32917i1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12524R(c7600m1.f36869f);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m32919j1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12514A(c7600m1.f36869f);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m32921k1(C7600m1 c7600m1, C9888l c9888l, InterfaceC7606o1.c cVar) {
        cVar.mo12533e0(c7600m1.f36871h, c9888l);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m32923l1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12538j(c7600m1.f36873j);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m32927n1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12536h(c7600m1.f36870g);
        cVar.mo12521N(c7600m1.f36870g);
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m32929o1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12526Y(c7600m1.f36875l, c7600m1.f36868e);
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m32931p1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12539m(c7600m1.f36868e);
    }

    /* renamed from: q1 */
    public static /* synthetic */ void m32933q1(C7600m1 c7600m1, int i10, InterfaceC7606o1.c cVar) {
        cVar.mo12535g0(c7600m1.f36875l, i10);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m32935r1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12534f(c7600m1.f36876m);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m32937s1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12540m0(m32905Y0(c7600m1));
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m32939t1(C7600m1 c7600m1, InterfaceC7606o1.c cVar) {
        cVar.mo12532e(c7600m1.f36877n);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m32941u1(C7600m1 c7600m1, int i10, InterfaceC7606o1.c cVar) {
        cVar.mo12541p(c7600m1.f36864a, i10);
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m32943v1(int i10, InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, InterfaceC7606o1.c cVar) {
        cVar.mo12520M(i10);
        cVar.mo12537i0(fVar, fVar2, i10);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: A */
    public void mo32410A(InterfaceC7606o1.e eVar) {
        m32948A1(eVar);
    }

    /* renamed from: A1 */
    public void m32948A1(InterfaceC7606o1.c cVar) {
        this.f36944i.m22256j(cVar);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: B */
    public int mo32411B() {
        return HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE;
    }

    /* renamed from: B1 */
    public final C7600m1 m32949B1(int i10, int i11) {
        C4349a.m21878a(i10 >= 0 && i11 >= i10 && i11 <= this.f36947l.size());
        int mo32451i = mo32451i();
        AbstractC7574e2 mo32467r = mo32467r();
        int size = this.f36947l.size();
        this.f36958w++;
        m32950C1(i10, i11);
        AbstractC7574e2 m32960I0 = m32960I0();
        C7600m1 m32977w1 = m32977w1(this.f36933G, m32960I0, m32971R0(mo32467r, m32960I0));
        int i12 = m32977w1.f36868e;
        boolean z10 = false;
        if (i12 != 1) {
            z10 = false;
            if (i12 != 4) {
                z10 = false;
                if (i10 < i11) {
                    z10 = false;
                    if (i11 == size) {
                        z10 = false;
                        if (mo32451i >= m32977w1.f36864a.mo512p()) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        C7600m1 c7600m1 = m32977w1;
        if (z10) {
            c7600m1 = m32977w1.m32851h(4);
        }
        this.f36943h.m33120o0(i10, i11, this.f36928B);
        return c7600m1;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: C */
    public int mo32412C() {
        if (this.f36933G.f36864a.m32667q()) {
            return this.f36935I;
        }
        C7600m1 c7600m1 = this.f36933G;
        return c7600m1.f36864a.mo506b(c7600m1.f36865b.f544a);
    }

    /* renamed from: C1 */
    public final void m32950C1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f36947l.remove(i12);
        }
        this.f36928B = this.f36928B.mo631a(i10, i11);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: D */
    public void mo32413D(TextureView textureView) {
    }

    /* renamed from: D1 */
    public void m32951D1(List<C7561b1> list, boolean z10) {
        m32953E1(m32962J0(list), z10);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: E */
    public C4670d0 mo32414E() {
        return C4670d0.f27557e;
    }

    /* renamed from: E0 */
    public void m32952E0(InterfaceC7613r.a aVar) {
        this.f36945j.add(aVar);
    }

    /* renamed from: E1 */
    public void m32953E1(List<InterfaceC0127w> list, boolean z10) {
        m32955F1(list, -1, -9223372036854775807L, z10);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: F */
    public int mo32415F() {
        return mo32436a() ? this.f36933G.f36865b.f546c : -1;
    }

    /* renamed from: F0 */
    public void m32954F0(InterfaceC7606o1.c cVar) {
        this.f36944i.m22250c(cVar);
    }

    /* renamed from: F1 */
    public final void m32955F1(List<InterfaceC0127w> list, int i10, long j10, boolean z10) {
        int m32970Q0 = m32970Q0();
        long currentPosition = getCurrentPosition();
        this.f36958w++;
        if (!this.f36947l.isEmpty()) {
            m32950C1(0, this.f36947l.size());
        }
        List<C7591j1.c> m32956G0 = m32956G0(0, list);
        AbstractC7574e2 m32960I0 = m32960I0();
        if (!m32960I0.m32667q() && i10 >= m32960I0.mo512p()) {
            throw new C7635y0(m32960I0, i10, j10);
        }
        if (z10) {
            i10 = m32960I0.mo505a(this.f36957v);
            j10 = -9223372036854775807L;
        } else if (i10 == -1) {
            i10 = m32970Q0;
            j10 = currentPosition;
        }
        C7600m1 m32977w1 = m32977w1(this.f36933G, m32960I0, m32972S0(m32960I0, i10, j10));
        int i11 = m32977w1.f36868e;
        int i12 = i11;
        if (i10 != -1) {
            i12 = i11;
            if (i11 != 1) {
                i12 = (m32960I0.m32667q() || i10 >= m32960I0.mo512p()) ? 4 : 2;
            }
        }
        C7600m1 m32851h = m32977w1.m32851h(i12);
        this.f36943h.m33065N0(m32956G0, i10, C7583h.m32760d(j10), this.f36928B);
        m32963J1(m32851h, 0, 1, false, (this.f36933G.f36865b.f544a.equals(m32851h.f36865b.f544a) || this.f36933G.f36864a.m32667q()) ? false : true, 4, m32969P0(m32851h), -1);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: G */
    public long mo32416G() {
        return this.f36954s;
    }

    /* renamed from: G0 */
    public final List<C7591j1.c> m32956G0(int i10, List<InterfaceC0127w> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C7591j1.c cVar = new C7591j1.c(list.get(i11), this.f36948m);
            arrayList.add(cVar);
            this.f36947l.add(i11 + i10, new a(cVar.f36808b, cVar.f36807a.m562Q()));
        }
        this.f36928B = this.f36928B.mo637g(i10, arrayList.size());
        return arrayList;
    }

    /* renamed from: G1 */
    public void m32957G1(boolean z10, int i10, int i11) {
        C7600m1 c7600m1 = this.f36933G;
        if (c7600m1.f36875l == z10 && c7600m1.f36876m == i10) {
            return;
        }
        this.f36958w++;
        C7600m1 m32848e = c7600m1.m32848e(z10, i10);
        this.f36943h.m33070Q0(z10, i10);
        m32963J1(m32848e, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: H */
    public long mo32417H() {
        if (!mo32436a()) {
            return getCurrentPosition();
        }
        C7600m1 c7600m1 = this.f36933G;
        c7600m1.f36864a.mo32326h(c7600m1.f36865b.f544a, this.f36946k);
        C7600m1 c7600m12 = this.f36933G;
        return c7600m12.f36866c == -9223372036854775807L ? c7600m12.f36864a.m32666n(mo32451i(), this.f36695a).m32690b() : this.f36946k.m32682n() + C7583h.m32761e(this.f36933G.f36866c);
    }

    /* renamed from: H0 */
    public void m32958H0(int i10, List<InterfaceC0127w> list) {
        C4349a.m21878a(i10 >= 0);
        AbstractC7574e2 mo32467r = mo32467r();
        this.f36958w++;
        List<C7591j1.c> m32956G0 = m32956G0(i10, list);
        AbstractC7574e2 m32960I0 = m32960I0();
        C7600m1 m32977w1 = m32977w1(this.f36933G, m32960I0, m32971R0(mo32467r, m32960I0));
        this.f36943h.m33110l(i10, m32956G0, this.f36928B);
        m32963J1(m32977w1, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    /* renamed from: H1 */
    public void m32959H1(boolean z10, C7607p c7607p) {
        C7600m1 m32845b;
        if (z10) {
            m32845b = m32949B1(0, this.f36947l.size()).m32849f(null);
        } else {
            C7600m1 c7600m1 = this.f36933G;
            m32845b = c7600m1.m32845b(c7600m1.f36865b);
            m32845b.f36880q = m32845b.f36882s;
            m32845b.f36881r = 0L;
        }
        C7600m1 m32851h = m32845b.m32851h(1);
        C7600m1 c7600m12 = m32851h;
        if (c7607p != null) {
            c7600m12 = m32851h.m32849f(c7607p);
        }
        this.f36958w++;
        this.f36943h.m33102h1();
        m32963J1(c7600m12, 0, 1, false, c7600m12.f36864a.m32667q() && !this.f36933G.f36864a.m32667q(), 4, m32969P0(c7600m12), -1);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: I */
    public void mo32418I(int i10, List<C7561b1> list) {
        m32958H0(Math.min(i10, this.f36947l.size()), m32962J0(list));
    }

    /* renamed from: I0 */
    public final AbstractC7574e2 m32960I0() {
        return new C7618s1(this.f36947l, this.f36928B);
    }

    /* renamed from: I1 */
    public final void m32961I1() {
        InterfaceC7606o1.b bVar = this.f36930D;
        InterfaceC7606o1.b m32640R = m32640R(this.f36938c);
        this.f36930D = m32640R;
        if (m32640R.equals(bVar)) {
            return;
        }
        this.f36944i.m22254h(14, new C4390u.a(this) { // from class: p6.h0

            /* renamed from: a */
            public final C7611q0 f36781a;

            {
                this.f36781a = this;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                this.f36781a.m32913g1((InterfaceC7606o1.c) obj);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: J */
    public void mo32419J(SurfaceView surfaceView) {
    }

    /* renamed from: J0 */
    public final List<InterfaceC0127w> m32962J0(List<C7561b1> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f36949n.mo409c(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: J1 */
    public final void m32963J1(final C7600m1 c7600m1, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13) {
        C7600m1 c7600m12 = this.f36933G;
        this.f36933G = c7600m1;
        Pair<Boolean, Integer> m32965L0 = m32965L0(c7600m1, c7600m12, z11, i12, !c7600m12.f36864a.equals(c7600m1.f36864a));
        boolean booleanValue = ((Boolean) m32965L0.first).booleanValue();
        final int intValue = ((Integer) m32965L0.second).intValue();
        C7565c1 c7565c1 = this.f36931E;
        C7561b1 c7561b1 = null;
        if (booleanValue) {
            c7561b1 = null;
            if (!c7600m1.f36864a.m32667q()) {
                c7561b1 = c7600m1.f36864a.m32666n(c7600m1.f36864a.mo32326h(c7600m1.f36865b.f544a, this.f36946k).f36711c, this.f36695a).f36722c;
            }
            c7565c1 = c7561b1 != null ? c7561b1.f36451d : C7565c1.f36596E;
        }
        C7565c1 c7565c12 = c7565c1;
        if (!c7600m12.f36873j.equals(c7600m1.f36873j)) {
            c7565c12 = c7565c1.m32528a().m32562H(c7600m1.f36873j).m32560F();
        }
        boolean equals = c7565c12.equals(this.f36931E);
        this.f36931E = c7565c12;
        if (!c7600m12.f36864a.equals(c7600m1.f36864a)) {
            this.f36944i.m22254h(0, new C4390u.a(c7600m1, i10) { // from class: p6.d0

                /* renamed from: a */
                public final C7600m1 f36677a;

                /* renamed from: b */
                public final int f36678b;

                {
                    this.f36677a = c7600m1;
                    this.f36678b = i10;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32941u1(this.f36677a, this.f36678b, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (z11) {
            final InterfaceC7606o1.f m32975V0 = m32975V0(i12, c7600m12, i13);
            final InterfaceC7606o1.f m32974U0 = m32974U0(j10);
            this.f36944i.m22254h(12, new C4390u.a(i12, m32975V0, m32974U0) { // from class: p6.o0

                /* renamed from: a */
                public final int f36899a;

                /* renamed from: b */
                public final InterfaceC7606o1.f f36900b;

                /* renamed from: c */
                public final InterfaceC7606o1.f f36901c;

                {
                    this.f36899a = i12;
                    this.f36900b = m32975V0;
                    this.f36901c = m32974U0;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32943v1(this.f36899a, this.f36900b, this.f36901c, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (booleanValue) {
            final C7561b1 c7561b12 = c7561b1;
            this.f36944i.m22254h(1, new C4390u.a(c7561b12, intValue) { // from class: p6.p0

                /* renamed from: a */
                public final C7561b1 f36925a;

                /* renamed from: b */
                public final int f36926b;

                {
                    this.f36925a = c7561b12;
                    this.f36926b = intValue;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    ((InterfaceC7606o1.c) obj).mo12544x(this.f36925a, this.f36926b);
                }
            });
        }
        if (c7600m12.f36869f != c7600m1.f36869f) {
            this.f36944i.m22254h(11, new C4390u.a(c7600m1) { // from class: p6.t

                /* renamed from: a */
                public final C7600m1 f36989a;

                {
                    this.f36989a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32917i1(this.f36989a, (InterfaceC7606o1.c) obj);
                }
            });
            if (c7600m1.f36869f != null) {
                this.f36944i.m22254h(11, new C4390u.a(c7600m1) { // from class: p6.u

                    /* renamed from: a */
                    public final C7600m1 f37060a;

                    {
                        this.f37060a = c7600m1;
                    }

                    @Override // p059d9.C4390u.a
                    /* renamed from: d */
                    public final void mo22258d(Object obj) {
                        C7611q0.m32919j1(this.f37060a, (InterfaceC7606o1.c) obj);
                    }
                });
            }
        }
        C9892p c9892p = c7600m12.f36872i;
        C9892p c9892p2 = c7600m1.f36872i;
        if (c9892p != c9892p2) {
            this.f36940e.mo41703d(c9892p2.f45512d);
            final C9888l c9888l = new C9888l(c7600m1.f36872i.f45511c);
            this.f36944i.m22254h(2, new C4390u.a(c7600m1, c9888l) { // from class: p6.v

                /* renamed from: a */
                public final C7600m1 f37064a;

                /* renamed from: b */
                public final C9888l f37065b;

                {
                    this.f37064a = c7600m1;
                    this.f37065b = c9888l;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32921k1(this.f37064a, this.f37065b, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (!c7600m12.f36873j.equals(c7600m1.f36873j)) {
            this.f36944i.m22254h(3, new C4390u.a(c7600m1) { // from class: p6.w

                /* renamed from: a */
                public final C7600m1 f37067a;

                {
                    this.f37067a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32923l1(this.f37067a, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (!equals) {
            final C7565c1 c7565c13 = this.f36931E;
            this.f36944i.m22254h(15, new C4390u.a(c7565c13) { // from class: p6.x

                /* renamed from: a */
                public final C7565c1 f37130a;

                {
                    this.f37130a = c7565c13;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    ((InterfaceC7606o1.c) obj).mo12545y(this.f37130a);
                }
            });
        }
        if (c7600m12.f36870g != c7600m1.f36870g) {
            this.f36944i.m22254h(4, new C4390u.a(c7600m1) { // from class: p6.y

                /* renamed from: a */
                public final C7600m1 f37133a;

                {
                    this.f37133a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32927n1(this.f37133a, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (c7600m12.f36868e != c7600m1.f36868e || c7600m12.f36875l != c7600m1.f36875l) {
            this.f36944i.m22254h(-1, new C4390u.a(c7600m1) { // from class: p6.z

                /* renamed from: a */
                public final C7600m1 f37139a;

                {
                    this.f37139a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32929o1(this.f37139a, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (c7600m12.f36868e != c7600m1.f36868e) {
            this.f36944i.m22254h(5, new C4390u.a(c7600m1) { // from class: p6.i0

                /* renamed from: a */
                public final C7600m1 f36782a;

                {
                    this.f36782a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32931p1(this.f36782a, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (c7600m12.f36875l != c7600m1.f36875l) {
            this.f36944i.m22254h(6, new C4390u.a(c7600m1, i11) { // from class: p6.j0

                /* renamed from: a */
                public final C7600m1 f36787a;

                /* renamed from: b */
                public final int f36788b;

                {
                    this.f36787a = c7600m1;
                    this.f36788b = i11;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32933q1(this.f36787a, this.f36788b, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (c7600m12.f36876m != c7600m1.f36876m) {
            this.f36944i.m22254h(7, new C4390u.a(c7600m1) { // from class: p6.k0

                /* renamed from: a */
                public final C7600m1 f36838a;

                {
                    this.f36838a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32935r1(this.f36838a, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (m32905Y0(c7600m12) != m32905Y0(c7600m1)) {
            this.f36944i.m22254h(8, new C4390u.a(c7600m1) { // from class: p6.l0

                /* renamed from: a */
                public final C7600m1 f36852a;

                {
                    this.f36852a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32937s1(this.f36852a, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (!c7600m12.f36877n.equals(c7600m1.f36877n)) {
            this.f36944i.m22254h(13, new C4390u.a(c7600m1) { // from class: p6.m0

                /* renamed from: a */
                public final C7600m1 f36862a;

                {
                    this.f36862a = c7600m1;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32939t1(this.f36862a, (InterfaceC7606o1.c) obj);
                }
            });
        }
        if (z10) {
            this.f36944i.m22254h(-1, new C4390u.a() { // from class: p6.n0
                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    ((InterfaceC7606o1.c) obj).mo12522O();
                }
            });
        }
        m32961I1();
        this.f36944i.m22252e();
        if (c7600m12.f36878o != c7600m1.f36878o) {
            Iterator<InterfaceC7613r.a> it = this.f36945j.iterator();
            while (it.hasNext()) {
                it.next().mo32516K(c7600m1.f36878o);
            }
        }
        if (c7600m12.f36879p != c7600m1.f36879p) {
            Iterator<InterfaceC7613r.a> it2 = this.f36945j.iterator();
            while (it2.hasNext()) {
                it2.next().mo32512D(c7600m1.f36879p);
            }
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: K */
    public boolean mo32420K() {
        return this.f36957v;
    }

    /* renamed from: K0 */
    public C7615r1 m32964K0(C7615r1.b bVar) {
        return new C7615r1(this.f36943h, bVar, this.f36933G.f36864a, mo32451i(), this.f36955t, this.f36943h.m33042C());
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: L */
    public long mo32421L() {
        if (this.f36933G.f36864a.m32667q()) {
            return this.f36936J;
        }
        C7600m1 c7600m1 = this.f36933G;
        if (c7600m1.f36874k.f547d != c7600m1.f36865b.f547d) {
            return c7600m1.f36864a.m32666n(mo32451i(), this.f36695a).m32692d();
        }
        long j10 = c7600m1.f36880q;
        if (this.f36933G.f36874k.m630b()) {
            C7600m1 c7600m12 = this.f36933G;
            AbstractC7574e2.b mo32326h = c7600m12.f36864a.mo32326h(c7600m12.f36874k.f544a, this.f36946k);
            j10 = mo32326h.m32674f(this.f36933G.f36874k.f545b);
            if (j10 == Long.MIN_VALUE) {
                j10 = mo32326h.f36712d;
            }
        }
        C7600m1 c7600m13 = this.f36933G;
        return C7583h.m32761e(m32979y1(c7600m13.f36864a, c7600m13.f36874k, j10));
    }

    /* renamed from: L0 */
    public final Pair<Boolean, Integer> m32965L0(C7600m1 c7600m1, C7600m1 c7600m12, boolean z10, int i10, boolean z11) {
        int i11;
        AbstractC7574e2 abstractC7574e2 = c7600m12.f36864a;
        AbstractC7574e2 abstractC7574e22 = c7600m1.f36864a;
        if (abstractC7574e22.m32667q() && abstractC7574e2.m32667q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        if (abstractC7574e22.m32667q() != abstractC7574e2.m32667q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (abstractC7574e2.m32666n(abstractC7574e2.mo32326h(c7600m12.f36865b.f544a, this.f36946k).f36711c, this.f36695a).f36720a.equals(abstractC7574e22.m32666n(abstractC7574e22.mo32326h(c7600m1.f36865b.f544a, this.f36946k).f36711c, this.f36695a).f36720a)) {
            return (z10 && i10 == 0 && c7600m12.f36865b.f547d < c7600m1.f36865b.f547d) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else {
            if (!z11) {
                throw new IllegalStateException();
            }
            i11 = 3;
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    /* renamed from: M0 */
    public boolean m32966M0() {
        return this.f36933G.f36879p;
    }

    /* renamed from: N0 */
    public void m32967N0(long j10) {
        this.f36943h.m33134v(j10);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: O */
    public C7565c1 mo32424O() {
        return this.f36931E;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public AbstractC4834t<C6919a> mo32458m() {
        return AbstractC4834t.m24539E();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: P */
    public long mo32426P() {
        return this.f36953r;
    }

    /* renamed from: P0 */
    public final long m32969P0(C7600m1 c7600m1) {
        return c7600m1.f36864a.m32667q() ? C7583h.m32760d(this.f36936J) : c7600m1.f36865b.m630b() ? c7600m1.f36882s : m32979y1(c7600m1.f36864a, c7600m1.f36865b, c7600m1.f36882s);
    }

    /* renamed from: Q0 */
    public final int m32970Q0() {
        if (this.f36933G.f36864a.m32667q()) {
            return this.f36934H;
        }
        C7600m1 c7600m1 = this.f36933G;
        return c7600m1.f36864a.mo32326h(c7600m1.f36865b.f544a, this.f36946k).f36711c;
    }

    /* renamed from: R0 */
    public final Pair<Object, Long> m32971R0(AbstractC7574e2 abstractC7574e2, AbstractC7574e2 abstractC7574e22) {
        long mo32417H = mo32417H();
        int i10 = -1;
        if (abstractC7574e2.m32667q() || abstractC7574e22.m32667q()) {
            boolean z10 = !abstractC7574e2.m32667q() && abstractC7574e22.m32667q();
            if (!z10) {
                i10 = m32970Q0();
            }
            if (z10) {
                mo32417H = -9223372036854775807L;
            }
            return m32972S0(abstractC7574e22, i10, mo32417H);
        }
        Pair<Object, Long> m32664j = abstractC7574e2.m32664j(this.f36695a, this.f36946k, mo32451i(), C7583h.m32760d(mo32417H));
        Object obj = ((Pair) C4401z0.m22391j(m32664j)).first;
        if (abstractC7574e22.mo506b(obj) != -1) {
            return m32664j;
        }
        Object m33037z0 = C7620t0.m33037z0(this.f36695a, this.f36946k, this.f36956u, this.f36957v, obj, abstractC7574e2, abstractC7574e22);
        if (m33037z0 == null) {
            return m32972S0(abstractC7574e22, -1, -9223372036854775807L);
        }
        abstractC7574e22.mo32326h(m33037z0, this.f36946k);
        int i11 = this.f36946k.f36711c;
        return m32972S0(abstractC7574e22, i11, abstractC7574e22.m32666n(i11, this.f36695a).m32690b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r9 >= r8.mo512p()) goto L13;
     */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.lang.Object, java.lang.Long> m32972S0(p267p6.AbstractC7574e2 r8, int r9, long r10) {
        /*
            r7 = this;
            r0 = r8
            boolean r0 = r0.m32667q()
            if (r0 == 0) goto L27
            r0 = r7
            r1 = r9
            r0.f36934H = r1
            r0 = r10
            r13 = r0
            r0 = r10
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1a
            r0 = 0
            r13 = r0
        L1a:
            r0 = r7
            r1 = r13
            r0.f36936J = r1
            r0 = r7
            r1 = 0
            r0.f36935I = r1
            r0 = 0
            return r0
        L27:
            r0 = r9
            r1 = -1
            if (r0 == r1) goto L37
            r0 = r9
            r12 = r0
            r0 = r9
            r1 = r8
            int r1 = r1.mo512p()
            if (r0 < r1) goto L4f
        L37:
            r0 = r8
            r1 = r7
            boolean r1 = r1.f36957v
            int r0 = r0.mo505a(r1)
            r12 = r0
            r0 = r8
            r1 = r12
            r2 = r7
            p6.e2$c r2 = r2.f36695a
            p6.e2$c r0 = r0.m32666n(r1, r2)
            long r0 = r0.m32690b()
            r10 = r0
        L4f:
            r0 = r8
            r1 = r7
            p6.e2$c r1 = r1.f36695a
            r2 = r7
            p6.e2$b r2 = r2.f36946k
            r3 = r12
            r4 = r10
            long r4 = p267p6.C7583h.m32760d(r4)
            android.util.Pair r0 = r0.m32664j(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7611q0.m32972S0(p6.e2, int, long):android.util.Pair");
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C7607p mo32454k() {
        return this.f36933G.f36869f;
    }

    /* renamed from: U0 */
    public final InterfaceC7606o1.f m32974U0(long j10) {
        Object obj;
        int i10;
        int mo32451i = mo32451i();
        Object obj2 = null;
        if (this.f36933G.f36864a.m32667q()) {
            obj = null;
            i10 = -1;
        } else {
            C7600m1 c7600m1 = this.f36933G;
            obj = c7600m1.f36865b.f544a;
            c7600m1.f36864a.mo32326h(obj, this.f36946k);
            i10 = this.f36933G.f36864a.mo506b(obj);
            obj2 = this.f36933G.f36864a.m32666n(mo32451i, this.f36695a).f36720a;
        }
        long m32761e = C7583h.m32761e(j10);
        long m32761e2 = this.f36933G.f36865b.m630b() ? C7583h.m32761e(m32904W0(this.f36933G)) : m32761e;
        InterfaceC0127w.a aVar = this.f36933G.f36865b;
        return new InterfaceC7606o1.f(obj2, mo32451i, obj, i10, m32761e, m32761e2, aVar.f545b, aVar.f546c);
    }

    /* renamed from: V0 */
    public final InterfaceC7606o1.f m32975V0(int i10, C7600m1 c7600m1, int i11) {
        Object obj;
        Object obj2;
        int i12;
        long j10;
        long j11;
        AbstractC7574e2.b bVar = new AbstractC7574e2.b();
        if (c7600m1.f36864a.m32667q()) {
            obj = null;
            obj2 = null;
            i12 = -1;
        } else {
            obj2 = c7600m1.f36865b.f544a;
            c7600m1.f36864a.mo32326h(obj2, bVar);
            i11 = bVar.f36711c;
            i12 = c7600m1.f36864a.mo506b(obj2);
            obj = c7600m1.f36864a.m32666n(i11, this.f36695a).f36720a;
        }
        if (i10 == 0) {
            long j12 = bVar.f36713e + bVar.f36712d;
            if (c7600m1.f36865b.m630b()) {
                InterfaceC0127w.a aVar = c7600m1.f36865b;
                j10 = bVar.m32670b(aVar.f545b, aVar.f546c);
                j11 = m32904W0(c7600m1);
            } else {
                j10 = j12;
                if (c7600m1.f36865b.f548e != -1) {
                    j10 = j12;
                    if (this.f36933G.f36865b.m630b()) {
                        j10 = m32904W0(this.f36933G);
                    }
                }
                j11 = j10;
            }
        } else if (c7600m1.f36865b.m630b()) {
            j10 = c7600m1.f36882s;
            j11 = m32904W0(c7600m1);
        } else {
            j10 = bVar.f36713e + c7600m1.f36882s;
            j11 = j10;
        }
        long m32761e = C7583h.m32761e(j10);
        long m32761e2 = C7583h.m32761e(j11);
        InterfaceC0127w.a aVar2 = c7600m1.f36865b;
        return new InterfaceC7606o1.f(obj, i11, obj2, i12, m32761e, m32761e2, aVar2.f545b, aVar2.f546c);
    }

    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public final void m32907a1(C7620t0.e eVar) {
        long j10;
        boolean z10;
        int i10 = this.f36958w - eVar.f37046c;
        this.f36958w = i10;
        if (eVar.f37047d) {
            this.f36959x = eVar.f37048e;
            this.f36960y = true;
        }
        if (eVar.f37049f) {
            this.f36961z = eVar.f37050g;
        }
        if (i10 == 0) {
            AbstractC7574e2 abstractC7574e2 = eVar.f37045b.f36864a;
            if (!this.f36933G.f36864a.m32667q() && abstractC7574e2.m32667q()) {
                this.f36934H = -1;
                this.f36936J = 0L;
                this.f36935I = 0;
            }
            if (!abstractC7574e2.m32667q()) {
                List<AbstractC7574e2> m33023E = ((C7618s1) abstractC7574e2).m33023E();
                C4349a.m21884g(m33023E.size() == this.f36947l.size());
                for (int i11 = 0; i11 < m33023E.size(); i11++) {
                    this.f36947l.get(i11).f36963b = m33023E.get(i11);
                }
            }
            if (this.f36960y) {
                z10 = eVar.f37045b.f36865b.equals(this.f36933G.f36865b) ? eVar.f37045b.f36867d != this.f36933G.f36882s : true;
                if (!z10) {
                    j10 = -9223372036854775807L;
                } else if (abstractC7574e2.m32667q() || eVar.f37045b.f36865b.m630b()) {
                    j10 = eVar.f37045b.f36867d;
                } else {
                    C7600m1 c7600m1 = eVar.f37045b;
                    j10 = m32979y1(abstractC7574e2, c7600m1.f36865b, c7600m1.f36867d);
                }
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.f36960y = false;
            m32963J1(eVar.f37045b, 1, this.f36961z, false, z10, this.f36959x, j10, -1);
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: a */
    public boolean mo32436a() {
        return this.f36933G.f36865b.m630b();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: b */
    public C7603n1 mo32438b() {
        return this.f36933G.f36877n;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: c */
    public void mo32440c(C7603n1 c7603n1) {
        C7603n1 c7603n12 = c7603n1;
        if (c7603n1 == null) {
            c7603n12 = C7603n1.f36894d;
        }
        if (this.f36933G.f36877n.equals(c7603n12)) {
            return;
        }
        C7600m1 m32850g = this.f36933G.m32850g(c7603n12);
        this.f36958w++;
        this.f36943h.m33073S0(c7603n12);
        m32963J1(m32850g, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: d */
    public long mo32442d() {
        return C7583h.m32761e(this.f36933G.f36881r);
    }

    @Override // p267p6.InterfaceC7613r
    /* renamed from: e */
    public AbstractC9891o mo32444e() {
        return this.f36940e;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: g */
    public void mo32447g(InterfaceC7606o1.e eVar) {
        m32954F0(eVar);
    }

    @Override // p267p6.InterfaceC7606o1
    public long getCurrentPosition() {
        return C7583h.m32761e(m32969P0(this.f36933G));
    }

    @Override // p267p6.InterfaceC7606o1
    public long getDuration() {
        if (!mo32436a()) {
            return m32641S();
        }
        C7600m1 c7600m1 = this.f36933G;
        InterfaceC0127w.a aVar = c7600m1.f36865b;
        c7600m1.f36864a.mo32326h(aVar.f544a, this.f36946k);
        return C7583h.m32761e(this.f36946k.m32670b(aVar.f545b, aVar.f546c));
    }

    @Override // p267p6.InterfaceC7606o1
    public int getPlaybackState() {
        return this.f36933G.f36868e;
    }

    @Override // p267p6.InterfaceC7606o1
    public int getRepeatMode() {
        return this.f36956u;
    }

    @Override // p267p6.InterfaceC7606o1
    public float getVolume() {
        return 1.0f;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: h */
    public void mo32449h(SurfaceView surfaceView) {
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: i */
    public int mo32451i() {
        int m32970Q0 = m32970Q0();
        int i10 = m32970Q0;
        if (m32970Q0 == -1) {
            i10 = 0;
        }
        return i10;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: l */
    public void mo32456l(boolean z10) {
        m32957G1(z10, 0, 1);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: n */
    public int mo32460n() {
        return mo32436a() ? this.f36933G.f36865b.f545b : -1;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: p */
    public int mo32463p() {
        return this.f36933G.f36876m;
    }

    @Override // p267p6.InterfaceC7606o1
    public void prepare() {
        C7600m1 c7600m1 = this.f36933G;
        if (c7600m1.f36868e != 1) {
            return;
        }
        C7600m1 m32849f = c7600m1.m32849f(null);
        C7600m1 m32851h = m32849f.m32851h(m32849f.f36864a.m32667q() ? 4 : 2);
        this.f36958w++;
        this.f36943h.m33106j0();
        m32963J1(m32851h, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: q */
    public C0083a1 mo32465q() {
        return this.f36933G.f36871h;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: r */
    public AbstractC7574e2 mo32467r() {
        return this.f36933G.f36864a;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: s */
    public Looper mo32469s() {
        return this.f36951p;
    }

    @Override // p267p6.InterfaceC7606o1
    public void setRepeatMode(final int i10) {
        if (this.f36956u != i10) {
            this.f36956u = i10;
            this.f36943h.m33075U0(i10);
            this.f36944i.m22254h(9, new C4390u.a(i10) { // from class: p6.b0

                /* renamed from: a */
                public final int f36445a;

                {
                    this.f36445a = i10;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    ((InterfaceC7606o1.c) obj).onRepeatModeChanged(this.f36445a);
                }
            });
            m32961I1();
            this.f36944i.m22252e();
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: u */
    public void mo32472u(TextureView textureView) {
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: v */
    public C9888l mo32474v() {
        return new C9888l(this.f36933G.f36872i.f45511c);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: w */
    public void mo32476w(int i10, long j10) {
        AbstractC7574e2 abstractC7574e2 = this.f36933G.f36864a;
        if (i10 < 0 || (!abstractC7574e2.m32667q() && i10 >= abstractC7574e2.mo512p())) {
            throw new C7635y0(abstractC7574e2, i10, j10);
        }
        int i11 = 1;
        this.f36958w++;
        if (mo32436a()) {
            C4392v.m22275i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C7620t0.e eVar = new C7620t0.e(this.f36933G);
            eVar.m33148b(1);
            this.f36942g.mo32716a(eVar);
            return;
        }
        if (getPlaybackState() != 1) {
            i11 = 2;
        }
        int mo32451i = mo32451i();
        C7600m1 m32977w1 = m32977w1(this.f36933G.m32851h(i11), abstractC7574e2, m32972S0(abstractC7574e2, i10, j10));
        this.f36943h.m33041B0(abstractC7574e2, i10, C7583h.m32760d(j10));
        m32963J1(m32977w1, 0, 1, true, true, 1, m32969P0(m32977w1), mo32451i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011a, code lost:
    
        if (r16.m32663f(r0, r14.f36946k).f36711c != r16.mo32326h(r27.f544a, r14.f36946k).f36711c) goto L31;
     */
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p267p6.C7600m1 m32977w1(p267p6.C7600m1 r15, p267p6.AbstractC7574e2 r16, android.util.Pair<java.lang.Object, java.lang.Long> r17) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7611q0.m32977w1(p6.m1, p6.e2, android.util.Pair):p6.m1");
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: x */
    public InterfaceC7606o1.b mo32478x() {
        return this.f36930D;
    }

    /* renamed from: x1 */
    public void m32978x1(C7839a c7839a) {
        C7565c1 m32560F = this.f36931E.m32528a().m32563I(c7839a).m32560F();
        if (m32560F.equals(this.f36931E)) {
            return;
        }
        this.f36931E = m32560F;
        this.f36944i.m22257k(15, new C4390u.a(this) { // from class: p6.c0

            /* renamed from: a */
            public final C7611q0 f36595a;

            {
                this.f36595a = this;
            }

            @Override // p059d9.C4390u.a
            /* renamed from: d */
            public final void mo22258d(Object obj) {
                this.f36595a.m32909c1((InterfaceC7606o1.c) obj);
            }
        });
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: y */
    public boolean mo32480y() {
        return this.f36933G.f36875l;
    }

    /* renamed from: y1 */
    public final long m32979y1(AbstractC7574e2 abstractC7574e2, InterfaceC0127w.a aVar, long j10) {
        abstractC7574e2.mo32326h(aVar.f544a, this.f36946k);
        return j10 + this.f36946k.m32683o();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: z */
    public void mo32482z(final boolean z10) {
        if (this.f36957v != z10) {
            this.f36957v = z10;
            this.f36943h.m33081X0(z10);
            this.f36944i.m22254h(10, new C4390u.a(z10) { // from class: p6.s

                /* renamed from: a */
                public final boolean f36979a;

                {
                    this.f36979a = z10;
                }

                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    ((InterfaceC7606o1.c) obj).mo12542s(this.f36979a);
                }
            });
            m32961I1();
            this.f36944i.m22252e();
        }
    }

    /* renamed from: z1 */
    public void m32980z1() {
        C4392v.m22273g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.0] [" + C4401z0.f26683e + "] [" + C7623u0.m33153b() + "]");
        if (!this.f36943h.m33111l0()) {
            this.f36944i.m22257k(11, new C4390u.a() { // from class: p6.a0
                @Override // p059d9.C4390u.a
                /* renamed from: d */
                public final void mo22258d(Object obj) {
                    C7611q0.m32910d1((InterfaceC7606o1.c) obj);
                }
            });
        }
        this.f36944i.m22255i();
        this.f36941f.mo22200f(null);
        C7800h1 c7800h1 = this.f36950o;
        if (c7800h1 != null) {
            this.f36952q.mo5338a(c7800h1);
        }
        C7600m1 m32851h = this.f36933G.m32851h(1);
        this.f36933G = m32851h;
        C7600m1 m32845b = m32851h.m32845b(m32851h.f36865b);
        this.f36933G = m32845b;
        m32845b.f36880q = m32845b.f36882s;
        this.f36933G.f36881r = 0L;
    }
}
