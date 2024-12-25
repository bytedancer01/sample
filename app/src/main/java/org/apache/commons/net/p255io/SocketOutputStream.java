package org.apache.commons.net.p255io;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/SocketOutputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/SocketOutputStream.class */
public class SocketOutputStream extends FilterOutputStream {
    private final Socket __socket;

    public SocketOutputStream(Socket socket, OutputStream outputStream) {
        super(outputStream);
        this.__socket = socket;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.__socket.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
    }
}
