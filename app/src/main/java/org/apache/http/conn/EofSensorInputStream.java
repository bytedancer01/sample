package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/EofSensorInputStream.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/EofSensorInputStream.class */
public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {
    private final EofSensorWatcher eofWatcher;
    private boolean selfClosed;
    public InputStream wrappedStream;

    public EofSensorInputStream(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        Args.notNull(inputStream, "Wrapped stream");
        this.wrappedStream = inputStream;
        this.selfClosed = false;
        this.eofWatcher = eofSensorWatcher;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        this.selfClosed = true;
        checkAbort();
    }

    @Override // java.io.InputStream
    public int available() {
        int available;
        if (isReadAllowed()) {
            try {
                available = this.wrappedStream.available();
            } catch (IOException e10) {
                checkAbort();
                throw e10;
            }
        } else {
            available = 0;
        }
        return available;
    }

    public void checkAbort() {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            boolean z10 = true;
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null) {
                    z10 = eofSensorWatcher.streamAbort(inputStream);
                }
                if (z10) {
                    inputStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    public void checkClose() {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            boolean z10 = true;
            try {
                EofSensorWatcher eofSensorWatcher = this.eofWatcher;
                if (eofSensorWatcher != null) {
                    z10 = eofSensorWatcher.streamClosed(inputStream);
                }
                if (z10) {
                    inputStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    public void checkEOF(int i10) {
        InputStream inputStream = this.wrappedStream;
        if (inputStream == null || i10 >= 0) {
            return;
        }
        boolean z10 = true;
        try {
            EofSensorWatcher eofSensorWatcher = this.eofWatcher;
            if (eofSensorWatcher != null) {
                z10 = eofSensorWatcher.eofDetected(inputStream);
            }
            if (z10) {
                inputStream.close();
            }
        } finally {
            this.wrappedStream = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.selfClosed = true;
        checkClose();
    }

    public InputStream getWrappedStream() {
        return this.wrappedStream;
    }

    public boolean isReadAllowed() {
        if (this.selfClosed) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.wrappedStream != null;
    }

    public boolean isSelfClosed() {
        return this.selfClosed;
    }

    @Override // java.io.InputStream
    public int read() {
        int read;
        if (isReadAllowed()) {
            try {
                read = this.wrappedStream.read();
                checkEOF(read);
            } catch (IOException e10) {
                checkAbort();
                throw e10;
            }
        } else {
            read = -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read;
        if (isReadAllowed()) {
            try {
                read = this.wrappedStream.read(bArr, i10, i11);
                checkEOF(read);
            } catch (IOException e10) {
                checkAbort();
                throw e10;
            }
        } else {
            read = -1;
        }
        return read;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        close();
    }
}
