package p253oi;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5382a;
import p172jh.C5398q;
import p173ji.AbstractC5429t;
import p173ji.C5399a;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5411g;
import p173ji.C5427r;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5409f;
import p274pi.C7730g;
import p372vh.C9367f;
import p411xi.C9759d;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/e.class
 */
/* renamed from: oi.e */
/* loaded from: combined.jar:classes2.jar:oi/e.class */
public final class C6981e implements InterfaceC5407e {

    /* renamed from: b */
    public final C6984h f36030b;

    /* renamed from: c */
    @NotNull
    public final AbstractC5429t f36031c;

    /* renamed from: d */
    public final c f36032d;

    /* renamed from: e */
    public final AtomicBoolean f36033e;

    /* renamed from: f */
    public Object f36034f;

    /* renamed from: g */
    public C6980d f36035g;

    /* renamed from: h */
    @Nullable
    public C6982f f36036h;

    /* renamed from: i */
    public boolean f36037i;

    /* renamed from: j */
    @Nullable
    public C6979c f36038j;

    /* renamed from: k */
    public boolean f36039k;

    /* renamed from: l */
    public boolean f36040l;

    /* renamed from: m */
    public boolean f36041m;

    /* renamed from: n */
    public volatile boolean f36042n;

    /* renamed from: o */
    public volatile C6979c f36043o;

    /* renamed from: p */
    @Nullable
    public volatile C6982f f36044p;

    /* renamed from: q */
    @NotNull
    public final C5402b0 f36045q;

    /* renamed from: r */
    @NotNull
    public final C5406d0 f36046r;

    /* renamed from: s */
    public final boolean f36047s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/e$a.class
     */
    /* renamed from: oi.e$a */
    /* loaded from: combined.jar:classes2.jar:oi/e$a.class */
    public final class a implements Runnable {

        /* renamed from: b */
        @NotNull
        public volatile AtomicInteger f36048b;

        /* renamed from: c */
        public final InterfaceC5409f f36049c;

        /* renamed from: d */
        public final C6981e f36050d;

