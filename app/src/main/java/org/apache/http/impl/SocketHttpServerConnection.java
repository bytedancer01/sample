package org.apache.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import org.apache.http.HttpInetConnection;
import org.apache.http.impl.p256io.SocketInputBuffer;
import org.apache.http.impl.p256io.SocketOutputBuffer;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/SocketHttpServerConnection.class */
public class SocketHttpServerConnection extends AbstractHttpServerConnection implements HttpInetConnection {
    private volatile boolean open;
    private volatile Socket socket = null;

    private static void formatAddress(StringBuilder sb2, SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb2.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        sb2.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress());
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
    }

    public void assertNotOpen() {
        Asserts.check(!this.open, "Connection is already open");
    }

    @Override // org.apache.http.impl.AbstractHttpServerConnection
    public void assertOpen() {
        Asserts.check(this.open, "Connection is not open");
    }

    public void bind(Socket socket, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        Args.notNull(httpParams, "HTTP parameters");
        this.socket = socket;
        int intParameter = httpParams.getIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, -1);
        init(createSessionInputBuffer(socket, intParameter, httpParams), createSessionOutputBuffer(socket, intParameter, httpParams), httpParams);
        this.open = true;
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.open) {
            this.open = false;
            this.open = false;
            Socket socket = this.socket;
            try {
                doFlush();
                try {
                    try {
                        socket.shutdownOutput();
                    } catch (IOException e10) {
                    }
                    socket.shutdownInput();
                } catch (IOException | UnsupportedOperationException e11) {
                }
            } finally {
                socket.close();
            }
        }
    }

    public SessionInputBuffer createSessionInputBuffer(Socket socket, int i10, HttpParams httpParams) {
        return new SocketInputBuffer(socket, i10, httpParams);
    }

    public SessionOutputBuffer createSessionOutputBuffer(Socket socket, int i10, HttpParams httpParams) {
        return new SocketOutputBuffer(socket, i10, httpParams);
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        if (this.socket != null) {
            return this.socket.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        if (this.socket != null) {
            return this.socket.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        if (this.socket != null) {
            return this.socket.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        if (this.socket != null) {
            return this.socket.getPort();
        }
        return -1;
    }

    public Socket getSocket() {
        return this.socket;
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        if (this.socket == null) {
            return -1;
        }
        try {
            return this.socket.getSoTimeout();
        } catch (SocketException e10) {
            return -1;
        }
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.open;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i10) {
        assertOpen();
        if (this.socket != null) {
            try {
                this.socket.setSoTimeout(i10);
            } catch (SocketException e10) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        this.open = false;
        Socket socket = this.socket;
        if (socket != null) {
            socket.close();
        }
    }

    public String toString() {
        if (this.socket == null) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        SocketAddress remoteSocketAddress = this.socket.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.socket.getLocalSocketAddress();
        if (remoteSocketAddress != null && localSocketAddress != null) {
            formatAddress(sb2, localSocketAddress);
            sb2.append("<->");
            formatAddress(sb2, remoteSocketAddress);
        }
        return sb2.toString();
    }
}
