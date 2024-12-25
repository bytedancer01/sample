package org.apache.http.impl.p256io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/ContentLengthOutputStream.class */
public class ContentLengthOutputStream extends OutputStream {
    private final long contentLength;
    private final SessionOutputBuffer out;
    private long total = 0;
    private boolean closed = false;

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j10) {
        this.out = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session output buffer");
        this.contentLength = Args.notNegative(j10, "Content length");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.out.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.total < this.contentLength) {
            this.out.write(i10);
            this.total++;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        }
        long j10 = this.total;
        long j11 = this.contentLength;
        if (j10 < j11) {
            long j12 = j11 - j10;
            int i12 = i11;
            if (i11 > j12) {
                i12 = (int) j12;
            }
            this.out.write(bArr, i10, i12);
            this.total += i12;
        }
    }
}
