package p253oi;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import ki.C5634b;
import ni.AbstractC6794a;
import ni.C6797d;
import ni.C6798e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p173ji.C5399a;
import p173ji.C5414h0;
import p253oi.C6981e;
import p372vh.C9365d;
import p372vh.C9367f;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/h.class
 */
/* renamed from: oi.h */
/* loaded from: combined.jar:classes2.jar:oi/h.class */
public final class C6984h {

    /* renamed from: f */
    public static final a f36079f = new a(null);

    /* renamed from: a */
    public final long f36080a;

    /* renamed from: b */
    public final C6797d f36081b;

    /* renamed from: c */
    public final b f36082c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue<C6982f> f36083d;

    /* renamed from: e */
    public final int f36084e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/h$a.class
     */
    /* renamed from: oi.h$a */
    /* loaded from: combined.jar:classes2.jar:oi/h$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/h$b.class
     */
    /* renamed from: oi.h$b */
    /* loaded from: combined.jar:classes2.jar:oi/h$b.class */
    public static final class b extends AbstractC6794a {

        /* renamed from: e */
        public final C6984h f36085e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6984h c6984h, String str) {
            super(str, false, 2, null);
            this.f36085e = c6984h;
        }

        @Override // ni.AbstractC6794a
        /* renamed from: f */
        public long mo31315f() {
            return this.f36085e.m32111b(System.nanoTime());
        }
    }

    public C6984h(@NotNull C6798e c6798e, int i10, long j10, @NotNull TimeUnit timeUnit) {
        C9367f.m39526e(c6798e, "taskRunner");
        C9367f.m39526e(timeUnit, "timeUnit");
        this.f36084e = i10;
        this.f36080a = timeUnit.toNanos(j10);
        this.f36081b = c6798e.m31342i();
        this.f36082c = new b(this, C5634b.f31712i + " ConnectionPool");
        this.f36083d = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    /* renamed from: a */
    public final boolean m32110a(@NotNull C5399a c5399a, @NotNull C6981e c6981e, @Nullable List<C5414h0> list, boolean z10) {
        C9367f.m39526e(c5399a, "address");
        C9367f.m39526e(c6981e, "call");
        Iterator<C6982f> it = this.f36083d.iterator();
        while (it.hasNext()) {
            C6982f next = it.next();
            C9367f.m39525d(next, "connection");
            synchronized (next) {
                if (z10) {
                    if (!next.m32103v()) {
                        C5398q c5398q = C5398q.f30770a;
                    }
                }
                if (next.m32101t(c5399a, list)) {
                    c6981e.m32049c(next);
                    return true;
                }
                C5398q c5398q2 = C5398q.f30770a;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m32111b(long j10) {
        Iterator<C6982f> it = this.f36083d.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        C6982f c6982f = null;
        int i11 = 0;
        while (it.hasNext()) {
            C6982f next = it.next();
            C9367f.m39525d(next, "connection");
            synchronized (next) {
                if (m32113d(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long m32096o = j10 - next.m32096o();
                    if (m32096o > j11) {
                        C5398q c5398q = C5398q.f30770a;
                        c6982f = next;
                        j11 = m32096o;
                    } else {
                        C5398q c5398q2 = C5398q.f30770a;
                    }
                }
            }
        }
        long j12 = this.f36080a;
        if (j11 < j12 && i10 <= this.f36084e) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        C9367f.m39524c(c6982f);
        synchronized (c6982f) {
            try {
                if (!c6982f.m32095n().isEmpty()) {
                    return 0L;
                }
                if (c6982f.m32096o() + j11 != j10) {
                    return 0L;
                }
                c6982f.m32078D(true);
                this.f36083d.remove(c6982f);
                C5634b.m27791k(c6982f.m32079E());
                if (!this.f36083d.isEmpty()) {
                    return 0L;
                }
                this.f36081b.m31321a();
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m32112c(@NotNull C6982f c6982f) {
        boolean z10;
        C9367f.m39526e(c6982f, "connection");
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
        if (c6982f.m32097p() || this.f36084e == 0) {
            c6982f.m32078D(true);
            this.f36083d.remove(c6982f);
            z10 = true;
            if (this.f36083d.isEmpty()) {
                this.f36081b.m31321a();
                z10 = true;
            }
        } else {
            C6797d.m31320j(this.f36081b, this.f36082c, 0L, 2, null);
            z10 = false;
        }
        return z10;
    }

    /* renamed from: d */
    public final int m32113d(C6982f c6982f, long j10) {
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
        int i10 = 0;
        while (i10 < m32095n.size()) {
            Reference<C6981e> reference = m32095n.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                C8588j.f40042c.m36880g().mo36845l("A connection to " + c6982f.m32075A().m26977a().m26760l() + " was leaked. Did you forget to close a response body?", ((C6981e.b) reference).m32072a());
                m32095n.remove(i10);
                c6982f.m32078D(true);
                if (m32095n.isEmpty()) {
                    c6982f.m32077C(j10 - this.f36080a);
                    return 0;
                }
            }
        }
        return m32095n.size();
    }

    /* renamed from: e */
    public final void m32114e(@NotNull C6982f c6982f) {
        C9367f.m39526e(c6982f, "connection");
        if (!C5634b.f31711h || Thread.holdsLock(c6982f)) {
            this.f36083d.add(c6982f);
            C6797d.m31320j(this.f36081b, this.f36082c, 0L, 2, null);
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
}
