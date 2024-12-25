package dj;

import java.io.IOException;
import java.util.Objects;
import p173ji.AbstractC5412g0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5435z;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5409f;
import p411xi.AbstractC9767k;
import p411xi.C9761e;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9763g;

/* renamed from: dj.n */
/* loaded from: combined.jar:classes3.jar:dj/n.class */
public final class C4547n<T> implements InterfaceC4535b<T> {

    /* renamed from: b */
    public final C4553t f27011b;

    /* renamed from: c */
    public final Object[] f27012c;

    /* renamed from: d */
    public final InterfaceC5407e.a f27013d;

    /* renamed from: e */
    public final InterfaceC4539f<AbstractC5412g0, T> f27014e;

    /* renamed from: f */
    public volatile boolean f27015f;

    /* renamed from: g */
    public InterfaceC5407e f27016g;

    /* renamed from: h */
    public Throwable f27017h;

    /* renamed from: i */
    public boolean f27018i;

    /* renamed from: dj.n$a */
    /* loaded from: combined.jar:classes3.jar:dj/n$a.class */
    public class a implements InterfaceC5409f {

        /* renamed from: a */
        public final InterfaceC4537d f27019a;

        /* renamed from: b */
        public final C4547n f27020b;

        public a(C4547n c4547n, InterfaceC4537d interfaceC4537d) {
            this.f27020b = c4547n;
            this.f27019a = interfaceC4537d;
        }

        /* renamed from: a */
        public final void m22896a(Throwable th2) {
            try {
                this.f27019a.mo14533b(this.f27020b, th2);
            } catch (Throwable th3) {
                C4559z.m22993s(th3);
                th3.printStackTrace();
            }
        }

        @Override // p173ji.InterfaceC5409f
        public void onFailure(InterfaceC5407e interfaceC5407e, IOException iOException) {
            m22896a(iOException);
        }

        @Override // p173ji.InterfaceC5409f
        public void onResponse(InterfaceC5407e interfaceC5407e, C5410f0 c5410f0) {
            try {
                try {
                    this.f27019a.mo14532a(this.f27020b, this.f27020b.m22895d(c5410f0));
                } catch (Throwable th2) {
                    C4559z.m22993s(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                C4559z.m22993s(th3);
                m22896a(th3);
            }
        }
    }

    /* renamed from: dj.n$b */
    /* loaded from: combined.jar:classes3.jar:dj/n$b.class */
    public static final class b extends AbstractC5412g0 {

        /* renamed from: d */
        public final AbstractC5412g0 f27021d;

        /* renamed from: e */
        public final InterfaceC9763g f27022e;

        /* renamed from: f */
        public IOException f27023f;

        /* renamed from: dj.n$b$a */
        /* loaded from: combined.jar:classes3.jar:dj/n$b$a.class */
        public class a extends AbstractC9767k {

            /* renamed from: c */
            public final b f27024c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, InterfaceC9756b0 interfaceC9756b0) {
                super(interfaceC9756b0);
                this.f27024c = bVar;
            }

            @Override // p411xi.AbstractC9767k, p411xi.InterfaceC9756b0
            /* renamed from: x */
            public long mo22901x(C9761e c9761e, long j10) {
                try {
                    return super.mo22901x(c9761e, j10);
                } catch (IOException e10) {
                    this.f27024c.f27023f = e10;
                    throw e10;
                }
            }
        }

        public b(AbstractC5412g0 abstractC5412g0) {
            this.f27021d = abstractC5412g0;
            this.f27022e = C9772p.m41229c(new a(this, abstractC5412g0.mo22899v()));
        }

        @Override // p173ji.AbstractC5412g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f27021d.close();
        }

        @Override // p173ji.AbstractC5412g0
        /* renamed from: o */
        public long mo22897o() {
            return this.f27021d.mo22897o();
        }

        @Override // p173ji.AbstractC5412g0
        /* renamed from: p */
        public C5435z mo22898p() {
            return this.f27021d.mo22898p();
        }

        @Override // p173ji.AbstractC5412g0
        /* renamed from: v */
        public InterfaceC9763g mo22899v() {
            return this.f27022e;
        }

