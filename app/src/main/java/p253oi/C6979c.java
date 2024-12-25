package p253oi;

import java.io.IOException;
import java.net.ProtocolException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;
import p173ji.AbstractC5429t;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p274pi.C7731h;
import p274pi.InterfaceC7727d;
import p372vh.C9367f;
import p391wi.C9595d;
import p411xi.AbstractC9766j;
import p411xi.AbstractC9767k;
import p411xi.C9761e;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9782z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/c.class
 */
/* renamed from: oi.c */
/* loaded from: combined.jar:classes2.jar:oi/c.class */
public final class C6979c {

    /* renamed from: a */
    public boolean f36003a;

    /* renamed from: b */
    @NotNull
    public final C6982f f36004b;

    /* renamed from: c */
    @NotNull
    public final C6981e f36005c;

    /* renamed from: d */
    @NotNull
    public final AbstractC5429t f36006d;

    /* renamed from: e */
    @NotNull
    public final C6980d f36007e;

    /* renamed from: f */
    public final InterfaceC7727d f36008f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/c$a.class
     */
    /* renamed from: oi.c$a */
    /* loaded from: combined.jar:classes2.jar:oi/c$a.class */
    public final class a extends AbstractC9766j {

        /* renamed from: c */
        public boolean f36009c;

        /* renamed from: d */
        public long f36010d;

        /* renamed from: e */
        public boolean f36011e;

        /* renamed from: f */
        public final long f36012f;

        /* renamed from: g */
        public final C6979c f36013g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C6979c c6979c, InterfaceC9782z interfaceC9782z, long j10) {
            super(interfaceC9782z);
            C9367f.m39526e(interfaceC9782z, "delegate");
            this.f36013g = c6979c;
            this.f36012f = j10;
        }

