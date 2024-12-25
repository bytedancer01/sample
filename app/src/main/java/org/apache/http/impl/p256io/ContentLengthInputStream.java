package org.apache.http.impl.p256io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.p257io.BufferInfo;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/ContentLengthInputStream.class */
public class ContentLengthInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private final long contentLength;

    /* renamed from: in */
    private SessionInputBuffer f36167in;
    private long pos = 0;
    private boolean closed = false;

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j10) {
        this.f36167in = null;
        this.f36167in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.contentLength = Args.notNegative(j10, "Content length");
    }

    @Override // java.io.InputStream
    public int available() {
        SessionInputBuffer sessionInputBuffer = this.f36167in;
        if (sessionInputBuffer instanceof BufferInfo) {
            return Math.min(((BufferInfo) sessionInputBuffer).length(), (int) (this.contentLength - this.pos));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            if (this.pos < this.contentLength) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.closed = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.pos >= this.contentLength) {
            return -1;
        }
        int read = this.f36167in.read();
        long j10 = this.pos;
        if (read != -1) {
            this.pos = j10 + 1;
        } else if (j10 < this.contentLength) {
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        long j10 = this.pos;
        long j11 = this.contentLength;
        if (j10 >= j11) {
            return -1;
        }
        int i12 = i11;
        if (i11 + j10 > j11) {
            i12 = (int) (j11 - j10);
        }
        int read = this.f36167in.read(bArr, i10, i12);
        if (read != -1 || this.pos >= this.contentLength) {
            if (read > 0) {
                this.pos += read;
            }
            return read;
        }
        throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        int read;
        if (j10 <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j10, this.contentLength - this.pos);
        long j11 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min(2048L, min))) != -1) {
            long j12 = read;
            j11 += j12;
            min -= j12;
        }
        return j11;
    }
}
