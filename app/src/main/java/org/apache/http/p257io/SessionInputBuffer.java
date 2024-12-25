package org.apache.http.p257io;

import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/io/SessionInputBuffer.class */
public interface SessionInputBuffer {
    HttpTransportMetrics getMetrics();

    @Deprecated
    boolean isDataAvailable(int i10);

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i10, int i11);

    int readLine(CharArrayBuffer charArrayBuffer);

    String readLine();
}
