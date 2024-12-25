package org.apache.http.impl.p256io;

import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/SocketOutputBuffer.class */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i10, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        int sendBufferSize = i10 < 0 ? socket.getSendBufferSize() : i10;
        init(socket.getOutputStream(), sendBufferSize < 1024 ? 1024 : sendBufferSize, httpParams);
    }
}
