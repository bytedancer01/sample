package vg;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocketFactory;
import tg.C8725a;
import tg.C8730f;
import tg.C8733i;
import tg.C8734j;
import tg.C8735k;
import tg.C8741q;
import tg.C8743s;
import tg.C8747w;
import ug.AbstractC9177b;
import ug.C9182g;
import ug.C9183h;
import ug.InterfaceC9180e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/m.class
 */
/* renamed from: vg.m */
/* loaded from: combined.jar:classes2.jar:vg/m.class */
public final class C9358m {

    /* renamed from: a */
    public final C8725a f42866a;

    /* renamed from: b */
    public final URI f42867b;

    /* renamed from: c */
    public final InterfaceC9180e f42868c;

    /* renamed from: d */
    public final C8741q f42869d;

    /* renamed from: e */
    public final ProxySelector f42870e;

    /* renamed from: f */
    public final C8734j f42871f;

    /* renamed from: g */
    public final C9182g f42872g;

    /* renamed from: h */
    public final C8743s f42873h;

    /* renamed from: i */
    public Proxy f42874i;

    /* renamed from: j */
    public InetSocketAddress f42875j;

    /* renamed from: k */
    public C8735k f42876k;

    /* renamed from: m */
    public int f42878m;

    /* renamed from: o */
    public int f42880o;

    /* renamed from: q */
    public int f42882q;

    /* renamed from: l */
    public List<Proxy> f42877l = Collections.emptyList();

    /* renamed from: n */
    public List<InetSocketAddress> f42879n = Collections.emptyList();

    /* renamed from: p */
    public List<C8735k> f42881p = Collections.emptyList();

    /* renamed from: r */
    public final List<C8747w> f42883r = new ArrayList();

    public C9358m(C8725a c8725a, URI uri, C8741q c8741q, C8743s c8743s) {
        this.f42866a = c8725a;
        this.f42867b = uri;
        this.f42869d = c8741q;
        this.f42870e = c8741q.m37435s();
        this.f42871f = c8741q.m37425h();
        this.f42872g = AbstractC9177b.f41993b.mo37448j(c8741q);
        this.f42868c = AbstractC9177b.f41993b.mo37444f(c8741q);
        this.f42873h = c8743s;
        m39512p(uri, c8725a.m37280b());
    }

