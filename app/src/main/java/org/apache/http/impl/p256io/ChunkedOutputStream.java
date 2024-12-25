package org.apache.http.impl.p256io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p257io.SessionOutputBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/ChunkedOutputStream.class */
public class ChunkedOutputStream extends OutputStream {
    private final byte[] cache;
    private int cachePosition;
    private boolean closed;
    private final SessionOutputBuffer out;
    private boolean wroteLastChunk;

    public ChunkedOutputStream(int i10, SessionOutputBuffer sessionOutputBuffer) {
        this.cachePosition = 0;
        this.wroteLastChunk = false;
        this.closed = false;
        this.cache = new byte[i10];
        this.out = sessionOutputBuffer;
    }

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer) {
        this(2048, sessionOutputBuffer);
    }

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer, int i10) {
        this(i10, sessionOutputBuffer);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        finish();
        this.out.flush();
    }

    public void finish() {
        if (this.wroteLastChunk) {
            return;
        }
        flushCache();
        writeClosingChunk();
        this.wroteLastChunk = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        flushCache();
        this.out.flush();
    }

    public void flushCache() {
        int i10 = this.cachePosition;
        if (i10 > 0) {
            this.out.writeLine(Integer.toHexString(i10));
            this.out.write(this.cache, 0, this.cachePosition);
            this.out.writeLine("");
            this.cachePosition = 0;
        }
    }

    public void flushCacheWithAppend(byte[] bArr, int i10, int i11) {
        this.out.writeLine(Integer.toHexString(this.cachePosition + i11));
        this.out.write(this.cache, 0, this.cachePosition);
        this.out.write(bArr, i10, i11);
        this.out.writeLine("");
        this.cachePosition = 0;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        }
        byte[] bArr = this.cache;
        int i11 = this.cachePosition;
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        this.cachePosition = i12;
        if (i12 == bArr.length) {
            flushCache();
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
        byte[] bArr2 = this.cache;
        int length = bArr2.length;
        int i12 = this.cachePosition;
        if (i11 >= length - i12) {
            flushCacheWithAppend(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.cachePosition += i11;
        }
    }

    public void writeClosingChunk() {
        this.out.writeLine("0");
        this.out.writeLine("");
    }
}