        @Override // p411xi.AbstractC9766j, p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f36011e) {
                return;
            }
            this.f36011e = true;
            long j10 = this.f36012f;
            if (j10 != -1 && this.f36010d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m32030f(null);
            } catch (IOException e10) {
                throw m32030f(e10);
            }
        }

        /* renamed from: f */
        public final <E extends IOException> E m32030f(E e10) {
            if (this.f36009c) {
                return e10;
            }
            this.f36009c = true;
            return (E) this.f36013g.m32008a(this.f36010d, false, true, e10);
        }

        @Override // p411xi.AbstractC9766j, p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m32030f(e10);
            }
        }

        @Override // p411xi.AbstractC9766j, p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "source");
            if (!(!this.f36011e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f36012f;
            if (j11 == -1 || this.f36010d + j10 <= j11) {
                try {
                    super.mo32031h(c9761e, j10);
                    this.f36010d += j10;
                    return;
                } catch (IOException e10) {
                    throw m32030f(e10);
                }
            }
            throw new ProtocolException("expected " + this.f36012f + " bytes but received " + (this.f36010d + j10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/c$b.class
     */
    /* renamed from: oi.c$b */
    /* loaded from: combined.jar:classes2.jar:oi/c$b.class */
    public final class b extends AbstractC9767k {

        /* renamed from: c */
        public long f36014c;

        /* renamed from: d */
        public boolean f36015d;

        /* renamed from: e */
        public boolean f36016e;

        /* renamed from: f */
        public boolean f36017f;

        /* renamed from: g */
        public final long f36018g;

        /* renamed from: h */
        public final C6979c f36019h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C6979c c6979c, InterfaceC9756b0 interfaceC9756b0, long j10) {
            super(interfaceC9756b0);
            C9367f.m39526e(interfaceC9756b0, "delegate");
            this.f36019h = c6979c;
            this.f36018g = j10;
            this.f36015d = true;
            if (j10 == 0) {
                m32032l(null);
            }
        }

        @Override // p411xi.AbstractC9767k, p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f36017f) {
                return;
            }
            this.f36017f = true;
            try {
                super.close();
                m32032l(null);
            } catch (IOException e10) {
                throw m32032l(e10);
            }
        }

        /* renamed from: l */
        public final <E extends IOException> E m32032l(E e10) {
            if (this.f36016e) {
                return e10;
            }
            this.f36016e = true;
            if (e10 == null && this.f36015d) {
                this.f36015d = false;
                this.f36019h.m32016i().m27061v(this.f36019h.m32014g());
            }
            return (E) this.f36019h.m32008a(this.f36014c, true, false, e10);
        }

        @Override // p411xi.AbstractC9767k, p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "sink");
            if (!(!this.f36017f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long mo22901x = m41217f().mo22901x(c9761e, j10);
                if (this.f36015d) {
                    this.f36015d = false;
                    this.f36019h.m32016i().m27061v(this.f36019h.m32014g());
                }
                if (mo22901x == -1) {
                    m32032l(null);
                    return -1L;
                }
                long j11 = this.f36014c + mo22901x;
                long j12 = this.f36018g;
                if (j12 == -1 || j11 <= j12) {
                    this.f36014c = j11;
                    if (j11 == j12) {
                        m32032l(null);
                    }
                    return mo22901x;
                }
                throw new ProtocolException("expected " + this.f36018g + " bytes but received " + j11);
            } catch (IOException e10) {
                throw m32032l(e10);
            }
        }
    }

    public C6979c(@NotNull C6981e c6981e, @NotNull AbstractC5429t abstractC5429t, @NotNull C6980d c6980d, @NotNull InterfaceC7727d interfaceC7727d) {
        C9367f.m39526e(c6981e, "call");
        C9367f.m39526e(abstractC5429t, "eventListener");
        C9367f.m39526e(c6980d, "finder");
        C9367f.m39526e(interfaceC7727d, "codec");
        this.f36005c = c6981e;
        this.f36006d = abstractC5429t;
        this.f36007e = c6980d;
        this.f36008f = interfaceC7727d;
        this.f36004b = interfaceC7727d.mo33730c();
    }

    /* renamed from: a */
    public final <E extends IOException> E m32008a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            m32027t(e10);
        }
        if (z11) {
            AbstractC5429t abstractC5429t = this.f36006d;
            C6981e c6981e = this.f36005c;
            if (e10 != null) {
                abstractC5429t.m27057r(c6981e, e10);
            } else {
                abstractC5429t.m27055p(c6981e, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f36006d.m27062w(this.f36005c, e10);
            } else {
                this.f36006d.m27060u(this.f36005c, j10);
            }
        }
        return (E) this.f36005c.m32064u(this, z11, z10, e10);
    }

    /* renamed from: b */
    public final void m32009b() {
        this.f36008f.cancel();
    }

    @NotNull
    /* renamed from: c */
    public final InterfaceC9782z m32010c(@NotNull C5406d0 c5406d0, boolean z10) {
        C9367f.m39526e(c5406d0, "request");
        this.f36003a = z10;
        AbstractC5408e0 m26871a = c5406d0.m26871a();
        C9367f.m39524c(m26871a);
        long mo22935a = m26871a.mo22935a();
        this.f36006d.m27056q(this.f36005c);
        return new a(this, this.f36008f.mo33732e(c5406d0, mo22935a), mo22935a);
    }

    /* renamed from: d */
    public final void m32011d() {
        this.f36008f.cancel();
        this.f36005c.m32064u(this, true, true, null);
    }

    /* renamed from: e */
    public final void m32012e() {
        try {
            this.f36008f.mo33729b();
        } catch (IOException e10) {
            this.f36006d.m27057r(this.f36005c, e10);
            m32027t(e10);
            throw e10;
        }
    }

    /* renamed from: f */
    public final void m32013f() {
        try {
            this.f36008f.mo33728a();
        } catch (IOException e10) {
            this.f36006d.m27057r(this.f36005c, e10);
            m32027t(e10);
            throw e10;
        }
    }

    @NotNull
    /* renamed from: g */
    public final C6981e m32014g() {
        return this.f36005c;
    }

    @NotNull
    /* renamed from: h */
    public final C6982f m32015h() {
        return this.f36004b;
    }

    @NotNull
    /* renamed from: i */
    public final AbstractC5429t m32016i() {
        return this.f36006d;
    }

    @NotNull
    /* renamed from: j */
    public final C6980d m32017j() {
        return this.f36007e;
    }

    /* renamed from: k */
    public final boolean m32018k() {
        return !C9367f.m39522a(this.f36007e.m32036d().m26760l().m27112i(), this.f36004b.m32075A().m26977a().m26760l().m27112i());
    }

    /* renamed from: l */
    public final boolean m32019l() {
        return this.f36003a;
    }

    @NotNull
    /* renamed from: m */
    public final C9595d.d m32020m() {
        this.f36005c.m32046E();
        return this.f36008f.mo33730c().m32105x(this);
    }

    /* renamed from: n */
    public final void m32021n() {
        this.f36008f.mo33730c().m32107z();
    }

    /* renamed from: o */
    public final void m32022o() {
        this.f36005c.m32064u(this, true, false, null);
    }

    @NotNull
    /* renamed from: p */
    public final AbstractC5412g0 m32023p(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "response");
        try {
            String m26912B = C5410f0.m26912B(c5410f0, "Content-Type", null, 2, null);
            long mo33731d = this.f36008f.mo33731d(c5410f0);
            return new C7731h(m26912B, mo33731d, C9772p.m41229c(new b(this, this.f36008f.mo33734g(c5410f0), mo33731d)));
        } catch (IOException e10) {
            this.f36006d.m27062w(this.f36005c, e10);
            m32027t(e10);
            throw e10;
        }
    }

    @Nullable
    /* renamed from: q */
    public final C5410f0.a m32024q(boolean z10) {
        try {
            C5410f0.a mo33735h = this.f36008f.mo33735h(z10);
            if (mo33735h != null) {
                mo33735h.m26943l(this);
            }
            return mo33735h;
        } catch (IOException e10) {
            this.f36006d.m27062w(this.f36005c, e10);
            m32027t(e10);
            throw e10;
        }
    }

    /* renamed from: r */
    public final void m32025r(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "response");
        this.f36006d.m27063x(this.f36005c, c5410f0);
    }

    /* renamed from: s */
    public final void m32026s() {
        this.f36006d.m27064y(this.f36005c);
    }

    /* renamed from: t */
    public final void m32027t(IOException iOException) {
        this.f36007e.m32040h(iOException);
        this.f36008f.mo33730c().m32082H(this.f36005c, iOException);
    }

    /* renamed from: u */
    public final void m32028u() {
        m32008a(-1L, true, true, null);
    }

    /* renamed from: v */
    public final void m32029v(@NotNull C5406d0 c5406d0) {
        C9367f.m39526e(c5406d0, "request");
        try {
            this.f36006d.m27059t(this.f36005c);
            this.f36008f.mo33733f(c5406d0);
            this.f36006d.m27058s(this.f36005c, c5406d0);
        } catch (IOException e10) {
            this.f36006d.m27057r(this.f36005c, e10);
            m32027t(e10);
            throw e10;
        }
    }
}
