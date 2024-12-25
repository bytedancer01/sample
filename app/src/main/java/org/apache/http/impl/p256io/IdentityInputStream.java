package org.apache.http.impl.p256io;

import java.io.InputStream;
import org.apache.http.p257io.BufferInfo;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/IdentityInputStream.class */
public class IdentityInputStream extends InputStream {
    private boolean closed = false;

    /* renamed from: in */
    private final SessionInputBuffer f36168in;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        this.f36168in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
    }

    @Override // java.io.InputStream
    public int available() {
        SessionInputBuffer sessionInputBuffer = this.f36168in;
        if (sessionInputBuffer instanceof BufferInfo) {
            return ((BufferInfo) sessionInputBuffer).length();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.closed) {
            return -1;
        }
        return this.f36168in.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.closed) {
            return -1;
        }
        return this.f36168in.read(bArr, i10, i11);
    }
}
