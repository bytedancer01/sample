package p312ri;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p173ji.C5432w;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9758c0;
import p411xi.C9759d;
import p411xi.C9761e;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/i.class
 */
/* renamed from: ri.i */
/* loaded from: combined.jar:classes2.jar:ri/i.class */
public final class C8483i {

    /* renamed from: o */
    public static final a f39744o = new a(null);

    /* renamed from: a */
    public long f39745a;

    /* renamed from: b */
    public long f39746b;

    /* renamed from: c */
    public long f39747c;

    /* renamed from: d */
    public long f39748d;

    /* renamed from: e */
    public final ArrayDeque<C5432w> f39749e;

    /* renamed from: f */
    public boolean f39750f;

    /* renamed from: g */
    @NotNull
    public final c f39751g;

    /* renamed from: h */
    @NotNull
    public final b f39752h;

    /* renamed from: i */
    @NotNull
    public final d f39753i;

    /* renamed from: j */
    @NotNull
    public final d f39754j;

    /* renamed from: k */
    @Nullable
    public EnumC8476b f39755k;

    /* renamed from: l */
    @Nullable
    public IOException f39756l;

    /* renamed from: m */
    public final int f39757m;

    /* renamed from: n */
    @NotNull
    public final C8480f f39758n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/i$a.class
     */
    /* renamed from: ri.i$a */
    /* loaded from: combined.jar:classes2.jar:ri/i$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/i$b.class
     */
    /* renamed from: ri.i$b */
    /* loaded from: combined.jar:classes2.jar:ri/i$b.class */
    public final class b implements InterfaceC9782z {

        /* renamed from: b */
        public final C9761e f39759b = new C9761e();

        /* renamed from: c */
        @Nullable
        public C5432w f39760c;

        /* renamed from: d */
        public boolean f39761d;

        /* renamed from: e */
        public boolean f39762e;

        /* renamed from: f */
        public final C8483i f39763f;

        public b(C8483i c8483i, boolean z10) {
            this.f39763f = c8483i;
            this.f39762e = z10;
        }

        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C8483i c8483i = this.f39763f;
            if (C5634b.f31711h && Thread.holdsLock(c8483i)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9367f.m39525d(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(c8483i);
                throw new AssertionError(sb2.toString());
            }
            synchronized (this.f39763f) {
                if (this.f39761d) {
                    return;
                }
                boolean z10 = this.f39763f.m36551h() == null;
                C5398q c5398q = C5398q.f30770a;
                if (!this.f39763f.m36558o().f39762e) {
                    boolean z11 = this.f39759b.size() > 0;
                    if (this.f39760c != null) {
                        while (this.f39759b.size() > 0) {
                            m36570f(false);
                        }
                        C8480f m36550g = this.f39763f.m36550g();
                        int m36553j = this.f39763f.m36553j();
                        C5432w c5432w = this.f39760c;
                        C9367f.m39524c(c5432w);
                        m36550g.m36481j1(m36553j, z10, C5634b.m27767K(c5432w));
                    } else if (z11) {
                        while (this.f39759b.size() > 0) {
                            m36570f(true);
                        }
                    } else if (z10) {
                        this.f39763f.m36550g().m36480i1(this.f39763f.m36553j(), true, null, 0L);
                    }
                }
                synchronized (this.f39763f) {
                    this.f39761d = true;
                    C5398q c5398q2 = C5398q.f30770a;
                }
                this.f39763f.m36550g().flush();
                this.f39763f.m36545b();
            }
        }