    /* renamed from: b */
    public static C9358m m39497b(C8743s c8743s, C8741q c8741q) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C8730f c8730f;
        String host = c8743s.m37466p().getHost();
        if (host == null || host.length() == 0) {
            throw new UnknownHostException(c8743s.m37466p().toString());
        }
        if (c8743s.m37462l()) {
            sSLSocketFactory = c8741q.m37438z();
            hostnameVerifier = c8741q.m37432o();
            c8730f = c8741q.m37423e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c8730f = null;
        }
        return new C9358m(new C8725a(host, C9183h.m38690j(c8743s.m37466p()), c8741q.m37437x(), sSLSocketFactory, hostnameVerifier, c8730f, c8741q.m37422d(), c8741q.m37434r(), c8741q.m37433p(), c8741q.m37426i()), c8743s.m37465o(), c8741q, c8743s);
    }

    /* renamed from: a */
    public void m39498a(C8733i c8733i, IOException iOException) {
        ProxySelector proxySelector;
        if (AbstractC9177b.f41993b.mo37447i(c8733i) > 0) {
            return;
        }
        C8747w m37345g = c8733i.m37345g();
        if (m37345g.m37540b().type() != Proxy.Type.DIRECT && (proxySelector = this.f42870e) != null) {
            proxySelector.connectFailed(this.f42867b, m37345g.m37540b().address(), iOException);
        }
        this.f42872g.m38679b(m37345g);
        if ((iOException instanceof SSLHandshakeException) || (iOException instanceof SSLProtocolException)) {
            return;
        }
        while (this.f42882q < this.f42881p.size()) {
            C8725a c8725a = this.f42866a;
            Proxy proxy = this.f42874i;
            InetSocketAddress inetSocketAddress = this.f42875j;
            List<C8735k> list = this.f42881p;
            int i10 = this.f42882q;
            this.f42882q = i10 + 1;
            this.f42872g.m38679b(new C8747w(c8725a, proxy, inetSocketAddress, list.get(i10)));
        }
    }

    /* renamed from: c */
    public boolean m39499c() {
        return m39500d() || m39501e() || m39503g() || m39502f();
    }

    /* renamed from: d */
    public final boolean m39500d() {
        return this.f42882q < this.f42881p.size();
    }

    /* renamed from: e */
    public final boolean m39501e() {
        return this.f42880o < this.f42879n.size();
    }

    /* renamed from: f */
    public final boolean m39502f() {
        return !this.f42883r.isEmpty();
    }

    /* renamed from: g */
    public final boolean m39503g() {
        return this.f42878m < this.f42877l.size();
    }

    /* renamed from: h */
    public C8733i m39504h(C9352g c9352g) {
        C8733i m39509m = m39509m();
        AbstractC9177b.f41993b.mo37441c(this.f42869d, m39509m, c9352g, this.f42873h);
        return m39509m;
    }

    /* renamed from: i */
    public final C8735k m39505i() {
        if (m39500d()) {
            List<C8735k> list = this.f42881p;
            int i10 = this.f42882q;
            this.f42882q = i10 + 1;
            return list.get(i10);
        }
        throw new SocketException("No route to " + this.f42866a.m37281c() + "; exhausted connection specs: " + this.f42881p);
    }

    /* renamed from: j */
    public final InetSocketAddress m39506j() {
        if (m39501e()) {
            List<InetSocketAddress> list = this.f42879n;
            int i10 = this.f42880o;
            this.f42880o = i10 + 1;
            InetSocketAddress inetSocketAddress = list.get(i10);
            m39510n();
            return inetSocketAddress;
        }
        throw new SocketException("No route to " + this.f42866a.m37281c() + "; exhausted inet socket addresses: " + this.f42879n);
    }

    /* renamed from: k */
    public final C8747w m39507k() {
        return this.f42883r.remove(0);
    }

    /* renamed from: l */
    public final Proxy m39508l() {
        if (m39503g()) {
            List<Proxy> list = this.f42877l;
            int i10 = this.f42878m;
            this.f42878m = i10 + 1;
            Proxy proxy = list.get(i10);
            m39511o(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f42866a.m37281c() + "; exhausted proxy configurations: " + this.f42877l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return r0;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tg.C8733i m39509m() {
        /*
            r7 = this;
        L0:
            r0 = r7
            tg.j r0 = r0.f42871f
            r1 = r7
            tg.a r1 = r1.f42866a
            tg.i r0 = r0.m37367d(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L39
            r0 = r7
            tg.s r0 = r0.f42873h
            java.lang.String r0 = r0.m37463m()
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            ug.b r0 = ug.AbstractC9177b.f41993b
            r1 = r8
            boolean r0 = r0.mo37443e(r1)
            if (r0 == 0) goto L2d
            goto L37
        L2d:
            r0 = r8
            java.net.Socket r0 = r0.m37346h()
            r0.close()
            goto L0
        L37:
            r0 = r8
            return r0
        L39:
            r0 = r7
            boolean r0 = r0.m39500d()
            if (r0 != 0) goto L7d
            r0 = r7
            boolean r0 = r0.m39501e()
            if (r0 != 0) goto L75
            r0 = r7
            boolean r0 = r0.m39503g()
            if (r0 != 0) goto L6d
            r0 = r7
            boolean r0 = r0.m39502f()
            if (r0 == 0) goto L65
            tg.i r0 = new tg.i
            r1 = r0
            r2 = r7
            tg.j r2 = r2.f42871f
            r3 = r7
            tg.w r3 = r3.m39507k()
            r1.<init>(r2, r3)
            return r0
        L65:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r1 = r0
            r1.<init>()
            throw r0
        L6d:
            r0 = r7
            r1 = r7
            java.net.Proxy r1 = r1.m39508l()
            r0.f42874i = r1
        L75:
            r0 = r7
            r1 = r7
            java.net.InetSocketAddress r1 = r1.m39506j()
            r0.f42875j = r1
        L7d:
            r0 = r7
            tg.k r0 = r0.m39505i()
            r8 = r0
            r0 = r7
            r1 = r8
            r0.f42876k = r1
            tg.w r0 = new tg.w
            r1 = r0
            r2 = r7
            tg.a r2 = r2.f42866a
            r3 = r7
            java.net.Proxy r3 = r3.f42874i
            r4 = r7
            java.net.InetSocketAddress r4 = r4.f42875j
            r5 = r8
            r1.<init>(r2, r3, r4, r5)
            r8 = r0
            r0 = r7
            ug.g r0 = r0.f42872g
            r1 = r8
            boolean r0 = r0.m38680c(r1)
            if (r0 == 0) goto Lb7
            r0 = r7
            java.util.List<tg.w> r0 = r0.f42883r
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r7
            tg.i r0 = r0.m39509m()
            return r0
        Lb7:
            tg.i r0 = new tg.i
            r1 = r0
            r2 = r7
            tg.j r2 = r2.f42871f
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.C9358m.m39509m():tg.i");
    }

    /* renamed from: n */
    public final void m39510n() {
        this.f42881p = new ArrayList();
        for (C8735k c8735k : this.f42866a.m37279a()) {
            if (this.f42873h.m37462l() == c8735k.m37374e()) {
                this.f42881p.add(c8735k);
            }
        }
        this.f42882q = 0;
    }

    /* renamed from: o */
    public final void m39511o(Proxy proxy) {
        String hostName;
        int port;
        this.f42879n = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT) {
            hostName = this.f42866a.m37281c();
            port = C9183h.m38689i(this.f42867b);
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            hostName = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
        }
        for (InetAddress inetAddress : this.f42868c.mo38664a(hostName)) {
            this.f42879n.add(new InetSocketAddress(inetAddress, port));
        }
        this.f42880o = 0;
    }

    /* renamed from: p */
    public final void m39512p(URI uri, Proxy proxy) {
        if (proxy != null) {
            this.f42877l = Collections.singletonList(proxy);
        } else {
            this.f42877l = new ArrayList();
            List<Proxy> select = this.f42870e.select(uri);
            if (select != null) {
                this.f42877l.addAll(select);
            }
            this.f42877l.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f42877l.add(Proxy.NO_PROXY);
        }
        this.f42878m = 0;
    }
}
