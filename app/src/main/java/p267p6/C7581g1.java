package p267p6;

import android.os.Handler;
import android.util.Pair;
import p009a8.InterfaceC0121t;
import p009a8.InterfaceC0127w;
import p059d9.C4349a;
import p099fc.AbstractC4834t;
import p267p6.AbstractC7574e2;
import p282q6.C7800h1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/g1.class
 */
/* renamed from: p6.g1 */
/* loaded from: combined.jar:classes2.jar:p6/g1.class */
public final class C7581g1 {

    /* renamed from: a */
    public final AbstractC7574e2.b f36759a = new AbstractC7574e2.b();

    /* renamed from: b */
    public final AbstractC7574e2.c f36760b = new AbstractC7574e2.c();

    /* renamed from: c */
    public final C7800h1 f36761c;

    /* renamed from: d */
    public final Handler f36762d;

    /* renamed from: e */
    public long f36763e;

    /* renamed from: f */
    public int f36764f;

    /* renamed from: g */
    public boolean f36765g;

    /* renamed from: h */
    public C7569d1 f36766h;

    /* renamed from: i */
    public C7569d1 f36767i;

    /* renamed from: j */
    public C7569d1 f36768j;

    /* renamed from: k */
    public int f36769k;

    /* renamed from: l */
    public Object f36770l;

    /* renamed from: m */
    public long f36771m;

    public C7581g1(C7800h1 c7800h1, Handler handler) {
        this.f36761c = c7800h1;
        this.f36762d = handler;
    }