        /* renamed from: f */
        public final void m36570f(boolean z10) {
            long min;
            boolean z11;
            synchronized (this.f39763f) {
                this.f39763f.m36562s().m41103r();
                while (this.f39763f.m36561r() >= this.f39763f.m36560q() && !this.f39762e && !this.f39761d && this.f39763f.m36551h() == null) {
                    try {
                        this.f39763f.m36542D();
                    } finally {
                    }
                }
                this.f39763f.m36562s().m36580y();
                this.f39763f.m36546c();
                min = Math.min(this.f39763f.m36560q() - this.f39763f.m36561r(), this.f39759b.size());
                C8483i c8483i = this.f39763f;
                c8483i.m36540B(c8483i.m36561r() + min);
                z11 = z10 && min == this.f39759b.size();
                C5398q c5398q = C5398q.f30770a;
            }
            this.f39763f.m36562s().m41103r();
            try {
                this.f39763f.m36550g().m36480i1(this.f39763f.m36553j(), z11, this.f39759b, min);
            } finally {
            }
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            C8483i c8483i = this.f39763f;
            if (C5634b.f31711h && Thread.holdsLock(c8483i)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9367f.m39525d(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(c8483i);
                throw new AssertionError(sb2.toString());
            }
            synchronized (this.f39763f) {
                this.f39763f.m36546c();
                C5398q c5398q = C5398q.f30770a;
            }
            while (this.f39759b.size() > 0) {
                m36570f(false);
                this.f39763f.m36550g().flush();
            }
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "source");
            C8483i c8483i = this.f39763f;
            if (!C5634b.f31711h || !Thread.holdsLock(c8483i)) {
                this.f39759b.mo32031h(c9761e, j10);
                while (this.f39759b.size() >= 16384) {
                    m36570f(false);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(c8483i);
            throw new AssertionError(sb2.toString());
        }

        /* renamed from: l */
        public final boolean m36571l() {
            return this.f39761d;
        }

        /* renamed from: o */
        public final boolean m36572o() {
            return this.f39762e;
        }

        @Override // p411xi.InterfaceC9782z
        @NotNull
        public C9758c0 timeout() {
            return this.f39763f.m36562s();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/i$c.class
     */
    /* renamed from: ri.i$c */
    /* loaded from: combined.jar:classes2.jar:ri/i$c.class */
    public final class c implements InterfaceC9756b0 {

        /* renamed from: b */
        @NotNull
        public final C9761e f39764b = new C9761e();

        /* renamed from: c */
        @NotNull
        public final C9761e f39765c = new C9761e();

        /* renamed from: d */
        @Nullable
        public C5432w f39766d;

        /* renamed from: e */
        public boolean f39767e;

        /* renamed from: f */
        public final long f39768f;

        /* renamed from: g */
        public boolean f39769g;

        /* renamed from: h */
        public final C8483i f39770h;

        public c(C8483i c8483i, long j10, boolean z10) {
            this.f39770h = c8483i;
            this.f39768f = j10;
            this.f39769g = z10;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (this.f39770h) {
                this.f39767e = true;
                size = this.f39765c.size();
                this.f39765c.m41165l();
                C8483i c8483i = this.f39770h;
                if (c8483i == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                c8483i.notifyAll();
                C5398q c5398q = C5398q.f30770a;
            }
            if (size > 0) {
                m36578t(size);
            }
            this.f39770h.m36545b();
        }

        /* renamed from: f */
        public final boolean m36573f() {
            return this.f39767e;
        }

        /* renamed from: l */
        public final boolean m36574l() {
            return this.f39769g;
        }

        /* renamed from: o */
        public final void m36575o(@NotNull InterfaceC9763g interfaceC9763g, long j10) {
            boolean z10;
            boolean z11;
            long j11;
            C9367f.m39526e(interfaceC9763g, "source");
            C8483i c8483i = this.f39770h;
            long j12 = j10;
            if (C5634b.f31711h) {
                if (Thread.holdsLock(c8483i)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    C9367f.m39525d(currentThread, "Thread.currentThread()");
                    sb2.append(currentThread.getName());
                    sb2.append(" MUST NOT hold lock on ");
                    sb2.append(c8483i);
                    throw new AssertionError(sb2.toString());
                }
                j12 = j10;
            }
            while (j12 > 0) {
                synchronized (this.f39770h) {
                    z10 = this.f39769g;
                    z11 = this.f39765c.size() + j12 > this.f39768f;
                    C5398q c5398q = C5398q.f30770a;
                }
                if (z11) {
                    interfaceC9763g.skip(j12);
                    this.f39770h.m36549f(EnumC8476b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    interfaceC9763g.skip(j12);
                    return;
                }
                long mo22901x = interfaceC9763g.mo22901x(this.f39764b, j12);
                if (mo22901x == -1) {
                    throw new EOFException();
                }
                long j13 = j12 - mo22901x;
                synchronized (this.f39770h) {
                    if (this.f39767e) {
                        j11 = this.f39764b.size();
                        this.f39764b.m41165l();
                    } else {
                        boolean z12 = this.f39765c.size() == 0;
                        this.f39765c.mo41127I(this.f39764b);
                        if (z12) {
                            C8483i c8483i2 = this.f39770h;
                            if (c8483i2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            c8483i2.notifyAll();
                        }
                        j11 = 0;
                    }
                }
                j12 = j13;
                if (j11 > 0) {
                    m36578t(j11);
                    j12 = j13;
                }
            }
        }

        /* renamed from: p */
        public final void m36576p(boolean z10) {
            this.f39769g = z10;
        }

        /* renamed from: q */
        public final void m36577q(@Nullable C5432w c5432w) {
            this.f39766d = c5432w;
        }

        /* renamed from: t */
        public final void m36578t(long j10) {
            C8483i c8483i = this.f39770h;
            if (!C5634b.f31711h || !Thread.holdsLock(c8483i)) {
                this.f39770h.m36550g().m36479h1(j10);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(c8483i);
            throw new AssertionError(sb2.toString());
        }

        @Override // p411xi.InterfaceC9756b0
        @NotNull
        public C9758c0 timeout() {
            return this.f39770h.m36556m();
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            IOException iOException;
            long j11;
            boolean z10;
            C9367f.m39526e(c9761e, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            do {
                iOException = null;
                synchronized (this.f39770h) {
                    this.f39770h.m36556m().m41103r();
                    try {
                        if (this.f39770h.m36551h() != null) {
                            iOException = this.f39770h.m36552i();
                            if (iOException == null) {
                                EnumC8476b m36551h = this.f39770h.m36551h();
                                C9367f.m39524c(m36551h);
                                iOException = new C8488n(m36551h);
                            }
                        }
                        if (this.f39767e) {
                            throw new IOException("stream closed");
                        }
                        if (this.f39765c.size() > 0) {
                            C9761e c9761e2 = this.f39765c;
                            long mo22901x = c9761e2.mo22901x(c9761e, Math.min(j10, c9761e2.size()));
                            C8483i c8483i = this.f39770h;
                            c8483i.m36539A(c8483i.m36555l() + mo22901x);
                            long m36555l = this.f39770h.m36555l() - this.f39770h.m36554k();
                            j11 = mo22901x;
                            if (iOException == null) {
                                j11 = mo22901x;
                                if (m36555l >= this.f39770h.m36550g().m36459M0().m36608c() / 2) {
                                    this.f39770h.m36550g().m36485n1(this.f39770h.m36553j(), m36555l);
                                    C8483i c8483i2 = this.f39770h;
                                    c8483i2.m36569z(c8483i2.m36555l());
                                    j11 = mo22901x;
                                }
                            }
                        } else if (this.f39769g || iOException != null) {
                            j11 = -1;
                        } else {
                            this.f39770h.m36542D();
                            j11 = -1;
                            z10 = true;
                            this.f39770h.m36556m().m36580y();
                            C5398q c5398q = C5398q.f30770a;
                        }
                        z10 = false;
                        this.f39770h.m36556m().m36580y();
                        C5398q c5398q2 = C5398q.f30770a;
                    } catch (Throwable th2) {
                        this.f39770h.m36556m().m36580y();
                        throw th2;
                    }
                }
            } while (z10);
            if (j11 != -1) {
                m36578t(j11);
                return j11;
            }
            if (iOException == null) {
                return -1L;
            }
            C9367f.m39524c(iOException);
            throw iOException;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/i$d.class
     */
    /* renamed from: ri.i$d */
    /* loaded from: combined.jar:classes2.jar:ri/i$d.class */
    public final class d extends C9759d {

        /* renamed from: m */
        public final C8483i f39771m;

        public d(C8483i c8483i) {
            this.f39771m = c8483i;
        }

        @Override // p411xi.C9759d
        @NotNull
        /* renamed from: t */
        public IOException mo36579t(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p411xi.C9759d
        /* renamed from: x */
        public void mo32073x() {
            this.f39771m.m36549f(EnumC8476b.CANCEL);
            this.f39771m.m36550g().m36474b1();
        }

        /* renamed from: y */
        public final void m36580y() {
            if (m41104s()) {
                throw mo36579t(null);
            }
        }
    }

    public C8483i(int i10, @NotNull C8480f c8480f, boolean z10, boolean z11, @Nullable C5432w c5432w) {
        C9367f.m39526e(c8480f, "connection");
        this.f39757m = i10;
        this.f39758n = c8480f;
        this.f39748d = c8480f.m36460N0().m36608c();
        ArrayDeque<C5432w> arrayDeque = new ArrayDeque<>();
        this.f39749e = arrayDeque;
        this.f39751g = new c(this, c8480f.m36459M0().m36608c(), z11);
        this.f39752h = new b(this, z10);
        this.f39753i = new d(this);
        this.f39754j = new d(this);
        if (c5432w == null) {
            if (!m36563t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!m36563t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c5432w);
        }
    }

    /* renamed from: A */
    public final void m36539A(long j10) {
        this.f39745a = j10;
    }

    /* renamed from: B */
    public final void m36540B(long j10) {
        this.f39747c = j10;
    }

    @NotNull
    /* renamed from: C */
    public final C5432w m36541C() {
        C5432w c5432w;
        synchronized (this) {
            this.f39753i.m41103r();
            while (this.f39749e.isEmpty() && this.f39755k == null) {
                try {
                    m36542D();
                } catch (Throwable th2) {
                    this.f39753i.m36580y();
                    throw th2;
                }
            }
            this.f39753i.m36580y();
            if (!(!this.f39749e.isEmpty())) {
                IOException iOException = this.f39756l;
                if (iOException == null) {
                    EnumC8476b enumC8476b = this.f39755k;
                    C9367f.m39524c(enumC8476b);
                    iOException = new C8488n(enumC8476b);
                }
                throw iOException;
            }
            C5432w removeFirst = this.f39749e.removeFirst();
            C9367f.m39525d(removeFirst, "headersQueue.removeFirst()");
            c5432w = removeFirst;
        }
        return c5432w;
    }

    /* renamed from: D */
    public final void m36542D() {
        try {
            wait();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @NotNull
    /* renamed from: E */
    public final C9758c0 m36543E() {
        return this.f39754j;
    }

    /* renamed from: a */
    public final void m36544a(long j10) {
        this.f39748d += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m36545b() {
        boolean z10;
        boolean m36564u;
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
        synchronized (this) {
            z10 = !this.f39751g.m36574l() && this.f39751g.m36573f() && (this.f39752h.m36572o() || this.f39752h.m36571l());
            m36564u = m36564u();
            C5398q c5398q = C5398q.f30770a;
        }
        if (z10) {
            m36547d(EnumC8476b.CANCEL, null);
        } else {
            if (m36564u) {
                return;
            }
            this.f39758n.m36473a1(this.f39757m);
        }
    }

    /* renamed from: c */
    public final void m36546c() {
        if (this.f39752h.m36571l()) {
            throw new IOException("stream closed");
        }
        if (this.f39752h.m36572o()) {
            throw new IOException("stream finished");
        }
        if (this.f39755k != null) {
            IOException iOException = this.f39756l;
            if (iOException == null) {
                EnumC8476b enumC8476b = this.f39755k;
                C9367f.m39524c(enumC8476b);
                iOException = new C8488n(enumC8476b);
            }
            throw iOException;
        }
    }

    /* renamed from: d */
    public final void m36547d(@NotNull EnumC8476b enumC8476b, @Nullable IOException iOException) {
        C9367f.m39526e(enumC8476b, "rstStatusCode");
        if (m36548e(enumC8476b, iOException)) {
            this.f39758n.m36483l1(this.f39757m, enumC8476b);
        }
    }

    /* renamed from: e */
    public final boolean m36548e(EnumC8476b enumC8476b, IOException iOException) {
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
        synchronized (this) {
            if (this.f39755k != null) {
                return false;
            }
            if (this.f39751g.m36574l() && this.f39752h.m36572o()) {
                return false;
            }
            this.f39755k = enumC8476b;
            this.f39756l = iOException;
            notifyAll();
            C5398q c5398q = C5398q.f30770a;
            this.f39758n.m36473a1(this.f39757m);
            return true;
        }
    }

    /* renamed from: f */
    public final void m36549f(@NotNull EnumC8476b enumC8476b) {
        C9367f.m39526e(enumC8476b, "errorCode");
        if (m36548e(enumC8476b, null)) {
            this.f39758n.m36484m1(this.f39757m, enumC8476b);
        }
    }

    @NotNull
    /* renamed from: g */
    public final C8480f m36550g() {
        return this.f39758n;
    }

    @Nullable
    /* renamed from: h */
    public final EnumC8476b m36551h() {
        EnumC8476b enumC8476b;
        synchronized (this) {
            enumC8476b = this.f39755k;
        }
        return enumC8476b;
    }

    @Nullable
    /* renamed from: i */
    public final IOException m36552i() {
        return this.f39756l;
    }

    /* renamed from: j */
    public final int m36553j() {
        return this.f39757m;
    }

    /* renamed from: k */
    public final long m36554k() {
        return this.f39746b;
    }

    /* renamed from: l */
    public final long m36555l() {
        return this.f39745a;
    }

    @NotNull
    /* renamed from: m */
    public final d m36556m() {
        return this.f39753i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0009, B:12:0x001e, B:17:0x0029, B:18:0x0038), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0009, B:12:0x001e, B:17:0x0029, B:18:0x0038), top: B:3:0x0002 }] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p411xi.InterfaceC9782z m36557n() {
        /*
            r3 = this;
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            boolean r0 = r0.f39750f     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L18
            r0 = r3
            boolean r0 = r0.m36563t()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L13
            goto L18
        L13:
            r0 = 0
            r4 = r0
            goto L1a
        L18:
            r0 = 1
            r4 = r0
        L1a:
            r0 = r4
            if (r0 == 0) goto L29
            jh.q r0 = p172jh.C5398q.f30770a     // Catch: java.lang.Throwable -> L39
            r5 = r0
            r0 = r3
            monitor-exit(r0)
            r0 = r3
            ri.i$b r0 = r0.f39752h
            return r0
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
            r5 = r0
            r0 = r5
            java.lang.String r1 = "reply before requesting the sink"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r5 = move-exception
            r0 = r3
            monitor-exit(r0)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ri.C8483i.m36557n():xi.z");
    }

    @NotNull
    /* renamed from: o */
    public final b m36558o() {
        return this.f39752h;
    }

    @NotNull
    /* renamed from: p */
    public final c m36559p() {
        return this.f39751g;
    }

    /* renamed from: q */
    public final long m36560q() {
        return this.f39748d;
    }

    /* renamed from: r */
    public final long m36561r() {
        return this.f39747c;
    }

    @NotNull
    /* renamed from: s */
    public final d m36562s() {
        return this.f39754j;
    }

    /* renamed from: t */
    public final boolean m36563t() {
        return this.f39758n.m36454H0() == ((this.f39757m & 1) == 1);
    }

    /* renamed from: u */
    public final boolean m36564u() {
        synchronized (this) {
            if (this.f39755k != null) {
                return false;
            }
            if ((this.f39751g.m36574l() || this.f39751g.m36573f()) && (this.f39752h.m36572o() || this.f39752h.m36571l())) {
                if (this.f39750f) {
                    return false;
                }
            }
            return true;
        }
    }

    @NotNull
    /* renamed from: v */
    public final C9758c0 m36565v() {
        return this.f39753i;
    }

    /* renamed from: w */
    public final void m36566w(@NotNull InterfaceC9763g interfaceC9763g, int i10) {
        C9367f.m39526e(interfaceC9763g, "source");
        if (!C5634b.f31711h || !Thread.holdsLock(this)) {
            this.f39751g.m36575o(interfaceC9763g, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9367f.m39525d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: x */
    public final void m36567x(@NotNull C5432w c5432w, boolean z10) {
        boolean m36564u;
        C9367f.m39526e(c5432w, "headers");
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
        synchronized (this) {
            if (this.f39750f && z10) {
                this.f39751g.m36577q(c5432w);
            } else {
                this.f39750f = true;
                this.f39749e.add(c5432w);
            }
            if (z10) {
                this.f39751g.m36576p(true);
            }
            m36564u = m36564u();
            notifyAll();
            C5398q c5398q = C5398q.f30770a;
        }
        if (m36564u) {
            return;
        }
        this.f39758n.m36473a1(this.f39757m);
    }

    /* renamed from: y */
    public final void m36568y(@NotNull EnumC8476b enumC8476b) {
        synchronized (this) {
            C9367f.m39526e(enumC8476b, "errorCode");
            if (this.f39755k == null) {
                this.f39755k = enumC8476b;
                notifyAll();
            }
        }
    }

    /* renamed from: z */
    public final void m36569z(long j10) {
        this.f39746b = j10;
    }
}
