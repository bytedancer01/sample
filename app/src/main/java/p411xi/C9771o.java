package p411xi;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/o.class
 */
/* renamed from: xi.o */
/* loaded from: combined.jar:classes2.jar:xi/o.class */
public final class C9771o implements InterfaceC9756b0 {

    /* renamed from: b */
    public final InputStream f44550b;

    /* renamed from: c */
    public final C9758c0 f44551c;

    public C9771o(@NotNull InputStream inputStream, @NotNull C9758c0 c9758c0) {
        C9367f.m39526e(inputStream, "input");
        C9367f.m39526e(c9758c0, "timeout");
        this.f44550b = inputStream;
        this.f44551c = c9758c0;
    }

    @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44550b.close();
    }

    @Override // p411xi.InterfaceC9756b0
    @NotNull
    public C9758c0 timeout() {
        return this.f44551c;
    }

    @NotNull
    public String toString() {
        return "source(" + this.f44550b + ')';
    }

    @Override // p411xi.InterfaceC9756b0
    /* renamed from: x */
    public long mo22901x(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f44551c.mo41091f();
            C9779w m41141T0 = c9761e.m41141T0(1);
            int read = this.f44550b.read(m41141T0.f44566a, m41141T0.f44568c, (int) Math.min(j10, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - m41141T0.f44568c));
            if (read != -1) {
                m41141T0.f44568c += read;
                long j11 = read;
                c9761e.m41137Q0(c9761e.size() + j11);
                return j11;
            }
            if (m41141T0.f44567b != m41141T0.f44568c) {
                return -1L;
            }
            c9761e.f44519b = m41141T0.m41267b();
            C9780x.m41273b(m41141T0);
            return -1L;
        } catch (AssertionError e10) {
            if (C9772p.m41230d(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }
}
