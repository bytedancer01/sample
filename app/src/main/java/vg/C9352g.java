package vg;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.security.cert.CertificateException;
import java.util.Date;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.protocol.HTTP;
import p411xi.C9761e;
import p411xi.C9769m;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;
import tg.AbstractC8746v;
import tg.C8733i;
import tg.C8739o;
import tg.C8741q;
import tg.C8743s;
import tg.C8745u;
import tg.C8747w;
import tg.EnumC8742r;
import ug.AbstractC9177b;
import ug.C9183h;
import ug.C9184i;
import ug.InterfaceC9178c;
import vg.C9348c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/g.class
 */
/* renamed from: vg.g */
/* loaded from: combined.jar:classes2.jar:vg/g.class */
public final class C9352g {

    /* renamed from: v */
    public static final AbstractC8746v f42833v = new a();

    /* renamed from: a */
    public final C8741q f42834a;

    /* renamed from: b */
    public C8733i f42835b;

    /* renamed from: c */
    public C9358m f42836c;

    /* renamed from: d */
    public C8747w f42837d;

    /* renamed from: e */
    public final C8745u f42838e;

    /* renamed from: f */
    public InterfaceC9361p f42839f;

    /* renamed from: g */
    public long f42840g = -1;

    /* renamed from: h */
    public boolean f42841h;

    /* renamed from: i */
    public final boolean f42842i;

    /* renamed from: j */
    public final C8743s f42843j;

    /* renamed from: k */
    public C8743s f42844k;

    /* renamed from: l */
    public C8745u f42845l;

    /* renamed from: m */
    public C8745u f42846m;

    /* renamed from: n */
    public C8745u f42847n;

    /* renamed from: o */
    public InterfaceC9782z f42848o;

    /* renamed from: p */
    public InterfaceC9762f f42849p;

    /* renamed from: q */
    public InterfaceC9756b0 f42850q;

    /* renamed from: r */
    public InterfaceC9763g f42851r;

    /* renamed from: s */
    public InputStream f42852s;

    /* renamed from: t */
    public InterfaceC9347b f42853t;

    /* renamed from: u */
    public C9348c f42854u;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/g$a.class
     */
    /* renamed from: vg.g$a */
    /* loaded from: combined.jar:classes2.jar:vg/g$a.class */
    public static final class a extends AbstractC8746v {
        @Override // tg.AbstractC8746v
        /* renamed from: l */
        public long mo37310l() {
            return 0L;
        }

        @Override // tg.AbstractC8746v
        /* renamed from: o */
        public InterfaceC9763g mo37311o() {
            return new C9761e();
        }
    }

    public C9352g(C8741q c8741q, C8743s c8743s, boolean z10, C8733i c8733i, C9358m c9358m, C9357l c9357l, C8745u c8745u) {
        C8747w c8747w;
        this.f42834a = c8741q;
        this.f42843j = c8743s;
        this.f42842i = z10;
        this.f42835b = c8733i;
        this.f42836c = c9358m;
        this.f42848o = c9357l;
        this.f42838e = c8745u;
        if (c8733i != null) {
            AbstractC9177b.f41993b.mo37449k(c8733i, this);
            c8747w = c8733i.m37345g();
        } else {
            c8747w = null;
        }
        this.f42837d = c8747w;
    }

