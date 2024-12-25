package p228n7;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p301r6.C7966a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/s.class
 */
/* renamed from: n7.s */
/* loaded from: combined.jar:classes2.jar:n7/s.class */
public final class C6689s implements InterfaceC6683m {

    /* renamed from: a */
    public final String f34989a;

    /* renamed from: b */
    public final C4361f0 f34990b;

    /* renamed from: c */
    public final C4359e0 f34991c;

    /* renamed from: d */
    public InterfaceC4337t f34992d;

    /* renamed from: e */
    public String f34993e;

    /* renamed from: f */
    public C7629w0 f34994f;

    /* renamed from: g */
    public int f34995g;

    /* renamed from: h */
    public int f34996h;

    /* renamed from: i */
    public int f34997i;

    /* renamed from: j */
    public int f34998j;

    /* renamed from: k */
    public long f34999k;

    /* renamed from: l */
    public boolean f35000l;

    /* renamed from: m */
    public int f35001m;

    /* renamed from: n */
    public int f35002n;

    /* renamed from: o */
    public int f35003o;

    /* renamed from: p */
    public boolean f35004p;

    /* renamed from: q */
    public long f35005q;

    /* renamed from: r */
    public int f35006r;

    /* renamed from: s */
    public long f35007s;

    /* renamed from: t */
    public int f35008t;

    /* renamed from: u */
    public String f35009u;

    public C6689s(String str) {
        this.f34989a = str;
        C4361f0 c4361f0 = new C4361f0(1024);
        this.f34990b = c4361f0;
        this.f34991c = new C4359e0(c4361f0.m21988d());
    }

