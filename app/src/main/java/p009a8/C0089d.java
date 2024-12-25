package p009a8;

import java.util.List;
import p009a8.InterfaceC0121t;
import p059d9.C4349a;
import p059d9.C4400z;
import p059d9.C4401z0;
import p267p6.C7558a2;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p332t6.C8638f;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/d.class
 */
/* renamed from: a8.d */
/* loaded from: combined.jar:classes2.jar:a8/d.class */
public final class C0089d implements InterfaceC0121t, InterfaceC0121t.a {

    /* renamed from: b */
    public final InterfaceC0121t f276b;

    /* renamed from: c */
    public InterfaceC0121t.a f277c;

    /* renamed from: d */
    public a[] f278d = new a[0];

    /* renamed from: e */
    public long f279e;

    /* renamed from: f */
    public long f280f;

    /* renamed from: g */
    public long f281g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/d$a.class
     */
    /* renamed from: a8.d$a */
    /* loaded from: combined.jar:classes2.jar:a8/d$a.class */
    public final class a implements InterfaceC0120s0 {

        /* renamed from: b */
        public final InterfaceC0120s0 f282b;

        /* renamed from: c */
        public boolean f283c;

        /* renamed from: d */
        public final C0089d f284d;

        public a(C0089d c0089d, InterfaceC0120s0 interfaceC0120s0) {
            this.f284d = c0089d;
            this.f282b = interfaceC0120s0;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: a */
        public void mo354a() {
            this.f282b.mo354a();
        }

        /* renamed from: b */
        public void m355b() {
            this.f283c = false;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: e */
        public boolean mo356e() {
            return !this.f284d.m348o() && this.f282b.mo356e();
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: p */
        public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
            if (this.f284d.m348o()) {
                return -3;
            }
            if (this.f283c) {
                c8638f.setFlags(4);
                return -4;
            }
            int mo357p = this.f282b.mo357p(c7632x0, c8638f, i10);
            if (mo357p == -5) {
                C7629w0 c7629w0 = (C7629w0) C4349a.m21882e(c7632x0.f37132b);
                int i11 = c7629w0.f37070C;
                if (i11 == 0 && c7629w0.f37071D == 0) {
                    return -5;
                }
                C0089d c0089d = this.f284d;
                int i12 = 0;
                if (c0089d.f280f != 0) {
                    i11 = 0;
                }
                if (c0089d.f281g == Long.MIN_VALUE) {
                    i12 = c7629w0.f37071D;
                }
                c7632x0.f37132b = c7629w0.m33157b().m33202M(i11).m33203N(i12).m33194E();
                return -5;
            }
            C0089d c0089d2 = this.f284d;
            long j10 = c0089d2.f281g;
            if (j10 == Long.MIN_VALUE || ((mo357p != -4 || c8638f.f40329e < j10) && !(mo357p == -3 && c0089d2.mo340g() == Long.MIN_VALUE && !c8638f.f40328d))) {
                return mo357p;
            }
            c8638f.clear();
            c8638f.setFlags(4);
            this.f283c = true;
            return -4;
        }

        @Override // p009a8.InterfaceC0120s0
        /* renamed from: t */
        public int mo358t(long j10) {
            if (this.f284d.m348o()) {
                return -3;
            }
            return this.f282b.mo358t(j10);
        }
    }

    public C0089d(InterfaceC0121t interfaceC0121t, boolean z10, long j10, long j11) {
        this.f276b = interfaceC0121t;
        this.f279e = z10 ? j10 : -9223372036854775807L;
        this.f280f = j10;
        this.f281g = j11;
    }

    /* renamed from: r */
    public static boolean m333r(long j10, InterfaceC9884h[] interfaceC9884hArr) {
        if (j10 == 0) {
            return false;
        }
        for (InterfaceC9884h interfaceC9884h : interfaceC9884hArr) {
            if (interfaceC9884h != null) {
                C7629w0 mo41615q = interfaceC9884h.mo41615q();
                if (!C4400z.m22293a(mo41615q.f37086m, mo41615q.f37083j)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        return this.f276b.mo335b();
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: c */
    public long mo336c() {
        long mo336c = this.f276b.mo336c();
        if (mo336c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f281g;
        if (j10 == Long.MIN_VALUE || mo336c < j10) {
            return mo336c;
        }
        return Long.MIN_VALUE;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        return this.f276b.mo337d(j10);
    }

    /* renamed from: e */
    public final C7558a2 m338e(long j10, C7558a2 c7558a2) {
        long m22411t = C4401z0.m22411t(c7558a2.f36437a, 0L, j10 - this.f280f);
        long j11 = c7558a2.f36438b;
        long j12 = this.f281g;
        long m22411t2 = C4401z0.m22411t(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (m22411t == c7558a2.f36437a && m22411t2 == c7558a2.f36438b) ? c7558a2 : new C7558a2(m22411t, m22411t2);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: f */
    public long mo339f(long j10, C7558a2 c7558a2) {
        long j11 = this.f280f;
        if (j10 == j11) {
            return j11;
        }
        return this.f276b.mo339f(j10, m338e(j10, c7558a2));
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: g */
    public long mo340g() {
        long mo340g = this.f276b.mo340g();
        if (mo340g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f281g;
        if (j10 == Long.MIN_VALUE || mo340g < j10) {
            return mo340g;
        }
        return Long.MIN_VALUE;
    }

    @Override // p009a8.InterfaceC0121t, p009a8.InterfaceC0122t0
    /* renamed from: h */
    public void mo341h(long j10) {
        this.f276b.mo341h(j10);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: i */
    public /* synthetic */ List mo342i(List list) {
        return C0119s.m628a(this, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r0 <= r0) goto L17;
     */
    @Override // p009a8.InterfaceC0121t
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo343j(long r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f279e = r1
            r0 = r5
            a8.d$a[] r0 = r0.f278d
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r8 = r0
        L17:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L33
            r0 = r14
            r1 = r8
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L2d
            r0 = r15
            r0.m355b()
        L2d:
            int r8 = r8 + 1
            goto L17
        L33:
            r0 = r5
            a8.t r0 = r0.f276b
            r1 = r6
            long r0 = r0.mo343j(r1)
            r12 = r0
            r0 = r12
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6c
            r0 = r11
            r10 = r0
            r0 = r12
            r1 = r5
            long r1 = r1.f280f
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L6f
            r0 = r5
            long r0 = r0.f281g
            r6 = r0
            r0 = r6
            r1 = -9223372036854775808
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6c
            r0 = r11
            r10 = r0
            r0 = r12
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L6f
        L6c:
            r0 = 1
            r10 = r0
        L6f:
            r0 = r10
            p059d9.C4349a.m21884g(r0)
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0089d.mo343j(long):long");
    }

    @Override // p009a8.InterfaceC0121t.a
    /* renamed from: k */
    public void mo344k(InterfaceC0121t interfaceC0121t) {
        ((InterfaceC0121t.a) C4349a.m21882e(this.f277c)).mo344k(this);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: l */
    public void mo345l(InterfaceC0121t.a aVar, long j10) {
        this.f277c = aVar;
        this.f276b.mo345l(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (r0 > r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    @Override // p009a8.InterfaceC0121t
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo346m(p421y8.InterfaceC9884h[] r9, boolean[] r10, p009a8.InterfaceC0120s0[] r11, boolean[] r12, long r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0089d.mo346m(y8.h[], boolean[], a8.s0[], boolean[], long):long");
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: n */
    public long mo347n() {
        if (m348o()) {
            long j10 = this.f279e;
            this.f279e = -9223372036854775807L;
            long mo347n = mo347n();
            if (mo347n != -9223372036854775807L) {
                j10 = mo347n;
            }
            return j10;
        }
        long mo347n2 = this.f276b.mo347n();
        if (mo347n2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        C4349a.m21884g(mo347n2 >= this.f280f);
        long j11 = this.f281g;
        boolean z10 = true;
        if (j11 != Long.MIN_VALUE) {
            z10 = mo347n2 <= j11;
        }
        C4349a.m21884g(z10);
        return mo347n2;
    }

    /* renamed from: o */
    public boolean m348o() {
        return this.f279e != -9223372036854775807L;
    }

    @Override // p009a8.InterfaceC0122t0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo334a(InterfaceC0121t interfaceC0121t) {
        ((InterfaceC0121t.a) C4349a.m21882e(this.f277c)).mo334a(this);
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: s */
    public void mo350s() {
        this.f276b.mo350s();
    }

    /* renamed from: t */
    public void m351t(long j10, long j11) {
        this.f280f = j10;
        this.f281g = j11;
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: v */
    public C0083a1 mo352v() {
        return this.f276b.mo352v();
    }

    @Override // p009a8.InterfaceC0121t
    /* renamed from: w */
    public void mo353w(long j10, boolean z10) {
        this.f276b.mo353w(j10, z10);
    }
}
