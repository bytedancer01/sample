package p411xi;

import java.util.zip.Deflater;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/i.class
 */
/* renamed from: xi.i */
/* loaded from: combined.jar:classes2.jar:xi/i.class */
public final class C9765i implements InterfaceC9782z {

    /* renamed from: b */
    public boolean f44535b;

    /* renamed from: c */
    public final InterfaceC9762f f44536c;

    /* renamed from: d */
    public final Deflater f44537d;

    public C9765i(@NotNull InterfaceC9762f interfaceC9762f, @NotNull Deflater deflater) {
        C9367f.m39526e(interfaceC9762f, "sink");
        C9367f.m39526e(deflater, "deflater");
        this.f44536c = interfaceC9762f;
        this.f44537d = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9765i(@NotNull InterfaceC9782z interfaceC9782z, @NotNull Deflater deflater) {
        this(C9772p.m41228b(interfaceC9782z), deflater);
        C9367f.m39526e(interfaceC9782z, "sink");
        C9367f.m39526e(deflater, "deflater");
    }

    @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th2;
        Throwable th3;
        if (this.f44535b) {
            return;
        }
        Throwable th4 = null;
        try {
            m41216l();
        } catch (Throwable th5) {
            th4 = th5;
        }
        try {
            this.f44537d.end();
            th2 = th4;
        } catch (Throwable th6) {
            th2 = th4;
            if (th4 == null) {
                th2 = th6;
            }
        }
        try {
            this.f44536c.close();
            th3 = th2;
        } catch (Throwable th7) {
            th3 = th2;
            if (th2 == null) {
                th3 = th7;
            }
        }
        this.f44535b = true;
        if (th3 != null) {
            throw th3;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: f */
    public final void m41215f(boolean z10) {
        C9779w m41141T0;
        C9761e buffer = this.f44536c.getBuffer();
        while (true) {
            m41141T0 = buffer.m41141T0(1);
            Deflater deflater = this.f44537d;
            byte[] bArr = m41141T0.f44566a;
            int i10 = m41141T0.f44568c;
            int i11 = NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - i10;
            int deflate = z10 ? deflater.deflate(bArr, i10, i11, 2) : deflater.deflate(bArr, i10, i11);
            if (deflate > 0) {
                m41141T0.f44568c += deflate;
                buffer.m41137Q0(buffer.size() + deflate);
                this.f44536c.mo41131M();
            } else if (this.f44537d.needsInput()) {
                break;
            }
        }
        if (m41141T0.f44567b == m41141T0.f44568c) {
            buffer.f44519b = m41141T0.m41267b();
            C9780x.m41273b(m41141T0);
        }
    }

    @Override // p411xi.InterfaceC9782z, java.io.Flushable
    public void flush() {
        m41215f(true);
        this.f44536c.flush();
    }

    @Override // p411xi.InterfaceC9782z
    /* renamed from: h */
    public void mo32031h(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "source");
        C9757c.m41081b(c9761e.size(), 0L, j10);
        while (j10 > 0) {
            C9779w c9779w = c9761e.f44519b;
            C9367f.m39524c(c9779w);
            int min = (int) Math.min(j10, c9779w.f44568c - c9779w.f44567b);
            this.f44537d.setInput(c9779w.f44566a, c9779w.f44567b, min);
            m41215f(false);
            long j11 = min;
            c9761e.m41137Q0(c9761e.size() - j11);
            int i10 = c9779w.f44567b + min;
            c9779w.f44567b = i10;
            if (i10 == c9779w.f44568c) {
                c9761e.f44519b = c9779w.m41267b();
                C9780x.m41273b(c9779w);
            }
            j10 -= j11;
        }
    }

    /* renamed from: l */
    public final void m41216l() {
        this.f44537d.finish();
        m41215f(false);
    }

    @Override // p411xi.InterfaceC9782z
    @NotNull
    public C9758c0 timeout() {
        return this.f44536c.timeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.f44536c + ')';
    }
}
