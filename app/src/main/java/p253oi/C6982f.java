package p253oi;

import ci.C1121g;
import ci.C1128n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kh.C5617k;
import ki.C5634b;
import ni.C6798e;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.AbstractC5429t;
import p173ji.C5399a;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5411g;
import p173ji.C5414h0;
import p173ji.C5421l;
import p173ji.C5431v;
import p173ji.C5433x;
import p173ji.EnumC5404c0;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5417j;
import p274pi.C7730g;
import p274pi.InterfaceC7727d;
import p293qi.C7927b;
import p312ri.C8475a;
import p312ri.C8480f;
import p312ri.C8481g;
import p312ri.C8483i;
import p312ri.C8487m;
import p312ri.C8488n;
import p312ri.EnumC8476b;
import p356uh.InterfaceC9185a;
import p372vh.AbstractC9368g;
import p372vh.C9365d;
import p372vh.C9367f;
import p391wi.C9595d;
import p411xi.C9758c0;
import p411xi.C9772p;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import si.C8588j;
import vi.AbstractC9378c;
import vi.C9379d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/f.class
 */
/* renamed from: oi.f */
/* loaded from: combined.jar:classes2.jar:oi/f.class */
public final class C6982f extends C8480f.d implements InterfaceC5417j {

    /* renamed from: t */
    public static final a f36053t = new a(null);

    /* renamed from: c */
    public Socket f36054c;

    /* renamed from: d */
    public Socket f36055d;

    /* renamed from: e */
    public C5431v f36056e;

    /* renamed from: f */
    public EnumC5404c0 f36057f;

    /* renamed from: g */
    public C8480f f36058g;

    /* renamed from: h */
    public InterfaceC9763g f36059h;

    /* renamed from: i */
    public InterfaceC9762f f36060i;

    /* renamed from: j */
    public boolean f36061j;

    /* renamed from: k */
    public boolean f36062k;

    /* renamed from: l */
    public int f36063l;

    /* renamed from: m */
    public int f36064m;

    /* renamed from: n */
    public int f36065n;

    /* renamed from: o */
    public int f36066o;

    /* renamed from: p */
    @NotNull
    public final List<Reference<C6981e>> f36067p;

    /* renamed from: q */
    public long f36068q;

    /* renamed from: r */
    @NotNull
    public final C6984h f36069r;

    /* renamed from: s */
    public final C5414h0 f36070s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/f$a.class
     */
    /* renamed from: oi.f$a */
    /* loaded from: combined.jar:classes2.jar:oi/f$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/f$b.class
     */
    /* renamed from: oi.f$b */
    /* loaded from: combined.jar:classes2.jar:oi/f$b.class */
    public static final class b extends AbstractC9368g implements InterfaceC9185a<List<? extends Certificate>> {

        /* renamed from: c */
        public final C5411g f36071c;

        /* renamed from: d */
        public final C5431v f36072d;

        /* renamed from: e */
        public final C5399a f36073e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5411g c5411g, C5431v c5431v, C5399a c5399a) {
            super(0);
            this.f36071c = c5411g;
            this.f36072d = c5431v;
            this.f36073e = c5399a;
        }

