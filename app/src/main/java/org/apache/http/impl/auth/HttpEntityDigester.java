package org.apache.http.impl.auth;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/HttpEntityDigester.class */
class HttpEntityDigester extends OutputStream {
    private boolean closed;
    private byte[] digest;
    private final MessageDigest digester;

    public HttpEntityDigester(MessageDigest messageDigest) {
        this.digester = messageDigest;
        messageDigest.reset();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.digest = this.digester.digest();
        super.close();
    }

    public byte[] getDigest() {
        return this.digest;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (this.closed) {
            throw new IOException("Stream has been already closed");
        }
        this.digester.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (this.closed) {
            throw new IOException("Stream has been already closed");
        }
        this.digester.update(bArr, i10, i11);
    }
}
