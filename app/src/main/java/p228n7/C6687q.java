package p228n7;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4350a0;
import p059d9.C4356d;
import p059d9.C4361f0;
import p059d9.C4363g0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/q.class
 */
/* renamed from: n7.q */
/* loaded from: combined.jar:classes2.jar:n7/q.class */
public final class C6687q implements InterfaceC6683m {

    /* renamed from: a */
    public final C6667d0 f34956a;

    /* renamed from: b */
    public String f34957b;

    /* renamed from: c */
    public InterfaceC4337t f34958c;

    /* renamed from: d */
    public a f34959d;

    /* renamed from: e */
    public boolean f34960e;

    /* renamed from: l */
    public long f34967l;

    /* renamed from: m */
    public long f34968m;

    /* renamed from: f */
    public final boolean[] f34961f = new boolean[3];

    /* renamed from: g */
    public final C6691u f34962g = new C6691u(32, 128);

    /* renamed from: h */
    public final C6691u f34963h = new C6691u(33, 128);

    /* renamed from: i */
    public final C6691u f34964i = new C6691u(34, 128);

    /* renamed from: j */
    public final C6691u f34965j = new C6691u(39, 128);

    /* renamed from: k */
    public final C6691u f34966k = new C6691u(40, 128);

    /* renamed from: n */
    public final C4361f0 f34969n = new C4361f0();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/q$a.class
     */
    /* renamed from: n7.q$a */
    /* loaded from: combined.jar:classes2.jar:n7/q$a.class */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC4337t f34970a;

        /* renamed from: b */
        public long f34971b;

        /* renamed from: c */
        public boolean f34972c;

        /* renamed from: d */
        public int f34973d;

        /* renamed from: e */
        public long f34974e;

        /* renamed from: f */
        public boolean f34975f;

        /* renamed from: g */
        public boolean f34976g;

        /* renamed from: h */
        public boolean f34977h;

        /* renamed from: i */
        public boolean f34978i;

        /* renamed from: j */
        public boolean f34979j;

        /* renamed from: k */
        public long f34980k;

        /* renamed from: l */
        public long f34981l;

        /* renamed from: m */
        public boolean f34982m;

        public a(InterfaceC4337t interfaceC4337t) {
            this.f34970a = interfaceC4337t;
        }

        /* renamed from: b */
        public static boolean m30810b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        /* renamed from: c */
        public static boolean m30811c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        /* renamed from: a */
        public void m30812a(long j10, int i10, boolean z10) {
            if (this.f34979j && this.f34976g) {
                this.f34982m = this.f34972c;
                this.f34979j = false;
            } else if (this.f34977h || this.f34976g) {
                if (z10 && this.f34978i) {
                    m30813d(i10 + ((int) (j10 - this.f34971b)));
                }
                this.f34980k = this.f34971b;
                this.f34981l = this.f34974e;
                this.f34982m = this.f34972c;
                this.f34978i = true;
            }
        }

        /* renamed from: d */
        public final void m30813d(int i10) {
            boolean z10 = this.f34982m;
            this.f34970a.mo600b(this.f34981l, z10 ? 1 : 0, (int) (this.f34971b - this.f34980k), i10, null);
        }

