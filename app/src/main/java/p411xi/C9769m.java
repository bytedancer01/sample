package p411xi;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/m.class
 */
/* renamed from: xi.m */
/* loaded from: combined.jar:classes2.jar:xi/m.class */
public final class C9769m implements InterfaceC9756b0 {

    /* renamed from: b */
    public byte f44541b;

    /* renamed from: c */
    public final C9778v f44542c;

    /* renamed from: d */
    public final Inflater f44543d;

    /* renamed from: e */
    public final C9770n f44544e;

    /* renamed from: f */
    public final CRC32 f44545f;

    public C9769m(@NotNull InterfaceC9756b0 interfaceC9756b0) {
        C9367f.m39526e(interfaceC9756b0, "source");
        C9778v c9778v = new C9778v(interfaceC9756b0);
        this.f44542c = c9778v;
        Inflater inflater = new Inflater(true);
        this.f44543d = inflater;
        this.f44544e = new C9770n((InterfaceC9763g) c9778v, inflater);
        this.f44545f = new CRC32();
    }

    @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44544e.close();
    }

    /* renamed from: f */
    public final void m41220f(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        C9367f.m39525d(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    /* renamed from: l */
    public final void m41221l() {
        this.f44542c.mo41151b0(10L);
        byte m41119B0 = this.f44542c.f44561b.m41119B0(3L);
        boolean z10 = ((m41119B0 >> 1) & 1) == 1;
        if (z10) {
            m41223p(this.f44542c.f44561b, 0L, 10L);
        }
        m41220f("ID1ID2", 8075, this.f44542c.readShort());
        this.f44542c.skip(8L);
        if (((m41119B0 >> 2) & 1) == 1) {
            this.f44542c.mo41151b0(2L);
            if (z10) {
                m41223p(this.f44542c.f44561b, 0L, 2L);
            }
            long m41132M0 = this.f44542c.f44561b.m41132M0();
            this.f44542c.mo41151b0(m41132M0);
            if (z10) {
                m41223p(this.f44542c.f44561b, 0L, m41132M0);
            }
            this.f44542c.skip(m41132M0);
        }
        if (((m41119B0 >> 3) & 1) == 1) {
            long m41261f = this.f44542c.m41261f((byte) 0);
            if (m41261f == -1) {
                throw new EOFException();
            }
            if (z10) {
                m41223p(this.f44542c.f44561b, 0L, m41261f + 1);
            }
            this.f44542c.skip(m41261f + 1);
        }
        if (((m41119B0 >> 4) & 1) == 1) {
            long m41261f2 = this.f44542c.m41261f((byte) 0);
            if (m41261f2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                m41223p(this.f44542c.f44561b, 0L, m41261f2 + 1);
            }
            this.f44542c.skip(m41261f2 + 1);
        }
        if (z10) {
            m41220f("FHCRC", this.f44542c.m41265q(), (short) this.f44545f.getValue());
            this.f44545f.reset();
        }
    }

    /* renamed from: o */
    public final void m41222o() {
        m41220f("CRC", this.f44542c.m41264p(), (int) this.f44545f.getValue());
        m41220f("ISIZE", this.f44542c.m41264p(), (int) this.f44543d.getBytesWritten());
    }

    /* renamed from: p */
    public final void m41223p(C9761e c9761e, long j10, long j11) {
        C9779w c9779w;
        C9779w c9779w2 = c9761e.f44519b;
        while (true) {
            c9779w = c9779w2;
            C9367f.m39524c(c9779w);
            int i10 = c9779w.f44568c;
            int i11 = c9779w.f44567b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            c9779w2 = c9779w.f44571f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(c9779w.f44568c - r0, j11);
            this.f44545f.update(c9779w.f44566a, (int) (c9779w.f44567b + j10), min);
            j11 -= min;
            c9779w = c9779w.f44571f;
            C9367f.m39524c(c9779w);
            j10 = 0;
        }
    }

    @Override // p411xi.InterfaceC9756b0
    @NotNull
    public C9758c0 timeout() {
        return this.f44542c.timeout();
    }

    @Override // p411xi.InterfaceC9756b0
    /* renamed from: x */
    public long mo22901x(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f44541b == 0) {
            m41221l();
            this.f44541b = (byte) 1;
        }
        if (this.f44541b == 1) {
            long size = c9761e.size();
            long mo22901x = this.f44544e.mo22901x(c9761e, j10);
            if (mo22901x != -1) {
                m41223p(c9761e, size, mo22901x);
                return mo22901x;
            }
            this.f44541b = (byte) 2;
        }
        if (this.f44541b != 2) {
            return -1L;
        }
        m41222o();
        this.f44541b = (byte) 3;
        if (this.f44542c.mo41164k0()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
