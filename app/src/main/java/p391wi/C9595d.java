package p391wi;

import ci.C1128n;
import com.facebook.ads.AdError;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kh.C5615i;
import ki.C5634b;
import ni.AbstractC6794a;
import ni.C6797d;
import ni.C6798e;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpGet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p173ji.AbstractC5420k0;
import p173ji.AbstractC5429t;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.EnumC5404c0;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5409f;
import p173ji.InterfaceC5418j0;
import p253oi.C6979c;
import p253oi.C6981e;
import p372vh.C9365d;
import p372vh.C9367f;
import p372vh.C9369h;
import p372vh.C9371j;
import p391wi.C9598g;
import p406xd.C9728e;
import p411xi.C9764h;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wi/d.class
 */
/* renamed from: wi.d */
/* loaded from: combined.jar:classes2.jar:wi/d.class */
public final class C9595d implements InterfaceC5418j0, C9598g.a {

    /* renamed from: A */
    public static final b f43765A = new b(null);

    /* renamed from: z */
    public static final List<EnumC5404c0> f43766z = C5615i.m27696b(EnumC5404c0.HTTP_1_1);

    /* renamed from: a */
    public final String f43767a;

    /* renamed from: b */
    public InterfaceC5407e f43768b;

    /* renamed from: c */
    public AbstractC6794a f43769c;

    /* renamed from: d */
    public C9598g f43770d;

    /* renamed from: e */
    public C9599h f43771e;

    /* renamed from: f */
    public C6797d f43772f;

    /* renamed from: g */
    public String f43773g;

    /* renamed from: h */
    public d f43774h;

    /* renamed from: i */
    public final ArrayDeque<C9764h> f43775i;

    /* renamed from: j */
    public final ArrayDeque<Object> f43776j;

    /* renamed from: k */
    public long f43777k;

    /* renamed from: l */
    public boolean f43778l;

    /* renamed from: m */
    public int f43779m;

    /* renamed from: n */
    public String f43780n;

    /* renamed from: o */
    public boolean f43781o;

    /* renamed from: p */
    public int f43782p;

    /* renamed from: q */
    public int f43783q;

    /* renamed from: r */
    public int f43784r;

    /* renamed from: s */
    public boolean f43785s;

    /* renamed from: t */
    public final C5406d0 f43786t;

    /* renamed from: u */
    @NotNull
    public final AbstractC5420k0 f43787u;

    /* renamed from: v */
    public final Random f43788v;

    /* renamed from: w */
    public final long f43789w;

    /* renamed from: x */
    public C9596e f43790x;

    /* renamed from: y */
    public long f43791y;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$a.class
     */
    /* renamed from: wi.d$a */
    /* loaded from: combined.jar:classes2.jar:wi/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f43792a;

        /* renamed from: b */
        @Nullable
        public final C9764h f43793b;

        /* renamed from: c */
        public final long f43794c;

        public a(int i10, @Nullable C9764h c9764h, long j10) {
            this.f43792a = i10;
            this.f43793b = c9764h;
            this.f43794c = j10;
        }

        /* renamed from: a */
        public final long m40420a() {
            return this.f43794c;
        }

        /* renamed from: b */
        public final int m40421b() {
            return this.f43792a;
        }

