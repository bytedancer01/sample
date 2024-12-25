package p428yg;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/n.class
 */
/* renamed from: yg.n */
/* loaded from: combined.jar:classes2.jar:yg/n.class */
public final class C10008n extends InputStream {

    /* renamed from: b */
    public final InputStream f45874b;

    /* renamed from: c */
    public long f45875c;

    /* renamed from: d */
    public long f45876d;

    /* renamed from: e */
    public long f45877e;

    /* renamed from: f */
    public long f45878f;

    public C10008n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public C10008n(InputStream inputStream, int i10) {
        this.f45878f = -1L;
        this.f45874b = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i10);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f45874b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45874b.close();
    }

    /* renamed from: f */
    public void m42094f(long j10) {
        if (this.f45875c > this.f45877e || j10 < this.f45876d) {
            throw new IOException("Cannot reset");
        }
        this.f45874b.reset();
        m42097p(this.f45876d, j10);
        this.f45875c = j10;
    }

    /* renamed from: l */
    public long m42095l(int i10) {
        long j10 = this.f45875c + i10;
        if (this.f45877e < j10) {
            m42096o(j10);
        }
        return this.f45875c;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f45878f = m42095l(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f45874b.markSupported();
    }

    /* renamed from: o */
    public final void m42096o(long j10) {
        try {
            long j11 = this.f45876d;
            long j12 = this.f45875c;
            if (j11 >= j12 || j12 > this.f45877e) {
                this.f45876d = j12;
                this.f45874b.mark((int) (j10 - j12));
            } else {
                this.f45874b.reset();
                this.f45874b.mark((int) (j10 - this.f45876d));
                m42097p(this.f45876d, this.f45875c);
            }
            this.f45877e = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    /* renamed from: p */
    public final void m42097p(long j10, long j11) {
        while (j10 < j11) {
            long skip = this.f45874b.skip(j11 - j10);
            long j12 = skip;
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    j12 = 1;
                }
            }
            j10 += j12;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f45874b.read();
        if (read != -1) {
            this.f45875c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int read = this.f45874b.read(bArr);
        if (read != -1) {
            this.f45875c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f45874b.read(bArr, i10, i11);
        if (read != -1) {
            this.f45875c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        m42094f(this.f45878f);
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        long skip = this.f45874b.skip(j10);
        this.f45875c += skip;
        return skip;
    }
}
