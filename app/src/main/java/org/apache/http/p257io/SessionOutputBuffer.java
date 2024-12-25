package org.apache.http.p257io;

import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/io/SessionOutputBuffer.class */
public interface SessionOutputBuffer {
    void flush();

    HttpTransportMetrics getMetrics();

    void write(int i10);

    void write(byte[] bArr);

    void write(byte[] bArr, int i10, int i11);

    void writeLine(String str);

    void writeLine(CharArrayBuffer charArrayBuffer);
}
