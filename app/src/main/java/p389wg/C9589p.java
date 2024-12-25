package p389wg;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import p411xi.C9758c0;
import p411xi.C9759d;
import p411xi.C9761e;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/p.class
 */
/* renamed from: wg.p */
/* loaded from: combined.jar:classes2.jar:wg/p.class */
public final class C9589p {

    /* renamed from: b */
    public long f43735b;

    /* renamed from: c */
    public final int f43736c;

    /* renamed from: d */
    public final C9588o f43737d;

    /* renamed from: f */
    public final List<C9577d> f43739f;

    /* renamed from: g */
    public List<C9577d> f43740g;

    /* renamed from: h */
    public final c f43741h;

    /* renamed from: i */
    public final b f43742i;

    /* renamed from: a */
    public long f43734a = 0;

    /* renamed from: e */
    public long f43738e = 0;

    /* renamed from: j */
    public final d f43743j = new d(this);

    /* renamed from: k */
    public final d f43744k = new d(this);

    /* renamed from: l */
    public EnumC9574a f43745l = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/p$b.class
     */
    /* renamed from: wg.p$b */
    /* loaded from: combined.jar:classes2.jar:wg/p$b.class */
    public final class b implements InterfaceC9782z {

        /* renamed from: b */
        public boolean f43746b;

        /* renamed from: c */
        public boolean f43747c;

        /* renamed from: d */
        public final C9589p f43748d;

        public b(C9589p c9589p) {
            this.f43748d = c9589p;
        }

        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this.f43748d) {
                if (this.f43746b) {
                    return;
                }
                C9589p c9589p = this.f43748d;
                if (!c9589p.f43742i.f43747c) {
                    c9589p.f43737d.m40344b1(this.f43748d.f43736c, true, null, 0L);
                }
                synchronized (this.f43748d) {
                    this.f43746b = true;
                }
                this.f43748d.f43737d.flush();
                this.f43748d.m40368j();
            }
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            synchronized (this.f43748d) {
                this.f43748d.m40369k();
            }
            this.f43748d.f43737d.flush();
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(C9761e c9761e, long j10) {
            long min;
            C9589p c9589p;
            while (j10 > 0) {
                synchronized (this.f43748d) {
                    this.f43748d.f43744k.m41103r();
                    while (true) {
                        try {
                            C9589p c9589p2 = this.f43748d;
                            if (c9589p2.f43735b > 0 || this.f43747c || this.f43746b || c9589p2.f43745l != null) {
                                break;
                            } else {
                                this.f43748d.m40384z();
                            }
                        } finally {
                        }
                    }
                    this.f43748d.f43744k.m40394y();
                    this.f43748d.m40369k();
                    min = Math.min(this.f43748d.f43735b, j10);
                    c9589p = this.f43748d;
                    c9589p.f43735b -= min;
                }
                j10 -= min;
                c9589p.f43737d.m40344b1(this.f43748d.f43736c, false, c9761e, min);
            }
        }

