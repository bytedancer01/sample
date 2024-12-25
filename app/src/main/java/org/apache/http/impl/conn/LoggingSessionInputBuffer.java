package org.apache.http.impl.conn;

import org.apache.commons.net.SocketClient;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.p257io.EofSensor;
import org.apache.http.p257io.HttpTransportMetrics;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/LoggingSessionInputBuffer.class */
public class LoggingSessionInputBuffer implements SessionInputBuffer, EofSensor {
    private final String charset;
    private final EofSensor eofSensor;

    /* renamed from: in */
    private final SessionInputBuffer f36163in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire) {
        this(sessionInputBuffer, wire, null);
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire, String str) {
        this.f36163in = sessionInputBuffer;
        this.eofSensor = sessionInputBuffer instanceof EofSensor ? (EofSensor) sessionInputBuffer : null;
        this.wire = wire;
        this.charset = str == null ? Consts.ASCII.name() : str;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f36163in.getMetrics();
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public boolean isDataAvailable(int i10) {
        return this.f36163in.isDataAvailable(i10);
    }

    @Override // org.apache.http.p257io.EofSensor
    public boolean isEof() {
        EofSensor eofSensor = this.eofSensor;
        if (eofSensor != null) {
            return eofSensor.isEof();
        }
        return false;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int read() {
        int read = this.f36163in.read();
        if (this.wire.enabled() && read != -1) {
            this.wire.input(read);
        }
        return read;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int read(byte[] bArr) {
        int read = this.f36163in.read(bArr);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, 0, read);
        }
        return read;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f36163in.read(bArr, i10, i11);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, i10, read);
        }
        return read;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) {
        int readLine = this.f36163in.readLine(charArrayBuffer);
        if (this.wire.enabled() && readLine >= 0) {
            this.wire.input((new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine) + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
        return readLine;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public String readLine() {
        String readLine = this.f36163in.readLine();
        if (this.wire.enabled() && readLine != null) {
            this.wire.input((readLine + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
        return readLine;
    }
}
