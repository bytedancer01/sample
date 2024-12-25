package p363v4;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/f.class
 */
/* renamed from: v4.f */
/* loaded from: combined.jar:classes1.jar:v4/f.class */
public class C9240f extends FilterInputStream {

    /* renamed from: b */
    public int f42233b;

    public C9240f(InputStream inputStream) {
        super(inputStream);
        this.f42233b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f42233b;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    /* renamed from: f */
    public final long m38960f(long j10) {
        int i10 = this.f42233b;
        if (i10 == 0) {
            return -1L;
        }
        long j11 = j10;
        if (i10 != Integer.MIN_VALUE) {
            j11 = j10;
            if (j10 > i10) {
                j11 = i10;
            }
        }
        return j11;
    }

    /* renamed from: l */
    public final void m38961l(long j10) {
        int i10 = this.f42233b;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f42233b = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        super.mark(i10);
        this.f42233b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m38960f(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m38961l(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int m38960f = (int) m38960f(i11);
        if (m38960f == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, m38960f);
        m38961l(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.f42233b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long m38960f = m38960f(j10);
        if (m38960f == -1) {
            return -1L;
        }
        long skip = super.skip(m38960f);
        m38961l(skip);
        return skip;
    }
}
