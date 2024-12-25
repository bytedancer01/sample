package p293qi;

import ci.C1128n;
import ci.C1129o;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import ki.C5634b;
import org.apache.commons.net.SocketClient;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5432w;
import p173ji.C5433x;
import p173ji.InterfaceC5425p;
import p253oi.C6982f;
import p274pi.C7728e;
import p274pi.C7732i;
import p274pi.C7734k;
import p274pi.InterfaceC7727d;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.C9768l;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qi/b.class
 */
/* renamed from: qi.b */
/* loaded from: combined.jar:classes2.jar:qi/b.class */
public final class C7927b implements InterfaceC7727d {

    /* renamed from: h */
    public static final d f38114h = new d(null);

    /* renamed from: a */
    public int f38115a;

    /* renamed from: b */
    public final C7926a f38116b;

    /* renamed from: c */
    public C5432w f38117c;

    /* renamed from: d */
    public final C5402b0 f38118d;

    /* renamed from: e */
    @NotNull
    public final C6982f f38119e;

    /* renamed from: f */
    public final InterfaceC9763g f38120f;

    /* renamed from: g */
    public final InterfaceC9762f f38121g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/b$a.class
     */
    /* renamed from: qi.b$a */
    /* loaded from: combined.jar:classes2.jar:qi/b$a.class */
    public abstract class a implements InterfaceC9756b0 {

        /* renamed from: b */
        @NotNull
        public final C9768l f38122b;

        /* renamed from: c */
        public boolean f38123c;

        /* renamed from: d */
        public final C7927b f38124d;

        public a(C7927b c7927b) {
            this.f38124d = c7927b;
            this.f38122b = new C9768l(c7927b.f38120f.timeout());
        }

        /* renamed from: f */
        public final boolean m34351f() {
            return this.f38123c;
        }

        /* renamed from: l */
        public final void m34352l() {
            if (this.f38124d.f38115a == 6) {
                return;
            }
            if (this.f38124d.f38115a == 5) {
                this.f38124d.m34342r(this.f38122b);
                this.f38124d.f38115a = 6;
            } else {
                throw new IllegalStateException("state: " + this.f38124d.f38115a);
            }
        }

        /* renamed from: o */
        public final void m34353o(boolean z10) {
            this.f38123c = z10;
        }

