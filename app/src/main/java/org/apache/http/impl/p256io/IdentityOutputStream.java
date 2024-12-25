package org.apache.http.impl.p256io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/IdentityOutputStream.class */
public class IdentityOutputStream extends OutputStream {
    private boolean closed = false;
    private final SessionOutputBuffer out;

    public IdentityOutputStream(SessionOutputBuffer sessionOutputBuffer) {
        this.out = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session output buffer");
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
        this.out.write(i10);
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
        this.out.write(bArr, i10, i11);
    }
}
