package org.apache.commons.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/DefaultSocketFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/DefaultSocketFactory.class */
public class DefaultSocketFactory extends SocketFactory {
    private final Proxy connProxy;

    public DefaultSocketFactory() {
        this(null);
    }

    public DefaultSocketFactory(Proxy proxy) {
        this.connProxy = proxy;
    }

    public ServerSocket createServerSocket(int i10) {
        return new ServerSocket(i10);
    }

    public ServerSocket createServerSocket(int i10, int i11) {
        return new ServerSocket(i10, i11);
    }

    public ServerSocket createServerSocket(int i10, int i11, InetAddress inetAddress) {
        return new ServerSocket(i10, i11, inetAddress);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return this.connProxy != null ? new Socket(this.connProxy) : new Socket();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        if (this.connProxy == null) {
            return new Socket(str, i10);
        }
        Socket socket = new Socket(this.connProxy);
        socket.connect(new InetSocketAddress(str, i10));
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        if (this.connProxy == null) {
            return new Socket(str, i10, inetAddress, i11);
        }
        Socket socket = new Socket(this.connProxy);
        socket.bind(new InetSocketAddress(inetAddress, i11));
        socket.connect(new InetSocketAddress(str, i10));
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        if (this.connProxy == null) {
            return new Socket(inetAddress, i10);
        }
        Socket socket = new Socket(this.connProxy);
        socket.connect(new InetSocketAddress(inetAddress, i10));
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        if (this.connProxy == null) {
            return new Socket(inetAddress, i10, inetAddress2, i11);
        }
        Socket socket = new Socket(this.connProxy);
        socket.bind(new InetSocketAddress(inetAddress2, i11));
        socket.connect(new InetSocketAddress(inetAddress, i10));
        return socket;
    }
}
