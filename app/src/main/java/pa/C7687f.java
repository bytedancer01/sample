package pa;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pa/f.class
 */
/* renamed from: pa.f */
/* loaded from: combined.jar:classes2.jar:pa/f.class */
public final class C7687f extends FilterInputStream {

    /* renamed from: b */
    public long f37428b;

    /* renamed from: c */
    public long f37429c;

    public C7687f(InputStream inputStream, long j10) {
        super(inputStream);
        this.f37429c = -1L;
        inputStream.getClass();
        this.f37428b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f37428b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        synchronized (this) {
            ((FilterInputStream) this).in.mark(i10);
            this.f37429c = this.f37428b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f37428b == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f37428b--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f37428b;
        if (j10 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f37428b -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        synchronized (this) {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f37429c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f37428b = this.f37429c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f37428b));
        this.f37428b -= skip;
        return skip;
    }
}
