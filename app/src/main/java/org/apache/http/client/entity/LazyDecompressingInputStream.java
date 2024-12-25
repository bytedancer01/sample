package org.apache.http.client.entity;

import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/entity/LazyDecompressingInputStream.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/LazyDecompressingInputStream.class */
class LazyDecompressingInputStream extends InputStream {
    private final InputStreamFactory inputStreamFactory;
    private final InputStream wrappedStream;
    private InputStream wrapperStream;

    public LazyDecompressingInputStream(InputStream inputStream, InputStreamFactory inputStreamFactory) {
        this.wrappedStream = inputStream;
        this.inputStreamFactory = inputStreamFactory;
    }

    private void initWrapper() {
        if (this.wrapperStream == null) {
            this.wrapperStream = this.inputStreamFactory.create(this.wrappedStream);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        initWrapper();
        return this.wrapperStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.wrapperStream;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.wrappedStream.close();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        initWrapper();
        return this.wrapperStream.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        initWrapper();
        return this.wrapperStream.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        initWrapper();
        return this.wrapperStream.read(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        initWrapper();
        return this.wrapperStream.skip(j10);
    }
}