        /* renamed from: y */
        public void m22900y() {
            IOException iOException = this.f27023f;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: dj.n$c */
    /* loaded from: combined.jar:classes3.jar:dj/n$c.class */
    public static final class c extends AbstractC5412g0 {

        /* renamed from: d */
        public final C5435z f27025d;

        /* renamed from: e */
        public final long f27026e;

        public c(C5435z c5435z, long j10) {
            this.f27025d = c5435z;
            this.f27026e = j10;
        }

        @Override // p173ji.AbstractC5412g0
        /* renamed from: o */
        public long mo22897o() {
            return this.f27026e;
        }

        @Override // p173ji.AbstractC5412g0
        /* renamed from: p */
        public C5435z mo22898p() {
            return this.f27025d;
        }

        @Override // p173ji.AbstractC5412g0
        /* renamed from: v */
        public InterfaceC9763g mo22899v() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C4547n(C4553t c4553t, Object[] objArr, InterfaceC5407e.a aVar, InterfaceC4539f<AbstractC5412g0, T> interfaceC4539f) {
        this.f27011b = c4553t;
        this.f27012c = objArr;
        this.f27013d = aVar;
        this.f27014e = interfaceC4539f;
    }

    @Override // dj.InterfaceC4535b
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C4547n<T> m44403clone() {
        return new C4547n<>(this.f27011b, this.f27012c, this.f27013d, this.f27014e);
    }

    /* renamed from: b */
    public final InterfaceC5407e m22893b() {
        InterfaceC5407e mo26796a = this.f27013d.mo26796a(this.f27011b.m22939a(this.f27012c));
        if (mo26796a != null) {
            return mo26796a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: c */
    public final InterfaceC5407e m22894c() {
        InterfaceC5407e interfaceC5407e = this.f27016g;
        if (interfaceC5407e != null) {
            return interfaceC5407e;
        }
        Throwable th2 = this.f27017h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            InterfaceC5407e m22893b = m22893b();
            this.f27016g = m22893b;
            return m22893b;
        } catch (IOException | Error | RuntimeException e10) {
            C4559z.m22993s(e10);
            this.f27017h = e10;
            throw e10;
        }
    }

    @Override // dj.InterfaceC4535b
    public void cancel() {
        InterfaceC5407e interfaceC5407e;
        this.f27015f = true;
        synchronized (this) {
            interfaceC5407e = this.f27016g;
        }
        if (interfaceC5407e != null) {
            interfaceC5407e.cancel();
        }
    }

    /* renamed from: d */
    public C4554u<T> m22895d(C5410f0 c5410f0) {
        AbstractC5412g0 m26920f = c5410f0.m26920f();
        C5410f0 m26934c = c5410f0.m26914B0().m26933b(new c(m26920f.mo22898p(), m26920f.mo22897o())).m26934c();
        int m26925q = m26934c.m26925q();
        if (m26925q < 200 || m26925q >= 300) {
            try {
                return C4554u.m22950c(C4559z.m22975a(m26920f), m26934c);
            } finally {
                m26920f.close();
            }
        }
        if (m26925q == 204 || m26925q == 205) {
            m26920f.close();
            return C4554u.m22951g(null, m26934c);
        }
        b bVar = new b(m26920f);
        try {
            return C4554u.m22951g(this.f27014e.mo22855a(bVar), m26934c);
        } catch (RuntimeException e10) {
            bVar.m22900y();
            throw e10;
        }
    }

    @Override // dj.InterfaceC4535b
    /* renamed from: f */
    public void mo22862f(InterfaceC4537d<T> interfaceC4537d) {
        InterfaceC5407e interfaceC5407e;
        Throwable th2;
        Objects.requireNonNull(interfaceC4537d, "callback == null");
        synchronized (this) {
            if (this.f27018i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f27018i = true;
            InterfaceC5407e interfaceC5407e2 = this.f27016g;
            Throwable th3 = this.f27017h;
            interfaceC5407e = interfaceC5407e2;
            th2 = th3;
            if (interfaceC5407e2 == null) {
                interfaceC5407e = interfaceC5407e2;
                th2 = th3;
                if (th3 == null) {
                    try {
                        interfaceC5407e = m22893b();
                        this.f27016g = interfaceC5407e;
                        th2 = th3;
                    } catch (Throwable th4) {
                        th2 = th4;
                        C4559z.m22993s(th2);
                        this.f27017h = th2;
                        interfaceC5407e = interfaceC5407e2;
                    }
                }
            }
        }
        if (th2 != null) {
            interfaceC4537d.mo14533b(this, th2);
            return;
        }
        if (this.f27015f) {
            interfaceC5407e.cancel();
        }
        interfaceC5407e.mo26894w(new a(this, interfaceC4537d));
    }

    @Override // dj.InterfaceC4535b
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f27015f) {
            return true;
        }
        synchronized (this) {
            InterfaceC5407e interfaceC5407e = this.f27016g;
            if (interfaceC5407e == null || !interfaceC5407e.isCanceled()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // dj.InterfaceC4535b
    public C5406d0 request() {
        C5406d0 request;
        synchronized (this) {
            try {
                request = m22894c().request();
            } catch (IOException e10) {
                throw new RuntimeException("Unable to create request.", e10);
            }
        }
        return request;
    }
}
