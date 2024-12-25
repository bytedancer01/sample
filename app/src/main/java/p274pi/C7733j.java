package p274pi;

import ci.C1119e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kh.C5616j;
import kh.C5624r;
import ki.C5634b;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.jetbrains.annotations.NotNull;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5414h0;
import p173ji.C5433x;
import p173ji.InterfaceC5434y;
import p253oi.C6979c;
import p253oi.C6981e;
import p253oi.C6982f;
import p253oi.C6986j;
import p312ri.C8475a;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/j.class
 */
/* renamed from: pi.j */
/* loaded from: combined.jar:classes2.jar:pi/j.class */
public final class C7733j implements InterfaceC5434y {

    /* renamed from: b */
    public static final a f37511b = new a(null);

    /* renamed from: a */
    public final C5402b0 f37512a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:pi/j$a.class
     */
    /* renamed from: pi.j$a */
    /* loaded from: combined.jar:classes2.jar:pi/j$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    public C7733j(@NotNull C5402b0 c5402b0) {
        C9367f.m39526e(c5402b0, "client");
        this.f37512a = c5402b0;
    }

    /* renamed from: a */
    public final C5406d0 m33760a(C5410f0 c5410f0, String str) {
        String m26912B;
        C5433x m27120r;
        String str2;
        AbstractC5408e0 abstractC5408e0 = null;
        if (!this.f37512a.m26809s() || (m26912B = C5410f0.m26912B(c5410f0, "Location", null, 2, null)) == null || (m27120r = c5410f0.m26918F0().m26880j().m27120r(m26912B)) == null) {
            return null;
        }
        if (!C9367f.m39522a(m27120r.m27121s(), c5410f0.m26918F0().m26880j().m27121s()) && !this.f37512a.m26810u()) {
            return null;
        }
        C5406d0.a m26878h = c5410f0.m26918F0().m26878h();
        if (C7729f.m33744a(str)) {
            int m26925q = c5410f0.m26925q();
            C7729f c7729f = C7729f.f37497a;
            boolean z10 = c7729f.m33747c(str) || m26925q == 308 || m26925q == 307;
            if (!c7729f.m33746b(str) || m26925q == 308 || m26925q == 307) {
                str2 = str;
                if (z10) {
                    abstractC5408e0 = c5410f0.m26918F0().m26871a();
                    str2 = str;
                }
            } else {
                str2 = HttpGet.METHOD_NAME;
            }
            m26878h.m26888h(str2, abstractC5408e0);
            if (!z10) {
                m26878h.m26890j("Transfer-Encoding");
                m26878h.m26890j("Content-Length");
                m26878h.m26890j("Content-Type");
            }
        }
        if (!C5634b.m27787g(c5410f0.m26918F0().m26880j(), m27120r)) {
            m26878h.m26890j("Authorization");
        }
        return m26878h.m26893m(m27120r).m26883b();
    }