        @Override // p411xi.InterfaceC9782z
        public C9758c0 timeout() {
            return this.f43748d.f43744k;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/p$c.class
     */
    /* renamed from: wg.p$c */
    /* loaded from: combined.jar:classes2.jar:wg/p$c.class */
    public final class c implements InterfaceC9756b0 {

        /* renamed from: b */
        public final C9761e f43749b;

        /* renamed from: c */
        public final C9761e f43750c;

        /* renamed from: d */
        public final long f43751d;

        /* renamed from: e */
        public boolean f43752e;

        /* renamed from: f */
        public boolean f43753f;

        /* renamed from: g */
        public final C9589p f43754g;

        public c(C9589p c9589p, long j10) {
            this.f43754g = c9589p;
            this.f43749b = new C9761e();
            this.f43750c = new C9761e();
            this.f43751d = j10;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this.f43754g) {
                this.f43752e = true;
                this.f43750c.m41165l();
                this.f43754g.notifyAll();
            }
            this.f43754g.m40368j();
        }

        /* renamed from: p */
        public final void m40391p() {
            if (this.f43752e) {
                throw new IOException("stream closed");
            }
            if (this.f43754g.f43745l == null) {
                return;
            }
            throw new IOException("stream was reset: " + this.f43754g.f43745l);
        }

        /* renamed from: q */
        public void m40392q(InterfaceC9763g interfaceC9763g, long j10) {
            boolean z10;
            boolean z11;
            while (j10 > 0) {
                synchronized (this.f43754g) {
                    z10 = this.f43753f;
                    z11 = this.f43750c.size() + j10 > this.f43751d;
                }
                if (z11) {
                    interfaceC9763g.skip(j10);
                    this.f43754g.m40372n(EnumC9574a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    interfaceC9763g.skip(j10);
                    return;
                }
                long mo22901x = interfaceC9763g.mo22901x(this.f43749b, j10);
                if (mo22901x == -1) {
                    throw new EOFException();
                }
                j10 -= mo22901x;
                synchronized (this.f43754g) {
                    boolean z12 = this.f43750c.size() == 0;
                    this.f43750c.mo41127I(this.f43749b);
                    if (z12) {
                        this.f43754g.notifyAll();
                    }
                }
            }
        }

        /* renamed from: t */
        public final void m40393t() {
            this.f43754g.f43743j.m41103r();
            while (this.f43750c.size() == 0 && !this.f43753f && !this.f43752e && this.f43754g.f43745l == null) {
                try {
                    this.f43754g.m40384z();
                } finally {
                    this.f43754g.f43743j.m40394y();
                }
            }
        }

        @Override // p411xi.InterfaceC9756b0
        public C9758c0 timeout() {
            return this.f43754g.f43743j;
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(C9761e c9761e, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            synchronized (this.f43754g) {
                m40393t();
                m40391p();
                if (this.f43750c.size() == 0) {
                    return -1L;
                }
                C9761e c9761e2 = this.f43750c;
                long mo22901x = c9761e2.mo22901x(c9761e, Math.min(j10, c9761e2.size()));
                C9589p c9589p = this.f43754g;
                long j11 = c9589p.f43734a + mo22901x;
                c9589p.f43734a = j11;
                if (j11 >= c9589p.f43737d.f43688q.m40285e(65536) / 2) {
                    this.f43754g.f43737d.m40349g1(this.f43754g.f43736c, this.f43754g.f43734a);
                    this.f43754g.f43734a = 0L;
                }
                synchronized (this.f43754g.f43737d) {
                    this.f43754g.f43737d.f43686o += mo22901x;
                    if (this.f43754g.f43737d.f43686o >= this.f43754g.f43737d.f43688q.m40285e(65536) / 2) {
                        this.f43754g.f43737d.m40349g1(0, this.f43754g.f43737d.f43686o);
                        this.f43754g.f43737d.f43686o = 0L;
                    }
                }
                return mo22901x;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/p$d.class
     */
    /* renamed from: wg.p$d */
    /* loaded from: combined.jar:classes2.jar:wg/p$d.class */
    public class d extends C9759d {

        /* renamed from: m */
        public final C9589p f43755m;

        public d(C9589p c9589p) {
            this.f43755m = c9589p;
        }

        @Override // p411xi.C9759d
        /* renamed from: x */
        public void mo32073x() {
            this.f43755m.m40372n(EnumC9574a.CANCEL);
        }

        /* renamed from: y */
        public void m40394y() {
            if (m41104s()) {
                throw new InterruptedIOException("timeout");
            }
        }
    }

    public C9589p(int i10, C9588o c9588o, boolean z10, boolean z11, List<C9577d> list) {
        if (c9588o == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f43736c = i10;
        this.f43737d = c9588o;
        this.f43735b = c9588o.f43689r.m40285e(65536);
        c cVar = new c(c9588o.f43688q.m40285e(65536));
        this.f43741h = cVar;
        b bVar = new b(this);
        this.f43742i = bVar;
        cVar.f43753f = z11;
        bVar.f43747c = z10;
        this.f43739f = list;
    }

    /* renamed from: i */
    public void m40367i(long j10) {
        this.f43735b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* renamed from: j */
    public final void m40368j() {
        boolean z10;
        boolean m40378t;
        synchronized (this) {
            z10 = !this.f43741h.f43753f && this.f43741h.f43752e && (this.f43742i.f43747c || this.f43742i.f43746b);
            m40378t = m40378t();
        }
        if (z10) {
            m40370l(EnumC9574a.CANCEL);
        } else {
            if (m40378t) {
                return;
            }
            this.f43737d.m40340X0(this.f43736c);
        }
    }

    /* renamed from: k */
    public final void m40369k() {
        if (this.f43742i.f43746b) {
            throw new IOException("stream closed");
        }
        if (this.f43742i.f43747c) {
            throw new IOException("stream finished");
        }
        if (this.f43745l == null) {
            return;
        }
        throw new IOException("stream was reset: " + this.f43745l);
    }

    /* renamed from: l */
    public void m40370l(EnumC9574a enumC9574a) {
        if (m40371m(enumC9574a)) {
            this.f43737d.m40347e1(this.f43736c, enumC9574a);
        }
    }

    /* renamed from: m */
    public final boolean m40371m(EnumC9574a enumC9574a) {
        synchronized (this) {
            if (this.f43745l != null) {
                return false;
            }
            if (this.f43741h.f43753f && this.f43742i.f43747c) {
                return false;
            }
            this.f43745l = enumC9574a;
            notifyAll();
            this.f43737d.m40340X0(this.f43736c);
            return true;
        }
    }

    /* renamed from: n */
    public void m40372n(EnumC9574a enumC9574a) {
        if (m40371m(enumC9574a)) {
            this.f43737d.m40348f1(this.f43736c, enumC9574a);
        }
    }

    /* renamed from: o */
    public int m40373o() {
        return this.f43736c;
    }

    /* renamed from: p */
    public List<C9577d> m40374p() {
        List<C9577d> list;
        synchronized (this) {
            this.f43743j.m41103r();
            while (this.f43740g == null && this.f43745l == null) {
                try {
                    m40384z();
                } catch (Throwable th2) {
                    this.f43743j.m40394y();
                    throw th2;
                }
            }
            this.f43743j.m40394y();
            list = this.f43740g;
            if (list == null) {
                throw new IOException("stream was reset: " + this.f43745l);
            }
        }
        return list;
    }

    /* renamed from: q */
    public InterfaceC9782z m40375q() {
        synchronized (this) {
            if (this.f43740g == null && !m40377s()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f43742i;
    }

    /* renamed from: r */
    public InterfaceC9756b0 m40376r() {
        return this.f43741h;
    }

    /* renamed from: s */
    public boolean m40377s() {
        return this.f43737d.f43674c == ((this.f43736c & 1) == 1);
    }

    /* renamed from: t */
    public boolean m40378t() {
        synchronized (this) {
            if (this.f43745l != null) {
                return false;
            }
            if ((this.f43741h.f43753f || this.f43741h.f43752e) && (this.f43742i.f43747c || this.f43742i.f43746b)) {
                if (this.f43740g != null) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: u */
    public C9758c0 m40379u() {
        return this.f43743j;
    }

    /* renamed from: v */
    public void m40380v(InterfaceC9763g interfaceC9763g, int i10) {
        this.f43741h.m40392q(interfaceC9763g, i10);
    }

    /* renamed from: w */
    public void m40381w() {
        boolean m40378t;
        synchronized (this) {
            this.f43741h.f43753f = true;
            m40378t = m40378t();
            notifyAll();
        }
        if (m40378t) {
            return;
        }
        this.f43737d.m40340X0(this.f43736c);
    }

    /* renamed from: x */
    public void m40382x(List<C9577d> list, EnumC9578e enumC9578e) {
        EnumC9574a enumC9574a;
        boolean z10 = true;
        synchronized (this) {
            if (this.f43740g == null) {
                if (enumC9578e.failIfHeadersAbsent()) {
                    enumC9574a = EnumC9574a.PROTOCOL_ERROR;
                } else {
                    this.f43740g = list;
                    z10 = m40378t();
                    notifyAll();
                    enumC9574a = null;
                }
            } else if (enumC9578e.failIfHeadersPresent()) {
                enumC9574a = EnumC9574a.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f43740g);
                arrayList.addAll(list);
                this.f43740g = arrayList;
                enumC9574a = null;
            }
        }
        if (enumC9574a != null) {
            m40372n(enumC9574a);
        } else {
            if (z10) {
                return;
            }
            this.f43737d.m40340X0(this.f43736c);
        }
    }

    /* renamed from: y */
    public void m40383y(EnumC9574a enumC9574a) {
        synchronized (this) {
            if (this.f43745l == null) {
                this.f43745l = enumC9574a;
                notifyAll();
            }
        }
    }

    /* renamed from: z */
    public final void m40384z() {
        try {
            wait();
        } catch (InterruptedException e10) {
            throw new InterruptedIOException();
        }
    }
}
