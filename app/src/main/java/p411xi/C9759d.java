package p411xi;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/d.class
 */
/* renamed from: xi.d */
/* loaded from: combined.jar:classes2.jar:xi/d.class */
public class C9759d extends C9758c0 {

    /* renamed from: i */
    public static final long f44508i;

    /* renamed from: j */
    public static final long f44509j;

    /* renamed from: k */
    public static C9759d f44510k;

    /* renamed from: l */
    public static final a f44511l = new a(null);

    /* renamed from: f */
    public boolean f44512f;

    /* renamed from: g */
    public C9759d f44513g;

    /* renamed from: h */
    public long f44514h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/d$a.class
     */
    /* renamed from: xi.d$a */
    /* loaded from: combined.jar:classes2.jar:xi/d$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: c */
        public final C9759d m41110c() {
            C9759d c9759d = C9759d.f44510k;
            C9367f.m39524c(c9759d);
            C9759d c9759d2 = c9759d.f44513g;
            long nanoTime = System.nanoTime();
            if (c9759d2 == null) {
                C9759d.class.wait(C9759d.f44508i);
                C9759d c9759d3 = C9759d.f44510k;
                C9367f.m39524c(c9759d3);
                C9759d c9759d4 = null;
                if (c9759d3.f44513g == null) {
                    c9759d4 = null;
                    if (System.nanoTime() - nanoTime >= C9759d.f44509j) {
                        c9759d4 = C9759d.f44510k;
                    }
                }
                return c9759d4;
            }
            long m41105u = c9759d2.m41105u(nanoTime);
            if (m41105u > 0) {
                long j10 = m41105u / 1000000;
                C9759d.class.wait(j10, (int) (m41105u - (1000000 * j10)));
                return null;
            }
            C9759d c9759d5 = C9759d.f44510k;
            C9367f.m39524c(c9759d5);
            c9759d5.f44513g = c9759d2.f44513g;
            c9759d2.f44513g = null;
            return c9759d2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        
            r6.f44513g = r4.f44513g;
            r4.f44513g = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        
            r5 = false;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m41111d(p411xi.C9759d r4) {
            /*
                r3 = this;
                java.lang.Class<xi.d> r0 = p411xi.C9759d.class
                monitor-enter(r0)
                xi.d r0 = p411xi.C9759d.m41094i()     // Catch: java.lang.Throwable -> L34
                r6 = r0
            L7:
                r0 = r6
                if (r0 == 0) goto L2f
                r0 = r6
                xi.d r0 = p411xi.C9759d.m41097l(r0)     // Catch: java.lang.Throwable -> L34
                r1 = r4
                if (r0 != r1) goto L27
                r0 = r6
                r1 = r4
                xi.d r1 = p411xi.C9759d.m41097l(r1)     // Catch: java.lang.Throwable -> L34
                p411xi.C9759d.m41100p(r0, r1)     // Catch: java.lang.Throwable -> L34
                r0 = r4
                r1 = 0
                p411xi.C9759d.m41100p(r0, r1)     // Catch: java.lang.Throwable -> L34
                r0 = 0
                r5 = r0
            L22:
                java.lang.Class<xi.d> r0 = p411xi.C9759d.class
                monitor-exit(r0)
                r0 = r5
                return r0
            L27:
                r0 = r6
                xi.d r0 = p411xi.C9759d.m41097l(r0)     // Catch: java.lang.Throwable -> L34
                r6 = r0
                goto L7
            L2f:
                r0 = 1
                r5 = r0
                goto L22
            L34:
                r4 = move-exception
                java.lang.Class<xi.d> r0 = p411xi.C9759d.class
                monitor-exit(r0)
                r0 = r4
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p411xi.C9759d.a.m41111d(xi.d):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0027, B:7:0x0027, B:13:0x003b, B:15:0x0048, B:17:0x0068, B:19:0x0075, B:21:0x0080, B:23:0x009b, B:26:0x00a5, B:28:0x00bc, B:29:0x00c1, B:29:0x00c1, B:39:0x005f, B:40:0x00c9, B:41:0x00d2), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0027, B:7:0x0027, B:13:0x003b, B:15:0x0048, B:17:0x0068, B:19:0x0075, B:21:0x0080, B:23:0x009b, B:26:0x00a5, B:28:0x00bc, B:29:0x00c1, B:29:0x00c1, B:39:0x005f, B:40:0x00c9, B:41:0x00d2), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[EDGE_INSN: B:34:0x00a5->B:26:0x00a5 BREAK  A[LOOP:0: B:18:0x0073->B:23:0x009b], SYNTHETIC] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m41112e(p411xi.C9759d r8, long r9, boolean r11) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p411xi.C9759d.a.m41112e(xi.d, long, boolean):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/d$b.class
     */
    /* renamed from: xi.d$b */
    /* loaded from: combined.jar:classes2.jar:xi/d$b.class */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C9759d m41110c;
            while (true) {
                try {
                    synchronized (C9759d.class) {
                        try {
                            m41110c = C9759d.f44511l.m41110c();
                            if (m41110c == C9759d.f44510k) {
                                C9759d.f44510k = null;
                                return;
                            }
                            C5398q c5398q = C5398q.f30770a;
                        } finally {
                        }
                    }
                    if (m41110c != null) {
                        m41110c.mo32073x();
                    }
                } catch (InterruptedException e10) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/d$c.class
     */
    /* renamed from: xi.d$c */
    /* loaded from: combined.jar:classes2.jar:xi/d$c.class */
    public static final class c implements InterfaceC9782z {

        /* renamed from: b */
        public final C9759d f44515b;

        /* renamed from: c */
        public final InterfaceC9782z f44516c;

        public c(C9759d c9759d, InterfaceC9782z interfaceC9782z) {
            this.f44515b = c9759d;
            this.f44516c = interfaceC9782z;
        }

        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C9759d c9759d = this.f44515b;
            c9759d.m41103r();
            try {
                try {
                    this.f44516c.close();
                    C5398q c5398q = C5398q.f30770a;
                    if (c9759d.m41104s()) {
                        throw c9759d.m41102m(null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (c9759d.m41104s()) {
                        e = c9759d.m41102m(e);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                c9759d.m41104s();
                throw th2;
            }
        }

        @Override // p411xi.InterfaceC9782z
        @NotNull
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C9759d timeout() {
            return this.f44515b;
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            C9759d c9759d = this.f44515b;
            c9759d.m41103r();
            try {
                try {
                    this.f44516c.flush();
                    C5398q c5398q = C5398q.f30770a;
                    if (c9759d.m41104s()) {
                        throw c9759d.m41102m(null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (c9759d.m41104s()) {
                        e = c9759d.m41102m(e);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                c9759d.m41104s();
                throw th2;
            }
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(@NotNull C9761e c9761e, long j10) {
            long j11;
            C9367f.m39526e(c9761e, "source");
            C9757c.m41081b(c9761e.size(), 0L, j10);
            while (true) {
                long j12 = 0;
                if (j10 <= 0) {
                    return;
                }
                C9779w c9779w = c9761e.f44519b;
                while (true) {
                    C9779w c9779w2 = c9779w;
                    C9367f.m39524c(c9779w2);
                    j11 = j12;
                    if (j12 >= 65536) {
                        break;
                    }
                    j12 += c9779w2.f44568c - c9779w2.f44567b;
                    if (j12 >= j10) {
                        j11 = j10;
                        break;
                    }
                    c9779w = c9779w2.f44571f;
                }
                C9759d c9759d = this.f44515b;
                c9759d.m41103r();
                try {
                    try {
                        this.f44516c.mo32031h(c9761e, j11);
                        C5398q c5398q = C5398q.f30770a;
                        if (c9759d.m41104s()) {
                            throw c9759d.m41102m(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        e = e10;
                        if (c9759d.m41104s()) {
                            e = c9759d.m41102m(e);
                        }
                        throw e;
                    }
                } catch (Throwable th2) {
                    c9759d.m41104s();
                    throw th2;
                }
            }
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.sink(" + this.f44516c + ')';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/d$d.class
     */
    /* renamed from: xi.d$d */
    /* loaded from: combined.jar:classes2.jar:xi/d$d.class */
    public static final class d implements InterfaceC9756b0 {

        /* renamed from: b */
        public final C9759d f44517b;

        /* renamed from: c */
        public final InterfaceC9756b0 f44518c;

        public d(C9759d c9759d, InterfaceC9756b0 interfaceC9756b0) {
            this.f44517b = c9759d;
            this.f44518c = interfaceC9756b0;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C9759d c9759d = this.f44517b;
            c9759d.m41103r();
            try {
                try {
                    this.f44518c.close();
                    C5398q c5398q = C5398q.f30770a;
                    if (c9759d.m41104s()) {
                        throw c9759d.m41102m(null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (c9759d.m41104s()) {
                        e = c9759d.m41102m(e);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                c9759d.m41104s();
                throw th2;
            }
        }

        @Override // p411xi.InterfaceC9756b0
        @NotNull
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C9759d timeout() {
            return this.f44517b;
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.source(" + this.f44518c + ')';
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "sink");
            C9759d c9759d = this.f44517b;
            c9759d.m41103r();
            try {
                try {
                    long mo22901x = this.f44518c.mo22901x(c9761e, j10);
                    if (c9759d.m41104s()) {
                        throw c9759d.m41102m(null);
                    }
                    return mo22901x;
                } catch (IOException e10) {
                    e = e10;
                    if (c9759d.m41104s()) {
                        e = c9759d.m41102m(e);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                c9759d.m41104s();
                throw th2;
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f44508i = millis;
        f44509j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @NotNull
    /* renamed from: m */
    public final IOException m41102m(@Nullable IOException iOException) {
        return mo36579t(iOException);
    }

    /* renamed from: r */
    public final void m41103r() {
        if (!(!this.f44512f)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long mo41093h = mo41093h();
        boolean mo41090e = mo41090e();
        if (mo41093h != 0 || mo41090e) {
            this.f44512f = true;
            f44511l.m41112e(this, mo41093h, mo41090e);
        }
    }

    /* renamed from: s */
    public final boolean m41104s() {
        if (!this.f44512f) {
            return false;
        }
        this.f44512f = false;
        return f44511l.m41111d(this);
    }

    @NotNull
    /* renamed from: t */
    public IOException mo36579t(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: u */
    public final long m41105u(long j10) {
        return this.f44514h - j10;
    }

    @NotNull
    /* renamed from: v */
    public final InterfaceC9782z m41106v(@NotNull InterfaceC9782z interfaceC9782z) {
        C9367f.m39526e(interfaceC9782z, "sink");
        return new c(this, interfaceC9782z);
    }

    @NotNull
    /* renamed from: w */
    public final InterfaceC9756b0 m41107w(@NotNull InterfaceC9756b0 interfaceC9756b0) {
        C9367f.m39526e(interfaceC9756b0, "source");
        return new d(this, interfaceC9756b0);
    }

    /* renamed from: x */
    public void mo32073x() {
    }
}
