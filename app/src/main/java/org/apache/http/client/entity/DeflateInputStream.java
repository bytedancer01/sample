package org.apache.http.client.entity;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/entity/DeflateInputStream.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/DeflateInputStream.class */
public class DeflateInputStream extends InputStream {
    private final InputStream sourceStream;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/client/entity/DeflateInputStream$DeflateStream.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/DeflateInputStream$DeflateStream.class */
    public static class DeflateStream extends InflaterInputStream {
        private boolean closed;

        public DeflateStream(InputStream inputStream, Inflater inflater) {
            super(inputStream, inflater);
            this.closed = false;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ((InflaterInputStream) this).inf.end();
            super.close();
        }
    }

    public DeflateInputStream(InputStream inputStream) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int read = pushbackInputStream.read();
        int read2 = pushbackInputStream.read();
        if (read == -1 || read2 == -1) {
            throw new ZipException("Unexpected end of stream");
        }
        pushbackInputStream.unread(read2);
        pushbackInputStream.unread(read);
        int i10 = read & 255;
        boolean z10 = true;
        if ((i10 & 15) == 8) {
            z10 = true;
            if (((i10 >> 4) & 15) <= 7) {
                z10 = true;
                if (((i10 << 8) | (read2 & 255)) % 31 == 0) {
                    z10 = false;
                }
            }
        }
        this.sourceStream = new DeflateStream(pushbackInputStream, new Inflater(z10));
    }

    @Override // java.io.InputStream
    public int available() {
        return this.sourceStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.sourceStream.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.sourceStream.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.sourceStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.sourceStream.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.sourceStream.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.sourceStream.read(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public void reset() {
        this.sourceStream.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.sourceStream.skip(j10);
    }
}
