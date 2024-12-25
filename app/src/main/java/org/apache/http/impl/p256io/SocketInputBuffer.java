package org.apache.http.impl.p256io;

import java.net.Socket;
import org.apache.http.p257io.EofSensor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/SocketInputBuffer.class */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {
    private boolean eof;
    private final Socket socket;

    public SocketInputBuffer(Socket socket, int i10, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        this.socket = socket;
        this.eof = false;
        int receiveBufferSize = i10 < 0 ? socket.getReceiveBufferSize() : i10;
        init(socket.getInputStream(), receiveBufferSize < 1024 ? 1024 : receiveBufferSize, httpParams);
    }

    @Override // org.apache.http.impl.p256io.AbstractSessionInputBuffer
    public int fillBuffer() {
        int fillBuffer = super.fillBuffer();
        this.eof = fillBuffer == -1;
        return fillBuffer;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public boolean isDataAvailable(int i10) {
        boolean hasBufferedData = hasBufferedData();
        boolean z10 = hasBufferedData;
        if (!hasBufferedData) {
            int soTimeout = this.socket.getSoTimeout();
            try {
                this.socket.setSoTimeout(i10);
                fillBuffer();
                z10 = hasBufferedData();
            } finally {
                this.socket.setSoTimeout(soTimeout);
            }
        }
        return z10;
    }

    @Override // org.apache.http.p257io.EofSensor
    public boolean isEof() {
        return this.eof;
    }
}