        /* renamed from: e */
        public void m30814e(byte[] bArr, int i10, int i11) {
            if (this.f34975f) {
                int i12 = this.f34973d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f34973d = i12 + (i11 - i10);
                } else {
                    this.f34976g = (bArr[i13] & 128) != 0;
                    this.f34975f = false;
                }
            }
        }

        /* renamed from: f */
        public void m30815f() {
            this.f34975f = false;
            this.f34976g = false;
            this.f34977h = false;
            this.f34978i = false;
            this.f34979j = false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        
            if (r8 <= 9) goto L25;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30816g(long r5, int r7, int r8, long r9, boolean r11) {
            /*
                r4 = this;
                r0 = 0
                r12 = r0
                r0 = r4
                r1 = 0
                r0.f34976g = r1
                r0 = r4
                r1 = 0
                r0.f34977h = r1
                r0 = r4
                r1 = r9
                r0.f34974e = r1
                r0 = r4
                r1 = 0
                r0.f34973d = r1
                r0 = r4
                r1 = r5
                r0.f34971b = r1
                r0 = r8
                boolean r0 = m30811c(r0)
                if (r0 != 0) goto L59
                r0 = r4
                boolean r0 = r0.f34978i
                if (r0 == 0) goto L42
                r0 = r4
                boolean r0 = r0.f34979j
                if (r0 != 0) goto L42
                r0 = r11
                if (r0 == 0) goto L3d
                r0 = r4
                r1 = r7
                r0.m30813d(r1)
            L3d:
                r0 = r4
                r1 = 0
                r0.f34978i = r1
            L42:
                r0 = r8
                boolean r0 = m30810b(r0)
                if (r0 == 0) goto L59
                r0 = r4
                r1 = r4
                boolean r1 = r1.f34979j
                r2 = 1
                r1 = r1 ^ r2
                r0.f34977h = r1
                r0 = r4
                r1 = 1
                r0.f34979j = r1
            L59:
                r0 = r8
                r1 = 16
                if (r0 < r1) goto L6d
                r0 = r8
                r1 = 21
                if (r0 > r1) goto L6d
                r0 = 1
                r11 = r0
                goto L70
            L6d:
                r0 = 0
                r11 = r0
            L70:
                r0 = r4
                r1 = r11
                r0.f34972c = r1
                r0 = r11
                if (r0 != 0) goto L86
                r0 = r12
                r11 = r0
                r0 = r8
                r1 = 9
                if (r0 > r1) goto L89
            L86:
                r0 = 1
                r11 = r0
            L89:
                r0 = r4
                r1 = r11
                r0.f34975f = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p228n7.C6687q.a.m30816g(long, int, int, long, boolean):void");
        }
    }

    public C6687q(C6667d0 c6667d0) {
        this.f34956a = c6667d0;
    }

    /* renamed from: i */
    public static C7629w0 m30803i(String str, C6691u c6691u, C6691u c6691u2, C6691u c6691u3) {
        int i10 = c6691u.f35026e;
        byte[] bArr = new byte[c6691u2.f35026e + i10 + c6691u3.f35026e];
        System.arraycopy(c6691u.f35025d, 0, bArr, 0, i10);
        System.arraycopy(c6691u2.f35025d, 0, bArr, c6691u.f35026e, c6691u2.f35026e);
        System.arraycopy(c6691u3.f35025d, 0, bArr, c6691u.f35026e + c6691u2.f35026e, c6691u3.f35026e);
        C4363g0 c4363g0 = new C4363g0(c6691u2.f35025d, 0, c6691u2.f35026e);
        c4363g0.m22022l(44);
        int m22015e = c4363g0.m22015e(3);
        c4363g0.m22021k();
        c4363g0.m22022l(88);
        c4363g0.m22022l(8);
        int i11 = 0;
        for (int i12 = 0; i12 < m22015e; i12++) {
            int i13 = i11;
            if (c4363g0.m22014d()) {
                i13 = i11 + 89;
            }
            i11 = i13;
            if (c4363g0.m22014d()) {
                i11 = i13 + 8;
            }
        }
        c4363g0.m22022l(i11);
        if (m22015e > 0) {
            c4363g0.m22022l((8 - m22015e) * 2);
        }
        c4363g0.m22018h();
        int m22018h = c4363g0.m22018h();
        if (m22018h == 3) {
            c4363g0.m22021k();
        }
        int m22018h2 = c4363g0.m22018h();
        int m22018h3 = c4363g0.m22018h();
        int i14 = m22018h2;
        int i15 = m22018h3;
        if (c4363g0.m22014d()) {
            int m22018h4 = c4363g0.m22018h();
            int m22018h5 = c4363g0.m22018h();
            int m22018h6 = c4363g0.m22018h();
            int m22018h7 = c4363g0.m22018h();
            i14 = m22018h2 - (((m22018h == 1 || m22018h == 2) ? 2 : 1) * (m22018h4 + m22018h5));
            i15 = m22018h3 - ((m22018h == 1 ? 2 : 1) * (m22018h6 + m22018h7));
        }
        c4363g0.m22018h();
        c4363g0.m22018h();
        int m22018h8 = c4363g0.m22018h();
        int i16 = c4363g0.m22014d() ? 0 : m22015e;
        while (true) {
            c4363g0.m22018h();
            c4363g0.m22018h();
            c4363g0.m22018h();
            if (i16 > m22015e) {
                break;
            }
            i16++;
        }
        c4363g0.m22018h();
        c4363g0.m22018h();
        c4363g0.m22018h();
        if (c4363g0.m22014d() && c4363g0.m22014d()) {
            m30804j(c4363g0);
        }
        c4363g0.m22022l(2);
        if (c4363g0.m22014d()) {
            c4363g0.m22022l(8);
            c4363g0.m22018h();
            c4363g0.m22018h();
            c4363g0.m22021k();
        }
        m30805k(c4363g0);
        if (c4363g0.m22014d()) {
            for (int i17 = 0; i17 < c4363g0.m22018h(); i17++) {
                c4363g0.m22022l(m22018h8 + 4 + 1);
            }
        }
        c4363g0.m22022l(2);
        float f10 = 1.0f;
        int i18 = i15;
        if (c4363g0.m22014d()) {
            float f11 = 1.0f;
            if (c4363g0.m22014d()) {
                int m22015e2 = c4363g0.m22015e(8);
                if (m22015e2 == 255) {
                    int m22015e3 = c4363g0.m22015e(16);
                    int m22015e4 = c4363g0.m22015e(16);
                    f11 = 1.0f;
                    if (m22015e3 != 0) {
                        f11 = 1.0f;
                        if (m22015e4 != 0) {
                            f11 = m22015e3 / m22015e4;
                        }
                    }
                } else {
                    float[] fArr = C4350a0.f26521b;
                    if (m22015e2 < fArr.length) {
                        f11 = fArr[m22015e2];
                    } else {
                        C4392v.m22275i("H265Reader", "Unexpected aspect_ratio_idc value: " + m22015e2);
                        f11 = 1.0f;
                    }
                }
            }
            if (c4363g0.m22014d()) {
                c4363g0.m22021k();
            }
            if (c4363g0.m22014d()) {
                c4363g0.m22022l(4);
                if (c4363g0.m22014d()) {
                    c4363g0.m22022l(24);
                }
            }
            if (c4363g0.m22014d()) {
                c4363g0.m22018h();
                c4363g0.m22018h();
            }
            c4363g0.m22021k();
            f10 = f11;
            i18 = i15;
            if (c4363g0.m22014d()) {
                i18 = i15 * 2;
                f10 = f11;
            }
        }
        c4363g0.m22019i(c6691u2.f35025d, 0, c6691u2.f35026e);
        c4363g0.m22022l(24);
        return new C7629w0.b().m33208S(str).m33220e0("video/hevc").m33198I(C4356d.m21931c(c4363g0)).m33225j0(i14).m33206Q(i18).m33216a0(f10).m33209T(Collections.singletonList(bArr)).m33194E();
    }

    /* renamed from: j */
    public static void m30804j(C4363g0 c4363g0) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 < 6) {
                    if (c4363g0.m22014d()) {
                        int min = Math.min(64, 1 << ((i10 << 1) + 4));
                        if (i10 > 1) {
                            c4363g0.m22017g();
                        }
                        for (int i13 = 0; i13 < min; i13++) {
                            c4363g0.m22017g();
                        }
                    } else {
                        c4363g0.m22018h();
                    }
                    int i14 = 1;
                    if (i10 == 3) {
                        i14 = 3;
                    }
                    i11 = i12 + i14;
                }
            }
        }
    }

    /* renamed from: k */
    public static void m30805k(C4363g0 c4363g0) {
        int i10;
        int m22018h = c4363g0.m22018h();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= m22018h) {
                return;
            }
            if (i11 != 0) {
                z10 = c4363g0.m22014d();
            }
            if (z10) {
                c4363g0.m22021k();
                c4363g0.m22018h();
                int i14 = 0;
                while (true) {
                    i10 = i13;
                    if (i14 <= i13) {
                        if (c4363g0.m22014d()) {
                            c4363g0.m22021k();
                        }
                        i14++;
                    }
                }
            } else {
                int m22018h2 = c4363g0.m22018h();
                int m22018h3 = c4363g0.m22018h();
                for (int i15 = 0; i15 < m22018h2; i15++) {
                    c4363g0.m22018h();
                    c4363g0.m22021k();
                }
                for (int i16 = 0; i16 < m22018h3; i16++) {
                    c4363g0.m22018h();
                    c4363g0.m22021k();
                }
                i10 = m22018h2 + m22018h3;
            }
            i11++;
            i12 = i10;
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        m30806b();
        while (c4361f0.m21985a() > 0) {
            int m21989e = c4361f0.m21989e();
            int m21990f = c4361f0.m21990f();
            byte[] m21988d = c4361f0.m21988d();
            this.f34967l += c4361f0.m21985a();
            this.f34958c.mo606e(c4361f0, c4361f0.m21985a());
            while (m21989e < m21990f) {
                int m21890c = C4350a0.m21890c(m21988d, m21989e, m21990f, this.f34961f);
                if (m21890c == m21990f) {
                    m30808h(m21988d, m21989e, m21990f);
                    return;
                }
                int m21892e = C4350a0.m21892e(m21988d, m21890c);
                int i10 = m21890c - m21989e;
                if (i10 > 0) {
                    m30808h(m21988d, m21989e, m21890c);
                }
                int i11 = m21990f - m21890c;
                long j10 = this.f34967l - i11;
                m30807g(j10, i11, i10 < 0 ? -i10 : 0, this.f34968m);
                m30809l(j10, i11, m21892e, this.f34968m);
                m21989e = m21890c + 3;
            }
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* renamed from: b */
    public final void m30806b() {
        C4349a.m21886i(this.f34958c);
        C4401z0.m22391j(this.f34959d);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f34967l = 0L;
        C4350a0.m21888a(this.f34961f);
        this.f34962g.m30831d();
        this.f34963h.m30831d();
        this.f34964i.m30831d();
        this.f34965j.m30831d();
        this.f34966k.m30831d();
        a aVar = this.f34959d;
        if (aVar != null) {
            aVar.m30815f();
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34957b = dVar.m30756b();
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 2);
        this.f34958c = mo479e;
        this.f34959d = new a(mo479e);
        this.f34956a.m30689b(interfaceC4325h, dVar);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f34968m = j10;
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* renamed from: g */
    public final void m30807g(long j10, int i10, int i11, long j11) {
        this.f34959d.m30812a(j10, i10, this.f34960e);
        if (!this.f34960e) {
            this.f34962g.m30829b(i11);
            this.f34963h.m30829b(i11);
            this.f34964i.m30829b(i11);
            if (this.f34962g.m30830c() && this.f34963h.m30830c() && this.f34964i.m30830c()) {
                this.f34958c.mo608f(m30803i(this.f34957b, this.f34962g, this.f34963h, this.f34964i));
                this.f34960e = true;
            }
        }
        if (this.f34965j.m30829b(i11)) {
            C6691u c6691u = this.f34965j;
            this.f34969n.m21981N(this.f34965j.f35025d, C4350a0.m21898k(c6691u.f35025d, c6691u.f35026e));
            this.f34969n.m21984Q(5);
            this.f34956a.m30688a(j11, this.f34969n);
        }
        if (this.f34966k.m30829b(i11)) {
            C6691u c6691u2 = this.f34966k;
            this.f34969n.m21981N(this.f34966k.f35025d, C4350a0.m21898k(c6691u2.f35025d, c6691u2.f35026e));
            this.f34969n.m21984Q(5);
            this.f34956a.m30688a(j11, this.f34969n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: h */
    public final void m30808h(byte[] bArr, int i10, int i11) {
        this.f34959d.m30814e(bArr, i10, i11);
        if (!this.f34960e) {
            this.f34962g.m30828a(bArr, i10, i11);
            this.f34963h.m30828a(bArr, i10, i11);
            this.f34964i.m30828a(bArr, i10, i11);
        }
        this.f34965j.m30828a(bArr, i10, i11);
        this.f34966k.m30828a(bArr, i10, i11);
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: l */
    public final void m30809l(long j10, int i10, int i11, long j11) {
        this.f34959d.m30816g(j10, i10, i11, j11, this.f34960e);
        if (!this.f34960e) {
            this.f34962g.m30832e(i11);
            this.f34963h.m30832e(i11);
            this.f34964i.m30832e(i11);
        }
        this.f34965j.m30832e(i11);
        this.f34966k.m30832e(i11);
    }
}
