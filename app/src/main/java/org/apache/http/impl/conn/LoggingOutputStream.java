package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/LoggingOutputStream.class */
class LoggingOutputStream extends OutputStream {
    private final OutputStream out;
    private final Wire wire;

    public LoggingOutputStream(OutputStream outputStream, Wire wire) {
        this.out = outputStream;
        this.wire = wire;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.out.close();
        } catch (IOException e10) {
            this.wire.output("[close] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e10) {
            this.wire.output("[flush] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        try {
            this.wire.output(i10);
        } catch (IOException e10) {
            this.wire.output("[write] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.wire.output(bArr);
            this.out.write(bArr);
        } catch (IOException e10) {
            this.wire.output("[write] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        try {
            this.wire.output(bArr, i10, i11);
            this.out.write(bArr, i10, i11);
        } catch (IOException e10) {
            this.wire.output("[write] I/O error: " + e10.getMessage());
            throw e10;
        }
    }
}