        public a(@NotNull C6981e c6981e, InterfaceC5409f interfaceC5409f) {
            C9367f.m39526e(interfaceC5409f, "responseCallback");
            this.f36050d = c6981e;
            this.f36049c = interfaceC5409f;
            this.f36048b = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m32067a(@NotNull ExecutorService executorService) {
            C9367f.m39526e(executorService, "executorService");
            C5427r m26806o = this.f36050d.m32056k().m26806o();
            if (C5634b.f31711h && Thread.holdsLock(m26806o)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9367f.m39525d(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(m26806o);
                throw new AssertionError(sb2.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f36050d.m32065x(interruptedIOException);
                    this.f36049c.onFailure(this.f36050d, interruptedIOException);
                    this.f36050d.m32056k().m26806o().m27034f(this);
                }
            } catch (Throwable th2) {
                this.f36050d.m32056k().m26806o().m27034f(this);
                throw th2;
            }
        }

        @NotNull
        /* renamed from: b */
        public final C6981e m32068b() {
            return this.f36050d;
        }

        @NotNull
        /* renamed from: c */
        public final AtomicInteger m32069c() {
            return this.f36048b;
        }

        @NotNull
        /* renamed from: d */
        public final String m32070d() {
            return this.f36050d.m32061p().m26880j().m27112i();
        }

        /* renamed from: e */
        public final void m32071e(@NotNull a aVar) {
            C9367f.m39526e(aVar, "other");
            this.f36048b = aVar.f36048b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            boolean z11;
            C5427r m26806o;
            String str = "OkHttp " + this.f36050d.m32066z();
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                try {
                    this.f36050d.f36032d.m41103r();
                    try {
                        z11 = true;
                    } catch (IOException e10) {
                        e = e10;
                        z11 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                    }
                    try {
                        this.f36049c.onResponse(this.f36050d, this.f36050d.m32062r());
                        m26806o = this.f36050d.m32056k().m26806o();
                    } catch (IOException e11) {
                        e = e11;
                        if (z11) {
                            C8588j.f40042c.m36880g().m36873j("Callback failure for " + this.f36050d.m32048G(), 4, e);
                        } else {
                            this.f36049c.onFailure(this.f36050d, e);
                        }
                        m26806o = this.f36050d.m32056k().m26806o();
                        m26806o.m27034f(this);
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = true;
                        this.f36050d.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th);
                            C5382a.m26732a(iOException, th);
                            this.f36049c.onFailure(this.f36050d, iOException);
                        }
                        throw th;
                    }
                    m26806o.m27034f(this);
                } catch (Throwable th4) {
                    this.f36050d.m32056k().m26806o().m27034f(this);
                    throw th4;
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/e$b.class
     */
    /* renamed from: oi.e$b */
    /* loaded from: combined.jar:classes2.jar:oi/e$b.class */
    public static final class b extends WeakReference<C6981e> {

        /* renamed from: a */
        @Nullable
        public final Object f36051a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C6981e c6981e, @Nullable Object obj) {
            super(c6981e);
            C9367f.m39526e(c6981e, "referent");
            this.f36051a = obj;
        }

        @Nullable
        /* renamed from: a */
        public final Object m32072a() {
            return this.f36051a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/e$c.class
     */
    /* renamed from: oi.e$c */
    /* loaded from: combined.jar:classes2.jar:oi/e$c.class */
    public static final class c extends C9759d {

        /* renamed from: m */
        public final C6981e f36052m;

        public c(C6981e c6981e) {
            this.f36052m = c6981e;
        }

        @Override // p411xi.C9759d
        /* renamed from: x */
        public void mo32073x() {
            this.f36052m.cancel();
        }
    }

    public C6981e(@NotNull C5402b0 c5402b0, @NotNull C5406d0 c5406d0, boolean z10) {
        C9367f.m39526e(c5402b0, "client");
        C9367f.m39526e(c5406d0, "originalRequest");
        this.f36045q = c5402b0;
        this.f36046r = c5406d0;
        this.f36047s = z10;
        this.f36030b = c5402b0.m26803l().m26993a();
        this.f36031c = c5402b0.m26808r().mo27066a(this);
        c cVar = new c(this);
        cVar.mo41092g(c5402b0.m26799h(), TimeUnit.MILLISECONDS);
        C5398q c5398q = C5398q.f30770a;
        this.f36032d = cVar;
        this.f36033e = new AtomicBoolean();
        this.f36041m = true;
    }

    @Nullable
    /* renamed from: A */
    public final Socket m32043A() {
        C6982f c6982f = this.f36036h;
        C9367f.m39524c(c6982f);
        if (C5634b.f31711h && !Thread.holdsLock(c6982f)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(c6982f);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<C6981e>> m32095n = c6982f.m32095n();
        Iterator<Reference<C6981e>> it = m32095n.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (C9367f.m39522a(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 != -1) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("Check failed.".toString());
        }
        m32095n.remove(i10);
        this.f36036h = null;
        if (!m32095n.isEmpty()) {
            return null;
        }
        c6982f.m32077C(System.nanoTime());
        if (this.f36030b.m32112c(c6982f)) {
            return c6982f.m32079E();
        }
        return null;
    }

    /* renamed from: C */
    public final boolean m32044C() {
        C6980d c6980d = this.f36035g;
        C9367f.m39524c(c6980d);
        return c6980d.m32037e();
    }

    /* renamed from: D */
    public final void m32045D(@Nullable C6982f c6982f) {
        this.f36044p = c6982f;
    }

    /* renamed from: E */
    public final void m32046E() {
        if (!(!this.f36037i)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f36037i = true;
        this.f36032d.m41104s();
    }

    /* renamed from: F */
    public final <E extends IOException> E m32047F(E e10) {
        if (!this.f36037i && this.f36032d.m41104s()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
            return interruptedIOException;
        }
        return e10;
    }

    /* renamed from: G */
    public final String m32048G() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f36047s ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(m32066z());
        return sb2.toString();
    }

    /* renamed from: c */
    public final void m32049c(@NotNull C6982f c6982f) {
        C9367f.m39526e(c6982f, "connection");
        if (!C5634b.f31711h || Thread.holdsLock(c6982f)) {
            if (!(this.f36036h == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f36036h = c6982f;
            c6982f.m32095n().add(new b(this, this.f36034f));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9367f.m39525d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(c6982f);
        throw new AssertionError(sb2.toString());
    }

    @Override // p173ji.InterfaceC5407e
    public void cancel() {
        if (this.f36042n) {
            return;
        }
        this.f36042n = true;
        C6979c c6979c = this.f36043o;
        if (c6979c != null) {
            c6979c.m32009b();
        }
        C6982f c6982f = this.f36044p;
        if (c6982f != null) {
            c6982f.m32085d();
        }
        this.f36031c.m27045f(this);
    }

    /* renamed from: d */
    public final <E extends IOException> E m32050d(E e10) {
        Socket m32043A;
        boolean z10 = C5634b.f31711h;
        if (z10 && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        C6982f c6982f = this.f36036h;
        if (c6982f != null) {
            if (z10 && Thread.holdsLock(c6982f)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Thread ");
                Thread currentThread2 = Thread.currentThread();
                C9367f.m39525d(currentThread2, "Thread.currentThread()");
                sb3.append(currentThread2.getName());
                sb3.append(" MUST NOT hold lock on ");
                sb3.append(c6982f);
                throw new AssertionError(sb3.toString());
            }
            synchronized (c6982f) {
                m32043A = m32043A();
            }
            if (this.f36036h == null) {
                if (m32043A != null) {
                    C5634b.m27791k(m32043A);
                }
                this.f36031c.m27050k(this, c6982f);
            } else {
                if (!(m32043A == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) m32047F(e10);
        if (e10 != null) {
            AbstractC5429t abstractC5429t = this.f36031c;
            C9367f.m39524c(e11);
            abstractC5429t.m27043d(this, e11);
        } else {
            this.f36031c.m27042c(this);
        }
        return e11;
    }

    /* renamed from: e */
    public final void m32051e() {
        this.f36034f = C8588j.f40042c.m36880g().mo36844h("response.body().close()");
        this.f36031c.m27044e(this);
    }

    @Override // p173ji.InterfaceC5407e
    @NotNull
    public C5410f0 execute() {
        if (!this.f36033e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f36032d.m41103r();
        m32051e();
        try {
            this.f36045q.m26806o().m27030b(this);
            return m32062r();
        } finally {
            this.f36045q.m26806o().m27035g(this);
        }
    }

    @NotNull
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C6981e clone() {
        return new C6981e(this.f36045q, this.f36046r, this.f36047s);
    }

    /* renamed from: h */
    public final C5399a m32053h(C5433x c5433x) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C5411g c5411g;
        if (c5433x.m27113j()) {
            sSLSocketFactory = this.f36045q.m26792O();
            hostnameVerifier = this.f36045q.m26812z();
            c5411g = this.f36045q.m26801j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c5411g = null;
        }
        return new C5399a(c5433x.m27112i(), c5433x.m27117o(), this.f36045q.m26807p(), this.f36045q.m26791N(), sSLSocketFactory, hostnameVerifier, c5411g, this.f36045q.m26787J(), this.f36045q.m26786I(), this.f36045q.m26785H(), this.f36045q.m26804m(), this.f36045q.m26788K());
    }

    /* renamed from: i */
    public final void m32054i(@NotNull C5406d0 c5406d0, boolean z10) {
        C9367f.m39526e(c5406d0, "request");
        if (!(this.f36038j == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f36040l)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f36039k)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C5398q c5398q = C5398q.f30770a;
        }
        if (z10) {
            this.f36035g = new C6980d(this.f36030b, m32053h(c5406d0.m26880j()), this, this.f36031c);
        }
    }

    @Override // p173ji.InterfaceC5407e
    public boolean isCanceled() {
        return this.f36042n;
    }

    /* renamed from: j */
    public final void m32055j(boolean z10) {
        C6979c c6979c;
        synchronized (this) {
            if (!this.f36041m) {
                throw new IllegalStateException("released".toString());
            }
            C5398q c5398q = C5398q.f30770a;
        }
        if (z10 && (c6979c = this.f36043o) != null) {
            c6979c.m32011d();
        }
        this.f36038j = null;
    }

    @NotNull
    /* renamed from: k */
    public final C5402b0 m32056k() {
        return this.f36045q;
    }

    @Nullable
    /* renamed from: l */
    public final C6982f m32057l() {
        return this.f36036h;
    }

    @NotNull
    /* renamed from: m */
    public final AbstractC5429t m32058m() {
        return this.f36031c;
    }

    /* renamed from: n */
    public final boolean m32059n() {
        return this.f36047s;
    }

    @Nullable
    /* renamed from: o */
    public final C6979c m32060o() {
        return this.f36038j;
    }

    @NotNull
    /* renamed from: p */
    public final C5406d0 m32061p() {
        return this.f36046r;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p173ji.C5410f0 m32062r() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p253oi.C6981e.m32062r():ji.f0");
    }

    @Override // p173ji.InterfaceC5407e
    @NotNull
    public C5406d0 request() {
        return this.f36046r;
    }

    @NotNull
    /* renamed from: s */
    public final C6979c m32063s(@NotNull C7730g c7730g) {
        C9367f.m39526e(c7730g, "chain");
        synchronized (this) {
            if (!this.f36041m) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f36040l)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f36039k)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C5398q c5398q = C5398q.f30770a;
        }
        C6980d c6980d = this.f36035g;
        C9367f.m39524c(c6980d);
        C6979c c6979c = new C6979c(this, this.f36031c, c6980d, c6980d.m32033a(this.f36045q, c7730g));
        this.f36038j = c6979c;
        this.f36043o = c6979c;
        synchronized (this) {
            this.f36039k = true;
            this.f36040l = true;
        }
        if (this.f36042n) {
            throw new IOException("Canceled");
        }
        return c6979c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {, blocks: (B:56:0x0027, B:16:0x0044, B:19:0x004d, B:21:0x0053, B:23:0x005b, B:29:0x006f, B:31:0x0076, B:34:0x0089, B:12:0x0039), top: B:55:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {, blocks: (B:56:0x0027, B:16:0x0044, B:19:0x004d, B:21:0x0053, B:23:0x005b, B:29:0x006f, B:31:0x0076, B:34:0x0089, B:12:0x0039), top: B:55:0x0027 }] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E m32064u(@org.jetbrains.annotations.NotNull p253oi.C6979c r4, boolean r5, boolean r6, E r7) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "exchange"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r4
            r1 = r3
            oi.c r1 = r1.f36043o
            boolean r0 = p372vh.C9367f.m39522a(r0, r1)
            r10 = r0
            r0 = 1
            r9 = r0
            r0 = r10
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L1e
            r0 = r7
            return r0
        L1e:
            r0 = r3
            monitor-enter(r0)
            r0 = 0
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L35
            r0 = r3
            boolean r0 = r0.f36039k     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L40
            goto L35
        L31:
            r4 = move-exception
            goto Lb5
        L35:
            r0 = r6
            if (r0 == 0) goto L86
            r0 = r3
            boolean r0 = r0.f36040l     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L86
        L40:
            r0 = r5
            if (r0 == 0) goto L49
            r0 = r3
            r1 = 0
            r0.f36039k = r1     // Catch: java.lang.Throwable -> L31
        L49:
            r0 = r6
            if (r0 == 0) goto L52
            r0 = r3
            r1 = 0
            r0.f36040l = r1     // Catch: java.lang.Throwable -> L31
        L52:
            r0 = r3
            boolean r0 = r0.f36039k     // Catch: java.lang.Throwable -> L31
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L68
            r0 = r3
            boolean r0 = r0.f36040l     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L68
            r0 = 1
            r8 = r0
            goto L6b
        L68:
            r0 = 0
            r8 = r0
        L6b:
            r0 = r5
            if (r0 != 0) goto L80
            r0 = r3
            boolean r0 = r0.f36040l     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L80
            r0 = r3
            boolean r0 = r0.f36041m     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L80
            goto L83
        L80:
            r0 = 0
            r9 = r0
        L83:
            goto L89
        L86:
            r0 = 0
            r9 = r0
        L89:
            jh.q r0 = p172jh.C5398q.f30770a     // Catch: java.lang.Throwable -> L31
            r4 = r0
            r0 = r3
            monitor-exit(r0)
            r0 = r8
            if (r0 == 0) goto La6
            r0 = r3
            r1 = 0
            r0.f36043o = r1
            r0 = r3
            oi.f r0 = r0.f36036h
            r4 = r0
            r0 = r4
            if (r0 == 0) goto La6
            r0 = r4
            r0.m32100s()
        La6:
            r0 = r9
            if (r0 == 0) goto Lb2
            r0 = r3
            r1 = r7
            java.io.IOException r0 = r0.m32050d(r1)
            return r0
        Lb2:
            r0 = r7
            return r0
        Lb5:
            r0 = r3
            monitor-exit(r0)
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253oi.C6981e.m32064u(oi.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @Override // p173ji.InterfaceC5407e
    /* renamed from: w */
    public void mo26894w(@NotNull InterfaceC5409f interfaceC5409f) {
        C9367f.m39526e(interfaceC5409f, "responseCallback");
        if (!this.f36033e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        m32051e();
        this.f36045q.m26806o().m27029a(new a(this, interfaceC5409f));
    }

    @Nullable
    /* renamed from: x */
    public final IOException m32065x(@Nullable IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f36041m) {
                this.f36041m = false;
                z10 = false;
                if (!this.f36039k) {
                    z10 = false;
                    if (!this.f36040l) {
                        z10 = true;
                    }
                }
            }
            C5398q c5398q = C5398q.f30770a;
        }
        IOException iOException2 = iOException;
        if (z10) {
            iOException2 = m32050d(iOException);
        }
        return iOException2;
    }

    @NotNull
    /* renamed from: z */
    public final String m32066z() {
        return this.f36046r.m26880j().m27119q();
    }
}
