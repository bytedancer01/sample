package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/LoggingInputStream.class */
class LoggingInputStream extends InputStream {

    /* renamed from: in */
    private final InputStream f36162in;
    private final Wire wire;

    public LoggingInputStream(InputStream inputStream, Wire wire) {
        this.f36162in = inputStream;
        this.wire = wire;
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f36162in.available();
        } catch (IOException e10) {
            this.wire.input("[available] I/O error : " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f36162in.close();
        } catch (IOException e10) {
            this.wire.input("[close] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        super.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f36162in.read();
            if (read == -1) {
                this.wire.input("end of stream");
            } else {
                this.wire.input(read);
            }
            return read;
        } catch (IOException e10) {
            this.wire.input("[read] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f36162in.read(bArr);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, 0, read);
            }
            return read;
        } catch (IOException e10) {
            this.wire.input("[read] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            int read = this.f36162in.read(bArr, i10, i11);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, i10, read);
            }
            return read;
        } catch (IOException e10) {
            this.wire.input("[read] I/O error: " + e10.getMessage());
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        super.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return super.skip(j10);
        } catch (IOException e10) {
            this.wire.input("[skip] I/O error: " + e10.getMessage());
            throw e10;
        }
    }
}