    /* renamed from: b */
    public final C5406d0 m33761b(C5410f0 c5410f0, C6979c c6979c) {
        C6982f m32015h;
        C5414h0 m32075A = (c6979c == null || (m32015h = c6979c.m32015h()) == null) ? null : m32015h.m32075A();
        int m26925q = c5410f0.m26925q();
        String m26877g = c5410f0.m26918F0().m26877g();
        if (m26925q != 307 && m26925q != 308) {
            if (m26925q == 401) {
                return this.f37512a.m26797e().mo26775a(m32075A, c5410f0);
            }
            if (m26925q == 421) {
                AbstractC5408e0 m26871a = c5410f0.m26918F0().m26871a();
                if ((m26871a != null && m26871a.m26900h()) || c6979c == null || !c6979c.m32018k()) {
                    return null;
                }
                c6979c.m32015h().m32106y();
                return c5410f0.m26918F0();
            }
            if (m26925q == 503) {
                C5410f0 m26915C0 = c5410f0.m26915C0();
                if ((m26915C0 == null || m26915C0.m26925q() != 503) && m33765f(c5410f0, Integer.MAX_VALUE) == 0) {
                    return c5410f0.m26918F0();
                }
                return null;
            }
            if (m26925q == 407) {
                C9367f.m39524c(m32075A);
                if (m32075A.m26978b().type() == Proxy.Type.HTTP) {
                    return this.f37512a.m26787J().mo26775a(m32075A, c5410f0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (m26925q == 408) {
                if (!this.f37512a.m26790M()) {
                    return null;
                }
                AbstractC5408e0 m26871a2 = c5410f0.m26918F0().m26871a();
                if (m26871a2 != null && m26871a2.m26900h()) {
                    return null;
                }
                C5410f0 m26915C02 = c5410f0.m26915C0();
                if ((m26915C02 == null || m26915C02.m26925q() != 408) && m33765f(c5410f0, 0) <= 0) {
                    return c5410f0.m26918F0();
                }
                return null;
            }
            switch (m26925q) {
                case 300:
                case 301:
                case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                case HttpStatus.SC_SEE_OTHER /* 303 */:
                    break;
                default:
                    return null;
            }
        }
        return m33760a(c5410f0, m26877g);
    }

    /* renamed from: c */
    public final boolean m33762c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
        }
        boolean z11 = false;
        if (iOException instanceof SocketTimeoutException) {
            z11 = false;
            if (!z10) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: d */
    public final boolean m33763d(IOException iOException, C6981e c6981e, C5406d0 c5406d0, boolean z10) {
        if (this.f37512a.m26790M()) {
            return !(z10 && m33764e(iOException, c5406d0)) && m33762c(iOException, z10) && c6981e.m32044C();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m33764e(IOException iOException, C5406d0 c5406d0) {
        AbstractC5408e0 m26871a = c5406d0.m26871a();
        return (m26871a != null && m26871a.m26900h()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m33765f(C5410f0 c5410f0, int i10) {
        String m26912B = C5410f0.m26912B(c5410f0, HttpHeaders.RETRY_AFTER, null, 2, null);
        if (m26912B == null) {
            return i10;
        }
        if (!new C1119e("\\d+").m6703a(m26912B)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(m26912B);
        C9367f.m39525d(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    @Override // p173ji.InterfaceC5434y
    @NotNull
    public C5410f0 intercept(@NotNull InterfaceC5434y.a aVar) {
        C6979c m32060o;
        C9367f.m39526e(aVar, "chain");
        C7730g c7730g = (C7730g) aVar;
        C5406d0 m33754h = c7730g.m33754h();
        C6981e m33750d = c7730g.m33750d();
        List m27700f = C5616j.m27700f();
        C5410f0 c5410f0 = null;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            m33750d.m32054i(m33754h, z10);
            try {
                if (m33750d.isCanceled()) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        C5410f0 mo27169a = c7730g.mo27169a(m33754h);
                        C5410f0 c5410f02 = mo27169a;
                        if (c5410f0 != null) {
                            c5410f02 = mo27169a.m26914B0().m26946o(c5410f0.m26914B0().m26933b(null).m26934c()).m26934c();
                        }
                        c5410f0 = c5410f02;
                        m32060o = m33750d.m32060o();
                        m33754h = m33761b(c5410f0, m32060o);
                    } catch (IOException e10) {
                        e = e10;
                        if (!m33763d(e, m33750d, m33754h, !(e instanceof C8475a))) {
                            throw C5634b.m27779W(e, m27700f);
                        }
                        m27700f = C5624r.m27713B(m27700f, e);
                        m33750d.m32055j(true);
                        z10 = false;
                    }
                } catch (C6986j e11) {
                    if (!m33763d(e11.m32120c(), m33750d, m33754h, false)) {
                        throw C5634b.m27779W(e11.m32119b(), m27700f);
                    }
                    e = e11.m32119b();
                    m27700f = C5624r.m27713B(m27700f, e);
                    m33750d.m32055j(true);
                    z10 = false;
                }
                if (m33754h == null) {
                    if (m32060o != null && m32060o.m32019l()) {
                        m33750d.m32046E();
                    }
                    m33750d.m32055j(false);
                    return c5410f0;
                }
                AbstractC5408e0 m26871a = m33754h.m26871a();
                if (m26871a != null && m26871a.m26900h()) {
                    m33750d.m32055j(false);
                    return c5410f0;
                }
                AbstractC5412g0 m26920f = c5410f0.m26920f();
                if (m26920f != null) {
                    C5634b.m27790j(m26920f);
                }
                i10++;
                if (i10 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i10);
                }
                m33750d.m32055j(true);
                z10 = true;
            } catch (Throwable th2) {
                m33750d.m32055j(true);
                throw th2;
            }
        }
    }
}
