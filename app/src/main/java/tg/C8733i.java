package tg;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import javax.net.ssl.SSLSocket;
import org.apache.http.protocol.HTTP;
import p389wg.C9588o;
import tg.C8743s;
import ug.C9181f;
import ug.C9183h;
import vg.C9350e;
import vg.C9352g;
import vg.C9354i;
import vg.C9355j;
import vg.C9359n;
import vg.InterfaceC9361p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/i.class
 */
/* renamed from: tg.i */
/* loaded from: combined.jar:classes2.jar:tg/i.class */
public final class C8733i {

    /* renamed from: a */
    public final C8734j f40608a;

    /* renamed from: b */
    public final C8747w f40609b;

    /* renamed from: c */
    public Socket f40610c;

    /* renamed from: e */
    public C9350e f40612e;

    /* renamed from: f */
    public C9588o f40613f;

    /* renamed from: h */
    public long f40615h;

    /* renamed from: i */
    public C8738n f40616i;

    /* renamed from: j */
    public int f40617j;

    /* renamed from: k */
    public Object f40618k;

    /* renamed from: d */
    public boolean f40611d = false;

    /* renamed from: g */
    public EnumC8742r f40614g = EnumC8742r.HTTP_1_1;

    public C8733i(C8734j c8734j, C8747w c8747w) {
        this.f40608a = c8734j;
        this.f40609b = c8747w;
    }

    /* renamed from: a */
    public boolean m37339a() {
        synchronized (this.f40608a) {
            if (this.f40618k == null) {
                return false;
            }
            this.f40618k = null;
            return true;
        }
    }

    /* renamed from: b */
    public void m37340b(int i10, int i11, int i12, C8743s c8743s) {
        if (this.f40611d) {
            throw new IllegalStateException("already connected");
        }
        this.f40610c = (this.f40609b.f40709b.type() == Proxy.Type.DIRECT || this.f40609b.f40709b.type() == Proxy.Type.HTTP) ? this.f40609b.f40708a.f40539d.createSocket() : new Socket(this.f40609b.f40709b);
        this.f40610c.setSoTimeout(i11);
        C9181f.m38667e().mo38669c(this.f40610c, this.f40609b.f40710c, i10);
        if (this.f40609b.f40708a.f40540e != null) {
            m37362x(c8743s, i11, i12);
        } else {
            this.f40612e = new C9350e(this.f40608a, this, this.f40610c);
        }
        this.f40611d = true;
    }

    /* renamed from: c */
    public void m37341c(C8741q c8741q, Object obj, C8743s c8743s) {
        m37358t(obj);
        if (!m37349k()) {
            m37340b(c8741q.m37424g(), c8741q.m37436u(), c8741q.m37412A(), m37361w(c8743s));
            if (m37353o()) {
                c8741q.m37425h().m37369g(this);
            }
            c8741q.m37415E().m38678a(m37345g());
        }
        m37360v(c8741q.m37436u(), c8741q.m37412A());
    }

    /* renamed from: d */
    public C8738n m37342d() {
        return this.f40616i;
    }

    /* renamed from: e */
    public long m37343e() {
        C9588o c9588o = this.f40613f;
        return c9588o == null ? this.f40615h : c9588o.m40328L0();
    }

    /* renamed from: f */
    public EnumC8742r m37344f() {
        return this.f40614g;
    }

    /* renamed from: g */
    public C8747w m37345g() {
        return this.f40609b;
    }

    /* renamed from: h */
    public Socket m37346h() {
        return this.f40610c;
    }

    /* renamed from: i */
    public void m37347i() {
        this.f40617j++;
    }

    /* renamed from: j */
    public boolean m37348j() {
        return (this.f40610c.isClosed() || this.f40610c.isInputShutdown() || this.f40610c.isOutputShutdown()) ? false : true;
    }

    /* renamed from: k */
    public boolean m37349k() {
        return this.f40611d;
    }

    /* renamed from: l */
    public boolean m37350l(long j10) {
        return m37343e() < System.nanoTime() - j10;
    }

    /* renamed from: m */
    public boolean m37351m() {
        C9588o c9588o = this.f40613f;
        return c9588o == null || c9588o.m40331O0();
    }

    /* renamed from: n */
    public boolean m37352n() {
        C9350e c9350e = this.f40612e;
        if (c9350e != null) {
            return c9350e.m39419q();
        }
        return true;
    }

    /* renamed from: o */
    public boolean m37353o() {
        return this.f40613f != null;
    }

