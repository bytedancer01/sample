package p125h7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p059d9.C4349a;
import p059d9.C4361f0;
import p182k7.C5520k;
import p267p6.C7629w0;
import p283q7.C7839a;
import p381w7.C9426b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h7/a.class
 */
/* renamed from: h7.a */
/* loaded from: combined.jar:classes2.jar:h7/a.class */
public final class C5037a implements InterfaceC4323f {

    /* renamed from: b */
    public InterfaceC4325h f29086b;

    /* renamed from: c */
    public int f29087c;

    /* renamed from: d */
    public int f29088d;

    /* renamed from: e */
    public int f29089e;

    /* renamed from: g */
    public C9426b f29091g;

    /* renamed from: h */
    public InterfaceC4324g f29092h;

    /* renamed from: i */
    public C5039c f29093i;

    /* renamed from: j */
    public C5520k f29094j;

    /* renamed from: a */
    public final C4361f0 f29085a = new C4361f0(6);

    /* renamed from: f */
    public long f29090f = -1;

    /* renamed from: f */
    public static C9426b m25241f(String str, long j10) {
        C5038b m25253a;
        if (j10 == -1 || (m25253a = C5041e.m25253a(str)) == null) {
            return null;
        }
        return m25253a.m25251a(j10);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        if (j10 == 0) {
            this.f29087c = 0;
            this.f29094j = null;
        } else if (this.f29087c == 5) {
            ((C5520k) C4349a.m21882e(this.f29094j)).mo12027a(j10, j11);
        }
    }

    /* renamed from: b */
    public final void m25242b(InterfaceC4324g interfaceC4324g) {
        this.f29085a.m21979L(2);
        interfaceC4324g.mo21811q(this.f29085a.m21988d(), 0, 2);
        interfaceC4324g.mo21805k(this.f29085a.m21977J() - 2);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f29086b = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        if (m25245i(interfaceC4324g) != 65496) {
            return false;
        }
        int m25245i = m25245i(interfaceC4324g);
        this.f29088d = m25245i;
        if (m25245i == 65504) {
            m25242b(interfaceC4324g);
            this.f29088d = m25245i(interfaceC4324g);
        }
        if (this.f29088d != 65505) {
            return false;
        }
        interfaceC4324g.mo21805k(2);
        this.f29085a.m21979L(6);
        interfaceC4324g.mo21811q(this.f29085a.m21988d(), 0, 6);
        boolean z10 = false;
        if (this.f29085a.m21973F() == 1165519206) {
            z10 = false;
            if (this.f29085a.m21977J() == 0) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: e */
    public final void m25243e() {
        m25244g(new C7839a.b[0]);
        ((InterfaceC4325h) C4349a.m21882e(this.f29086b)).mo491u();
        this.f29086b.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
        this.f29087c = 6;
    }

    /* renamed from: g */
    public final void m25244g(C7839a.b... bVarArr) {
        ((InterfaceC4325h) C4349a.m21882e(this.f29086b)).mo479e(1024, 4).mo608f(new C7629w0.b().m33200K("image/jpeg").m33213X(new C7839a(bVarArr)).m33194E());
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        int i10 = this.f29087c;
        if (i10 == 0) {
            m25246j(interfaceC4324g);
            return 0;
        }
        if (i10 == 1) {
            m25248l(interfaceC4324g);
            return 0;
        }
        if (i10 == 2) {
            m25247k(interfaceC4324g);
            return 0;
        }
        if (i10 == 4) {
            long position = interfaceC4324g.getPosition();
            long j10 = this.f29090f;
            if (position != j10) {
                c4334q.f26491a = j10;
                return 1;
            }
            m25249m(interfaceC4324g);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f29093i == null || interfaceC4324g != this.f29092h) {
            this.f29092h = interfaceC4324g;
            this.f29093i = new C5039c(interfaceC4324g, this.f29090f);
        }
        int mo12033h = ((C5520k) C4349a.m21882e(this.f29094j)).mo12033h(this.f29093i, c4334q);
        if (mo12033h == 1) {
            c4334q.f26491a += this.f29090f;
        }
        return mo12033h;
    }

    /* renamed from: i */
    public final int m25245i(InterfaceC4324g interfaceC4324g) {
        this.f29085a.m21979L(2);
        interfaceC4324g.mo21811q(this.f29085a.m21988d(), 0, 2);
        return this.f29085a.m21977J();
    }

    /* renamed from: j */
    public final void m25246j(InterfaceC4324g interfaceC4324g) {
        int i10;
        this.f29085a.m21979L(2);
        interfaceC4324g.readFully(this.f29085a.m21988d(), 0, 2);
        int m21977J = this.f29085a.m21977J();
        this.f29088d = m21977J;
        if (m21977J == 65498) {
            if (this.f29090f == -1) {
                m25243e();
                return;
            }
            i10 = 4;
        } else if ((m21977J >= 65488 && m21977J <= 65497) || m21977J == 65281) {
            return;
        } else {
            i10 = 1;
        }
        this.f29087c = i10;
    }

    /* renamed from: k */
    public final void m25247k(InterfaceC4324g interfaceC4324g) {
        String m22008x;
        if (this.f29088d == 65505) {
            C4361f0 c4361f0 = new C4361f0(this.f29089e);
            interfaceC4324g.readFully(c4361f0.m21988d(), 0, this.f29089e);
            if (this.f29091g == null && "http://ns.adobe.com/xap/1.0/".equals(c4361f0.m22008x()) && (m22008x = c4361f0.m22008x()) != null) {
                C9426b m25241f = m25241f(m22008x, interfaceC4324g.getLength());
                this.f29091g = m25241f;
                if (m25241f != null) {
                    this.f29090f = m25241f.f43186e;
                }
            }
        } else {
            interfaceC4324g.mo21809o(this.f29089e);
        }
        this.f29087c = 0;
    }

    /* renamed from: l */
    public final void m25248l(InterfaceC4324g interfaceC4324g) {
        this.f29085a.m21979L(2);
        interfaceC4324g.readFully(this.f29085a.m21988d(), 0, 2);
        this.f29089e = this.f29085a.m21977J() - 2;
        this.f29087c = 2;
    }

    /* renamed from: m */
    public final void m25249m(InterfaceC4324g interfaceC4324g) {
        if (interfaceC4324g.mo21800d(this.f29085a.m21988d(), 0, 1, true)) {
            interfaceC4324g.mo21801f();
            if (this.f29094j == null) {
                this.f29094j = new C5520k();
            }
            C5039c c5039c = new C5039c(interfaceC4324g, this.f29090f);
            this.f29093i = c5039c;
            if (this.f29094j.mo12029d(c5039c)) {
                this.f29094j.mo12028c(new C5040d(this.f29090f, (InterfaceC4325h) C4349a.m21882e(this.f29086b)));
                m25250n();
                return;
            }
        }
        m25243e();
    }

    /* renamed from: n */
    public final void m25250n() {
        m25244g((C7839a.b) C4349a.m21882e(this.f29091g));
        this.f29087c = 5;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
        C5520k c5520k = this.f29094j;
        if (c5520k != null) {
            c5520k.release();
        }
    }
}
