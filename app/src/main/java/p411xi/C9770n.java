package p411xi;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/n.class
 */
/* renamed from: xi.n */
/* loaded from: combined.jar:classes2.jar:xi/n.class */
public final class C9770n implements InterfaceC9756b0 {

    /* renamed from: b */
    public int f44546b;

    /* renamed from: c */
    public boolean f44547c;

    /* renamed from: d */
    public final InterfaceC9763g f44548d;

    /* renamed from: e */
    public final Inflater f44549e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9770n(@NotNull InterfaceC9756b0 interfaceC9756b0, @NotNull Inflater inflater) {
        this(C9772p.m41229c(interfaceC9756b0), inflater);
        C9367f.m39526e(interfaceC9756b0, "source");
        C9367f.m39526e(inflater, "inflater");
    }

    public C9770n(@NotNull InterfaceC9763g interfaceC9763g, @NotNull Inflater inflater) {
        C9367f.m39526e(interfaceC9763g, "source");
        C9367f.m39526e(inflater, "inflater");
        this.f44548d = interfaceC9763g;
        this.f44549e = inflater;
    }

    @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f44547c) {
            return;
        }
        this.f44549e.end();
        this.f44547c = true;
        this.f44548d.close();
    }

    /* renamed from: f */
    public final long m41224f(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f44547c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            C9779w m41141T0 = c9761e.m41141T0(1);
            int min = (int) Math.min(j10, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - m41141T0.f44568c);
            m41225l();
            int inflate = this.f44549e.inflate(m41141T0.f44566a, m41141T0.f44568c, min);
            m41226o();
            if (inflate > 0) {
                m41141T0.f44568c += inflate;
                long j11 = inflate;
                c9761e.m41137Q0(c9761e.size() + j11);
                return j11;
            }
            if (m41141T0.f44567b != m41141T0.f44568c) {
                return 0L;
            }
            c9761e.f44519b = m41141T0.m41267b();
            C9780x.m41273b(m41141T0);
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: l */
    public final boolean m41225l() {
        if (!this.f44549e.needsInput()) {
            return false;
        }
        if (this.f44548d.mo41164k0()) {
            return true;
        }
        C9779w c9779w = this.f44548d.getBuffer().f44519b;
        C9367f.m39524c(c9779w);
        int i10 = c9779w.f44568c;
        int i11 = c9779w.f44567b;
        int i12 = i10 - i11;
        this.f44546b = i12;
        this.f44549e.setInput(c9779w.f44566a, i11, i12);
        return false;
    }

    /* renamed from: o */
    public final void m41226o() {
        int i10 = this.f44546b;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f44549e.getRemaining();
        this.f44546b -= remaining;
        this.f44548d.skip(remaining);
    }

    @Override // p411xi.InterfaceC9756b0
    @NotNull
    public C9758c0 timeout() {
        return this.f44548d.timeout();
    }

    @Override // p411xi.InterfaceC9756b0
    /* renamed from: x */
    public long mo22901x(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        do {
            long m41224f = m41224f(c9761e, j10);
            if (m41224f > 0) {
                return m41224f;
            }
            if (this.f44549e.finished() || this.f44549e.needsDictionary()) {
                return -1L;
            }
        } while (!this.f44548d.mo41164k0());
        throw new EOFException("source exhausted prematurely");
    }
}