    /* renamed from: B */
    public static InterfaceC0127w.a m32720B(AbstractC7574e2 abstractC7574e2, Object obj, long j10, long j11, AbstractC7574e2.b bVar) {
        abstractC7574e2.mo32326h(obj, bVar);
        int m32673e = bVar.m32673e(j10);
        return m32673e == -1 ? new InterfaceC0127w.a(obj, j11, bVar.m32672d(j10)) : new InterfaceC0127w.a(obj, m32673e, bVar.m32680l(m32673e), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m32722w(AbstractC4834t.a aVar, InterfaceC0127w.a aVar2) {
        this.f36761c.m34039N2(aVar.m24555e(), aVar2);
    }

    /* renamed from: A */
    public InterfaceC0127w.a m32723A(AbstractC7574e2 abstractC7574e2, Object obj, long j10) {
        return m32720B(abstractC7574e2, obj, j10, m32724C(abstractC7574e2, obj), this.f36759a);
    }

    /* renamed from: C */
    public final long m32724C(AbstractC7574e2 abstractC7574e2, Object obj) {
        C7569d1 c7569d1;
        int mo506b;
        int i10 = abstractC7574e2.mo32326h(obj, this.f36759a).f36711c;
        Object obj2 = this.f36770l;
        if (obj2 != null && (mo506b = abstractC7574e2.mo506b(obj2)) != -1 && abstractC7574e2.m32663f(mo506b, this.f36759a).f36711c == i10) {
            return this.f36771m;
        }
        C7569d1 c7569d12 = this.f36766h;
        while (true) {
            c7569d1 = c7569d12;
            if (c7569d1 == null) {
                C7569d1 c7569d13 = this.f36766h;
                while (true) {
                    c7569d1 = c7569d13;
                    if (c7569d1 == null) {
                        long j10 = this.f36763e;
                        this.f36763e = 1 + j10;
                        if (this.f36766h == null) {
                            this.f36770l = obj;
                            this.f36771m = j10;
                        }
                        return j10;
                    }
                    int mo506b2 = abstractC7574e2.mo506b(c7569d1.f36680b);
                    if (mo506b2 != -1 && abstractC7574e2.m32663f(mo506b2, this.f36759a).f36711c == i10) {
                        break;
                    }
                    c7569d13 = c7569d1.m32621j();
                }
            } else {
                if (c7569d1.f36680b.equals(obj)) {
                    break;
                }
                c7569d12 = c7569d1.m32621j();
            }
        }
        return c7569d1.f36684f.f36697a.f547d;
    }

    /* renamed from: D */
    public boolean m32725D() {
        C7569d1 c7569d1 = this.f36768j;
        return c7569d1 == null || (!c7569d1.f36684f.f36705i && c7569d1.m32628q() && this.f36768j.f36684f.f36701e != -9223372036854775807L && this.f36769k < 100);
    }

    /* renamed from: E */
    public final boolean m32726E(AbstractC7574e2 abstractC7574e2) {
        C7569d1 c7569d1 = this.f36766h;
        if (c7569d1 == null) {
            return true;
        }
        int mo506b = abstractC7574e2.mo506b(c7569d1.f36680b);
        while (true) {
            mo506b = abstractC7574e2.m32662d(mo506b, this.f36759a, this.f36760b, this.f36764f, this.f36765g);
            while (c7569d1.m32621j() != null && !c7569d1.f36684f.f36703g) {
                c7569d1 = c7569d1.m32621j();
            }
            C7569d1 m32621j = c7569d1.m32621j();
            if (mo506b == -1 || m32621j == null || abstractC7574e2.mo506b(m32621j.f36680b) != mo506b) {
                break;
            }
            c7569d1 = m32621j;
        }
        boolean m32753z = m32753z(c7569d1);
        c7569d1.f36684f = m32746r(abstractC7574e2, c7569d1.f36684f);
        return !m32753z;
    }

    /* renamed from: F */
    public boolean m32727F(AbstractC7574e2 abstractC7574e2, long j10, long j11) {
        C7573e1 c7573e1;
        C7569d1 c7569d1 = this.f36766h;
        C7569d1 c7569d12 = null;
        while (true) {
            boolean z10 = true;
            if (c7569d1 == null) {
                return true;
            }
            C7573e1 c7573e12 = c7569d1.f36684f;
            if (c7569d12 != null) {
                C7573e1 m32737i = m32737i(abstractC7574e2, c7569d12, j10);
                if (m32737i != null && m32733e(c7573e12, m32737i)) {
                    c7573e1 = m32737i;
                }
                return !m32753z(c7569d12);
            }
            c7573e1 = m32746r(abstractC7574e2, c7573e12);
            c7569d1.f36684f = c7573e1.m32660a(c7573e12.f36699c);
            if (!m32732d(c7573e12.f36701e, c7573e1.f36701e)) {
                c7569d1.m32612A();
                long j12 = c7573e1.f36701e;
                boolean z11 = c7569d1 == this.f36767i && !c7569d1.f36684f.f36702f && (j11 == Long.MIN_VALUE || j11 >= ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c7569d1.m32636z(j12)));
                if (m32753z(c7569d1) || z11) {
                    z10 = false;
                }
                return z10;
            }
            c7569d12 = c7569d1;
            c7569d1 = c7569d1.m32621j();
        }
    }

    /* renamed from: G */
    public boolean m32728G(AbstractC7574e2 abstractC7574e2, int i10) {
        this.f36764f = i10;
        return m32726E(abstractC7574e2);
    }

    /* renamed from: H */
    public boolean m32729H(AbstractC7574e2 abstractC7574e2, boolean z10) {
        this.f36765g = z10;
        return m32726E(abstractC7574e2);
    }

    /* renamed from: b */
    public C7569d1 m32730b() {
        C7569d1 c7569d1 = this.f36766h;
        if (c7569d1 == null) {
            return null;
        }
        if (c7569d1 == this.f36767i) {
            this.f36767i = c7569d1.m32621j();
        }
        this.f36766h.m32631t();
        int i10 = this.f36769k - 1;
        this.f36769k = i10;
        if (i10 == 0) {
            this.f36768j = null;
            C7569d1 c7569d12 = this.f36766h;
            this.f36770l = c7569d12.f36680b;
            this.f36771m = c7569d12.f36684f.f36697a.f547d;
        }
        this.f36766h = this.f36766h.m32621j();
        m32751x();
        return this.f36766h;
    }

    /* renamed from: c */
    public C7569d1 m32731c() {
        C7569d1 c7569d1 = this.f36767i;
        C4349a.m21884g((c7569d1 == null || c7569d1.m32621j() == null) ? false : true);
        this.f36767i = this.f36767i.m32621j();
        m32751x();
        return this.f36767i;
    }

    /* renamed from: d */
    public final boolean m32732d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    /* renamed from: e */
    public final boolean m32733e(C7573e1 c7573e1, C7573e1 c7573e12) {
        return c7573e1.f36698b == c7573e12.f36698b && c7573e1.f36697a.equals(c7573e12.f36697a);
    }

    /* renamed from: f */
    public void m32734f() {
        if (this.f36769k == 0) {
            return;
        }
        C7569d1 c7569d1 = (C7569d1) C4349a.m21886i(this.f36766h);
        this.f36770l = c7569d1.f36680b;
        this.f36771m = c7569d1.f36684f.f36697a.f547d;
        while (c7569d1 != null) {
            c7569d1.m32631t();
            c7569d1 = c7569d1.m32621j();
        }
        this.f36766h = null;
        this.f36768j = null;
        this.f36767i = null;
        this.f36769k = 0;
        m32751x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r18 != (-9223372036854775807L)) goto L11;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p267p6.C7569d1 m32735g(p267p6.InterfaceC7633x1[] r12, p421y8.AbstractC9891o r13, p027b9.InterfaceC0832b r14, p267p6.C7591j1 r15, p267p6.C7573e1 r16, p421y8.C9892p r17) {
        /*
            r11 = this;
            r0 = r11
            p6.d1 r0 = r0.f36768j
            r20 = r0
            r0 = r20
            if (r0 != 0) goto L2f
            r0 = r16
            a8.w$a r0 = r0.f36697a
            boolean r0 = r0.m630b()
            if (r0 == 0) goto L29
            r0 = r16
            long r0 = r0.f36699c
            r18 = r0
            r0 = r18
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L47
        L29:
            r0 = 0
            r18 = r0
            goto L47
        L2f:
            r0 = r20
            long r0 = r0.m32623l()
            r1 = r11
            p6.d1 r1 = r1.f36768j
            p6.e1 r1 = r1.f36684f
            long r1 = r1.f36701e
            long r0 = r0 + r1
            r1 = r16
            long r1 = r1.f36698b
            long r0 = r0 - r1
            r18 = r0
        L47:
            p6.d1 r0 = new p6.d1
            r1 = r0
            r2 = r12
            r3 = r18
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12 = r0
            r0 = r11
            p6.d1 r0 = r0.f36768j
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L6b
            r0 = r13
            r1 = r12
            r0.m32633w(r1)
            goto L75
        L6b:
            r0 = r11
            r1 = r12
            r0.f36766h = r1
            r0 = r11
            r1 = r12
            r0.f36767i = r1
        L75:
            r0 = r11
            r1 = 0
            r0.f36770l = r1
            r0 = r11
            r1 = r12
            r0.f36768j = r1
            r0 = r11
            r1 = r11
            int r1 = r1.f36769k
            r2 = 1
            int r1 = r1 + r2
            r0.f36769k = r1
            r0 = r11
            r0.m32751x()
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7581g1.m32735g(p6.x1[], y8.o, b9.b, p6.j1, p6.e1, y8.p):p6.d1");
    }

    /* renamed from: h */
    public final C7573e1 m32736h(C7600m1 c7600m1) {
        return m32739k(c7600m1.f36864a, c7600m1.f36865b, c7600m1.f36866c, c7600m1.f36882s);
    }

    /* renamed from: i */
    public final C7573e1 m32737i(AbstractC7574e2 abstractC7574e2, C7569d1 c7569d1, long j10) {
        long j11;
        Object obj;
        C7573e1 c7573e1 = c7569d1.f36684f;
        long m32623l = (c7569d1.m32623l() + c7573e1.f36701e) - j10;
        if (c7573e1.f36703g) {
            long j12 = 0;
            int m32662d = abstractC7574e2.m32662d(abstractC7574e2.mo506b(c7573e1.f36697a.f544a), this.f36759a, this.f36760b, this.f36764f, this.f36765g);
            if (m32662d == -1) {
                return null;
            }
            int i10 = abstractC7574e2.mo404g(m32662d, this.f36759a, true).f36711c;
            Object obj2 = this.f36759a.f36710b;
            long j13 = c7573e1.f36697a.f547d;
            if (abstractC7574e2.m32666n(i10, this.f36760b).f36734o == m32662d) {
                Pair<Object, Long> m32665k = abstractC7574e2.m32665k(this.f36760b, this.f36759a, i10, -9223372036854775807L, Math.max(0L, m32623l));
                if (m32665k == null) {
                    return null;
                }
                Object obj3 = m32665k.first;
                j11 = ((Long) m32665k.second).longValue();
                C7569d1 m32621j = c7569d1.m32621j();
                if (m32621j == null || !m32621j.f36680b.equals(obj3)) {
                    j13 = this.f36763e;
                    this.f36763e = 1 + j13;
                } else {
                    j13 = m32621j.f36684f.f36697a.f547d;
                }
                j12 = -9223372036854775807L;
                obj = obj3;
            } else {
                j11 = 0;
                obj = obj2;
            }
            return m32739k(abstractC7574e2, m32720B(abstractC7574e2, obj, j11, j13, this.f36759a), j12, j11);
        }
        InterfaceC0127w.a aVar = c7573e1.f36697a;
        abstractC7574e2.mo32326h(aVar.f544a, this.f36759a);
        if (!aVar.m630b()) {
            int m32680l = this.f36759a.m32680l(aVar.f548e);
            if (m32680l != this.f36759a.m32669a(aVar.f548e)) {
                return m32740l(abstractC7574e2, aVar.f544a, aVar.f548e, m32680l, c7573e1.f36701e, aVar.f547d);
            }
            return m32741m(abstractC7574e2, aVar.f544a, m32742n(abstractC7574e2, aVar.f544a, aVar.f548e), c7573e1.f36701e, aVar.f547d);
        }
        int i11 = aVar.f545b;
        int m32669a = this.f36759a.m32669a(i11);
        if (m32669a == -1) {
            return null;
        }
        int m32681m = this.f36759a.m32681m(i11, aVar.f546c);
        if (m32681m < m32669a) {
            return m32740l(abstractC7574e2, aVar.f544a, i11, m32681m, c7573e1.f36699c, aVar.f547d);
        }
        long j14 = c7573e1.f36699c;
        long j15 = j14;
        if (j14 == -9223372036854775807L) {
            AbstractC7574e2.c cVar = this.f36760b;
            AbstractC7574e2.b bVar = this.f36759a;
            Pair<Object, Long> m32665k2 = abstractC7574e2.m32665k(cVar, bVar, bVar.f36711c, -9223372036854775807L, Math.max(0L, m32623l));
            if (m32665k2 == null) {
                return null;
            }
            j15 = ((Long) m32665k2.second).longValue();
        }
        return m32741m(abstractC7574e2, aVar.f544a, Math.max(m32742n(abstractC7574e2, aVar.f544a, aVar.f545b), j15), c7573e1.f36699c, aVar.f547d);
    }

    /* renamed from: j */
    public C7569d1 m32738j() {
        return this.f36768j;
    }

    /* renamed from: k */
    public final C7573e1 m32739k(AbstractC7574e2 abstractC7574e2, InterfaceC0127w.a aVar, long j10, long j11) {
        abstractC7574e2.mo32326h(aVar.f544a, this.f36759a);
        boolean m630b = aVar.m630b();
        Object obj = aVar.f544a;
        return m630b ? m32740l(abstractC7574e2, obj, aVar.f545b, aVar.f546c, j10, aVar.f547d) : m32741m(abstractC7574e2, obj, j11, j10, aVar.f547d);
    }

    /* renamed from: l */
    public final C7573e1 m32740l(AbstractC7574e2 abstractC7574e2, Object obj, int i10, int i11, long j10, long j11) {
        InterfaceC0127w.a aVar = new InterfaceC0127w.a(obj, i10, i11, j11);
        long m32670b = abstractC7574e2.mo32326h(aVar.f544a, this.f36759a).m32670b(aVar.f545b, aVar.f546c);
        long m32675g = i11 == this.f36759a.m32680l(i10) ? this.f36759a.m32675g() : 0L;
        boolean m32686r = this.f36759a.m32686r(aVar.f545b);
        if (m32670b != -9223372036854775807L && m32675g >= m32670b) {
            m32675g = Math.max(0L, m32670b - 1);
        }
        return new C7573e1(aVar, m32675g, j10, -9223372036854775807L, m32670b, m32686r, false, false, false);
    }

    /* renamed from: m */
    public final C7573e1 m32741m(AbstractC7574e2 abstractC7574e2, Object obj, long j10, long j11, long j12) {
        abstractC7574e2.mo32326h(obj, this.f36759a);
        int m32672d = this.f36759a.m32672d(j10);
        InterfaceC0127w.a aVar = new InterfaceC0127w.a(obj, j12, m32672d);
        boolean m32747s = m32747s(aVar);
        boolean m32749u = m32749u(abstractC7574e2, aVar);
        boolean m32748t = m32748t(abstractC7574e2, aVar, m32747s);
        boolean z10 = m32672d != -1 && this.f36759a.m32686r(m32672d);
        long m32674f = m32672d != -1 ? this.f36759a.m32674f(m32672d) : -9223372036854775807L;
        long j13 = (m32674f == -9223372036854775807L || m32674f == Long.MIN_VALUE) ? this.f36759a.f36712d : m32674f;
        long j14 = j10;
        if (j13 != -9223372036854775807L) {
            j14 = j10;
            if (j10 >= j13) {
                j14 = Math.max(0L, j13 - 1);
            }
        }
        return new C7573e1(aVar, j14, j11, m32674f, j13, z10, m32747s, m32749u, m32748t);
    }

    /* renamed from: n */
    public final long m32742n(AbstractC7574e2 abstractC7574e2, Object obj, int i10) {
        abstractC7574e2.mo32326h(obj, this.f36759a);
        long m32674f = this.f36759a.m32674f(i10);
        return m32674f == Long.MIN_VALUE ? this.f36759a.f36712d : m32674f + this.f36759a.m32677i(i10);
    }

    /* renamed from: o */
    public C7573e1 m32743o(long j10, C7600m1 c7600m1) {
        C7569d1 c7569d1 = this.f36768j;
        return c7569d1 == null ? m32736h(c7600m1) : m32737i(c7600m1.f36864a, c7569d1, j10);
    }

    /* renamed from: p */
    public C7569d1 m32744p() {
        return this.f36766h;
    }

    /* renamed from: q */
    public C7569d1 m32745q() {
        return this.f36767i;
    }

    /* renamed from: r */
    public C7573e1 m32746r(AbstractC7574e2 abstractC7574e2, C7573e1 c7573e1) {
        boolean z10;
        int i10;
        InterfaceC0127w.a aVar = c7573e1.f36697a;
        boolean m32747s = m32747s(aVar);
        boolean m32749u = m32749u(abstractC7574e2, aVar);
        boolean m32748t = m32748t(abstractC7574e2, aVar, m32747s);
        abstractC7574e2.mo32326h(c7573e1.f36697a.f544a, this.f36759a);
        long m32674f = (aVar.m630b() || (i10 = aVar.f548e) == -1) ? -9223372036854775807L : this.f36759a.m32674f(i10);
        long m32670b = aVar.m630b() ? this.f36759a.m32670b(aVar.f545b, aVar.f546c) : (m32674f == -9223372036854775807L || m32674f == Long.MIN_VALUE) ? this.f36759a.m32679k() : m32674f;
        if (aVar.m630b()) {
            z10 = this.f36759a.m32686r(aVar.f545b);
        } else {
            int i11 = aVar.f548e;
            z10 = i11 != -1 && this.f36759a.m32686r(i11);
        }
        return new C7573e1(aVar, c7573e1.f36698b, c7573e1.f36699c, m32674f, m32670b, z10, m32747s, m32749u, m32748t);
    }

    /* renamed from: s */
    public final boolean m32747s(InterfaceC0127w.a aVar) {
        return !aVar.m630b() && aVar.f548e == -1;
    }

    /* renamed from: t */
    public final boolean m32748t(AbstractC7574e2 abstractC7574e2, InterfaceC0127w.a aVar, boolean z10) {
        int mo506b = abstractC7574e2.mo506b(aVar.f544a);
        return !abstractC7574e2.m32666n(abstractC7574e2.m32663f(mo506b, this.f36759a).f36711c, this.f36760b).f36728i && abstractC7574e2.m32668r(mo506b, this.f36759a, this.f36760b, this.f36764f, this.f36765g) && z10;
    }

    /* renamed from: u */
    public final boolean m32749u(AbstractC7574e2 abstractC7574e2, InterfaceC0127w.a aVar) {
        boolean z10 = false;
        if (!m32747s(aVar)) {
            return false;
        }
        if (abstractC7574e2.m32666n(abstractC7574e2.mo32326h(aVar.f544a, this.f36759a).f36711c, this.f36760b).f36735p == abstractC7574e2.mo506b(aVar.f544a)) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: v */
    public boolean m32750v(InterfaceC0121t interfaceC0121t) {
        C7569d1 c7569d1 = this.f36768j;
        return c7569d1 != null && c7569d1.f36679a == interfaceC0121t;
    }

    /* renamed from: x */
    public final void m32751x() {
        if (this.f36761c != null) {
            final AbstractC4834t.a m24548x = AbstractC4834t.m24548x();
            C7569d1 c7569d1 = this.f36766h;
            while (true) {
                C7569d1 c7569d12 = c7569d1;
                if (c7569d12 == null) {
                    break;
                }
                m24548x.m24554d(c7569d12.f36684f.f36697a);
                c7569d1 = c7569d12.m32621j();
            }
            C7569d1 c7569d13 = this.f36767i;
            final InterfaceC0127w.a aVar = c7569d13 == null ? null : c7569d13.f36684f.f36697a;
            this.f36762d.post(new Runnable(this, m24548x, aVar) { // from class: p6.f1

                /* renamed from: b */
                public final C7581g1 f36750b;

                /* renamed from: c */
                public final AbstractC4834t.a f36751c;

                /* renamed from: d */
                public final InterfaceC0127w.a f36752d;

                {
                    this.f36750b = this;
                    this.f36751c = m24548x;
                    this.f36752d = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f36750b.m32722w(this.f36751c, this.f36752d);
                }
            });
        }
    }

    /* renamed from: y */
    public void m32752y(long j10) {
        C7569d1 c7569d1 = this.f36768j;
        if (c7569d1 != null) {
            c7569d1.m32630s(j10);
        }
    }

    /* renamed from: z */
    public boolean m32753z(C7569d1 c7569d1) {
        C4349a.m21884g(c7569d1 != null);
        if (c7569d1.equals(this.f36768j)) {
            return false;
        }
        this.f36768j = c7569d1;
        boolean z10 = false;
        while (c7569d1.m32621j() != null) {
            c7569d1 = c7569d1.m32621j();
            if (c7569d1 == this.f36767i) {
                this.f36767i = this.f36766h;
                z10 = true;
            }
            c7569d1.m32631t();
            this.f36769k--;
        }
        this.f36768j.m32633w(null);
        m32751x();
        return z10;
    }
}