    /* renamed from: b */
    public static long m30817b(C4359e0 c4359e0) {
        return c4359e0.m21950h((c4359e0.m21950h(2) + 1) * 8);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        C4349a.m21886i(this.f34992d);
        while (c4361f0.m21985a() > 0) {
            int i10 = this.f34995g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int m21971D = c4361f0.m21971D();
                    if ((m21971D & 224) == 224) {
                        this.f34998j = m21971D;
                        this.f34995g = 2;
                    } else if (m21971D != 86) {
                        this.f34995g = 0;
                    }
                } else if (i10 == 2) {
                    int m21971D2 = ((this.f34998j & (-225)) << 8) | c4361f0.m21971D();
                    this.f34997i = m21971D2;
                    if (m21971D2 > this.f34990b.m21988d().length) {
                        m30824m(this.f34997i);
                    }
                    this.f34996h = 0;
                    this.f34995g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c4361f0.m21985a(), this.f34997i - this.f34996h);
                    c4361f0.m21994j(this.f34991c.f26561a, this.f34996h, min);
                    int i11 = this.f34996h + min;
                    this.f34996h = i11;
                    if (i11 == this.f34997i) {
                        this.f34991c.m21958p(0);
                        m30818g(this.f34991c);
                        this.f34995g = 0;
                    }
                }
            } else if (c4361f0.m21971D() == 86) {
                this.f34995g = 1;
            }
        }
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f34995g = 0;
        this.f35000l = false;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34992d = interfaceC4325h.mo479e(dVar.m30757c(), 1);
        this.f34993e = dVar.m30756b();
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f34999k = j10;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void m30818g(C4359e0 c4359e0) {
        if (!c4359e0.m21949g()) {
            this.f35000l = true;
            m30823l(c4359e0);
        } else if (!this.f35000l) {
            return;
        }
        if (this.f35001m != 0) {
            throw C7594k1.m32822a(null, null);
        }
        if (this.f35002n != 0) {
            throw C7594k1.m32822a(null, null);
        }
        m30822k(c4359e0, m30821j(c4359e0));
        if (this.f35004p) {
            c4359e0.m21960r((int) this.f35005q);
        }
    }

    /* renamed from: h */
    public final int m30819h(C4359e0 c4359e0) {
        int m21944b = c4359e0.m21944b();
        C7966a.b m34528f = C7966a.m34528f(c4359e0, true);
        this.f35009u = m34528f.f38458c;
        this.f35006r = m34528f.f38456a;
        this.f35008t = m34528f.f38457b;
        return m21944b - c4359e0.m21944b();
    }

    /* renamed from: i */
    public final void m30820i(C4359e0 c4359e0) {
        int i10;
        int m21950h = c4359e0.m21950h(3);
        this.f35003o = m21950h;
        if (m21950h == 0) {
            i10 = 8;
        } else {
            if (m21950h != 1) {
                if (m21950h == 3 || m21950h == 4 || m21950h == 5) {
                    c4359e0.m21960r(6);
                    return;
                } else {
                    if (m21950h != 6 && m21950h != 7) {
                        throw new IllegalStateException();
                    }
                    c4359e0.m21960r(1);
                    return;
                }
            }
            i10 = 9;
        }
        c4359e0.m21960r(i10);
    }

    /* renamed from: j */
    public final int m30821j(C4359e0 c4359e0) {
        int m21950h;
        int i10;
        if (this.f35003o != 0) {
            throw C7594k1.m32822a(null, null);
        }
        int i11 = 0;
        do {
            m21950h = c4359e0.m21950h(8);
            i10 = i11 + m21950h;
            i11 = i10;
        } while (m21950h == 255);
        return i10;
    }

    @RequiresNonNull({"output"})
    /* renamed from: k */
    public final void m30822k(C4359e0 c4359e0, int i10) {
        int m21947e = c4359e0.m21947e();
        if ((m21947e & 7) == 0) {
            this.f34990b.m21983P(m21947e >> 3);
        } else {
            c4359e0.m21951i(this.f34990b.m21988d(), 0, i10 * 8);
            this.f34990b.m21983P(0);
        }
        this.f34992d.mo606e(this.f34990b, i10);
        this.f34992d.mo600b(this.f34999k, 1, i10, 0, null);
        this.f34999k += this.f35007s;
    }

    @RequiresNonNull({"output"})
    /* renamed from: l */
    public final void m30823l(C4359e0 c4359e0) {
        boolean m21949g;
        int m21950h = c4359e0.m21950h(1);
        int m21950h2 = m21950h == 1 ? c4359e0.m21950h(1) : 0;
        this.f35001m = m21950h2;
        if (m21950h2 != 0) {
            throw C7594k1.m32822a(null, null);
        }
        if (m21950h == 1) {
            m30817b(c4359e0);
        }
        if (!c4359e0.m21949g()) {
            throw C7594k1.m32822a(null, null);
        }
        this.f35002n = c4359e0.m21950h(6);
        int m21950h3 = c4359e0.m21950h(4);
        int m21950h4 = c4359e0.m21950h(3);
        if (m21950h3 != 0 || m21950h4 != 0) {
            throw C7594k1.m32822a(null, null);
        }
        if (m21950h == 0) {
            int m21947e = c4359e0.m21947e();
            int m30819h = m30819h(c4359e0);
            c4359e0.m21958p(m21947e);
            byte[] bArr = new byte[(m30819h + 7) / 8];
            c4359e0.m21951i(bArr, 0, m30819h);
            C7629w0 m33194E = new C7629w0.b().m33208S(this.f34993e).m33220e0("audio/mp4a-latm").m33198I(this.f35009u).m33197H(this.f35008t).m33221f0(this.f35006r).m33209T(Collections.singletonList(bArr)).m33211V(this.f34989a).m33194E();
            if (!m33194E.equals(this.f34994f)) {
                this.f34994f = m33194E;
                this.f35007s = 1024000000 / m33194E.f37068A;
                this.f34992d.mo608f(m33194E);
            }
        } else {
            c4359e0.m21960r(((int) m30817b(c4359e0)) - m30819h(c4359e0));
        }
        m30820i(c4359e0);
        boolean m21949g2 = c4359e0.m21949g();
        this.f35004p = m21949g2;
        this.f35005q = 0L;
        if (m21949g2) {
            if (m21950h == 1) {
                this.f35005q = m30817b(c4359e0);
            } else {
                do {
                    m21949g = c4359e0.m21949g();
                    this.f35005q = (this.f35005q << 8) + c4359e0.m21950h(8);
                } while (m21949g);
            }
        }
        if (c4359e0.m21949g()) {
            c4359e0.m21960r(8);
        }
    }

    /* renamed from: m */
    public final void m30824m(int i10) {
        this.f34990b.m21979L(i10);
        this.f34991c.m21956n(this.f34990b.m21988d());
    }
}
