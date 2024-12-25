package org.apache.commons.net.p255io;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.Socket;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/SocketInputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/SocketInputStream.class */
public class SocketInputStream extends FilterInputStream {
    private final Socket __socket;

    public SocketInputStream(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.__socket = socket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.__socket.close();
    }
}