    /* renamed from: p */
    public final void m37354p(C8743s c8743s, int i10, int i11) {
        C9350e c9350e = new C9350e(this.f40608a, this, this.f40610c);
        c9350e.m39428z(i10, i11);
        URL m37466p = c8743s.m37466p();
        String str = "CONNECT " + m37466p.getHost() + ":" + m37466p.getPort() + " HTTP/1.1";
        do {
            c9350e.m39411A(c8743s.m37461k(), str);
            c9350e.m39417o();
            C8745u m37524m = c9350e.m39427y().m37537z(c8743s).m37524m();
            c9350e.m39416n();
            int m37501o = m37524m.m37501o();
            if (m37501o == 200) {
                if (c9350e.m39413k() > 0) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                return;
            } else {
                if (m37501o != 407) {
                    throw new IOException("Unexpected response code for CONNECT: " + m37524m.m37501o());
                }
                C8747w c8747w = this.f40609b;
                c8743s = C9355j.m39484i(c8747w.f40708a.f40543h, m37524m, c8747w.f40709b);
            }
        } while (c8743s != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* renamed from: q */
    public InterfaceC9361p m37355q(C9352g c9352g) {
        return this.f40613f != null ? new C9359n(c9352g, this.f40613f) : new C9354i(c9352g, this.f40612e);
    }

    /* renamed from: r */
    public int m37356r() {
        return this.f40617j;
    }

    /* renamed from: s */
    public void m37357s() {
        if (this.f40613f != null) {
            throw new IllegalStateException("spdyConnection != null");
        }
        this.f40615h = System.nanoTime();
    }

    /* renamed from: t */
    public void m37358t(Object obj) {
        if (m37353o()) {
            return;
        }
        synchronized (this.f40608a) {
            if (this.f40618k != null) {
                throw new IllegalStateException("Connection already has an owner!");
            }
            this.f40618k = obj;
        }
    }

    /* renamed from: u */
    public void m37359u(EnumC8742r enumC8742r) {
        if (enumC8742r == null) {
            throw new IllegalArgumentException("protocol == null");
        }
        this.f40614g = enumC8742r;
    }

    /* renamed from: v */
    public void m37360v(int i10, int i11) {
        if (!this.f40611d) {
            throw new IllegalStateException("setTimeouts - not connected");
        }
        if (this.f40612e != null) {
            this.f40610c.setSoTimeout(i10);
            this.f40612e.m39428z(i10, i11);
        }
    }

    /* renamed from: w */
    public final C8743s m37361w(C8743s c8743s) {
        String str;
        if (!this.f40609b.m37541c()) {
            return null;
        }
        String host = c8743s.m37466p().getHost();
        int m38690j = C9183h.m38690j(c8743s.m37466p());
        if (m38690j == C9183h.m38687g(ClientConstants.DOMAIN_SCHEME)) {
            str = host;
        } else {
            str = host + ":" + m38690j;
        }
        C8743s.b m37477j = new C8743s.b().m37482o(new URL(ClientConstants.DOMAIN_SCHEME, host, m38690j, "/")).m37477j("Host", str).m37477j("Proxy-Connection", HTTP.CONN_KEEP_ALIVE);
        String m37459i = c8743s.m37459i("User-Agent");
        if (m37459i != null) {
            m37477j.m37477j("User-Agent", m37459i);
        }
        String m37459i2 = c8743s.m37459i("Proxy-Authorization");
        if (m37459i2 != null) {
            m37477j.m37477j("Proxy-Authorization", m37459i2);
        }
        return m37477j.m37475h();
    }

    /* renamed from: x */
    public final void m37362x(C8743s c8743s, int i10, int i11) {
        String mo38671g;
        C9181f m38667e = C9181f.m38667e();
        if (c8743s != null) {
            m37354p(c8743s, i10, i11);
        }
        C8725a c8725a = this.f40609b.f40708a;
        Socket createSocket = c8725a.f40540e.createSocket(this.f40610c, c8725a.f40537b, c8725a.f40538c, true);
        this.f40610c = createSocket;
        SSLSocket sSLSocket = (SSLSocket) createSocket;
        C8747w c8747w = this.f40609b;
        c8747w.f40711d.m37372c(sSLSocket, c8747w);
        sSLSocket.startHandshake();
        C8725a c8725a2 = this.f40609b.f40708a;
        if (!c8725a2.f40541f.verify(c8725a2.f40537b, sSLSocket.getSession())) {
            throw new IOException("Hostname '" + this.f40609b.f40708a.f40537b + "' was not verified");
        }
        C8725a c8725a3 = this.f40609b.f40708a;
        c8725a3.f40542g.m37334a(c8725a3.f40537b, sSLSocket.getSession().getPeerCertificates());
        this.f40616i = C8738n.m37392c(sSLSocket.getSession());
        if (this.f40609b.f40711d.m37376g() && (mo38671g = m38667e.mo38671g(sSLSocket)) != null) {
            this.f40614g = EnumC8742r.get(mo38671g);
        }
        EnumC8742r enumC8742r = this.f40614g;
        if (enumC8742r != EnumC8742r.SPDY_3 && enumC8742r != EnumC8742r.HTTP_2) {
            this.f40612e = new C9350e(this.f40608a, this, this.f40610c);
            return;
        }
        sSLSocket.setSoTimeout(0);
        C9588o m40356g = new C9588o.h(this.f40609b.f40708a.m37281c(), true, this.f40610c).m40357h(this.f40614g).m40356g();
        this.f40613f = m40356g;
        m40356g.m40341Y0();
    }
}
