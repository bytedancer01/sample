package p228n7;

import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4322e;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;
import p301r6.C7966a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/i.class
 */
/* renamed from: n7.i */
/* loaded from: combined.jar:classes2.jar:n7/i.class */
public final class C6676i implements InterfaceC6683m {

    /* renamed from: v */
    public static final byte[] f34804v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f34805a;

    /* renamed from: b */
    public final C4359e0 f34806b;

    /* renamed from: c */
    public final C4361f0 f34807c;

    /* renamed from: d */
    public final String f34808d;

    /* renamed from: e */
    public String f34809e;

    /* renamed from: f */
    public InterfaceC4337t f34810f;

    /* renamed from: g */
    public InterfaceC4337t f34811g;

    /* renamed from: h */
    public int f34812h;

    /* renamed from: i */
    public int f34813i;

    /* renamed from: j */
    public int f34814j;

    /* renamed from: k */
    public boolean f34815k;

    /* renamed from: l */
    public boolean f34816l;

    /* renamed from: m */
    public int f34817m;

    /* renamed from: n */
    public int f34818n;

    /* renamed from: o */
    public int f34819o;

    /* renamed from: p */
    public boolean f34820p;

    /* renamed from: q */
    public long f34821q;

    /* renamed from: r */
    public int f34822r;

    /* renamed from: s */
    public long f34823s;

    /* renamed from: t */
    public InterfaceC4337t f34824t;

    /* renamed from: u */
    public long f34825u;

    public C6676i(boolean z10) {
        this(z10, null);
    }

    public C6676i(boolean z10, String str) {
        this.f34806b = new C4359e0(new byte[7]);
        this.f34807c = new C4361f0(Arrays.copyOf(f34804v, 10));
        m30748s();
        this.f34817m = -1;
        this.f34818n = -1;
        this.f34821q = -9223372036854775807L;
        this.f34805a = z10;
        this.f34808d = str;
    }

    /* renamed from: m */
    public static boolean m30735m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        m30736b();
        while (c4361f0.m21985a() > 0) {
            int i10 = this.f34812h;
            if (i10 == 0) {
                m30740j(c4361f0);
            } else if (i10 == 1) {
                m30737g(c4361f0);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (m30739i(c4361f0, this.f34806b.f26561a, this.f34815k ? 7 : 5)) {
                        m30743n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    m30745p(c4361f0);
                }
            } else if (m30739i(c4361f0, this.f34807c.m21988d(), 10)) {
                m30744o();
            }
        }
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    /* renamed from: b */
    public final void m30736b() {
        C4349a.m21882e(this.f34810f);
        C4401z0.m22391j(this.f34824t);
        C4401z0.m22391j(this.f34811g);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        m30746q();
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34809e = dVar.m30756b();
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(dVar.m30757c(), 1);
        this.f34810f = mo479e;
        this.f34824t = mo479e;
        if (!this.f34805a) {
            this.f34811g = new C4322e();
            return;
        }
        dVar.m30755a();
        InterfaceC4337t mo479e2 = interfaceC4325h.mo479e(dVar.m30757c(), 5);
        this.f34811g = mo479e2;
        mo479e2.mo608f(new C7629w0.b().m33208S(dVar.m30756b()).m33220e0("application/id3").m33194E());
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f34823s = j10;
    }

    /* renamed from: g */
    public final void m30737g(C4361f0 c4361f0) {
        if (c4361f0.m21985a() == 0) {
            return;
        }
        this.f34806b.f26561a[0] = c4361f0.m21988d()[c4361f0.m21989e()];
        this.f34806b.m21958p(2);
        int m21950h = this.f34806b.m21950h(4);
        int i10 = this.f34818n;
        if (i10 != -1 && m21950h != i10) {
            m30746q();
            return;
        }
        if (!this.f34816l) {
            this.f34816l = true;
            this.f34817m = this.f34819o;
            this.f34818n = m21950h;
        }
        m30749t();
    }

