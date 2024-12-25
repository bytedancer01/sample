package org.apache.http.impl.conn;

import org.apache.commons.net.SocketClient;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.p257io.HttpTransportMetrics;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/LoggingSessionOutputBuffer.class */
public class LoggingSessionOutputBuffer implements SessionOutputBuffer {
    private final String charset;
    private final SessionOutputBuffer out;
    private final Wire wire;

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire) {
        this(sessionOutputBuffer, wire, null);
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire, String str) {
        this.out = sessionOutputBuffer;
        this.wire = wire;
        this.charset = str == null ? Consts.ASCII.name() : str;
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void flush() {
        this.out.flush();
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.out.getMetrics();
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void write(int i10) {
        this.out.write(i10);
        if (this.wire.enabled()) {
            this.wire.output(i10);
        }
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void write(byte[] bArr) {
        this.out.write(bArr);
        if (this.wire.enabled()) {
            this.wire.output(bArr);
        }
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void write(byte[] bArr, int i10, int i11) {
        this.out.write(bArr, i10, i11);
        if (this.wire.enabled()) {
            this.wire.output(bArr, i10, i11);
        }
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void writeLine(String str) {
        this.out.writeLine(str);
        if (this.wire.enabled()) {
            this.wire.output((str + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer charArrayBuffer) {
        this.out.writeLine(charArrayBuffer);
        if (this.wire.enabled()) {
            this.wire.output((new String(charArrayBuffer.buffer(), 0, charArrayBuffer.length()) + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
    }
}
