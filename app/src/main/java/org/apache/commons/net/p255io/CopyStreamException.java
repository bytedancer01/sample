package org.apache.commons.net.p255io;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/CopyStreamException.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/CopyStreamException.class */
public class CopyStreamException extends IOException {
    private static final long serialVersionUID = -2602899129433221532L;
    private final long totalBytesTransferred;

    public CopyStreamException(String str, long j10, IOException iOException) {
        super(str);
        initCause(iOException);
        this.totalBytesTransferred = j10;
    }

    public IOException getIOException() {
        return (IOException) getCause();
    }

    public long getTotalBytesTransferred() {
        return this.totalBytesTransferred;
    }
}