        @Override // p411xi.InterfaceC9756b0
        @NotNull
        public C9758c0 timeout() {
            return this.f38122b;
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "sink");
            try {
                return this.f38124d.f38120f.mo22901x(c9761e, j10);
            } catch (IOException e10) {
                this.f38124d.mo33730c().m32107z();
                m34352l();
                throw e10;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/b$b.class
     */
    /* renamed from: qi.b$b */
    /* loaded from: combined.jar:classes2.jar:qi/b$b.class */
    public final class b implements InterfaceC9782z {

        /* renamed from: b */
        public final C9768l f38125b;

        /* renamed from: c */
        public boolean f38126c;

        /* renamed from: d */
        public final C7927b f38127d;

        public b(C7927b c7927b) {
            this.f38127d = c7927b;
            this.f38125b = new C9768l(c7927b.f38121g.timeout());
        }

        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                if (this.f38126c) {
                    return;
                }
                this.f38126c = true;
                this.f38127d.f38121g.mo41136Q("0\r\n\r\n");
                this.f38127d.m34342r(this.f38125b);
                this.f38127d.f38115a = 3;
            }
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            synchronized (this) {
                if (this.f38126c) {
                    return;
                }
                this.f38127d.f38121g.flush();
            }
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "source");
            if (!(!this.f38126c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            this.f38127d.f38121g.mo41174s0(j10);
            this.f38127d.f38121g.mo41136Q(SocketClient.NETASCII_EOL);
            this.f38127d.f38121g.mo32031h(c9761e, j10);
            this.f38127d.f38121g.mo41136Q(SocketClient.NETASCII_EOL);
        }

        @Override // p411xi.InterfaceC9782z
        @NotNull
        public C9758c0 timeout() {
            return this.f38125b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/b$c.class
     */
    /* renamed from: qi.b$c */
    /* loaded from: combined.jar:classes2.jar:qi/b$c.class */
    public final class c extends a {

        /* renamed from: e */
        public long f38128e;

        /* renamed from: f */
        public boolean f38129f;

        /* renamed from: g */
        public final C5433x f38130g;

        /* renamed from: h */
        public final C7927b f38131h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C7927b c7927b, C5433x c5433x) {
            super(c7927b);
            C9367f.m39526e(c5433x, "url");
            this.f38131h = c7927b;
            this.f38130g = c5433x;
            this.f38128e = -1L;
            this.f38129f = true;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m34351f()) {
                return;
            }
            if (this.f38129f && !C5634b.m27796p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f38131h.mo33730c().m32107z();
                m34352l();
            }
            m34353o(true);
        }

        /* renamed from: p */
        public final void m34354p() {
            if (this.f38128e != -1) {
                this.f38131h.f38120f.mo41143V();
            }
            try {
                this.f38128e = this.f38131h.f38120f.mo41178z0();
                String mo41143V = this.f38131h.f38120f.mo41143V();
                if (mo41143V == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj = C1129o.m6780v0(mo41143V).toString();
                if (this.f38128e >= 0) {
                    if (!(obj.length() > 0) || C1128n.m6732y(obj, ";", false, 2, null)) {
                        if (this.f38128e == 0) {
                            this.f38129f = false;
                            C7927b c7927b = this.f38131h;
                            c7927b.f38117c = c7927b.f38116b.m34330a();
                            C5402b0 c5402b0 = this.f38131h.f38118d;
                            C9367f.m39524c(c5402b0);
                            InterfaceC5425p m26805n = c5402b0.m26805n();
                            C5433x c5433x = this.f38130g;
                            C5432w c5432w = this.f38131h.f38117c;
                            C9367f.m39524c(c5432w);
                            C7728e.m33741f(m26805n, c5433x, c5432w);
                            m34352l();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f38128e + obj + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // p293qi.C7927b.a, p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (!(true ^ m34351f())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f38129f) {
                return -1L;
            }
            long j11 = this.f38128e;
            if (j11 == 0 || j11 == -1) {
                m34354p();
                if (!this.f38129f) {
                    return -1L;
                }
            }
            long mo22901x = super.mo22901x(c9761e, Math.min(j10, this.f38128e));
            if (mo22901x != -1) {
                this.f38128e -= mo22901x;
                return mo22901x;
            }
            this.f38131h.mo33730c().m32107z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m34352l();
            throw protocolException;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/b$d.class
     */
    /* renamed from: qi.b$d */
    /* loaded from: combined.jar:classes2.jar:qi/b$d.class */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/b$e.class
     */
    /* renamed from: qi.b$e */
    /* loaded from: combined.jar:classes2.jar:qi/b$e.class */
    public final class e extends a {

        /* renamed from: e */
        public long f38132e;

        /* renamed from: f */
        public final C7927b f38133f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7927b c7927b, long j10) {
            super(c7927b);
            this.f38133f = c7927b;
            this.f38132e = j10;
            if (j10 == 0) {
                m34352l();
            }
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m34351f()) {
                return;
            }
            if (this.f38132e != 0 && !C5634b.m27796p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f38133f.mo33730c().m32107z();
                m34352l();
            }
            m34353o(true);
        }

        @Override // p293qi.C7927b.a, p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (!(true ^ m34351f())) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f38132e;
            if (j11 == 0) {
                return -1L;
            }
            long mo22901x = super.mo22901x(c9761e, Math.min(j11, j10));
            if (mo22901x == -1) {
                this.f38133f.mo33730c().m32107z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m34352l();
                throw protocolException;
            }
            long j12 = this.f38132e - mo22901x;
            this.f38132e = j12;
            if (j12 == 0) {
                m34352l();
            }
            return mo22901x;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/b$f.class
     */
    /* renamed from: qi.b$f */
    /* loaded from: combined.jar:classes2.jar:qi/b$f.class */
    public final class f implements InterfaceC9782z {

        /* renamed from: b */
        public final C9768l f38134b;

        /* renamed from: c */
        public boolean f38135c;

        /* renamed from: d */
        public final C7927b f38136d;

        public f(C7927b c7927b) {
            this.f38136d = c7927b;
            this.f38134b = new C9768l(c7927b.f38121g.timeout());
        }

        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f38135c) {
                return;
            }
            this.f38135c = true;
            this.f38136d.m34342r(this.f38134b);
            this.f38136d.f38115a = 3;
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            if (this.f38135c) {
                return;
            }
            this.f38136d.f38121g.flush();
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "source");
            if (!(!this.f38135c)) {
                throw new IllegalStateException("closed".toString());
            }
            C5634b.m27789i(c9761e.size(), 0L, j10);
            this.f38136d.f38121g.mo32031h(c9761e, j10);
        }

        @Override // p411xi.InterfaceC9782z
        @NotNull
        public C9758c0 timeout() {
            return this.f38134b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/b$g.class
     */
    /* renamed from: qi.b$g */
    /* loaded from: combined.jar:classes2.jar:qi/b$g.class */
    public final class g extends a {

        /* renamed from: e */
        public boolean f38137e;

        /* renamed from: f */
        public final C7927b f38138f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C7927b c7927b) {
            super(c7927b);
            this.f38138f = c7927b;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m34351f()) {
                return;
            }
            if (!this.f38137e) {
                m34352l();
            }
            m34353o(true);
        }

        @Override // p293qi.C7927b.a, p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (!(!m34351f())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f38137e) {
                return -1L;
            }
            long mo22901x = super.mo22901x(c9761e, j10);
            if (mo22901x != -1) {
                return mo22901x;
            }
            this.f38137e = true;
            m34352l();
            return -1L;
        }
    }