    /* renamed from: b */
    public static C8739o m39437b(C8739o c8739o, C8739o c8739o2) {
        int i10;
        C8739o.b bVar = new C8739o.b();
        int i11 = 0;
        while (true) {
            if (i11 >= c8739o.m37401f()) {
                break;
            }
            String m37399d = c8739o.m37399d(i11);
            String m37402g = c8739o.m37402g(i11);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(m37399d) || !m37402g.startsWith("1")) && (!C9355j.m39482g(m37399d) || c8739o2.m37397a(m37399d) == null)) {
                bVar.m37405b(m37399d, m37402g);
            }
            i11++;
        }
        for (i10 = 0; i10 < c8739o2.m37401f(); i10++) {
            String m37399d2 = c8739o2.m37399d(i10);
            if (!"Content-Length".equalsIgnoreCase(m37399d2) && C9355j.m39482g(m37399d2)) {
                bVar.m37405b(m37399d2, c8739o2.m37402g(i10));
            }
        }
        return bVar.m37408e();
    }

    /* renamed from: m */
    public static String m39438m(URL url) {
        String host;
        if (C9183h.m38690j(url) != C9183h.m38687g(url.getProtocol())) {
            host = url.getHost() + ":" + url.getPort();
        } else {
            host = url.getHost();
        }
        return host;
    }

    /* renamed from: y */
    public static C8745u m39439y(C8745u c8745u) {
        C8745u c8745u2 = c8745u;
        if (c8745u != null) {
            c8745u2 = c8745u;
            if (c8745u.m37497k() != null) {
                c8745u2 = c8745u.m37509w().m37523l(null).m37524m();
            }
        }
        return c8745u2;
    }

    /* renamed from: z */
    public static boolean m39440z(C8745u c8745u, C8745u c8745u2) {
        Date m37398c;
        if (c8745u2.m37501o() == 304) {
            return true;
        }
        Date m37398c2 = c8745u.m37505s().m37398c("Last-Modified");
        return (m37398c2 == null || (m37398c = c8745u2.m37505s().m37398c("Last-Modified")) == null || m37398c.getTime() >= m37398c2.getTime()) ? false : true;
    }

    /* renamed from: A */
    public void m39441A() {
        if (this.f42840g != -1) {
            throw new IllegalStateException();
        }
        this.f42840g = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0016, code lost:
    
        if (r4 != null) goto L4;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tg.C8733i m39442a() {
        /*
            r3 = this;
            r0 = r3
            xi.f r0 = r0.f42849p
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L10
        L9:
            r0 = r4
            ug.C9183h.m38683c(r0)
            goto L1c
        L10:
            r0 = r3
            xi.z r0 = r0.f42848o
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1c
            goto L9
        L1c:
            r0 = r3
            xi.g r0 = r0.f42851r
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L3c
            r0 = r3
            tg.i r0 = r0.f42835b
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L35
            r0 = r4
            java.net.Socket r0 = r0.m37346h()
            ug.C9183h.m38684d(r0)
        L35:
            r0 = r3
            r1 = 0
            r0.f42835b = r1
            r0 = 0
            return r0
        L3c:
            r0 = r4
            ug.C9183h.m38683c(r0)
            r0 = r3
            java.io.InputStream r0 = r0.f42852s
            ug.C9183h.m38683c(r0)
            r0 = r3
            vg.p r0 = r0.f42839f
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L71
            r0 = r3
            tg.i r0 = r0.f42835b
            if (r0 == 0) goto L71
            r0 = r4
            boolean r0 = r0.mo39475i()
            if (r0 != 0) goto L71
            r0 = r3
            tg.i r0 = r0.f42835b
            java.net.Socket r0 = r0.m37346h()
            ug.C9183h.m38684d(r0)
            r0 = r3
            r1 = 0
            r0.f42835b = r1
            r0 = 0
            return r0
        L71:
            r0 = r3
            tg.i r0 = r0.f42835b
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L89
            ug.b r0 = ug.AbstractC9177b.f41993b
            r1 = r4
            boolean r0 = r0.mo37440b(r1)
            if (r0 != 0) goto L89
            r0 = r3
            r1 = 0
            r0.f42835b = r1
        L89:
            r0 = r3
            tg.i r0 = r0.f42835b
            r4 = r0
            r0 = r3
            r1 = 0
            r0.f42835b = r1
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.C9352g.m39442a():tg.i");
    }

    /* renamed from: c */
    public final void m39443c(C8743s c8743s) {
        if (this.f42835b != null) {
            throw new IllegalStateException();
        }
        if (this.f42836c == null) {
            this.f42836c = C9358m.m39497b(c8743s, this.f42834a);
        }
        C8733i m39504h = this.f42836c.m39504h(this);
        this.f42835b = m39504h;
        this.f42837d = m39504h.m37345g();
    }

    /* renamed from: d */
    public C8743s m39444d() {
        String m37503q;
        if (this.f42847n == null) {
            throw new IllegalStateException();
        }
        Proxy m37540b = m39451k() != null ? m39451k().m37540b() : this.f42834a.m37434r();
        int m37501o = this.f42847n.m37501o();
        if (m37501o != 307 && m37501o != 308) {
            if (m37501o != 401) {
                if (m37501o != 407) {
                    switch (m37501o) {
                        case 300:
                        case 301:
                        case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                        case HttpStatus.SC_SEE_OTHER /* 303 */:
                            break;
                        default:
                            return null;
                    }
                } else if (m37540b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            }
            return C9355j.m39484i(this.f42834a.m37422d(), this.f42847n, m37540b);
        }
        if (!this.f42843j.m37463m().equals(HttpGet.METHOD_NAME) && !this.f42843j.m37463m().equals(HttpHead.METHOD_NAME)) {
            return null;
        }
        if (!this.f42834a.m37430m() || (m37503q = this.f42847n.m37503q("Location")) == null) {
            return null;
        }
        URL url = new URL(this.f42843j.m37466p(), m37503q);
        if (!url.getProtocol().equals(ClientConstants.DOMAIN_SCHEME) && !url.getProtocol().equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            return null;
        }
        if (!url.getProtocol().equals(this.f42843j.m37466p().getProtocol()) && !this.f42834a.m37431n()) {
            return null;
        }
        C8743s.b m37464n = this.f42843j.m37464n();
        if (C9353h.m39465b(this.f42843j.m37463m())) {
            m37464n.m37479l(HttpGet.METHOD_NAME, null);
            m37464n.m37480m("Transfer-Encoding");
            m37464n.m37480m("Content-Length");
            m37464n.m37480m("Content-Type");
        }
        if (!m39462w(url)) {
            m37464n.m37480m("Authorization");
        }
        return m37464n.m37482o(url).m37475h();
    }

    /* renamed from: e */
    public InterfaceC9762f m39445e() {
        InterfaceC9762f interfaceC9762f;
        InterfaceC9762f interfaceC9762f2 = this.f42849p;
        if (interfaceC9762f2 != null) {
            return interfaceC9762f2;
        }
        InterfaceC9782z m39448h = m39448h();
        if (m39448h != null) {
            interfaceC9762f = C9772p.m41228b(m39448h);
            this.f42849p = interfaceC9762f;
        } else {
            interfaceC9762f = null;
        }
        return interfaceC9762f;
    }

    /* renamed from: f */
    public C8733i m39446f() {
        return this.f42835b;
    }

    /* renamed from: g */
    public C8743s m39447g() {
        return this.f42843j;
    }

    /* renamed from: h */
    public InterfaceC9782z m39448h() {
        if (this.f42854u != null) {
            return this.f42848o;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public C8745u m39449i() {
        C8745u c8745u = this.f42847n;
        if (c8745u != null) {
            return c8745u;
        }
        throw new IllegalStateException();
    }

    /* renamed from: j */
    public InterfaceC9763g m39450j() {
        if (this.f42847n != null) {
            return this.f42851r;
        }
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public C8747w m39451k() {
        return this.f42837d;
    }

    /* renamed from: l */
    public boolean m39452l() {
        if (this.f42843j.m37463m().equals(HttpHead.METHOD_NAME)) {
            return false;
        }
        int m37501o = this.f42847n.m37501o();
        return (((m37501o >= 100 && m37501o < 200) || m37501o == 204 || m37501o == 304) && C9355j.m39480e(this.f42846m) == -1 && !HTTP.CHUNK_CODING.equalsIgnoreCase(this.f42846m.m37503q("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: n */
    public final void m39453n(InterfaceC9756b0 interfaceC9756b0) {
        InterfaceC9763g m41229c;
        this.f42850q = interfaceC9756b0;
        if (this.f42841h && "gzip".equalsIgnoreCase(this.f42847n.m37503q("Content-Encoding"))) {
            this.f42847n = this.f42847n.m37509w().m37536y("Content-Encoding").m37536y("Content-Length").m37524m();
            m41229c = C9772p.m41229c(new C9769m(interfaceC9756b0));
        } else {
            m41229c = C9772p.m41229c(interfaceC9756b0);
        }
        this.f42851r = m41229c;
    }

    /* renamed from: o */
    public final boolean m39454o(IOException iOException) {
        boolean z10 = iOException instanceof ProtocolException;
        boolean z11 = false;
        if (!((iOException instanceof SSLPeerUnverifiedException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)))) {
            z11 = false;
            if (!z10) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: p */
    public final void m39455p() {
        InterfaceC9178c mo37442d = AbstractC9177b.f41993b.mo37442d(this.f42834a);
        if (mo37442d == null) {
            return;
        }
        if (C9348c.m39391a(this.f42847n, this.f42844k)) {
            this.f42853t = mo37442d.mo37301a(m39439y(this.f42847n));
        } else if (C9353h.m39464a(this.f42844k.m37463m())) {
            try {
                mo37442d.mo37304d(this.f42844k);
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: q */
    public final C8743s m39456q(C8743s c8743s) {
        C8743s.b m37464n = c8743s.m37464n();
        if (c8743s.m37459i("Host") == null) {
            m37464n.m37477j("Host", m39438m(c8743s.m37466p()));
        }
        C8733i c8733i = this.f42835b;
        if ((c8733i == null || c8733i.m37344f() != EnumC8742r.HTTP_1_0) && c8743s.m37459i("Connection") == null) {
            m37464n.m37477j("Connection", HTTP.CONN_KEEP_ALIVE);
        }
        if (c8743s.m37459i(HttpHeaders.ACCEPT_ENCODING) == null) {
            this.f42841h = true;
            m37464n.m37477j(HttpHeaders.ACCEPT_ENCODING, "gzip");
        }
        CookieHandler m37427j = this.f42834a.m37427j();
        if (m37427j != null) {
            C9355j.m39476a(m37464n, m37427j.get(c8743s.m37465o(), C9355j.m39486k(m37464n.m37475h().m37461k(), null)));
        }
        if (c8743s.m37459i("User-Agent") == null) {
            m37464n.m37477j("User-Agent", C9184i.m38699a());
        }
        return m37464n.m37475h();
    }

    /* renamed from: r */
    public boolean m39457r() {
        return C9353h.m39465b(this.f42843j.m37463m());
    }

    /* renamed from: s */
    public void m39458s() {
        if (this.f42847n != null) {
            return;
        }
        C8743s c8743s = this.f42844k;
        if (c8743s == null && this.f42845l == null) {
            throw new IllegalStateException("call sendRequest() first!");
        }
        if (c8743s == null) {
            return;
        }
        InterfaceC9762f interfaceC9762f = this.f42849p;
        if (interfaceC9762f != null && interfaceC9762f.mo41177z().size() > 0) {
            this.f42849p.flush();
        }
        if (this.f42840g == -1) {
            if (C9355j.m39479d(this.f42844k) == -1) {
                InterfaceC9782z interfaceC9782z = this.f42848o;
                if (interfaceC9782z instanceof C9357l) {
                    this.f42844k = this.f42844k.m37464n().m37477j("Content-Length", Long.toString(((C9357l) interfaceC9782z).m39495f())).m37475h();
                }
            }
            this.f42839f.mo39471e(this.f42844k);
        }
        InterfaceC9782z interfaceC9782z2 = this.f42848o;
        if (interfaceC9782z2 != null) {
            InterfaceC9762f interfaceC9762f2 = this.f42849p;
            if (interfaceC9762f2 != null) {
                interfaceC9762f2.close();
            } else {
                interfaceC9782z2.close();
            }
            InterfaceC9782z interfaceC9782z3 = this.f42848o;
            if (interfaceC9782z3 instanceof C9357l) {
                this.f42839f.mo39473g((C9357l) interfaceC9782z3);
            }
        }
        this.f42839f.mo39467a();
        C8745u m37524m = this.f42839f.mo39470d().m37537z(this.f42844k).m37529r(this.f42835b.m37342d()).m37530s(C9355j.f42860c, Long.toString(this.f42840g)).m37530s(C9355j.f42861d, Long.toString(System.currentTimeMillis())).m37524m();
        this.f42846m = m37524m;
        AbstractC9177b.f41993b.mo37450l(this.f42835b, m37524m.m37510x());
        m39459t(this.f42846m.m37505s());
        C8745u c8745u = this.f42845l;
        if (c8745u != null) {
            if (m39440z(c8745u, this.f42846m)) {
                this.f42847n = this.f42845l.m37509w().m37537z(this.f42843j).m37534w(m39439y(this.f42838e)).m37531t(m39437b(this.f42845l.m37505s(), this.f42846m.m37505s())).m37525n(m39439y(this.f42845l)).m37533v(m39439y(this.f42846m)).m37524m();
                this.f42839f.mo39468b();
                m39461v();
                InterfaceC9178c mo37442d = AbstractC9177b.f41993b.mo37442d(this.f42834a);
                mo37442d.mo37306f();
                mo37442d.mo37303c(this.f42845l, m39439y(this.f42847n));
                if (this.f42845l.m37497k() != null) {
                    m39453n(this.f42845l.m37497k().mo37311o());
                    return;
                }
                return;
            }
            C9183h.m38683c(this.f42845l.m37497k());
        }
        this.f42847n = this.f42846m.m37509w().m37537z(this.f42843j).m37534w(m39439y(this.f42838e)).m37525n(m39439y(this.f42845l)).m37533v(m39439y(this.f42846m)).m37524m();
        if (m39452l()) {
            m39455p();
            m39453n(this.f42839f.mo39474h(this.f42853t));
        } else {
            InterfaceC9756b0 mo39474h = this.f42839f.mo39474h(this.f42853t);
            this.f42850q = mo39474h;
            this.f42851r = C9772p.m41229c(mo39474h);
        }
    }

    /* renamed from: t */
    public void m39459t(C8739o c8739o) {
        CookieHandler m37427j = this.f42834a.m37427j();
        if (m37427j != null) {
            m37427j.put(this.f42843j.m37465o(), C9355j.m39486k(c8739o, null));
        }
    }

    /* renamed from: u */
    public C9352g m39460u(IOException iOException, InterfaceC9782z interfaceC9782z) {
        C8733i c8733i;
        C9358m c9358m = this.f42836c;
        if (c9358m != null && (c8733i = this.f42835b) != null) {
            c9358m.m39498a(c8733i, iOException);
        }
        boolean z10 = interfaceC9782z == null || (interfaceC9782z instanceof C9357l);
        C9358m c9358m2 = this.f42836c;
        if (c9358m2 == null && this.f42835b == null) {
            return null;
        }
        if ((c9358m2 == null || c9358m2.m39499c()) && m39454o(iOException) && z10) {
            return new C9352g(this.f42834a, this.f42843j, this.f42842i, m39442a(), this.f42836c, (C9357l) interfaceC9782z, this.f42838e);
        }
        return null;
    }

    /* renamed from: v */
    public void m39461v() {
        InterfaceC9361p interfaceC9361p = this.f42839f;
        if (interfaceC9361p != null && this.f42835b != null) {
            interfaceC9361p.mo39472f();
        }
        this.f42835b = null;
    }

    /* renamed from: w */
    public boolean m39462w(URL url) {
        URL m37466p = this.f42843j.m37466p();
        return m37466p.getHost().equals(url.getHost()) && C9183h.m38690j(m37466p) == C9183h.m38690j(url) && m37466p.getProtocol().equals(url.getProtocol());
    }

    /* renamed from: x */
    public void m39463x() {
        InterfaceC9782z mo39469c;
        if (this.f42854u != null) {
            return;
        }
        if (this.f42839f != null) {
            throw new IllegalStateException();
        }
        C8743s m39456q = m39456q(this.f42843j);
        InterfaceC9178c mo37442d = AbstractC9177b.f41993b.mo37442d(this.f42834a);
        C8745u mo37305e = mo37442d != null ? mo37442d.mo37305e(m39456q) : null;
        C9348c m39395c = new C9348c.b(System.currentTimeMillis(), m39456q, mo37305e).m39395c();
        this.f42854u = m39395c;
        this.f42844k = m39395c.f42788a;
        this.f42845l = m39395c.f42789b;
        if (mo37442d != null) {
            mo37442d.mo37302b(m39395c);
        }
        if (mo37305e != null && this.f42845l == null) {
            C9183h.m38683c(mo37305e.m37497k());
        }
        C8743s c8743s = this.f42844k;
        if (c8743s == null) {
            if (this.f42835b != null) {
                AbstractC9177b.f41993b.mo37446h(this.f42834a.m37425h(), this.f42835b);
                this.f42835b = null;
            }
            C8745u c8745u = this.f42845l;
            this.f42847n = (c8745u != null ? c8745u.m37509w().m37537z(this.f42843j).m37534w(m39439y(this.f42838e)).m37525n(m39439y(this.f42845l)) : new C8745u.b().m37537z(this.f42843j).m37534w(m39439y(this.f42838e)).m37535x(EnumC8742r.HTTP_1_1).m37528q(504).m37532u("Unsatisfiable Request (only-if-cached)").m37523l(f42833v)).m37524m();
            if (this.f42847n.m37497k() != null) {
                m39453n(this.f42847n.m37497k().mo37311o());
                return;
            }
            return;
        }
        if (this.f42835b == null) {
            m39443c(c8743s);
        }
        this.f42839f = AbstractC9177b.f41993b.mo37445g(this.f42835b, this);
        if (m39457r() && this.f42848o == null) {
            long m39479d = C9355j.m39479d(m39456q);
            if (!this.f42842i) {
                this.f42839f.mo39471e(m39456q);
                mo39469c = this.f42839f.mo39469c(m39456q, m39479d);
            } else {
                if (m39479d > 2147483647L) {
                    throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                }
                if (m39479d != -1) {
                    this.f42839f.mo39471e(m39456q);
                    mo39469c = new C9357l((int) m39479d);
                } else {
                    mo39469c = new C9357l();
                }
            }
            this.f42848o = mo39469c;
        }
    }
}