    /* renamed from: h */
    public final boolean m30738h(C4361f0 c4361f0, int i10) {
        c4361f0.m21983P(i10 + 1);
        boolean z10 = true;
        if (!m30752w(c4361f0, this.f34806b.f26561a, 1)) {
            return false;
        }
        this.f34806b.m21958p(4);
        int m21950h = this.f34806b.m21950h(1);
        int i11 = this.f34817m;
        if (i11 != -1 && m21950h != i11) {
            return false;
        }
        if (this.f34818n != -1) {
            if (!m30752w(c4361f0, this.f34806b.f26561a, 1)) {
                return true;
            }
            this.f34806b.m21958p(2);
            if (this.f34806b.m21950h(4) != this.f34818n) {
                return false;
            }
            c4361f0.m21983P(i10 + 2);
        }
        if (!m30752w(c4361f0, this.f34806b.f26561a, 4)) {
            return true;
        }
        this.f34806b.m21958p(14);
        int m21950h2 = this.f34806b.m21950h(13);
        if (m21950h2 < 7) {
            return false;
        }
        byte[] m21988d = c4361f0.m21988d();
        int m21990f = c4361f0.m21990f();
        int i12 = i10 + m21950h2;
        if (i12 >= m21990f) {
            return true;
        }
        byte b10 = m21988d[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == m21990f) {
                return true;
            }
            return m30742l((byte) -1, m21988d[i13]) && ((m21988d[i13] & 8) >> 3) == m21950h;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == m21990f) {
            return true;
        }
        if (m21988d[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        if (i15 == m21990f) {
            return true;
        }
        if (m21988d[i15] != 51) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: i */
    public final boolean m30739i(C4361f0 c4361f0, byte[] bArr, int i10) {
        int min = Math.min(c4361f0.m21985a(), i10 - this.f34813i);
        c4361f0.m21994j(bArr, this.f34813i, min);
        int i11 = this.f34813i + min;
        this.f34813i = i11;
        return i11 == i10;
    }

    /* renamed from: j */
    public final void m30740j(C4361f0 c4361f0) {
        int i10;
        byte[] m21988d = c4361f0.m21988d();
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        while (m21989e < m21990f) {
            int i11 = m21989e + 1;
            int i12 = m21988d[m21989e] & 255;
            if (this.f34814j == 512 && m30742l((byte) -1, (byte) i12) && (this.f34816l || m30738h(c4361f0, i11 - 2))) {
                this.f34819o = (i12 & 8) >> 3;
                boolean z10 = true;
                if ((i12 & 1) != 0) {
                    z10 = false;
                }
                this.f34815k = z10;
                if (this.f34816l) {
                    m30749t();
                } else {
                    m30747r();
                }
                c4361f0.m21983P(i11);
                return;
            }
            int i13 = this.f34814j;
            int i14 = i12 | i13;
            if (i14 == 329) {
                i10 = 768;
            } else if (i14 == 511) {
                this.f34814j = 512;
                m21989e = i11;
            } else if (i14 == 836) {
                i10 = 1024;
            } else if (i14 == 1075) {
                m30750u();
                c4361f0.m21983P(i11);
                return;
            } else {
                m21989e = i11;
                if (i13 != 256) {
                    this.f34814j = 256;
                    m21989e = i11 - 1;
                }
            }
            this.f34814j = i10;
            m21989e = i11;
        }
        c4361f0.m21983P(m21989e);
    }

    /* renamed from: k */
    public long m30741k() {
        return this.f34821q;
    }

    /* renamed from: l */
    public final boolean m30742l(byte b10, byte b11) {
        return m30735m(((b10 & 255) << 8) | (b11 & 255));
    }

    @RequiresNonNull({"output"})
    /* renamed from: n */
    public final void m30743n() {
        this.f34806b.m21958p(0);
        if (this.f34820p) {
            this.f34806b.m21960r(10);
        } else {
            int m21950h = this.f34806b.m21950h(2) + 1;
            int i10 = m21950h;
            if (m21950h != 2) {
                C4392v.m22275i("AdtsReader", "Detected audio object type: " + m21950h + ", but assuming AAC LC.");
                i10 = 2;
            }
            this.f34806b.m21960r(5);
            byte[] m34524b = C7966a.m34524b(i10, this.f34818n, this.f34806b.m21950h(3));
            C7966a.b m34529g = C7966a.m34529g(m34524b);
            C7629w0 m33194E = new C7629w0.b().m33208S(this.f34809e).m33220e0("audio/mp4a-latm").m33198I(m34529g.f38458c).m33197H(m34529g.f38457b).m33221f0(m34529g.f38456a).m33209T(Collections.singletonList(m34524b)).m33211V(this.f34808d).m33194E();
            this.f34821q = 1024000000 / m33194E.f37068A;
            this.f34810f.mo608f(m33194E);
            this.f34820p = true;
        }
        this.f34806b.m21960r(4);
        int m21950h2 = (this.f34806b.m21950h(13) - 2) - 5;
        int i11 = m21950h2;
        if (this.f34815k) {
            i11 = m21950h2 - 2;
        }
        m30751v(this.f34810f, this.f34821q, 0, i11);
    }

    @RequiresNonNull({"id3Output"})
    /* renamed from: o */
    public final void m30744o() {
        this.f34811g.mo606e(this.f34807c, 10);
        this.f34807c.m21983P(6);
        m30751v(this.f34811g, 0L, 10, this.f34807c.m21970C() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    /* renamed from: p */
    public final void m30745p(C4361f0 c4361f0) {
        int min = Math.min(c4361f0.m21985a(), this.f34822r - this.f34813i);
        this.f34824t.mo606e(c4361f0, min);
        int i10 = this.f34813i + min;
        this.f34813i = i10;
        int i11 = this.f34822r;
        if (i10 == i11) {
            this.f34824t.mo600b(this.f34823s, 1, i11, 0, null);
            this.f34823s += this.f34825u;
            m30748s();
        }
    }

    /* renamed from: q */
    public final void m30746q() {
        this.f34816l = false;
        m30748s();
    }

    /* renamed from: r */
    public final void m30747r() {
        this.f34812h = 1;
        this.f34813i = 0;
    }

    /* renamed from: s */
    public final void m30748s() {
        this.f34812h = 0;
        this.f34813i = 0;
        this.f34814j = 256;
    }

    /* renamed from: t */
    public final void m30749t() {
        this.f34812h = 3;
        this.f34813i = 0;
    }

    /* renamed from: u */
    public final void m30750u() {
        this.f34812h = 2;
        this.f34813i = f34804v.length;
        this.f34822r = 0;
        this.f34807c.m21983P(0);
    }

    /* renamed from: v */
    public final void m30751v(InterfaceC4337t interfaceC4337t, long j10, int i10, int i11) {
        this.f34812h = 4;
        this.f34813i = i10;
        this.f34824t = interfaceC4337t;
        this.f34825u = j10;
        this.f34822r = i11;
    }

    /* renamed from: w */
    public final boolean m30752w(C4361f0 c4361f0, byte[] bArr, int i10) {
        if (c4361f0.m21985a() < i10) {
            return false;
        }
        c4361f0.m21994j(bArr, 0, i10);
        return true;
    }
}