        @Nullable
        /* renamed from: c */
        public final C9764h m40422c() {
            return this.f43793b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$b.class
     */
    /* renamed from: wi.d$b */
    /* loaded from: combined.jar:classes2.jar:wi/d$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$c.class
     */
    /* renamed from: wi.d$c */
    /* loaded from: combined.jar:classes2.jar:wi/d$c.class */
    public static final class c {

        /* renamed from: a */
        public final int f43795a;

        /* renamed from: b */
        @NotNull
        public final C9764h f43796b;

        public c(int i10, @NotNull C9764h c9764h) {
            C9367f.m39526e(c9764h, "data");
            this.f43795a = i10;
            this.f43796b = c9764h;
        }

        @NotNull
        /* renamed from: a */
        public final C9764h m40423a() {
            return this.f43796b;
        }

        /* renamed from: b */
        public final int m40424b() {
            return this.f43795a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$d.class
     */
    /* renamed from: wi.d$d */
    /* loaded from: combined.jar:classes2.jar:wi/d$d.class */
    public static abstract class d implements Closeable {

        /* renamed from: b */
        public final boolean f43797b;

        /* renamed from: c */
        @NotNull
        public final InterfaceC9763g f43798c;

        /* renamed from: d */
        @NotNull
        public final InterfaceC9762f f43799d;

        public d(boolean z10, @NotNull InterfaceC9763g interfaceC9763g, @NotNull InterfaceC9762f interfaceC9762f) {
            C9367f.m39526e(interfaceC9763g, "source");
            C9367f.m39526e(interfaceC9762f, "sink");
            this.f43797b = z10;
            this.f43798c = interfaceC9763g;
            this.f43799d = interfaceC9762f;
        }

        /* renamed from: f */
        public final boolean m40425f() {
            return this.f43797b;
        }

        @NotNull
        /* renamed from: l */
        public final InterfaceC9762f m40426l() {
            return this.f43799d;
        }

        @NotNull
        /* renamed from: o */
        public final InterfaceC9763g m40427o() {
            return this.f43798c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$e.class
     */
    /* renamed from: wi.d$e */
    /* loaded from: combined.jar:classes2.jar:wi/d$e.class */
    public final class e extends AbstractC6794a {

        /* renamed from: e */
        public final C9595d f43800e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9595d c9595d) {
            super(c9595d.f43773g + " writer", false, 2, null);
            this.f43800e = c9595d;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            try {
                return this.f43800e.m40418v() ? 0L : -1L;
            } catch (IOException e10) {
                this.f43800e.m40411o(e10, null);
                return -1L;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$f.class
     */
    /* renamed from: wi.d$f */
    /* loaded from: combined.jar:classes2.jar:wi/d$f.class */
    public static final class f implements InterfaceC5409f {

        /* renamed from: a */
        public final C9595d f43801a;

        /* renamed from: b */
        public final C5406d0 f43802b;

        public f(C9595d c9595d, C5406d0 c5406d0) {
            this.f43801a = c9595d;
            this.f43802b = c5406d0;
        }

        @Override // p173ji.InterfaceC5409f
        public void onFailure(@NotNull InterfaceC5407e interfaceC5407e, @NotNull IOException iOException) {
            C9367f.m39526e(interfaceC5407e, "call");
            C9367f.m39526e(iOException, C9728e.f44384d);
            this.f43801a.m40411o(iOException, null);
        }

        @Override // p173ji.InterfaceC5409f
        public void onResponse(@NotNull InterfaceC5407e interfaceC5407e, @NotNull C5410f0 c5410f0) {
            C9367f.m39526e(interfaceC5407e, "call");
            C9367f.m39526e(c5410f0, "response");
            C6979c m26927t = c5410f0.m26927t();
            try {
                this.f43801a.m40408l(c5410f0, m26927t);
                C9367f.m39524c(m26927t);
                d m32020m = m26927t.m32020m();
                C9596e m40429a = C9596e.f43820g.m40429a(c5410f0.m26923o0());
                this.f43801a.f43790x = m40429a;
                if (!this.f43801a.m40414r(m40429a)) {
                    synchronized (this.f43801a) {
                        this.f43801a.f43776j.clear();
                        this.f43801a.mo26992f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    this.f43801a.m40413q(C5634b.f31712i + " WebSocket " + this.f43802b.m26880j().m27119q(), m32020m);
                    this.f43801a.m40412p().onOpen(this.f43801a, c5410f0);
                    this.f43801a.m40415s();
                } catch (Exception e10) {
                    this.f43801a.m40411o(e10, null);
                }
            } catch (IOException e11) {
                if (m26927t != null) {
                    m26927t.m32028u();
                }
                this.f43801a.m40411o(e11, c5410f0);
                C5634b.m27790j(c5410f0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$g.class
     */
    /* renamed from: wi.d$g */
    /* loaded from: combined.jar:classes2.jar:wi/d$g.class */
    public static final class g extends AbstractC6794a {

        /* renamed from: e */
        public final String f43803e;

        /* renamed from: f */
        public final long f43804f;

        /* renamed from: g */
        public final C9595d f43805g;

        /* renamed from: h */
        public final String f43806h;

        /* renamed from: i */
        public final d f43807i;

        /* renamed from: j */
        public final C9596e f43808j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, long j10, C9595d c9595d, String str3, d dVar, C9596e c9596e) {
            super(str2, false, 2, null);
            this.f43803e = str;
            this.f43804f = j10;
            this.f43805g = c9595d;
            this.f43806h = str3;
            this.f43807i = dVar;
            this.f43808j = c9596e;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            this.f43805g.m40419w();
            return this.f43804f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/d$h.class
     */
    /* renamed from: wi.d$h */
    /* loaded from: combined.jar:classes2.jar:wi/d$h.class */
    public static final class h extends AbstractC6794a {

        /* renamed from: e */
        public final String f43809e;

        /* renamed from: f */
        public final boolean f43810f;

        /* renamed from: g */
        public final C9595d f43811g;

        /* renamed from: h */
        public final C9599h f43812h;

        /* renamed from: i */
        public final C9764h f43813i;

        /* renamed from: j */
        public final C9371j f43814j;

        /* renamed from: k */
        public final C9369h f43815k;

        /* renamed from: l */
        public final C9371j f43816l;

        /* renamed from: m */
        public final C9371j f43817m;

        /* renamed from: n */
        public final C9371j f43818n;

        /* renamed from: o */
        public final C9371j f43819o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, C9595d c9595d, C9599h c9599h, C9764h c9764h, C9371j c9371j, C9369h c9369h, C9371j c9371j2, C9371j c9371j3, C9371j c9371j4, C9371j c9371j5) {
            super(str2, z11);
            this.f43809e = str;
            this.f43810f = z10;
            this.f43811g = c9595d;
            this.f43812h = c9599h;
            this.f43813i = c9764h;
            this.f43814j = c9371j;
            this.f43815k = c9369h;
            this.f43816l = c9371j2;
            this.f43817m = c9371j3;
            this.f43818n = c9371j4;
            this.f43819o = c9371j5;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            this.f43811g.cancel();
            return -1L;
        }
    }

    public C9595d(@NotNull C6798e c6798e, @NotNull C5406d0 c5406d0, @NotNull AbstractC5420k0 abstractC5420k0, @NotNull Random random, long j10, @Nullable C9596e c9596e, long j11) {
        C9367f.m39526e(c6798e, "taskRunner");
        C9367f.m39526e(c5406d0, "originalRequest");
        C9367f.m39526e(abstractC5420k0, "listener");
        C9367f.m39526e(random, "random");
        this.f43786t = c5406d0;
        this.f43787u = abstractC5420k0;
        this.f43788v = random;
        this.f43789w = j10;
        this.f43790x = c9596e;
        this.f43791y = j11;
        this.f43772f = c6798e.m31342i();
        this.f43775i = new ArrayDeque<>();
        this.f43776j = new ArrayDeque<>();
        this.f43779m = -1;
        if (!C9367f.m39522a(HttpGet.METHOD_NAME, c5406d0.m26877g())) {
            throw new IllegalArgumentException(("Request must be GET: " + c5406d0.m26877g()).toString());
        }
        C9764h.a aVar = C9764h.f44531f;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        C5398q c5398q = C5398q.f30770a;
        this.f43767a = C9764h.a.m41208g(aVar, bArr, 0, 0, 3, null).mo41190d();
    }

    @Override // p173ji.InterfaceC5418j0
    /* renamed from: a */
    public boolean mo26991a(@NotNull String str) {
        C9367f.m39526e(str, "text");
        return m40417u(C9764h.f44531f.m41212d(str), 1);
    }

    @Override // p391wi.C9598g.a
    /* renamed from: b */
    public void mo40403b(@NotNull String str) {
        C9367f.m39526e(str, "text");
        this.f43787u.onMessage(this, str);
    }

    @Override // p391wi.C9598g.a
    /* renamed from: c */
    public void mo40404c(@NotNull C9764h c9764h) {
        synchronized (this) {
            C9367f.m39526e(c9764h, "payload");
            if (!this.f43781o && (!this.f43778l || !this.f43776j.isEmpty())) {
                this.f43775i.add(c9764h);
                m40416t();
                this.f43783q++;
            }
        }
    }

    @Override // p173ji.InterfaceC5418j0
    public void cancel() {
        InterfaceC5407e interfaceC5407e = this.f43768b;
        C9367f.m39524c(interfaceC5407e);
        interfaceC5407e.cancel();
    }

    @Override // p391wi.C9598g.a
    /* renamed from: d */
    public void mo40405d(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "bytes");
        this.f43787u.onMessage(this, c9764h);
    }

    @Override // p391wi.C9598g.a
    /* renamed from: e */
    public void mo40406e(@NotNull C9764h c9764h) {
        synchronized (this) {
            C9367f.m39526e(c9764h, "payload");
            this.f43784r++;
            this.f43785s = false;
        }
    }

    @Override // p173ji.InterfaceC5418j0
    /* renamed from: f */
    public boolean mo26992f(int i10, @Nullable String str) {
        return m40409m(i10, str, 60000L);
    }

    @Override // p391wi.C9598g.a
    /* renamed from: g */
    public void mo40407g(int i10, @NotNull String str) {
        d dVar;
        C9598g c9598g;
        C9599h c9599h;
        C9367f.m39526e(str, "reason");
        if (!(i10 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (!(this.f43779m == -1)) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f43779m = i10;
            this.f43780n = str;
            dVar = null;
            if (this.f43778l && this.f43776j.isEmpty()) {
                dVar = this.f43774h;
                this.f43774h = null;
                c9598g = this.f43770d;
                this.f43770d = null;
                c9599h = this.f43771e;
                this.f43771e = null;
                this.f43772f.m31333n();
            } else {
                c9598g = null;
                c9599h = null;
            }
            C5398q c5398q = C5398q.f30770a;
        }
        try {
            this.f43787u.onClosing(this, i10, str);
            if (dVar != null) {
                this.f43787u.onClosed(this, i10, str);
            }
        } finally {
            if (dVar != null) {
                C5634b.m27790j(dVar);
            }
            if (c9598g != null) {
                C5634b.m27790j(c9598g);
            }
            if (c9599h != null) {
                C5634b.m27790j(c9599h);
            }
        }
    }

    /* renamed from: l */
    public final void m40408l(@NotNull C5410f0 c5410f0, @Nullable C6979c c6979c) {
        C9367f.m39526e(c5410f0, "response");
        if (c5410f0.m26925q() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + c5410f0.m26925q() + ' ' + c5410f0.m26929v0() + '\'');
        }
        String m26912B = C5410f0.m26912B(c5410f0, "Connection", null, 2, null);
        if (!C1128n.m6719l(HttpHeaders.UPGRADE, m26912B, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + m26912B + '\'');
        }
        String m26912B2 = C5410f0.m26912B(c5410f0, HttpHeaders.UPGRADE, null, 2, null);
        if (!C1128n.m6719l("websocket", m26912B2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + m26912B2 + '\'');
        }
        String m26912B3 = C5410f0.m26912B(c5410f0, "Sec-WebSocket-Accept", null, 2, null);
        String mo41190d = C9764h.f44531f.m41212d(this.f43767a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").m41206y().mo41190d();
        if (!(!C9367f.m39522a(mo41190d, m26912B3))) {
            if (c6979c == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + mo41190d + "' but was '" + m26912B3 + '\'');
    }

    /* renamed from: m */
    public final boolean m40409m(int i10, @Nullable String str, long j10) {
        synchronized (this) {
            C9597f.f43827a.m40432c(i10);
            C9764h c9764h = null;
            if (str != null) {
                c9764h = C9764h.f44531f.m41212d(str);
                if (!(((long) c9764h.size()) <= 123)) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            }
            if (!this.f43781o && !this.f43778l) {
                this.f43778l = true;
                this.f43776j.add(new a(i10, c9764h, j10));
                m40416t();
                return true;
            }
            return false;
        }
    }

    /* renamed from: n */
    public final void m40410n(@NotNull C5402b0 c5402b0) {
        C9367f.m39526e(c5402b0, "client");
        if (this.f43786t.m26874d("Sec-WebSocket-Extensions") != null) {
            m40411o(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        C5402b0 m26827b = c5402b0.m26782E().m26829d(AbstractC5429t.f31127a).m26822J(f43766z).m26827b();
        C5406d0 m26883b = this.f43786t.m26878h().m26886f(HttpHeaders.UPGRADE, "websocket").m26886f("Connection", HttpHeaders.UPGRADE).m26886f("Sec-WebSocket-Key", this.f43767a).m26886f("Sec-WebSocket-Version", "13").m26886f("Sec-WebSocket-Extensions", "permessage-deflate").m26883b();
        C6981e c6981e = new C6981e(m26827b, m26883b, true);
        this.f43768b = c6981e;
        C9367f.m39524c(c6981e);
        c6981e.mo26894w(new f(this, m26883b));
    }

    /* renamed from: o */
    public final void m40411o(@NotNull Exception exc, @Nullable C5410f0 c5410f0) {
        C9367f.m39526e(exc, C9728e.f44384d);
        synchronized (this) {
            if (this.f43781o) {
                return;
            }
            this.f43781o = true;
            d dVar = this.f43774h;
            this.f43774h = null;
            C9598g c9598g = this.f43770d;
            this.f43770d = null;
            C9599h c9599h = this.f43771e;
            this.f43771e = null;
            this.f43772f.m31333n();
            C5398q c5398q = C5398q.f30770a;
            try {
                this.f43787u.onFailure(this, exc, c5410f0);
                if (dVar != null) {
                    C5634b.m27790j(dVar);
                }
                if (c9598g != null) {
                    C5634b.m27790j(c9598g);
                }
                if (c9599h != null) {
                    C5634b.m27790j(c9599h);
                }
            } catch (Throwable th2) {
                if (dVar != null) {
                    C5634b.m27790j(dVar);
                }
                if (c9598g != null) {
                    C5634b.m27790j(c9598g);
                }
                if (c9599h != null) {
                    C5634b.m27790j(c9599h);
                }
                throw th2;
            }
        }
    }

    @NotNull
    /* renamed from: p */
    public final AbstractC5420k0 m40412p() {
        return this.f43787u;
    }

    /* renamed from: q */
    public final void m40413q(@NotNull String str, @NotNull d dVar) {
        C9367f.m39526e(str, "name");
        C9367f.m39526e(dVar, IjkMediaMeta.IJKM_KEY_STREAMS);
        C9596e c9596e = this.f43790x;
        C9367f.m39524c(c9596e);
        synchronized (this) {
            this.f43773g = str;
            this.f43774h = dVar;
            this.f43771e = new C9599h(dVar.m40425f(), dVar.m40426l(), this.f43788v, c9596e.f43821a, c9596e.m40428a(dVar.m40425f()), this.f43791y);
            this.f43769c = new e(this);
            long j10 = this.f43789w;
            if (j10 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                String str2 = str + " ping";
                this.f43772f.m31329i(new g(str2, str2, nanos, this, str, dVar, c9596e), nanos);
            }
            if (!this.f43776j.isEmpty()) {
                m40416t();
            }
            C5398q c5398q = C5398q.f30770a;
        }
        this.f43770d = new C9598g(dVar.m40425f(), dVar.m40427o(), this, c9596e.f43821a, c9596e.m40428a(!dVar.m40425f()));
    }

    /* renamed from: r */
    public final boolean m40414r(C9596e c9596e) {
        if (c9596e.f43826f || c9596e.f43822b != null) {
            return false;
        }
        Integer num = c9596e.f43824d;
        if (num == null) {
            return true;
        }
        int intValue = num.intValue();
        return 8 <= intValue && 15 >= intValue;
    }

    /* renamed from: s */
    public final void m40415s() {
        while (this.f43779m == -1) {
            C9598g c9598g = this.f43770d;
            C9367f.m39524c(c9598g);
            c9598g.m40433f();
        }
    }

    /* renamed from: t */
    public final void m40416t() {
        if (!C5634b.f31711h || Thread.holdsLock(this)) {
            AbstractC6794a abstractC6794a = this.f43769c;
            if (abstractC6794a != null) {
                C6797d.m31320j(this.f43772f, abstractC6794a, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9367f.m39525d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: u */
    public final boolean m40417u(C9764h c9764h, int i10) {
        synchronized (this) {
            if (!this.f43781o && !this.f43778l) {
                if (this.f43777k + c9764h.size() > 16777216) {
                    mo26992f(AdError.NO_FILL_ERROR_CODE, null);
                    return false;
                }
                this.f43777k += c9764h.size();
                this.f43776j.add(new c(i10, c9764h));
                m40416t();
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e0  */
    /* JADX WARN: Type inference failed for: r0v107, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v36, types: [T, wi.d$d] */
    /* JADX WARN: Type inference failed for: r1v39, types: [T, wi.g] */
    /* JADX WARN: Type inference failed for: r1v42, types: [T, wi.h] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m40418v() {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p391wi.C9595d.m40418v():boolean");
    }

    /* renamed from: w */
    public final void m40419w() {
        synchronized (this) {
            if (this.f43781o) {
                return;
            }
            C9599h c9599h = this.f43771e;
            if (c9599h != null) {
                int i10 = this.f43785s ? this.f43782p : -1;
                this.f43782p++;
                this.f43785s = true;
                C5398q c5398q = C5398q.f30770a;
                if (i10 == -1) {
                    try {
                        c9599h.m40442p(C9764h.f44530e);
                        return;
                    } catch (IOException e10) {
                        m40411o(e10, null);
                        return;
                    }
                }
                m40411o(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f43789w + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
            }
        }
    }
}