        @Override // p356uh.InterfaceC9185a
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> mo20777h() {
            AbstractC9378c m26954d = this.f36071c.m26954d();
            C9367f.m39524c(m26954d);
            return m26954d.mo37549a(this.f36072d.m27074d(), this.f36073e.m26760l().m27112i());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/f$c.class
     */
    /* renamed from: oi.f$c */
    /* loaded from: combined.jar:classes2.jar:oi/f$c.class */
    public static final class c extends AbstractC9368g implements InterfaceC9185a<List<? extends X509Certificate>> {

        /* renamed from: c */
        public final C6982f f36074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6982f c6982f) {
            super(0);
            this.f36074c = c6982f;
        }

        @Override // p356uh.InterfaceC9185a
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> mo20777h() {
            C5431v c5431v = this.f36074c.f36056e;
            C9367f.m39524c(c5431v);
            List<Certificate> m27074d = c5431v.m27074d();
            ArrayList arrayList = new ArrayList(C5617k.m27708n(m27074d, 10));
            for (Certificate certificate : m27074d) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/f$d.class
     */
    /* renamed from: oi.f$d */
    /* loaded from: combined.jar:classes2.jar:oi/f$d.class */
    public static final class d extends C9595d.d {

        /* renamed from: e */
        public final C6979c f36075e;

        /* renamed from: f */
        public final InterfaceC9763g f36076f;

        /* renamed from: g */
        public final InterfaceC9762f f36077g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C6979c c6979c, InterfaceC9763g interfaceC9763g, InterfaceC9762f interfaceC9762f, boolean z10, InterfaceC9763g interfaceC9763g2, InterfaceC9762f interfaceC9762f2) {
            super(z10, interfaceC9763g2, interfaceC9762f2);
            this.f36075e = c6979c;
            this.f36076f = interfaceC9763g;
            this.f36077g = interfaceC9762f;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f36075e.m32008a(-1L, true, true, null);
        }
    }

    public C6982f(@NotNull C6984h c6984h, @NotNull C5414h0 c5414h0) {
        C9367f.m39526e(c6984h, "connectionPool");
        C9367f.m39526e(c5414h0, "route");
        this.f36069r = c6984h;
        this.f36070s = c5414h0;
        this.f36066o = 1;
        this.f36067p = new ArrayList();
        this.f36068q = Long.MAX_VALUE;
    }

    @NotNull
    /* renamed from: A */
    public C5414h0 m32075A() {
        return this.f36070s;
    }

    /* renamed from: B */
    public final boolean m32076B(List<C5414h0> list) {
        boolean z10 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C5414h0 c5414h0 : list) {
                if (c5414h0.m26978b().type() == Proxy.Type.DIRECT && this.f36070s.m26978b().type() == Proxy.Type.DIRECT && C9367f.m39522a(this.f36070s.m26980d(), c5414h0.m26980d())) {
                    break;
                }
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: C */
    public final void m32077C(long j10) {
        this.f36068q = j10;
    }

    /* renamed from: D */
    public final void m32078D(boolean z10) {
        this.f36061j = z10;
    }

    @NotNull
    /* renamed from: E */
    public Socket m32079E() {
        Socket socket = this.f36055d;
        C9367f.m39524c(socket);
        return socket;
    }

    /* renamed from: F */
    public final void m32080F(int i10) {
        Socket socket = this.f36055d;
        C9367f.m39524c(socket);
        InterfaceC9763g interfaceC9763g = this.f36059h;
        C9367f.m39524c(interfaceC9763g);
        InterfaceC9762f interfaceC9762f = this.f36060i;
        C9367f.m39524c(interfaceC9762f);
        socket.setSoTimeout(0);
        C8480f m36486a = new C8480f.b(true, C6798e.f35432h).m36498m(socket, this.f36070s.m26977a().m26760l().m27112i(), interfaceC9763g, interfaceC9762f).m36496k(this).m36497l(i10).m36486a();
        this.f36058g = m36486a;
        this.f36066o = C8480f.f39616E.m36499a().m36609d();
        C8480f.m36440g1(m36486a, false, null, 3, null);
    }

    /* renamed from: G */
    public final boolean m32081G(C5433x c5433x) {
        if (C5634b.f31711h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        C5433x m26760l = this.f36070s.m26977a().m26760l();
        if (c5433x.m27117o() != m26760l.m27117o()) {
            return false;
        }
        if (C9367f.m39522a(c5433x.m27112i(), m26760l.m27112i())) {
            return true;
        }
        boolean z10 = false;
        if (!this.f36062k) {
            C5431v c5431v = this.f36056e;
            z10 = false;
            if (c5431v != null) {
                C9367f.m39524c(c5431v);
                z10 = false;
                if (m32086e(c5433x, c5431v)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: H */
    public final void m32082H(@NotNull C6981e c6981e, @Nullable IOException iOException) {
        int i10;
        synchronized (this) {
            C9367f.m39526e(c6981e, "call");
            if (iOException instanceof C8488n) {
                if (((C8488n) iOException).f39792b == EnumC8476b.REFUSED_STREAM) {
                    int i11 = this.f36065n + 1;
                    this.f36065n = i11;
                    if (i11 > 1) {
                        this.f36061j = true;
                        i10 = this.f36063l;
                        this.f36063l = i10 + 1;
                    }
                } else if (((C8488n) iOException).f39792b != EnumC8476b.CANCEL || !c6981e.isCanceled()) {
                    this.f36061j = true;
                    i10 = this.f36063l;
                    this.f36063l = i10 + 1;
                }
            } else if (!m32103v() || (iOException instanceof C8475a)) {
                this.f36061j = true;
                if (this.f36064m == 0) {
                    if (iOException != null) {
                        m32088g(c6981e.m32056k(), this.f36070s, iOException);
                    }
                    i10 = this.f36063l;
                    this.f36063l = i10 + 1;
                }
            }
        }
    }

    @Override // p312ri.C8480f.d
    /* renamed from: a */
    public void mo32083a(@NotNull C8480f c8480f, @NotNull C8487m c8487m) {
        synchronized (this) {
            C9367f.m39526e(c8480f, "connection");
            C9367f.m39526e(c8487m, "settings");
            this.f36066o = c8487m.m36609d();
        }
    }

    @Override // p312ri.C8480f.d
    /* renamed from: b */
    public void mo32084b(@NotNull C8483i c8483i) {
        C9367f.m39526e(c8483i, "stream");
        c8483i.m36547d(EnumC8476b.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public final void m32085d() {
        Socket socket = this.f36054c;
        if (socket != null) {
            C5634b.m27791k(socket);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r0.m39558e(r0, (java.security.cert.X509Certificate) r0) != false) goto L12;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m32086e(p173ji.C5433x r5, p173ji.C5431v r6) {
        /*
            r4 = this;
            r0 = r6
            java.util.List r0 = r0.m27074d()
            r9 = r0
            r0 = r9
            boolean r0 = r0.isEmpty()
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L4b
            vi.d r0 = vi.C9379d.f42912a
            r6 = r0
            r0 = r5
            java.lang.String r0 = r0.m27112i()
            r5 = r0
            r0 = r9
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L40
            r0 = r6
            r1 = r5
            r2 = r9
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            boolean r0 = r0.m39558e(r1, r2)
            if (r0 == 0) goto L4b
            goto L4d
        L40:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r1.<init>(r2)
            throw r0
        L4b:
            r0 = 0
            r7 = r0
        L4d:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253oi.C6982f.m32086e(ji.x, ji.v):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f2 A[EDGE_INSN: B:53:0x01f2->B:50:0x01f2 BREAK  A[LOOP:0: B:16:0x00d7->B:52:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m32087f(int r8, int r9, int r10, int r11, boolean r12, @org.jetbrains.annotations.NotNull p173ji.InterfaceC5407e r13, @org.jetbrains.annotations.NotNull p173ji.AbstractC5429t r14) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p253oi.C6982f.m32087f(int, int, int, int, boolean, ji.e, ji.t):void");
    }

    /* renamed from: g */
    public final void m32088g(@NotNull C5402b0 c5402b0, @NotNull C5414h0 c5414h0, @NotNull IOException iOException) {
        C9367f.m39526e(c5402b0, "client");
        C9367f.m39526e(c5414h0, "failedRoute");
        C9367f.m39526e(iOException, "failure");
        if (c5414h0.m26978b().type() != Proxy.Type.DIRECT) {
            C5399a m26977a = c5414h0.m26977a();
            m26977a.m26757i().connectFailed(m26977a.m26760l().m27122t(), c5414h0.m26978b().address(), iOException);
        }
        c5402b0.m26811x().m32116b(c5414h0);
    }

    /* renamed from: h */
    public final void m32089h(int i10, int i11, InterfaceC5407e interfaceC5407e, AbstractC5429t abstractC5429t) {
        Socket socket;
        int i12;
        Proxy m26978b = this.f36070s.m26978b();
        C5399a m26977a = this.f36070s.m26977a();
        Proxy.Type type = m26978b.type();
        if (type != null && ((i12 = C6983g.f36078a[type.ordinal()]) == 1 || i12 == 2)) {
            socket = m26977a.m26758j().createSocket();
            C9367f.m39524c(socket);
        } else {
            socket = new Socket(m26978b);
        }
        this.f36054c = socket;
        abstractC5429t.m27048i(interfaceC5407e, this.f36070s.m26980d(), m26978b);
        socket.setSoTimeout(i11);
        try {
            C8588j.f40042c.m36880g().mo36843f(socket, this.f36070s.m26980d(), i10);
            try {
                this.f36059h = C9772p.m41229c(C9772p.m41238l(socket));
                this.f36060i = C9772p.m41228b(C9772p.m41234h(socket));
            } catch (NullPointerException e10) {
                if (C9367f.m39522a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f36070s.m26980d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: i */
    public final void m32090i(C6978b c6978b) {
        SSLSocket sSLSocket;
        C5399a m26977a = this.f36070s.m26977a();
        SSLSocketFactory m26759k = m26977a.m26759k();
        try {
            C9367f.m39524c(m26759k);
            Socket createSocket = m26759k.createSocket(this.f36054c, m26977a.m26760l().m27112i(), m26977a.m26760l().m27117o(), true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            sSLSocket = (SSLSocket) createSocket;
            try {
                C5421l m32005a = c6978b.m32005a(sSLSocket);
                if (m32005a.m27001h()) {
                    C8588j.f40042c.m36880g().mo36836e(sSLSocket, m26977a.m26760l().m27112i(), m26977a.m26754f());
                }
                sSLSocket.startHandshake();
                SSLSession session = sSLSocket.getSession();
                C5431v.a aVar = C5431v.f31136e;
                C9367f.m39525d(session, "sslSocketSession");
                C5431v m27076a = aVar.m27076a(session);
                HostnameVerifier m26753e = m26977a.m26753e();
                C9367f.m39524c(m26753e);
                if (m26753e.verify(m26977a.m26760l().m27112i(), session)) {
                    C5411g m26749a = m26977a.m26749a();
                    C9367f.m39524c(m26749a);
                    this.f36056e = new C5431v(m27076a.m27075e(), m27076a.m27071a(), m27076a.m27073c(), new b(m26749a, m27076a, m26977a));
                    m26749a.m26952b(m26977a.m26760l().m27112i(), new c(this));
                    String str = null;
                    if (m32005a.m27001h()) {
                        str = C8588j.f40042c.m36880g().mo36837g(sSLSocket);
                    }
                    this.f36055d = sSLSocket;
                    this.f36059h = C9772p.m41229c(C9772p.m41238l(sSLSocket));
                    this.f36060i = C9772p.m41228b(C9772p.m41234h(sSLSocket));
                    this.f36057f = str != null ? EnumC5404c0.Companion.m26854a(str) : EnumC5404c0.HTTP_1_1;
                    C8588j.f40042c.m36880g().mo36859b(sSLSocket);
                    return;
                }
                List<Certificate> m27074d = m27076a.m27074d();
                if (!(!m27074d.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + m26977a.m26760l().m27112i() + " not verified (no certificates)");
                }
                Certificate certificate = m27074d.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n              |Hostname ");
                sb2.append(m26977a.m26760l().m27112i());
                sb2.append(" not verified:\n              |    certificate: ");
                sb2.append(C5411g.f30938d.m26957a(x509Certificate));
                sb2.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                C9367f.m39525d(subjectDN, "cert.subjectDN");
                sb2.append(subjectDN.getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(C9379d.f42912a.m39554a(x509Certificate));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(C1121g.m6709e(sb2.toString(), null, 1, null));
            } catch (Throwable th2) {
                th = th2;
                if (sSLSocket != null) {
                    C8588j.f40042c.m36880g().mo36859b(sSLSocket);
                }
                if (sSLSocket != null) {
                    C5634b.m27791k(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            sSLSocket = null;
        }
    }

    /* renamed from: j */
    public final void m32091j(int i10, int i11, int i12, InterfaceC5407e interfaceC5407e, AbstractC5429t abstractC5429t) {
        C5406d0 m32093l = m32093l();
        C5433x m26880j = m32093l.m26880j();
        for (int i13 = 0; i13 < 21; i13++) {
            m32089h(i10, i11, interfaceC5407e, abstractC5429t);
            m32093l = m32092k(i11, i12, m32093l, m26880j);
            if (m32093l == null) {
                return;
            }
            Socket socket = this.f36054c;
            if (socket != null) {
                C5634b.m27791k(socket);
            }
            this.f36054c = null;
            this.f36060i = null;
            this.f36059h = null;
            abstractC5429t.m27046g(interfaceC5407e, this.f36070s.m26980d(), this.f36070s.m26978b(), null);
        }
    }

    /* renamed from: k */
    public final C5406d0 m32092k(int i10, int i11, C5406d0 c5406d0, C5433x c5433x) {
        C5410f0 m26934c;
        String str = "CONNECT " + C5634b.m27771O(c5433x, true) + " HTTP/1.1";
        do {
            InterfaceC9763g interfaceC9763g = this.f36059h;
            C9367f.m39524c(interfaceC9763g);
            InterfaceC9762f interfaceC9762f = this.f36060i;
            C9367f.m39524c(interfaceC9762f);
            C7927b c7927b = new C7927b(null, this, interfaceC9763g, interfaceC9762f);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC9763g.timeout().mo41092g(i10, timeUnit);
            interfaceC9762f.timeout().mo41092g(i11, timeUnit);
            c7927b.m34341A(c5406d0.m26875e(), str);
            c7927b.mo33729b();
            C5410f0.a mo33735h = c7927b.mo33735h(false);
            C9367f.m39524c(mo33735h);
            m26934c = mo33735h.m26949r(c5406d0).m26934c();
            c7927b.m34350z(m26934c);
            int m26925q = m26934c.m26925q();
            if (m26925q == 200) {
                if (interfaceC9763g.getBuffer().mo41164k0() && interfaceC9762f.getBuffer().mo41164k0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (m26925q != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + m26934c.m26925q());
            }
            c5406d0 = this.f36070s.m26977a().m26756h().mo26775a(this.f36070s, m26934c);
            if (c5406d0 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
        } while (!C1128n.m6719l("close", C5410f0.m26912B(m26934c, "Connection", null, 2, null), true));
        return c5406d0;
    }

    /* renamed from: l */
    public final C5406d0 m32093l() {
        C5406d0 m26883b = new C5406d0.a().m26893m(this.f36070s.m26977a().m26760l()).m26888h("CONNECT", null).m26886f("Host", C5634b.m27771O(this.f36070s.m26977a().m26760l(), true)).m26886f("Proxy-Connection", HTTP.CONN_KEEP_ALIVE).m26886f("User-Agent", "okhttp/4.9.3").m26883b();
        C5406d0 mo26775a = this.f36070s.m26977a().m26756h().mo26775a(this.f36070s, new C5410f0.a().m26949r(m26883b).m26947p(EnumC5404c0.HTTP_1_1).m26938g(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED).m26944m("Preemptive Authenticate").m26933b(C5634b.f31706c).m26950s(-1L).m26948q(-1L).m26941j("Proxy-Authenticate", "OkHttp-Preemptive").m26934c());
        if (mo26775a != null) {
            m26883b = mo26775a;
        }
        return m26883b;
    }

    /* renamed from: m */
    public final void m32094m(C6978b c6978b, int i10, InterfaceC5407e interfaceC5407e, AbstractC5429t abstractC5429t) {
        if (this.f36070s.m26977a().m26759k() != null) {
            abstractC5429t.m27039B(interfaceC5407e);
            m32090i(c6978b);
            abstractC5429t.m27038A(interfaceC5407e, this.f36056e);
            if (this.f36057f == EnumC5404c0.HTTP_2) {
                m32080F(i10);
                return;
            }
            return;
        }
        List<EnumC5404c0> m26754f = this.f36070s.m26977a().m26754f();
        EnumC5404c0 enumC5404c0 = EnumC5404c0.H2_PRIOR_KNOWLEDGE;
        if (!m26754f.contains(enumC5404c0)) {
            this.f36055d = this.f36054c;
            this.f36057f = EnumC5404c0.HTTP_1_1;
        } else {
            this.f36055d = this.f36054c;
            this.f36057f = enumC5404c0;
            m32080F(i10);
        }
    }

    @NotNull
    /* renamed from: n */
    public final List<Reference<C6981e>> m32095n() {
        return this.f36067p;
    }

    /* renamed from: o */
    public final long m32096o() {
        return this.f36068q;
    }

    /* renamed from: p */
    public final boolean m32097p() {
        return this.f36061j;
    }

    /* renamed from: q */
    public final int m32098q() {
        return this.f36063l;
    }

    @Nullable
    /* renamed from: r */
    public C5431v m32099r() {
        return this.f36056e;
    }

    /* renamed from: s */
    public final void m32100s() {
        synchronized (this) {
            this.f36064m++;
        }
    }

    /* renamed from: t */
    public final boolean m32101t(@NotNull C5399a c5399a, @Nullable List<C5414h0> list) {
        C9367f.m39526e(c5399a, "address");
        if (C5634b.f31711h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (this.f36067p.size() >= this.f36066o || this.f36061j || !this.f36070s.m26977a().m26752d(c5399a)) {
            return false;
        }
        if (C9367f.m39522a(c5399a.m26760l().m27112i(), m32075A().m26977a().m26760l().m27112i())) {
            return true;
        }
        if (this.f36058g == null || list == null || !m32076B(list) || c5399a.m26753e() != C9379d.f42912a || !m32081G(c5399a.m26760l())) {
            return false;
        }
        try {
            C5411g m26749a = c5399a.m26749a();
            C9367f.m39524c(m26749a);
            String m27112i = c5399a.m26760l().m27112i();
            C5431v m32099r = m32099r();
            C9367f.m39524c(m32099r);
            m26749a.m26951a(m27112i, m32099r.m27074d());
            return true;
        } catch (SSLPeerUnverifiedException e10) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0081, code lost:
    
        if (r4 != null) goto L8;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "Connection{"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r3
            ji.h0 r1 = r1.f36070s
            ji.a r1 = r1.m26977a()
            ji.x r1 = r1.m26760l()
            java.lang.String r1 = r1.m27112i()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r3
            ji.h0 r1 = r1.f36070s
            ji.a r1 = r1.m26977a()
            ji.x r1 = r1.m26760l()
            int r1 = r1.m27117o()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 44
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = " proxy="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r3
            ji.h0 r1 = r1.f36070s
            java.net.Proxy r1 = r1.m26978b()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = " hostAddress="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r3
            ji.h0 r1 = r1.f36070s
            java.net.InetSocketAddress r1 = r1.m26980d()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = " cipherSuite="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            ji.v r0 = r0.f36056e
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L87
            r0 = r4
            ji.i r0 = r0.m27071a()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L87
            goto L8b
        L87:
            java.lang.String r0 = "none"
            r4 = r0
        L8b:
            r0 = r5
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = " protocol="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r3
            ji.c0 r1 = r1.f36057f
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253oi.C6982f.toString():java.lang.String");
    }

    /* renamed from: u */
    public final boolean m32102u(boolean z10) {
        long j10;
        if (C5634b.f31711h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f36054c;
        C9367f.m39524c(socket);
        Socket socket2 = this.f36055d;
        C9367f.m39524c(socket2);
        InterfaceC9763g interfaceC9763g = this.f36059h;
        C9367f.m39524c(interfaceC9763g);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C8480f c8480f = this.f36058g;
        if (c8480f != null) {
            return c8480f.m36465S0(nanoTime);
        }
        synchronized (this) {
            j10 = this.f36068q;
        }
        if (nanoTime - j10 < 10000000000L || !z10) {
            return true;
        }
        return C5634b.m27759C(socket2, interfaceC9763g);
    }

    /* renamed from: v */
    public final boolean m32103v() {
        return this.f36058g != null;
    }

    @NotNull
    /* renamed from: w */
    public final InterfaceC7727d m32104w(@NotNull C5402b0 c5402b0, @NotNull C7730g c7730g) {
        InterfaceC7727d c7927b;
        C9367f.m39526e(c5402b0, "client");
        C9367f.m39526e(c7730g, "chain");
        Socket socket = this.f36055d;
        C9367f.m39524c(socket);
        InterfaceC9763g interfaceC9763g = this.f36059h;
        C9367f.m39524c(interfaceC9763g);
        InterfaceC9762f interfaceC9762f = this.f36060i;
        C9367f.m39524c(interfaceC9762f);
        C8480f c8480f = this.f36058g;
        if (c8480f != null) {
            c7927b = new C8481g(c5402b0, this, c7730g, c8480f);
        } else {
            socket.setSoTimeout(c7730g.m33756j());
            C9758c0 timeout = interfaceC9763g.timeout();
            long m33753g = c7730g.m33753g();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.mo41092g(m33753g, timeUnit);
            interfaceC9762f.timeout().mo41092g(c7730g.m33755i(), timeUnit);
            c7927b = new C7927b(c5402b0, this, interfaceC9763g, interfaceC9762f);
        }
        return c7927b;
    }

    @NotNull
    /* renamed from: x */
    public final C9595d.d m32105x(@NotNull C6979c c6979c) {
        C9367f.m39526e(c6979c, "exchange");
        Socket socket = this.f36055d;
        C9367f.m39524c(socket);
        InterfaceC9763g interfaceC9763g = this.f36059h;
        C9367f.m39524c(interfaceC9763g);
        InterfaceC9762f interfaceC9762f = this.f36060i;
        C9367f.m39524c(interfaceC9762f);
        socket.setSoTimeout(0);
        m32107z();
        return new d(c6979c, interfaceC9763g, interfaceC9762f, true, interfaceC9763g, interfaceC9762f);
    }

    /* renamed from: y */
    public final void m32106y() {
        synchronized (this) {
            this.f36062k = true;
        }
    }

    /* renamed from: z */
    public final void m32107z() {
        synchronized (this) {
            this.f36061j = true;
        }
    }
}