    public C7927b(@Nullable C5402b0 c5402b0, @NotNull C6982f c6982f, @NotNull InterfaceC9763g interfaceC9763g, @NotNull InterfaceC9762f interfaceC9762f) {
        C9367f.m39526e(c6982f, "connection");
        C9367f.m39526e(interfaceC9763g, "source");
        C9367f.m39526e(interfaceC9762f, "sink");
        this.f38118d = c5402b0;
        this.f38119e = c6982f;
        this.f38120f = interfaceC9763g;
        this.f38121g = interfaceC9762f;
        this.f38116b = new C7926a(interfaceC9763g);
    }

    /* renamed from: A */
    public final void m34341A(@NotNull C5432w c5432w, @NotNull String str) {
        C9367f.m39526e(c5432w, "headers");
        C9367f.m39526e(str, "requestLine");
        if (!(this.f38115a == 0)) {
            throw new IllegalStateException(("state: " + this.f38115a).toString());
        }
        this.f38121g.mo41136Q(str).mo41136Q(SocketClient.NETASCII_EOL);
        int size = c5432w.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f38121g.mo41136Q(c5432w.m27082b(i10)).mo41136Q(": ").mo41136Q(c5432w.m27085h(i10)).mo41136Q(SocketClient.NETASCII_EOL);
        }
        this.f38121g.mo41136Q(SocketClient.NETASCII_EOL);
        this.f38115a = 1;
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: a */
    public void mo33728a() {
        this.f38121g.flush();
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: b */
    public void mo33729b() {
        this.f38121g.flush();
    }

    @Override // p274pi.InterfaceC7727d
    @NotNull
    /* renamed from: c */
    public C6982f mo33730c() {
        return this.f38119e;
    }

    @Override // p274pi.InterfaceC7727d
    public void cancel() {
        mo33730c().m32085d();
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: d */
    public long mo33731d(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "response");
        return !C7728e.m33737b(c5410f0) ? 0L : m34344t(c5410f0) ? -1L : C5634b.m27799s(c5410f0);
    }

    @Override // p274pi.InterfaceC7727d
    @NotNull
    /* renamed from: e */
    public InterfaceC9782z mo33732e(@NotNull C5406d0 c5406d0, long j10) {
        InterfaceC9782z m34348x;
        C9367f.m39526e(c5406d0, "request");
        if (c5406d0.m26871a() != null && c5406d0.m26871a().m26899g()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (m34343s(c5406d0)) {
            m34348x = m34345u();
        } else {
            if (j10 == -1) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            m34348x = m34348x();
        }
        return m34348x;
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: f */
    public void mo33733f(@NotNull C5406d0 c5406d0) {
        C9367f.m39526e(c5406d0, "request");
        C7732i c7732i = C7732i.f37510a;
        Proxy.Type type = mo33730c().m32075A().m26978b().type();
        C9367f.m39525d(type, "connection.route().proxy.type()");
        m34341A(c5406d0.m26875e(), c7732i.m33757a(c5406d0, type));
    }

    @Override // p274pi.InterfaceC7727d
    @NotNull
    /* renamed from: g */
    public InterfaceC9756b0 mo33734g(@NotNull C5410f0 c5410f0) {
        long m27799s;
        InterfaceC9756b0 m34349y;
        C9367f.m39526e(c5410f0, "response");
        if (C7728e.m33737b(c5410f0)) {
            if (m34344t(c5410f0)) {
                m34349y = m34346v(c5410f0.m26918F0().m26880j());
            } else {
                m27799s = C5634b.m27799s(c5410f0);
                if (m27799s == -1) {
                    m34349y = m34349y();
                }
            }
            return m34349y;
        }
        m27799s = 0;
        m34349y = m34347w(m27799s);
        return m34349y;
    }

    @Override // p274pi.InterfaceC7727d
    @Nullable
    /* renamed from: h */
    public C5410f0.a mo33735h(boolean z10) {
        int i10 = this.f38115a;
        boolean z11 = true;
        if (i10 != 1) {
            z11 = i10 == 3;
        }
        if (!z11) {
            throw new IllegalStateException(("state: " + this.f38115a).toString());
        }
        try {
            C7734k m33766a = C7734k.f37513d.m33766a(this.f38116b.m34331b());
            C5410f0.a m26942k = new C5410f0.a().m26947p(m33766a.f37514a).m26938g(m33766a.f37515b).m26944m(m33766a.f37516c).m26942k(this.f38116b.m34330a());
            if (z10 && m33766a.f37515b == 100) {
                m26942k = null;
            } else if (m33766a.f37515b == 100) {
                this.f38115a = 3;
            } else {
                this.f38115a = 4;
            }
            return m26942k;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + mo33730c().m32075A().m26977a().m26760l().m27119q(), e10);
        }
    }

    /* renamed from: r */
    public final void m34342r(C9768l c9768l) {
        C9758c0 m41218i = c9768l.m41218i();
        c9768l.m41219j(C9758c0.f44503d);
        m41218i.mo41086a();
        m41218i.mo41087b();
    }

    /* renamed from: s */
    public final boolean m34343s(C5406d0 c5406d0) {
        return C1128n.m6719l(HTTP.CHUNK_CODING, c5406d0.m26874d("Transfer-Encoding"), true);
    }

    /* renamed from: t */
    public final boolean m34344t(C5410f0 c5410f0) {
        return C1128n.m6719l(HTTP.CHUNK_CODING, C5410f0.m26912B(c5410f0, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: u */
    public final InterfaceC9782z m34345u() {
        boolean z10 = true;
        if (this.f38115a != 1) {
            z10 = false;
        }
        if (z10) {
            this.f38115a = 2;
            return new b(this);
        }
        throw new IllegalStateException(("state: " + this.f38115a).toString());
    }

    /* renamed from: v */
    public final InterfaceC9756b0 m34346v(C5433x c5433x) {
        if (this.f38115a == 4) {
            this.f38115a = 5;
            return new c(this, c5433x);
        }
        throw new IllegalStateException(("state: " + this.f38115a).toString());
    }

    /* renamed from: w */
    public final InterfaceC9756b0 m34347w(long j10) {
        if (this.f38115a == 4) {
            this.f38115a = 5;
            return new e(this, j10);
        }
        throw new IllegalStateException(("state: " + this.f38115a).toString());
    }

    /* renamed from: x */
    public final InterfaceC9782z m34348x() {
        boolean z10 = true;
        if (this.f38115a != 1) {
            z10 = false;
        }
        if (z10) {
            this.f38115a = 2;
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f38115a).toString());
    }

    /* renamed from: y */
    public final InterfaceC9756b0 m34349y() {
        if (this.f38115a == 4) {
            this.f38115a = 5;
            mo33730c().m32107z();
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.f38115a).toString());
    }

    /* renamed from: z */
    public final void m34350z(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "response");
        long m27799s = C5634b.m27799s(c5410f0);
        if (m27799s == -1) {
            return;
        }
        InterfaceC9756b0 m34347w = m34347w(m27799s);
        C5634b.m27765I(m34347w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        m34347w.close();
    }
}
